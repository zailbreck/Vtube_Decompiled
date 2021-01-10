/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  com.kuqicc.future.a.a
 *  com.kuqicc.future.b.a.b
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package com.kuqicc.future.a.d;

import android.util.Log;
import com.kuqicc.future.b.a.b;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;

public class a
extends com.kuqicc.future.a.a {
    public static a c;

    public static a a() {
        if (c == null) {
            c = new a();
        }
        a a2 = c;
        a2.b = "com.kuqicc.www/ads";
        return a2;
    }

    private void a(String string, MethodChannel.Result result) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\u5e7f\u544a\u5e73\u53f0:");
        stringBuilder.append(string);
        stringBuilder.append(":\u63a5\u6536\u7aef");
        Log.v((String)"verbose", (String)stringBuilder.toString());
        b.b().a(result);
    }

    public static void b(FlutterEngine flutterEngine) {
        a.a().a(flutterEngine);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals((Object)"showRewardAd")) {
            a.super.a((String)((List)methodCall.arguments).get(0), result);
        }
    }
}

