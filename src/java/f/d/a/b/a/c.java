/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.a.a.b
 *  f.d.a.b.a.b
 *  f.d.a.b.a.c$a
 *  f.d.a.b.a.d
 *  f.d.a.b.a.e
 *  f.d.a.b.a.h
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.Executor
 *  java.util.concurrent.Future
 */
package f.d.a.b.a;

import f.d.a.b.a.b;
import f.d.a.b.a.c;
import f.d.a.b.a.d;
import f.d.a.b.a.e;
import f.d.a.b.a.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/*
 * Exception performing whole class analysis.
 */
public final class c
extends d {
    public static <V> V a(Future<V> future) {
        f.d.a.a.b.a((boolean)future.isDone(), (String)"Future was expected to be done: %s", future);
        return (V)h.a(future);
    }

    public static <V> void a(e<V> e2, b<? super V> b2, Executor executor) {
        f.d.a.a.b.a(b2);
        e2.a((Runnable)new /* Unavailable Anonymous Inner Class!! */, executor);
    }
}

