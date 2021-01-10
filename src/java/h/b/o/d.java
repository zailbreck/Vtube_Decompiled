/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Future
 */
package h.b.o;

import h.b.o.e;
import java.util.concurrent.Future;

final class d
extends e<Future<?>> {
    private final boolean b;

    d(Future<?> future, boolean bl) {
        super(future);
        this.b = bl;
    }

    @Override
    protected void a(Future<?> future) {
        future.cancel(this.b);
    }
}

