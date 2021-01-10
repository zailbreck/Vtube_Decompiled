/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package i;

import java.io.Serializable;

public final class d<A, B>
implements Serializable {
    private final A b;
    private final B c;

    public d(A a2, B b2) {
        this.b = a2;
        this.c = b2;
    }

    public final A a() {
        return this.b;
    }

    public final B b() {
        return this.c;
    }

    public final A c() {
        return this.b;
    }

    public final B d() {
        return this.c;
    }

    public boolean equals(Object object) {
        block2 : {
            block3 : {
                if (this == object) break block2;
                if (!(object instanceof d)) break block3;
                d d2 = (d)object;
                if (i.k.b.d.a(this.b, d2.b) && i.k.b.d.a(this.c, d2.c)) break block2;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a2 = this.b;
        int n2 = a2 != null ? a2.hashCode() : 0;
        int n3 = n2 * 31;
        B b2 = this.c;
        int n4 = 0;
        if (b2 != null) {
            n4 = b2.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

