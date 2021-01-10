/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 */
package j.f0;

import j.f0.c;

public abstract class b
implements Runnable {
    protected final String b;

    public /* varargs */ b(String string2, Object ... arrobject) {
        this.b = c.a(string2, arrobject);
    }

    protected abstract void b();

    public final void run() {
        String string2 = Thread.currentThread().getName();
        Thread.currentThread().setName(this.b);
        try {
            this.b();
            return;
        }
        finally {
            Thread.currentThread().setName(string2);
        }
    }
}

