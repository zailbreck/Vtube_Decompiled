/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package e.k.a;

public final class c {
    public static final c e = new c();
    public static final c f;
    public static final c g;
    public static final c h;
    public static final c i;
    public static final c j;
    final float[] a = new float[3];
    final float[] b = new float[3];
    final float[] c = new float[3];
    boolean d = true;

    static {
        c.b(e);
        c.e(e);
        f = new c();
        c.d(f);
        c.e(f);
        g = new c();
        c.a(g);
        c.e(g);
        h = new c();
        c.b(h);
        c.c(h);
        i = new c();
        c.d(i);
        c.c(i);
        j = new c();
        c.a(j);
        c.c(j);
    }

    c() {
        c.a(this.a);
        c.a(this.b);
        this.l();
    }

    private static void a(c c2) {
        float[] arrf = c2.b;
        arrf[1] = 0.26f;
        arrf[2] = 0.45f;
    }

    private static void a(float[] arrf) {
        arrf[0] = 0.0f;
        arrf[1] = 0.5f;
        arrf[2] = 1.0f;
    }

    private static void b(c c2) {
        float[] arrf = c2.b;
        arrf[0] = 0.55f;
        arrf[1] = 0.74f;
    }

    private static void c(c c2) {
        float[] arrf = c2.a;
        arrf[1] = 0.3f;
        arrf[2] = 0.4f;
    }

    private static void d(c c2) {
        float[] arrf = c2.b;
        arrf[0] = 0.3f;
        arrf[1] = 0.5f;
        arrf[2] = 0.7f;
    }

    private static void e(c c2) {
        float[] arrf = c2.a;
        arrf[0] = 0.35f;
        arrf[1] = 1.0f;
    }

    private void l() {
        float[] arrf = this.c;
        arrf[0] = 0.24f;
        arrf[1] = 0.52f;
        arrf[2] = 0.24f;
    }

    public float a() {
        return this.c[1];
    }

    public float b() {
        return this.b[2];
    }

    public float c() {
        return this.a[2];
    }

    public float d() {
        return this.b[0];
    }

    public float e() {
        return this.a[0];
    }

    public float f() {
        return this.c[2];
    }

    public float g() {
        return this.c[0];
    }

    public float h() {
        return this.b[1];
    }

    public float i() {
        return this.a[1];
    }

    public boolean j() {
        return this.d;
    }

    void k() {
        int n2 = this.c.length;
        int n3 = 0;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < n2; ++i2) {
            float f3 = this.c[i2];
            if (!(f3 > 0.0f)) continue;
            f2 += f3;
        }
        if (f2 != 0.0f) {
            int n4 = this.c.length;
            while (n3 < n4) {
                float[] arrf = this.c;
                if (arrf[n3] > 0.0f) {
                    arrf[n3] = arrf[n3] / f2;
                }
                ++n3;
            }
        }
    }
}

