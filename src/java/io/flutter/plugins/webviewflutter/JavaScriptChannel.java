/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.webkit.JavascriptInterface
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.HashMap
 */
package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

class JavaScriptChannel {
    private final String javaScriptChannelName;
    private final MethodChannel methodChannel;
    private final Handler platformThreadHandler;

    JavaScriptChannel(MethodChannel methodChannel, String string2, Handler handler) {
        this.methodChannel = methodChannel;
        this.javaScriptChannelName = string2;
        this.platformThreadHandler = handler;
    }

    @JavascriptInterface
    public void postMessage(final String string2) {
        Runnable runnable = new Runnable(){

            public void run() {
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"channel", (Object)JavaScriptChannel.this.javaScriptChannelName);
                hashMap.put((Object)"message", (Object)string2);
                JavaScriptChannel.this.methodChannel.invokeMethod("javascriptChannelMessage", (Object)hashMap);
            }
        };
        if (this.platformThreadHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        this.platformThreadHandler.post(runnable);
    }

}

