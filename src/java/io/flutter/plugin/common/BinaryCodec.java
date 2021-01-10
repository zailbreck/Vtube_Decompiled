/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugin.common.MessageCodec
 *  java.lang.Object
 *  java.nio.ByteBuffer
 */
package io.flutter.plugin.common;

import io.flutter.plugin.common.MessageCodec;
import java.nio.ByteBuffer;

public final class BinaryCodec
implements MessageCodec<ByteBuffer> {
    public static final BinaryCodec INSTANCE = new BinaryCodec();

    private BinaryCodec() {
    }

    public ByteBuffer decodeMessage(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    public ByteBuffer encodeMessage(ByteBuffer byteBuffer) {
        return byteBuffer;
    }
}

