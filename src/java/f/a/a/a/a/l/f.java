/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.a.a.a.a.g.b
 *  f.a.a.a.a.k.d
 *  f.a.a.a.a.l.b
 *  f.a.a.a.a.l.f$a
 *  j.b0
 *  j.u
 *  k.e
 *  k.l
 *  k.s
 */
package f.a.a.a.a.l;

import f.a.a.a.a.k.d;
import f.a.a.a.a.l.b;
import f.a.a.a.a.l.f;
import j.b0;
import j.u;
import k.e;
import k.l;
import k.s;

public class f<T extends d>
extends b0 {
    private final b0 b;
    private f.a.a.a.a.g.b c;
    private e d;
    private T e;

    public f(b0 b02, b b2) {
        this.b = b02;
        this.c = b2.e();
        this.e = b2.f();
    }

    static /* synthetic */ f.a.a.a.a.g.b a(f f2) {
        return f2.c;
    }

    private s a(s s2) {
        return new a((f)this, s2);
    }

    static /* synthetic */ d b(f f2) {
        return f2.e;
    }

    static /* synthetic */ b0 c(f f2) {
        return f2.b;
    }

    public long m() {
        return this.b.m();
    }

    public u n() {
        return this.b.n();
    }

    public e o() {
        if (this.d == null) {
            this.d = l.a((s)this.a((s)this.b.o()));
        }
        return this.d;
    }
}

