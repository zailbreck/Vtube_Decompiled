/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.b0
 *  j.u
 *  java.lang.String
 */
package j.f0.g;

import j.b0;
import j.u;
import k.e;

public final class h
extends b0 {
    private final String b;
    private final long c;
    private final e d;

    public h(String string, long l2, e e2) {
        this.b = string;
        this.c = l2;
        this.d = e2;
    }

    public long m() {
        return this.c;
    }

    public u n() {
        String string = this.b;
        if (string != null) {
            return u.b((String)string);
        }
        return null;
    }

    public e o() {
        return this.d;
    }
}

