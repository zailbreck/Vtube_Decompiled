/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.CopyOnWriteArrayList
 *  java.util.concurrent.Future
 *  java.util.concurrent.atomic.AtomicInteger
 */
package com.mintegral.msdk.base.download.a;

import com.mintegral.msdk.base.download.a.d;
import com.mintegral.msdk.base.download.a.h;
import com.mintegral.msdk.base.download.a.i;
import com.mintegral.msdk.base.download.a.j;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public final class f<T> {
    private final Map<String, d<T>> a;
    private final AtomicInteger b;
    private final Map<String, CopyOnWriteArrayList<d<T>>> c;

    private f() {
        this.a = new ConcurrentHashMap();
        this.b = new AtomicInteger();
        this.c = new ConcurrentHashMap();
    }

    /* synthetic */ f(a a2) {
    }

    public final void a(d<T> d2) {
        com.mintegral.msdk.base.download.j j2;
        String string = d2.f();
        d2.b(this.b.incrementAndGet());
        if (this.a.containsKey((Object)string)) {
            com.mintegral.msdk.base.download.j j3;
            CopyOnWriteArrayList copyOnWriteArrayList;
            com.mintegral.msdk.base.download.j j4 = d2.g();
            if (j4 != (j3 = com.mintegral.msdk.base.download.j.i)) {
                j3 = com.mintegral.msdk.base.download.j.h;
            }
            d2.a(j3);
            if (this.c.containsKey((Object)string)) {
                copyOnWriteArrayList = (CopyOnWriteArrayList)this.c.get((Object)string);
                copyOnWriteArrayList.add(d2);
                this.c.remove((Object)string);
            } else {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                copyOnWriteArrayList.add(d2);
            }
            this.c.put((Object)string, (Object)copyOnWriteArrayList);
            return;
        }
        com.mintegral.msdk.base.download.j j5 = d2.g();
        if (j5 != (j2 = com.mintegral.msdk.base.download.j.i)) {
            j2 = com.mintegral.msdk.base.download.j.b;
        }
        d2.a(j2);
        this.a.put((Object)string, d2);
        d2.a(i.b().a().a().submit(new h(d2)));
    }

    public final void b(d d2) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        String string = d2.f();
        this.a.remove((Object)string);
        if (this.c.containsKey((Object)string) && (copyOnWriteArrayList = (CopyOnWriteArrayList)this.c.remove((Object)string)) != null && copyOnWriteArrayList.size() > 0) {
            d d3 = (d)copyOnWriteArrayList.remove(0);
            d3.a(com.mintegral.msdk.base.download.j.b);
            this.a.put((Object)string, (Object)d3);
            d3.a(i.b().a().a().submit(new h(d3)));
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                this.c.put((Object)string, (Object)copyOnWriteArrayList);
            }
        }
    }

    private static final class b {
        private static final f a = new f(null);

        static /* synthetic */ f a() {
            return a;
        }
    }

}

