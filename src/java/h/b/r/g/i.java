/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b.h
 *  h.b.o.b
 *  h.b.r.a.c
 *  h.b.r.g.i$c
 *  h.b.s.a
 *  java.lang.InterruptedException
 *  java.lang.Runnable
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.concurrent.TimeUnit
 */
package h.b.r.g;

import h.b.h;
import h.b.o.b;
import h.b.r.g.i;
import h.b.s.a;
import java.util.concurrent.TimeUnit;

/*
 * Exception performing whole class analysis.
 */
public final class i
extends h {
    private static final i a;

    static {
        a = new i();
    }

    i() {
    }

    public static i b() {
        return a;
    }

    public h.b a() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public b a(Runnable runnable) {
        runnable.run();
        return h.b.r.a.c.b;
    }

    public b a(Runnable runnable, long l2, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(l2);
            runnable.run();
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            a.a((Throwable)interruptedException);
        }
        return h.b.r.a.c.b;
    }
}

