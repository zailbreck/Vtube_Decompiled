/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugin.common.MessageCodec
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 */
package io.flutter.plugin.common;

import io.flutter.plugin.common.MessageCodec;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class StringCodec
implements MessageCodec<String> {
    public static final StringCodec INSTANCE;
    private static final Charset UTF8;

    static {
        UTF8 = Charset.forName((String)"UTF8");
        INSTANCE = new StringCodec();
    }

    private StringCodec() {
    }

    public String decodeMessage(ByteBuffer byteBuffer) {
        byte[] arrby;
        int n2;
        if (byteBuffer == null) {
            return null;
        }
        int n3 = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            arrby = byteBuffer.array();
            n2 = byteBuffer.arrayOffset();
        } else {
            arrby = new byte[n3];
            byteBuffer.get(arrby);
            n2 = 0;
        }
        return new String(arrby, n2, n3, UTF8);
    }

    public ByteBuffer encodeMessage(String string) {
        if (string == null) {
            return null;
        }
        byte[] arrby = string.getBytes(UTF8);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)arrby.length);
        byteBuffer.put(arrby);
        return byteBuffer;
    }
}

