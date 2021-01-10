/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 *  k.t
 */
package k;

import java.util.concurrent.TimeUnit;
import k.t;

public class i
extends t {
    private t e;

    public i(t t2) {
        if (t2 != null) {
            this.e = t2;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final i a(t t2) {
        if (t2 != null) {
            this.e = t2;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public t a() {
        return this.e.a();
    }

    public t a(long l2) {
        return this.e.a(l2);
    }

    public t a(long l2, TimeUnit timeUnit) {
        return this.e.a(l2, timeUnit);
    }

    public t b() {
        return this.e.b();
    }

    public long c() {
        return this.e.c();
    }

    public boolean d() {
        return this.e.d();
    }

    public void e() {
        this.e.e();
    }

    public final t g() {
        return this.e;
    }
}

