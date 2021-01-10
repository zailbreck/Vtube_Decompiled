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
package e.e.j;

public final class e {
    public static int a(int n2) {
        if (n2 >= 0) {
            return n2;
        }
        throw new IllegalArgumentException();
    }

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

    public static void a(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void a(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf((Object)object));
    }

    public static void a(boolean bl, String string) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(string);
    }

    public static void b(boolean bl) {
        e.a(bl, null);
    }
}

