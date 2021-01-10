/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  android.view.View
 *  android.webkit.WebView
 *  f.f.a.e.e.a
 *  f.f.a.e.f.h
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.LinkedHashMap
 *  java.util.concurrent.ConcurrentHashMap
 *  org.json.JSONObject
 */
package f.f.a.r.a.a;

import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import f.f.a.e.f.h;
import f.f.a.k.g.i;
import f.f.a.s.d.c;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class b {
    private static ConcurrentHashMap<String, LinkedHashMap<String, View>> a = new ConcurrentHashMap();
    private static LinkedHashMap<String, String> b = new LinkedHashMap();
    private static LinkedHashMap<String, f.f.a.e.e.a> c = new LinkedHashMap();
    private static LinkedHashMap<String, c> d = new LinkedHashMap();
    private static LinkedHashMap<String, String> e = new LinkedHashMap();
    private static LinkedHashMap<String, Integer> f = new LinkedHashMap();
    private static volatile int g = 10000;
    private static int h = 0;
    private static int i = 1;

    private b() {
    }

    /* synthetic */ b(f.f.a.r.a.a.a a2) {
    }

    public static b b() {
        return a.a;
    }

    public final int a(String string2) {
        if (f.containsKey((Object)string2)) {
            return (Integer)f.get((Object)string2);
        }
        return 2;
    }

    public final String a() {
        g = 1 + g;
        return String.valueOf((int)g);
    }

    public final void a(WebView webView, String string2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("message", (Object)string2);
            jSONObject.put("data", (Object)new JSONObject());
            i.a().a((Object)webView, Base64.encodeToString((byte[])jSONObject.toString().getBytes(), (int)2));
            return;
        }
        catch (Exception exception) {
            h.a((String)"OperateViews", (String)exception.getMessage());
            return;
        }
    }

    public final void a(WebView webView, String string2, String string3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", h);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", (Object)string3);
            jSONObject.put("data", (Object)jSONObject2);
            i.a().a(webView, string2, Base64.encodeToString((byte[])jSONObject.toString().getBytes(), (int)2));
            return;
        }
        catch (Exception exception) {
            this.a(webView, exception.getMessage());
            h.a((String)"OperateViews", (String)exception.getMessage());
            return;
        }
    }

    public final void a(String string2, int n2) {
        f.put((Object)string2, (Object)n2);
    }

    public final void a(String string2, String string3) {
        b.put((Object)string2, (Object)string3);
    }

    public final LinkedHashMap<String, View> b(String string2, String string3) {
        void var22_3 = this;
        synchronized (var22_3) {
            block4 : {
                ConcurrentHashMap<String, LinkedHashMap<String, View>> concurrentHashMap = a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("_");
                stringBuilder.append(string3);
                if (!concurrentHashMap.containsKey((Object)stringBuilder.toString())) break block4;
                ConcurrentHashMap<String, LinkedHashMap<String, View>> concurrentHashMap2 = a;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string2);
                stringBuilder2.append("_");
                stringBuilder2.append(string3);
                LinkedHashMap linkedHashMap = (LinkedHashMap)concurrentHashMap2.get((Object)stringBuilder2.toString());
                return linkedHashMap;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ConcurrentHashMap<String, LinkedHashMap<String, View>> concurrentHashMap = a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("_");
            stringBuilder.append(string3);
            concurrentHashMap.put((Object)stringBuilder.toString(), (Object)linkedHashMap);
            return linkedHashMap;
        }
    }

    public final void b(String string2) {
        if (e.containsKey((Object)string2)) {
            e.remove((Object)string2);
        }
        if (d.containsKey((Object)string2)) {
            d.remove((Object)string2);
        }
        if (c.containsKey((Object)string2)) {
            c.remove((Object)string2);
        }
        if (b.containsKey((Object)string2)) {
            b.remove((Object)string2);
        }
    }

    public final void c(String string2) {
        if (f.containsKey((Object)string2)) {
            f.remove((Object)string2);
        }
    }

    private static final class a {
        private static b a = new b(null);
    }

}

