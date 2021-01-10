/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package j.f0.i;

public final class b
extends Enum<b> {
    public static final /* enum */ b c = new b(0);
    public static final /* enum */ b d = new b(1);
    public static final /* enum */ b e = new b(2);
    public static final /* enum */ b f = new b(3);
    public static final /* enum */ b g = new b(7);
    public static final /* enum */ b h = new b(8);
    public static final /* enum */ b i = new b(9);
    public static final /* enum */ b j = new b(10);
    public static final /* enum */ b k = new b(11);
    public static final /* enum */ b l = new b(12);
    public static final /* enum */ b m = new b(13);
    private static final /* synthetic */ b[] n;
    public final int b;

    static {
        b[] arrb = new b[]{c, d, e, f, g, h, i, j, k, l, m};
        n = arrb;
    }

    private b(int n3) {
        this.b = n3;
    }

    public static b a(int n2) {
        for (b b2 : b.values()) {
            if (b2.b != n2) continue;
            return b2;
        }
        return null;
    }

    public static b valueOf(String string2) {
        return (b)Enum.valueOf(b.class, (String)string2);
    }

    public static b[] values() {
        return (b[])n.clone();
    }
}

