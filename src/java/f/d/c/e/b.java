/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Cloneable
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package f.d.c.e;

import java.util.Arrays;

public final class b
implements Cloneable {
    private final int b;
    private final int c;
    private final int d;
    private final int[] e;

    public b(int n2, int n3) {
        if (n2 > 0 && n3 > 0) {
            this.b = n2;
            this.c = n3;
            this.d = (n2 + 31) / 32;
            this.e = new int[n3 * this.d];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    private b(int n2, int n3, int n4, int[] arrn) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = arrn;
    }

    private String a(String string, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(this.c * (1 + this.b));
        for (int i2 = 0; i2 < this.c; ++i2) {
            for (int i3 = 0; i3 < this.b; ++i3) {
                String string4 = this.a(i3, i2) ? string : string2;
                stringBuilder.append(string4);
            }
            stringBuilder.append(string3);
        }
        return stringBuilder.toString();
    }

    public String a(String string, String string2) {
        return b.super.a(string, string2, "\n");
    }

    public void a(int n2, int n3, int n4, int n5) {
        IllegalArgumentException illegalArgumentException;
        if (n3 >= 0 && n2 >= 0) {
            if (n5 > 0 && n4 > 0) {
                int n6 = n4 + n2;
                int n7 = n5 + n3;
                if (n7 <= this.c && n6 <= this.b) {
                    while (n3 < n7) {
                        int n8 = n3 * this.d;
                        for (int i2 = n2; i2 < n6; ++i2) {
                            int[] arrn = this.e;
                            int n9 = n8 + i2 / 32;
                            arrn[n9] = arrn[n9] | 1 << (i2 & 31);
                        }
                        ++n3;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        illegalArgumentException = new IllegalArgumentException("Left and top must be nonnegative");
        throw illegalArgumentException;
    }

    public boolean a(int n2, int n3) {
        int n4 = n3 * this.d + n2 / 32;
        return (1 & this.e[n4] >>> (n2 & 31)) != 0;
    }

    public b clone() {
        return new b(this.b, this.c, this.d, (int[])this.e.clone());
    }

    public boolean equals(Object object) {
        if (!(object instanceof b)) {
            return false;
        }
        b b2 = (b)object;
        return this.b == b2.b && this.c == b2.c && this.d == b2.d && Arrays.equals((int[])this.e, (int[])b2.e);
    }

    public int hashCode() {
        int n2 = this.b;
        return 31 * (31 * (31 * (n2 + n2 * 31) + this.c) + this.d) + Arrays.hashCode((int[])this.e);
    }

    public String toString() {
        return this.a("X ", "  ");
    }
}

