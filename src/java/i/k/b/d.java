/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Arrays
 */
package i.k.b;

import i.b;
import i.g;
import java.util.Arrays;

public class d {
    private d() {
    }

    public static int a(int n2, int n3) {
        if (n2 < n3) {
            return -1;
        }
        return n2 != n3;
    }

    private static String a(String string2) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String string3 = stackTraceElement.getClassName();
        String string4 = stackTraceElement.getMethodName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Parameter specified as non-null is null: method ");
        stringBuilder.append(string3);
        stringBuilder.append(".");
        stringBuilder.append(string4);
        stringBuilder.append(", parameter ");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private static <T extends Throwable> T a(T t2) {
        d.a(t2, d.class.getName());
        return t2;
    }

    static <T extends Throwable> T a(T t2, String string2) {
        Object[] arrobject = t2.getStackTrace();
        int n2 = arrobject.length;
        int n3 = -1;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string2.equals((Object)arrobject[i2].getClassName())) continue;
            n3 = i2;
        }
        t2.setStackTrace((StackTraceElement[])Arrays.copyOfRange((Object[])arrobject, (int)(n3 + 1), (int)n2));
        return t2;
    }

    public static void a() {
        b b2 = new b();
        d.a(b2);
        throw b2;
    }

    public static void a(Object object, String string2) {
        if (object != null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" must not be null");
        IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
        d.a(illegalStateException);
        throw illegalStateException;
    }

    public static boolean a(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }

    public static void b(Object object, String string2) {
        if (object != null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" must not be null");
        NullPointerException nullPointerException = new NullPointerException(stringBuilder.toString());
        d.a(nullPointerException);
        throw nullPointerException;
    }

    private static void b(String string2) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(d.a(string2));
        d.a(illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void c(Object object, String string2) {
        if (object != null) {
            return;
        }
        d.c(string2);
        throw null;
    }

    private static void c(String string2) {
        NullPointerException nullPointerException = new NullPointerException(d.a(string2));
        d.a(nullPointerException);
        throw nullPointerException;
    }

    public static void d(Object object, String string2) {
        if (object != null) {
            return;
        }
        d.b(string2);
        throw null;
    }

    public static void d(String string2) {
        g g2 = new g(string2);
        d.a(g2);
        throw g2;
    }

    public static void e(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lateinit property ");
        stringBuilder.append(string2);
        stringBuilder.append(" has not been initialized");
        d.d(stringBuilder.toString());
        throw null;
    }
}

