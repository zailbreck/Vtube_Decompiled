/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.os.Handler
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  f.e.a.a.a.d.h
 *  f.e.a.a.a.e.c
 *  f.e.a.a.a.e.d
 *  f.e.a.a.a.i.a
 *  f.e.a.a.a.i.c$a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.net.URL
 *  java.util.Iterator
 *  java.util.List
 */
package f.e.a.a.a.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import f.e.a.a.a.d.h;
import f.e.a.a.a.e.d;
import f.e.a.a.a.i.c;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class c
extends f.e.a.a.a.i.a {
    private WebView f;
    private List<h> g;
    private final String h;

    public c(List<h> list, String string) {
        this.g = list;
        this.h = string;
    }

    static /* synthetic */ WebView a(c c2) {
        return c2.f;
    }

    public void a() {
        super.a();
        this.j();
    }

    public void b() {
        super.b();
        new Handler().postDelayed((Runnable)new a(this), 2000L);
        this.f = null;
    }

    @SuppressLint(value={"SetJavaScriptEnabled"})
    void j() {
        this.f = new WebView(f.e.a.a.a.e.c.b().a());
        this.f.getSettings().setJavaScriptEnabled(true);
        this.a(this.f);
        d.a().a(this.f, this.h);
        Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            String string = ((h)iterator.next()).a().toExternalForm();
            d.a().b(this.f, string);
        }
    }
}

