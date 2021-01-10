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
package f.e.a.a.b.l;

import android.content.Context;
import android.webkit.WebView;
import f.e.a.a.b.e.c;
import f.e.a.a.b.e.d;
import f.e.a.a.b.e.j;
import f.e.a.a.b.e.k;
import f.e.a.a.b.e.l;
import f.e.a.a.b.e.m.b;
import f.e.a.a.b.f.e;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class a {
    private f.e.a.a.b.k.b a;
    private f.e.a.a.b.e.a b;
    private b c;
    private a d;
    private long e;

    public a() {
        this.j();
        this.a = new f.e.a.a.b.k.b(null);
    }

    public void a() {
    }

    public void a(float f2) {
        e.a().a(this.h(), f2);
    }

    void a(WebView webView) {
        this.a = new f.e.a.a.b.k.b(webView);
    }

    public void a(f.e.a.a.b.e.a a2) {
        this.b = a2;
    }

    public void a(c c2) {
        e.a().a(this.h(), c2.c());
    }

    public void a(l l2, d d2) {
        this.a(l2, d2, null);
    }

    protected void a(l l2, d d2, JSONObject jSONObject) {
        String string = l2.j();
        JSONObject jSONObject2 = new JSONObject();
        f.e.a.a.b.j.b.a(jSONObject2, "environment", "app");
        f.e.a.a.b.j.b.a(jSONObject2, "adSessionType", (Object)d2.a());
        f.e.a.a.b.j.b.a(jSONObject2, "deviceInfo", (Object)f.e.a.a.b.j.a.d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put((Object)"clid");
        jSONArray.put((Object)"vlid");
        f.e.a.a.b.j.b.a(jSONObject2, "supports", (Object)jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        f.e.a.a.b.j.b.a(jSONObject3, "partnerName", d2.f().a());
        f.e.a.a.b.j.b.a(jSONObject3, "partnerVersion", d2.f().b());
        f.e.a.a.b.j.b.a(jSONObject2, "omidNativeInfo", (Object)jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        f.e.a.a.b.j.b.a(jSONObject4, "libraryVersion", "1.3.4-Mopub");
        f.e.a.a.b.j.b.a(jSONObject4, "appId", f.e.a.a.b.f.d.b().a().getApplicationContext().getPackageName());
        f.e.a.a.b.j.b.a(jSONObject2, "app", (Object)jSONObject4);
        if (d2.b() != null) {
            f.e.a.a.b.j.b.a(jSONObject2, "contentUrl", d2.b());
        }
        if (d2.c() != null) {
            f.e.a.a.b.j.b.a(jSONObject2, "customReferenceData", d2.c());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (k k2 : d2.g()) {
            f.e.a.a.b.j.b.a(jSONObject5, k2.b(), k2.c());
        }
        e.a().a(this.h(), string, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(b b2) {
        this.c = b2;
    }

    public void a(String string) {
        e.a().a(this.h(), string, (JSONObject)null);
    }

    public void a(String string, long l2) {
        if (l2 >= this.e) {
            this.d = a.c;
            e.a().b(this.h(), string);
        }
    }

    public void a(String string, JSONObject jSONObject) {
        e.a().a(this.h(), string, jSONObject);
    }

    public void a(JSONObject jSONObject) {
        e.a().b(this.h(), jSONObject);
    }

    public void a(boolean bl) {
        if (this.e()) {
            String string = bl ? "foregrounded" : "backgrounded";
            e.a().c(this.h(), string);
        }
    }

    public void b() {
        this.a.clear();
    }

    public void b(String string, long l2) {
        a a2;
        a a3;
        if (l2 >= this.e && (a3 = this.d) != (a2 = a.d)) {
            this.d = a2;
            e.a().b(this.h(), string);
        }
    }

    public f.e.a.a.b.e.a c() {
        return this.b;
    }

    public b d() {
        return this.c;
    }

    public boolean e() {
        return this.a.get() != null;
    }

    public void f() {
        e.a().a(this.h());
    }

    public void g() {
        e.a().b(this.h());
    }

    public WebView h() {
        return (WebView)this.a.get();
    }

    public void i() {
        e.a().c(this.h());
    }

    public void j() {
        this.e = f.e.a.a.b.j.d.a();
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

