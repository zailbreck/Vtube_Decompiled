/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b.g
 *  h.b.o.b
 *  h.b.p.a
 *  h.b.p.b
 *  h.b.q.a
 *  h.b.q.d
 *  h.b.s.a
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReference
 */
package h.b.r.d;

import h.b.g;
import h.b.q.d;
import h.b.r.a.b;
import h.b.s.a;
import java.util.concurrent.atomic.AtomicReference;

public final class c<T>
extends AtomicReference<h.b.o.b>
implements g<T>,
h.b.o.b {
    final d<? super T> b;
    final d<? super Throwable> c;
    final h.b.q.a d;
    final d<? super h.b.o.b> e;

    public c(d<? super T> d2, d<? super Throwable> d3, h.b.q.a a2, d<? super h.b.o.b> d4) {
        this.b = d2;
        this.c = d3;
        this.d = a2;
        this.e = d4;
    }

    public void a() {
        if (!this.b()) {
            this.dispose();
            try {
                this.d.run();
                return;
            }
            catch (Throwable throwable) {
                h.b.p.b.b((Throwable)throwable);
                a.a((Throwable)throwable);
            }
        }
    }

    public void a(h.b.o.b b2) {
        if (b.a((AtomicReference<h.b.o.b>)this, b2)) {
            try {
                this.e.a((Object)this);
                return;
            }
            catch (Throwable throwable) {
                h.b.p.b.b((Throwable)throwable);
                this.a(throwable);
            }
        }
    }

    public void a(Throwable throwable) {
        if (!this.b()) {
            this.dispose();
            try {
                this.c.a((Object)throwable);
                return;
            }
            catch (Throwable throwable2) {
                h.b.p.b.b((Throwable)throwable2);
                a.a((Throwable)new h.b.p.a(new Throwable[]{throwable, throwable2}));
            }
        }
    }

    public void b(T t2) {
        if (!this.b()) {
            try {
                this.b.a(t2);
                return;
            }
            catch (Throwable throwable) {
                h.b.p.b.b((Throwable)throwable);
                this.a(throwable);
            }
        }
    }

    public boolean b() {
        return this.get() == b.b;
    }

    public void dispose() {
        b.a(this);
    }
}

