/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b.o.b
 *  h.b.r.b.b
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicReference
 */
package h.b.o;

import h.b.o.b;
import java.util.concurrent.atomic.AtomicReference;

abstract class e<T>
extends AtomicReference<T>
implements b {
    e(T t2) {
        h.b.r.b.b.a(t2, (String)"value is null");
        super(t2);
    }

    protected abstract void a(T var1);

    public final boolean a() {
        return this.get() == null;
    }

    public final void dispose() {
        Object object;
        if (this.get() != null && (object = this.getAndSet(null)) != null) {
            this.a(object);
        }
    }
}

