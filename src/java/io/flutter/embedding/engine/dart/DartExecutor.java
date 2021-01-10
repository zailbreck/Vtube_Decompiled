/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  io.flutter.Log
 *  io.flutter.embedding.engine.FlutterJNI
 *  io.flutter.embedding.engine.dart.DartExecutor$DartCallback
 *  io.flutter.embedding.engine.dart.DartExecutor$DartEntrypoint
 *  io.flutter.embedding.engine.dart.DartExecutor$IsolateServiceIdListener
 *  io.flutter.embedding.engine.dart.PlatformMessageHandler
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.BinaryMessenger$BinaryMessageHandler
 *  io.flutter.plugin.common.BinaryMessenger$BinaryReply
 *  io.flutter.view.FlutterCallbackInformation
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 */
package io.flutter.embedding.engine.dart;

import android.content.res.AssetManager;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.dart.DartMessenger;
import io.flutter.embedding.engine.dart.PlatformMessageHandler;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StringCodec;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;

public class DartExecutor
implements BinaryMessenger {
    private static final String TAG = "DartExecutor";
    private final AssetManager assetManager;
    private final BinaryMessenger binaryMessenger;
    private final DartMessenger dartMessenger;
    private final FlutterJNI flutterJNI;
    private boolean isApplicationRunning = false;
    private final BinaryMessenger.BinaryMessageHandler isolateChannelMessageHandler;
    private String isolateServiceId;
    private IsolateServiceIdListener isolateServiceIdListener;

    public DartExecutor(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.isolateChannelMessageHandler = new BinaryMessenger.BinaryMessageHandler(){

            public void onMessage(ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
                DartExecutor.this.isolateServiceId = (String)StringCodec.INSTANCE.decodeMessage(byteBuffer);
                if (DartExecutor.this.isolateServiceIdListener != null) {
                    DartExecutor.this.isolateServiceIdListener.onIsolateServiceIdAvailable(DartExecutor.this.isolateServiceId);
                }
            }
        };
        this.flutterJNI = flutterJNI;
        this.assetManager = assetManager;
        this.dartMessenger = new DartMessenger(flutterJNI);
        this.dartMessenger.setMessageHandler("flutter/isolate", this.isolateChannelMessageHandler);
        this.binaryMessenger = new DefaultBinaryMessenger(this.dartMessenger, null);
    }

    public void executeDartCallback(DartCallback dartCallback) {
        if (this.isApplicationRunning) {
            Log.w((String)TAG, (String)"Attempted to run a DartExecutor that is already running.");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Executing Dart callback: ");
        stringBuilder.append((Object)dartCallback);
        Log.v((String)TAG, (String)stringBuilder.toString());
        FlutterJNI flutterJNI = this.flutterJNI;
        String string = dartCallback.pathToBundle;
        FlutterCallbackInformation flutterCallbackInformation = dartCallback.callbackHandle;
        flutterJNI.runBundleAndSnapshotFromLibrary(string, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, dartCallback.androidAssetManager);
        this.isApplicationRunning = true;
    }

    public void executeDartEntrypoint(DartEntrypoint dartEntrypoint) {
        if (this.isApplicationRunning) {
            Log.w((String)TAG, (String)"Attempted to run a DartExecutor that is already running.");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Executing Dart entrypoint: ");
        stringBuilder.append((Object)dartEntrypoint);
        Log.v((String)TAG, (String)stringBuilder.toString());
        this.flutterJNI.runBundleAndSnapshotFromLibrary(dartEntrypoint.pathToBundle, dartEntrypoint.dartEntrypointFunctionName, null, this.assetManager);
        this.isApplicationRunning = true;
    }

    public BinaryMessenger getBinaryMessenger() {
        return this.binaryMessenger;
    }

    public String getIsolateServiceId() {
        return this.isolateServiceId;
    }

    public int getPendingChannelResponseCount() {
        return this.dartMessenger.getPendingChannelResponseCount();
    }

    public boolean isExecutingDart() {
        return this.isApplicationRunning;
    }

    public void onAttachedToJNI() {
        Log.v((String)TAG, (String)"Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.flutterJNI.setPlatformMessageHandler((PlatformMessageHandler)this.dartMessenger);
    }

    public void onDetachedFromJNI() {
        Log.v((String)TAG, (String)"Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.flutterJNI.setPlatformMessageHandler(null);
    }

    @Deprecated
    public void send(String string, ByteBuffer byteBuffer) {
        this.binaryMessenger.send(string, byteBuffer);
    }

    @Deprecated
    public void send(String string, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
        this.binaryMessenger.send(string, byteBuffer, binaryReply);
    }

    public void setIsolateServiceIdListener(IsolateServiceIdListener isolateServiceIdListener) {
        String string;
        this.isolateServiceIdListener = isolateServiceIdListener;
        IsolateServiceIdListener isolateServiceIdListener2 = this.isolateServiceIdListener;
        if (isolateServiceIdListener2 != null && (string = this.isolateServiceId) != null) {
            isolateServiceIdListener2.onIsolateServiceIdAvailable(string);
        }
    }

    @Deprecated
    public void setMessageHandler(String string, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        this.binaryMessenger.setMessageHandler(string, binaryMessageHandler);
    }

    private static class DefaultBinaryMessenger
    implements BinaryMessenger {
        private final DartMessenger messenger;

        private DefaultBinaryMessenger(DartMessenger dartMessenger) {
            this.messenger = dartMessenger;
        }

        /* synthetic */ DefaultBinaryMessenger(DartMessenger dartMessenger, 1 var2_2) {
            super(dartMessenger);
        }

        public void send(String string, ByteBuffer byteBuffer) {
            this.messenger.send(string, byteBuffer, null);
        }

        public void send(String string, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
            this.messenger.send(string, byteBuffer, binaryReply);
        }

        public void setMessageHandler(String string, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
            this.messenger.setMessageHandler(string, binaryMessageHandler);
        }
    }

}

