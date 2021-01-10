/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  io.flutter.plugins.share.Share
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package io.flutter.plugins.share;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.share.Share;
import java.io.IOException;
import java.util.List;
import java.util.Map;

class MethodCallHandler
implements MethodChannel.MethodCallHandler {
    private Share share;

    MethodCallHandler(Share share) {
        this.share = share;
    }

    private void expectMapArguments(MethodCall methodCall) {
        if (methodCall.arguments instanceof Map) {
            return;
        }
        throw new IllegalArgumentException("Map argument expected");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void onMethodCall(MethodCall var1, MethodChannel.Result var2_2) {
        block7 : {
            block6 : {
                var3_3 = var1.method;
                var4_4 = var3_3.hashCode();
                if (var4_4 == -1811378728) break block6;
                if (var4_4 != 109400031 || !var3_3.equals((Object)"share")) ** GOTO lbl-1000
                var5_5 = 0;
                break block7;
            }
            if (var3_3.equals((Object)"shareFiles")) {
                var5_5 = 1;
            } else lbl-1000: // 2 sources:
            {
                var5_5 = -1;
            }
        }
        if (var5_5 == 0) {
            MethodCallHandler.super.expectMapArguments(var1);
            this.share.share((String)var1.argument("text"), (String)var1.argument("subject"));
            var2_2.success(null);
            return;
        }
        if (var5_5 != 1) {
            var2_2.notImplemented();
            return;
        }
        MethodCallHandler.super.expectMapArguments(var1);
        try {
            this.share.shareFiles((List)var1.argument("paths"), (List)var1.argument("mimeTypes"), (String)var1.argument("text"), (String)var1.argument("subject"));
            var2_2.success(null);
            return;
        }
        catch (IOException var6_6) {
            var2_2.error(var6_6.getMessage(), null, null);
            return;
        }
    }
}

