/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 */
package io.flutter.plugin.common;

import io.flutter.plugin.common.MethodCall;
import java.nio.ByteBuffer;

public interface MethodCodec {
    public Object decodeEnvelope(ByteBuffer var1);

    public MethodCall decodeMethodCall(ByteBuffer var1);

    public ByteBuffer encodeErrorEnvelope(String var1, String var2, Object var3);

    public ByteBuffer encodeMethodCall(MethodCall var1);

    public ByteBuffer encodeSuccessEnvelope(Object var1);
}

