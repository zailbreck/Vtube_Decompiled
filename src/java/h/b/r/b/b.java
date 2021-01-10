/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package h.b.r.b;

import h.b.q.c;
import h.b.r.b.b;

public final class b {
    static {
        new c<Object, Object>(){};
    }

    public static int a(int n2, int n3) {
        if (n2 < n3) {
            return -1;
        }
        return n2 > n3;
    }

    public static int a(int n2, String string2) {
        if (n2 > 0) {
            return n2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" > 0 required but it was ");
        stringBuilder.append(n2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int a(long l2, long l3) {
        if (l2 < l3) {
            return -1;
        }
        return l2 > l3;
    }

    public static <T> T a(T t2, String string2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(string2);
    }
}

