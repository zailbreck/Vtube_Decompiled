/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.plugins.webviewflutter;

import android.view.View;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformViewFactory;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugins.webviewflutter.FlutterCookieManager;
import io.flutter.plugins.webviewflutter.WebViewFactory;
import io.flutter.view.FlutterView;

public class WebViewFlutterPlugin
implements FlutterPlugin {
    private FlutterCookieManager flutterCookieManager;

    public static void registerWith(PluginRegistry.Registrar registrar) {
        registrar.platformViewRegistry().registerViewFactory("plugins.flutter.io/webview", new WebViewFactory(registrar.messenger(), (View)registrar.view()));
        new FlutterCookieManager(registrar.messenger());
    }

    @Override
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        flutterPluginBinding.getFlutterEngine().getPlatformViewsController().getRegistry().registerViewFactory("plugins.flutter.io/webview", new WebViewFactory(binaryMessenger, null));
        this.flutterCookieManager = new FlutterCookieManager(binaryMessenger);
    }

    @Override
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        FlutterCookieManager flutterCookieManager = this.flutterCookieManager;
        if (flutterCookieManager == null) {
            return;
        }
        flutterCookieManager.dispose();
        this.flutterCookieManager = null;
    }
}

