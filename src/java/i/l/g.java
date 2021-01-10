/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  i.l.b$a
 *  i.l.d
 *  i.l.d$a
 *  i.l.f
 *  java.lang.IllegalArgumentException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package i.l;

import i.l.b;
import i.l.d;
import i.l.f;

class g
extends f {
    public static int a(int n2, int n3) {
        if (n2 < n3) {
            n2 = n3;
        }
        return n2;
    }

    public static int a(int n2, int n3, int n4) {
        if (n3 <= n4) {
            if (n2 < n3) {
                return n3;
            }
            if (n2 > n4) {
                return n4;
            }
            return n2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot coerce value to an empty range: maximum ");
        stringBuilder.append(n4);
        stringBuilder.append(" is less than minimum ");
        stringBuilder.append(n3);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int b(int n2, int n3) {
        if (n2 > n3) {
            n2 = n3;
        }
        return n2;
    }

    public static b c(int n2, int n3) {
        return b.e.a(n2, n3, -1);
    }

    public static d d(int n2, int n3) {
        if (n3 <= Integer.MIN_VALUE) {
            return d.g.a();
        }
        return new d(n2, n3 - 1);
    }
}

