/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 */
package f.f.a.q.b;

import f.f.a.q.b.e;

final class f {
    static e a;
    static long b;

    private f() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static e a() {
        Class<f> class_ = f.class;
        synchronized (f.class) {
            if (a != null) {
                e e2 = a;
                a = e2.f;
                e2.f = null;
                b -= 8192L;
                // ** MonitorExit[var2] (shouldn't be in output)
                return e2;
            }
            // ** MonitorExit[var2] (shouldn't be in output)
            return new e();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void a(e e2) {
        if (e2.f == null && e2.g == null) {
            if (e2.d) {
                return;
            }
            Class<f> class_ = f.class;
            synchronized (f.class) {
                if (8192L + b > 65536L) {
                    // ** MonitorExit[var2_1] (shouldn't be in output)
                    return;
                }
                b = 8192L + b;
                e2.f = a;
                e2.c = 0;
                e2.b = 0;
                a = e2;
                // ** MonitorExit[var2_1] (shouldn't be in output)
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}

