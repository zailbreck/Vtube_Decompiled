/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.zip.CRC32
 *  java.util.zip.Inflater
 *  k.l
 *  k.o
 *  k.s
 *  k.t
 */
package k;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import k.c;
import k.e;
import k.k;
import k.l;
import k.o;
import k.s;
import k.t;

public final class j
implements s {
    private int b = 0;
    private final e c;
    private final Inflater d;
    private final k e;
    private final CRC32 f = new CRC32();

    public j(s s2) {
        if (s2 != null) {
            this.d = new Inflater(true);
            this.c = l.a((s)s2);
            this.e = new k(this.c, this.d);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void a() {
        this.c.d(10L);
        byte by = this.c.c().f(3L);
        boolean bl = (1 & by >> 1) == 1;
        if (bl) {
            this.a(this.c.c(), 0L, 10L);
        }
        this.a("ID1ID2", 8075, this.c.readShort());
        this.c.skip(8L);
        if ((1 & by >> 2) == 1) {
            this.c.d(2L);
            if (bl) {
                this.a(this.c.c(), 0L, 2L);
            }
            short s2 = this.c.c().j();
            e e2 = this.c;
            long l2 = s2;
            e2.d(l2);
            if (bl) {
                this.a(this.c.c(), 0L, l2);
            }
            this.c.skip(l2);
        }
        if ((1 & by >> 3) == 1) {
            long l3 = this.c.a((byte)0);
            if (l3 != -1L) {
                if (bl) {
                    this.a(this.c.c(), 0L, l3 + 1L);
                }
                this.c.skip(l3 + 1L);
            } else {
                throw new EOFException();
            }
        }
        if ((1 & by >> 4) == 1) {
            long l4 = this.c.a((byte)0);
            if (l4 != -1L) {
                if (bl) {
                    this.a(this.c.c(), 0L, l4 + 1L);
                }
                this.c.skip(l4 + 1L);
            } else {
                throw new EOFException();
            }
        }
        if (bl) {
            this.a("FHCRC", this.c.j(), (short)this.f.getValue());
            this.f.reset();
        }
    }

    private void a(String string, int n2, int n3) {
        if (n3 == n2) {
            return;
        }
        Object[] arrobject = new Object[]{string, n3, n2};
        throw new IOException(String.format((String)"%s: actual 0x%08x != expected 0x%08x", (Object[])arrobject));
    }

    private void a(c c2, long l2, long l3) {
        int n2;
        int n3;
        o o2 = c2.b;
        while (l2 >= (long)((n2 = o2.c) - (n3 = o2.b))) {
            l2 -= (long)(n2 - n3);
            o2 = o2.f;
        }
        while (l3 > 0L) {
            int n4 = (int)(l2 + (long)o2.b);
            int n5 = (int)Math.min((long)(o2.c - n4), (long)l3);
            this.f.update(o2.a, n4, n5);
            l3 -= (long)n5;
            o2 = o2.f;
            l2 = 0L;
        }
    }

    private void b() {
        this.a("CRC", this.c.h(), (int)this.f.getValue());
        this.a("ISIZE", this.c.h(), (int)this.d.getBytesWritten());
    }

    public long a(c c2, long l2) {
        if (l2 >= 0L) {
            if (l2 == 0L) {
                return 0L;
            }
            if (this.b == 0) {
                j.super.a();
                this.b = 1;
            }
            if (this.b == 1) {
                long l3 = c2.c;
                long l4 = this.e.a(c2, l2);
                if (l4 != -1L) {
                    j.super.a(c2, l3, l4);
                    return l4;
                }
                this.b = 2;
            }
            if (this.b == 2) {
                j.super.b();
                this.b = 3;
                if (this.c.i()) {
                    return -1L;
                }
                throw new IOException("gzip finished without exhausting source");
            }
            return -1L;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount < 0: ");
        stringBuilder.append(l2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void close() {
        this.e.close();
    }

    public t d() {
        return this.c.d();
    }
}

