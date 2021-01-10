/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package f.d.c.e;

import java.util.HashMap;
import java.util.Map;

public final class c
extends Enum<c> {
    public static final /* enum */ c A;
    public static final /* enum */ c B;
    public static final /* enum */ c C;
    public static final /* enum */ c D;
    private static final Map<Integer, c> E;
    private static final Map<String, c> F;
    private static final /* synthetic */ c[] G;
    public static final /* enum */ c d;
    public static final /* enum */ c e;
    public static final /* enum */ c f;
    public static final /* enum */ c g;
    public static final /* enum */ c h;
    public static final /* enum */ c i;
    public static final /* enum */ c j;
    public static final /* enum */ c k;
    public static final /* enum */ c l;
    public static final /* enum */ c m;
    public static final /* enum */ c n;
    public static final /* enum */ c o;
    public static final /* enum */ c p;
    public static final /* enum */ c q;
    public static final /* enum */ c r;
    public static final /* enum */ c s;
    public static final /* enum */ c t;
    public static final /* enum */ c u;
    public static final /* enum */ c v;
    public static final /* enum */ c w;
    public static final /* enum */ c x;
    public static final /* enum */ c y;
    public static final /* enum */ c z;
    private final int[] b;
    private final String[] c;

    static {
        d = new c(new int[]{0, 2}, new String[0]);
        e = new c(new int[]{1, 3}, "ISO-8859-1");
        f = new c(4, "ISO-8859-2");
        g = new c(5, "ISO-8859-3");
        h = new c(6, "ISO-8859-4");
        i = new c(7, "ISO-8859-5");
        j = new c(8, "ISO-8859-6");
        k = new c(9, "ISO-8859-7");
        l = new c(10, "ISO-8859-8");
        m = new c(11, "ISO-8859-9");
        n = new c(12, "ISO-8859-10");
        o = new c(13, "ISO-8859-11");
        p = new c(15, "ISO-8859-13");
        q = new c(16, "ISO-8859-14");
        r = new c(17, "ISO-8859-15");
        s = new c(18, "ISO-8859-16");
        t = new c(20, "Shift_JIS");
        u = new c(21, "windows-1250");
        v = new c(22, "windows-1251");
        w = new c(23, "windows-1252");
        x = new c(24, "windows-1256");
        y = new c(25, "UTF-16BE", "UnicodeBig");
        z = new c(26, "UTF-8");
        A = new c(new int[]{27, 170}, "US-ASCII");
        B = new c(28);
        C = new c(29, "GB2312", "EUC_CN", "GBK");
        D = new c(30, "EUC-KR");
        c[] arrc = new c[]{d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D};
        G = arrc;
        E = new HashMap();
        F = new HashMap();
        for (c c2 : c.values()) {
            for (int n2 : c2.b) {
                E.put((Object)n2, (Object)c2);
            }
            F.put((Object)c2.name(), (Object)c2);
            for (String string : c2.c) {
                F.put((Object)string, (Object)c2);
            }
        }
    }

    private c(int n3) {
    }

    private /* varargs */ c(int n3, String ... arrstring) {
        this.b = new int[]{n3};
        this.c = arrstring;
    }

    private /* varargs */ c(int[] arrn, String ... arrstring) {
        this.b = arrn;
        this.c = arrstring;
    }

    public static c a(String string) {
        return (c)((Object)F.get((Object)string));
    }

    public static c valueOf(String string) {
        return (c)Enum.valueOf(c.class, (String)string);
    }

    public static c[] values() {
        return (c[])G.clone();
    }

    public int a() {
        return this.b[0];
    }
}

