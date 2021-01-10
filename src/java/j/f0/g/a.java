/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.a0
 *  j.a0$a
 *  j.b0
 *  j.f0.c
 *  j.f0.d
 *  j.f0.g.e
 *  j.l
 *  j.m
 *  j.r
 *  j.r$a
 *  j.s
 *  j.t
 *  j.t$a
 *  j.u
 *  j.y
 *  j.y$a
 *  j.z
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  k.l
 *  k.s
 */
package j.f0.g;

import j.a0;
import j.b0;
import j.f0.c;
import j.f0.d;
import j.f0.g.e;
import j.f0.g.h;
import j.l;
import j.m;
import j.r;
import j.s;
import j.t;
import j.u;
import j.y;
import j.z;
import java.util.List;
import k.j;

public final class a
implements t {
    private final m a;

    public a(m m2) {
        this.a = m2;
    }

    private String a(List<l> list) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 > 0) {
                stringBuilder.append("; ");
            }
            l l2 = (l)list.get(i2);
            stringBuilder.append(l2.a());
            stringBuilder.append('=');
            stringBuilder.append(l2.b());
        }
        return stringBuilder.toString();
    }

    public a0 a(t.a a2) {
        List list;
        y y2 = a2.d();
        y.a a3 = y2.f();
        z z2 = y2.a();
        if (z2 != null) {
            long l2;
            u u2 = z2.b();
            if (u2 != null) {
                a3.b("Content-Type", u2.toString());
            }
            if ((l2 = z2.a()) != -1L) {
                a3.b("Content-Length", Long.toString((long)l2));
                a3.a("Transfer-Encoding");
            } else {
                a3.b("Transfer-Encoding", "chunked");
                a3.a("Content-Length");
            }
        }
        if (y2.a("Host") == null) {
            a3.b("Host", c.a((s)y2.g(), (boolean)false));
        }
        if (y2.a("Connection") == null) {
            a3.b("Connection", "Keep-Alive");
        }
        String string = y2.a("Accept-Encoding");
        boolean bl = false;
        if (string == null) {
            String string2 = y2.a("Range");
            bl = false;
            if (string2 == null) {
                bl = true;
                a3.b("Accept-Encoding", "gzip");
            }
        }
        if (!(list = this.a.a(y2.g())).isEmpty()) {
            a3.b("Cookie", a.super.a((List<l>)list));
        }
        if (y2.a("User-Agent") == null) {
            a3.b("User-Agent", d.a());
        }
        a0 a02 = a2.a(a3.a());
        e.a((m)this.a, (s)y2.g(), (r)a02.o());
        a0.a a4 = a02.p();
        a4.a(y2);
        if (bl && "gzip".equalsIgnoreCase(a02.b("Content-Encoding")) && e.b((a0)a02)) {
            j j2 = new j(a02.a().o());
            r.a a5 = a02.o().a();
            a5.b("Content-Encoding");
            a5.b("Content-Length");
            a4.a(a5.a());
            a4.a((b0)new h(a02.b("Content-Type"), -1L, k.l.a((k.s)j2)));
        }
        return a4.a();
    }
}

