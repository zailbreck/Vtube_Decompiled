/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.webkit.CookieManager
 *  android.webkit.ValueCallback
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  io.flutter.plugins.webviewflutter.FlutterCookieManager$1
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.plugins.webviewflutter;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.webviewflutter.FlutterCookieManager;

class FlutterCookieManager
implements MethodChannel.MethodCallHandler {
    private final MethodChannel methodChannel;

    FlutterCookieManager(BinaryMessenger binaryMessenger) {
        this.methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/cookie_manager");
        this.methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
    }

    private static void clearCookies(MethodChannel.Result result) {
        CookieManager cookieManager = CookieManager.getInstance();
        boolean bl = cookieManager.hasCookies();
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.removeAllCookies((ValueCallback)new 1(result, bl));
            return;
        }
        cookieManager.removeAllCookie();
        result.success((Object)bl);
    }

    void dispose() {
        this.methodChannel.setMethodCallHandler(null);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String string = methodCall.method;
        int n2 = string.hashCode() == 928375682 && string.equals((Object)"clearCookies") ? 0 : -1;
        if (n2 != 0) {
            result.notImplemented();
            return;
        }
        FlutterCookieManager.clearCookies(result);
    }
}

