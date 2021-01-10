/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.io.InputStream
 *  java.lang.AssertionError
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 *  k.f
 *  k.n$a
 *  k.s
 *  k.t
 */
package k;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import k.c;
import k.e;
import k.f;
import k.n;
import k.s;
import k.t;

final class n
implements e {
    public final c b = new c();
    public final s c;
    boolean d;

    n(s s2) {
        if (s2 != null) {
            this.c = s2;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override
    public long a(byte by) {
        return this.a(by, 0L, Long.MAX_VALUE);
    }

    public long a(byte by, long l2, long l3) {
        IllegalStateException illegalStateException;
        if (!this.d) {
            if (l2 >= 0L && l3 >= l2) {
                while (l2 < l3) {
                    long l4 = this.b.a(by, l2, l3);
                    if (l4 != -1L) {
                        return l4;
                    }
                    c c2 = this.b;
                    long l5 = c2.c;
                    if (l5 >= l3) break;
                    if (this.c.a(c2, 8192L) == -1L) {
                        return -1L;
                    }
                    l2 = Math.max((long)l2, (long)l5);
                }
                return -1L;
            }
            Object[] arrobject = new Object[]{l2, l3};
            throw new IllegalArgumentException(String.format((String)"fromIndex=%s toIndex=%s", (Object[])arrobject));
        }
        illegalStateException = new IllegalStateException("closed");
        throw illegalStateException;
    }

    public long a(c c2, long l2) {
        if (c2 != null) {
            if (l2 >= 0L) {
                if (!this.d) {
                    c c3 = this.b;
                    if (c3.c == 0L && this.c.a(c3, 8192L) == -1L) {
                        return -1L;
                    }
                    long l3 = Math.min((long)l2, (long)this.b.c);
                    return this.b.a(c2, l3);
                }
                throw new IllegalStateException("closed");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(l2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override
    public String a(Charset charset) {
        if (charset != null) {
            this.b.a(this.c);
            return this.b.a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override
    public f a(long l2) {
        this.d(l2);
        return this.b.a(l2);
    }

    @Override
    public boolean a(long l2, f f2) {
        return this.a(l2, f2, 0, f2.e());
    }

    public boolean a(long l2, f f2, int n2, int n3) {
        IllegalStateException illegalStateException;
        if (!this.d) {
            if (l2 >= 0L && n2 >= 0 && n3 >= 0) {
                if (f2.e() - n2 < n3) {
                    return false;
                }
                for (int i2 = 0; i2 < n3; ++i2) {
                    long l3 = l2 + (long)i2;
                    if (!this.e(1L + l3)) {
                        return false;
                    }
                    if (this.b.f(l3) == f2.a(n2 + i2)) continue;
                    return false;
                }
                return true;
            }
            return false;
        }
        illegalStateException = new IllegalStateException("closed");
        throw illegalStateException;
    }

    @Override
    public byte[] b(long l2) {
        this.d(l2);
        return this.b.b(l2);
    }

    @Override
    public String c(long l2) {
        if (l2 >= 0L) {
            long l3 = l2 == Long.MAX_VALUE ? Long.MAX_VALUE : l2 + 1L;
            long l4 = this.a((byte)10, 0L, l3);
            if (l4 != -1L) {
                return this.b.h(l4);
            }
            if (l3 < Long.MAX_VALUE && this.e(l3) && this.b.f(l3 - 1L) == 13 && this.e(1L + l3) && this.b.f(l3) == 10) {
                return this.b.h(l3);
            }
            c c2 = new c();
            c c3 = this.b;
            c3.a(c2, 0L, Math.min((long)32L, (long)c3.p()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\\n not found: limit=");
            stringBuilder.append(Math.min((long)this.b.p(), (long)l2));
            stringBuilder.append(" content=");
            stringBuilder.append(c2.n().b());
            stringBuilder.append('\u2026');
            throw new EOFException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("limit < 0: ");
        stringBuilder.append(l2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public c c() {
        return this.b;
    }

    public void close() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.close();
        this.b.a();
    }

    public t d() {
        return this.c.d();
    }

    @Override
    public void d(long l2) {
        if (this.e(l2)) {
            return;
        }
        throw new EOFException();
    }

    @Override
    public InputStream e() {
        return new a(this);
    }

    public boolean e(long l2) {
        IllegalArgumentException illegalArgumentException;
        if (l2 >= 0L) {
            if (!this.d) {
                block3 : {
                    c c2;
                    do {
                        c2 = this.b;
                        if (c2.c >= l2) break block3;
                    } while (this.c.a(c2, 8192L) != -1L);
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("closed");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount < 0: ");
        stringBuilder.append(l2);
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    @Override
    public String f() {
        return this.c(Long.MAX_VALUE);
    }

    @Override
    public byte[] g() {
        this.b.a(this.c);
        return this.b.g();
    }

    @Override
    public int h() {
        this.d(4L);
        return this.b.h();
    }

    @Override
    public boolean i() {
        if (!this.d) {
            return this.b.i() && this.c.a(this.b, 8192L) == -1L;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return true ^ this.d;
    }

    @Override
    public short j() {
        this.d(2L);
        return this.b.j();
    }

    @Override
    public long k() {
        int n2;
        this.d(1L);
        int n3 = 0;
        while (this.e(n2 = n3 + 1)) {
            byte by = this.b.f(n3);
            if (by >= 48 && by <= 57 || by >= 97 && by <= 102 || by >= 65 && by <= 70) {
                n3 = n2;
                continue;
            }
            if (n3 != 0) break;
            Object[] arrobject = new Object[]{by};
            throw new NumberFormatException(String.format((String)"Expected leading [0-9a-fA-F] character but was %#x", (Object[])arrobject));
        }
        return this.b.k();
    }

    public int read(ByteBuffer byteBuffer) {
        c c2 = this.b;
        if (c2.c == 0L && this.c.a(c2, 8192L) == -1L) {
            return -1;
        }
        return this.b.read(byteBuffer);
    }

    @Override
    public byte readByte() {
        this.d(1L);
        return this.b.readByte();
    }

    @Override
    public void readFully(byte[] arrby) {
        try {
            this.d(arrby.length);
        }
        catch (EOFException eOFException) {
            block3 : {
                int n2 = 0;
                do {
                    c c2 = this.b;
                    long l2 = c2.c;
                    if (l2 <= 0L) break block3;
                    int n3 = c2.a(arrby, n2, (int)l2);
                    if (n3 == -1) break;
                    n2 += n3;
                } while (true);
                throw new AssertionError();
            }
            throw eOFException;
        }
        this.b.readFully(arrby);
    }

    @Override
    public int readInt() {
        this.d(4L);
        return this.b.readInt();
    }

    @Override
    public short readShort() {
        this.d(2L);
        return this.b.readShort();
    }

    @Override
    public void skip(long l2) {
        IllegalStateException illegalStateException;
        if (!this.d) {
            while (l2 > 0L) {
                c c2 = this.b;
                if (c2.c == 0L && this.c.a(c2, 8192L) == -1L) {
                    throw new EOFException();
                }
                long l3 = Math.min((long)l2, (long)this.b.p());
                this.b.skip(l3);
                l2 -= l3;
            }
            return;
        }
        illegalStateException = new IllegalStateException("closed");
        throw illegalStateException;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("buffer(");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

