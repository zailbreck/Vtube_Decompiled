/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b.k
 *  h.b.l
 *  h.b.m
 *  h.b.o.b
 *  h.b.p.b
 *  h.b.q.d
 *  h.b.r.b.b
 *  h.b.r.e.b.a
 *  h.b.s.a
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package h.b;

import h.b.k;
import h.b.l;
import h.b.m;
import h.b.p.b;
import h.b.q.d;
import h.b.s.a;

public abstract class i<T>
implements m<T> {
    public static <T> i<T> a(l<T> l2) {
        h.b.r.b.b.a(l2, (String)"source is null");
        return a.a((i)new h.b.r.e.b.a(l2));
    }

    public final h.b.o.b a(d<? super T> d2, d<? super Throwable> d3) {
        h.b.r.b.b.a(d2, (String)"onSuccess is null");
        h.b.r.b.b.a(d3, (String)"onError is null");
        h.b.r.d.b<? super T> b2 = new h.b.r.d.b<T>(d2, d3);
        this.a(b2);
        return b2;
    }

    public final void a(k<? super T> k2) {
        h.b.r.b.b.a(k2, (String)"subscriber is null");
        k k3 = a.a((i)this, k2);
        h.b.r.b.b.a((Object)k3, (String)"subscriber returned by the RxJavaPlugins hook is null");
        try {
            this.b(k3);
            return;
        }
        catch (Throwable throwable) {
            b.b((Throwable)throwable);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(throwable);
            throw nullPointerException;
        }
        catch (NullPointerException nullPointerException) {
            throw nullPointerException;
        }
    }

    protected abstract void b(k<? super T> var1);
}

