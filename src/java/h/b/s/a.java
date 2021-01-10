/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.util.concurrent.Callable
 */
package h.b.s;

import h.b.c;
import h.b.g;
import h.b.h;
import h.b.i;
import h.b.k;
import h.b.q.d;
import h.b.q.e;
import h.b.r.b.b;
import java.util.concurrent.Callable;

public final class a {
    static volatile d<Throwable> a;
    static volatile e<Runnable, Runnable> b;
    static volatile e<Callable<h>, h> c;
    static volatile e<Callable<h>, h> d;
    static volatile e<Callable<h>, h> e;
    static volatile e<Callable<h>, h> f;
    static volatile e<h, h> g;
    static volatile e<c, c> h;
    static volatile e<i, i> i;
    static volatile h.b.q.b<c, g, g> j;
    static volatile h.b.q.b<i, k, k> k;

    public static <T> c<T> a(c<T> c2) {
        e<c, c> e2 = h;
        if (e2 != null) {
            a.a(e2, c2);
        }
        return c2;
    }

    public static <T> g<? super T> a(c<T> c2, g<? super T> g2) {
        h.b.q.b<c, g, g> b2 = j;
        if (b2 != null) {
            return a.a(b2, c2, g2);
        }
        return g2;
    }

    public static h a(h h2) {
        e<h, h> e2 = g;
        if (e2 == null) {
            return h2;
        }
        a.a(e2, h2);
        return h2;
    }

    static h a(e<Callable<h>, h> e2, Callable<h> callable) {
        a.a(e2, callable);
        b.a(callable, "Scheduler Callable result can't be null");
        return (h)callable;
    }

    static h a(Callable<h> callable) {
        try {
            Object object = callable.call();
            b.a(object, "Scheduler Callable result can't be null");
            h h2 = (h)object;
            return h2;
        }
        catch (Throwable throwable) {
            throw h.b.r.h.a.a(throwable);
        }
    }

    public static <T> i<T> a(i<T> i2) {
        e<i, i> e2 = i;
        if (e2 != null) {
            a.a(e2, i2);
        }
        return i2;
    }

    public static <T> k<? super T> a(i<T> i2, k<? super T> k2) {
        h.b.q.b<i, k, k> b2 = k;
        if (b2 != null) {
            return a.a(b2, i2, k2);
        }
        return k2;
    }

    static <T, U, R> R a(h.b.q.b<T, U, R> b2, T t2, U u) {
        R r2;
        try {
            r2 = b2.a(t2, u);
        }
        catch (Throwable throwable) {
            throw h.b.r.h.a.a(throwable);
        }
        return r2;
    }

    static <T, R> R a(e<T, R> e2, T t2) {
        try {
            e2.a(t2);
        }
        catch (Throwable throwable) {
            throw h.b.r.h.a.a(throwable);
        }
        return (R)t2;
    }

    public static Runnable a(Runnable runnable) {
        e<Runnable, Runnable> e2 = b;
        if (e2 == null) {
            return runnable;
        }
        a.a(e2, runnable);
        return runnable;
    }

    public static void a(Throwable throwable) {
        d<Throwable> d2 = a;
        if (throwable == null) {
            throwable = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (d2 != null) {
            try {
                d2.a(throwable);
                return;
            }
            catch (Throwable throwable2) {
                throwable2.printStackTrace();
                a.b(throwable2);
            }
        }
        throwable.printStackTrace();
        a.b(throwable);
    }

    public static h b(Callable<h> callable) {
        b.a(callable, "Scheduler Callable can't be null");
        e<Callable<h>, h> e2 = c;
        if (e2 == null) {
            return a.a(callable);
        }
        return a.a(e2, callable);
    }

    static void b(Throwable throwable) {
        Thread thread = Thread.currentThread();
        thread.getUncaughtExceptionHandler().uncaughtException(thread, throwable);
    }

    public static h c(Callable<h> callable) {
        b.a(callable, "Scheduler Callable can't be null");
        e<Callable<h>, h> e2 = e;
        if (e2 == null) {
            return a.a(callable);
        }
        return a.a(e2, callable);
    }

    public static h d(Callable<h> callable) {
        b.a(callable, "Scheduler Callable can't be null");
        e<Callable<h>, h> e2 = f;
        if (e2 == null) {
            return a.a(callable);
        }
        return a.a(e2, callable);
    }

    public static h e(Callable<h> callable) {
        b.a(callable, "Scheduler Callable can't be null");
        e<Callable<h>, h> e2 = d;
        if (e2 == null) {
            return a.a(callable);
        }
        return a.a(e2, callable);
    }
}

