/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  f.e.a.a.a.b.a
 *  f.e.a.a.a.b.b
 *  f.e.a.a.a.b.c
 *  f.e.a.a.a.b.d
 *  f.e.a.a.a.b.e
 *  f.e.a.a.a.e.a
 *  f.e.a.a.a.e.b
 *  f.e.a.a.a.e.b$b
 *  f.e.a.a.a.i.a
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.Iterator
 */
package f.e.a.a.a.e;

import android.content.Context;
import android.os.Handler;
import f.e.a.a.a.b.c;
import f.e.a.a.a.b.d;
import f.e.a.a.a.d.i;
import f.e.a.a.a.e.a;
import f.e.a.a.a.e.b;
import java.util.Collection;
import java.util.Iterator;

public class e
implements c,
b.b {
    private static e f;
    private float a = 0.0f;
    private final f.e.a.a.a.b.e b;
    private final f.e.a.a.a.b.b c;
    private d d;
    private a e;

    public e(f.e.a.a.a.b.e e2, f.e.a.a.a.b.b b2) {
        this.b = e2;
        this.c = b2;
    }

    public static e d() {
        if (f == null) {
            f.e.a.a.a.b.b b2 = new f.e.a.a.a.b.b();
            f = new e(new f.e.a.a.a.b.e(), b2);
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
            f.e.a.a.a.j.a.h().a();
        }
        this.d.a();
    }

    public void a(float f2) {
        this.a = f2;
        Iterator iterator = e.super.e().b().iterator();
        while (iterator.hasNext()) {
            ((i)((Object)iterator.next())).l().a(f2);
        }
    }

    public void a(Context context) {
        f.e.a.a.a.b.a a2 = this.c.a();
        this.d = this.b.a(new Handler(), context, a2, (c)this);
    }

    public void a(boolean bl) {
        if (bl) {
            f.e.a.a.a.j.a.h().a();
            return;
        }
        f.e.a.a.a.j.a.h().c();
    }

    public void b() {
        f.e.a.a.a.j.a.h().b();
        b.d().b();
        this.d.b();
    }

    public float c() {
        return this.a;
    }
}

