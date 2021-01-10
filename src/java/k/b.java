/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.lang.String
 */
package k;

import java.io.UnsupportedEncodingException;

final class b {
    private static final byte[] a = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static String a(byte[] arrby) {
        return b.a(arrby, a);
    }

    private static String a(byte[] arrby, byte[] arrby2) {
        byte[] arrby3 = new byte[4 * ((2 + arrby.length) / 3)];
        int n2 = arrby.length - arrby.length % 3;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; i2 += 3) {
            int n4 = n3 + 1;
            arrby3[n3] = arrby2[(255 & arrby[i2]) >> 2];
            int n5 = n4 + 1;
            int n6 = (3 & arrby[i2]) << 4;
            int n7 = i2 + 1;
            arrby3[n4] = arrby2[n6 | (255 & arrby[n7]) >> 4];
            int n8 = n5 + 1;
            int n9 = (15 & arrby[n7]) << 2;
            int n10 = i2 + 2;
            arrby3[n5] = arrby2[n9 | (255 & arrby[n10]) >> 6];
            n3 = n8 + 1;
            arrby3[n8] = arrby2[63 & arrby[n10]];
        }
        int n11 = arrby.length % 3;
        if (n11 != 1) {
            if (n11 == 2) {
                int n12 = n3 + 1;
                arrby3[n3] = arrby2[(255 & arrby[n2]) >> 2];
                int n13 = n12 + 1;
                int n14 = (3 & arrby[n2]) << 4;
                int n15 = n2 + 1;
                arrby3[n12] = arrby2[n14 | (255 & arrby[n15]) >> 4];
                int n16 = n13 + 1;
                arrby3[n13] = arrby2[(15 & arrby[n15]) << 2];
                arrby3[n16] = 61;
            }
        } else {
            int n17 = n3 + 1;
            arrby3[n3] = arrby2[(255 & arrby[n2]) >> 2];
            int n18 = n17 + 1;
            arrby3[n17] = arrby2[(3 & arrby[n2]) << 4];
            int n19 = n18 + 1;
            arrby3[n18] = 61;
            arrby3[n19] = 61;
        }
        try {
            String string2 = new String(arrby3, "US-ASCII");
            return string2;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            AssertionError assertionError;
            assertionError = new AssertionError((Object)unsupportedEncodingException);
            throw assertionError;
        }
    }
}

