/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import android.content.Context;
import android.view.View;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.c;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.HashMap;

public class d
extends PlatformViewFactory {
    private final View a;
    private final BinaryMessenger b;

    public d(BinaryMessenger binaryMessenger, View view) {
        super(StandardMessageCodec.INSTANCE);
        this.a = view;
        this.b = binaryMessenger;
    }

    @Override
    public PlatformView create(Context context, int n2, Object object) {
        HashMap hashMap = (HashMap)object;
        c c2 = new c(this.b, context, n2, (HashMap<String, Object>)hashMap, this.a);
        return c2;
    }
}

