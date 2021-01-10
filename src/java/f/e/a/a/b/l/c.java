/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.os.Handler
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  f.e.a.a.b.e.d
 *  f.e.a.a.b.e.k
 *  f.e.a.a.b.f.d
 *  f.e.a.a.b.f.e
 *  f.e.a.a.b.j.b
 *  f.e.a.a.b.j.d
 *  f.e.a.a.b.l.a
 *  f.e.a.a.b.l.c$a
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.net.URL
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.TimeUnit
 *  org.json.JSONObject
 */
package f.e.a.a.b.l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import f.e.a.a.b.e.d;
import f.e.a.a.b.e.k;
import f.e.a.a.b.e.l;
import f.e.a.a.b.f.e;
import f.e.a.a.b.j.b;
import f.e.a.a.b.l.c;
import java.net.URL;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class c
extends f.e.a.a.b.l.a {
    private WebView f;
    private Long g = null;
    private Map<String, k> h;
    private final String i;

    public c(Map<String, k> map, String string) {
        this.h = map;
        this.i = string;
    }

    static /* synthetic */ WebView a(c c2) {
        return c2.f;
    }

    public void a() {
        super.a();
        this.k();
    }

    public void a(l l2, d d2) {
        JSONObject jSONObject = new JSONObject();
        Map map = d2.d();
        for (String string : map.keySet()) {
            b.a((JSONObject)jSONObject, (String)string, (Object)((k)map.get((Object)string)));
        }
        this.a(l2, d2, jSONObject);
    }

    public void b() {
        super.b();
        long l2 = this.g == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.e.a.a.b.j.d.a() - this.g, TimeUnit.NANOSECONDS);
        long l3 = Math.max((long)(4000L - l2), (long)2000L);
        new Handler().postDelayed((Runnable)new a(this), l3);
        this.f = null;
    }

    @SuppressLint(value={"SetJavaScriptEnabled"})
    void k() {
        this.f = new WebView(f.e.a.a.b.f.d.b().a());
        this.f.getSettings().setJavaScriptEnabled(true);
        this.a(this.f);
        e.a().a(this.f, this.i);
        for (String string : this.h.keySet()) {
            String string2 = ((k)this.h.get((Object)string)).a().toExternalForm();
            e.a().a(this.f, string2, string);
        }
        this.g = f.e.a.a.b.j.d.a();
    }
}

