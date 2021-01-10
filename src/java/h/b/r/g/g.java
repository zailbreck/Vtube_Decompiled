/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 *  java.util.Properties
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicReference
 */
package h.b.r.g;

import h.b.r.g.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class g {
    public static final int a;
    static final AtomicReference<ScheduledExecutorService> b;
    static final Map<ScheduledThreadPoolExecutor, Object> c;

    static {
        b = new AtomicReference();
        c = new ConcurrentHashMap();
        Properties properties = System.getProperties();
        boolean bl = properties.containsKey((Object)"rx2.purge-enabled");
        int n2 = 1;
        if (bl && Boolean.getBoolean((String)"rx2.purge-enabled") && properties.containsKey((Object)"rx2.purge-period-seconds")) {
            n2 = Integer.getInteger((String)"rx2.purge-period-seconds", (int)n2);
        }
        a = n2;
        g.a();
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool((int)1, (ThreadFactory)threadFactory);
        if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor)scheduledExecutorService;
            c.put((Object)scheduledThreadPoolExecutor, (Object)scheduledExecutorService);
        }
        return scheduledExecutorService;
    }

    public static void a() {
        ScheduledExecutorService scheduledExecutorService;
        while ((scheduledExecutorService = (ScheduledExecutorService)b.get()) == null || scheduledExecutorService.isShutdown()) {
            ScheduledExecutorService scheduledExecutorService2 = Executors.newScheduledThreadPool((int)1, (ThreadFactory)new e("RxSchedulerPurge"));
            if (b.compareAndSet((Object)scheduledExecutorService, (Object)scheduledExecutorService2)) {
                Runnable runnable = new Runnable(){

                    public void run() {
                        try {
                            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList((Collection)g.c.keySet())) {
                                if (scheduledThreadPoolExecutor.isShutdown()) {
                                    g.c.remove((Object)scheduledThreadPoolExecutor);
                                    continue;
                                }
                                scheduledThreadPoolExecutor.purge();
                            }
                        }
                        catch (Throwable throwable) {
                            h.b.s.a.a(throwable);
                        }
                    }
                };
                int n2 = a;
                scheduledExecutorService2.scheduleAtFixedRate(runnable, (long)n2, (long)n2, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorService2.shutdownNow();
        }
        return;
    }

}

