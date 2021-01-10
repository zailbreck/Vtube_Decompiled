/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.Object
 */
package com.mintegral.msdk.base.download.a;

import android.content.Context;
import com.mintegral.msdk.base.download.g.a;
import com.mintegral.msdk.base.download.g.b;
import f.f.a.q.a.j;

public final class l {
    private static volatile l f;
    private Context a;
    private com.mintegral.msdk.base.download.c.b b;
    private a c;
    private int d = 4096;
    private j e;

    private l() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static l f() {
        if (!b.a(f)) return f;
        Class<l> class_ = l.class;
        synchronized (l.class) {
            if (!b.a(f)) return f;
            f = new l();
            // ** MonitorExit[var1] (shouldn't be in output)
            return f;
        }
    }

    public final a a() {
        return this.c;
    }

    public final com.mintegral.msdk.base.download.c.b b() {
        return this.b;
    }

    public final int c() {
        return this.d;
    }

    public final Context d() {
        return this.a;
    }

    public final j e() {
        return this.e;
    }
}

