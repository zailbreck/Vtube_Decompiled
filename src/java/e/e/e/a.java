/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ThreadLocal
 */
package e.e.e;

import android.graphics.Color;

public final class a {
    private static final ThreadLocal<double[]> a = new ThreadLocal();

    public static double a(int n2) {
        double[] arrd = a.a();
        a.a(n2, arrd);
        return arrd[1] / 100.0;
    }

    public static double a(int n2, int n3) {
        if (Color.alpha((int)n3) == 255) {
            if (Color.alpha((int)n2) < 255) {
                n2 = a.c(n2, n3);
            }
            double d2 = 0.05 + a.a(n2);
            double d3 = 0.05 + a.a(n3);
            return Math.max((double)d2, (double)d3) / Math.min((double)d2, (double)d3);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("background can not be translucent: #");
        stringBuilder.append(Integer.toHexString((int)n3));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static float a(float f2, float f3, float f4) {
        if (f2 < f3) {
            return f3;
        }
        if (f2 > f4) {
            f2 = f4;
        }
        return f2;
    }

    public static int a(int n2, int n3, float f2) {
        IllegalArgumentException illegalArgumentException;
        int n4;
        int n5 = Color.alpha((int)n3);
        if (n5 == (n4 = 255)) {
            double d2;
            double d3 = a.a(a.d(n2, n4), n3);
            if (d3 < (d2 = (double)f2)) {
                return -1;
            }
            int n6 = 0;
            for (int i2 = 0; i2 <= 10 && n4 - n6 > 1; ++i2) {
                int n7 = (n6 + n4) / 2;
                if (a.a(a.d(n2, n7), n3) < d2) {
                    n6 = n7;
                    continue;
                }
                n4 = n7;
            }
            return n4;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("background can not be translucent: #");
        stringBuilder.append(Integer.toHexString((int)n3));
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    private static int a(int n2, int n3, int n4, int n5, int n6) {
        if (n6 == 0) {
            return 0;
        }
        return (n3 * (n2 * 255) + n4 * n5 * (255 - n3)) / (n6 * 255);
    }

    public static void a(int n2, int n3, int n4, double[] arrd) {
        if (arrd.length == 3) {
            double d2 = n2;
            Double.isNaN((double)d2);
            double d3 = d2 / 255.0;
            double d4 = d3 < 0.04045 ? d3 / 12.92 : Math.pow((double)((d3 + 0.055) / 1.055), (double)2.4);
            double d5 = d4;
            double d6 = n3;
            Double.isNaN((double)d6);
            double d7 = d6 / 255.0;
            double d8 = d7 < 0.04045 ? d7 / 12.92 : Math.pow((double)((d7 + 0.055) / 1.055), (double)2.4);
            double d9 = d8;
            double d10 = n4;
            Double.isNaN((double)d10);
            double d11 = d10 / 255.0;
            double d12 = d11 < 0.04045 ? d11 / 12.92 : Math.pow((double)((d11 + 0.055) / 1.055), (double)2.4);
            arrd[0] = 100.0 * (0.4124 * d5 + 0.3576 * d9 + 0.1805 * d12);
            arrd[1] = 100.0 * (0.2126 * d5 + 0.7152 * d9 + 0.0722 * d12);
            arrd[2] = 100.0 * (d5 * 0.0193 + d9 * 0.1192 + d12 * 0.9505);
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static void a(int n2, int n3, int n4, float[] arrf) {
        float f2;
        float f3;
        float f4 = (float)n2 / 255.0f;
        float f5 = (float)n3 / 255.0f;
        float f6 = (float)n4 / 255.0f;
        float f7 = Math.max((float)f4, (float)Math.max((float)f5, (float)f6));
        float f8 = Math.min((float)f4, (float)Math.min((float)f5, (float)f6));
        float f9 = f7 - f8;
        float f10 = (f7 + f8) / 2.0f;
        if (f7 == f8) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            f3 = f7 == f4 ? (f5 - f6) / f9 % 6.0f : (f7 == f5 ? 2.0f + (f6 - f4) / f9 : 4.0f + (f4 - f5) / f9);
            f2 = f9 / (1.0f - Math.abs((float)(2.0f * f10 - 1.0f)));
        }
        float f11 = f3 * 60.0f % 360.0f;
        if (f11 < 0.0f) {
            f11 += 360.0f;
        }
        arrf[0] = a.a(f11, 0.0f, 360.0f);
        arrf[1] = a.a(f2, 0.0f, 1.0f);
        arrf[2] = a.a(f10, 0.0f, 1.0f);
    }

    public static void a(int n2, double[] arrd) {
        a.a(Color.red((int)n2), Color.green((int)n2), Color.blue((int)n2), arrd);
    }

    public static void a(int n2, float[] arrf) {
        a.a(Color.red((int)n2), Color.green((int)n2), Color.blue((int)n2), arrf);
    }

    private static double[] a() {
        double[] arrd = (double[])a.get();
        if (arrd == null) {
            arrd = new double[3];
            a.set((Object)arrd);
        }
        return arrd;
    }

    private static int b(int n2, int n3) {
        return 255 - (255 - n3) * (255 - n2) / 255;
    }

    public static int c(int n2, int n3) {
        int n4 = Color.alpha((int)n3);
        int n5 = Color.alpha((int)n2);
        int n6 = a.b(n5, n4);
        return Color.argb((int)n6, (int)a.a(Color.red((int)n2), n5, Color.red((int)n3), n4, n6), (int)a.a(Color.green((int)n2), n5, Color.green((int)n3), n4, n6), (int)a.a(Color.blue((int)n2), n5, Color.blue((int)n3), n4, n6));
    }

    public static int d(int n2, int n3) {
        if (n3 >= 0 && n3 <= 255) {
            return n2 & 16777215 | n3 << 24;
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}

