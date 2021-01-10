/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.e.a.a.a.j.b.b
 *  f.e.a.a.a.j.b.b$a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayDeque
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package f.e.a.a.a.j.b;

import f.e.a.a.a.j.b.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c
implements b.a {
    private final BlockingQueue<Runnable> a = new LinkedBlockingQueue();
    private final ThreadPoolExecutor b;
    private final ArrayDeque<b> c = new ArrayDeque();
    private b d = null;

    public c() {
        ThreadPoolExecutor threadPoolExecutor;
        this.b = threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, this.a);
    }

    private void a() {
        this.d = (b)this.c.poll();
        b b2 = this.d;
        if (b2 != null) {
            b2.a(this.b);
        }
    }

    public void a(b b2) {
        this.d = null;
        c.super.a();
    }

    public void b(b b2) {
        b2.a((b.a)this);
        this.c.add((Object)b2);
        if (this.d == null) {
            c.super.a();
        }
    }
}

