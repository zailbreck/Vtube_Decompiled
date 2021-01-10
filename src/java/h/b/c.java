/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b.e
 *  h.b.f
 *  h.b.g
 *  h.b.h
 *  h.b.o.b
 *  h.b.p.b
 *  h.b.q.a
 *  h.b.q.d
 *  h.b.r.b.a
 *  h.b.r.b.b
 *  h.b.r.e.a.b
 *  h.b.r.e.a.c
 *  h.b.r.e.a.d
 *  h.b.s.a
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package h.b;

import h.b.b;
import h.b.e;
import h.b.f;
import h.b.g;
import h.b.h;
import h.b.q.d;
import h.b.s.a;

public abstract class c<T>
implements f<T> {
    public static int a() {
        return b.a();
    }

    public static <T> c<T> a(e<T> e2) {
        h.b.r.b.b.a(e2, (String)"source is null");
        return a.a((c)new h.b.r.e.a.b(e2));
    }

    public final c<T> a(h h2) {
        return this.a(h2, false, c.a());
    }

    public final c<T> a(h h2, boolean bl, int n2) {
        h.b.r.b.b.a((Object)h2, (String)"scheduler is null");
        h.b.r.b.b.a((int)n2, (String)"bufferSize");
        return a.a((c)new h.b.r.e.a.c((f)this, h2, bl, n2));
    }

    public final h.b.o.b a(d<? super T> d2, d<? super Throwable> d3) {
        return this.a(d2, d3, h.b.r.b.a.a, (d<? super h.b.o.b>)h.b.r.b.a.a());
    }

    public final h.b.o.b a(d<? super T> d2, d<? super Throwable> d3, h.b.q.a a2) {
        return this.a(d2, d3, a2, (d<? super h.b.o.b>)h.b.r.b.a.a());
    }

    public final h.b.o.b a(d<? super T> d2, d<? super Throwable> d3, h.b.q.a a2, d<? super h.b.o.b> d4) {
        h.b.r.b.b.a(d2, (String)"onNext is null");
        h.b.r.b.b.a(d3, (String)"onError is null");
        h.b.r.b.b.a((Object)a2, (String)"onComplete is null");
        h.b.r.b.b.a(d4, (String)"onSubscribe is null");
        h.b.r.d.c<? super T> c2 = new h.b.r.d.c<T>(d2, d3, a2, d4);
        this.a(c2);
        return c2;
    }

    public final void a(g<? super T> g2) {
        h.b.r.b.b.a(g2, (String)"observer is null");
        try {
            g g3 = a.a((c)this, g2);
            h.b.r.b.b.a((Object)g3, (String)"Plugin returned null Observer");
            this.b(g3);
            return;
        }
        catch (Throwable throwable) {
            h.b.p.b.b((Throwable)throwable);
            a.a((Throwable)throwable);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(throwable);
            throw nullPointerException;
        }
        catch (NullPointerException nullPointerException) {
            throw nullPointerException;
        }
    }

    public final c<T> b(h h2) {
        h.b.r.b.b.a((Object)h2, (String)"scheduler is null");
        return a.a((c)new h.b.r.e.a.d((f)this, h2));
    }

    protected abstract void b(g<? super T> var1);
}

