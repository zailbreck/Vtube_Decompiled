/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b.o.d
 *  h.b.o.f
 *  h.b.r.a.c
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Future
 */
package h.b.o;

import h.b.o.b;
import h.b.o.d;
import h.b.o.f;
import java.util.concurrent.Future;

public final class c {
    public static b a() {
        return h.b.r.a.c.b;
    }

    public static b a(Runnable runnable) {
        h.b.r.b.b.a(runnable, "run is null");
        return new f(runnable);
    }

    public static b a(Future<?> future) {
        h.b.r.b.b.a(future, "future is null");
        return c.a(future, true);
    }

    public static b a(Future<?> future, boolean bl) {
        h.b.r.b.b.a(future, "future is null");
        return new d(future, bl);
    }
}

