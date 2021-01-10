/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodCodec;

public class NavigationChannel {
    private static final String TAG = "NavigationChannel";
    public final MethodChannel channel;

    public NavigationChannel(DartExecutor dartExecutor) {
        this.channel = new MethodChannel(dartExecutor, "flutter/navigation", JSONMethodCodec.INSTANCE);
    }

    public void popRoute() {
        Log.v(TAG, "Sending message to pop route.");
        this.channel.invokeMethod("popRoute", null);
    }

    public void pushRoute(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending message to push route '");
        stringBuilder.append(string2);
        stringBuilder.append("'");
        Log.v(TAG, stringBuilder.toString());
        this.channel.invokeMethod("pushRoute", string2);
    }

    public void setInitialRoute(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending message to set initial route to '");
        stringBuilder.append(string2);
        stringBuilder.append("'");
        Log.v(TAG, stringBuilder.toString());
        this.channel.invokeMethod("setInitialRoute", string2);
    }

    public void setMethodCallHandler(MethodChannel.MethodCallHandler methodCallHandler) {
        this.channel.setMethodCallHandler(methodCallHandler);
    }
}

