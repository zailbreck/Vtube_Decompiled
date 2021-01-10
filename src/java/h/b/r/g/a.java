/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b.h
 *  h.b.o.b
 *  h.b.r.g.a$a
 *  h.b.r.g.a$b
 *  h.b.r.g.a$c
 *  h.b.r.g.e
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.String
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicReference
 */
package h.b.r.g;

import h.b.h;
import h.b.r.g.a;
import h.b.r.g.e;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Exception performing whole class analysis.
 */
public final class a
extends h {
    static final b b;
    static final e c;
    static final int d;
    static final c e;
    final AtomicReference<b> a;

    static {
        b = new /* Unavailable Anonymous Inner Class!! */;
        d = a.a(Runtime.getRuntime().availableProcessors(), Integer.getInteger((String)"rx2.computation-threads", (int)0));
        e = new /* Unavailable Anonymous Inner Class!! */;
        e.dispose();
        c = new e("RxComputationThreadPool", Math.max((int)1, (int)Math.min((int)10, (int)Integer.getInteger((String)"rx2.computation-priority", (int)5))));
    }

    public a() {
        this.a = new AtomicReference((Object)b);
        this.b();
    }

    static int a(int n2, int n3) {
        if (n3 > 0) {
            if (n3 > n2) {
                return n2;
            }
            n2 = n3;
        }
        return n2;
    }

    public h.b a() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public h.b.o.b a(Runnable runnable, long l2, TimeUnit timeUnit) {
        return (this.a.get()).a().b(runnable, l2, timeUnit);
    }

    public void b() {
        b b2 = new /* Unavailable Anonymous Inner Class!! */;
        if (!this.a.compareAndSet((Object)b, (Object)b2)) {
            b2.b();
        }
    }
}

