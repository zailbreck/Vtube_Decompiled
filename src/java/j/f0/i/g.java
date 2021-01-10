/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.Socket
 *  java.util.Collection
 *  java.util.LinkedHashMap
 *  java.util.LinkedHashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 *  java.util.concurrent.SynchronousQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package j.f0.i;

import j.f0.i.g;
import j.f0.i.h;
import j.f0.i.l;
import j.f0.i.m;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class g
implements Closeable {
    private static final ExecutorService v;
    final boolean b;
    final h c;
    final Map<Integer, j.f0.i.i> d = new LinkedHashMap();
    final String e;
    int f;
    int g;
    boolean h;
    private final ScheduledExecutorService i;
    private final ExecutorService j;
    final l k;
    private boolean l;
    long m = 0L;
    long n;
    m o = new m();
    final m p = new m();
    boolean q = false;
    final Socket r;
    final j.f0.i.j s;
    final j t;
    final Set<Integer> u = new LinkedHashSet();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, (BlockingQueue)new SynchronousQueue(), j.f0.c.a("OkHttp Http2Connection", true));
        v = threadPoolExecutor;
    }

    g(g g2) {
        boolean bl;
        this.k = g2.f;
        this.b = bl = g2.g;
        this.c = g2.e;
        int n2 = bl ? 1 : 2;
        this.g = n2;
        if (g2.g) {
            this.g = 2 + this.g;
        }
        if (g2.g) {
            this.o.a(7, 16777216);
        }
        this.e = g2.b;
        Object[] arrobject = new Object[]{this.e};
        this.i = new ScheduledThreadPoolExecutor(1, j.f0.c.a(j.f0.c.a("OkHttp %s Writer", arrobject), false));
        if (g2.h != 0) {
            ScheduledExecutorService scheduledExecutorService = this.i;
            j.f0.b b2 = new j.f0.b(false, 0, 0){
                final boolean c;
                final int d;
                final int e;
                {
                    Object[] arrobject = new Object[]{g.this.e, n2, n3};
                    super("OkHttp %s ping %08x%08x", arrobject);
                    this.c = bl;
                    this.d = n2;
                    this.e = n3;
                }

                @Override
                public void b() {
                    g.this.a(this.c, this.d, this.e);
                }
            };
            int n3 = g2.h;
            scheduledExecutorService.scheduleAtFixedRate((Runnable)b2, (long)n3, (long)n3, TimeUnit.MILLISECONDS);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Object[] arrobject2 = new Object[]{this.e};
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60L, timeUnit, (BlockingQueue)linkedBlockingQueue, j.f0.c.a(j.f0.c.a("OkHttp %s Push Observer", arrobject2), true));
        this.j = threadPoolExecutor;
        this.p.a(7, 65535);
        this.p.a(5, 16384);
        this.n = this.p.c();
        this.r = g2.a;
        this.s = new j.f0.i.j(g2.d, this.b);
        this.t = new h.b(new j.f0.i.h(g2.c, this.b)){
            final j.f0.i.h c;
            {
                Object[] arrobject = new Object[]{g.this.e};
                super("OkHttp %s", arrobject);
                this.c = h2;
            }

            private void a(final m m2) {
                try {
                    ScheduledExecutorService scheduledExecutorService = g.this.i;
                    Object[] arrobject = new Object[]{g.this.e};
                    scheduledExecutorService.execute((Runnable)new j.f0.b("OkHttp %s ACK Settings", arrobject){

                        @Override
                        public void b() {
                            try {
                                g.this.s.a(m2);
                                return;
                            }
                            catch (IOException iOException) {
                                g.this.o();
                                return;
                            }
                        }
                    });
                }
                catch (RejectedExecutionException rejectedExecutionException) {}
            }

            @Override
            public void a() {
            }

            @Override
            public void a(int n2, int n3, int n4, boolean bl) {
            }

            @Override
            public void a(int n2, int n3, List<j.f0.i.c> list) {
                g.this.a(n3, list);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void a(int n2, long l2) {
                g g2 = g.this;
                if (n2 == 0) {
                    g g3 = g2;
                    synchronized (g3) {
                        g g4 = g.this;
                        g4.n = l2 + g4.n;
                        g.this.notifyAll();
                        return;
                    }
                }
                j.f0.i.i i2 = g2.a(n2);
                if (i2 != null) {
                    j.f0.i.i i3 = i2;
                    synchronized (i3) {
                        i2.a(l2);
                        return;
                    }
                }
            }

            @Override
            public void a(int n2, j.f0.i.b b2) {
                if (g.this.b(n2)) {
                    g.this.a(n2, b2);
                    return;
                }
                j.f0.i.i i2 = g.this.c(n2);
                if (i2 != null) {
                    i2.c(b2);
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
            public void a(int n2, j.f0.i.b b2, k.f f2) {
                g g2;
                f2.e();
                g g3 = g2 = g.this;
                // MONITORENTER : g3
                j.f0.i.i[] arri = (j.f0.i.i[])g.this.d.values().toArray((Object[])new j.f0.i.i[g.this.d.size()]);
                g.this.h = true;
                // MONITOREXIT : g3
                int n3 = arri.length;
                int n4 = 0;
                while (n4 < n3) {
                    j.f0.i.i i2 = arri[n4];
                    if (i2.c() > n2 && i2.f()) {
                        i2.c(j.f0.i.b.g);
                        g.this.c(i2.c());
                    }
                    ++n4;
                }
                return;
                {
                    catch (Throwable throwable) {}
                    {
                        // MONITOREXIT : g3
                        throw throwable;
                    }
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void a(boolean bl, int n2, int n3) {
                if (bl) {
                    g g2;
                    g g3 = g2 = g.this;
                    synchronized (g3) {
                        g.this.l = false;
                        g.this.notifyAll();
                        return;
                    }
                }
                try {
                    g.this.i.execute((Runnable)new /* invalid duplicate definition of identical inner class */);
                    return;
                }
                catch (RejectedExecutionException rejectedExecutionException) {}
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void a(boolean bl, int n2, int n3, List<j.f0.i.c> list) {
                j.f0.i.i i2;
                g g2;
                if (g.this.b(n2)) {
                    g.this.a(n2, list, bl);
                    return;
                }
                g g3 = g2 = g.this;
                synchronized (g3) {
                    i2 = g.this.a(n2);
                    if (i2 == null) {
                        if (g.this.h) {
                            return;
                        }
                        if (n2 <= g.this.f) {
                            return;
                        }
                        if (n2 % 2 == g.this.g % 2) {
                            return;
                        }
                        final j.f0.i.i i3 = new j.f0.i.i(n2, g.this, false, bl, list);
                        g.this.f = n2;
                        g.this.d.put((Object)n2, (Object)i3);
                        ExecutorService executorService = v;
                        Object[] arrobject = new Object[]{g.this.e, n2};
                        executorService.execute((Runnable)new j.f0.b("OkHttp %s stream %d", arrobject){

                            @Override
                            public void b() {
                                try {
                                    g.this.c.a(i3);
                                    return;
                                }
                                catch (IOException iOException) {
                                    j.f0.j.f f2 = j.f0.j.f.c();
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Http2Connection.Listener failure for ");
                                    stringBuilder.append(g.this.e);
                                    f2.a(4, stringBuilder.toString(), iOException);
                                    try {
                                        i3.a(j.f0.i.b.d);
                                    }
                                    catch (IOException iOException2) {}
                                    return;
                                }
                            }
                        });
                        return;
                    }
                }
                i2.a(list);
                if (bl) {
                    i2.i();
                }
            }

            @Override
            public void a(boolean bl, int n2, k.e e2, int n3) {
                if (g.this.b(n2)) {
                    g.this.a(n2, e2, n3, bl);
                    return;
                }
                j.f0.i.i i2 = g.this.a(n2);
                if (i2 == null) {
                    g.this.c(n2, j.f0.i.b.d);
                    g g2 = g.this;
                    long l2 = n3;
                    g2.f(l2);
                    e2.skip(l2);
                    return;
                }
                i2.a(e2, n3);
                if (bl) {
                    i2.i();
                }
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
            @Override
            public void a(boolean var1, m var2_2) {
                block12 : {
                    var18_4 = var3_3 = g.this;
                    // MONITORENTER : var18_4
                    var5_5 = g.this.p.c();
                    if (var1) {
                        g.this.p.a();
                    }
                    g.this.p.a(var2_2);
                    j.super.a(var2_2);
                    var6_6 = g.this.p.c();
                    if (var6_6 == -1 || var6_6 == var5_5) ** GOTO lbl20
                    var7_7 = var6_6 - var5_5;
                    if (!g.this.q) {
                        g.this.q = true;
                    }
                    var17_8 = g.this.d.isEmpty();
                    var9_9 = null;
                    if (!var17_8) {
                        var9_9 = (j.f0.i.i[])g.this.d.values().toArray((Object[])new j.f0.i.i[g.this.d.size()]);
                    }
                    break block12;
lbl20: // 1 sources:
                    var7_7 = 0L;
                    var9_9 = null;
                }
                var10_10 = g.n();
                var11_11 = new Object[1];
                var12_12 = g.this.e;
                var13_13 = 0;
                var11_11[0] = var12_12;
                var10_10.execute((Runnable)new j.f0.b("OkHttp %s settings", var11_11){

                    @Override
                    public void b() {
                        g g2 = g.this;
                        g2.c.a(g2);
                    }
                });
                // MONITOREXIT : var18_4
                if (var9_9 == null) return;
                if (var7_7 == 0L) return;
                var14_14 = var9_9.length;
                while (var13_13 < var14_14) {
                    var19_15 = var15_16 = var9_9[var13_13];
                    // MONITORENTER : var19_15
                    var15_16.a(var7_7);
                    // MONITOREXIT : var19_15
                    ++var13_13;
                }
                return;
                {
                    catch (Throwable var4_17) {}
                    {
                        // MONITOREXIT : var18_4
                        throw var4_17;
                    }
                }
            }

            /*
             * Exception decompiling
             */
            @Override
            protected void b() {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl30 : GETSTATIC : trying to set 1 previously set to 0
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
                // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
                // org.benf.cfr.reader.entities.g.p(Method.java:396)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
                // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
                // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
                // org.benf.cfr.reader.b.a(Driver.java:128)
                // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
                // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
                // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
                // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
                // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
                // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
                // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
                // java.lang.Thread.run(Thread.java:761)
                throw new IllegalStateException("Decompilation failed");
            }

        };
    }

    private void a(j.f0.b b2) {
        void var3_2 = this;
        synchronized (var3_2) {
            if (!this.a()) {
                this.j.execute((Runnable)b2);
            }
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
    private j.f0.i.i b(int n2, List<j.f0.i.c> list, boolean bl) {
        j.f0.i.j j2;
        boolean bl2 = bl ^ true;
        j.f0.i.j j3 = j2 = this.s;
        // MONITORENTER : j3
        void var13_7 = this;
        // MONITORENTER : var13_7
        if (this.g > 1073741823) {
            this.a(j.f0.i.b.g);
        }
        if (this.h) throw new j.f0.i.a();
        int n3 = this.g;
        this.g = 2 + this.g;
        j.f0.i.i i2 = new j.f0.i.i(n3, (g)this, bl2, false, list);
        boolean bl3 = !bl || this.n == 0L || i2.b == 0L;
        if (i2.g()) {
            this.d.put((Object)n3, (Object)i2);
        }
        // MONITOREXIT : var13_7
        if (n2 == 0) {
            this.s.a(bl2, n3, n2, list);
        } else {
            if (this.b) throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
            this.s.a(n2, n3, list);
        }
        // MONITOREXIT : j3
        if (!bl3) return i2;
        this.s.flush();
        return i2;
    }

    private void o() {
        try {
            this.a(j.f0.i.b.d, j.f0.i.b.d);
        }
        catch (IOException iOException) {}
    }

    j.f0.i.i a(int n2) {
        void var4_2 = this;
        synchronized (var4_2) {
            j.f0.i.i i2 = (j.f0.i.i)this.d.get((Object)n2);
            return i2;
        }
    }

    public j.f0.i.i a(List<j.f0.i.c> list, boolean bl) {
        return g.super.b(0, list, bl);
    }

    void a(int n2, long l2) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.i;
            Object[] arrobject = new Object[]{this.e, n2};
            j.f0.b b2 = new j.f0.b((g)this, "OkHttp Window Update %s stream %d", arrobject, n2, l2){
                final /* synthetic */ int c;
                final /* synthetic */ long d;
                final /* synthetic */ g e;
                {
                    this.e = g2;
                    this.c = n2;
                    this.d = l2;
                    super(string2, arrobject);
                }

                public void b() {
                    try {
                        this.e.s.a(this.c, this.d);
                        return;
                    }
                    catch (IOException iOException) {
                        g.a(this.e);
                        return;
                    }
                }
            };
            scheduledExecutorService.execute((Runnable)b2);
        }
        catch (RejectedExecutionException rejectedExecutionException) {}
    }

    void a(int n2, j.f0.i.b b2) {
        Object[] arrobject = new Object[]{this.e, n2};
        j.f0.b b3 = new j.f0.b((g)this, "OkHttp %s Push Reset[%s]", arrobject, n2, b2){
            final /* synthetic */ int c;
            final /* synthetic */ j.f0.i.b d;
            final /* synthetic */ g e;
            {
                this.e = g2;
                this.c = n2;
                this.d = b2;
                super(string2, arrobject);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void b() {
                g g2;
                this.e.k.a(this.c, this.d);
                g g3 = g2 = this.e;
                synchronized (g3) {
                    this.e.u.remove((Object)this.c);
                    return;
                }
            }
        };
        g.super.a(b3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void a(int n2, List<j.f0.i.c> list) {
        void var8_3 = this;
        synchronized (var8_3) {
            if (this.u.contains((Object)n2)) {
                this.c(n2, j.f0.i.b.d);
                return;
            }
            this.u.add((Object)n2);
        }
        try {
            Object[] arrobject = new Object[]{this.e, n2};
            j.f0.b b2 = new j.f0.b((g)this, "OkHttp %s Push Request[%s]", arrobject, n2, list){
                final /* synthetic */ int c;
                final /* synthetic */ List d;
                final /* synthetic */ g e;
                {
                    this.e = g2;
                    this.c = n2;
                    this.d = list;
                    super(string2, arrobject);
                }

                /*
                 * Exception decompiling
                 */
                public void b(}
        }
        java.lang.IllegalStateException: Parameters not created
        
        