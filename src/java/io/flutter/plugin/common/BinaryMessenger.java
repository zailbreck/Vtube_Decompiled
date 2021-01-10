/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 */
package io.flutter.plugin.common;

import java.nio.ByteBuffer;

public interface BinaryMessenger {
    public void send(String var1, ByteBuffer var2);

    public void send(String var1, ByteBuffer var2, BinaryReply var3);

    public void setMessageHandler(String var1, BinaryMessageHandler var2);

    public static interface BinaryMessageHandler {
        public void onMessage(ByteBuffer var1, BinaryReply var2);
    }

    public static interface BinaryReply {
        public void reply(ByteBuffer var1);
    }

}

