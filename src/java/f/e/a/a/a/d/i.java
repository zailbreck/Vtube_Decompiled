/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.webkit.WebView
 *  f.e.a.a.a.d.b
 *  f.e.a.a.a.d.c
 *  f.e.a.a.a.d.d
 *  f.e.a.a.a.d.e
 *  f.e.a.a.a.d.h
 *  f.e.a.a.a.e.a
 *  f.e.a.a.a.g.e
 *  f.e.a.a.a.h.a
 *  f.e.a.a.a.i.a
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.UUID
 */
package f.e.a.a.a.d;

import android.view.View;
import android.webkit.WebView;
import f.e.a.a.a.d.b;
import f.e.a.a.a.d.c;
import f.e.a.a.a.d.d;
import f.e.a.a.a.d.e;
import f.e.a.a.a.d.h;
import f.e.a.a.a.e.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class i
extends b {
    private final d a;
    private final c b;
    private final List<f.e.a.a.a.h.a> c = new ArrayList();
    private f.e.a.a.a.h.a d;
    private f.e.a.a.a.i.a e;
    private boolean f = false;
    private boolean g = false;
    private String h;
    private boolean i;

    i(c c2, d d2) {
        this.b = c2;
        this.a = d2;
        this.h = UUID.randomUUID().toString();
        i.super.f(null);
        f.e.a.a.a.i.a a2 = d2.a() == e.c ? new f.e.a.a.a.i.b(d2.f()) : new f.e.a.a.a.i.c((List<h>)d2.e(), d2.c());
        this.e = a2;
        this.e.a();
        a.d().a((i)this);
        this.e.a(c2);
    }

    private f.e.a.a.a.h.a d(View view) {
        for (f.e.a.a.a.h.a a2 : this.c) {
            if (a2.get() != view) continue;
            return a2;
        }
        return null;
    }

    private void e(View view) {
        if (view != null) {
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }

    private void f(View view) {
        this.d = new f.e.a.a.a.h.a(view);
    }

    private void g(View view) {
        Collection collection = a.d().a();
        if (collection != null && collection.size() > 0) {
            for (i i2 : collection) {
                if (i2 == this || i2.f() != view) continue;
                i2.d.clear();
            }
        }
    }

    private void n() {
        if (!this.i) {
            return;
        }
        throw new IllegalStateException("Impression event can only be sent once");
    }

    public void a() {
        if (this.g) {
            return;
        }
        this.d.clear();
        this.b();
        this.g = true;
        this.l().f();
        a.d().c(this);
        this.l().b();
        this.e = null;
    }

    public void a(View view) {
        if (this.g) {
            return;
        }
        i.super.e(view);
        if (i.super.d(view) == null) {
            this.c.add((Object)new f.e.a.a.a.h.a(view));
        }
    }

    public void b() {
        if (this.g) {
            return;
        }
        this.c.clear();
    }

    public void b(View view) {
        if (this.g) {
            return;
        }
        f.e.a.a.a.g.e.a((Object)view, (String)"AdView is null");
        if (this.f() == view) {
            return;
        }
        i.super.f(view);
        this.l().i();
        i.super.g(view);
    }

    public void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        a.d().b(this);
        float f2 = f.e.a.a.a.e.e.d().c();
        this.e.a(f2);
        this.e.a(this, this.a);
    }

    public void c(View view) {
        if (this.g) {
            return;
        }
        i.super.e(view);
        f.e.a.a.a.h.a a2 = i.super.d(view);
        if (a2 != null) {
            this.c.remove((Object)a2);
        }
    }

    public List<f.e.a.a.a.h.a> d() {
        return this.c;
    }

    void e() {
        this.n();
        this.l().g();
        this.i = true;
    }

    public View f() {
        return (View)this.d.get();
    }

    public boolean g() {
        return this.f && !this.g;
    }

    public boolean h() {
        return this.f;
    }

    public boolean i() {
        return this.g;
    }

    public boolean j() {
        return this.b.a();
    }

    public String k() {
        return this.h;
    }

    public f.e.a.a.a.i.a l() {
        return this.e;
    }

    public boolean m() {
        return this.b.b();
    }
}

