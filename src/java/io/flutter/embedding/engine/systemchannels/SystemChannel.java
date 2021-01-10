/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.JSONMessageCodec;
import io.flutter.plugin.common.MessageCodec;
import java.util.HashMap;

public class SystemChannel {
    private static final String TAG = "SystemChannel";
    public final BasicMessageChannel<Object> channel;

    public SystemChannel(DartExecutor dartExecutor) {
        this.channel = new BasicMessageChannel<Object>(dartExecutor, "flutter/system", JSONMessageCodec.INSTANCE);
    }

    public void sendMemoryPressureWarning() {
        Log.v(TAG, "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put((Object)"type", (Object)"memoryPressure");
        this.channel.send((Object)hashMap);
    }
}

