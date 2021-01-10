/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.io.IOException
 *  java.io.InterruptedIOException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.SocketTimeoutException
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package j.f0.i;

import j.f0.i.g;
import j.f0.i.m;
import j.f0.i.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k.e;
import k.r;
import k.s;
import k.t;

public final class i {
    long a = 0L;
    long b;
    final int c;
    final g d;
    private List<j.f0.i.c> e;
    private boolean f;
    private final b g;
    final a h;
    final c i = new k.a(){

        @Override
        protected IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause((Throwable)iOException);
            }
            return socketTimeoutException;
        }

        @Override
        protected void i() {
            i.this.b(j.f0.i.b.h);
        }

        public void k() {
            if (!this.h()) {
                return;
            }
            throw this.b(null);
        }
    };
    final c j = new /* invalid duplicate definition of identical inner class */;
    j.f0.i.b k = null;

    i(int n2, g g2, boolean bl, boolean bl2, List<j.f0.i.c> list) {
        if (g2 != null) {
            if (list != null) {
                this.c = n2;
                this.d = g2;
                this.b = g2.p.c();
                this.g = new s(g2.o.c()){
                    private final k.c b = new k.c();
                    private final k.c c = new k.c();
                    private final long d;
                    boolean e;
                    boolean f;
                    {
                        this.d = l2;
                    }

                    private void a() {
                        i.this.i.g();
                        try {
                            while (this.c.p() == 0L && !this.f && !this.e && i.this.k == null) {
                                i.this.k();
                            }
                        }
                        catch (Throwable throwable) {
                            i.this.i.k();
                            throw throwable;
                        }
                        i.this.i.k();
                    }

                    private void e(long l2) {
                        i.this.d.f(l2);
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     * Converted monitor instructions to comments
                     * Lifted jumps to return sites
                     */
                    @Override
                    public long a(k.c c2, long l2) {
                        i i2;
                        long l3;
                        if (l2 < 0L) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("byteCount < 0: ");
                            stringBuilder.append(l2);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        i i3 = i2 = i.this;
                        // MONITORENTER : i3
                        b.super.a();
                        if (this.e) throw new IOException("stream closed");
                        j.f0.i.b b2 = i.this.k;
                        if (this.c.p() > 0L) {
                            l3 = this.c.a(c2, Math.min((long)l2, (long)this.c.p()));
                            i i4 = i.this;
                            i4.a = l3 + i4.a;
                        } else {
                            l3 = -1L;
                        }
                        if (b2 == null && i.this.a >= (long)(i.this.d.o.c() / 2)) {
                            i.this.d.a(i.this.c, i.this.a);
                            i.this.a = 0L;
                        }
                        // MONITOREXIT : i3
                        if (l3 != -1L) {
                            b.super.e(l3);
                            return l3;
                        }
                        if (b2 != null) throw new n(b2);
                        return -1L;
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     * Converted monitor instructions to comments
                     * Lifted jumps to return sites
                     */
                    void a(e e2, long l2) {
                        while (l2 > 0L) {
                            i i2;
                            i i3;
                            i i4 = i2 = i.this;
                            // MONITORENTER : i4
                            boolean bl = this.f;
                            long l3 = l2 + this.c.p();
                            long l4 = this.d;
                            boolean bl2 = true;
                            boolean bl3 = l3 > l4;
                            // MONITOREXIT : i4
                            if (bl3) {
                                e2.skip(l2);
                                i.this.b(j.f0.i.b.f);
                                return;
                            }
                            if (bl) {
                                e2.skip(l2);
                                return;
                            }
                            long l5 = e2.a(this.b, l2);
                            if (l5 == -1L) throw new EOFException();
                            l2 -= l5;
                            i i5 = i3 = i.this;
                            // MONITORENTER : i5
                            if (this.c.p() != 0L) {
                                bl2 = false;
                            }
                            this.c.a(this.b);
                            if (bl2) {
                                i.this.notifyAll();
                            }
                            // MONITOREXIT : i5
                        }
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     * Converted monitor instructions to comments
                     * Lifted jumps to return sites
                     */
                    @Override
                    public void close() {
                        i i2;
                        i i3 = i2 = i.this;
                        // MONITORENTER : i3
                        this.e = true;
                        long l2 = this.c.p();
                        this.c.a();
                        i.this.notifyAll();
                        // MONITOREXIT : i3
                        if (l2 > 0L) {
                            this.e(l2);
                        }
                        i.this.a();
                    }

                    @Override
                    public t d() {
                        return i.this.i;
                    }
                };
                this.h = new r(){
                    private final k.c b = new k.c();
                    boolean c;
                    boolean d;

                    /*
                     * Loose catch block
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     * Converted monitor instructions to comments
                     * Lifted jumps to return sites
                     */
                    private void a(boolean bl) {
                        i i2;
                        i i3 = i2 = i.this;
                        // MONITORENTER : i3
                        i.this.j.g();
                        while (i.this.b <= 0L && !this.d && !this.c && i.this.k == null) {
                            i.this.k();
                        }
                        i.this.j.k();
                        i.this.b();
                        long l2 = Math.min((long)i.this.b, (long)this.b.p());
                        i i4 = i.this;
                        i4.b -= l2;
                        // MONITOREXIT : i3
                        {
                            catch (Throwable throwable) {
                                // MONITOREXIT : i3
                                throw throwable;
                            }
                        }
                        i.this.j.g();
                        try {
                            g g2 = i.this.d;
                            int n2 = i.this.c;
                            boolean bl2 = bl && l2 == this.b.p();
                            g2.a(n2, bl2, this.b, l2);
                            return;
                        }
                        finally {
                            i.this.j.k();
                        }
                        catch (Throwable throwable) {
                            i.this.j.k();
                            throw throwable;
                        }
                    }

                    @Override
                    public void b(k.c c2, long l2) {
                        this.b.b(c2, l2);
                        while (this.b.p() >= 16384L) {
                            a.super.a(false);
                        }
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
                    @Override
                    public void close() {
                        i i2;
                        block11 : {
                            i i3;
                            i i4 = i3 = i.this;
                            // MONITORENTER : i4
                            if (this.c) {
                                // MONITOREXIT : i4
                                return;
                            }
                            // MONITOREXIT : i4
                            if (i.this.h.d) break block11;
                            if (this.b.p() > 0L) {
                                while (this.b.p() > 0L) {
                                    this.a(true);
                                }
                            } else {
                                i i5 = i.this;
                                i5.d.a(i5.c, true, null, 0L);
                            }
                        }
                        i i6 = i2 = i.this;
                        // MONITORENTER : i6
                        this.c = true;
                        // MONITOREXIT : i6
                        i.this.d.flush();
                        i.this.a();
                        return;
                        {
                            catch (Throwable throwable) {}
                            {
                                // MONITOREXIT : i4
                                throw throwable;
                            }
                        }
                    }

                    @Override
                    public t d() {
                        return i.this.j;
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
                    @Override
                    public void flush() {
                        i i2;
                        i i3 = i2 = i.this;
                        // MONITORENTER : i3
                        i.this.b();
                        // MONITOREXIT : i3
                        while (this.b.p() > 0L) {
                            this.a(false);
                            i.this.d.flush();
                        }
                        return;
                        {
                            catch (Throwable throwable) {}
                            {
                                // MONITOREXIT : i3
                                throw throwable;
                            }
                        }
                    }
                };
                this.g.f = bl2;
                this.h.d = bl;
                return;
            }
            throw new NullPointerException("requestHeaders == null");
        }
        throw new NullPointerException("connection == null");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean d(j.f0.i.b b2) {
        void var4_2 = this;
        synchronized (var4_2) {
            if (this.k != null) {
                return false;
            }
            if (this.g.f && this.h.d) {
                return false;
            }
            this.k = b2;
            this.notifyAll();
        }
        this.d.c(this.c);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void a() {
        i i2 = this;
        // MONITORENTER : i2
        boolean bl = !this.g.f && this.g.e && (this.h.d || this.h.c);
        boolean bl2 = this.g();
        // MONITOREXIT : i2
        if (bl) {
            this.a(j.f0.i.b.h);
            return;
        }
        if (bl2) return;
        this.d.c(this.c);
    }

    void a(long l2) {
        this.b = l2 + this.b;
        if (l2 > 0L) {
            this.notifyAll();
        }
    }

    public void a(j.f0.i.b b2) {
        if (!i.super.d(b2)) {
            return;
        }
        this.d.b(this.c, b2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void a(List<j.f0.i.c> list) {
        boolean bl;
        void var9_2 = this;
        // MONITORENTER : var9_2
        this.f = bl = true;
        if (this.e == null) {
            this.e = list;
            bl = this.g();
            this.notifyAll();
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.e);
            arrayList.add(null);
            arrayList.addAll(list);
            this.e = arrayList;
        }
        // MONITOREXIT : var9_2
        if (bl) return;
        this.d.c(this.c);
    }

    void a(e e2, int n2) {
        this.g.a(e2, (long)n2);
    }

    void b() {
        a a2 = this.h;
        if (!a2.c) {
            if (!a2.d) {
                j.f0.i.b b2 = this.k;
                if (b2 == null) {
                    return;
                }
                throw new n(b2);
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public void b(j.f0.i.b b2) {
        if (!i.super.d(b2)) {
            return;
        }
        this.d.c(this.c, b2);
    }

    public int c() {
        return this.c;
    }

    void c(j.f0.i.b b2) {
        void var3_2 = this;
        synchronized (var3_2) {
            if (this.k == null) {
                this.k = b2;
                this.notifyAll();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public r d() {
        i i2 = this;
        synchronized (i2) {
            if (!this.f && !this.f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
            return this.h;
        }
    }

    public s e() {
        return this.g;
    }

    public boolean f() {
        boolean bl = (1 & this.c) == 1;
        return this.d.b == bl;
    }

    public boolean g() {
        i i2 = this;
        synchronized (i2) {
            block5 : {
                boolean bl;
                block4 : {
                    j.f0.i.b b2 = this.k;
                    if (b2 == null) break block4;
                    return false;
                }
                if (!this.g.f && !this.g.e || !this.h.d && !this.h.c || !(bl = this.f)) break block5;
                return false;
            }
            return true;
        }
    }

    public t h() {
        return this.i;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void i() {
        i i2 = this;
        // MONITORENTER : i2
        this.g.f = true;
        boolean bl = this.g();
        this.notifyAll();
        // MONITOREXIT : i2
        if (bl) return;
        this.d.c(this.c);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public List<j.f0.i.c> j() {
        i i2 = this;
        // MONITORENTER : i2
        if (!this.f()) throw new IllegalStateException("servers cannot read response headers");
        this.i.g();
        while (this.e == null && this.k == null) {
            this.k();
        }
        {
            catch (Throwable throwable) {
                this.i.k();
                throw throwable;
            }
        }
        this.i.k();
        List<j.f0.i.c> list = this.e;
        if (list == null) throw new n(this.k);
        this.e = null;
        // MONITOREXIT : i2
        return list;
    }

    void k() {
        try {
            this.wait();
            return;
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public t l() {
        return this.j;
    }

}

