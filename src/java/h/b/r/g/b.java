/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b.h
 *  h.b.r.g.b$a
 *  h.b.r.g.b$b
 *  h.b.r.g.b$c
 *  h.b.r.g.e
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicReference
 */
package h.b.r.g;

import h.b.h;
import h.b.r.g.b;
import h.b.r.g.e;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Exception performing whole class analysis.
 */
public final class b
extends h {
    static final e b;
    static final e c;
    private static final TimeUnit d;
    static final c e;
    static final a f;
    final AtomicReference<a> a;

    static {
        d = TimeUnit.SECONDS;
        f = new /* Unavailable Anonymous Inner Class!! */;
        f.d();
        e = new /* Unavailable Anonymous Inner Class!! */;
        e.dispose();
        int n2 = Math.max((int)1, (int)Math.min((int)10, (int)Integer.getInteger((String)"rx2.io-priority", (int)5)));
        b = new e("RxCachedThreadScheduler", n2);
        c = new e("RxCachedWorkerPoolEvictor", n2);
    }

    public b() {
        this.a = new AtomicReference((Object)f);
        this.b();
    }

    public h.b a() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public void b() {
        a a2 = new /* Unavailable Anonymous Inner Class!! */;
        if (!this.a.compareAndSet((Object)f, (Object)a2)) {
            a2.d();
        }
    }
}

