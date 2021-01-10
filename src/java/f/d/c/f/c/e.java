/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.d.c.f.c;

import f.d.c.d;
import f.d.c.f.b.a;
import f.d.c.f.b.c;
import f.d.c.f.c.b;
import f.d.c.f.c.f;

final class e {
    private static final int[][] a = new int[][]{{1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 0, 1}, {1, 0, 1, 1, 1, 0, 1}, {1, 0, 1, 1, 1, 0, 1}, {1, 0, 1, 1, 1, 0, 1}, {1, 0, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = new int[][]{{1, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}};
    private static final int[][] c = new int[][]{{-1, -1, -1, -1, -1, -1, -1}, {6, 18, -1, -1, -1, -1, -1}, {6, 22, -1, -1, -1, -1, -1}, {6, 26, -1, -1, -1, -1, -1}, {6, 30, -1, -1, -1, -1, -1}, {6, 34, -1, -1, -1, -1, -1}, {6, 22, 38, -1, -1, -1, -1}, {6, 24, 42, -1, -1, -1, -1}, {6, 26, 46, -1, -1, -1, -1}, {6, 28, 50, -1, -1, -1, -1}, {6, 30, 54, -1, -1, -1, -1}, {6, 32, 58, -1, -1, -1, -1}, {6, 34, 62, -1, -1, -1, -1}, {6, 26, 46, 66, -1, -1, -1}, {6, 26, 48, 70, -1, -1, -1}, {6, 26, 50, 74, -1, -1, -1}, {6, 30, 54, 78, -1, -1, -1}, {6, 30, 56, 82, -1, -1, -1}, {6, 30, 58, 86, -1, -1, -1}, {6, 34, 62, 90, -1, -1, -1}, {6, 28, 50, 72, 94, -1, -1}, {6, 26, 50, 74, 98, -1, -1}, {6, 30, 54, 78, 102, -1, -1}, {6, 28, 54, 80, 106, -1, -1}, {6, 32, 58, 84, 110, -1, -1}, {6, 30, 58, 86, 114, -1, -1}, {6, 34, 62, 90, 118, -1, -1}, {6, 26, 50, 74, 98, 122, -1}, {6, 30, 54, 78, 102, 126, -1}, {6, 26, 52, 78, 104, 130, -1}, {6, 30, 56, 82, 108, 134, -1}, {6, 34, 60, 86, 112, 138, -1}, {6, 30, 58, 86, 114, 142, -1}, {6, 34, 62, 90, 118, 146, -1}, {6, 30, 54, 78, 102, 126, 150}, {6, 24, 50, 76, 102, 128, 154}, {6, 28, 54, 80, 106, 132, 158}, {6, 32, 58, 84, 110, 136, 162}, {6, 26, 54, 82, 110, 138, 166}, {6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = new int[][]{{8, 0}, {8, 1}, {8, 2}, {8, 3}, {8, 4}, {8, 5}, {8, 7}, {8, 8}, {7, 8}, {5, 8}, {4, 8}, {3, 8}, {2, 8}, {1, 8}, {0, 8}};

    static int a(int n2) {
        return 32 - Integer.numberOfLeadingZeros((int)n2);
    }

    static int a(int n2, int n3) {
        IllegalArgumentException illegalArgumentException;
        if (n3 != 0) {
            int n4 = e.a(n3);
            int n5 = n2 << n4 - 1;
            while (e.a(n5) >= n4) {
                n5 ^= n3 << e.a(n5) - n4;
            }
            return n5;
        }
        illegalArgumentException = new IllegalArgumentException("0 polynomial");
        throw illegalArgumentException;
    }

    private static void a(int n2, int n3, b b2) {
        for (int i2 = 0; i2 < 8; ++i2) {
            int n4 = n2 + i2;
            if (e.b(b2.a(n4, n3))) {
                b2.a(n4, n3, 0);
                continue;
            }
            throw new d();
        }
    }

    static void a(f.d.c.e.a a2, int n2, b b2) {
        d d2;
        int n3 = -1 + b2.b();
        int n4 = 0;
        int n5 = -1;
        for (int i2 = -1 + b2.c(); i2 > 0; i2 -= 2) {
            if (i2 == 6) {
                --i2;
            }
            while (n3 >= 0 && n3 < b2.b()) {
                int n6 = n4;
                for (int i3 = 0; i3 < 2; ++i3) {
                    boolean bl;
                    int n7 = i2 - i3;
                    if (!e.b(b2.a(n7, n3))) continue;
                    if (n6 < a2.a()) {
                        bl = a2.a(n6);
                        ++n6;
                    } else {
                        bl = false;
                    }
                    if (n2 != -1 && f.d.c.f.c.d.a(n2, n7, n3)) {
                        bl ^= true;
                    }
                    b2.a(n7, n3, bl);
                }
                n3 += n5;
                n4 = n6;
            }
            n5 = -n5;
            n3 += n5;
        }
        if (n4 == a2.a()) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Not all bits consumed: ");
        stringBuilder.append(n4);
        stringBuilder.append('/');
        stringBuilder.append(a2.a());
        d2 = new d(stringBuilder.toString());
        throw d2;
    }

    static void a(f.d.c.e.a a2, a a3, c c2, int n2, b b2) {
        e.a(b2);
        e.a(c2, b2);
        e.a(a3, n2, b2);
        e.c(c2, b2);
        e.a(a2, n2, b2);
    }

    static void a(a a2, int n2, f.d.c.e.a a3) {
        if (f.b(n2)) {
            int n3 = n2 | a2.a() << 3;
            a3.a(n3, 5);
            a3.a(e.a(n3, 1335), 10);
            f.d.c.e.a a4 = new f.d.c.e.a();
            a4.a(21522, 15);
            a3.b(a4);
            if (a3.a() == 15) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("should not happen but we got: ");
            stringBuilder.append(a3.a());
            throw new d(stringBuilder.toString());
        }
        throw new d("Invalid mask pattern");
    }

    static void a(a a2, int n2, b b2) {
        f.d.c.e.a a3 = new f.d.c.e.a();
        e.a(a2, n2, a3);
        for (int i2 = 0; i2 < a3.a(); ++i2) {
            boolean bl = a3.a(a3.a() - 1 - i2);
            int[][] arrn = d;
            b2.a(arrn[i2][0], arrn[i2][1], bl);
            if (i2 < 8) {
                b2.a(b2.c() - i2 - 1, 8, bl);
                continue;
            }
            b2.a(8, -7 + b2.b() + (i2 - 8), bl);
        }
    }

    static void a(c c2, f.d.c.e.a a2) {
        a2.a(c2.c(), 6);
        a2.a(e.a(c2.c(), 7973), 12);
        if (a2.a() == 18) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("should not happen but we got: ");
        stringBuilder.append(a2.a());
        throw new d(stringBuilder.toString());
    }

    static void a(c c2, b b2) {
        e.c(b2);
        e.b(b2);
        e.b(c2, b2);
        e.d(b2);
    }

    static void a(b b2) {
        b2.a((byte)-1);
    }

    private static void b(int n2, int n3, b b2) {
        for (int i2 = 0; i2 < 5; ++i2) {
            for (int i3 = 0; i3 < 5; ++i3) {
                b2.a(n2 + i3, n3 + i2, b[i2][i3]);
            }
        }
    }

    private static void b(c c2, b b2) {
        if (c2.c() < 2) {
            return;
        }
        int n2 = -1 + c2.c();
        int[][] arrn = c;
        int[] arrn2 = arrn[n2];
        int n3 = arrn[n2].length;
        for (int i2 = 0; i2 < n3; ++i2) {
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4 = arrn2[i2];
                int n5 = arrn2[i3];
                if (n5 == -1 || n4 == -1 || !e.b(b2.a(n5, n4))) continue;
                e.b(n5 - 2, n4 - 2, b2);
            }
        }
    }

    private static void b(b b2) {
        if (b2.a(8, b2.b() - 8) != 0) {
            b2.a(8, b2.b() - 8, 1);
            return;
        }
        throw new d();
    }

    private static boolean b(int n2) {
        return n2 == -1;
    }

    private static void c(int n2, int n3, b b2) {
        for (int i2 = 0; i2 < 7; ++i2) {
            for (int i3 = 0; i3 < 7; ++i3) {
                b2.a(n2 + i3, n3 + i2, a[i2][i3]);
            }
        }
    }

    static void c(c c2, b b2) {
        if (c2.c() < 7) {
            return;
        }
        f.d.c.e.a a2 = new f.d.c.e.a();
        e.a(c2, a2);
        int n2 = 17;
        for (int i2 = 0; i2 < 6; ++i2) {
            int n3 = n2;
            for (int i3 = 0; i3 < 3; ++i3) {
                boolean bl = a2.a(n3);
                --n3;
                b2.a(i2, i3 + (-11 + b2.b()), bl);
                b2.a(i3 + (-11 + b2.b()), i2, bl);
            }
            n2 = n3;
        }
    }

    private static void c(b b2) {
        int n2 = a[0].length;
        e.c(0, 0, b2);
        e.c(b2.c() - n2, 0, b2);
        e.c(0, b2.c() - n2, b2);
        e.a(0, 7, b2);
        e.a(-8 + b2.c(), 7, b2);
        e.a(0, -8 + b2.c(), b2);
        e.d(7, 0, b2);
        e.d(-1 + (b2.b() - 7), 0, b2);
        e.d(7, b2.b() - 7, b2);
    }

    private static void d(int n2, int n3, b b2) {
        for (int i2 = 0; i2 < 7; ++i2) {
            int n4 = n3 + i2;
            if (e.b(b2.a(n2, n4))) {
                b2.a(n2, n4, 0);
                continue;
            }
            throw new d();
        }
    }

    private static void d(b b2) {
        int n2 = 8;
        while (n2 < b2.c() - 8) {
            int n3 = n2 + 1;
            int n4 = n3 % 2;
            if (e.b(b2.a(n2, 6))) {
                b2.a(n2, 6, n4);
            }
            if (e.b(b2.a(6, n2))) {
                b2.a(6, n2, n4);
            }
            n2 = n3;
        }
    }
}

