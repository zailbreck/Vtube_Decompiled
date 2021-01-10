/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.b.a.a.a$a
 *  e.b.a.a.a$b
 *  e.b.a.a.c
 *  java.lang.Class
 *  java.lang.Runnable
 */
package e.b.a.a;

import e.b.a.a.a;
import e.b.a.a.c;

public class a
extends c {
    private static volatile a c;
    private c a;
    private c b;

    static {
        new a();
        new b();
    }

    private a() {
        this.a = this.b = new e.b.a.a.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a b() {
        if (c != null) {
            return c;
        }
        Class<a> class_ = a.class;
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
            // ** MonitorExit[var1] (shouldn't be in output)
            return c;
        }
    }

    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    public boolean a() {
        return this.a.a();
    }

    public void b(Runnable runnable) {
        this.a.b(runnable);
    }
}

