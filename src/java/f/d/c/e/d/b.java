/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package f.d.c.e.d;

import f.d.c.e.d.a;

final class b {
    private final a a;
    private final int[] b;

    b(a a2, int[] arrn) {
        IllegalArgumentException illegalArgumentException;
        if (arrn.length != 0) {
            this.a = a2;
            int n2 = arrn.length;
            if (n2 > 1 && arrn[0] == 0) {
                int n3;
                for (n3 = 1; n3 < n2 && arrn[n3] == 0; ++n3) {
                }
                if (n3 == n2) {
                    this.b = new int[]{0};
                    return;
                }
                int[] arrn2 = this.b = new int[n2 - n3];
                System.arraycopy((Object)arrn, (int)n3, (Object)arrn2, (int)0, (int)arrn2.length);
                return;
            }
            this.b = arrn;
            return;
        }
        illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    int a(int n2) {
        int[] arrn = this.b;
        return arrn[-1 + arrn.length - n2];
    }

    b a(int n2, int n3) {
        IllegalArgumentException illegalArgumentException;
        if (n2 >= 0) {
            if (n3 == 0) {
                return this.a.b();
            }
            int n4 = this.b.length;
            int[] arrn = new int[n2 + n4];
            for (int i2 = 0; i2 < n4; ++i2) {
                arrn[i2] = this.a.b(this.b[i2], n3);
            }
            return new b(this.a, arrn);
        }
        illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    b a(b b2) {
        IllegalArgumentException illegalArgumentException;
        if (this.a.equals((Object)b2.a)) {
            if (this.c()) {
                return b2;
            }
            if (b2.c()) {
                return this;
            }
            int[] arrn = this.b;
            int[] arrn2 = b2.b;
            if (arrn.length > arrn2.length) {
                int[] arrn3 = arrn;
                arrn = arrn2;
                arrn2 = arrn3;
            }
            int[] arrn4 = new int[arrn2.length];
            int n2 = arrn2.length - arrn.length;
            System.arraycopy((Object)arrn2, (int)0, (Object)arrn4, (int)0, (int)n2);
            for (int i2 = n2; i2 < arrn2.length; ++i2) {
                arrn4[i2] = a.c(arrn[i2 - n2], arrn2[i2]);
            }
            return new b(this.a, arrn4);
        }
        illegalArgumentException = new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        throw illegalArgumentException;
    }

    int[] a() {
        return this.b;
    }

    int b() {
        return -1 + this.b.length;
    }

    b[] b(b b2) {
        IllegalArgumentException illegalArgumentException;
        if (this.a.equals((Object)b2.a)) {
            if (!b2.c()) {
                b b3 = this.a.b();
                int n2 = b2.a(b2.b());
                int n3 = this.a.b(n2);
                b b4 = b3;
                b b5 = this;
                while (b5.b() >= b2.b() && !b5.c()) {
                    int n4 = b5.b() - b2.b();
                    int n5 = this.a.b(b5.a(b5.b()), n3);
                    b b6 = b2.a(n4, n5);
                    b4 = b4.a(this.a.a(n4, n5));
                    b5 = b5.a(b6);
                }
                return new b[]{b4, b5};
            }
            throw new IllegalArgumentException("Divide by 0");
        }
        illegalArgumentException = new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        throw illegalArgumentException;
    }

    b c(b b2) {
        IllegalArgumentException illegalArgumentException;
        if (this.a.equals((Object)b2.a)) {
            if (!this.c() && !b2.c()) {
                int[] arrn = this.b;
                int n2 = arrn.length;
                int[] arrn2 = b2.b;
                int n3 = arrn2.length;
                int[] arrn3 = new int[-1 + (n2 + n3)];
                for (int i2 = 0; i2 < n2; ++i2) {
                    int n4 = arrn[i2];
                    for (int i3 = 0; i3 < n3; ++i3) {
                        int n5 = i2 + i3;
                        arrn3[n5] = a.c(arrn3[n5], this.a.b(n4, arrn2[i3]));
                    }
                }
                return new b(this.a, arrn3);
            }
            return this.a.b();
        }
        illegalArgumentException = new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        throw illegalArgumentException;
    }

    boolean c() {
        return this.b[0] == 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String toString() {
        var1_1 = new StringBuilder(8 * this.b());
        var2_2 = this.b();
        while (var2_2 >= 0) {
            block9 : {
                block10 : {
                    block11 : {
                        var3_5 = this.a(var2_2);
                        if (var3_5 == 0) break block9;
                        if (var3_5 < 0) {
                            var1_1.append(" - ");
                            var3_5 = -var3_5;
                        } else if (var1_1.length() > 0) {
                            var1_1.append(" + ");
                        }
                        if (var2_2 != 0 && var3_5 == 1) break block10;
                        var4_3 = this.a.c(var3_5);
                        if (var4_3 != 0) break block11;
                        var10_4 = 49;
                        ** GOTO lbl20
                    }
                    if (var4_3 == 1) {
                        var10_4 = 97;
lbl20: // 2 sources:
                        var1_1.append((char)var10_4);
                    } else {
                        var1_1.append("a^");
                        var1_1.append(var4_3);
                    }
                }
                if (var2_2 != 0) {
                    if (var2_2 == 1) {
                        var1_1.append('x');
                    } else {
                        var1_1.append("x^");
                        var1_1.append(var2_2);
                    }
                }
            }
            --var2_2;
        }
        return var1_1.toString();
    }
}

