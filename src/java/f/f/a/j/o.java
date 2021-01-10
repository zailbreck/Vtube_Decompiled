/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.j;

public final class o {
    public static <T> T a(T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException();
    }

    public static <T> T a(T t2, String string) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(string);
    }

    static void a(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException();
    }

    static void a(boolean bl, String string) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(string);
    }

    public static /* varargs */ void a(Object ... arrobject) {
        int n2 = arrobject.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrobject[i2] != null) {
                continue;
            }
            throw new NullPointerException();
        }
    }
}

