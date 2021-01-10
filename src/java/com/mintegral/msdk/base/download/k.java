/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.mintegral.msdk.base.download;

import com.mintegral.msdk.base.download.a.e;
import com.mintegral.msdk.base.download.d;

public final class k {
    private k() {
    }

    /* synthetic */ k(a a2) {
    }

    public static k a() {
        return b.a;
    }

    public final e a(d<?> d2) {
        void var4_2 = this;
        synchronized (var4_2) {
            e e2 = new e(d2);
            return e2;
        }
    }

    private static final class b {
        private static final k a = new k(null);
    }

}

