/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.f.a.q.b.a
 *  java.io.Closeable
 *  java.io.InputStream
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 */
package f.f.a.q.a;

import f.f.a.q.a.i;
import f.f.a.q.a.o;
import f.f.a.q.a.r.b;
import f.f.a.q.b.c;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

public abstract class o
implements Closeable {
    public static o a(i i2, long l2, c c2) {
        if (c2 != null) {
            return new o(i2, l2, c2){
                final /* synthetic */ i b;
                final /* synthetic */ long c;
                final /* synthetic */ c d;
                {
                    this.b = i2;
                    this.c = l2;
                    this.d = c2;
                }

                public long b() {
                    return this.c;
                }

                public i m() {
                    return this.b;
                }

                public c n() {
                    return this.d;
                }
            };
        }
        throw new NullPointerException("source == null");
    }

    public static o a(i i2, byte[] arrby) {
        f.f.a.q.b.a a2 = new f.f.a.q.b.a();
        a2.b(arrby);
        return o.a(i2, arrby.length, (c)a2);
    }

    private Charset p() {
        i i2 = this.m();
        if (i2 != null) {
            return i2.a(b.j);
        }
        return b.j;
    }

    public final InputStream a() {
        return this.n().e();
    }

    public abstract long b();

    public void close() {
        b.a(this.n());
    }

    public abstract i m();

    public abstract c n();

    public final String o() {
        c c2 = this.n();
        try {
            String string2 = c2.a(b.a(c2, this.p()));
            return string2;
        }
        finally {
            b.a(c2);
        }
    }
}

