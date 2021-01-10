/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package f.d.a.a;

import f.d.a.a.c;

public final class b {
    public static <T> T a(T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException();
    }

    public static <T> T a(T t2, Object object) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(String.valueOf((Object)object));
    }

    public static void a(boolean bl, String string, int n2, int n3) {
        if (bl) {
            return;
        }
        Object[] arrobject = new Object[]{n2, n3};
        throw new IllegalArgumentException(c.a(string, arrobject));
    }

    public static void a(boolean bl, String string, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(c.a(string, object));
    }
}

