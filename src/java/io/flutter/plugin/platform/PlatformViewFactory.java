/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 */
package io.flutter.plugin.platform;

import android.content.Context;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.platform.PlatformView;

public abstract class PlatformViewFactory {
    private final MessageCodec<Object> createArgsCodec;

    public PlatformViewFactory(MessageCodec<Object> messageCodec) {
        this.createArgsCodec = messageCodec;
    }

    public abstract PlatformView create(Context var1, int var2, Object var3);

    public final MessageCodec<Object> getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}

