/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package e.d;

class c {
    static final int[] a = new int[0];
    static final long[] b = new long[0];
    static final Object[] c = new Object[0];

    public static int a(int n2) {
        for (int i2 = 4; i2 < 32; ++i2) {
            int n3 = -12 + (1 << i2);
            if (n2 > n3) continue;
            return n3;
        }
        return n2;
    }

    static int a(int[] arrn, int n2, int n3) {
        int n4 = n2 - 1;
        int n5 = 0;
        while (n5 <= n4) {
            int n6 = n5 + n4 >>> 1;
            int n7 = arrn[n6];
            if (n7 < n3) {
                n5 = n6 + 1;
                continue;
            }
            if (n7 > n3) {
                n4 = n6 - 1;
                continue;
            }
            return n6;
        }
        return ~n5;
    }

    static int a(long[] arrl, int n2, long l2) {
        int n3 = n2 - 1;
        int n4 = 0;
        while (n4 <= n3) {
            int n5 = n4 + n3 >>> 1;
            long l3 = arrl[n5];
            if (l3 < l2) {
                n4 = n5 + 1;
                continue;
            }
            if (l3 > l2) {
                n3 = n5 - 1;
                continue;
            }
            return n5;
        }
        return ~n4;
    }

    public static boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    public static int b(int n2) {
        return c.a(n2 * 4) / 4;
    }

    public static int c(int n2) {
        return c.a(n2 * 8) / 8;
    }
}

