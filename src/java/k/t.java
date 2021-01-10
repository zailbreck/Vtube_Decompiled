/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.InterruptedIOException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.util.concurrent.TimeUnit
 */
package k;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import k.t;

public class t {
    public static final t d = new t(){

        public t a(long l2) {
            return this;
        }

        public t a(long l2, TimeUnit timeUnit) {
            return this;
        }

        public void e() {
        }
    };
    private boolean a;
    private long b;
    private long c;

    public t a() {
        this.a = false;
        return this;
    }

    public t a(long l2) {
        this.a = true;
        this.b = l2;
        return this;
    }

    public t a(long l2, TimeUnit timeUnit) {
        if (l2 >= 0L) {
            if (timeUnit != null) {
                this.c = timeUnit.toNanos(l2);
                return this;
            }
            throw new IllegalArgumentException("unit == null");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("timeout < 0: ");
        stringBuilder.append(l2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public t b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.a;
    }

    public void e() {
        if (!Thread.interrupted()) {
            if (this.a) {
                if (this.b - System.nanoTime() > 0L) {
                    return;
                }
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("thread interrupted");
    }

    public long f() {
        return this.c;
    }
}

