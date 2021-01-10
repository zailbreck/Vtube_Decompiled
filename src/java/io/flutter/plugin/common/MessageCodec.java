/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.nio.ByteBuffer
 */
package io.flutter.plugin.common;

import java.nio.ByteBuffer;

public interface MessageCodec<T> {
    public T decodeMessage(ByteBuffer var1);

    public ByteBuffer encodeMessage(T var1);
}

