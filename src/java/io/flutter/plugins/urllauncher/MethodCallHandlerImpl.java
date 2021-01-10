/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  io.flutter.plugins.urllauncher.UrlLauncher
 *  io.flutter.plugins.urllauncher.UrlLauncher$LaunchStatus
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  java.util.Set
 */
package io.flutter.plugins.urllauncher;

import android.os.Bundle;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.urllauncher.UrlLauncher;
import java.util.Map;
import java.util.Set;

final class MethodCallHandlerImpl
implements MethodChannel.MethodCallHandler {
    private static final String TAG = "MethodCallHandlerImpl";
    private MethodChannel channel;
    private final UrlLauncher urlLauncher;

    MethodCallHandlerImpl(UrlLauncher urlLauncher) {
        this.urlLauncher = urlLauncher;
    }

    private static Bundle extractBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String string : map.keySet()) {
            bundle.putString(string, (String)map.get((Object)string));
        }
        return bundle;
    }

    private void onCanLaunch(MethodChannel.Result result, String string) {
        result.success((Object)this.urlLauncher.canLaunch(string));
    }

    private void onCloseWebView(MethodChannel.Result result) {
        this.urlLauncher.closeWebView();
        result.success(null);
    }

    private void onLaunch(MethodCall methodCall, MethodChannel.Result result, String string) {
        boolean bl = (Boolean)methodCall.argument("useWebView");
        boolean bl2 = (Boolean)methodCall.argument("enableJavaScript");
        boolean bl3 = (Boolean)methodCall.argument("enableDomStorage");
        Bundle bundle = MethodCallHandlerImpl.extractBundle((Map<String, String>)((Map)methodCall.argument("headers")));
        if (this.urlLauncher.launch(string, bundle, bl, bl2, bl3) == UrlLauncher.LaunchStatus.NO_ACTIVITY) {
            result.error("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
            return;
        }
        result.success((Object)true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onMethodCall(MethodCall var1, MethodChannel.Result var2_2) {
        block7 : {
            block5 : {
                block6 : {
                    var3_3 = (String)var1.argument("url");
                    var4_4 = var1.method;
                    var5_5 = var4_4.hashCode();
                    if (var5_5 == -1109843021) break block5;
                    if (var5_5 == -185306205) break block6;
                    if (var5_5 != -121617663 || !var4_4.equals((Object)"closeWebView")) ** GOTO lbl-1000
                    var6_6 = 2;
                    break block7;
                }
                if (!var4_4.equals((Object)"canLaunch")) ** GOTO lbl-1000
                var6_6 = 0;
                break block7;
            }
            if (var4_4.equals((Object)"launch")) {
                var6_6 = 1;
            } else lbl-1000: // 3 sources:
            {
                var6_6 = -1;
            }
        }
        if (var6_6 == 0) {
            MethodCallHandlerImpl.super.onCanLaunch(var2_2, var3_3);
            return;
        }
        if (var6_6 == 1) {
            MethodCallHandlerImpl.super.onLaunch(var1, var2_2, var3_3);
            return;
        }
        if (var6_6 != 2) {
            var2_2.notImplemented();
            return;
        }
        MethodCallHandlerImpl.super.onCloseWebView(var2_2);
    }

    void startListening(BinaryMessenger binaryMessenger) {
        if (this.channel != null) {
            Log.wtf((String)TAG, (String)"Setting a method call handler before the last was disposed.");
            this.stopListening();
        }
        this.channel = new MethodChannel(binaryMessenger, "plugins.flutter.io/url_launcher");
        this.channel.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
    }

    void stopListening() {
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            Log.d((String)TAG, (String)"Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        methodChannel.setMethodCallHandler(null);
        this.channel = null;
    }
}

