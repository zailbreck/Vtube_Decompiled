/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  f.e.a.a.b.h.a
 *  f.e.a.a.b.h.a$a
 *  f.e.a.a.b.h.b
 *  f.e.a.a.b.j.b
 *  f.e.a.a.b.j.d
 *  f.e.a.a.b.j.f
 *  f.e.a.a.b.m.a$a
 *  f.e.a.a.b.m.a$b
 *  f.e.a.a.b.m.a$c
 *  f.e.a.a.b.m.a$e
 *  f.e.a.a.b.m.b
 *  f.e.a.a.b.m.b$a
 *  f.e.a.a.b.m.d
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.List
 *  java.util.concurrent.TimeUnit
 *  org.json.JSONObject
 */
package f.e.a.a.b.m;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import f.e.a.a.b.h.a;
import f.e.a.a.b.j.f;
import f.e.a.a.b.m.a;
import f.e.a.a.b.m.b;
import f.e.a.a.b.m.b$d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class a
implements a.a {
    private static a g = new a();
    private static Handler h = new Handler(Looper.getMainLooper());
    private static Handler i = null;
    private static final Runnable j = new b();
    private static final Runnable k = new c();
    private List<e> a = new ArrayList();
    private int b;
    private f.e.a.a.b.h.b c = new f.e.a.a.b.h.b();
    private f.e.a.a.b.m.b d = new f.e.a.a.b.m.b();
    private f.e.a.a.b.m.c e = new f.e.a.a.b.m.c(new b$d());
    private long f;

    a() {
    }

    static /* synthetic */ f.e.a.a.b.m.c a(a a2) {
        return a2.e;
    }

    private void a(long l2) {
        if (this.a.size() > 0) {
            for (e e2 : this.a) {
                e2.a(this.b, TimeUnit.NANOSECONDS.toMillis(l2));
                if (!(e2 instanceof d)) continue;
                ((d)e2).b(this.b, l2);
            }
        }
    }

    private void a(View view, f.e.a.a.b.h.a a2, JSONObject jSONObject, f.e.a.a.b.m.d d2) {
        boolean bl = d2 == f.e.a.a.b.m.d.b;
        a2.a(view, jSONObject, (a.a)this, bl);
    }

    private void a(String string, View view, JSONObject jSONObject) {
        f.e.a.a.b.h.a a2 = this.c.b();
        String string2 = this.d.a(string);
        if (string2 != null) {
            JSONObject jSONObject2 = a2.a(view);
            f.e.a.a.b.j.b.a((JSONObject)jSONObject2, (String)string);
            f.e.a.a.b.j.b.b((JSONObject)jSONObject2, (String)string2);
            f.e.a.a.b.j.b.a((JSONObject)jSONObject, (JSONObject)jSONObject2);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String string = this.d.a(view);
        if (string != null) {
            f.e.a.a.b.j.b.a((JSONObject)jSONObject, (String)string);
            this.d.e();
            return true;
        }
        return false;
    }

    private void b(View view, JSONObject jSONObject) {
        b.a a2 = this.d.b(view);
        if (a2 != null) {
            f.e.a.a.b.j.b.a((JSONObject)jSONObject, (b.a)a2);
        }
    }

    static /* synthetic */ void b(a a2) {
        a2.i();
    }

    static /* synthetic */ Handler e() {
        return i;
    }

    static /* synthetic */ Runnable f() {
        return j;
    }

    static /* synthetic */ Runnable g() {
        return k;
    }

    public static a h() {
        return g;
    }

    private void i() {
        this.j();
        this.d();
        this.k();
    }

    private void j() {
        this.b = 0;
        this.f = f.e.a.a.b.j.d.a();
    }

    private void k() {
        this.a(f.e.a.a.b.j.d.a() - this.f);
    }

    private void l() {
        if (i == null) {
            i = new Handler(Looper.getMainLooper());
            i.post(j);
            i.postDelayed(k, 200L);
        }
    }

    private void m() {
        Handler handler = i;
        if (handler != null) {
            handler.removeCallbacks(k);
            i = null;
        }
    }

    public void a() {
        this.l();
    }

    public void a(View view, f.e.a.a.b.h.a a2, JSONObject jSONObject) {
        if (!f.d((View)view)) {
            return;
        }
        f.e.a.a.b.m.d d2 = this.d.c(view);
        if (d2 == f.e.a.a.b.m.d.d) {
            return;
        }
        JSONObject jSONObject2 = a2.a(view);
        f.e.a.a.b.j.b.a((JSONObject)jSONObject, (JSONObject)jSONObject2);
        if (!a.super.a(view, jSONObject2)) {
            a.super.b(view, jSONObject2);
            a.super.a(view, a2, jSONObject2, d2);
        }
        this.b = 1 + this.b;
    }

    public void b() {
        this.c();
        this.a.clear();
        h.post((Runnable)new a(this));
    }

    public void c() {
        this.m();
    }

    void d() {
        this.d.c();
        long l2 = f.e.a.a.b.j.d.a();
        f.e.a.a.b.h.a a2 = this.c.a();
        if (this.d.b().size() > 0) {
            for (String string : this.d.b()) {
                JSONObject jSONObject = a2.a(null);
                this.a(string, this.d.b(string), jSONObject);
                f.e.a.a.b.j.b.a((JSONObject)jSONObject);
                HashSet hashSet = new HashSet();
                hashSet.add((Object)string);
                this.e.b(jSONObject, (HashSet<String>)hashSet, l2);
            }
        }
        if (this.d.a().size() > 0) {
            JSONObject jSONObject = a2.a(null);
            this.a(null, a2, jSONObject, f.e.a.a.b.m.d.b);
            f.e.a.a.b.j.b.a((JSONObject)jSONObject);
            this.e.a(jSONObject, (HashSet<String>)this.d.a(), l2);
        } else {
            this.e.a();
        }
        this.d.d();
    }

    public static interface d
    extends e {
        public void b(int var1, long var2);
    }

}

