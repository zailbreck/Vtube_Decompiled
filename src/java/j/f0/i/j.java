/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package j.f0.i;

import j.f0.c;
import j.f0.i.b;
import j.f0.i.d;
import j.f0.i.e;
import j.f0.i.m;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.f;

final class j
implements Closeable {
    private static final Logger h = Logger.getLogger((String)e.class.getName());
    private final k.d b;
    private final boolean c;
    private final k.c d;
    private int e;
    private boolean f;
    final d.b g;

    j(k.d d2, boolean bl) {
        this.b = d2;
        this.c = bl;
        this.d = new k.c();
        this.g = new d.b(this.d);
        this.e = 16384;
    }

    private static void a(k.d d2, int n2) {
        d2.writeByte(255 & n2 >>> 16);
        d2.writeByte(255 & n2 >>> 8);
        d2.writeByte(n2 & 255);
    }

    private void b(int n2, long l2) {
        while (l2 > 0L) {
            long l3;
            int n3;
            byte by = (l2 -= (l3 = (long)(n3 = (int)Math.min((long)this.e, (long)l2)))) == 0L ? (byte)4 : 0;
            this.a(n2, n3, (byte)9, by);
            this.b.b(this.d, l3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a() {
        j j2 = this;
        synchronized (j2) {
            block5 : {
                if (this.f) throw new IOException("closed");
                boolean bl = this.c;
                if (bl) break block5;
                return;
            }
            if (h.isLoggable(Level.FINE)) {
                Logger logger = h;
                Object[] arrobject = new Object[]{e.a.b()};
                logger.fine(c.a(">> CONNECTION %s", arrobject));
            }
            this.b.write(e.a.g());
            this.b.flush();
            return;
        }
    }

    void a(int n2, byte by, k.c c2, int n3) {
        this.a(n2, n3, (byte)0, by);
        if (n3 > 0) {
            this.b.b(c2, n3);
        }
    }

    public void a(int n2, int n3, byte by, byte by2) {
        int n4;
        if (h.isLoggable(Level.FINE)) {
            h.fine(e.a(false, n2, n3, by, by2));
        }
        if (n3 <= (n4 = this.e)) {
            if ((Integer.MIN_VALUE & n2) == 0) {
                j.a(this.b, n3);
                this.b.writeByte(by & 255);
                this.b.writeByte(by2 & 255);
                this.b.writeInt(n2 & Integer.MAX_VALUE);
                return;
            }
            Object[] arrobject = new Object[]{n2};
            e.a("reserved bit set: %s", arrobject);
            throw null;
        }
        Object[] arrobject = new Object[]{n4, n3};
        e.a("FRAME_SIZE_ERROR length > %d: %d", arrobject);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(int n2, int n3, List<j.f0.i.c> list) {
        void var12_4 = this;
        synchronized (var12_4) {
            if (this.f) {
                throw new IOException("closed");
            }
            this.g.a(list);
            long l2 = this.d.p();
            int n4 = (int)Math.min((long)(this.e - 4), (long)l2);
            long l3 = n4;
            byte by = l2 == l3 ? (byte)4 : 0;
            this.a(n2, n4 + 4, (byte)5, by);
            this.b.writeInt(n3 & Integer.MAX_VALUE);
            this.b.b(this.d, l3);
            if (l2 > l3) {
                j.super.b(n2, l2 - l3);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(int n2, long l2) {
        void var8_3 = this;
        synchronized (var8_3) {
            if (this.f) {
                throw new IOException("closed");
            }
            if (l2 != 0L && l2 <= Integer.MAX_VALUE) {
                this.a(n2, 4, (byte)8, (byte)0);
                this.b.writeInt((int)l2);
                this.b.flush();
                return;
            }
            Object[] arrobject = new Object[]{l2};
            e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", arrobject);
            throw null;
        }
    }

    public void a(int n2, b b2) {
        void var5_3 = this;
        synchronized (var5_3) {
            if (!this.f) {
                if (b2.b != -1) {
                    this.a(n2, 4, (byte)3, (byte)0);
                    this.b.writeInt(b2.b);
                    this.b.flush();
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IOException("closed");
        }
    }

    public void a(int n2, b b2, byte[] arrby) {
        void var9_4 = this;
        synchronized (var9_4) {
            block6 : {
                if (this.f) break block6;
                if (b2.b != -1) {
                    this.a(0, 8 + arrby.length, (byte)7, (byte)0);
                    this.b.writeInt(n2);
                    this.b.writeInt(b2.b);
                    if (arrby.length > 0) {
                        this.b.write(arrby);
                    }
                    this.b.flush();
                    return;
                }
                e.a("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            throw new IOException("closed");
        }
    }

    public void a(m m2) {
        void var3_2 = this;
        synchronized (var3_2) {
            if (!this.f) {
                this.e = m2.c(this.e);
                if (m2.b() != -1) {
                    this.g.a(m2.b());
                }
                this.a(0, 0, (byte)4, (byte)1);
                this.b.flush();
                return;
            }
            throw new IOException("closed");
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(boolean bl, int n2, int n3) {
        void var8_4 = this;
        synchronized (var8_4) {
            if (this.f) {
                throw new IOException("closed");
            }
            byte by = bl ? (byte)1 : 0;
            this.a(0, 8, (byte)6, by);
            this.b.writeInt(n2);
            this.b.writeInt(n3);
            this.b.flush();
            return;
        }
    }

    public void a(boolean bl, int n2, int n3, List<j.f0.i.c> list) {
        void var6_5 = this;
        synchronized (var6_5) {
            if (!this.f) {
                this.a(bl, n2, list);
                return;
            }
            throw new IOException("closed");
        }
    }

    void a(boolean bl, int n2, List<j.f0.i.c> list) {
        if (!this.f) {
            this.g.a(list);
            long l2 = this.d.p();
            int n3 = (int)Math.min((long)this.e, (long)l2);
            long l3 = n3;
            byte by = l2 == l3 ? (byte)4 : 0;
            if (bl) {
                by = (byte)(by | 1);
            }
            this.a(n2, n3, (byte)1, by);
            this.b.b(this.d, l3);
            if (l2 > l3) {
                j.super.b(n2, l2 - l3);
            }
            return;
        }
        throw new IOException("closed");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(boolean bl, int n2, k.c c2, int n3) {
        void var7_5 = this;
        synchronized (var7_5) {
            byte by;
            block4 : {
                if (this.f) throw new IOException("closed");
                by = 0;
                if (!bl) break block4;
                by = (byte)(true ? 1 : 0);
            }
            this.a(n2, by, c2, n3);
            return;
        }
    }

    public int b() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(m m2) {
        void var8_2 = this;
        synchronized (var8_2) {
            if (this.f) throw new IOException("closed");
            int n2 = 6 * m2.d();
            int n3 = 0;
            this.a(0, n2, (byte)4, (byte)0);
            do {
                if (n3 >= 10) {
                    this.b.flush();
                    return;
                }
                if (m2.d(n3)) {
                    int n4 = n3 == 4 ? 3 : (n3 == 7 ? 4 : n3);
                    this.b.writeShort(n4);
                    this.b.writeInt(m2.a(n3));
                }
                ++n3;
            } while (true);
        }
    }

    public void close() {
        j j2 = this;
        synchronized (j2) {
            this.f = true;
            this.b.close();
            return;
        }
    }

    public void flush() {
        j j2 = this;
        synchronized (j2) {
            if (!this.f) {
                this.b.flush();
                return;
            }
            throw new IOException("closed");
        }
    }
}

