/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.List
 */
package f.d.c.e.d;

import f.d.c.e.d.a;
import f.d.c.e.d.b;
import java.util.ArrayList;
import java.util.List;

public final class c {
    private final a a;
    private final List<b> b;

    public c(a a2) {
        this.a = a2;
        this.b = new ArrayList();
        this.b.add((Object)new b(a2, new int[]{1}));
    }

    private b a(int n2) {
        if (n2 >= this.b.size()) {
            List<b> list = this.b;
            b b2 = (b)list.get(list.size() - 1);
            for (int i2 = this.b.size(); i2 <= n2; ++i2) {
                a a2 = this.a;
                int[] arrn = new int[]{1, a2.a(i2 - 1 + a2.a())};
                b2 = b2.c(new b(a2, arrn));
                this.b.add((Object)b2);
            }
        }
        return (b)this.b.get(n2);
    }

    public void a(int[] arrn, int n2) {
        IllegalArgumentException illegalArgumentException;
        if (n2 != 0) {
            int n3 = arrn.length - n2;
            if (n3 > 0) {
                b b2 = c.super.a(n2);
                int[] arrn2 = new int[n3];
                System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)0, (int)n3);
                int[] arrn3 = new b(this.a, arrn2).a(n2, 1).b(b2)[1].a();
                int n4 = n2 - arrn3.length;
                for (int i2 = 0; i2 < n4; ++i2) {
                    arrn[n3 + i2] = 0;
                }
                System.arraycopy((Object)arrn3, (int)0, (Object)arrn, (int)(n3 + n4), (int)arrn3.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        illegalArgumentException = new IllegalArgumentException("No error correction bytes");
        throw illegalArgumentException;
    }
}

