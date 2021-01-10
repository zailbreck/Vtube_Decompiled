/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.a0
 *  j.a0$a
 *  j.b0
 *  j.e
 *  j.f0.c
 *  j.f0.f.g
 *  j.f0.g.c
 *  j.f0.g.f
 *  j.i
 *  j.p
 *  j.q
 *  j.t
 *  j.t$a
 *  j.y
 *  j.z
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.net.ProtocolException
 *  k.l
 *  k.r
 */
package j.f0.g;

import j.a0;
import j.b0;
import j.e;
import j.f0.g.c;
import j.f0.g.f;
import j.f0.g.g;
import j.i;
import j.p;
import j.q;
import j.t;
import j.y;
import j.z;
import java.net.ProtocolException;
import k.d;
import k.l;
import k.r;

public final class b
implements t {
    private final boolean a;

    public b(boolean bl) {
        this.a = bl;
    }

    public a0 a(t.a a2) {
        a0.a a3;
        b0 b02;
        g g2 = (g)a2;
        c c2 = g2.h();
        j.f0.f.g g3 = g2.i();
        j.f0.f.c c3 = (j.f0.f.c)g2.f();
        y y2 = g2.d();
        long l2 = System.currentTimeMillis();
        g2.g().d(g2.e());
        c2.a(y2);
        g2.g().a(g2.e(), y2);
        boolean bl = f.b((String)y2.e());
        a0.a a4 = null;
        if (bl) {
            z z2 = y2.a();
            a4 = null;
            if (z2 != null) {
                boolean bl2 = "100-continue".equalsIgnoreCase(y2.a("Expect"));
                a4 = null;
                if (bl2) {
                    c2.b();
                    g2.g().f(g2.e());
                    a4 = c2.a(true);
                }
                if (a4 == null) {
                    g2.g().c(g2.e());
                    a a5 = new a(c2.a(y2, y2.a().a()));
                    d d2 = l.a((r)a5);
                    y2.a().a(d2);
                    d2.close();
                    g2.g().a(g2.e(), a5.c);
                } else if (!c3.b()) {
                    g3.d();
                }
            }
        }
        c2.a();
        if (a4 == null) {
            g2.g().f(g2.e());
            a4 = c2.a(false);
        }
        a4.a(y2);
        a4.a(g3.b().a());
        a4.b(l2);
        a4.a(System.currentTimeMillis());
        a0 a02 = a4.a();
        int n2 = a02.m();
        if (n2 == 100) {
            a0.a a6 = c2.a(false);
            a6.a(y2);
            a6.a(g3.b().a());
            a6.b(l2);
            a6.a(System.currentTimeMillis());
            a02 = a6.a();
            n2 = a02.m();
        }
        g2.g().a(g2.e(), a02);
        if (this.a && n2 == 101) {
            a3 = a02.p();
            b02 = j.f0.c.c;
        } else {
            a3 = a02.p();
            b02 = c2.a(a02);
        }
        a3.a(b02);
        a0 a03 = a3.a();
        if ("close".equalsIgnoreCase(a03.s().a("Connection")) || "close".equalsIgnoreCase(a03.b("Connection"))) {
            g3.d();
        }
        if (n2 != 204 && n2 != 205 || a03.a().m() <= 0L) {
            return a03;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HTTP ");
        stringBuilder.append(n2);
        stringBuilder.append(" had non-zero Content-Length: ");
        stringBuilder.append(a03.a().m());
        throw new ProtocolException(stringBuilder.toString());
    }

    static final class a
    extends k.g {
        long c;

        a(r r2) {
            super(r2);
        }

        @Override
        public void b(k.c c2, long l2) {
            super.b(c2, l2);
            this.c = l2 + this.c;
        }
    }

}

