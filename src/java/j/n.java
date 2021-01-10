/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.Deque
 *  java.util.Iterator
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.SynchronousQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package j;

import j.f0.c;
import j.x;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class n {
    private int a = 64;
    private int b = 5;
    private Runnable c;
    private ExecutorService d;
    private final Deque<x.a> e = new ArrayDeque();
    private final Deque<x.a> f = new ArrayDeque();
    private final Deque<x> g = new ArrayDeque();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private <T> void a(Deque<T> deque, T t2, boolean bl) {
        void var7_4 = this;
        // MONITORENTER : var7_4
        if (!deque.remove(t2)) throw new AssertionError((Object)"Call wasn't in-flight!");
        if (bl) {
            n.super.c();
        }
        int n2 = this.b();
        Runnable runnable = this.c;
        // MONITOREXIT : var7_4
        if (n2 != 0) return;
        if (runnable == null) return;
        runnable.run();
    }

    private int b(x.a a2) {
        Iterator iterator = this.f.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            x.a a3 = (x.a)iterator.next();
            if (a3.c().f || !a3.d().equals((Object)a2.d())) continue;
            ++n2;
        }
        return n2;
    }

    private void c() {
        if (this.f.size() >= this.a) {
            return;
        }
        if (this.e.isEmpty()) {
            return;
        }
        Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            x.a a2 = (x.a)iterator.next();
            if (this.b(a2) < this.b) {
                iterator.remove();
                this.f.add((Object)a2);
                this.a().execute((Runnable)a2);
            }
            if (this.f.size() < this.a) continue;
        }
    }

    public ExecutorService a() {
        n n2 = this;
        synchronized (n2) {
            if (this.d == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, (BlockingQueue)new SynchronousQueue(), c.a("OkHttp Dispatcher", false));
                this.d = threadPoolExecutor;
            }
            ExecutorService executorService = this.d;
            return executorService;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(int n2) {
        void var6_2 = this;
        synchronized (var6_2) {
            Throwable throwable2;
            if (n2 >= 1) {
                try {
                    this.a = n2;
                    n.super.c();
                    return;
                }
                catch (Throwable throwable2) {}
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("max < 1: ");
                stringBuilder.append(n2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            throw throwable2;
        }
    }

    void a(x.a a2) {
        n.super.a(this.f, a2, true);
    }

    void a(x x2) {
        void var4_2 = this;
        synchronized (var4_2) {
            this.g.add((Object)x2);
            return;
        }
    }

    public int b() {
        n n2 = this;
        synchronized (n2) {
            int n3 = this.f.size();
            int n4 = this.g.size();
            int n5 = n3 + n4;
            return n5;
        }
    }

    void b(x x2) {
        n.super.a(this.g, x2, false);
    }
}

