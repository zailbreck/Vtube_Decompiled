/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.ref.Reference
 *  java.lang.ref.WeakReference
 *  java.net.Socket
 *  java.util.List
 */
package j.f0.f;

import j.c0;
import j.f0.f.c;
import j.f0.f.d;
import j.f0.f.e;
import j.f0.f.f;
import j.f0.i.b;
import j.f0.i.n;
import j.i;
import j.j;
import j.p;
import j.t;
import j.v;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

public final class g {
    public final j.a a;
    private f.a b;
    private c0 c;
    private final j d;
    public final j.e e;
    public final p f;
    private final Object g;
    private final f h;
    private int i;
    private c j;
    private boolean k;
    private boolean l;
    private boolean m;
    private j.f0.g.c n;

    public g(j j2, j.a a2, j.e e2, p p2, Object object) {
        this.d = j2;
        this.a = a2;
        this.e = e2;
        this.f = p2;
        this.h = new f(a2, this.h(), e2, p2);
        this.g = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private c a(int n2, int n3, int n4, int n5, boolean bl) {
        f.a a2;
        c0 c02;
        boolean bl2;
        j j2;
        Socket socket;
        c c2;
        boolean bl3;
        c c3;
        block26 : {
            block27 : {
                c c4;
                block25 : {
                    j j3;
                    j j4 = j3 = this.d;
                    // MONITORENTER : j4
                    if (this.l) throw new IllegalStateException("released");
                    if (this.n != null) throw new IllegalStateException("codec != null");
                    if (this.m) throw new IOException("Canceled");
                    c c5 = this.j;
                    socket = this.g();
                    if (this.j != null) {
                        c4 = this.j;
                        c3 = null;
                    } else {
                        c3 = c5;
                        c4 = null;
                    }
                    if (!this.k) {
                        c3 = null;
                    }
                    if (c4 != null) break block25;
                    j.f0.a.a.a(this.d, this.a, this, null);
                    if (this.j != null) {
                        c2 = this.j;
                        bl2 = true;
                        c02 = null;
                        // MONITOREXIT : j4
                        break block26;
                    }
                    c02 = this.c;
                    c2 = c4;
                    break block27;
                }
                c2 = c4;
                c02 = null;
            }
            bl2 = false;
        }
        j.f0.c.a(socket);
        if (c3 != null) {
            this.f.b(this.e, c3);
        }
        if (bl2) {
            this.f.a(this.e, c2);
        }
        if (c2 != null) {
            return c2;
        }
        if (!(c02 != null || (a2 = this.b) != null && a2.b())) {
            this.b = this.h.b();
            bl3 = true;
        } else {
            bl3 = false;
        }
        j j5 = j2 = this.d;
        // MONITORENTER : j5
        if (this.m) throw new IOException("Canceled");
        if (bl3) {
            List<c0> list = this.b.a();
            int n6 = list.size();
            for (int i2 = 0; i2 < n6; ++i2) {
                c0 c03 = (c0)list.get(i2);
                j.f0.a.a.a(this.d, this.a, this, c03);
                if (this.j == null) continue;
                c2 = this.j;
                this.c = c03;
                bl2 = true;
                break;
            }
        }
        if (!bl2) {
            if (c02 == null) {
                c02 = this.b.c();
            }
            this.c = c02;
            this.i = 0;
            c2 = new c(this.d, c02);
            this.a(c2, false);
        }
        // MONITOREXIT : j5
        if (!bl2) {
            j j6;
            j.e e2 = this.e;
            p p2 = this.f;
            c2.a(n2, n3, n4, n5, bl, e2, p2);
            this.h().a(c2.c());
            j j7 = j6 = this.d;
            // MONITORENTER : j7
            this.k = true;
            j.f0.a.a.b(this.d, c2);
            boolean bl4 = c2.b();
            Socket socket2 = null;
            if (bl4) {
                socket2 = j.f0.a.a.a(this.d, this.a, this);
                c2 = this.j;
            }
            // MONITOREXIT : j7
            j.f0.c.a(socket2);
        }
        this.f.a(this.e, c2);
        return c2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private c a(int var1_4, int var2_6, int var3_2, int var4_3, boolean var5_1, boolean var6_5) {
        do lbl-1000: // 2 sources:
        {
            var7_9 = this.a(var1_4, var2_6, var3_2, var4_3, var5_1);
            var10_8 = var8_7 = this.d;
            // MONITORENTER : var10_8
            if (var7_9.l == 0) {
                // MONITOREXIT : var10_8
                return var7_9;
            }
            // MONITOREXIT : var10_8
            break;
        } while (true);
        {
            catch (Throwable var9_10) {}
            {
                // MONITOREXIT : var10_8
                throw var9_10;
            }
        }
        {
            if (var7_9.a(var6_5) != false) return var7_9;
            this.d();
            ** while (true)
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private Socket a(boolean var1, boolean var2_3, boolean var3_2) {
        if (var3_2) {
            this.n = null;
        }
        if (var2_3) {
            this.l = true;
        }
        if ((var4_4 = this.j) == null) return null;
        if (var1) {
            var4_4.k = true;
        }
        if (this.n != null) return null;
        if (!this.l) {
            if (this.j.k == false) return null;
        }
        g.super.b(this.j);
        if (!this.j.n.isEmpty()) ** GOTO lbl-1000
        this.j.o = System.nanoTime();
        if (j.f0.a.a.a(this.d, this.j)) {
            var5_5 = this.j.d();
        } else lbl-1000: // 2 sources:
        {
            var5_5 = null;
        }
        this.j = null;
        return var5_5;
    }

    private void b(c c2) {
        IllegalStateException illegalStateException;
        int n2 = c2.n.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (((Reference)c2.n.get(i2)).get() != this) continue;
            c2.n.remove(i2);
            return;
        }
        illegalStateException = new IllegalStateException();
        throw illegalStateException;
    }

    private Socket g() {
        c c2 = this.j;
        if (c2 != null && c2.k) {
            return this.a(false, false, true);
        }
        return null;
    }

    private d h() {
        return j.f0.a.a.a(this.d);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public j.f0.g.c a() {
        j j2;
        j j3 = j2 = this.d;
        synchronized (j3) {
            return this.n;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public j.f0.g.c a(v v2, t.a a2, boolean bl) {
        j.f0.g.c c2;
        int n2 = a2.a();
        int n3 = a2.b();
        int n4 = a2.c();
        int n5 = v2.r();
        boolean bl2 = v2.x();
        try {
            j j2;
            c2 = g.super.a(n2, n3, n4, n5, bl2, bl).a(v2, a2, (g)this);
            j j3 = j2 = this.d;
            // MONITORENTER : j3
        }
        catch (IOException iOException) {
            throw new e(iOException);
        }
        this.n = c2;
        // MONITOREXIT : j3
        return c2;
    }

    public Socket a(c c2) {
        if (this.n == null && this.j.n.size() == 1) {
            Reference reference = (Reference)this.j.n.get(0);
            Socket socket = g.super.a(true, false, false);
            this.j = c2;
            c2.n.add((Object)reference);
            return socket;
        }
        throw new IllegalStateException();
    }

    public void a(c c2, boolean bl) {
        if (this.j == null) {
            this.j = c2;
            this.k = bl;
            c2.n.add((Object)new a((g)this, this.g));
            return;
        }
        throw new IllegalStateException();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(IOException iOException) {
        c c2;
        Socket socket;
        block10 : {
            boolean bl;
            block16 : {
                block13 : {
                    block15 : {
                        block14 : {
                            block11 : {
                                b b2;
                                block12 : {
                                    j j2;
                                    j j3 = j2 = this.d;
                                    // MONITORENTER : j3
                                    if (!(iOException instanceof n)) break block11;
                                    b2 = ((n)iOException).b;
                                    if (b2 != b.g) break block12;
                                    this.i = 1 + this.i;
                                    if (this.i <= 1) break block13;
                                    break block14;
                                }
                                if (b2 == b.h) break block13;
                                break block14;
                            }
                            if (this.j == null || this.j.b() && !(iOException instanceof j.f0.i.a)) break block13;
                            if (this.j.l != 0) break block15;
                            if (this.c != null && iOException != null) {
                                this.h.a(this.c, iOException);
                            }
                        }
                        this.c = null;
                    }
                    bl = true;
                    break block16;
                }
                bl = false;
            }
            c2 = this.j;
            socket = g.super.a(bl, false, true);
            if (this.j == null && this.k) {
                // MONITOREXIT : j3
                break block10;
            }
            c2 = null;
            {
                catch (Throwable throwable) {}
                {
                    // MONITOREXIT : j3
                    throw throwable;
                }
            }
        }
        j.f0.c.a(socket);
        if (c2 == null) return;
        this.f.b(this.e, c2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(boolean bl, j.f0.g.c c2, long l2, IOException iOException) {
        j j2;
        this.f.b(this.e, l2);
        j j3 = j2 = this.d;
        synchronized (j3) {
            if (c2 != null && c2 == this.n) {
                if (!bl) {
                    c c3 = this.j;
                    c3.l = 1 + c3.l;
                }
                c c4 = this.j;
                Socket socket = g.super.a(bl, false, true);
                if (this.j != null) {
                    c4 = null;
                }
                boolean bl2 = this.l;
                // MONITOREXIT [8, 2] lbl13 : w: MONITOREXIT : var17_6
                j.f0.c.a(socket);
                if (c4 != null) {
                    this.f.b(this.e, c4);
                }
                if (iOException != null) {
                    this.f.a(this.e, iOException);
                    return;
                }
                if (bl2) {
                    this.f.a(this.e);
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected ");
            stringBuilder.append((Object)this.n);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)c2);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public c b() {
        g g2 = this;
        synchronized (g2) {
            c c2 = this.j;
            return c2;
        }
    }

    public boolean c() {
        f.a a2;
        return this.c != null || (a2 = this.b) != null && a2.b() || this.h.a();
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d() {
        Socket socket;
        c c2;
        j j2;
        j j3 = j2 = this.d;
        synchronized (j3) {
            c2 = this.j;
            socket = this.a(true, false, false);
            if (this.j != null) {
                c2 = null;
            }
        }
        j.f0.c.a(socket);
        if (c2 != null) {
            this.f.b(this.e, c2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e() {
        Socket socket;
        c c2;
        j j2;
        j j3 = j2 = this.d;
        synchronized (j3) {
            c2 = this.j;
            socket = this.a(false, true, false);
            if (this.j != null) {
                c2 = null;
            }
        }
        j.f0.c.a(socket);
        if (c2 != null) {
            this.f.b(this.e, c2);
            this.f.a(this.e);
        }
    }

    public c0 f() {
        return this.c;
    }

    public String toString() {
        c c2 = this.b();
        if (c2 != null) {
            return c2.toString();
        }
        return this.a.toString();
    }

    public static final class a
    extends WeakReference<g> {
        public final Object a;

        a(g g2, Object object) {
            super((Object)g2);
            this.a = object;
        }
    }

}

