/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.a.a.a.a.g.b
 *  f.a.a.a.a.k.d
 *  f.a.a.a.a.l.b
 *  j.u
 *  j.z
 *  java.io.InputStream
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  k.c
 *  k.d
 *  k.l
 *  k.s
 */
package f.a.a.a.a.l;

import f.a.a.a.a.l.b;
import j.u;
import j.z;
import java.io.InputStream;
import k.c;
import k.d;
import k.l;
import k.s;

public class e<T extends f.a.a.a.a.k.d>
extends z {
    private InputStream a;
    private String b;
    private long c;
    private f.a.a.a.a.g.b d;
    private T e;

    public e(InputStream inputStream, long l2, String string, b b2) {
        this.a = inputStream;
        this.b = string;
        this.c = l2;
        this.d = b2.e();
        this.e = b2.f();
    }

    public long a() {
        return this.c;
    }

    public void a(d d2) {
        long l2;
        s s2 = l.a((InputStream)this.a);
        long l3 = 0L;
        while (l3 < (l2 = this.c)) {
            long l4 = Math.min((long)(l2 - l3), (long)2048L);
            long l5 = s2.a(d2.c(), l4);
            if (l5 == -1L) break;
            d2.flush();
            f.a.a.a.a.g.b b2 = this.d;
            if (b2 == null || (l3 += l5) == 0L) continue;
            T t2 = this.e;
            long l6 = this.c;
            b2.a(t2, l3, l6);
        }
        if (s2 != null) {
            s2.close();
        }
    }

    public u b() {
        return u.b((String)this.b);
    }
}

