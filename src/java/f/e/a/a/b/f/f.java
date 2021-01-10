/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  f.e.a.a.b.c.a
 *  f.e.a.a.b.c.b
 *  f.e.a.a.b.c.c
 *  f.e.a.a.b.c.d
 *  f.e.a.a.b.c.e
 *  f.e.a.a.b.f.a
 *  f.e.a.a.b.f.b
 *  f.e.a.a.b.f.b$b
 *  f.e.a.a.b.l.a
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.Iterator
 */
package f.e.a.a.b.f;

import android.content.Context;
import android.os.Handler;
import f.e.a.a.b.c.c;
import f.e.a.a.b.c.d;
import f.e.a.a.b.c.e;
import f.e.a.a.b.e.l;
import f.e.a.a.b.f.a;
import f.e.a.a.b.f.b;
import java.util.Collection;
import java.util.Iterator;

public class f
implements c,
b.b {
    private static f f;
    private float a = 0.0f;
    private final e b;
    private final f.e.a.a.b.c.b c;
    private d d;
    private a e;

    public f(e e2, f.e.a.a.b.c.b b2) {
        this.b = e2;
        this.c = b2;
    }

    public static f d() {
        if (f == null) {
            f.e.a.a.b.c.b b2 = new f.e.a.a.b.c.b();
            f = new f(new e(), b2);
        }
        return f;
    }

    private a e() {
        if (this.e == null) {
            this.e = a.d();
        }
        return this.e;
    }

    public void a() {
        b.d().a((b.b)this);
        b.d().a();
        if (b.d().c()) {
            f.e.a.a.b.m.a.h().a();
        }
        this.d.a();
    }

    public void a(float f2) {
        this.a = f2;
        Iterator iterator = f.super.e().b().iterator();
        while (iterator.hasNext()) {
            ((l)((Object)iterator.next())).k().a(f2);
        }
    }

    public void a(Context context) {
        f.e.a.a.b.c.a a2 = this.c.a();
        this.d = this.b.a(new Handler(), context, a2, (c)this);
    }

    public void a(boolean bl) {
        if (bl) {
            f.e.a.a.b.m.a.h().a();
            return;
        }
        f.e.a.a.b.m.a.h().c();
    }

    public void b() {
        f.e.a.a.b.m.a.h().b();
        b.d().b();
        this.d.b();
    }

    public float c() {
        return this.a;
    }
}

