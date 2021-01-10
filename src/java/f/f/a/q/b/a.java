/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.io.InputStream
 *  java.lang.AssertionError
 *  java.lang.Cloneable
 *  java.lang.IllegalAccessError
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.ByteBuffer
 *  java.nio.channels.ByteChannel
 *  java.nio.charset.Charset
 */
package f.f.a.q.b;

import f.f.a.q.b.a;
import f.f.a.q.b.b;
import f.f.a.q.b.c;
import f.f.a.q.b.d;
import f.f.a.q.b.e;
import f.f.a.q.b.f;
import f.f.a.q.b.g;
import f.f.a.q.b.j;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class a
implements c,
b,
Cloneable,
ByteChannel {
    private static final byte[] d = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    e b;
    long c;

    public final byte a(long l2) {
        int n2;
        int n3;
        j.a(this.c, l2, 1L);
        long l3 = this.c;
        if (l3 - l2 > l2) {
            e e2 = this.b;
            do {
                int n4;
                int n5;
                long l4;
                if (l2 < (l4 = (long)((n4 = e2.c) - (n5 = e2.b)))) {
                    return e2.a[n5 + (int)l2];
                }
                l2 -= l4;
                e2 = e2.f;
            } while (true);
        }
        long l5 = l2 - l3;
        e e3 = this.b;
        do {
            e3 = e3.g;
        } while ((l5 += (long)((n2 = e3.c) - (n3 = e3.b))) < 0L);
        return e3.a[n3 + (int)l5];
    }

    public int a(byte[] arrby, int n2, int n3) {
        j.a(arrby.length, n2, n3);
        e e2 = this.b;
        if (e2 == null) {
            return -1;
        }
        int n4 = Math.min((int)n3, (int)(e2.c - e2.b));
        System.arraycopy((Object)e2.a, (int)e2.b, (Object)arrby, (int)n2, (int)n4);
        e2.b = n4 + e2.b;
        this.c -= (long)n4;
        if (e2.b == e2.c) {
            this.b = e2.a();
            f.a(e2);
        }
        return n4;
    }

    public a a(String string) {
        this.a(string, 0, string.length());
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public a a(String string, int n2, int n3) {
        if (string == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("string == null");
            throw illegalArgumentException;
        }
        if (n2 < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("beginIndex < 0: ");
            stringBuilder.append(n2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (n3 < n2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("endIndex < beginIndex: ");
            stringBuilder.append(n3);
            stringBuilder.append(" < ");
            stringBuilder.append(n2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (n3 > string.length()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("endIndex > string.length: ");
            stringBuilder.append(n3);
            stringBuilder.append(" > ");
            stringBuilder.append(string.length());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        while (n2 < n3) {
            int n4;
            e e2;
            int n5;
            int n6;
            char c2;
            char c3 = string.charAt(n2);
            if (c3 < '') {
                e2 = this.b(1);
                byte[] arrby = e2.a;
                n4 = e2.c - n2;
                n5 = Math.min((int)n3, (int)(8192 - n4));
                n6 = n2 + 1;
                arrby[n2 + n4] = (byte)c3;
            } else {
                int n7;
                if (c3 < '\u0800') {
                    n7 = 192 | c3 >> 6;
                } else {
                    if (c3 >= '\ud800' && c3 <= '\udfff') {
                        int n8 = n2 + 1;
                        char c4 = n8 < n3 ? string.charAt(n8) : (char)'\u0000';
                        if (c3 <= '\udbff' && c4 >= '\udc00' && c4 <= '\udfff') {
                            int n9 = 65536 + ((c3 & -55297) << 10 | -56321 & c4);
                            this.c(240 | n9 >> 18);
                            this.c(128 | 63 & n9 >> 12);
                            this.c(128 | 63 & n9 >> 6);
                            this.c(128 | n9 & 63);
                            n2 += 2;
                            continue;
                        }
                        this.c(63);
                        n2 = n8;
                        continue;
                    }
                    this.c(224 | c3 >> 12);
                    n7 = 128 | 63 & c3 >> 6;
                }
                this.c(n7);
                this.c(128 | c3 & 63);
                ++n2;
                continue;
            }
            while (n6 < n5 && (c2 = string.charAt(n6)) < '') {
                int n10 = n6 + 1;
                arrby[n6 + n4] = (byte)c2;
                n6 = n10;
            }
            int n11 = n4 + n6;
            int n12 = e2.c;
            int n13 = n11 - n12;
            e2.c = n12 + n13;
            this.c += (long)n13;
            n2 = n6;
        }
        return this;
    }

    public a a(String string, int n2, int n3, Charset charset) {
        if (string != null) {
            if (n2 >= 0) {
                if (n3 >= n2) {
                    if (n3 <= string.length()) {
                        if (charset != null) {
                            if (charset.equals((Object)j.a)) {
                                this.a(string, n2, n3);
                                return this;
                            }
                            byte[] arrby = string.substring(n2, n3).getBytes(charset);
                            this.b(arrby, 0, arrby.length);
                            return this;
                        }
                        throw new IllegalArgumentException("charset == null");
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("endIndex > string.length: ");
                    stringBuilder.append(n3);
                    stringBuilder.append(" > ");
                    stringBuilder.append(string.length());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("endIndex < beginIndex: ");
                stringBuilder.append(n3);
                stringBuilder.append(" < ");
                stringBuilder.append(n2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("beginIndex < 0: ");
            stringBuilder.append(n2);
            throw new IllegalAccessError(stringBuilder.toString());
        }
        throw new IllegalArgumentException("string == null");
    }

    public final d a(int n2) {
        if (n2 == 0) {
            return d.f;
        }
        return new g((a)this, n2);
    }

    public String a(long l2, Charset charset) {
        j.a(this.c, 0L, l2);
        if (charset != null) {
            if (l2 <= Integer.MAX_VALUE) {
                if (l2 == 0L) {
                    return "";
                }
                e e2 = this.b;
                int n2 = e2.b;
                if (l2 + (long)n2 > (long)e2.c) {
                    return new String(this.b(l2), charset);
                }
                String string = new String(e2.a, n2, (int)l2, charset);
                e2.b = (int)(l2 + (long)e2.b);
                this.c -= l2;
                if (e2.b == e2.c) {
                    this.b = e2.a();
                    f.a(e2);
                }
                return string;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount > Integer.MAX_VALUE: ");
            stringBuilder.append(l2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override
    public String a(Charset charset) {
        try {
            String string = this.a(this.c, charset);
            return string;
        }
        catch (EOFException eOFException) {
            throw new AssertionError((Object)eOFException);
        }
    }

    public void a(byte[] arrby) {
        int n2;
        for (int i2 = 0; i2 < arrby.length; i2 += n2) {
            n2 = this.a(arrby, i2, arrby.length - i2);
            if (n2 != -1) {
                continue;
            }
            throw new EOFException();
        }
    }

    public boolean a() {
        return this.c == 0L;
    }

    @Override
    public boolean a(long l2, d d2) {
        return this.a(l2, d2, 0, d2.b());
    }

    public boolean a(long l2, d d2, int n2, int n3) {
        if (l2 >= 0L && n2 >= 0 && n3 >= 0 && this.c - l2 >= (long)n3) {
            if (d2.b() - n2 < n3) {
                return false;
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                if (this.a(l2 + (long)i2) == d2.a(n2 + i2)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public byte b() {
        long l2 = this.c;
        if (l2 != 0L) {
            e e2 = this.b;
            int n2 = e2.b;
            int n3 = e2.c;
            byte[] arrby = e2.a;
            int n4 = n2 + 1;
            byte by = arrby[n2];
            this.c = l2 - 1L;
            if (n4 == n3) {
                this.b = e2.a();
                f.a(e2);
                return by;
            }
            e2.b = n4;
            return by;
        }
        throw new IllegalStateException("size == 0");
    }

    public a b(byte[] arrby) {
        if (arrby != null) {
            this.b(arrby, 0, arrby.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public a b(byte[] arrby, int n2, int n3) {
        IllegalArgumentException illegalArgumentException;
        if (arrby != null) {
            long l2 = arrby.length;
            long l3 = n2;
            long l4 = n3;
            j.a(l2, l3, l4);
            int n4 = n3 + n2;
            while (n2 < n4) {
                e e2 = this.b(1);
                int n5 = Math.min((int)(n4 - n2), (int)(8192 - e2.c));
                System.arraycopy((Object)arrby, (int)n2, (Object)e2.a, (int)e2.c, (int)n5);
                n2 += n5;
                e2.c = n5 + e2.c;
            }
            this.c = l4 + this.c;
            return this;
        }
        illegalArgumentException = new IllegalArgumentException("source == null");
        throw illegalArgumentException;
    }

    e b(int n2) {
        if (n2 >= 1 && n2 <= 8192) {
            e e2 = this.b;
            if (e2 == null) {
                e e3;
                e3.g = e3 = (this.b = f.a());
                e3.f = e3;
                return e3;
            }
            e e4 = e2.g;
            if (n2 + e4.c <= 8192 && e4.e) {
                return e4;
            }
            e e5 = f.a();
            e4.a(e5);
            return e5;
        }
        throw new IllegalArgumentException();
    }

    public byte[] b(long l2) {
        j.a(this.c, 0L, l2);
        if (l2 <= Integer.MAX_VALUE) {
            byte[] arrby = new byte[(int)l2];
            this.a(arrby);
            return arrby;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount > Integer.MAX_VALUE: ");
        stringBuilder.append(l2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public a c(int n2) {
        e e2 = this.b(1);
        byte[] arrby = e2.a;
        int n3 = e2.c;
        e2.c = n3 + 1;
        arrby[n3] = (byte)n2;
        this.c = 1L + this.c;
        return this;
    }

    public a c(long l2) {
        if (l2 == 0L) {
            this.c(48);
            return this;
        }
        int n2 = 1 + Long.numberOfTrailingZeros((long)Long.highestOneBit((long)l2)) / 4;
        e e2 = this.b(n2);
        byte[] arrby = e2.a;
        int n3 = e2.c;
        for (int i2 = -1 + (n3 + n2); i2 >= n3; --i2) {
            arrby[i2] = d[(int)(15L & l2)];
            l2 >>>= 4;
        }
        e2.c = n2 + e2.c;
        this.c += (long)n2;
        return this;
    }

    public String c() {
        try {
            String string = this.a(this.c, j.a);
            return string;
        }
        catch (EOFException eOFException) {
            throw new AssertionError((Object)eOFException);
        }
    }

    public a clone() {
        e e2;
        a a2 = new a();
        if (this.c == 0L) {
            return a2;
        }
        e2.g = e2 = (a2.b = this.b.b());
        e2.f = e2;
        e e3 = this.b;
        while ((e3 = e3.f) != this.b) {
            a2.b.g.a(e3.b());
        }
        a2.c = this.c;
        return a2;
    }

    public void close() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public a d(int n2) {
        if (n2 >= 128) {
            int n3;
            if (n2 < 2048) {
                n3 = 192 | n2 >> 6;
            } else {
                int n4;
                if (n2 < 65536) {
                    if (n2 >= 55296 && n2 <= 57343) {
                        this.c(63);
                        return this;
                    }
                    n4 = 224 | n2 >> 12;
                } else {
                    if (n2 > 1114111) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected code point: ");
                        stringBuilder.append(Integer.toHexString((int)n2));
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
                        throw illegalArgumentException;
                    }
                    this.c(240 | n2 >> 18);
                    n4 = 128 | 63 & n2 >> 12;
                }
                this.c(n4);
                n3 = 128 | 63 & n2 >> 6;
            }
            this.c(n3);
            n2 = 128 | n2 & 63;
        }
        this.c(n2);
        return this;
    }

    public final d d() {
        long l2 = this.c;
        if (l2 <= Integer.MAX_VALUE) {
            return this.a((int)l2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size > Integer.MAX_VALUE: ");
        stringBuilder.append(this.c);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public InputStream e() {
        return new InputStream(this){
            final /* synthetic */ a b;
            {
                this.b = a2;
            }

            public int available() {
                return (int)Math.min((long)this.b.c, (long)Integer.MAX_VALUE);
            }

            public void close() {
            }

            public int read() {
                a a2 = this.b;
                if (a2.c > 0L) {
                    return 255 & a2.b();
                }
                return -1;
            }

            public int read(byte[] arrby, int n2, int n3) {
                return this.b.a(arrby, n2, n3);
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)this.b);
                stringBuilder.append(".inputStream()");
                return stringBuilder.toString();
            }
        };
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        long l2 = this.c;
        if (l2 != a2.c) {
            return false;
        }
        long l3 = 0L;
        if (l2 == l3) {
            return true;
        }
        e e2 = this.b;
        e e3 = a2.b;
        int n2 = e2.b;
        int n3 = e3.b;
        while (l3 < this.c) {
            long l4 = Math.min((int)(e2.c - n2), (int)(e3.c - n3));
            int n4 = n3;
            int n5 = n2;
            int n6 = 0;
            while ((long)n6 < l4) {
                byte[] arrby = e2.a;
                int n7 = n5 + 1;
                byte by = arrby[n5];
                byte[] arrby2 = e3.a;
                int n8 = n4 + 1;
                if (by != arrby2[n4]) {
                    return false;
                }
                ++n6;
                n5 = n7;
                n4 = n8;
            }
            if (n5 == e2.c) {
                e2 = e2.f;
                n2 = e2.b;
            } else {
                n2 = n5;
            }
            if (n4 == e3.c) {
                e3 = e3.f;
                n3 = e3.b;
            } else {
                n3 = n4;
            }
            l3 += l4;
        }
        return true;
    }

    public void flush() {
    }

    public int hashCode() {
        e e2 = this.b;
        if (e2 == null) {
            return 0;
        }
        int n2 = 1;
        do {
            int n3 = e2.c;
            for (int i2 = e2.b; i2 < n3; ++i2) {
                n2 = n2 * 31 + e2.a[i2];
            }
        } while ((e2 = e2.f) != this.b);
        return n2;
    }

    public boolean isOpen() {
        return true;
    }

    public int read(ByteBuffer byteBuffer) {
        e e2 = this.b;
        if (e2 == null) {
            return -1;
        }
        int n2 = Math.min((int)byteBuffer.remaining(), (int)(e2.c - e2.b));
        byteBuffer.put(e2.a, e2.b, n2);
        e2.b = n2 + e2.b;
        this.c -= (long)n2;
        if (e2.b == e2.c) {
            this.b = e2.a();
            f.a(e2);
        }
        return n2;
    }

    @Override
    public void skip(long l2) {
        while (l2 > 0L) {
            e e2 = this.b;
            if (e2 != null) {
                int n2 = (int)Math.min((long)l2, (long)(e2.c - e2.b));
                long l3 = this.c;
                long l4 = n2;
                this.c = l3 - l4;
                l2 -= l4;
                e e3 = this.b;
                e3.b = n2 + e3.b;
                if (e3.b != e3.c) continue;
                this.b = e3.a();
                f.a(e3);
                continue;
            }
            throw new EOFException();
        }
    }

    public String toString() {
        return this.d().toString();
    }

    public int write(ByteBuffer byteBuffer) {
        IllegalArgumentException illegalArgumentException;
        if (byteBuffer != null) {
            int n2;
            int n3;
            for (int i2 = n3 = byteBuffer.remaining(); i2 > 0; i2 -= n2) {
                e e2 = this.b(1);
                n2 = Math.min((int)i2, (int)(8192 - e2.c));
                byteBuffer.get(e2.a, e2.c, n2);
                e2.c = n2 + e2.c;
            }
            this.c += (long)n3;
            return n3;
        }
        illegalArgumentException = new IllegalArgumentException("source == null");
        throw illegalArgumentException;
    }
}

