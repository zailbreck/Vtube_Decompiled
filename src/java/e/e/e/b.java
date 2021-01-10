/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.util.Log
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package e.e.e;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

public class b {
    private static int a(String string, int n2) {
        while (n2 < string.length()) {
            char c2 = string.charAt(n2);
            if (((c2 - 65) * (c2 - 90) <= 0 || (c2 - 97) * (c2 - 122) <= 0) && c2 != 'e' && c2 != 'E') {
                return n2;
            }
            ++n2;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static void a(String var0_1, int var1, a var2_2) {
        var2_2.b = false;
        var4_4 = false;
        var5_5 = false;
        var6_6 = false;
        for (var3_3 = var1; var3_3 < var0_1.length(); ++var3_3) {
            block9 : {
                block8 : {
                    var7_7 = var0_1.charAt(var3_3);
                    if (var7_7 == ' ') break block8;
                    if (var7_7 == 'E' || var7_7 == 'e') ** GOTO lbl23
                    switch (var7_7) {
                        default: {
                            ** GOTO lbl21
                        }
                        case '.': {
                            if (var5_5) ** GOTO lbl19
                            var5_5 = true;
                            var4_4 = false;
                            break block9;
                        }
                        case '-': {
                            if (var3_3 == var1 || var4_4) ** GOTO lbl21
lbl19: // 2 sources:
                            var2_2.b = true;
                            break;
lbl21: // 2 sources:
                            var4_4 = false;
                            break block9;
                        }
lbl23: // 1 sources:
                        var4_4 = true;
                        break block9;
                        case ',': 
                    }
                }
                var4_4 = false;
                var6_6 = true;
            }
            if (var6_6) break;
        }
        var2_2.a = var3_3;
    }

    private static void a(ArrayList<b> arrayList, char c2, float[] arrf) {
        arrayList.add((Object)new b(c2, arrf));
    }

    public static boolean a(b[] arrb, b[] arrb2) {
        if (arrb != null) {
            if (arrb2 == null) {
                return false;
            }
            if (arrb.length != arrb2.length) {
                return false;
            }
            for (int i2 = 0; i2 < arrb.length; ++i2) {
                if (arrb[i2].a == arrb2[i2].a) {
                    if (arrb[i2].b.length == arrb2[i2].b.length) continue;
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    static float[] a(float[] arrf, int n2, int n3) {
        if (n2 <= n3) {
            int n4 = arrf.length;
            if (n2 >= 0 && n2 <= n4) {
                int n5 = n3 - n2;
                int n6 = Math.min((int)n5, (int)(n4 - n2));
                float[] arrf2 = new float[n5];
                System.arraycopy((Object)arrf, (int)n2, (Object)arrf2, (int)0, (int)n6);
                return arrf2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static b[] a(String string) {
        if (string == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int n2 = 1;
        int n3 = 0;
        while (n2 < string.length()) {
            int n4 = b.a(string, n2);
            String string2 = string.substring(n3, n4).trim();
            if (string2.length() > 0) {
                float[] arrf = b.c(string2);
                b.a((ArrayList<b>)arrayList, string2.charAt(0), arrf);
            }
            int n5 = n4 + 1;
            n3 = n4;
            n2 = n5;
        }
        if (n2 - n3 == 1 && n3 < string.length()) {
            b.a((ArrayList<b>)arrayList, string.charAt(n3), new float[0]);
        }
        return (b[])arrayList.toArray((Object[])new b[arrayList.size()]);
    }

    public static b[] a(b[] arrb) {
        if (arrb == null) {
            return null;
        }
        b[] arrb2 = new b[arrb.length];
        for (int i2 = 0; i2 < arrb.length; ++i2) {
            arrb2[i2] = new b(arrb[i2]);
        }
        return arrb2;
    }

    public static Path b(String string) {
        Path path = new Path();
        b[] arrb = b.a(string);
        if (arrb != null) {
            try {
                b.a(arrb, path);
                return path;
            }
            catch (RuntimeException runtimeException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error in parsing ");
                stringBuilder.append(string);
                throw new RuntimeException(stringBuilder.toString(), (Throwable)runtimeException);
            }
        }
        return null;
    }

    public static void b(b[] arrb, b[] arrb2) {
        for (int i2 = 0; i2 < arrb2.length; ++i2) {
            arrb[i2].a = arrb2[i2].a;
            for (int i3 = 0; i3 < arrb2[i2].b.length; ++i3) {
                arrb[i2].b[i3] = arrb2[i2].b[i3];
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static float[] c(String string) {
        int n2;
        int n3;
        float[] arrf;
        a a2;
        int n4;
        if (string.charAt(0) == 'z') return new float[0];
        if (string.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            arrf = new float[string.length()];
            a2 = new a();
            n4 = string.length();
            n2 = 1;
            n3 = 0;
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("error in parsing \"");
            stringBuilder.append(string);
            stringBuilder.append("\"");
            throw new RuntimeException(stringBuilder.toString(), (Throwable)numberFormatException);
        }
        while (n2 < n4) {
            b.a(string, n2, a2);
            int n5 = a2.a;
            if (n2 < n5) {
                int n6 = n3 + 1;
                arrf[n3] = Float.parseFloat((String)string.substring(n2, n5));
                n3 = n6;
            }
            if (a2.b) {
                n2 = n5;
                continue;
            }
            n2 = n5 + 1;
        }
        return b.a(arrf, 0, n3);
    }

    private static class a {
        int a;
        boolean b;

        a() {
        }
    }

    public static class b {
        public char a;
        public float[] b;

        b(char c2, float[] arrf) {
            this.a = c2;
            this.b = arrf;
        }

        b(b b2) {
            this.a = b2.a;
            float[] arrf = b2.b;
            this.b = b.a(arrf, 0, arrf.length);
        }

        private static void a(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
            double d11 = d4;
            int n2 = (int)Math.ceil((double)Math.abs((double)(d10 * 4.0 / 3.141592653589793)));
            double d12 = Math.cos((double)d8);
            double d13 = Math.sin((double)d8);
            double d14 = Math.cos((double)d9);
            double d15 = Math.sin((double)d9);
            double d16 = -d11;
            double d17 = d16 * d12;
            double d18 = d17 * d15;
            double d19 = d5 * d13;
            double d20 = d18 - d19 * d14;
            double d21 = d16 * d13;
            double d22 = d15 * d21;
            double d23 = d5 * d12;
            double d24 = d22 + d14 * d23;
            double d25 = n2;
            Double.isNaN((double)d25);
            double d26 = d10 / d25;
            double d27 = d6;
            double d28 = d7;
            double d29 = d24;
            double d30 = d20;
            double d31 = d9;
            for (int i2 = 0; i2 < n2; ++i2) {
                double d32 = d31 + d26;
                double d33 = Math.sin((double)d32);
                double d34 = Math.cos((double)d32);
                double d35 = d2 + d34 * (d11 * d12) - d19 * d33;
                double d36 = d3 + d34 * (d11 * d13) + d23 * d33;
                double d37 = d17 * d33 - d19 * d34;
                double d38 = d33 * d21 + d34 * d23;
                double d39 = d32 - d31;
                double d40 = Math.tan((double)(d39 / 2.0));
                double d41 = Math.sin((double)d39) * (Math.sqrt((double)(4.0 + d40 * (d40 * 3.0))) - 1.0) / 3.0;
                double d42 = d30 * d41;
                int n3 = n2;
                double d43 = d12;
                double d44 = d27 + d42;
                double d45 = d29 * d41;
                double d46 = d13;
                double d47 = d28 + d45;
                double d48 = d41 * d37;
                double d49 = d26;
                double d50 = d35 - d48;
                double d51 = d41 * d38;
                double d52 = d21;
                double d53 = d36 - d51;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float)d44, (float)d47, (float)d50, (float)d53, (float)d35, (float)d36);
                d26 = d49;
                n2 = n3;
                d13 = d46;
                d28 = d36;
                d21 = d52;
                d31 = d32;
                d29 = d38;
                d30 = d37;
                d12 = d43;
                d11 = d4;
                d27 = d35;
            }
        }

        private static void a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean bl, boolean bl2) {
            double d2;
            double d3;
            double d4 = Math.toRadians((double)f8);
            double d5 = Math.cos((double)d4);
            double d6 = Math.sin((double)d4);
            double d7 = f2;
            Double.isNaN((double)d7);
            double d8 = d7 * d5;
            double d9 = f3;
            Double.isNaN((double)d9);
            double d10 = d8 + d9 * d6;
            double d11 = f6;
            Double.isNaN((double)d11);
            double d12 = d10 / d11;
            double d13 = -f2;
            Double.isNaN((double)d13);
            double d14 = d13 * d6;
            Double.isNaN((double)d9);
            double d15 = d14 + d9 * d5;
            double d16 = f7;
            Double.isNaN((double)d16);
            double d17 = d15 / d16;
            double d18 = f4;
            Double.isNaN((double)d18);
            double d19 = d18 * d5;
            double d20 = f5;
            Double.isNaN((double)d20);
            double d21 = d19 + d20 * d6;
            Double.isNaN((double)d11);
            double d22 = d21 / d11;
            double d23 = -f4;
            Double.isNaN((double)d23);
            double d24 = d23 * d6;
            Double.isNaN((double)d20);
            double d25 = d24 + d20 * d5;
            Double.isNaN((double)d16);
            double d26 = d25 / d16;
            double d27 = d12 - d22;
            double d28 = d17 - d26;
            double d29 = (d12 + d22) / 2.0;
            double d30 = (d17 + d26) / 2.0;
            double d31 = d27 * d27 + d28 * d28;
            if (d31 == 0.0) {
                Log.w((String)"PathParser", (String)" Points are coincident");
                return;
            }
            double d32 = 1.0 / d31 - 0.25;
            if (d32 < 0.0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Points are too far apart ");
                stringBuilder.append(d31);
                Log.w((String)"PathParser", (String)stringBuilder.toString());
                float f9 = (float)(Math.sqrt((double)d31) / 1.99999);
                b.a(path, f2, f3, f4, f5, f6 * f9, f7 * f9, f8, bl, bl2);
                return;
            }
            double d33 = Math.sqrt((double)d32);
            double d34 = d27 * d33;
            double d35 = d33 * d28;
            if (bl == bl2) {
                d2 = d29 - d35;
                d3 = d30 + d34;
            } else {
                d2 = d29 + d35;
                d3 = d30 - d34;
            }
            double d36 = Math.atan2((double)(d17 - d3), (double)(d12 - d2));
            double d37 = Math.atan2((double)(d26 - d3), (double)(d22 - d2)) - d36;
            boolean bl3 = d37 >= 0.0;
            if (bl2 != bl3) {
                d37 = d37 > 0.0 ? (d37 -= 6.283185307179586) : (d37 += 6.283185307179586);
            }
            Double.isNaN((double)d11);
            double d38 = d2 * d11;
            Double.isNaN((double)d16);
            double d39 = d3 * d16;
            b.a(path, d38 * d5 - d39 * d6, d38 * d6 + d39 * d5, d11, d16, d7, d9, d4, d36, d37);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        private static void a(Path var0_2, float[] var1_1, char var2_4, char var3_3, float[] var4) {
            var5_5 = var3_3;
            var6_6 = var1_1[0];
            var7_7 = var1_1[1];
            var8_8 = var1_1[2];
            var9_9 = var1_1[3];
            var10_10 = var1_1[4];
            var11_11 = var1_1[5];
            switch (var5_5) {
                case 'Z': 
                case 'z': {
                    var0_2.close();
                    var0_2.moveTo(var10_10, var11_11);
                    var8_8 = var6_6 = var10_10;
                    var9_9 = var7_7 = var11_11;
                }
                default: {
                    var12_12 = 2;
                    ** break;
                }
                case 'Q': 
                case 'S': 
                case 'q': 
                case 's': {
                    var12_12 = 4;
                    ** break;
                }
                case 'H': 
                case 'V': 
                case 'h': 
                case 'v': {
                    var12_12 = 1;
                    ** break;
                }
                case 'C': 
                case 'c': {
                    var12_12 = 6;
                    ** break;
                }
                case 'A': 
                case 'a': 
            }
            var12_12 = 7;
lbl28: // 5 sources:
            var13_13 = var6_6;
            var14_14 = var7_7;
            var15_15 = var10_10;
            var16_16 = var11_11;
            var17_17 = 0;
            var18_18 = var2_4;
            do {
                block39 : {
                    block41 : {
                        block18 : {
                            block19 : {
                                block20 : {
                                    block21 : {
                                        block22 : {
                                            block23 : {
                                                block35 : {
                                                    block40 : {
                                                        block36 : {
                                                            block24 : {
                                                                block25 : {
                                                                    block26 : {
                                                                        block38 : {
                                                                            block27 : {
                                                                                block28 : {
                                                                                    block29 : {
                                                                                        block30 : {
                                                                                            block31 : {
                                                                                                block32 : {
                                                                                                    block37 : {
                                                                                                        block33 : {
                                                                                                            block34 : {
                                                                                                                if (var17_17 >= var4.length) {
                                                                                                                    var19_133 = var14_14;
                                                                                                                    var1_1[0] = var13_13;
                                                                                                                    var1_1[1] = var19_133;
                                                                                                                    var1_1[2] = var8_8;
                                                                                                                    var1_1[3] = var9_9;
                                                                                                                    var1_1[4] = var15_15;
                                                                                                                    var1_1[5] = var16_16;
                                                                                                                    return;
                                                                                                                }
                                                                                                                if (var5_5 == 'A') break block18;
                                                                                                                if (var5_5 == 'C') break block19;
                                                                                                                if (var5_5 == 'H') break block20;
                                                                                                                if (var5_5 == 'Q') break block21;
                                                                                                                if (var5_5 == 'V') break block22;
                                                                                                                if (var5_5 == 'a') break block23;
                                                                                                                if (var5_5 == 'c') break block24;
                                                                                                                if (var5_5 == 'h') break block25;
                                                                                                                if (var5_5 == 'q') break block26;
                                                                                                                if (var5_5 == 'v') break block27;
                                                                                                                if (var5_5 == 'L') break block28;
                                                                                                                if (var5_5 == 'M') break block29;
                                                                                                                if (var5_5 == 'S') break block30;
                                                                                                                if (var5_5 == 'T') break block31;
                                                                                                                if (var5_5 == 'l') break block32;
                                                                                                                if (var5_5 == 'm') break block33;
                                                                                                                if (var5_5 == 's') break block34;
                                                                                                                if (var5_5 == 't') {
                                                                                                                    if (var18_18 != 'q' && var18_18 != 't' && var18_18 != 'Q' && var18_18 != 'T') {
                                                                                                                        var128_53 = 0.0f;
                                                                                                                        var127_28 = 0.0f;
                                                                                                                    } else {
                                                                                                                        var127_28 = var13_13 - var8_8;
                                                                                                                        var128_53 = var14_14 - var9_9;
                                                                                                                    }
                                                                                                                    var129_103 = var17_17 + 0;
                                                                                                                    var130_65 = var4[var129_103];
                                                                                                                    var131_118 = var17_17 + 1;
                                                                                                                    var0_2.rQuadTo(var127_28, var128_53, var130_65, var4[var131_118]);
                                                                                                                    var132_70 = var127_28 + var13_13;
                                                                                                                    var133_128 = var128_53 + var14_14;
                                                                                                                    var13_13 += var4[var129_103];
                                                                                                                    var14_14 += var4[var131_118];
                                                                                                                    var9_9 = var133_128;
                                                                                                                    var8_8 = var132_70;
                                                                                                                }
                                                                                                                break block35;
                                                                                                            }
                                                                                                            if (var18_18 != 'c' && var18_18 != 's' && var18_18 != 'C' && var18_18 != 'S') {
                                                                                                                var119_98 = 0.0f;
                                                                                                                var118_22 = 0.0f;
                                                                                                            } else {
                                                                                                                var117_54 = var13_13 - var8_8;
                                                                                                                var118_22 = var14_14 - var9_9;
                                                                                                                var119_98 = var117_54;
                                                                                                            }
                                                                                                            var120_35 = var17_17 + 0;
                                                                                                            var121_123 = var4[var120_35];
                                                                                                            var122_91 = var17_17 + 1;
                                                                                                            var123_29 = var4[var122_91];
                                                                                                            var124_121 = var17_17 + 2;
                                                                                                            var125_81 = var4[var124_121];
                                                                                                            var126_117 = var17_17 + 3;
                                                                                                            var0_2.rCubicTo(var119_98, var118_22, var121_123, var123_29, var125_81, var4[var126_117]);
                                                                                                            var80_50 = var13_13 + var4[var120_35];
                                                                                                            var81_42 = var14_14 + var4[var122_91];
                                                                                                            var13_13 += var4[var124_121];
                                                                                                            var82_82 = var4[var126_117];
                                                                                                            break block36;
                                                                                                        }
                                                                                                        var115_51 = var17_17 + 0;
                                                                                                        var13_13 += var4[var115_51];
                                                                                                        var116_59 = var17_17 + 1;
                                                                                                        var14_14 += var4[var116_59];
                                                                                                        if (var17_17 <= 0) break block37;
                                                                                                        var0_2.rLineTo(var4[var115_51], var4[var116_59]);
                                                                                                        break block35;
                                                                                                    }
                                                                                                    var0_2.rMoveTo(var4[var115_51], var4[var116_59]);
                                                                                                    ** GOTO lbl163
                                                                                                }
                                                                                                var112_116 = var17_17 + 0;
                                                                                                var113_78 = var4[var112_116];
                                                                                                var114_105 = var17_17 + 1;
                                                                                                var0_2.rLineTo(var113_78, var4[var114_105]);
                                                                                                var13_13 += var4[var112_116];
                                                                                                var92_99 = var4[var114_105];
                                                                                                break block38;
                                                                                            }
                                                                                            if (var18_18 == 'q' || var18_18 == 't' || var18_18 == 'Q' || var18_18 == 'T') {
                                                                                                var13_13 = var13_13 * 2.0f - var8_8;
                                                                                                var14_14 = var14_14 * 2.0f - var9_9;
                                                                                            }
                                                                                            var107_130 = var17_17 + 0;
                                                                                            var108_114 = var4[var107_130];
                                                                                            var109_37 = var17_17 + 1;
                                                                                            var0_2.quadTo(var13_13, var14_14, var108_114, var4[var109_37]);
                                                                                            var110_108 = var4[var107_130];
                                                                                            var111_83 = var4[var109_37];
                                                                                            var9_9 = var14_14;
                                                                                            var8_8 = var13_13;
                                                                                            var22_66 = var17_17;
                                                                                            var13_13 = var110_108;
                                                                                            var14_14 = var111_83;
                                                                                            break block39;
                                                                                        }
                                                                                        if (var18_18 == 'c' || var18_18 == 's' || var18_18 == 'C' || var18_18 == 'S') {
                                                                                            var13_13 = var13_13 * 2.0f - var8_8;
                                                                                            var14_14 = var14_14 * 2.0f - var9_9;
                                                                                        }
                                                                                        var98_115 = var14_14;
                                                                                        var99_71 = var13_13;
                                                                                        var100_131 = var17_17 + 0;
                                                                                        var101_77 = var4[var100_131];
                                                                                        var102_46 = var17_17 + 1;
                                                                                        var103_19 = var4[var102_46];
                                                                                        var104_96 = var17_17 + 2;
                                                                                        var105_100 = var4[var104_96];
                                                                                        var106_72 = var17_17 + 3;
                                                                                        var0_2.cubicTo(var99_71, var98_115, var101_77, var103_19, var105_100, var4[var106_72]);
                                                                                        var80_50 = var4[var100_131];
                                                                                        var81_42 = var4[var102_46];
                                                                                        var13_13 = var4[var104_96];
                                                                                        var14_14 = var4[var106_72];
                                                                                        break block40;
                                                                                    }
                                                                                    var96_45 = var17_17 + 0;
                                                                                    var13_13 = var4[var96_45];
                                                                                    var97_23 = var17_17 + 1;
                                                                                    var14_14 = var4[var97_23];
                                                                                    if (var17_17 > 0) {
                                                                                        var0_2.lineTo(var4[var96_45], var4[var97_23]);
                                                                                    } else {
                                                                                        var0_2.moveTo(var4[var96_45], var4[var97_23]);
lbl163: // 2 sources:
                                                                                        var16_16 = var14_14;
                                                                                        var15_15 = var13_13;
                                                                                    }
                                                                                    break block35;
                                                                                }
                                                                                var93_40 = var17_17 + 0;
                                                                                var94_26 = var4[var93_40];
                                                                                var95_84 = var17_17 + 1;
                                                                                var0_2.lineTo(var94_26, var4[var95_84]);
                                                                                var13_13 = var4[var93_40];
                                                                                var14_14 = var4[var95_84];
                                                                                break block35;
                                                                            }
                                                                            var91_110 = var17_17 + 0;
                                                                            var0_2.rLineTo(0.0f, var4[var91_110]);
                                                                            var92_99 = var4[var91_110];
                                                                        }
                                                                        var14_14 += var92_99;
                                                                        break block35;
                                                                    }
                                                                    var84_31 = var17_17 + 0;
                                                                    var85_74 = var4[var84_31];
                                                                    var86_41 = var17_17 + 1;
                                                                    var87_57 = var4[var86_41];
                                                                    var88_111 = var17_17 + 2;
                                                                    var89_129 = var4[var88_111];
                                                                    var90_85 = var17_17 + 3;
                                                                    var0_2.rQuadTo(var85_74, var87_57, var89_129, var4[var90_85]);
                                                                    var80_50 = var13_13 + var4[var84_31];
                                                                    var81_42 = var14_14 + var4[var86_41];
                                                                    var13_13 += var4[var88_111];
                                                                    var82_82 = var4[var90_85];
                                                                    break block36;
                                                                }
                                                                var83_89 = var17_17 + 0;
                                                                var0_2.rLineTo(var4[var83_89], 0.0f);
                                                                var13_13 += var4[var83_89];
                                                                break block35;
                                                            }
                                                            var71_21 = var4[var17_17 + 0];
                                                            var72_76 = var4[var17_17 + 1];
                                                            var73_127 = var17_17 + 2;
                                                            var74_132 = var4[var73_127];
                                                            var75_120 = var17_17 + 3;
                                                            var76_69 = var4[var75_120];
                                                            var77_126 = var17_17 + 4;
                                                            var78_67 = var4[var77_126];
                                                            var79_107 = var17_17 + 5;
                                                            var0_2.rCubicTo(var71_21, var72_76, var74_132, var76_69, var78_67, var4[var79_107]);
                                                            var80_50 = var13_13 + var4[var73_127];
                                                            var81_42 = var14_14 + var4[var75_120];
                                                            var13_13 += var4[var77_126];
                                                            var82_82 = var4[var79_107];
                                                        }
                                                        var14_14 += var82_82;
                                                    }
                                                    var8_8 = var80_50;
                                                    var9_9 = var81_42;
                                                }
                                                var22_66 = var17_17;
                                                break block39;
                                            }
                                            var57_36 = var17_17 + 5;
                                            var58_62 = var13_13 + var4[var57_36];
                                            var59_39 = var17_17 + 6;
                                            var60_61 = var14_14 + var4[var59_39];
                                            var61_38 = var4[var17_17 + 0];
                                            var62_113 = var4[var17_17 + 1];
                                            var63_47 = var4[var17_17 + 2];
                                            var64_30 = var4[var17_17 + 3] != 0.0f;
                                            var65_124 = var4[var17_17 + 4] != 0.0f;
                                            var66_106 = var13_13;
                                            var67_33 = var14_14;
                                            var68_48 = var14_14;
                                            var69_125 = var13_13;
                                            var70_97 = var64_30;
                                            var22_66 = var17_17;
                                            b.a(var0_2, var66_106, var67_33, var58_62, var60_61, var61_38, var62_113, var63_47, var70_97, var65_124);
                                            var13_13 = var69_125 + var4[var57_36];
                                            var14_14 = var68_48 + var4[var59_39];
                                            break block41;
                                        }
                                        var55_27 = var13_13;
                                        var22_66 = var17_17;
                                        var56_55 = var22_66 + 0;
                                        var0_2.lineTo(var55_27, var4[var56_55]);
                                        var14_14 = var4[var56_55];
                                        break block39;
                                    }
                                    var22_66 = var17_17;
                                    var46_63 = var22_66 + 0;
                                    var47_93 = var4[var46_63];
                                    var48_94 = var22_66 + 1;
                                    var49_32 = var4[var48_94];
                                    var50_112 = var22_66 + 2;
                                    var51_119 = var4[var50_112];
                                    var52_87 = var22_66 + 3;
                                    var0_2.quadTo(var47_93, var49_32, var51_119, var4[var52_87]);
                                    var53_79 = var4[var46_63];
                                    var54_25 = var4[var48_94];
                                    var13_13 = var4[var50_112];
                                    var14_14 = var4[var52_87];
                                    var8_8 = var53_79;
                                    var9_9 = var54_25;
                                    break block39;
                                }
                                var44_122 = var14_14;
                                var22_66 = var17_17;
                                var45_49 = var22_66 + 0;
                                var0_2.lineTo(var4[var45_49], var44_122);
                                var13_13 = var4[var45_49];
                                break block39;
                            }
                            var22_66 = var17_17;
                            var32_101 = var4[var22_66 + 0];
                            var33_109 = var4[var22_66 + 1];
                            var34_68 = var22_66 + 2;
                            var35_75 = var4[var34_68];
                            var36_80 = var22_66 + 3;
                            var37_20 = var4[var36_80];
                            var38_102 = var22_66 + 4;
                            var39_73 = var4[var38_102];
                            var40_43 = var22_66 + 5;
                            var0_2.cubicTo(var32_101, var33_109, var35_75, var37_20, var39_73, var4[var40_43]);
                            var13_13 = var4[var38_102];
                            var41_58 = var4[var40_43];
                            var42_86 = var4[var34_68];
                            var43_92 = var4[var36_80];
                            var14_14 = var41_58;
                            var9_9 = var43_92;
                            var8_8 = var42_86;
                            break block39;
                        }
                        var20_64 = var14_14;
                        var21_88 = var13_13;
                        var22_66 = var17_17;
                        var23_24 = var22_66 + 5;
                        var24_44 = var4[var23_24];
                        var25_60 = var22_66 + 6;
                        var26_56 = var4[var25_60];
                        var27_95 = var4[var22_66 + 0];
                        var28_52 = var4[var22_66 + 1];
                        var29_90 = var4[var22_66 + 2];
                        var30_34 = var4[var22_66 + 3] != 0.0f;
                        var31_104 = var4[var22_66 + 4] != 0.0f;
                        b.a(var0_2, var21_88, var20_64, var24_44, var26_56, var27_95, var28_52, var29_90, var30_34, var31_104);
                        var13_13 = var4[var23_24];
                        var14_14 = var4[var25_60];
                    }
                    var9_9 = var14_14;
                    var8_8 = var13_13;
                }
                var17_17 = var22_66 + var12_12;
                var5_5 = var18_18 = var3_3;
            } while (true);
        }

        public static void a(b[] arrb, Path path) {
            float[] arrf = new float[6];
            char c2 = 'm';
            for (int i2 = 0; i2 < arrb.length; ++i2) {
                b.a(path, arrf, c2, arrb[i2].a, arrb[i2].b);
                c2 = arrb[i2].a;
            }
        }

        public void a(b b2, b b3, float f2) {
            float[] arrf;
            this.a = b2.a;
            for (int i2 = 0; i2 < (arrf = b2.b).length; ++i2) {
                this.b[i2] = arrf[i2] * (1.0f - f2) + f2 * b3.b[i2];
            }
        }
    }

}

