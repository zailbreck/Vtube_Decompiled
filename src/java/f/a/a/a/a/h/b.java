/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.LinkedList
 *  java.util.Queue
 *  java.util.concurrent.ArrayBlockingQueue
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Executors
 *  java.util.concurrent.RejectedExecutionHandler
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package f.a.a.a.a.h;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b {
    private static b f = new b();
    private final Queue<Runnable> a = new LinkedList();
    private final RejectedExecutionHandler b = new RejectedExecutionHandler(){

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            if (b.this.a.size() >= 200) {
                b.this.a.poll();
            }
            b.this.a.offer((Object)runnable);
        }
    };
    private final ScheduledExecutorService c = Executors.newScheduledThreadPool((int)1);
    private final ThreadPoolExecutor d;
    private final Runnable e;

    private b() {
        ThreadPoolExecutor threadPoolExecutor;
        this.d = threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5000L, TimeUnit.MILLISECONDS, (BlockingQueue)new ArrayBlockingQueue(500), new ThreadFactory(this){

            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "oss-android-log-thread");
            }
        }, this.b);
        this.e = new Runnable(){

            public void run() {
                if (b.this.a()) {
                    b.this.d.execute((Runnable)b.this.a.poll());
                }
            }
        };
        this.c.scheduleAtFixedRate(this.e, 0L, 1000L, TimeUnit.MILLISECONDS);
    }

    private boolean a() {
        return true ^ this.a.isEmpty();
    }

    public static b b() {
        if (f == null) {
            f = new b();
        }
        return f;
    }

    public void a(Runnable runnable) {
        if (runnable != null) {
            this.d.execute(runnable);
        }
    }

}

