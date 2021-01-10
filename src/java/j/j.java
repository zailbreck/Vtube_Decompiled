/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.Reference
 *  java.net.Socket
 *  java.util.ArrayDeque
 *  java.util.Deque
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Executor
 *  java.util.concurrent.SynchronousQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package j;

import j.c0;
import j.f0.f.c;
import j.f0.f.d;
import j.f0.f.g;
import j.f0.j.f;
import j.s;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class j {
    private static final Executor g;
    private final int a;
    private final long b;
    private final Runnable c;
    private final Deque<c> d;
    final d e;
    boolean f;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, (BlockingQueue)new SynchronousQueue(), j.f0.c.a("OkHttp ConnectionPool", true));
        g = threadPoolExecutor;
    }

    public j() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public j(int n2, long l2, TimeUnit timeUnit) {
        this.c = new Runnable(){

            /*
             * Exception decompiling
             */
            public void run() {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl41.1 : ALOAD : trying to set 1 previously set to 0
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
        this.d = new ArrayDeque();
        this.e = new d();
        this.a = n2;
        this.b = timeUnit.toNanos(l2);
        if (l2 > 0L) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("keepAliveDuration <= 0: ");
        stringBuilder.append(l2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private int a(c c2, long l2) {
        List<Reference<g>> list = c2.n;
        int n2 = 0;
        while (n2 < list.size()) {
            Reference reference = (Reference)list.get(n2);
            if (reference.get() != null) {
                ++n2;
                continue;
            }
            g.a a2 = (g.a)reference;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("A connection to ");
            stringBuilder.append((Object)c2.c().a().k());
            stringBuilder.append(" was leaked. Did you forget to close a response body?");
            String string2 = stringBuilder.toString();
            f.c().a(string2, a2.a);
            list.remove(n2);
            c2.k = true;
            if (!list.isEmpty()) continue;
            c2.o = l2 - this.b;
            return 0;
        }
        return list.size();
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
    long a(long l2) {
        void var18_2 = this;
        // MONITORENTER : var18_2
        Iterator iterator = this.d.iterator();
        long l3 = Long.MIN_VALUE;
        c c2 = null;
        int n2 = 0;
        int n3 = 0;
        while (iterator.hasNext()) {
            c c3 = (c)iterator.next();
            if (j.super.a(c3, l2) > 0) {
                ++n3;
                continue;
            }
            ++n2;
            long l4 = l2 - c3.o;
            if (l4 <= l3) continue;
            c2 = c3;
            l3 = l4;
        }
        if (l3 < this.b && n2 <= this.a) {
            if (n2 > 0) {
                long l5 = this.b - l3;
                // MONITOREXIT : var18_2
                return l5;
            }
            if (n3 > 0) {
                long l6 = this.b;
                // MONITOREXIT : var18_2
                return l6;
            }
            this.f = false;
            // MONITOREXIT : var18_2
            return -1L;
        }
        this.d.remove(c2);
        // MONITOREXIT : var18_2
        {
            catch (Throwable throwable) {}
            {
                // MONITOREXIT : var18_2
                throw throwable;
            }
        }
        j.f0.c.a(c2.d());
        return 0L;
    }

    c a(j.a a2, g g2, c0 c02) {
        for (c c2 : this.d) {
            if (!c2.a(a2, c02)) continue;
            g2.a(c2, true);
            return c2;
        }
        return null;
    }

    Socket a(j.a a2, g g2) {
        for (c c2 : this.d) {
            if (!c2.a(a2, null) || !c2.b() || c2 == g2.b()) continue;
            return g2.a(c2);
        }
        return null;
    }

    boolean a(c c2) {
        if (!c2.k && this.a != 0) {
            this.notifyAll();
            return false;
        }
        this.d.remove((Object)c2);
        return true;
    }

    void b(c c2) {
        if (!this.f) {
            this.f = true;
            g.execute(this.c);
        }
        this.d.add((Object)c2);
    }

}

