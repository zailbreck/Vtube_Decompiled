/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.e.a.a.b.m.b
 *  f.e.a.a.b.m.b$c
 *  f.e.a.a.b.m.b$c$a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayDeque
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package f.e.a.a.b.m;

import f.e.a.a.b.m.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b$d
implements b.c.a {
    private final BlockingQueue<Runnable> a = new LinkedBlockingQueue();
    private final ThreadPoolExecutor b;
    private final ArrayDeque<b.c> c = new ArrayDeque();
    private b.c d = null;

    public b$d() {
        ThreadPoolExecutor threadPoolExecutor;
        this.b = threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, this.a);
    }

    private void a() {
        this.d = (b.c)this.c.poll();
        b.c c2 = this.d;
        if (c2 != null) {
            c2.a(this.b);
        }
    }

    public void a(b.c c2) {
        this.d = null;
        b$d.super.a();
    }

    public void b(b.c c2) {
        c2.a((b.c.a)this);
        this.c.add((Object)c2);
        if (this.d == null) {
            b$d.super.a();
        }
    }
}

