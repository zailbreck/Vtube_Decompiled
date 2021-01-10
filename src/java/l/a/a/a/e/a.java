/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package l.a.a.a.e;

import l.a.a.a.b;

public class a
implements b,
l.a.a.a.a {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] a(byte[] arrby) {
        return a.a(arrby, true);
    }

    public static char[] a(byte[] arrby, boolean bl) {
        char[] arrc = bl ? a : b;
        return a.a(arrby, arrc);
    }

    protected static char[] a(byte[] arrby, char[] arrc) {
        int n2 = arrby.length;
        char[] arrc2 = new char[n2 << 1];
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = n3 + 1;
            arrc2[n3] = arrc[(240 & arrby[i2]) >>> 4];
            n3 = n4 + 1;
            arrc2[n4] = arrc[15 & arrby[i2]];
        }
        return arrc2;
    }
}

