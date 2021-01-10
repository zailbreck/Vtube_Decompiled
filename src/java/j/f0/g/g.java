/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.a0
 *  j.b0
 *  j.e
 *  j.f0.f.g
 *  j.f0.g.c
 *  j.i
 *  j.p
 *  j.s
 *  j.t
 *  j.t$a
 *  j.y
 *  java.lang.AssertionError
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package j.f0.g;

import j.a0;
import j.b0;
import j.e;
import j.f0.g.c;
import j.i;
import j.p;
import j.s;
import j.t;
import j.y;
import java.util.List;

public final class g
implements t.a {
    private final List<t> a;
    private final j.f0.f.g b;
    private final c c;
    private final j.f0.f.c d;
    private final int e;
    private final y f;
    private final e g;
    private final p h;
    private final int i;
    private final int j;
    private final int k;
    private int l;

    public g(List<t> list, j.f0.f.g g2, c c2, j.f0.f.c c3, int n2, y y2, e e2, p p2, int n3, int n4, int n5) {
        this.a = list;
        this.d = c3;
        this.b = g2;
        this.c = c2;
        this.e = n2;
        this.f = y2;
        this.g = e2;
        this.h = p2;
        this.i = n3;
        this.j = n4;
        this.k = n5;
    }

    public int a() {
        return this.i;
    }

    public a0 a(y y2) {
        return this.a(y2, this.b, this.c, this.d);
    }

    public a0 a(y y2, j.f0.f.g g2, c c2, j.f0.f.c c3) {
        if (this.e < this.a.size()) {
            this.l = 1 + this.l;
            if (this.c != null && !this.d.a(y2.g())) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("network interceptor ");
                stringBuilder.append(this.a.get(this.e - 1));
                stringBuilder.append(" must retain the same host and port");
                throw new IllegalStateException(stringBuilder.toString());
            }
            if (this.c != null && this.l > 1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("network interceptor ");
                stringBuilder.append(this.a.get(this.e - 1));
                stringBuilder.append(" must call proceed() exactly once");
                throw new IllegalStateException(stringBuilder.toString());
            }
            g g3 = new g(this.a, g2, c2, c3, 1 + this.e, y2, this.g, this.h, this.i, this.j, this.k);
            t t2 = (t)this.a.get(this.e);
            a0 a02 = t2.a((t.a)g3);
            if (c2 != null && 1 + this.e < this.a.size() && g3.l != 1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("network interceptor ");
                stringBuilder.append((Object)t2);
                stringBuilder.append(" must call proceed() exactly once");
                throw new IllegalStateException(stringBuilder.toString());
            }
            if (a02 != null) {
                if (a02.a() != null) {
                    return a02;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("interceptor ");
                stringBuilder.append((Object)t2);
                stringBuilder.append(" returned a response with no body");
                throw new IllegalStateException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("interceptor ");
            stringBuilder.append((Object)t2);
            stringBuilder.append(" returned null");
            throw new NullPointerException(stringBuilder.toString());
        }
        throw new AssertionError();
    }

    public int b() {
        return this.j;
    }

    public int c() {
        return this.k;
    }

    public y d() {
        return this.f;
    }

    public e e() {
        return this.g;
    }

    public i f() {
        return this.d;
    }

    public p g() {
        return this.h;
    }

    public c h() {
        return this.c;
    }

    public j.f0.f.g i() {
        return this.b;
    }
}

