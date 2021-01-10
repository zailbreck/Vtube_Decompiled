/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StringCodec;

public class LifecycleChannel {
    private static final String TAG = "LifecycleChannel";
    public final BasicMessageChannel<String> channel;

    public LifecycleChannel(DartExecutor dartExecutor) {
        this.channel = new BasicMessageChannel<String>(dartExecutor, "flutter/lifecycle", StringCodec.INSTANCE);
    }

    public void appIsDetached() {
        Log.v(TAG, "Sending AppLifecycleState.detached message.");
        this.channel.send("AppLifecycleState.detached");
    }

    public void appIsInactive() {
        Log.v(TAG, "Sending AppLifecycleState.inactive message.");
        this.channel.send("AppLifecycleState.inactive");
    }

    public void appIsPaused() {
        Log.v(TAG, "Sending AppLifecycleState.paused message.");
        this.channel.send("AppLifecycleState.paused");
    }

    public void appIsResumed() {
        Log.v(TAG, "Sending AppLifecycleState.resumed message.");
        this.channel.send("AppLifecycleState.resumed");
    }
}

