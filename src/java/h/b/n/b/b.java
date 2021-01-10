/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  h.b.h
 *  h.b.n.b.b$a
 *  h.b.o.b
 *  h.b.s.a
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.util.concurrent.TimeUnit
 */
package h.b.n.b;

import android.os.Handler;
import h.b.h;
import h.b.n.b.b;
import java.util.concurrent.TimeUnit;

/*
 * Exception performing whole class analysis.
 */
final class b
extends h {
    private final Handler a;

    b(Handler handler) {
        this.a = handler;
    }

    public h.b a() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public h.b.o.b a(Runnable runnable, long l2, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit != null) {
                Runnable runnable2 = h.b.s.a.a((Runnable)runnable);
                b b2 = new b(this.a, runnable2);
                this.a.postDelayed((Runnable)b2, Math.max((long)0L, (long)timeUnit.toMillis(l2)));
                return b2;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }

    private static final class b
    implements Runnable,
    h.b.o.b {
        private final Handler b;
        private final Runnable c;

        b(Handler handler, Runnable runnable) {
            this.b = handler;
            this.c = runnable;
        }

        public void dispose() {
            this.b.removeCallbacks((Runnable)this);
        }

        public void run() {
            try {
                this.c.run();
                return;
            }
            catch (Throwable throwable) {
                IllegalStateException illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.", throwable);
                h.b.s.a.a((Throwable)illegalStateException);
                Thread thread = Thread.currentThread();
                thread.getUncaughtExceptionHandler().uncaughtException(thread, (Throwable)illegalStateException);
                return;
            }
        }
    }

}

