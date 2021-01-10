/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Executors
 *  java.util.concurrent.RejectedExecutionHandler
 *  java.util.concurrent.SynchronousQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.ThreadPoolExecutor$DiscardPolicy
 *  java.util.concurrent.TimeUnit
 */
package f.f.a.e.b.g;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b {
    public static ThreadPoolExecutor a;

    public static ThreadPoolExecutor a() {
        if (a == null) {
            ThreadPoolExecutor threadPoolExecutor;
            ThreadFactory threadFactory = new ThreadFactory(){

                public final Thread newThread(Runnable runnable) {
                    Thread thread = Executors.defaultThreadFactory().newThread(runnable);
                    thread.setName("CommonThreadPool");
                    return thread;
                }
            };
            a = threadPoolExecutor = new ThreadPoolExecutor(5, 200, 15L, TimeUnit.MILLISECONDS, (BlockingQueue)new SynchronousQueue(), threadFactory, (RejectedExecutionHandler)new ThreadPoolExecutor.DiscardPolicy());
        }
        return a;
    }

}

