/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.kuqicc.future.a.a
 *  com.kuqicc.future.a.e.a
 *  com.kuqicc.future.a.e.b
 *  com.kuqicc.future.b.c.f
 *  com.kuqicc.future.c.a
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Date
 *  java.util.List
 */
package com.kuqicc.future.a.e;

import com.kuqicc.future.a.a;
import com.kuqicc.future.a.e.b;
import com.kuqicc.future.b.c.f;
import h.b.h;
import h.b.q.d;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Date;
import java.util.List;

public class c
extends a {
    public static c c;

    public static c a() {
        if (c == null) {
            c = new c();
        }
        c c2 = c;
        c2.b = "com.kuqicc.www/upload";
        return c2;
    }

    static /* synthetic */ void a(MethodChannel.Result result, String string) {
        result.success(string);
    }

    static /* synthetic */ void a(MethodChannel.Result result, Throwable throwable) {
        result.error(throwable.getMessage(), throwable.getMessage(), (Object)throwable);
    }

    private void a(String string, int n2, MethodChannel.Result result, boolean bl) {
        long l2 = new Date().getTime();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(l2);
        stringBuilder2.append(string);
        stringBuilder.append(com.kuqicc.future.c.a.a((String)stringBuilder2.toString()));
        stringBuilder.append(string.substring(string.lastIndexOf(46)));
        String string2 = stringBuilder.toString();
        f f2 = f.a();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(n2);
        stringBuilder3.append("/");
        stringBuilder3.append(string2);
        f2.a(string, stringBuilder3.toString(), bl).b(h.b.t.a.a()).a(h.b.n.b.a.a()).a(new b(result), (d<? super Throwable>)((d<Throwable>)new com.kuqicc.future.a.e.a(result)));
    }

    public static void b(FlutterEngine flutterEngine) {
        c.a().a(flutterEngine);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals((Object)"upload")) {
            List list = (List)methodCall.arguments;
            c.super.a((String)list.get(0), (Integer)list.get(1), result, (Boolean)list.get(2));
        }
    }
}

