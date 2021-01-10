/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  e.b.a.a.b$a
 *  e.b.a.a.c
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Thread
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 */
package e.b.a.a;

import android.os.Handler;
import android.os.Looper;
import e.b.a.a.b;
import e.b.a.a.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class b
extends c {
    private final Object a = new Object();
    private final ExecutorService b = Executors.newFixedThreadPool((int)2, (ThreadFactory)new a(this));
    private volatile Handler c;

    public void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(Runnable runnable) {
        if (this.c == null) {
            Object object;
            Object object2 = object = this.a;
            synchronized (object2) {
                if (this.c == null) {
                    this.c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }
}

