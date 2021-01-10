/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b.k
 *  h.b.o.b
 *  h.b.p.a
 *  h.b.p.b
 *  h.b.q.d
 *  h.b.s.a
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReference
 */
package h.b.r.d;

import h.b.k;
import h.b.q.d;
import h.b.s.a;
import java.util.concurrent.atomic.AtomicReference;

public final class b<T>
extends AtomicReference<h.b.o.b>
implements k<T>,
h.b.o.b {
    final d<? super T> b;
    final d<? super Throwable> c;

    public b(d<? super T> d2, d<? super Throwable> d3) {
        this.b = d2;
        this.c = d3;
    }

    public void a(h.b.o.b b2) {
        h.b.r.a.b.a((AtomicReference<h.b.o.b>)this, b2);
    }

    public void a(Throwable throwable) {
        try {
            this.c.a((Object)throwable);
            return;
        }
        catch (Throwable throwable2) {
            h.b.p.b.b((Throwable)throwable2);
            a.a((Throwable)new h.b.p.a(new Throwable[]{throwable, throwable2}));
            return;
        }
    }

    public void dispose() {
        h.b.r.a.b.a(this);
    }

    public void onSuccess(T t2) {
        try {
            this.b.a(t2);
            return;
        }
        catch (Throwable throwable) {
            h.b.p.b.b((Throwable)throwable);
            a.a((Throwable)throwable);
            return;
        }
    }
}

