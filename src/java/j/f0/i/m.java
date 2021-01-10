/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.Arrays
 */
package j.f0.i;

import java.util.Arrays;

public final class m {
    private int a;
    private final int[] b = new int[10];

    int a(int n2) {
        return this.b[n2];
    }

    m a(int n2, int n3) {
        if (n2 >= 0) {
            int[] arrn = this.b;
            if (n2 >= arrn.length) {
                return this;
            }
            this.a = 1 << n2 | this.a;
            arrn[n2] = n3;
        }
        return this;
    }

    void a() {
        this.a = 0;
        Arrays.fill((int[])this.b, (int)0);
    }

    void a(m m2) {
        for (int i2 = 0; i2 < 10; ++i2) {
            if (!m2.d(i2)) continue;
            this.a(i2, m2.a(i2));
        }
    }

    int b() {
        if ((2 & this.a) != 0) {
            return this.b[1];
        }
        return -1;
    }

    int b(int n2) {
        if ((16 & this.a) != 0) {
            n2 = this.b[4];
        }
        return n2;
    }

    int c() {
        if ((128 & this.a) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    int c(int n2) {
        if ((32 & this.a) != 0) {
            n2 = this.b[5];
        }
        return n2;
    }

    int d() {
        return Integer.bitCount((int)this.a);
    }

    boolean d(int n2) {
        return (1 << n2 & this.a) != 0;
    }
}

