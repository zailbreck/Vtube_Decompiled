/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.d.c.f.b;

import f.d.c.f.b.c;

public final class b
extends Enum<b> {
    public static final /* enum */ b d = new b(new int[]{0, 0, 0}, 0);
    public static final /* enum */ b e = new b(new int[]{10, 12, 14}, 1);
    public static final /* enum */ b f = new b(new int[]{9, 11, 13}, 2);
    public static final /* enum */ b g = new b(new int[]{0, 0, 0}, 3);
    public static final /* enum */ b h = new b(new int[]{8, 16, 16}, 4);
    public static final /* enum */ b i = new b(new int[]{0, 0, 0}, 7);
    public static final /* enum */ b j = new b(new int[]{8, 10, 12}, 8);
    public static final /* enum */ b k = new b(new int[]{0, 0, 0}, 5);
    public static final /* enum */ b l = new b(new int[]{0, 0, 0}, 9);
    public static final /* enum */ b m = new b(new int[]{8, 10, 12}, 13);
    private static final /* synthetic */ b[] n;
    private final int[] b;
    private final int c;

    static {
        b[] arrb = new b[]{d, e, f, g, h, i, j, k, l, m};
        n = arrb;
    }

    private b(int[] arrn, int n3) {
        this.b = arrn;
        this.c = n3;
    }

    public static b valueOf(String string) {
        return (b)Enum.valueOf(b.class, (String)string);
    }

    public static b[] values() {
        return (b[])n.clone();
    }

    public int a() {
        return this.c;
    }

    public int a(c c2) {
        int n2 = c2.c();
        int n3 = n2 <= 9 ? 0 : (n2 <= 26 ? 1 : 2);
        return this.b[n3];
    }
}

