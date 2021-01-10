/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.util.Log
 *  io.flutter.view.FlutterRunArguments
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 */
package io.flutter.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import io.flutter.app.FlutterPluginRegistry;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.view.FlutterRunArguments;
import io.flutter.view.FlutterView;
import java.nio.ByteBuffer;

public class FlutterNativeView
implements BinaryMessenger {
    private static final String TAG = "FlutterNativeView";
    private boolean applicationIsRunning;
    private final DartExecutor dartExecutor;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    private final Context mContext;
    private final FlutterJNI mFlutterJNI;
    private FlutterView mFlutterView;
    private final FlutterPluginRegistry mPluginRegistry;

    public FlutterNativeView(Context context) {
        super(context, false);
    }

    public FlutterNativeView(Context context, boolean bl) {
        this.flutterUiDisplayListener = new FlutterUiDisplayListener(){

            @Override
            public void onFlutterUiDisplayed() {
                if (FlutterNativeView.this.mFlutterView == null) {
                    return;
                }
                FlutterNativeView.this.mFlutterView.onFirstFrame();
            }

            @Override
            public void onFlutterUiNoLongerDisplayed() {
            }
        };
        this.mContext = context;
        this.mPluginRegistry = new FlutterPluginRegistry((FlutterNativeView)this, context);
        this.mFlutterJNI = new FlutterJNI();
        this.mFlutterJNI.addIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        this.dartExecutor = new DartExecutor(this.mFlutterJNI, context.getAssets());
        this.mFlutterJNI.addEngineLifecycleListener(new EngineLifecycleListenerImpl((FlutterNativeView)this, null));
        FlutterNativeView.super.attach((FlutterNativeView)this, bl);
        this.assertAttached();
    }

    private void attach(FlutterNativeView flutterNativeView, boolean bl) {
        this.mFlutterJNI.attachToNative(bl);
        this.dartExecutor.onAttachedToJNI();
    }

    public static String getObservatoryUri() {
        return FlutterJNI.getObservatoryUri();
    }

    public void assertAttached() {
        if (this.isAttached()) {
            return;
        }
        throw new AssertionError((Object)"Platform view is not attached");
    }

    public void attachViewAndActivity(FlutterView flutterView, Activity activity) {
        this.mFlutterView = flutterView;
        this.mPluginRegistry.attach(flutterView, activity);
    }

    public void destroy() {
        this.mPluginRegistry.destroy();
        this.dartExecutor.onDetachedFromJNI();
        this.mFlutterView = null;
        this.mFlutterJNI.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        this.mFlutterJNI.detachFromNativeAndReleaseResources();
        this.applicationIsRunning = false;
    }

    public void detachFromFlutterView() {
        this.mPluginRegistry.detach();
        this.mFlutterView = null;
    }

    public DartExecutor getDartExecutor() {
        return this.dartExecutor;
    }

    FlutterJNI getFlutterJNI() {
        return this.mFlutterJNI;
    }

    public FlutterPluginRegistry getPluginRegistry() {
        return this.mPluginRegistry;
    }

    public boolean isApplicationRunning() {
        return this.applicationIsRunning;
    }

    public boolean isAttached() {
        return this.mFlutterJNI.isAttached();
    }

    public void runFromBundle(FlutterRunArguments flutterRunArguments) {
        if (flutterRunArguments.entrypoint != null) {
            this.assertAttached();
            if (!this.applicationIsRunning) {
                this.mFlutterJNI.runBundleAndSnapshotFromLibrary(flutterRunArguments.bundlePath, flutterRunArguments.entrypoint, flutterRunArguments.libraryPath, this.mContext.getResources().getAssets());
                this.applicationIsRunning = true;
                return;
            }
            throw new AssertionError((Object)"This Flutter engine instance is already running an application");
        }
        throw new AssertionError((Object)"An entrypoint must be specified");
    }

    @Override
    public void send(String string, ByteBuffer byteBuffer) {
        this.dartExecutor.getBinaryMessenger().send(string, byteBuffer);
    }

    @Override
    public void send(String string, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
        if (!this.isAttached()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FlutterView.send called on a detached view, channel=");
            stringBuilder.append(string);
            Log.d((String)TAG, (String)stringBuilder.toString());
            return;
        }
        this.dartExecutor.getBinaryMessenger().send(string, byteBuffer, binaryReply);
    }

    @Override
    public void setMessageHandler(String string, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        this.dartExecutor.getBinaryMessenger().setMessageHandler(string, binaryMessageHandler);
    }

    private final class EngineLifecycleListenerImpl
    implements FlutterEngine.EngineLifecycleListener {
        final /* synthetic */ FlutterNativeView this$0;

        private EngineLifecycleListenerImpl(FlutterNativeView flutterNativeView) {
            this.this$0 = flutterNativeView;
        }

        /* synthetic */ EngineLifecycleListenerImpl(FlutterNativeView flutterNativeView, 1 var2_2) {
            super(flutterNativeView);
        }

        @Override
        public void onPreEngineRestart() {
            if (this.this$0.mFlutterView != null) {
                this.this$0.mFlutterView.resetAccessibilityTree();
            }
            if (this.this$0.mPluginRegistry == null) {
                return;
            }
            this.this$0.mPluginRegistry.onPreEngineRestart();
        }
    }

}

