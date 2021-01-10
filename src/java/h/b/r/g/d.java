/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Runnable
 *  java.util.List
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Future
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.TimeUnit
 */
package h.b.r.g;

import h.b.h;
import h.b.o.b;
import h.b.o.c;
import h.b.r.g.f;
import h.b.r.g.g;
import h.b.s.a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class d
extends h.b
implements b {
    private final ScheduledExecutorService b;
    volatile boolean c;

    public d(ThreadFactory threadFactory) {
        this.b = g.a(threadFactory);
    }

    @Override
    public b a(Runnable runnable) {
        return this.a(runnable, 0L, null);
    }

    @Override
    public b a(Runnable runnable, long l2, TimeUnit timeUnit) {
        if (this.c) {
            return h.b.r.a.c.b;
        }
        return this.a(runnable, l2, timeUnit, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public f a(Runnable var1_1, long var2_4, TimeUnit var4, h.b.r.a.a var5_3) {
        var6_5 = new f(a.a(var1_1), var5_3);
        if (var5_3 != null && !var5_3.c(var6_5)) {
            return var6_5;
        }
        if (var2_4 > 0L) ** GOTO lbl8
        try {
            block3 : {
                var9_6 = this.b.submit((Callable)var6_5);
                break block3;
lbl8: // 1 sources:
                var9_6 = this.b.schedule((Callable)var6_5, var2_4, var4);
            }
            var6_5.a(var9_6);
            return var6_5;
        }
        catch (RejectedExecutionException var7_7) {
            var5_3.b(var6_5);
            a.a(var7_7);
            return var6_5;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public b b(Runnable var1_1, long var2_3, TimeUnit var4) {
        var5_4 = a.a(var1_1);
        if (var2_3 > 0L) ** GOTO lbl6
        try {
            var7_5 = this.b.submit(var5_4);
            return c.a(var7_5);
lbl6: // 1 sources:
            var7_5 = this.b.schedule(var5_4, var2_3, var4);
            return c.a(var7_5);
        }
        catch (RejectedExecutionException var6_7) {
            a.a(var6_7);
            return h.b.r.a.c.b;
        }
    }

    @Override
    public void dispose() {
        if (!this.c) {
            this.c = true;
            this.b.shutdownNow();
        }
    }
}

