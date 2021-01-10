/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Callable
 */
package h.b.n.a;

import h.b.h;
import h.b.p.b;
import h.b.q.e;
import java.util.concurrent.Callable;

public final class a {
    private static volatile e<Callable<h>, h> a;
    private static volatile e<h, h> b;

    public static h a(h h2) {
        if (h2 != null) {
            e<h, h> e2 = b;
            if (e2 == null) {
                return h2;
            }
            a.a(e2, h2);
            return h2;
        }
        throw new NullPointerException("scheduler == null");
    }

    static h a(e<Callable<h>, h> e2, Callable<h> callable) {
        a.a(e2, callable);
        h h2 = (h)callable;
        if (h2 != null) {
            return h2;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static h a(Callable<h> callable) {
        block3 : {
            try {
                h h2 = (h)callable.call();
                if (h2 == null) break block3;
                return h2;
            }
            catch (Throwable throwable) {
                b.a(throwable);
                throw null;
            }
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static <T, R> R a(e<T, R> e2, T t2) {
        try {
            e2.a(t2);
        }
        catch (Throwable throwable) {
            b.a(throwable);
            throw null;
        }
        return (R)t2;
    }

    public static h b(Callable<h> callable) {
        if (callable != null) {
            e<Callable<h>, h> e2 = a;
            if (e2 == null) {
                return a.a(callable);
            }
            return a.a(e2, callable);
        }
        throw new NullPointerException("scheduler == null");
    }
}

