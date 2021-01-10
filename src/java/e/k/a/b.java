/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.graphics.Rect
 *  android.os.AsyncTask
 *  android.util.Log
 *  android.util.SparseBooleanArray
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.Executor
 */
package e.k.a;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import e.k.a.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public final class b {
    static final c f = new c(){

        private boolean a(float[] arrf) {
            return arrf[2] <= 0.05f;
        }

        private boolean b(float[] arrf) {
            float f2 = arrf[0] FCMPL 10.0f;
            boolean bl = false;
            if (f2 >= 0) {
                float f3 = arrf[0] FCMPG 37.0f;
                bl = false;
                if (f3 <= 0) {
                    float f4 = arrf[1] FCMPG 0.82f;
                    bl = false;
                    if (f4 <= 0) {
                        bl = true;
                    }
                }
            }
            return bl;
        }

        private boolean c(float[] arrf) {
            return arrf[2] >= 0.95f;
        }

        public boolean a(int n2, float[] arrf) {
            return !a.super.c(arrf) && !a.super.a(arrf) && !a.super.b(arrf);
        }
    };
    private final List<e> a;
    private final List<e.k.a.c> b;
    private final Map<e.k.a.c, e> c;
    private final SparseBooleanArray d;
    private final e e;

    b(List<e> list, List<e.k.a.c> list2) {
        this.a = list;
        this.b = list2;
        this.d = new SparseBooleanArray();
        this.c = new e.d.a<e.k.a.c, e>();
        this.e = b.super.b();
    }

    private float a(e e2, e.k.a.c c2) {
        float[] arrf = e2.b();
        e e3 = this.e;
        int n2 = e3 != null ? e3.c() : 1;
        float f2 = c2.g() > 0.0f ? c2.g() * (1.0f - Math.abs((float)(arrf[1] - c2.i()))) : 0.0f;
        float f3 = c2.a() > 0.0f ? c2.a() * (1.0f - Math.abs((float)(arrf[2] - c2.h()))) : 0.0f;
        float f4 = c2.f() FCMPL 0.0f;
        float f5 = 0.0f;
        if (f4 > 0) {
            f5 = c2.f() * ((float)e2.c() / (float)n2);
        }
        return f5 + (f2 + f3);
    }

    public static b a(Bitmap bitmap) {
        return new b(bitmap);
    }

    private e a(e.k.a.c c2) {
        e e2 = b.super.b(c2);
        if (e2 != null && c2.j()) {
            this.d.append(e2.d(), true);
        }
        return e2;
    }

    private e b() {
        int n2 = this.a.size();
        int n3 = Integer.MIN_VALUE;
        e e2 = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            e e3 = (e)this.a.get(i2);
            if (e3.c() <= n3) continue;
            n3 = e3.c();
            e2 = e3;
        }
        return e2;
    }

    private e b(e.k.a.c c2) {
        int n2 = this.a.size();
        float f2 = 0.0f;
        e e2 = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            e e3 = (e)this.a.get(i2);
            if (!b.super.b(e3, c2)) continue;
            float f3 = b.super.a(e3, c2);
            if (e2 != null && !(f3 > f2)) continue;
            e2 = e3;
            f2 = f3;
        }
        return e2;
    }

    private boolean b(e e2, e.k.a.c c2) {
        float[] arrf = e2.b();
        return arrf[1] >= c2.e() && arrf[1] <= c2.c() && arrf[2] >= c2.d() && arrf[2] <= c2.b() && !this.d.get(e2.d());
    }

    public int a(int n2) {
        e e2 = this.e;
        if (e2 != null) {
            n2 = e2.d();
        }
        return n2;
    }

    void a() {
        int n2 = this.b.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            e.k.a.c c2 = (e.k.a.c)this.b.get(i2);
            c2.k();
            this.c.put((Object)c2, (Object)this.a(c2));
        }
        this.d.clear();
    }

    public static final class b {
        private final List<e> a;
        private final Bitmap b;
        private final List<e.k.a.c> c = new ArrayList();
        private int d = 16;
        private int e = 12544;
        private int f = -1;
        private final List<c> g = new ArrayList();
        private Rect h;

        public b(Bitmap bitmap) {
            if (bitmap != null && !bitmap.isRecycled()) {
                this.g.add((Object)b.f);
                this.b = bitmap;
                this.a = null;
                this.c.add((Object)e.k.a.c.e);
                this.c.add((Object)e.k.a.c.f);
                this.c.add((Object)e.k.a.c.g);
                this.c.add((Object)e.k.a.c.h);
                this.c.add((Object)e.k.a.c.i);
                this.c.add((Object)e.k.a.c.j);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        private int[] a(Bitmap bitmap) {
            int n2 = bitmap.getWidth();
            int n3 = bitmap.getHeight();
            int[] arrn = new int[n2 * n3];
            bitmap.getPixels(arrn, 0, n2, 0, 0, n2, n3);
            Rect rect = this.h;
            if (rect == null) {
                return arrn;
            }
            int n4 = rect.width();
            int n5 = this.h.height();
            int[] arrn2 = new int[n4 * n5];
            for (int i2 = 0; i2 < n5; ++i2) {
                Rect rect2 = this.h;
                System.arraycopy((Object)arrn, (int)(n2 * (i2 + rect2.top) + rect2.left), (Object)arrn2, (int)(i2 * n4), (int)n4);
            }
            return arrn2;
        }

        private Bitmap b(Bitmap bitmap) {
            int n2;
            int n3;
            int n4 = this.e;
            double d2 = -1.0;
            if (n4 > 0) {
                int n5;
                int n6 = bitmap.getWidth() * bitmap.getHeight();
                if (n6 > (n5 = this.e)) {
                    double d3 = n5;
                    double d4 = n6;
                    Double.isNaN((double)d3);
                    Double.isNaN((double)d4);
                    d2 = Math.sqrt((double)(d3 / d4));
                }
            } else if (this.f > 0 && (n2 = Math.max((int)bitmap.getWidth(), (int)bitmap.getHeight())) > (n3 = this.f)) {
                double d5 = n3;
                double d6 = n2;
                Double.isNaN((double)d5);
                Double.isNaN((double)d6);
                d2 = d5 / d6;
            }
            if (d2 <= 0.0) {
                return bitmap;
            }
            double d7 = bitmap.getWidth();
            Double.isNaN((double)d7);
            int n7 = (int)Math.ceil((double)(d7 * d2));
            double d8 = bitmap.getHeight();
            Double.isNaN((double)d8);
            return Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n7, (int)((int)Math.ceil((double)(d8 * d2))), (boolean)false);
        }

        public AsyncTask<Bitmap, Void, b> a(final d d2) {
            if (d2 != null) {
                AsyncTask<Bitmap, Void, b> asyncTask = new AsyncTask<Bitmap, Void, b>(){

                    protected /* varargs */ b a(Bitmap ... arrbitmap) {
                        try {
                            b b2 = b.this.a();
                            return b2;
                        }
                        catch (Exception exception) {
                            Log.e((String)"Palette", (String)"Exception thrown during async generate", (Throwable)exception);
                            return null;
                        }
                    }

                    protected void a(b b2) {
                        d2.a(b2);
                    }
                };
                Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
                Object[] arrobject = new Bitmap[]{this.b};
                return asyncTask.executeOnExecutor(executor, arrobject);
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        public b a() {
            block9 : {
                List<e> list;
                block8 : {
                    block7 : {
                        c[] arrc;
                        Bitmap bitmap = this.b;
                        if (bitmap == null) break block7;
                        Bitmap bitmap2 = this.b(bitmap);
                        Rect rect = this.h;
                        if (bitmap2 != this.b && rect != null) {
                            double d2 = bitmap2.getWidth();
                            double d3 = this.b.getWidth();
                            Double.isNaN((double)d2);
                            Double.isNaN((double)d3);
                            double d4 = d2 / d3;
                            double d5 = rect.left;
                            Double.isNaN((double)d5);
                            rect.left = (int)Math.floor((double)(d5 * d4));
                            double d6 = rect.top;
                            Double.isNaN((double)d6);
                            rect.top = (int)Math.floor((double)(d6 * d4));
                            double d7 = rect.right;
                            Double.isNaN((double)d7);
                            rect.right = Math.min((int)((int)Math.ceil((double)(d7 * d4))), (int)bitmap2.getWidth());
                            double d8 = rect.bottom;
                            Double.isNaN((double)d8);
                            rect.bottom = Math.min((int)((int)Math.ceil((double)(d8 * d4))), (int)bitmap2.getHeight());
                        }
                        int[] arrn = this.a(bitmap2);
                        int n2 = this.d;
                        if (this.g.isEmpty()) {
                            arrc = null;
                        } else {
                            List<c> list2 = this.g;
                            arrc = (c[])list2.toArray((Object[])new c[list2.size()]);
                        }
                        e.k.a.a a2 = new e.k.a.a(arrn, n2, arrc);
                        if (bitmap2 != this.b) {
                            bitmap2.recycle();
                        }
                        list = a2.a();
                        break block8;
                    }
                    list = this.a;
                    if (list == null) break block9;
                }
                b b2 = new b(list, this.c);
                b2.a();
                return b2;
            }
            throw new AssertionError();
        }

    }

    public static interface c {
        public boolean a(int var1, float[] var2);
    }

    public static interface d {
        public void a(b var1);
    }

    public static final class e {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private boolean f;
        private int g;
        private int h;
        private float[] i;

        public e(int n2, int n3) {
            this.a = Color.red((int)n2);
            this.b = Color.green((int)n2);
            this.c = Color.blue((int)n2);
            this.d = n2;
            this.e = n3;
        }

        /*
         * Enabled aggressive block sorting
         */
        private void f() {
            block2 : {
                int n2;
                int n3;
                int n4;
                int n5;
                block5 : {
                    int n6;
                    block4 : {
                        block3 : {
                            if (this.f) break block2;
                            n5 = e.e.e.a.a(-1, this.d, 4.5f);
                            n2 = e.e.e.a.a(-1, this.d, 3.0f);
                            if (n5 == -1 || n2 == -1) break block3;
                            this.h = e.e.e.a.d(-1, n5);
                            n6 = e.e.e.a.d(-1, n2);
                            break block4;
                        }
                        n3 = e.e.e.a.a(-16777216, this.d, 4.5f);
                        n4 = e.e.e.a.a(-16777216, this.d, 3.0f);
                        if (n3 == -1 || n4 == -1) break block5;
                        this.h = e.e.e.a.d(-16777216, n3);
                        n6 = e.e.e.a.d(-16777216, n4);
                    }
                    this.g = n6;
                    this.f = true;
                    return;
                }
                int n7 = n5 != -1 ? e.e.e.a.d(-1, n5) : e.e.e.a.d(-16777216, n3);
                this.h = n7;
                int n8 = n2 != -1 ? e.e.e.a.d(-1, n2) : e.e.e.a.d(-16777216, n4);
                this.g = n8;
                this.f = true;
            }
        }

        public int a() {
            this.f();
            return this.h;
        }

        public float[] b() {
            if (this.i == null) {
                this.i = new float[3];
            }
            e.e.e.a.a(this.a, this.b, this.c, this.i);
            return this.i;
        }

        public int c() {
            return this.e;
        }

        public int d() {
            return this.d;
        }

        public int e() {
            this.f();
            return this.g;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (e.class != object.getClass()) {
                    return false;
                }
                e e2 = (e)object;
                return this.e == e2.e && this.d == e2.d;
            }
            return false;
        }

        public int hashCode() {
            return 31 * this.d + this.e;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(e.class.getSimpleName());
            stringBuilder.append(" [RGB: #");
            stringBuilder.append(Integer.toHexString((int)this.d()));
            stringBuilder.append(']');
            stringBuilder.append(" [HSL: ");
            stringBuilder.append(Arrays.toString((float[])this.b()));
            stringBuilder.append(']');
            stringBuilder.append(" [Population: ");
            stringBuilder.append(this.e);
            stringBuilder.append(']');
            stringBuilder.append(" [Title Text: #");
            stringBuilder.append(Integer.toHexString((int)this.e()));
            stringBuilder.append(']');
            stringBuilder.append(" [Body Text: #");
            stringBuilder.append(Integer.toHexString((int)this.a()));
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

}

