/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.kuqicc.future.a.a
 *  com.kuqicc.future.b.d.d
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.kuqicc.future.a.f;

import com.kuqicc.future.b.d.d;
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
        a2.b = "com.kuqicc.www/share";
        return a2;
    }

    public static void b(FlutterEngine flutterEngine) {
        a.a().a(flutterEngine);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals((Object)"saveImg")) {
            d.a((String)((String)((List)methodCall.arguments).get(0)), (MethodChannel.Result)result);
            return;
        }
        if (methodCall.method.equals((Object)"getShareImgPath")) {
            List list = (List)methodCall.arguments;
            d.a((String)((String)list.get(0)), (String)((String)list.get(1)), (MethodChannel.Result)result);
        }
    }
}

