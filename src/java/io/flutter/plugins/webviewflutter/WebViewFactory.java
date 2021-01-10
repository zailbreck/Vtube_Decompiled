/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MessageCodec
 *  io.flutter.plugin.platform.PlatformView
 *  io.flutter.plugin.platform.PlatformViewFactory
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.view.View;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import io.flutter.plugins.webviewflutter.FlutterWebView;
import java.util.Map;

public final class WebViewFactory
extends PlatformViewFactory {
    private final View containerView;
    private final BinaryMessenger messenger;

    WebViewFactory(BinaryMessenger binaryMessenger, View view) {
        super((MessageCodec)StandardMessageCodec.INSTANCE);
        this.messenger = binaryMessenger;
        this.containerView = view;
    }

    public PlatformView create(Context context, int n2, Object object) {
        Map map = (Map)object;
        FlutterWebView flutterWebView = new FlutterWebView(context, this.messenger, n2, (Map<String, Object>)map, this.containerView);
        return flutterWebView;
    }
}

