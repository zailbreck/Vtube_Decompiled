/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Runnable
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Future
 *  java.util.concurrent.PriorityBlockingQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package com.mintegral.msdk.base.download.a;

import com.mintegral.msdk.base.download.a.c;
import com.mintegral.msdk.base.download.a.h;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b
extends ThreadPoolExecutor {
    b(int n2, ThreadFactory threadFactory) {
        super(n2, n2, 0L, TimeUnit.MILLISECONDS, (BlockingQueue)new PriorityBlockingQueue(), threadFactory);
    }

    public final Future<?> submit(Runnable runnable) {
        c c2 = new c((h)runnable);
        this.execute((Runnable)c2);
        return c2;
    }
}

