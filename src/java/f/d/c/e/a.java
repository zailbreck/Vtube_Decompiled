/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Cloneable
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Arrays
 */
package f.d.c.e;

import java.util.Arrays;

public final class a
implements Cloneable {
    private int[] b;
    private int c;

    public a() {
        this.c = 0;
        this.b = new int[1];
    }

    a(int[] arrn, int n2) {
        this.b = arrn;
        this.c = n2;
    }

    private void b(int n2) {
        if (n2 > this.b.length << 5) {
            int[] arrn = a.c(n2);
            int[] arrn2 = this.b;
            System.arraycopy((Object)arrn2, (int)0, (Object)arrn, (int)0, (int)arrn2.length);
            this.b = arrn;
        }
    }

    private static int[] c(int n2) {
        return new int[(n2 + 31) / 32];
    }

    public int a() {
        return this.c;
    }

    public void a(int n2, int n3) {
        IllegalArgumentException illegalArgumentException;
        if (n3 >= 0 && n3 <= 32) {
            a.super.b(n3 + this.c);
            while (n3 > 0) {
                int n4 = n2 >> n3 - 1;
                int n5 = 1;
                if ((n4 & n5) != n5) {
                    n5 = 0;
                }
                this.a((boolean)n5);
                --n3;
            }
            return;
        }
        illegalArgumentException = new IllegalArgumentException("Num bits must be between 0 and 32");
        throw illegalArgumentException;
    }

    public void a(int n2, byte[] arrby, int n3, int n4) {
        int n5 = n2;
        for (int i2 = 0; i2 < n4; ++i2) {
            int n6 = n5;
            int n7 = 0;
            for (int i3 = 0; i3 < 8; ++i3) {
                if (this.a(n6)) {
                    n7 |= 1 << 7 - i3;
                }
                ++n6;
            }
            arrby[n3 + i2] = (byte)n7;
            n5 = n6;
        }
    }

    public void a(a a2) {
        int n2 = a2.c;
        a.super.b(n2 + this.c);
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a(a2.a(i2));
        }
    }

    public void a(boolean bl) {
        a.super.b(1 + this.c);
        if (bl) {
            int[] arrn = this.b;
            int n2 = this.c;
            int n3 = n2 / 32;
            arrn[n3] = arrn[n3] | 1 << (n2 & 31);
        }
        this.c = 1 + this.c;
    }

    public boolean a(int n2) {
        return (this.b[n2 / 32] & 1 << (n2 & 31)) != 0;
    }

    public int b() {
        return (7 + this.c) / 8;
    }

    public void b(a a2) {
        IllegalArgumentException illegalArgumentException;
        if (this.c == a2.c) {
            int[] arrn;
            for (int i2 = 0; i2 < (arrn = this.b).length; ++i2) {
                arrn[i2] = arrn[i2] ^ a2.b[i2];
            }
            return;
        }
        illegalArgumentException = new IllegalArgumentException("Sizes don't match");
        throw illegalArgumentException;
    }

    public a clone() {
        return new a((int[])this.b.clone(), this.c);
    }

    public boolean equals(Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        return this.c == a2.c && Arrays.equals((int[])this.b, (int[])a2.b);
    }

    public int hashCode() {
        return 31 * this.c + Arrays.hashCode((int[])this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.c);
        for (int i2 = 0; i2 < this.c; ++i2) {
            if ((i2 & 7) == 0) {
                stringBuilder.append(' ');
            }
            char c2 = this.a(i2) ? (char)'X' : '.';
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
}

