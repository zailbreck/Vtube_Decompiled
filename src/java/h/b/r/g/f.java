/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b.o.b
 *  h.b.r.a.a
 *  h.b.s.a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Future
 *  java.util.concurrent.atomic.AtomicReferenceArray
 */
package h.b.r.g;

import h.b.o.b;
import h.b.s.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class f
extends AtomicReferenceArray<Object>
implements Runnable,
Callable<Object>,
b {
    static final Object c = new Object();
    static final Object d = new Object();
    final Runnable b;

    public f(Runnable runnable, h.b.r.a.a a2) {
        super(2);
        this.b = runnable;
        this.lazySet(0, (Object)a2);
    }

    public void a(Future<?> future) {
        Object object;
        do {
            if ((object = this.get(1)) == d) {
                return;
            }
            if (object != c) continue;
            future.cancel(true);
            return;
        } while (!this.compareAndSet(1, object, future));
    }

    public Object call() {
        this.run();
        return null;
    }

    public void dispose() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        while ((object = this.get(1)) != d && object != (object3 = c)) {
            if (!this.compareAndSet(1, object, object3)) continue;
            if (object == null) break;
            ((Future)object).cancel(true);
            break;
        }
        while ((object4 = this.get(0)) != d && object4 != (object2 = c)) {
            if (object4 == null) {
                return;
            }
            if (!this.compareAndSet(0, object4, object2)) continue;
            ((h.b.r.a.a)object4).a((b)this);
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void run() {
        try {
            this.b.run();
            ** GOTO lbl7
        }
        catch (Throwable throwable) {
            try {
                a.a((Throwable)throwable);
            }
            catch (Throwable throwable) {
                object4 = this.get(0);
                if (object4 != f.c && object4 != null && this.compareAndSet(0, object4, f.d)) {
                    ((h.b.r.a.a)object4).a((b)this);
                }
                while ((object3 = this.get(1)) != f.c) {
                    if (this.compareAndSet(1, object3, f.d) != false) throw throwable;
                }
                throw throwable;
            }
lbl7: // 2 sources:
            object2 = this.get(0);
            if (object2 != f.c && object2 != null && this.compareAndSet(0, object2, f.d)) {
                ((h.b.r.a.a)object2).a((b)this);
            }
            do {
                if ((object = this.get(1)) == f.c) return;
            } while (!this.compareAndSet(1, object, f.d));
            return;
        }
    }
}

