/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.base.download.a.b
 *  com.mintegral.msdk.base.download.a.j
 *  com.mintegral.msdk.base.download.a.o
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 */
package com.mintegral.msdk.base.download.a;

import com.mintegral.msdk.base.download.a.b;
import com.mintegral.msdk.base.download.a.j;
import com.mintegral.msdk.base.download.a.o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class a
implements j {
    private static final int c = Runtime.getRuntime().availableProcessors();
    private final b a;
    private final ExecutorService b;

    a() {
        o o2 = new o(10);
        this.a = new b(c, (ThreadFactory)o2);
        Executors.newSingleThreadExecutor();
        this.b = Executors.newCachedThreadPool();
    }

    public final b a() {
        return this.a;
    }

    public final ExecutorService b() {
        return this.b;
    }
}

