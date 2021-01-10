/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.a0
 *  j.a0$a
 *  j.b0
 *  j.e
 *  j.f0.a
 *  j.f0.c
 *  j.f0.f.g
 *  j.f0.g.c
 *  j.f0.g.e
 *  j.f0.g.i
 *  j.f0.g.k
 *  j.f0.i.c
 *  j.f0.i.g
 *  j.f0.i.i
 *  j.p
 *  j.r
 *  j.r$a
 *  j.s
 *  j.t
 *  j.t$a
 *  j.w
 *  j.y
 *  j.z
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.ProtocolException
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Locale
 *  java.util.concurrent.TimeUnit
 *  k.f
 *  k.l
 *  k.r
 *  k.s
 *  k.t
 */
package j.f0.i;

import j.a0;
import j.b0;
import j.e;
import j.f0.c;
import j.f0.g.k;
import j.f0.i.g;
import j.f0.i.i;
import j.p;
import j.r;
import j.s;
import j.t;
import j.v;
import j.w;
import j.y;
import j.z;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k.h;
import k.l;

public final class f
implements j.f0.g.c {
    private static final k.f f = k.f.c((String)"connection");
    private static final k.f g = k.f.c((String)"host");
    private static final k.f h = k.f.c((String)"keep-alive");
    private static final k.f i = k.f.c((String)"proxy-connection");
    private static final k.f j = k.f.c((String)"transfer-encoding");
    private static final k.f k = k.f.c((String)"te");
    private static final k.f l = k.f.c((String)"encoding");
    private static final k.f m = k.f.c((String)"upgrade");
    private static final List<k.f> n;
    private static final List<k.f> o;
    private final t.a a;
    final j.f0.f.g b;
    private final g c;
    private i d;
    private final w e;

    static {
        Object[] arrobject = new k.f[]{f, g, h, i, k, j, l, m, j.f0.i.c.f, j.f0.i.c.g, j.f0.i.c.h, j.f0.i.c.i};
        n = c.a((Object[])arrobject);
        Object[] arrobject2 = new k.f[]{f, g, h, i, k, j, l, m};
        o = c.a((Object[])arrobject2);
    }

    public f(v v2, t.a a2, j.f0.f.g g2, g g3) {
        this.a = a2;
        this.b = g2;
        this.c = g3;
        w w2 = v2.s().contains((Object)w.g) ? w.g : w.f;
        this.e = w2;
    }

    public static a0.a a(List<j.f0.i.c> list, w w2) {
        ProtocolException protocolException;
        r.a a2 = new r.a();
        int n2 = list.size();
        r.a a3 = a2;
        k k2 = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            j.f0.i.c c2 = (j.f0.i.c)list.get(i2);
            if (c2 == null) {
                if (k2 == null || k2.b != 100) continue;
                a3 = new r.a();
                k2 = null;
                continue;
            }
            k.f f2 = c2.a;
            String string = c2.b.h();
            if (f2.equals((Object)j.f0.i.c.e)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("HTTP/1.1 ");
                stringBuilder.append(string);
                k2 = k.a((String)stringBuilder.toString());
                continue;
            }
            if (o.contains((Object)f2)) continue;
            j.f0.a.a.a(a3, f2.h(), string);
        }
        if (k2 != null) {
            a0.a a4 = new a0.a();
            a4.a(w2);
            a4.a(k2.b);
            a4.a(k2.c);
            a4.a(a3.a());
            return a4;
        }
        protocolException = new ProtocolException("Expected ':status' header not present");
        throw protocolException;
    }

    public static List<j.f0.i.c> b(y y2) {
        r r2 = y2.c();
        ArrayList arrayList = new ArrayList(4 + r2.b());
        arrayList.add((Object)new j.f0.i.c(j.f0.i.c.f, y2.e()));
        arrayList.add((Object)new j.f0.i.c(j.f0.i.c.g, j.f0.g.i.a((s)y2.g())));
        String string = y2.a("Host");
        if (string != null) {
            arrayList.add((Object)new j.f0.i.c(j.f0.i.c.i, string));
        }
        arrayList.add((Object)new j.f0.i.c(j.f0.i.c.h, y2.g().m()));
        int n2 = r2.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            k.f f2 = k.f.c((String)r2.a(i2).toLowerCase(Locale.US));
            if (n.contains((Object)f2)) continue;
            arrayList.add((Object)new j.f0.i.c(f2, r2.b(i2)));
        }
        return arrayList;
    }

    public a0.a a(boolean bl) {
        a0.a a2 = f.a((List<j.f0.i.c>)this.d.j(), this.e);
        if (bl && j.f0.a.a.a(a2) == 100) {
            return null;
        }
        return a2;
    }

    public b0 a(a0 a02) {
        j.f0.f.g g2 = this.b;
        g2.f.e(g2.e);
        return new j.f0.g.h(a02.b("Content-Type"), j.f0.g.e.a((a0)a02), l.a((k.s)(f)this.new a(this.d.e())));
    }

    public k.r a(y y2, long l2) {
        return this.d.d();
    }

    public void a() {
        this.d.d().close();
    }

    public void a(y y2) {
        if (this.d != null) {
            return;
        }
        boolean bl = y2.a() != null;
        List<j.f0.i.c> list = f.b(y2);
        this.d = this.c.a(list, bl);
        this.d.h().a((long)this.a.b(), TimeUnit.MILLISECONDS);
        this.d.l().a((long)this.a.c(), TimeUnit.MILLISECONDS);
    }

    public void b() {
        this.c.flush();
    }

    class a
    extends h {
        boolean c;
        long d;

        a(k.s s2) {
            super(s2);
            this.c = false;
            this.d = 0L;
        }

        private void a(IOException iOException) {
            if (this.c) {
                return;
            }
            this.c = true;
            f f2 = f.this;
            f2.b.a(false, (j.f0.g.c)f2, this.d, iOException);
        }

        @Override
        public long a(k.c c2, long l2) {
            long l3;
            block3 : {
                try {
                    l3 = this.a().a(c2, l2);
                    if (l3 <= 0L) break block3;
                }
                catch (IOException iOException) {
                    a.super.a(iOException);
                    throw iOException;
                }
                this.d = l3 + this.d;
            }
            return l3;
        }

        @Override
        public void close() {
            super.close();
            this.a(null);
        }
    }

}

