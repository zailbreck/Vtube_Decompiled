/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package h.b.t;

import h.b.r.g.i;
import java.util.concurrent.Callable;

public final class a {
    static final h.b.h a;

    static {
        h.b.s.a.e(new Callable<h.b.h>(){

            public h.b.h call() {
                return h.a;
            }
        });
        h.b.s.a.b(new Callable<h.b.h>(){

            public h.b.h call() {
                return e.a;
            }
        });
        a = h.b.s.a.c(new Callable<h.b.h>(){

            public h.b.h call() {
                return f.a;
            }
        });
        i.b();
        h.b.s.a.d(new Callable<h.b.h>(){

            public h.b.h call() {
                return g.a;
            }
        });
    }

    public static h.b.h a() {
        return h.b.s.a.a(a);
    }

    static final class e {
        static final h.b.h a = new h.b.r.g.a();
    }

    static final class f {
        static final h.b.h a = new h.b.r.g.b();
    }

    static final class g {
        static final h.b.h a = h.b.r.g.c.b();
    }

    static final class h {
        static final h.b.h a = new h.b.r.g.h();
    }

}

