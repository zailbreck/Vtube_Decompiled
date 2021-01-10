/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.ArithmeticException
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.d.c.e.d;

import f.d.c.e.d.b;

public final class a {
    public static final a g;
    public static final a h;
    private final int[] a;
    private final int[] b;
    private final b c;
    private final int d;
    private final int e;
    private final int f;

    static {
        new a(4201, 4096, 1);
        new a(1033, 1024, 1);
        g = new a(67, 64, 1);
        new a(19, 16, 1);
        h = new a(285, 256, 0);
        new a(301, 256, 1);
    }

    public a(int n2, int n3, int n4) {
        this.e = n2;
        this.d = n3;
        this.f = n4;
        this.a = new int[n3];
        this.b = new int[n3];
        int n5 = 1;
        for (int i2 = 0; i2 < n3; ++i2) {
            this.a[i2] = n5;
            if ((n5 <<= 1) < n3) continue;
            n5 = (n5 ^ n2) & n3 - 1;
        }
        int n6 = 0;
        while (n6 < n3 - 1) {
            this.b[this.a[n6]] = n6++;
        }
        this.c = new b((a)this, new int[]{0});
        new b((a)this, new int[]{1});
    }

    static int c(int n2, int n3) {
        return n2 ^ n3;
    }

    public int a() {
        return this.f;
    }

    int a(int n2) {
        return this.a[n2];
    }

    b a(int n2, int n3) {
        if (n2 >= 0) {
            if (n3 == 0) {
                return this.c;
            }
            int[] arrn = new int[n2 + 1];
            arrn[0] = n3;
            return new b((a)this, arrn);
        }
        throw new IllegalArgumentException();
    }

    int b(int n2) {
        if (n2 != 0) {
            return this.a[-1 + (this.d - this.b[n2])];
        }
        throw new ArithmeticException();
    }

    int b(int n2, int n3) {
        if (n2 != 0 && n3 != 0) {
            int[] arrn = this.a;
            int[] arrn2 = this.b;
            return arrn[(arrn2[n2] + arrn2[n3]) % (-1 + this.d)];
        }
        return 0;
    }

    b b() {
        return this.c;
    }

    int c(int n2) {
        if (n2 != 0) {
            return this.b[n2];
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GF(0x");
        stringBuilder.append(Integer.toHexString((int)this.e));
        stringBuilder.append(',');
        stringBuilder.append(this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

