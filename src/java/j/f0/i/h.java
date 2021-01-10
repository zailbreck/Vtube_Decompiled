/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.IOException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package j.f0.i;

import j.f0.c;
import j.f0.i.d;
import j.f0.i.e;
import j.f0.i.m;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.f;
import k.s;
import k.t;

final class h
implements Closeable {
    static final Logger f = Logger.getLogger((String)e.class.getName());
    private final k.e b;
    private final a c;
    private final boolean d;
    final d.a e;

    h(k.e e2, boolean bl) {
        this.b = e2;
        this.d = bl;
        this.c = new s(this.b){
            private final k.e b;
            int c;
            byte d;
            int e;
            int f;
            short g;
            {
                this.b = e2;
            }

            private void a() {
                int n2;
                int n3 = this.e;
                this.f = n2 = h.a(this.b);
                this.c = n2;
                byte by = (byte)(255 & this.b.readByte());
                this.d = (byte)(255 & this.b.readByte());
                if (h.f.isLoggable(Level.FINE)) {
                    h.f.fine(e.a(true, this.e, this.c, by, this.d));
                }
                this.e = Integer.MAX_VALUE & this.b.readInt();
                if (by == 9) {
                    if (this.e == n3) {
                        return;
                    }
                    e.b("TYPE_CONTINUATION streamId changed", new Object[0]);
                    throw null;
                }
                Object[] arrobject = new Object[]{by};
                e.b("%s != TYPE_CONTINUATION", arrobject);
                throw null;
            }

            @Override
            public long a(k.c c2, long l2) {
                int n2;
                while ((n2 = this.f) == 0) {
                    this.b.skip(this.g);
                    this.g = 0;
                    if ((4 & this.d) != 0) {
                        return -1L;
                    }
                    a.super.a();
                }
                long l3 = this.b.a(c2, Math.min((long)l2, (long)n2));
                if (l3 == -1L) {
                    return -1L;
                }
                this.f = (int)((long)this.f - l3);
                return l3;
            }

            @Override
            public void close() {
            }

            @Override
            public t d() {
                return this.b.d();
            }
        };
        this.e = new d.a(4096, this.c);
    }

    static int a(int n2, byte by, short s2) {
        if ((by & 8) != 0) {
            --n2;
        }
        if (s2 <= n2) {
            return (short)(n2 - s2);
        }
        Object[] arrobject = new Object[]{s2, n2};
        e.b("PROTOCOL_ERROR padding %s > remaining length %s", arrobject);
        throw null;
    }

    static int a(k.e e2) {
        return (255 & e2.readByte()) << 16 | (255 & e2.readByte()) << 8 | 255 & e2.readByte();
    }

    private List<j.f0.i.c> a(int n2, short s2, byte by, int n3) {
        a a2 = this.c;
        a2.f = n2;
        a2.c = n2;
        a2.g = s2;
        a2.d = by;
        a2.e = n3;
        this.e.c();
        return this.e.a();
    }

    private void a(b b2, int n2) {
        int n3 = this.b.readInt();
        boolean bl = (Integer.MIN_VALUE & n3) != 0;
        b2.a(n2, n3 & Integer.MAX_VALUE, 1 + (255 & this.b.readByte()), bl);
    }

    private void a(b b2, int n2, byte by, int n3) {
        if (n3 != 0) {
            int n4 = by & 1;
            boolean bl = true;
            boolean bl2 = n4 != 0;
            if ((by & 32) == 0) {
                bl = false;
            }
            if (!bl) {
                int n5 = by & 8;
                short s2 = 0;
                if (n5 != 0) {
                    s2 = (short)(255 & this.b.readByte());
                }
                int n6 = h.a(n2, by, s2);
                b2.a(bl2, n3, this.b, n6);
                this.b.skip(s2);
                return;
            }
            e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        e.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        throw null;
    }

    private void b(b b2, int n2, byte by, int n3) {
        if (n2 >= 8) {
            if (n3 == 0) {
                int n4 = this.b.readInt();
                int n5 = this.b.readInt();
                int n6 = n2 - 8;
                j.f0.i.b b3 = j.f0.i.b.a(n5);
                if (b3 != null) {
                    f f2 = f.f;
                    if (n6 > 0) {
                        f2 = this.b.a(n6);
                    }
                    b2.a(n4, b3, f2);
                    return;
                }
                Object[] arrobject = new Object[]{n5};
                e.b("TYPE_GOAWAY unexpected error code: %d", arrobject);
                throw null;
            }
            e.b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        Object[] arrobject = new Object[]{n2};
        e.b("TYPE_GOAWAY length < 8: %s", arrobject);
        throw null;
    }

    private void c(b b2, int n2, byte by, int n3) {
        if (n3 != 0) {
            boolean bl = (by & 1) != 0;
            int n4 = by & 8;
            short s2 = 0;
            if (n4 != 0) {
                s2 = (short)(255 & this.b.readByte());
            }
            if ((by & 32) != 0) {
                h.super.a(b2, n3);
                n2 -= 5;
            }
            b2.a(bl, n3, -1, h.super.a(h.a(n2, by, s2), s2, by, n3));
            return;
        }
        e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    private void d(b b2, int n2, byte by, int n3) {
        if (n2 == 8) {
            if (n3 == 0) {
                int n4 = this.b.readInt();
                int n5 = this.b.readInt();
                int n6 = by & 1;
                boolean bl = false;
                if (n6 != 0) {
                    bl = true;
                }
                b2.a(bl, n4, n5);
                return;
            }
            e.b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        Object[] arrobject = new Object[]{n2};
        e.b("TYPE_PING length != 8: %s", arrobject);
        throw null;
    }

    private void e(b b2, int n2, byte by, int n3) {
        if (n2 == 5) {
            if (n3 != 0) {
                h.super.a(b2, n3);
                return;
            }
            e.b("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
        Object[] arrobject = new Object[]{n2};
        e.b("TYPE_PRIORITY length: %d != 5", arrobject);
        throw null;
    }

    private void f(b b2, int n2, byte by, int n3) {
        if (n3 != 0) {
            int n4 = by & 8;
            short s2 = 0;
            if (n4 != 0) {
                s2 = (short)(255 & this.b.readByte());
            }
            b2.a(n3, Integer.MAX_VALUE & this.b.readInt(), h.super.a(h.a(n2 - 4, by, s2), s2, by, n3));
            return;
        }
        e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    private void g(b b2, int n2, byte by, int n3) {
        if (n2 == 4) {
            if (n3 != 0) {
                int n4 = this.b.readInt();
                j.f0.i.b b3 = j.f0.i.b.a(n4);
                if (b3 != null) {
                    b2.a(n3, b3);
                    return;
                }
                Object[] arrobject = new Object[]{n4};
                e.b("TYPE_RST_STREAM unexpected error code: %d", arrobject);
                throw null;
            }
            e.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        Object[] arrobject = new Object[]{n2};
        e.b("TYPE_RST_STREAM length: %d != 4", arrobject);
        throw null;
    }

    private void h(b b2, int n2, byte by, int n3) {
        if (n3 == 0) {
            if ((by & 1) != 0) {
                if (n2 == 0) {
                    b2.a();
                    return;
                }
                e.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
            if (n2 % 6 == 0) {
                m m2 = new m();
                for (int i2 = 0; i2 < n2; i2 += 6) {
                    int n4 = 65535 & this.b.readShort();
                    int n5 = this.b.readInt();
                    switch (n4) {
                        default: {
                            break;
                        }
                        case 5: {
                            if (n5 >= 16384 && n5 <= 16777215) break;
                            Object[] arrobject = new Object[]{n5};
                            e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", arrobject);
                            throw null;
                        }
                        case 4: {
                            n4 = 7;
                            if (n5 >= 0) break;
                            e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                        case 3: {
                            n4 = 4;
                            break;
                        }
                        case 2: {
                            if (n5 == 0 || n5 == 1) break;
                            e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            throw null;
                        }
                        case 1: 
                        case 6: 
                    }
                    m2.a(n4, n5);
                }
                b2.a(false, m2);
                return;
            }
            Object[] arrobject = new Object[]{n2};
            e.b("TYPE_SETTINGS length %% 6 != 0: %s", arrobject);
            throw null;
        }
        e.b("TYPE_SETTINGS streamId != 0", new Object[0]);
        throw null;
    }

    private void i(b b2, int n2, byte by, int n3) {
        if (n2 == 4) {
            long l2 = Integer.MAX_VALUE & (long)this.b.readInt();
            if (l2 != 0L) {
                b2.a(n3, l2);
                return;
            }
            Object[] arrobject = new Object[]{l2};
            e.b("windowSizeIncrement was 0", arrobject);
            throw null;
        }
        Object[] arrobject = new Object[]{n2};
        e.b("TYPE_WINDOW_UPDATE length !=4: %s", arrobject);
        throw null;
    }

    public void a(b b2) {
        if (this.d) {
            if (this.a(true, b2)) {
                return;
            }
            e.b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        f f2 = this.b.a(e.a.e());
        if (f.isLoggable(Level.FINE)) {
            Logger logger = f;
            Object[] arrobject = new Object[]{f2.b()};
            logger.fine(c.a("<< CONNECTION %s", arrobject));
        }
        if (e.a.equals(f2)) {
            return;
        }
        Object[] arrobject = new Object[]{f2.h()};
        e.b("Expected a connection header but was %s", arrobject);
        throw null;
    }

    public boolean a(boolean bl, b b2) {
        try {
            this.b.d(9L);
        }
        catch (IOException iOException) {
            return false;
        }
        int n2 = h.a(this.b);
        if (n2 >= 0 && n2 <= 16384) {
            byte by = (byte)(255 & this.b.readByte());
            if (bl && by != 4) {
                Object[] arrobject = new Object[]{by};
                e.b("Expected a SETTINGS frame but was %s", arrobject);
                throw null;
            }
            byte by2 = (byte)(255 & this.b.readByte());
            int n3 = Integer.MAX_VALUE & this.b.readInt();
            if (f.isLoggable(Level.FINE)) {
                f.fine(e.a(true, n3, n2, by, by2));
            }
            switch (by) {
                default: {
                    this.b.skip(n2);
                    return true;
                }
                case 8: {
                    h.super.i(b2, n2, by2, n3);
                    return true;
                }
                case 7: {
                    h.super.b(b2, n2, by2, n3);
                    return true;
                }
                case 6: {
                    h.super.d(b2, n2, by2, n3);
                    return true;
                }
                case 5: {
                    h.super.f(b2, n2, by2, n3);
                    return true;
                }
                case 4: {
                    h.super.h(b2, n2, by2, n3);
                    return true;
                }
                case 3: {
                    h.super.g(b2, n2, by2, n3);
                    return true;
                }
                case 2: {
                    h.super.e(b2, n2, by2, n3);
                    return true;
                }
                case 1: {
                    h.super.c(b2, n2, by2, n3);
                    return true;
                }
                case 0: 
            }
            h.super.a(b2, n2, by2, n3);
            return true;
        }
        Object[] arrobject = new Object[]{n2};
        e.b("FRAME_SIZE_ERROR: %s", arrobject);
        throw null;
    }

    public void close() {
        this.b.close();
    }

    static interface b {
        public void a();

        public void a(int var1, int var2, int var3, boolean var4);

        public void a(int var1, int var2, List<j.f0.i.c> var3);

        public void a(int var1, long var2);

        public void a(int var1, j.f0.i.b var2);

        public void a(int var1, j.f0.i.b var2, f var3);

        public void a(boolean var1, int var2, int var3);

        public void a(boolean var1, int var2, int var3, List<j.f0.i.c> var4);

        public void a(boolean var1, int var2, k.e var3, int var4);

        public void a(boolean var1, m var2);
    }

}

