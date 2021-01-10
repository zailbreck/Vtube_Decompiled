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
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.ByteBuffer
 *  java.nio.channels.ByteChannel
 *  java.nio.charset.Charset
 *  k.c$a
 *  k.f
 *  k.o
 *  k.p
 *  k.s
 *  k.t
 *  k.u
 */
package k;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import k.c;
import k.d;
import k.e;
import k.f;
import k.o;
import k.p;
import k.q;
import k.s;
import k.t;
import k.u;

public final class c
implements e,
d,
Cloneable,
ByteChannel {
    private static final byte[] d = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    o b;
    long c;

    public int a(byte[] arrby, int n2, int n3) {
        u.a((long)arrby.length, (long)n2, (long)n3);
        o o2 = this.b;
        if (o2 == null) {
            return -1;
        }
        int n4 = Math.min((int)n3, (int)(o2.c - o2.b));
        System.arraycopy((Object)o2.a, (int)o2.b, (Object)arrby, (int)n2, (int)n4);
        o2.b = n4 + o2.b;
        this.c -= (long)n4;
        if (o2.b == o2.c) {
            this.b = o2.b();
            p.a((o)o2);
        }
        return n4;
    }

    @Override
    public long a(byte by) {
        return this.a(by, 0L, Long.MAX_VALUE);
    }

    public long a(byte by, long l2, long l3) {
        IllegalArgumentException illegalArgumentException;
        long l4 = 0L;
        if (l2 >= l4 && l3 >= l2) {
            long l5 = this.c;
            if (l3 <= l5) {
                l5 = l3;
            }
            if (l2 == l5) {
                return -1L;
            }
            o o2 = this.b;
            if (o2 == null) {
                return -1L;
            }
            long l6 = this.c;
            if (l6 - l2 < l2) {
                while (l6 > l2) {
                    o2 = o2.g;
                    l6 -= (long)(o2.c - o2.b);
                }
            } else {
                do {
                    l6 = l4;
                    l4 = l6 + (long)(o2.c - o2.b);
                    if (l4 >= l2) break;
                    o2 = o2.f;
                } while (true);
            }
            long l7 = l2;
            while (l6 < l5) {
                byte[] arrby = o2.a;
                int n2 = (int)Math.min((long)o2.c, (long)(l5 + (long)o2.b - l6));
                for (int i2 = (int)(l7 + (long)o2.b - l6); i2 < n2; ++i2) {
                    if (arrby[i2] != by) continue;
                    return l6 + (long)(i2 - o2.b);
                }
                l7 = l6 + (long)(o2.c - o2.b);
                o2 = o2.f;
                l6 = l7;
            }
            return -1L;
        }
        Object[] arrobject = new Object[]{this.c, l2, l3};
        illegalArgumentException = new IllegalArgumentException(String.format((String)"size=%s fromIndex=%s toIndex=%s", (Object[])arrobject));
        throw illegalArgumentException;
    }

    public long a(c c2, long l2) {
        if (c2 != null) {
            if (l2 >= 0L) {
                long l3 = this.c;
                if (l3 == 0L) {
                    return -1L;
                }
                if (l2 > l3) {
                    l2 = l3;
                }
                c2.b((c)this, l2);
                return l2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(l2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("sink == null");
    }

    public long a(s s2) {
        IllegalArgumentException illegalArgumentException;
        if (s2 != null) {
            long l2;
            long l3 = 0L;
            while ((l2 = s2.a((c)this, 8192L)) != -1L) {
                l3 += l2;
            }
            return l3;
        }
        illegalArgumentException = new IllegalArgumentException("source == null");
        throw illegalArgumentException;
    }

    public String a(long l2, Charset charset) {
        u.a((long)this.c, (long)0L, (long)l2);
        if (charset != null) {
            if (l2 <= Integer.MAX_VALUE) {
                if (l2 == 0L) {
                    return "";
                }
                o o2 = this.b;
                int n2 = o2.b;
                if (l2 + (long)n2 > (long)o2.c) {
                    return new String(this.b(l2), charset);
                }
                String string = new String(o2.a, n2, (int)l2, charset);
                o2.b = (int)(l2 + (long)o2.b);
                this.c -= l2;
                if (o2.b == o2.c) {
                    this.b = o2.b();
                    p.a((o)o2);
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

    @Override
    public c a(String string) {
        this.a(string, 0, string.length());
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public c a(String string, int n2, int n3) {
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
            int n5;
            int n6;
            o o2;
            char c2;
            char c3 = string.charAt(n2);
            if (c3 < '') {
                o2 = this.b(1);
                byte[] arrby = o2.a;
                n4 = o2.c - n2;
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
                            this.writeByte(240 | n9 >> 18);
                            this.writeByte(128 | 63 & n9 >> 12);
                            this.writeByte(128 | 63 & n9 >> 6);
                            this.writeByte(128 | n9 & 63);
                            n2 += 2;
                            continue;
                        }
                        this.writeByte(63);
                        n2 = n8;
                        continue;
                    }
                    this.writeByte(224 | c3 >> 12);
                    n7 = 128 | 63 & c3 >> 6;
                }
                this.writeByte(n7);
                this.writeByte(128 | c3 & 63);
                ++n2;
                continue;
            }
            while (n6 < n5 && (c2 = string.charAt(n6)) < '') {
                int n10 = n6 + 1;
                arrby[n6 + n4] = (byte)c2;
                n6 = n10;
            }
            int n11 = n4 + n6;
            int n12 = o2.c;
            int n13 = n11 - n12;
            o2.c = n12 + n13;
            this.c += (long)n13;
            n2 = n6;
        }
        return this;
    }

    public c a(String string, int n2, int n3, Charset charset) {
        if (string != null) {
            if (n2 >= 0) {
                if (n3 >= n2) {
                    if (n3 <= string.length()) {
                        if (charset != null) {
                            if (charset.equals((Object)u.a)) {
                                this.a(string, n2, n3);
                                return this;
                            }
                            byte[] arrby = string.substring(n2, n3).getBytes(charset);
                            this.write(arrby, 0, arrby.length);
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

    public c a(c c2, long l2, long l3) {
        IllegalArgumentException illegalArgumentException;
        if (c2 != null) {
            int n2;
            int n3;
            u.a((long)this.c, (long)l2, (long)l3);
            if (l3 == 0L) {
                return this;
            }
            c2.c = l3 + c2.c;
            o o2 = this.b;
            while (l2 >= (long)((n3 = o2.c) - (n2 = o2.b))) {
                l2 -= (long)(n3 - n2);
                o2 = o2.f;
            }
            while (l3 > 0L) {
                o o3 = o2.c();
                o3.b = (int)(l2 + (long)o3.b);
                o3.c = Math.min((int)(o3.b + (int)l3), (int)o3.c);
                o o4 = c2.b;
                if (o4 == null) {
                    o3.g = o3;
                    o3.f = o3;
                    c2.b = o3;
                } else {
                    o4.g.a(o3);
                }
                l3 -= (long)(o3.c - o3.b);
                o2 = o2.f;
                l2 = 0L;
            }
            return this;
        }
        illegalArgumentException = new IllegalArgumentException("out == null");
        throw illegalArgumentException;
    }

    public c a(f f2) {
        if (f2 != null) {
            f2.a((c)this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public f a(int n2) {
        if (n2 == 0) {
            return f.f;
        }
        return new q((c)this, n2);
    }

    @Override
    public f a(long l2) {
        return new f(this.b(l2));
    }

    public void a() {
        try {
            this.skip(this.c);
            return;
        }
        catch (EOFException eOFException) {
            throw new AssertionError((Object)eOFException);
        }
    }

    @Override
    public boolean a(long l2, f f2) {
        return this.a(l2, f2, 0, f2.e());
    }

    public boolean a(long l2, f f2, int n2, int n3) {
        if (l2 >= 0L && n2 >= 0 && n3 >= 0 && this.c - l2 >= (long)n3) {
            if (f2.e() - n2 < n3) {
                return false;
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                if (this.f(l2 + (long)i2) == f2.a(n2 + i2)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public long b() {
        long l2 = this.c;
        if (l2 == 0L) {
            return 0L;
        }
        o o2 = this.b.g;
        int n2 = o2.c;
        if (n2 < 8192 && o2.e) {
            l2 -= (long)(n2 - o2.b);
        }
        return l2;
    }

    o b(int n2) {
        if (n2 >= 1 && n2 <= 8192) {
            o o2 = this.b;
            if (o2 == null) {
                o o3;
                o3.g = o3 = (this.b = p.a());
                o3.f = o3;
                return o3;
            }
            o o4 = o2.g;
            if (n2 + o4.c <= 8192 && o4.e) {
                return o4;
            }
            o o5 = p.a();
            o4.a(o5);
            return o5;
        }
        throw new IllegalArgumentException();
    }

    public void b(c c2, long l2) {
        IllegalArgumentException illegalArgumentException;
        if (c2 != null) {
            if (c2 != this) {
                u.a((long)c2.c, (long)0L, (long)l2);
                while (l2 > 0L) {
                    o o2 = c2.b;
                    if (l2 < (long)(o2.c - o2.b)) {
                        int n2;
                        long l3;
                        o o3 = this.b;
                        o o4 = o3 != null ? o3.g : null;
                        if (o4 != null && o4.e && (l3 = l2 + (long)o4.c) - (long)(n2 = o4.d ? 0 : o4.b) <= 8192L) {
                            c2.b.a(o4, (int)l2);
                            c2.c -= l2;
                            this.c = l2 + this.c;
                            return;
                        }
                        c2.b = c2.b.a((int)l2);
                    }
                    o o5 = c2.b;
                    long l4 = o5.c - o5.b;
                    c2.b = o5.b();
                    o o6 = this.b;
                    if (o6 == null) {
                        o o7;
                        o7.g = o7 = (this.b = o5);
                        o7.f = o7;
                    } else {
                        o6.g.a(o5);
                        o5.a();
                    }
                    c2.c -= l4;
                    this.c = l4 + this.c;
                    l2 -= l4;
                }
                return;
            }
            throw new IllegalArgumentException("source == this");
        }
        illegalArgumentException = new IllegalArgumentException("source == null");
        throw illegalArgumentException;
    }

    @Override
    public byte[] b(long l2) {
        u.a((long)this.c, (long)0L, (long)l2);
        if (l2 <= Integer.MAX_VALUE) {
            byte[] arrby = new byte[(int)l2];
            this.readFully(arrby);
            return arrby;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount > Integer.MAX_VALUE: ");
        stringBuilder.append(l2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public String c(long l2) {
        if (l2 >= 0L) {
            long l3 = Long.MAX_VALUE;
            if (l2 != l3) {
                l3 = l2 + 1L;
            }
            long l4 = this.a((byte)10, 0L, l3);
            if (l4 != -1L) {
                return this.h(l4);
            }
            if (l3 < this.p() && this.f(l3 - 1L) == 13 && this.f(l3) == 10) {
                return this.h(l3);
            }
            c c2 = new c();
            this.a(c2, 0L, Math.min((long)32L, (long)this.p()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\\n not found: limit=");
            stringBuilder.append(Math.min((long)this.p(), (long)l2));
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
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public c c(int n2) {
        if (n2 >= 128) {
            int n3;
            if (n2 < 2048) {
                n3 = 192 | n2 >> 6;
            } else {
                int n4;
                if (n2 < 65536) {
                    if (n2 >= 55296 && n2 <= 57343) {
                        this.writeByte(63);
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
                    this.writeByte(240 | n2 >> 18);
                    n4 = 128 | 63 & n2 >> 12;
                }
                this.writeByte(n4);
                n3 = 128 | 63 & n2 >> 6;
            }
            this.writeByte(n3);
            n2 = 128 | n2 & 63;
        }
        this.writeByte(n2);
        return this;
    }

    public c clone() {
        o o2;
        c c2 = new c();
        if (this.c == 0L) {
            return c2;
        }
        o2.g = o2 = (c2.b = this.b.c());
        o2.f = o2;
        o o3 = this.b;
        while ((o3 = o3.f) != this.b) {
            c2.b.g.a(o3.c());
        }
        c2.c = this.c;
        return c2;
    }

    public void close() {
    }

    public t d() {
        return t.d;
    }

    @Override
    public void d(long l2) {
        if (this.c >= l2) {
            return;
        }
        throw new EOFException();
    }

    @Override
    public InputStream e() {
        return new a(this);
    }

    @Override
    public c e(long l2) {
        if (l2 == 0L) {
            this.writeByte(48);
            return this;
        }
        int n2 = 1 + Long.numberOfTrailingZeros((long)Long.highestOneBit((long)l2)) / 4;
        o o2 = this.b(n2);
        byte[] arrby = o2.a;
        int n3 = o2.c;
        for (int i2 = -1 + (n3 + n2); i2 >= n3; --i2) {
            arrby[i2] = d[(int)(15L & l2)];
            l2 >>>= 4;
        }
        o2.c = n2 + o2.c;
        this.c += (long)n2;
        return this;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        c c2 = (c)object;
        long l2 = this.c;
        if (l2 != c2.c) {
            return false;
        }
        long l3 = 0L;
        if (l2 == l3) {
            return true;
        }
        o o2 = this.b;
        o o3 = c2.b;
        int n2 = o2.b;
        int n3 = o3.b;
        while (l3 < this.c) {
            long l4 = Math.min((int)(o2.c - n2), (int)(o3.c - n3));
            int n4 = n3;
            int n5 = n2;
            int n6 = 0;
            while ((long)n6 < l4) {
                byte[] arrby = o2.a;
                int n7 = n5 + 1;
                byte by = arrby[n5];
                byte[] arrby2 = o3.a;
                int n8 = n4 + 1;
                if (by != arrby2[n4]) {
                    return false;
                }
                ++n6;
                n5 = n7;
                n4 = n8;
            }
            if (n5 == o2.c) {
                o2 = o2.f;
                n2 = o2.b;
            } else {
                n2 = n5;
            }
            if (n4 == o3.c) {
                o3 = o3.f;
                n3 = o3.b;
            } else {
                n3 = n4;
            }
            l3 += l4;
        }
        return true;
    }

    public byte f(long l2) {
        int n2;
        int n3;
        u.a((long)this.c, (long)l2, (long)1L);
        long l3 = this.c;
        if (l3 - l2 > l2) {
            o o2 = this.b;
            do {
                int n4;
                int n5;
                long l4;
                if (l2 < (l4 = (long)((n4 = o2.c) - (n5 = o2.b)))) {
                    return o2.a[n5 + (int)l2];
                }
                l2 -= l4;
                o2 = o2.f;
            } while (true);
        }
        long l5 = l2 - l3;
        o o3 = this.b;
        do {
            o3 = o3.g;
        } while ((l5 += (long)((n2 = o3.c) - (n3 = o3.b))) < 0L);
        return o3.a[n3 + (int)l5];
    }

    @Override
    public String f() {
        return this.c(Long.MAX_VALUE);
    }

    @Override
    public void flush() {
    }

    public String g(long l2) {
        return this.a(l2, u.a);
    }

    @Override
    public byte[] g() {
        try {
            byte[] arrby = this.b(this.c);
            return arrby;
        }
        catch (EOFException eOFException) {
            throw new AssertionError((Object)eOFException);
        }
    }

    @Override
    public int h() {
        return u.a((int)this.readInt());
    }

    /*
     * Enabled aggressive block sorting
     */
    String h(long l2) {
        long l3;
        String string;
        long l4 = 1L;
        if (l2 > 0L && this.f(l3 = l2 - l4) == 13) {
            string = this.g(l3);
            l4 = 2L;
        } else {
            string = this.g(l2);
        }
        this.skip(l4);
        return string;
    }

    public int hashCode() {
        o o2 = this.b;
        if (o2 == null) {
            return 0;
        }
        int n2 = 1;
        do {
            int n3 = o2.c;
            for (int i2 = o2.b; i2 < n3; ++i2) {
                n2 = n2 * 31 + o2.a[i2];
            }
        } while ((o2 = o2.f) != this.b);
        return n2;
    }

    @Override
    public boolean i() {
        return this.c == 0L;
    }

    public boolean isOpen() {
        return true;
    }

    @Override
    public short j() {
        return u.a((short)this.readShort());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public long k() {
        if (this.c == 0L) {
            IllegalStateException illegalStateException = new IllegalStateException("size == 0");
            throw illegalStateException;
        }
        boolean bl = false;
        long l2 = 0L;
        int n2 = 0;
        do {
            int n3;
            o o2 = this.b;
            byte[] arrby = o2.a;
            int n4 = o2.c;
            for (n3 = o2.b; n3 < n4; ++n3, ++n2) {
                byte by;
                block13 : {
                    int n5;
                    block10 : {
                        int n6;
                        block12 : {
                            block11 : {
                                block9 : {
                                    by = arrby[n3];
                                    if (by < 48 || by > 57) break block9;
                                    n5 = by - 48;
                                    break block10;
                                }
                                if (by < 97 || by > 102) break block11;
                                n6 = by - 97;
                                break block12;
                            }
                            if (by < 65 || by > 70) break block13;
                            n6 = by - 65;
                        }
                        n5 = n6 + 10;
                    }
                    if ((-1152921504606846976L & l2) != 0L) {
                        c c2 = new c();
                        c2.e(l2);
                        c2.writeByte(by);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Number too large: ");
                        stringBuilder.append(c2.o());
                        throw new NumberFormatException(stringBuilder.toString());
                    }
                    l2 = l2 << 4 | (long)n5;
                    continue;
                }
                if (n2 == 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Expected leading [0-9a-fA-F] character but was 0x");
                    stringBuilder.append(Integer.toHexString((int)by));
                    throw new NumberFormatException(stringBuilder.toString());
                }
                bl = true;
                break;
            }
            if (n3 == n4) {
                this.b = o2.b();
                p.a((o)o2);
                continue;
            }
            o2.b = n3;
        } while (!bl && this.b != null);
        this.c -= (long)n2;
        return l2;
    }

    @Override
    public c l() {
        return this;
    }

    public f n() {
        return new f(this.g());
    }

    public String o() {
        try {
            String string = this.a(this.c, u.a);
            return string;
        }
        catch (EOFException eOFException) {
            throw new AssertionError((Object)eOFException);
        }
    }

    public long p() {
        return this.c;
    }

    public f q() {
        long l2 = this.c;
        if (l2 <= Integer.MAX_VALUE) {
            return this.a((int)l2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size > Integer.MAX_VALUE: ");
        stringBuilder.append(this.c);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public int read(ByteBuffer byteBuffer) {
        o o2 = this.b;
        if (o2 == null) {
            return -1;
        }
        int n2 = Math.min((int)byteBuffer.remaining(), (int)(o2.c - o2.b));
        byteBuffer.put(o2.a, o2.b, n2);
        o2.b = n2 + o2.b;
        this.c -= (long)n2;
        if (o2.b == o2.c) {
            this.b = o2.b();
            p.a((o)o2);
        }
        return n2;
    }

    @Override
    public byte readByte() {
        long l2 = this.c;
        if (l2 != 0L) {
            o o2 = this.b;
            int n2 = o2.b;
            int n3 = o2.c;
            byte[] arrby = o2.a;
            int n4 = n2 + 1;
            byte by = arrby[n2];
            this.c = l2 - 1L;
            if (n4 == n3) {
                this.b = o2.b();
                p.a((o)o2);
                return by;
            }
            o2.b = n4;
            return by;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override
    public void readFully(byte[] arrby) {
        int n2;
        for (int i2 = 0; i2 < arrby.length; i2 += n2) {
            n2 = this.a(arrby, i2, arrby.length - i2);
            if (n2 != -1) {
                continue;
            }
            throw new EOFException();
        }
    }

    @Override
    public int readInt() {
        long l2 = this.c;
        if (l2 >= 4L) {
            o o2 = this.b;
            int n2 = o2.c;
            int n3 = o2.b;
            if (n2 - n3 < 4) {
                return (255 & this.readByte()) << 24 | (255 & this.readByte()) << 16 | (255 & this.readByte()) << 8 | 255 & this.readByte();
            }
            byte[] arrby = o2.a;
            int n4 = n3 + 1;
            int n5 = (255 & arrby[n3]) << 24;
            int n6 = n4 + 1;
            int n7 = n5 | (255 & arrby[n4]) << 16;
            int n8 = n6 + 1;
            int n9 = n7 | (255 & arrby[n6]) << 8;
            int n10 = n8 + 1;
            int n11 = n9 | 255 & arrby[n8];
            this.c = l2 - 4L;
            if (n10 == n2) {
                this.b = o2.b();
                p.a((o)o2);
                return n11;
            }
            o2.b = n10;
            return n11;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size < 4: ");
        stringBuilder.append(this.c);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public short readShort() {
        long l2 = this.c;
        if (l2 >= 2L) {
            o o2 = this.b;
            int n2 = o2.c;
            int n3 = o2.b;
            if (n2 - n3 < 2) {
                return (short)((255 & this.readByte()) << 8 | 255 & this.readByte());
            }
            byte[] arrby = o2.a;
            int n4 = n3 + 1;
            int n5 = (255 & arrby[n3]) << 8;
            int n6 = n4 + 1;
            int n7 = n5 | 255 & arrby[n4];
            this.c = l2 - 2L;
            if (n6 == n2) {
                this.b = o2.b();
                p.a((o)o2);
            } else {
                o2.b = n6;
            }
            return (short)n7;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size < 2: ");
        stringBuilder.append(this.c);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public void skip(long l2) {
        while (l2 > 0L) {
            o o2 = this.b;
            if (o2 != null) {
                int n2 = (int)Math.min((long)l2, (long)(o2.c - o2.b));
                long l3 = this.c;
                long l4 = n2;
                this.c = l3 - l4;
                l2 -= l4;
                o o3 = this.b;
                o3.b = n2 + o3.b;
                if (o3.b != o3.c) continue;
                this.b = o3.b();
                p.a((o)o3);
                continue;
            }
            throw new EOFException();
        }
    }

    public String toString() {
        return this.q().toString();
    }

    public int write(ByteBuffer byteBuffer) {
        IllegalArgumentException illegalArgumentException;
        if (byteBuffer != null) {
            int n2;
            int n3;
            for (int i2 = n3 = byteBuffer.remaining(); i2 > 0; i2 -= n2) {
                o o2 = this.b(1);
                n2 = Math.min((int)i2, (int)(8192 - o2.c));
                byteBuffer.get(o2.a, o2.c, n2);
                o2.c = n2 + o2.c;
            }
            this.c += (long)n3;
            return n3;
        }
        illegalArgumentException = new IllegalArgumentException("source == null");
        throw illegalArgumentException;
    }

    @Override
    public c write(byte[] arrby) {
        if (arrby != null) {
            this.write(arrby, 0, arrby.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override
    public c write(byte[] arrby, int n2, int n3) {
        IllegalArgumentException illegalArgumentException;
        if (arrby != null) {
            long l2 = arrby.length;
            long l3 = n2;
            long l4 = n3;
            u.a((long)l2, (long)l3, (long)l4);
            int n4 = n3 + n2;
            while (n2 < n4) {
                o o2 = this.b(1);
                int n5 = Math.min((int)(n4 - n2), (int)(8192 - o2.c));
                System.arraycopy((Object)arrby, (int)n2, (Object)o2.a, (int)o2.c, (int)n5);
                n2 += n5;
                o2.c = n5 + o2.c;
            }
            this.c = l4 + this.c;
            return this;
        }
        illegalArgumentException = new IllegalArgumentException("source == null");
        throw illegalArgumentException;
    }

    @Override
    public c writeByte(int n2) {
        o o2 = this.b(1);
        byte[] arrby = o2.a;
        int n3 = o2.c;
        o2.c = n3 + 1;
        arrby[n3] = (byte)n2;
        this.c = 1L + this.c;
        return this;
    }

    @Override
    public c writeInt(int n2) {
        o o2 = this.b(4);
        byte[] arrby = o2.a;
        int n3 = o2.c;
        int n4 = n3 + 1;
        arrby[n3] = (byte)(255 & n2 >>> 24);
        int n5 = n4 + 1;
        arrby[n4] = (byte)(255 & n2 >>> 16);
        int n6 = n5 + 1;
        arrby[n5] = (byte)(255 & n2 >>> 8);
        int n7 = n6 + 1;
        arrby[n6] = (byte)(n2 & 255);
        o2.c = n7;
        this.c = 4L + this.c;
        return this;
    }

    @Override
    public c writeShort(int n2) {
        o o2 = this.b(2);
        byte[] arrby = o2.a;
        int n3 = o2.c;
        int n4 = n3 + 1;
        arrby[n3] = (byte)(255 & n2 >>> 8);
        int n5 = n4 + 1;
        arrby[n4] = (byte)(n2 & 255);
        o2.c = n5;
        this.c = 2L + this.c;
        return this;
    }
}

