/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.c.a
 *  f.d.c.b
 *  f.d.c.c
 *  f.d.c.e.b
 *  f.d.c.f.b.a
 *  f.d.c.f.c.b
 *  f.d.c.f.c.c
 *  f.d.c.f.c.f
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package f.d.c.f;

import f.d.c.f.c.b;
import f.d.c.f.c.c;
import f.d.c.f.c.f;
import java.util.Map;

public final class a
implements f.d.c.c {
    private static f.d.c.e.b a(f f2, int n2, int n3, int n4) {
        IllegalStateException illegalStateException;
        b b2 = f2.a();
        if (b2 != null) {
            int n5 = b2.c();
            int n6 = b2.b();
            int n7 = n4 << 1;
            int n8 = n5 + n7;
            int n9 = n7 + n6;
            int n10 = Math.max((int)n2, (int)n8);
            int n11 = Math.max((int)n3, (int)n9);
            int n12 = Math.min((int)(n10 / n8), (int)(n11 / n9));
            int n13 = (n10 - n5 * n12) / 2;
            int n14 = (n11 - n6 * n12) / 2;
            f.d.c.e.b b3 = new f.d.c.e.b(n10, n11);
            int n15 = 0;
            while (n15 < n6) {
                int n16 = n13;
                int n17 = 0;
                while (n17 < n5) {
                    if (b2.a(n17, n15) == 1) {
                        b3.a(n16, n14, n12, n12);
                    }
                    ++n17;
                    n16 += n12;
                }
                ++n15;
                n14 += n12;
            }
            return b3;
        }
        illegalStateException = new IllegalStateException();
        throw illegalStateException;
    }

    public f.d.c.e.b a(String string, f.d.c.a a2, int n2, int n3, Map<f.d.c.b, ?> map) {
        if (!string.isEmpty()) {
            if (a2 == f.d.c.a.m) {
                if (n2 >= 0 && n3 >= 0) {
                    f.d.c.f.b.a a3 = f.d.c.f.b.a.c;
                    int n4 = 4;
                    if (map != null) {
                        if (map.containsKey((Object)f.d.c.b.b)) {
                            a3 = f.d.c.f.b.a.valueOf((String)map.get((Object)f.d.c.b.b).toString());
                        }
                        if (map.containsKey((Object)f.d.c.b.g)) {
                            n4 = Integer.parseInt((String)map.get((Object)f.d.c.b.g).toString());
                        }
                    }
                    return a.a(c.a((String)string, (f.d.c.f.b.a)a3, map), n2, n3, n4);
                }
                StringBuilder stringBuilder = new StringBuilder("Requested dimensions are too small: ");
                stringBuilder.append(n2);
                stringBuilder.append('x');
                stringBuilder.append(n3);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder("Can only encode QR_CODE, but got ");
            stringBuilder.append((Object)a2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}

