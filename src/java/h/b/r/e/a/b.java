/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReference
 */
package h.b.r.e.a;

import h.b.c;
import h.b.d;
import h.b.e;
import h.b.g;
import java.util.concurrent.atomic.AtomicReference;

public final class b<T>
extends c<T> {
    final e<T> a;

    public b(e<T> e2) {
        this.a = e2;
    }

    @Override
    protected void b(g<? super T> g2) {
        a<T> a2 = new a<T>(g2);
        g2.a(a2);
        try {
            this.a.a(a2);
            return;
        }
        catch (Throwable throwable) {
            h.b.p.b.b(throwable);
            a2.a(throwable);
            return;
        }
    }

    static final class a<T>
    extends AtomicReference<h.b.o.b>
    implements d<T>,
    h.b.o.b {
        final g<? super T> b;

        a(g<? super T> g2) {
            this.b = g2;
        }

        @Override
        public void a() {
            if (!this.b()) {
                try {
                    this.b.a();
                    return;
                }
                finally {
                    this.dispose();
                }
            }
        }

        @Override
        public void a(Throwable throwable) {
            if (throwable == null) {
                throwable = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (!this.b()) {
                try {
                    this.b.a(throwable);
                    return;
                }
                finally {
                    this.dispose();
                }
            }
            h.b.s.a.a(throwable);
        }

        @Override
        public void b(T t2) {
            if (t2 == null) {
                this.a((Throwable)new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (!this.b()) {
                this.b.b(t2);
            }
        }

        public boolean b() {
            return h.b.r.a.b.a((h.b.o.b)this.get());
        }

        @Override
        public void dispose() {
            h.b.r.a.b.a(this);
        }
    }

}

