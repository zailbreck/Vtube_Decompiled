/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.a0.a
 *  f.d.b.a0.c
 *  f.d.b.f
 *  f.d.b.j
 *  f.d.b.k
 *  f.d.b.l
 *  f.d.b.r
 *  f.d.b.s
 *  f.d.b.v
 *  f.d.b.w
 *  f.d.b.y.l
 *  f.d.b.y.n.l$a
 *  f.d.b.z.a
 *  java.lang.Object
 *  java.lang.reflect.Type
 */
package f.d.b.y.n;

import f.d.b.a0.c;
import f.d.b.f;
import f.d.b.j;
import f.d.b.k;
import f.d.b.r;
import f.d.b.s;
import f.d.b.v;
import f.d.b.w;
import f.d.b.y.n.l;
import java.lang.reflect.Type;

public final class l<T>
extends v<T> {
    private final s<T> a;
    private final k<T> b;
    final f c;
    private final f.d.b.z.a<T> d;
    private final w e;
    private final l<T> f = new b(this, null);
    private v<T> g;

    public l(s<T> s2, k<T> k2, f f2, f.d.b.z.a<T> a2, w w2) {
        this.a = s2;
        this.b = k2;
        this.c = f2;
        this.d = a2;
        this.e = w2;
    }

    private v<T> a() {
        v v2;
        v<T> v3 = this.g;
        if (v3 != null) {
            return v3;
        }
        this.g = v2 = this.c.a(this.e, this.d);
        return v2;
    }

    public T read(f.d.b.a0.a a2) {
        if (this.b == null) {
            return (T)l.super.a().read(a2);
        }
        f.d.b.l l2 = f.d.b.y.l.a((f.d.b.a0.a)a2);
        if (l2.e()) {
            return null;
        }
        return (T)this.b.a(l2, this.d.b(), this.f);
    }

    public void write(c c2, T t2) {
        s<T> s2 = this.a;
        if (s2 == null) {
            l.super.a().write(c2, t2);
            return;
        }
        if (t2 == null) {
            c2.r();
            return;
        }
        f.d.b.y.l.a((f.d.b.l)s2.a(t2, this.d.b(), this.f), (c)c2);
    }

    private final class b
    implements r,
    j {
        private b(l l2) {
        }

        /* synthetic */ b(l l2, a a2) {
            super(l2);
        }
    }

}

