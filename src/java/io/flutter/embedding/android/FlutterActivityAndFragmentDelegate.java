/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.lifecycle.e
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.e;
import io.flutter.Log;
import io.flutter.embedding.android.FlutterActivityAndFragmentDelegate;
import io.flutter.embedding.android.FlutterEngineConfigurator;
import io.flutter.embedding.android.FlutterEngineProvider;
import io.flutter.embedding.android.FlutterSplashView;
import io.flutter.embedding.android.FlutterSurfaceView;
import io.flutter.embedding.android.FlutterTextureView;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.SplashScreen;
import io.flutter.embedding.android.SplashScreenProvider;
import io.flutter.embedding.android.TransparencyMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.systemchannels.LifecycleChannel;
import io.flutter.embedding.engine.systemchannels.NavigationChannel;
import io.flutter.embedding.engine.systemchannels.SystemChannel;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.Arrays;

final class FlutterActivityAndFragmentDelegate {
    private static final String TAG = "FlutterActivityAndFragmentDelegate";
    private FlutterEngine flutterEngine;
    private FlutterSplashView flutterSplashView;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    private FlutterView flutterView;
    private Host host;
    private boolean isFlutterEngineFromHost;
    private PlatformPlugin platformPlugin;

    FlutterActivityAndFragmentDelegate(Host host) {
        this.flutterUiDisplayListener = new FlutterUiDisplayListener((FlutterActivityAndFragmentDelegate)this){
            final /* synthetic */ FlutterActivityAndFragmentDelegate this$0;
            {
                this.this$0 = flutterActivityAndFragmentDelegate;
            }

            public void onFlutterUiDisplayed() {
                FlutterActivityAndFragmentDelegate.access$000(this.this$0).onFlutterUiDisplayed();
            }

            public void onFlutterUiNoLongerDisplayed() {
                FlutterActivityAndFragmentDelegate.access$000(this.this$0).onFlutterUiNoLongerDisplayed();
            }
        };
        this.host = host;
    }

    static /* synthetic */ Host access$000(FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate) {
        return flutterActivityAndFragmentDelegate.host;
    }

    private void doInitialFlutterViewRun() {
        if (this.host.getCachedEngineId() != null) {
            return;
        }
        if (this.flutterEngine.getDartExecutor().isExecutingDart()) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Executing Dart entrypoint: ");
        stringBuilder.append(this.host.getDartEntrypointFunctionName());
        stringBuilder.append(", and sending initial route: ");
        stringBuilder.append(this.host.getInitialRoute());
        Log.v(TAG, stringBuilder.toString());
        if (this.host.getInitialRoute() != null) {
            this.flutterEngine.getNavigationChannel().setInitialRoute(this.host.getInitialRoute());
        }
        Object object = new Object(this.host.getAppBundlePath(), this.host.getDartEntrypointFunctionName()){
            public final String dartEntrypointFunctionName;
            public final String pathToBundle;
            {
                this.pathToBundle = string2;
                this.dartEntrypointFunctionName = string3;
            }

            public static DartExecutor.DartEntrypoint createDefault() {
                return new /* invalid duplicate definition of identical inner class */;
            }

            public boolean equals(Object object) {
                if (this == object) {
                    return true;
                }
                if (object != null) {
                    if (DartExecutor.DartEntrypoint.class != object.getClass()) {
                        return false;
                    }
                    DartExecutor.DartEntrypoint dartEntrypoint = object;
                    if (!this.pathToBundle.equals((Object)dartEntrypoint.pathToBundle)) {
                        return false;
                    }
                    return this.dartEntrypointFunctionName.equals((Object)dartEntrypoint.dartEntrypointFunctionName);
                }
                return false;
            }

            public int hashCode() {
                return 31 * this.pathToBundle.hashCode() + this.dartEntrypointFunctionName.hashCode();
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("DartEntrypoint( bundle path: ");
                stringBuilder.append(this.pathToBundle);
                stringBuilder.append(", function: ");
                stringBuilder.append(this.dartEntrypointFunctionName);
                stringBuilder.append(" )");
                return stringBuilder.toString();
            }
        };
        this.flutterEngine.getDartExecutor().executeDartEntrypoint(object);
    }

    private void ensureAlive() {
        if (this.host != null) {
            return;
        }
        throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
    }

    FlutterEngine getFlutterEngine() {
        return this.flutterEngine;
    }

    boolean isFlutterEngineFromHost() {
        return this.isFlutterEngineFromHost;
    }

