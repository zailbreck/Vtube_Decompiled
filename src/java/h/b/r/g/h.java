/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b.h
 *  h.b.o.b
 *  h.b.o.c
 *  h.b.r.a.c
 *  h.b.r.g.e
 *  h.b.r.g.g
 *  h.b.r.g.h$a
 *  h.b.s.a
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicReference
 */
package h.b.r.g;

import h.b.h;
import h.b.o.b;
import h.b.o.c;
import h.b.r.g.e;
import h.b.r.g.g;
import h.b.r.g.h;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Exception performing whole class analysis.
 */
public final class h
extends h.b.h {
    static final e b;
    static final ScheduledExecutorService c;
    final AtomicReference<ScheduledExecutorService> a;

    static {
        c = Executors.newScheduledThreadPool((int)0);
        c.shutdown();
        b = new e("RxSingleScheduler", Math.max((int)1, (int)Math.min((int)10, (int)Integer.getInteger((String)"rx2.single-priority", (int)5))));
    }

    public h() {
        this.a = new AtomicReference();
        this.a.lazySet((Object)h.b());
    }

    static ScheduledExecutorService b() {
        return g.a((ThreadFactory)b);
    }

    public h.b a() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public b a(Runnable var1_1, long var2_3, TimeUnit var4) {
        var5_4 = h.b.s.a.a((Runnable)var1_1);
        if (var2_3 > 0L) ** GOTO lbl6
        try {
            var7_5 = ((ScheduledExecutorService)this.a.get()).submit(var5_4);
            return c.a((Future)var7_5);
lbl6: // 1 sources:
            var7_5 = ((ScheduledExecutorService)this.a.get()).schedule(var5_4, var2_3, var4);
            return c.a((Future)var7_5);
        }
        catch (RejectedExecutionException var6_7) {
            h.b.s.a.a((Throwable)var6_7);
            return h.b.r.a.c.b;
        }
    }
}

