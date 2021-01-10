/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.d.c.f.c;

import f.d.c.f.c.b;

final class d {
    static int a(b b2) {
        return d.a(b2, true) + d.a(b2, false);
    }

    private static int a(b b2, boolean bl) {
        int n2 = bl ? b2.b() : b2.c();
        int n3 = bl ? b2.c() : b2.b();
        byte[][] arrby = b2.a();
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n5 = n4;
            int n6 = 0;
            byte by = -1;
            for (int i3 = 0; i3 < n3; ++i3) {
                byte by2 = bl ? arrby[i2][i3] : arrby[i3][i2];
                if (by2 == by) {
                    ++n6;
                    continue;
                }
                if (n6 >= 5) {
                    n5 += 3 + (n6 - 5);
                }
                n6 = 1;
                by = by2;
            }
            if (n6 >= 5) {
                n5 += 3 + (n6 - 5);
            }
            n4 = n5;
        }
        return n4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static boolean a(int var0_1, int var1, int var2_2) {
        block10 : {
            switch (var0_1) {
                default: {
                    var7_3 = new StringBuilder("Invalid mask pattern: ");
                    var7_3.append(var0_1);
                    throw new IllegalArgumentException(var7_3.toString());
                }
                case 7: {
                    var6_4 = var2_2 * var1 % 3 + (1 & var2_2 + var1);
                    ** GOTO lbl12
                }
                case 6: {
                    var5_5 = var2_2 * var1;
                    var6_4 = (var5_5 & 1) + var5_5 % 3;
lbl12: // 2 sources:
                    var3_6 = var6_4 & 1;
                    break block10;
                }
                case 5: {
                    var4_7 = var2_2 * var1;
                    var3_6 = (var4_7 & 1) + var4_7 % 3;
                    break block10;
                }
                case 4: {
                    var2_2 /= 2;
                    var1 /= 3;
                    ** GOTO lbl28
                }
                case 3: {
                    var3_6 = (var2_2 + var1) % 3;
                    break block10;
                }
                case 2: {
                    var3_6 = var1 % 3;
                    break block10;
                }
lbl28: // 2 sources:
                case 0: {
                    var2_2 += var1;
                }
                case 1: 
            }
            var3_6 = var2_2 & 1;
        }
        if (var3_6 != 0) return false;
        return true;
    }

    private static boolean a(byte[] arrby, int n2, int n3) {
        int n4 = Math.min((int)n3, (int)arrby.length);
        for (int i2 = Math.max((int)n2, (int)0); i2 < n4; ++i2) {
            if (arrby[i2] != 1) continue;
            return false;
        }
        return true;
    }

    private static boolean a(byte[][] arrby, int n2, int n3, int n4) {
        int n5 = Math.min((int)n4, (int)arrby.length);
        for (int i2 = Math.max((int)n3, (int)0); i2 < n5; ++i2) {
            if (arrby[i2][n2] != 1) continue;
            return false;
        }
        return true;
    }

    static int b(b b2) {
        byte[][] arrby = b2.a();
        int n2 = b2.c();
        int n3 = b2.b();
        int n4 = 0;
        for (int i2 = 0; i2 < n3 - 1; ++i2) {
            int n5 = n4;
            int n6 = 0;
            while (n6 < n2 - 1) {
                int n7;
                byte by = arrby[i2][n6];
                byte[] arrby2 = arrby[i2];
                int n8 = n6 + 1;
                if (by == arrby2[n8] && by == arrby[n7 = i2 + 1][n6] && by == arrby[n7][n8]) {
                    ++n5;
                }
                n6 = n8;
            }
            n4 = n5;
        }
        return n4 * 3;
    }

    static int c(b b2) {
        byte[][] arrby = b2.a();
        int n2 = b2.c();
        int n3 = b2.b();
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n5 = n4;
            for (int i3 = 0; i3 < n2; ++i3) {
                int n6;
                byte[] arrby2 = arrby[i2];
                int n7 = i3 + 6;
                if (n7 < n2 && arrby2[i3] == 1 && arrby2[i3 + 1] == 0 && arrby2[i3 + 2] == 1 && arrby2[i3 + 3] == 1 && arrby2[i3 + 4] == 1 && arrby2[i3 + 5] == 0 && arrby2[n7] == 1 && (d.a(arrby2, i3 - 4, i3) || d.a(arrby2, i3 + 7, i3 + 11))) {
                    ++n5;
                }
                if ((n6 = i2 + 6) >= n3 || arrby[i2][i3] != 1 || arrby[i2 + 1][i3] != 0 || arrby[i2 + 2][i3] != 1 || arrby[i2 + 3][i3] != 1 || arrby[i2 + 4][i3] != 1 || arrby[i2 + 5][i3] != 0 || arrby[n6][i3] != 1 || !d.a(arrby, i3, i2 - 4, i2) && !d.a(arrby, i3, i2 + 7, i2 + 11)) continue;
                ++n5;
            }
            n4 = n5;
        }
        return n4 * 40;
    }

    static int d(b b2) {
        byte[][] arrby = b2.a();
        int n2 = b2.c();
        int n3 = b2.b();
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            byte[] arrby2 = arrby[i2];
            int n5 = n4;
            for (int i3 = 0; i3 < n2; ++i3) {
                if (arrby2[i3] != 1) continue;
                ++n5;
            }
            n4 = n5;
        }
        int n6 = b2.b() * b2.c();
        return 10 * (10 * Math.abs((int)((n4 << 1) - n6)) / n6);
    }
}

