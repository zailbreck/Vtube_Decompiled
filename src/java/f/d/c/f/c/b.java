/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  B
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Array
 */
package f.d.c.f.c;

import java.lang.reflect.Array;

public final class b {
    private final byte[][] a;
    private final int b;
    private final int c;

    public b(int n2, int n3) {
        this.a = (byte[][])Array.newInstance(B.class, (int[])new int[]{n3, n2});
        this.b = n2;
        this.c = n3;
    }

    public byte a(int n2, int n3) {
        return this.a[n3][n2];
    }

    public void a(byte by) {
        for (int i2 = 0; i2 < this.c; ++i2) {
            for (int i3 = 0; i3 < this.b; ++i3) {
                this.a[i2][i3] = by;
            }
        }
    }

    public void a(int n2, int n3, int n4) {
        this.a[n3][n2] = (byte)n4;
    }

    public void a(int n2, int n3, boolean bl) {
        this.a[n3][n2] = (byte)(bl ? 1 : 0);
    }

    public byte[][] a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(2 + 2 * this.b * this.c);
        int n2 = 0;
        while (n2 < this.c) {
            for (int i2 = 0; i2 < this.b; ++i2) {
                byte by = this.a[n2][i2];
                String string = by != 0 ? (by != 1 ? "  " : " 1") : " 0";
                stringBuilder.append(string);
            }
            stringBuilder.append('\n');
            ++n2;
        }
        return stringBuilder.toString();
    }
}

