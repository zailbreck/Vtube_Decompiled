/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.util.concurrent.TimeUnit
 */
package h.b;

import java.util.concurrent.TimeUnit;

public abstract class h {
    static {
        TimeUnit.MINUTES.toNanos(Long.getLong((String)"rx2.scheduler.drift-tolerance", (long)15L).longValue());
    }

    public abstract b a();

    public h.b.o.b a(Runnable runnable) {
        return this.a(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public h.b.o.b a(Runnable runnable, long l2, TimeUnit timeUnit) {
        b b2 = this.a();
        b2.a(new Runnable((h)this, h.b.s.a.a(runnable), b2){
            final /* synthetic */ Runnable b;
            final /* synthetic */ b c;
            {
                this.b = runnable;
                this.c = b2;
            }

            public void run() {
                try {
                    this.b.run();
                    return;
                }
                finally {
                    this.c.dispose();
                }
            }
        }, l2, timeUnit);
        return b2;
    }

}

