/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  f.e.a.a.a.f.a
 *  f.e.a.a.a.f.a$a
 *  f.e.a.a.a.f.b
 *  f.e.a.a.a.g.b
 *  f.e.a.a.a.g.d
 *  f.e.a.a.a.g.f
 *  f.e.a.a.a.j.a$a
 *  f.e.a.a.a.j.a$b
 *  f.e.a.a.a.j.a$c
 *  f.e.a.a.a.j.a$d
 *  f.e.a.a.a.j.c
 *  f.e.a.a.a.j.e
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONObject
 */
package f.e.a.a.a.j;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import f.e.a.a.a.f.a;
import f.e.a.a.a.g.f;
import f.e.a.a.a.j.a;
import f.e.a.a.a.j.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class a
implements a.a {
    private static a g = new a();
    private static Handler h = new Handler(Looper.getMainLooper());
    private static Handler i = null;
    private static final Runnable j = new b();
    private static final Runnable k = new c();
    private List<d> a = new ArrayList();
    private int b;
    private f.e.a.a.a.f.b c = new f.e.a.a.a.f.b();
    private f.e.a.a.a.j.c d = new f.e.a.a.a.j.c();
    private f.e.a.a.a.j.d e = new f.e.a.a.a.j.d(new f.e.a.a.a.j.b.c());
    private double f;

    a() {
    }

    static /* synthetic */ f.e.a.a.a.j.d a(a a2) {
        return a2.e;
    }

    private void a(long l2) {
        if (this.a.size() > 0) {
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                (iterator.next()).a(this.b, l2);
            }
        }
    }

    private void a(View view, f.e.a.a.a.f.a a2, JSONObject jSONObject, e e2) {
        boolean bl = e2 == e.b;
        a2.a(view, jSONObject, (a.a)this, bl);
    }

    private boolean a(View view, JSONObject jSONObject) {
        String string = this.d.a(view);
        if (string != null) {
            f.e.a.a.a.g.b.a((JSONObject)jSONObject, (String)string);
            this.d.e();
            return true;
        }
        return false;
    }

    private void b(View view, JSONObject jSONObject) {
        ArrayList arrayList = this.d.b(view);
        if (arrayList != null) {
            f.e.a.a.a.g.b.a((JSONObject)jSONObject, (List)arrayList);
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
        this.f = f.e.a.a.a.g.d.a();
    }

    private void k() {
        this.a((long)(f.e.a.a.a.g.d.a() - this.f));
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

    public void a(View view, f.e.a.a.a.f.a a2, JSONObject jSONObject) {
        if (!f.d((View)view)) {
            return;
        }
        e e2 = this.d.c(view);
        if (e2 == e.d) {
            return;
        }
        JSONObject jSONObject2 = a2.a(view);
        f.e.a.a.a.g.b.a((JSONObject)jSONObject, (JSONObject)jSONObject2);
        if (!a.super.a(view, jSONObject2)) {
            a.super.b(view, jSONObject2);
            a.super.a(view, a2, jSONObject2, e2);
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
        double d2 = f.e.a.a.a.g.d.a();
        f.e.a.a.a.f.a a2 = this.c.a();
        if (this.d.b().size() > 0) {
            JSONObject jSONObject = a2.a(null);
            this.e.b(jSONObject, (HashSet<String>)this.d.b(), d2);
        }
        if (this.d.a().size() > 0) {
            JSONObject jSONObject = a2.a(null);
            this.a(null, a2, jSONObject, e.b);
            f.e.a.a.a.g.b.a((JSONObject)jSONObject);
            this.e.a(jSONObject, (HashSet<String>)this.d.a(), d2);
        } else {
            this.e.a();
        }
        this.d.d();
    }
}

