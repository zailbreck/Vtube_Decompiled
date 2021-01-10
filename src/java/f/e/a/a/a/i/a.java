/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebView
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package f.e.a.a.a.i;

import android.content.Context;
import android.webkit.WebView;
import f.e.a.a.a.d.c;
import f.e.a.a.a.d.e;
import f.e.a.a.a.d.g;
import f.e.a.a.a.d.h;
import f.e.a.a.a.d.i;
import f.e.a.a.a.d.j.d;
import f.e.a.a.a.g.b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class a {
    private f.e.a.a.a.h.b a;
    private f.e.a.a.a.d.a b;
    private d c;
    private a d;
    private double e;

    public a() {
        this.i();
        this.a = new f.e.a.a.a.h.b(null);
    }

    public void a() {
    }

    public void a(float f2) {
        f.e.a.a.a.e.d.a().a(this.h(), f2);
    }

    void a(WebView webView) {
        this.a = new f.e.a.a.a.h.b(webView);
    }

    public void a(f.e.a.a.a.d.a a2) {
        this.b = a2;
    }

    public void a(c c2) {
        f.e.a.a.a.e.d.a().a(this.h(), c2.c());
    }

    public void a(i i2, f.e.a.a.a.d.d d2) {
        String string = i2.k();
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "environment", "app");
        b.a(jSONObject, "adSessionType", (Object)d2.a());
        b.a(jSONObject, "deviceInfo", (Object)f.e.a.a.a.g.a.d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put((Object)"clid");
        jSONArray.put((Object)"vlid");
        b.a(jSONObject, "supports", (Object)jSONArray);
        JSONObject jSONObject2 = new JSONObject();
        b.a(jSONObject2, "partnerName", d2.d().a());
        b.a(jSONObject2, "partnerVersion", d2.d().b());
        b.a(jSONObject, "omidNativeInfo", (Object)jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        b.a(jSONObject3, "libraryVersion", "1.2.15-Mintegral");
        b.a(jSONObject3, "appId", f.e.a.a.a.e.c.b().a().getApplicationContext().getPackageName());
        b.a(jSONObject, "app", (Object)jSONObject3);
        if (d2.b() != null) {
            b.a(jSONObject, "customReferenceData", d2.b());
        }
        JSONObject jSONObject4 = new JSONObject();
        for (h h2 : d2.e()) {
            b.a(jSONObject4, h2.b(), h2.c());
        }
        f.e.a.a.a.e.d.a().a(this.h(), string, jSONObject, jSONObject4);
    }

    public void a(d d2) {
        this.c = d2;
    }

    public void a(String string) {
        f.e.a.a.a.e.d.a().a(this.h(), string, null);
    }

    public void a(String string, double d2) {
        if (d2 > this.e) {
            this.d = a.c;
            f.e.a.a.a.e.d.a().c(this.h(), string);
        }
    }

    public void a(String string, JSONObject jSONObject) {
        f.e.a.a.a.e.d.a().a(this.h(), string, jSONObject);
    }

    public void a(boolean bl) {
        if (this.e()) {
            String string = bl ? "foregrounded" : "backgrounded";
            f.e.a.a.a.e.d.a().d(this.h(), string);
        }
    }

    public void b() {
        this.a.clear();
    }

    public void b(String string, double d2) {
        a a2;
        a a3;
        if (d2 > this.e && (a2 = this.d) != (a3 = a.d)) {
            this.d = a3;
            f.e.a.a.a.e.d.a().c(this.h(), string);
        }
    }

    public f.e.a.a.a.d.a c() {
        return this.b;
    }

    public d d() {
        return this.c;
    }

    public boolean e() {
        return this.a.get() != null;
    }

    public void f() {
        f.e.a.a.a.e.d.a().a(this.h());
    }

    public void g() {
        f.e.a.a.a.e.d.a().b(this.h());
    }

    public WebView h() {
        return (WebView)this.a.get();
    }

    public void i() {
        this.e = f.e.a.a.a.g.d.a();
        this.d = a.b;
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        static {
            a[] arra = new a[]{b, c, d};
            e = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])e.clone();
        }
    }

}

