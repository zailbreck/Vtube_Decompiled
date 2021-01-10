/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Comparator
 *  java.util.concurrent.Callable
 *  l.b.b
 */
package h.b.r.b;

import h.b.r.b.a;
import java.util.Comparator;
import java.util.concurrent.Callable;

public final class a {
    public static final h.b.q.a a;
    static final h.b.q.d<Object> b;

    static {
        new h.b.q.e<Object, Object>(){

            public Object a(Object object) {
                return object;
            }

            public String toString() {
                return "IdentityFunction";
            }
        };
        new Runnable(){

            public void run() {
            }

            public String toString() {
                return "EmptyRunnable";
            }
        };
        a = new h.b.q.a(){

            public void run() {
            }

            public String toString() {
                return "EmptyAction";
            }
        };
        b = new h.b.q.d<Object>(){

            public void a(Object object) {
            }

            public String toString() {
                return "EmptyConsumer";
            }
        };
        new h.b.q.d<Throwable>(){

            public void a(Throwable throwable) {
                h.b.s.a.a(throwable);
            }
        };
        new h.b.q.f(){};
        new h.b.q.g<Object>(){};
        new h.b.q.g<Object>(){};
        new Callable<Object>(){

            public Object call() {
                return null;
            }
        };
        new Comparator<Object>(){

            public int compare(Object object, Object object2) {
                return ((Comparable)object).compareTo(object2);
            }
        };
        new h.b.q.d<l.b.b>(){

            public void a(l.b.b b2) {
                b2.a(Long.MAX_VALUE);
            }
        };
    }

    public static <T> h.b.q.d<T> a() {
        return b;
    }

}

