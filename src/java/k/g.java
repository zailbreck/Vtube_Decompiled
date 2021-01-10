/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.r
 *  k.t
 */
package k;

import k.c;
import k.r;
import k.t;

public abstract class g
implements r {
    private final r b;

    public g(r r2) {
        if (r2 != null) {
            this.b = r2;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void b(c c2, long l2) {
        this.b.b(c2, l2);
    }

    public void close() {
        this.b.close();
    }

    public t d() {
        return this.b.d();
    }

    public void flush() {
        this.b.flush();
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

