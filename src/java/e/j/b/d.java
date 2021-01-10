/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.UnsupportedEncodingException
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.nio.charset.StandardCharsets
 *  java.util.Arrays
 */
package e.j.b;

import android.util.Log;
import e.j.b.d;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class d {
    private static final String d = new String("\u266b".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
    private final StringBuilder a = new StringBuilder();
    private int b = 0;
    private i c;

    d(i i2) {
        this.c = new i((d)this){

            public void a(c c2) {
            }
        };
        if (i2 != null) {
            this.c = i2;
        }
    }

    private int a(byte[] arrby, int n2) {
        int n3 = this.b;
        if (n3 >= 24 && n3 <= 31) {
            if (n3 == 24) {
                try {
                    if (arrby[n2] == 0) {
                        this.a.append((char)arrby[n2 + 1]);
                    } else {
                        String string = new String(Arrays.copyOfRange((byte[])arrby, (int)n2, (int)(n2 + 2)), "EUC-KR");
                        this.a.append(string);
                    }
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    Log.e((String)"Cea708CCParser", (String)"P16 Code - Could not find supported encoding", (Throwable)unsupportedEncodingException);
                }
            }
            return n2 + 2;
        }
        int n4 = this.b;
        if (n4 >= 16 && n4 <= 23) {
            return n2 + 1;
        }
        int n5 = this.b;
        if (n5 != 0) {
            c c2;
            if (n5 != 3) {
                if (n5 != 8) {
                    switch (n5) {
                        default: {
                            return n2;
                        }
                        case 14: {
                            c2 = new c(2, (Object)Character.valueOf((char)((char)n5)));
                            break;
                        }
                        case 13: {
                            this.a.append('\n');
                            return n2;
                        }
                        case 12: {
                            c2 = new c(2, (Object)Character.valueOf((char)((char)n5)));
                            break;
                        }
                    }
                } else {
                    c2 = new c(2, (Object)Character.valueOf((char)((char)n5)));
                }
            } else {
                c2 = new c(2, (Object)Character.valueOf((char)((char)n5)));
            }
            d.super.a(c2);
        }
        return n2;
    }

    private void a() {
        if (this.a.length() > 0) {
            this.c.a(new c(1, this.a.toString()));
            this.a.setLength(0);
        }
    }

    private void a(c c2) {
        d.super.a();
        this.c.a(c2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int b(byte[] var1, int var2_2) {
        var3_3 = this.b;
        switch (var3_3) {
            default: {
                return var2_2;
            }
            case 152: 
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 159: {
                var48_4 = var3_3 - 152;
                var49_5 = (32 & var1[var2_2]) != 0;
                var50_6 = (16 & var1[var2_2]) != 0;
                var51_7 = (8 & var1[var2_2]) != 0;
                var52_8 = 7 & var1[var2_2];
                var53_9 = var2_2 + 1;
                var54_10 = (128 & var1[var53_9]) != 0;
                var55_11 = 127 & var1[var53_9];
                var56_12 = 255 & var1[var2_2 + 2];
                var57_13 = var2_2 + 3;
                var58_14 = (240 & var1[var57_13]) >> 4;
                var59_15 = 15 & var1[var57_13];
                var60_16 = 63 & var1[var2_2 + 4];
                var61_17 = var2_2 + 5;
                var62_18 = (56 & var1[var61_17]) >> 3;
                var63_19 = 7 & var1[var61_17];
                var5_20 = var2_2 + 6;
                var64_21 = new g(var48_4, var49_5, var50_6, var51_7, var52_8, var54_10, var55_11, var56_12, var58_14, var59_15, var60_16, var63_19, var62_18);
                var6_22 = new c(16, var64_21);
                ** GOTO lbl110
            }
            case 151: {
                var33_23 = new b((192 & var1[var2_2]) >> 6, (48 & var1[var2_2]) >> 4, (12 & var1[var2_2]) >> 2, 3 & var1[var2_2]);
                var34_24 = var2_2 + 1;
                var35_25 = (192 & var1[var34_24]) >> 6;
                var36_26 = var2_2 + 2;
                var37_27 = var35_25 | (128 & var1[var36_26]) >> 5;
                var38_28 = new b(0, (48 & var1[var34_24]) >> 4, (12 & var1[var34_24]) >> 2, 3 & var1[var34_24]);
                var39_29 = (64 & var1[var36_26]) != 0;
                var40_30 = (48 & var1[var36_26]) >> 4;
                var41_31 = (12 & var1[var36_26]) >> 2;
                var42_32 = 3 & var1[var36_26];
                var43_33 = var2_2 + 3;
                var44_34 = (240 & var1[var43_33]) >> 4;
                var45_35 = (12 & var1[var43_33]) >> 2;
                var46_36 = 3 & var1[var43_33];
                var22_37 = var2_2 + 4;
                var47_38 = new h(var33_23, var38_28, var37_27, var39_29, var40_30, var41_31, var42_32, var45_35, var44_34, var46_36);
                d.super.a(new c(15, var47_38));
                return var22_37;
            }
            case 146: {
                var30_39 = 15 & var1[var2_2];
                var31_40 = 63 & var1[var2_2 + 1];
                var32_41 = var2_2 + 2;
                d.super.a(new c(14, new f(var30_39, var31_40)));
                return var32_41;
            }
            case 145: {
                var25_42 = new b((192 & var1[var2_2]) >> 6, (48 & var1[var2_2]) >> 4, (12 & var1[var2_2]) >> 2, 3 & var1[var2_2]);
                var26_43 = var2_2 + 1;
                var27_44 = new b((192 & var1[var26_43]) >> 6, (48 & var1[var26_43]) >> 4, (12 & var1[var26_43]) >> 2, 3 & var1[var26_43]);
                var28_45 = var26_43 + 1;
                var29_46 = new b(0, (48 & var1[var28_45]) >> 4, (12 & var1[var28_45]) >> 2, 3 & var1[var28_45]);
                var22_37 = var28_45 + 1;
                var24_47 = new c(13, new e(var25_42, var27_44, var29_46));
                ** GOTO lbl72
            }
            case 144: {
                var14_48 = (240 & var1[var2_2]) >> 4;
                var15_49 = 3 & var1[var2_2];
                var16_50 = (12 & var1[var2_2]) >> 2;
                var17_51 = var2_2 + 1;
                var18_52 = (128 & var1[var17_51]) != 0;
                var19_53 = (64 & var1[var17_51]) != 0;
                var20_54 = (56 & var1[var17_51]) >> 3;
                var21_55 = 7 & var1[var17_51];
                var22_37 = var2_2 + 2;
                var23_56 = new d(var15_49, var16_50, var14_48, var21_55, var20_54, var19_53, var18_52);
                var24_47 = new c(12, var23_56);
lbl72: // 2 sources:
                d.super.a(var24_47);
                return var22_37;
            }
            case 143: {
                var13_57 = new c(11, null);
                ** GOTO lbl79
            }
            case 142: {
                var13_57 = new c(10, null);
lbl79: // 2 sources:
                d.super.a(var13_57);
                return var2_2;
            }
            case 141: {
                var12_58 = 255 & var1[var2_2];
                var5_20 = var2_2 + 1;
                var6_22 = new c(9, var12_58);
                ** GOTO lbl110
            }
            case 140: {
                var11_59 = 255 & var1[var2_2];
                var5_20 = var2_2 + 1;
                var6_22 = new c(8, var11_59);
                ** GOTO lbl110
            }
            case 139: {
                var10_60 = 255 & var1[var2_2];
                var5_20 = var2_2 + 1;
                var6_22 = new c(7, var10_60);
                ** GOTO lbl110
            }
            case 138: {
                var9_61 = 255 & var1[var2_2];
                var5_20 = var2_2 + 1;
                var6_22 = new c(6, var9_61);
                ** GOTO lbl110
            }
            case 137: {
                var7_62 = 255 & var1[var2_2];
                var8_63 = var2_2 + 1;
                d.super.a(new c(5, var7_62));
                return var8_63;
            }
            case 136: {
                var4_64 = 255 & var1[var2_2];
                var5_20 = var2_2 + 1;
                var6_22 = new c(4, var4_64);
lbl110: // 6 sources:
                d.super.a(var6_22);
                return var5_20;
            }
            case 128: 
            case 129: 
            case 130: 
            case 131: 
            case 132: 
            case 133: 
            case 134: 
            case 135: 
        }
        d.super.a(new c(3, var3_3 - 128));
        return var2_2;
    }

    private int c(byte[] arrby, int n2) {
        int n3 = this.b;
        if (n3 >= 0 && n3 <= 7) {
            return n2;
        }
        int n4 = this.b;
        if (n4 >= 8 && n4 <= 15) {
            return n2 + 1;
        }
        int n5 = this.b;
        if (n5 >= 16 && n5 <= 23) {
            return n2 + 2;
        }
        int n6 = this.b;
        if (n6 >= 24 && n6 <= 31) {
            n2 += 3;
        }
        return n2;
    }

    private int d(byte[] arrby, int n2) {
        int n3 = this.b;
        if (n3 >= 128 && n3 <= 135) {
            return n2 + 4;
        }
        int n4 = this.b;
        if (n4 >= 136 && n4 <= 143) {
            n2 += 5;
        }
        return n2;
    }

    private int e(byte[] arrby, int n2) {
        this.b = 255 & arrby[n2];
        int n3 = n2 + 1;
        int n4 = this.b;
        if (n4 >= 0 && n4 <= 31) {
            return d.super.c(arrby, n3);
        }
        int n5 = this.b;
        if (n5 >= 128 && n5 <= 159) {
            return d.super.d(arrby, n3);
        }
        int n6 = this.b;
        if (n6 >= 32 && n6 <= 127) {
            d.super.h(arrby, n3);
            return n3;
        }
        int n7 = this.b;
        if (n7 >= 160 && n7 <= 255) {
            d.super.i(arrby, n3);
        }
        return n3;
    }

    private int f(byte[] arrby, int n2) {
        int n3 = this.b;
        if (n3 == 127) {
            this.a.append(d);
            return n2;
        }
        this.a.append((char)n3);
        return n2;
    }

    private int g(byte[] arrby, int n2) {
        this.a.append((char)this.b);
        return n2;
    }

    private int h(byte[] arrby, int n2) {
        int n3 = this.b;
        if (n3 == 32 || n3 != 33) {
            // empty if block
        }
        return n2;
    }

    private int i(byte[] arrby, int n2) {
        return n2;
    }

    private int j(byte[] arrby, int n2) {
        this.b = 255 & arrby[n2];
        int n3 = n2 + 1;
        int n4 = this.b;
        if (n4 == 16) {
            return d.super.e(arrby, n3);
        }
        if (n4 >= 0 && n4 <= 31) {
            return d.super.a(arrby, n3);
        }
        int n5 = this.b;
        if (n5 >= 128 && n5 <= 159) {
            return d.super.b(arrby, n3);
        }
        int n6 = this.b;
        if (n6 >= 32 && n6 <= 127) {
            d.super.f(arrby, n3);
            return n3;
        }
        int n7 = this.b;
        if (n7 >= 160 && n7 <= 255) {
            d.super.g(arrby, n3);
        }
        return n3;
    }

    public void a(byte[] arrby) {
        int n2 = 0;
        while (n2 < arrby.length) {
            n2 = d.super.j(arrby, n2);
        }
        d.super.a();
    }

    public static class b {
        b(int n2, int n3, int n4, int n5) {
        }
    }

    public static class c {
        public final int a;
        public final Object b;

        c(int n2, Object object) {
            this.a = n2;
            this.b = object;
        }
    }

    public static class d {
        public final int a;
        public final int b;
        public final boolean c;
        public final boolean d;

        d(int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2) {
            this.a = n2;
            this.b = n3;
            this.c = bl;
            this.d = bl2;
        }
    }

    public static class e {
        e(b b2, b b3, b b4) {
        }
    }

    public static class f {
        public final int a;
        public final int b;

        f(int n2, int n3) {
            this.a = n2;
            this.b = n3;
        }
    }

    public static class g {
        public final int a;
        public final boolean b;
        public final boolean c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;

        g(int n2, boolean bl, boolean bl2, boolean bl3, int n3, boolean bl4, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
            this.a = n2;
            this.b = bl;
            this.c = bl4;
            this.d = n4;
            this.e = n5;
            this.f = n6;
            this.g = n7;
            this.h = n8;
        }
    }

    public static class h {
        h(b b2, b b3, int n2, boolean bl, int n3, int n4, int n5, int n6, int n7, int n8) {
        }
    }

    static interface i {
        public void a(c var1);
    }

}

