/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b.h
 *  h.b.r.g.d
 *  h.b.r.g.e
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.String
 *  java.util.concurrent.ThreadFactory
 */
package h.b.r.g;

import h.b.h;
import h.b.r.g.d;
import h.b.r.g.e;
import java.util.concurrent.ThreadFactory;

public final class c
extends h {
    private static final e a;
    private static final c b;

    static {
        b = new c();
        a = new e("RxNewThreadScheduler", Math.max((int)1, (int)Math.min((int)10, (int)Integer.getInteger((String)"rx2.newthread-priority", (int)5))));
    }

    private c() {
    }

    public static c b() {
        return b;
    }

    public h.b a() {
        return new d((ThreadFactory)a);
    }
}

