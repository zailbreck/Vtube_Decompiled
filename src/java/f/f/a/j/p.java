/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Thread$State
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicInteger
 */
package f.f.a.j;

import f.f.a.e.f.h;
import f.f.a.j.m;
import f.f.a.j.o;
import f.f.a.j.q;
import f.f.a.j.r;
import f.f.a.j.s;
import java.util.concurrent.atomic.AtomicInteger;

public class p {
    public static final String j = "p";
    private final s a;
    private final f.f.a.j.b b;
    private final Object c = new Object();
    private final Object d = new Object();
    private final AtomicInteger e;
    private volatile Thread f;
    protected volatile boolean g;
    protected volatile boolean h = false;
    private volatile int i = -1;

    public p(s s2, f.f.a.j.b b2) {
        o.a(s2);
        this.a = s2;
        o.a(b2);
        this.b = b2;
        this.e = new AtomicInteger();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(long l2, long l3) {
        Object object;
        float f2 = 100.0f * ((float)l2 / (float)l3);
        if (!(f2 < 100.0f)) {
            return;
        }
        boolean bl = true;
        boolean bl2 = l3 == 0L;
        int n2 = bl2 ? 100 : (int)f2;
        boolean bl3 = n2 != this.i;
        if (l3 < 0L) {
            bl = false;
        }
        if (bl && bl3) {
            this.a(n2);
        }
        this.i = n2;
        Object object2 = object = this.c;
        synchronized (object2) {
            this.c.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static /* synthetic */ void a(p p2) {
        int n2;
        byte[] arrby;
        h.d("VideoCache baifenbi", "\u5f00\u8fdb\u8fdb\u6765");
        long l2 = -1L;
        long l3 = 0L;
        try {
            l3 = p2.b.a();
            p2.a.a(l3);
            l2 = p2.a.a();
            arrby = new byte[8192];
            h.d("VideoCache baifenbi", "\u5230try\u91cc\u9762");
            while ((n2 = p2.a.a(arrby)) != -1) {
                Object object;
                Object object2 = object = p2.d;
                // MONITORENTER : object2
            }
        }
        catch (Throwable throwable) {
            p2.e.incrementAndGet();
            h.d("VideoCache", "eleleleleelelelelel");
            p2.a(throwable);
            return;
            finally {
                p2.d();
                h.d("VideoCache", "finallyeleleleleelelelelel");
                p2.a(l3, l2);
            }
        }
        {
            if (p2.c()) {
                // MONITOREXIT : object2
                return;
            }
            p2.b.a(arrby, n2);
            // MONITOREXIT : object2
            l3 += (long)n2;
            p2.a(l3, l2);
            continue;
        }
        {
            Object object;
            Object object3 = object = p2.d;
            // MONITORENTER : object3
        }
        if (!p2.c() && p2.b.a() == p2.a.a()) {
            p2.b.c();
        }
        // MONITOREXIT : object3
        p2.i = 100;
        p2.h = false;
        p2.a(p2.i);
    }

    private void a(Throwable throwable) {
        if (throwable instanceof m) {
            h.b(j, "ProxyCache is interrupted");
            return;
        }
        h.b(j, "ProxyCache error", throwable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b() {
        p p2 = this;
        synchronized (p2) {
            boolean bl = this.f != null && this.f.getState() != Thread.State.TERMINATED;
            if (!(this.g || this.b.e() || bl)) {
                b b2 = new b(this, null);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Source reader for ");
                stringBuilder.append((Object)this.a);
                this.f = new Thread((Runnable)b2, stringBuilder.toString());
                this.f.start();
            }
            return;
        }
    }

    private boolean c() {
        return Thread.currentThread().isInterrupted() || this.g;
        {
        }
    }

    private void d() {
        try {
            h.b(j, "close sources!");
            this.a.b();
            return;
        }
        catch (q q2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error closing source ");
            stringBuilder.append((Object)this.a);
            this.a((Throwable)new q(stringBuilder.toString(), (Throwable)q2));
            return;
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
    public final int a(byte[] arrby, long l2, int n2) {
        r.a(arrby, l2, n2);
        while (!this.b.e() && this.b.a() < l2 + (long)n2 && !this.g) {
            Object object;
            p.super.b();
            Object object2 = object = this.c;
            // MONITORENTER : object2
            this.c.wait(1000L);
            // MONITOREXIT : object2
            int n3 = this.e.get();
            if (n3 < 1) continue;
            this.e.set(0);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error reading source ");
            stringBuilder.append(n3);
            stringBuilder.append(" times");
            throw new q(stringBuilder.toString());
        }
        int n4 = this.b.a(arrby, l2, n2);
        if (!this.b.e()) return n4;
        if (this.i == 100) return n4;
        this.i = 100;
        this.a(100);
        return n4;
        {
            catch (Throwable throwable) {
                throw throwable;
            }
            catch (InterruptedException interruptedException) {}
            {
                throw new q("Waiting source data is interrupted!", interruptedException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object;
        Object object2 = object = this.d;
        synchronized (object2) {
            String string = j;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Shutdown proxy for ");
            stringBuilder.append((Object)this.a);
            h.b(string, stringBuilder.toString());
            try {
                this.g = true;
                if (this.f != null) {
                    this.f.interrupt();
                }
                this.b.b();
            }
            catch (q q2) {
                this.a((Throwable)q2);
            }
            return;
        }
    }

    protected void a(int n2) {
        throw null;
    }

    public final void a(boolean bl) {
        this.h = bl;
    }

    public final void b(boolean bl) {
        this.g = bl;
    }

    private final class b
    implements Runnable {
        final /* synthetic */ p b;

        private b(p p2) {
            this.b = p2;
        }

        /* synthetic */ b(p p2, a a2) {
            super(p2);
        }

        public final void run() {
            if (this.b.h) {
                p.a(this.b);
            }
        }
    }

}

