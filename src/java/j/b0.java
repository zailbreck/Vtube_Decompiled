/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 */
package j;

import j.b0;
import j.f0.c;
import j.u;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import k.e;

public abstract class b0
implements Closeable {
    public static b0 a(u u2, long l2, e e2) {
        if (e2 != null) {
            return new b0(u2, l2, e2){
                final /* synthetic */ u b;
                final /* synthetic */ long c;
                final /* synthetic */ e d;
                {
                    this.b = u2;
                    this.c = l2;
                    this.d = e2;
                }

                public long m() {
                    return this.c;
                }

                public u n() {
                    return this.b;
                }

                public e o() {
                    return this.d;
                }
            };
        }
        throw new NullPointerException("source == null");
    }

    public static b0 a(u u2, byte[] arrby) {
        k.c c2 = new k.c();
        c2.write(arrby);
        return b0.a(u2, arrby.length, c2);
    }

    private Charset q() {
        u u2 = this.n();
        if (u2 != null) {
            return u2.a(c.j);
        }
        return c.j;
    }

    public final InputStream a() {
        return this.o().e();
    }

    public final byte[] b() {
        long l2 = this.m();
        if (l2 <= Integer.MAX_VALUE) {
            byte[] arrby;
            e e2;
            block5 : {
                e2 = this.o();
                arrby = e2.g();
                if (l2 == -1L) break block5;
                if (l2 == (long)arrby.length) {
                    return arrby;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Content-Length (");
                stringBuilder.append(l2);
                stringBuilder.append(") and stream length (");
                stringBuilder.append(arrby.length);
                stringBuilder.append(") disagree");
                throw new IOException(stringBuilder.toString());
            }
            return arrby;
            finally {
                c.a(e2);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot buffer entire body for content length: ");
        stringBuilder.append(l2);
        throw new IOException(stringBuilder.toString());
    }

    public void close() {
        c.a(this.o());
    }

    public abstract long m();

    public abstract u n();

    public abstract e o();

    public final String p() {
        e e2 = this.o();
        try {
            String string2 = e2.a(c.a(e2, this.q()));
            return string2;
        }
        finally {
            c.a(e2);
        }
    }
}

