/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.s
 *  k.t
 */
package k;

import k.c;
import k.s;
import k.t;

public abstract class h
implements s {
    private final s b;

    public h(s s2) {
        if (s2 != null) {
            this.b = s2;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public long a(c c2, long l2) {
        return this.b.a(c2, l2);
    }

    public final s a() {
        return this.b;
    }

    public void close() {
        this.b.close();
    }

    public t d() {
        return this.b.d();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("(");
        stringBuilder.append(this.b.toString());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