    void onActivityCreated(Bundle bundle) {
        Log.v(TAG, "onActivityCreated. Giving plugins an opportunity to restore state.");
        FlutterActivityAndFragmentDelegate.super.ensureAlive();
        if (this.host.shouldAttachEngineToActivity()) {
            this.flutterEngine.getActivityControlSurface().onRestoreInstanceState(bundle);
        }
    }

    void onActivityResult(int n2, int n3, Intent intent) {
        FlutterActivityAndFragmentDelegate.super.ensureAlive();
        if (this.flutterEngine != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Forwarding onActivityResult() to FlutterEngine:\nrequestCode: ");
            stringBuilder.append(n2);
            stringBuilder.append("\nresultCode: ");
            stringBuilder.append(n3);
            stringBuilder.append("\ndata: ");
            stringBuilder.append((Object)intent);
            Log.v(TAG, stringBuilder.toString());
            this.flutterEngine.getActivityControlSurface().onActivityResult(n2, n3, intent);
            return;
        }
        Log.w(TAG, "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
    }

    void onAttach(Context context) {
        FlutterActivityAndFragmentDelegate.super.ensureAlive();
        if (this.flutterEngine == null) {
            this.setupFlutterEngine();
        }
        Host host = this.host;
        this.platformPlugin = host.providePlatformPlugin(host.getActivity(), this.flutterEngine);
        if (this.host.shouldAttachEngineToActivity()) {
            Log.v(TAG, "Attaching FlutterEngine to the Activity that owns this Fragment.");
            this.flutterEngine.getActivityControlSurface().attachToActivity(this.host.getActivity(), this.host.getLifecycle());
        }
        this.host.configureFlutterEngine(this.flutterEngine);
    }

    void onBackPressed() {
        this.ensureAlive();
        if (this.flutterEngine != null) {
            Log.v(TAG, "Forwarding onBackPressed() to FlutterEngine.");
            this.flutterEngine.getNavigationChannel().popRoute();
            return;
        }
        Log.w(TAG, "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
    }

    View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FlutterView flutterView;
        int n2;
        FlutterSplashView flutterSplashView;
        Log.v(TAG, "Creating FlutterView.");
        FlutterActivityAndFragmentDelegate.super.ensureAlive();
        if (this.host.getRenderMode() == RenderMode.surface) {
            Activity activity = this.host.getActivity();
            boolean bl = this.host.getTransparencyMode() == TransparencyMode.transparent;
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView((Context)activity, bl);
            this.host.onFlutterSurfaceViewCreated(flutterSurfaceView);
            flutterView = new FlutterView((Context)this.host.getActivity(), flutterSurfaceView);
        } else {
            FlutterTextureView flutterTextureView = new FlutterTextureView((Context)this.host.getActivity());
            this.host.onFlutterTextureViewCreated(flutterTextureView);
            flutterView = new FlutterView((Context)this.host.getActivity(), flutterTextureView);
        }
        this.flutterView = flutterView;
        this.flutterView.addOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
        this.flutterSplashView = new FlutterSplashView(this.host.getContext());
        if (Build.VERSION.SDK_INT >= 17) {
            flutterSplashView = this.flutterSplashView;
            n2 = View.generateViewId();
        } else {
            flutterSplashView = this.flutterSplashView;
            n2 = 486947586;
        }
        flutterSplashView.setId(n2);
        this.flutterSplashView.displayFlutterViewWithSplash(this.flutterView, this.host.provideSplashScreen());
        Log.v(TAG, "Attaching FlutterEngine to FlutterView.");
        this.flutterView.attachToFlutterEngine(this.flutterEngine);
        return this.flutterSplashView;
    }

    void onDestroyView() {
        Log.v(TAG, "onDestroyView()");
        this.ensureAlive();
        this.flutterView.detachFromFlutterEngine();
        this.flutterView.removeOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
    }

    void onDetach() {
        PlatformPlugin platformPlugin;
        Log.v(TAG, "onDetach()");
        this.ensureAlive();
        this.host.cleanUpFlutterEngine(this.flutterEngine);
        if (this.host.shouldAttachEngineToActivity()) {
            Log.v(TAG, "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.host.getActivity().isChangingConfigurations()) {
                this.flutterEngine.getActivityControlSurface().detachFromActivityForConfigChanges();
            } else {
                this.flutterEngine.getActivityControlSurface().detachFromActivity();
            }
        }
        if ((platformPlugin = this.platformPlugin) != null) {
            platformPlugin.destroy();
            this.platformPlugin = null;
        }
        this.flutterEngine.getLifecycleChannel().appIsDetached();
        if (this.host.shouldDestroyEngineWithHost()) {
            this.flutterEngine.destroy();
            if (this.host.getCachedEngineId() != null) {
                FlutterEngineCache.getInstance().remove(this.host.getCachedEngineId());
            }
            this.flutterEngine = null;
        }
    }

    void onLowMemory() {
        Log.v(TAG, "Forwarding onLowMemory() to FlutterEngine.");
        this.ensureAlive();
        this.flutterEngine.getSystemChannel().sendMemoryPressureWarning();
    }

    void onNewIntent(Intent intent) {
        FlutterActivityAndFragmentDelegate.super.ensureAlive();
        if (this.flutterEngine != null) {
            Log.v(TAG, "Forwarding onNewIntent() to FlutterEngine.");
            this.flutterEngine.getActivityControlSurface().onNewIntent(intent);
            return;
        }
        Log.w(TAG, "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
    }

    void onPause() {
        Log.v(TAG, "onPause()");
        this.ensureAlive();
        this.flutterEngine.getLifecycleChannel().appIsInactive();
    }

    void onPostResume() {
        Log.v(TAG, "onPostResume()");
        this.ensureAlive();
        if (this.flutterEngine != null) {
            PlatformPlugin platformPlugin = this.platformPlugin;
            if (platformPlugin != null) {
                platformPlugin.updateSystemUiOverlays();
                return;
            }
        } else {
            Log.w(TAG, "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        FlutterActivityAndFragmentDelegate.super.ensureAlive();
        if (this.flutterEngine != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: ");
            stringBuilder.append(n2);
            stringBuilder.append("\npermissions: ");
            stringBuilder.append(Arrays.toString((Object[])arrstring));
            stringBuilder.append("\ngrantResults: ");
            stringBuilder.append(Arrays.toString((int[])arrn));
            Log.v(TAG, stringBuilder.toString());
            this.flutterEngine.getActivityControlSurface().onRequestPermissionsResult(n2, arrstring, arrn);
            return;
        }
        Log.w(TAG, "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
    }

    void onResume() {
        Log.v(TAG, "onResume()");
        this.ensureAlive();
        this.flutterEngine.getLifecycleChannel().appIsResumed();
    }

    void onSaveInstanceState(Bundle bundle) {
        Log.v(TAG, "onSaveInstanceState. Giving plugins an opportunity to save state.");
        FlutterActivityAndFragmentDelegate.super.ensureAlive();
        if (this.host.shouldAttachEngineToActivity()) {
            this.flutterEngine.getActivityControlSurface().onSaveInstanceState(bundle);
        }
    }

    void onStart() {
        Log.v(TAG, "onStart()");
        this.ensureAlive();
        this.doInitialFlutterViewRun();
    }

    void onStop() {
        Log.v(TAG, "onStop()");
        this.ensureAlive();
        this.flutterEngine.getLifecycleChannel().appIsPaused();
    }

    void onTrimMemory(int n2) {
        FlutterActivityAndFragmentDelegate.super.ensureAlive();
        if (this.flutterEngine != null) {
            if (n2 == 10) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Forwarding onTrimMemory() to FlutterEngine. Level: ");
                stringBuilder.append(n2);
                Log.v(TAG, stringBuilder.toString());
                this.flutterEngine.getSystemChannel().sendMemoryPressureWarning();
                return;
            }
        } else {
            Log.w(TAG, "onTrimMemory() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    void onUserLeaveHint() {
        this.ensureAlive();
        if (this.flutterEngine != null) {
            Log.v(TAG, "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.flutterEngine.getActivityControlSurface().onUserLeaveHint();
            return;
        }
        Log.w(TAG, "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
    }

    void release() {
        this.host = null;
        this.flutterEngine = null;
        this.flutterView = null;
        this.platformPlugin = null;
    }

    void setupFlutterEngine() {
        Log.v(TAG, "Setting up FlutterEngine.");
        String string2 = this.host.getCachedEngineId();
        if (string2 != null) {
            this.flutterEngine = FlutterEngineCache.getInstance().get(string2);
            this.isFlutterEngineFromHost = true;
            if (this.flutterEngine != null) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '");
            stringBuilder.append(string2);
            stringBuilder.append("'");
            throw new IllegalStateException(stringBuilder.toString());
        }
        Host host = this.host;
        this.flutterEngine = host.provideFlutterEngine(host.getContext());
        if (this.flutterEngine != null) {
            this.isFlutterEngineFromHost = true;
            return;
        }
        Log.v(TAG, "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        this.flutterEngine = new FlutterEngine(this.host.getContext(), this.host.getFlutterShellArgs().toArray(), false);
        this.isFlutterEngineFromHost = false;
    }

}

