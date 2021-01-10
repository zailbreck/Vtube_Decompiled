/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.e.b.h;

import f.f.a.e.b.h.f.a;
import f.f.a.e.b.h.l;
import f.f.a.e.b.h.m;

public final class q {
    private static q c;
    private m a;
    private a b;

    public static a a() {
        a a2 = q.c.b;
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("FileDownloader not initialized");
    }

    public static void a(l l2) {
        q.b().a(l2);
    }

    private static m b() {
        m m2 = q.c.a;
        if (m2 != null) {
            return m2;
        }
        throw new IllegalStateException("RequestQueue not initialized");
    }
}

