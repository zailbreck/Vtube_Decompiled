/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.f.a.q.b.a
 *  f.f.a.q.b.d
 *  f.f.a.q.b.e
 *  f.f.a.q.b.j
 *  java.lang.AssertionError
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Arrays
 */
package f.f.a.q.b;

import f.f.a.q.b.a;
import f.f.a.q.b.d;
import f.f.a.q.b.e;
import f.f.a.q.b.j;
import java.util.Arrays;

final class g
extends d {
    final transient byte[][] g;
    final transient int[] h;

    g(a a2, int n2) {
        super(null);
        j.a((long)a2.c, (long)0L, (long)n2);
        e e2 = a2.b;
        int n3 = 0;
        e e3 = e2;
        int n4 = 0;
        int n5 = 0;
        while (n4 < n2) {
            int n6 = e3.c;
            int n7 = e3.b;
            if (n6 != n7) {
                n4 += n6 - n7;
                ++n5;
                e3 = e3.f;
                continue;
            }
            throw new AssertionError((Object)"s.limit == s.pos");
        }
        this.g = new byte[n5][];
        this.h = new int[n5 * 2];
        e e4 = a2.b;
        int n8 = 0;
        while (n3 < n2) {
            this.g[n8] = e4.a;
            if ((n3 += e4.c - e4.b) > n2) {
                n3 = n2;
            }
            int[] arrn = this.h;
            arrn[n8] = n3;
            arrn[n8 + this.g.length] = e4.b;
            e4.d = true;
            ++n8;
            e4 = e4.f;
        }
    }

    private int b(int n2) {
        int n3 = Arrays.binarySearch((int[])this.h, (int)0, (int)this.g.length, (int)(n2 + 1));
        if (n3 >= 0) {
            return n3;
        }
        return ~n3;
    }

    private d e() {
        return new d(this.d());
    }

    public byte a(int n2) {
        j.a((long)this.h[-1 + this.g.length], (long)n2, (long)1L);
        int n3 = g.super.b(n2);
        int n4 = n3 == 0 ? 0 : this.h[n3 - 1];
        int[] arrn = this.h;
        byte[][] arrby = this.g;
        int n5 = arrn[n3 + arrby.length];
        return arrby[n3][n5 + (n2 - n4)];
    }

    public d a(int n2, int n3) {
        return g.super.e().a(n2, n3);
    }

    public String a() {
        return this.e().a();
    }

    public boolean a(int n2, d d2, int n3, int n4) {
        if (n2 >= 0) {
            if (n2 > this.b() - n4) {
                return false;
            }
            int n5 = g.super.b(n2);
            while (n4 > 0) {
                int n6;
                byte[][] arrby = this.g;
                int[] arrn = this.h;
                int n7 = n5 == 0 ? 0 : this.h[n5 - 1];
                int n8 = arrn[n5 + arrby.length] + (n2 - n7);
                if (!d2.a(n3, arrby[n5], n8, n6 = Math.min((int)n4, (int)(n7 + (this.h[n5] - n7) - n2)))) {
                    return false;
                }
                n2 += n6;
                n3 += n6;
                n4 -= n6;
                ++n5;
            }
            return true;
        }
        return false;
    }

    public boolean a(int n2, byte[] arrby, int n3, int n4) {
        if (n2 >= 0 && n2 <= this.b() - n4 && n3 >= 0) {
            if (n3 > arrby.length - n4) {
                return false;
            }
            int n5 = g.super.b(n2);
            while (n4 > 0) {
                int n6;
                byte[][] arrby2 = this.g;
                int[] arrn = this.h;
                int n7 = n5 == 0 ? 0 : this.h[n5 - 1];
                int n8 = arrn[n5 + arrby2.length] + (n2 - n7);
                if (!j.a((byte[])arrby2[n5], (int)n8, (byte[])arrby, (int)n3, (int)(n6 = Math.min((int)n4, (int)(n7 + (this.h[n5] - n7) - n2))))) {
                    return false;
                }
                n2 += n6;
                n3 += n6;
                n4 -= n6;
                ++n5;
            }
            return true;
        }
        return false;
    }

    public int b() {
        return this.h[-1 + this.g.length];
    }

    public String c() {
        return this.e().c();
    }

    public byte[] d() {
        int[] arrn = this.h;
        byte[][] arrby = this.g;
        byte[] arrby2 = new byte[arrn[-1 + arrby.length]];
        int n2 = arrby.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int[] arrn2 = this.h;
            int n4 = arrn2[n2 + i2];
            int n5 = arrn2[i2];
            System.arraycopy((Object)this.g[i2], (int)n4, (Object)arrby2, (int)n3, (int)(n5 - n3));
            n3 = n5;
        }
        return arrby2;
    }

    public boolean equals(Object object) {
        d d2;
        if (object == this) {
            return true;
        }
        return object instanceof d && (d2 = (d)object).b() == this.b() && this.a(0, d2, 0, this.b());
    }

    public int hashCode() {
        int n2 = this.c;
        if (n2 != 0) {
            return n2;
        }
        int n3 = this.g.length;
        int n4 = 1;
        int n5 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n6;
            byte[] arrby = this.g[i2];
            int[] arrn = this.h;
            int n7 = arrn[i2];
            int n8 = n6 + (n7 - n5);
            for (n6 = arrn[n3 + i2]; n6 < n8; ++n6) {
                n4 = n4 * 31 + arrby[n6];
            }
            n5 = n7;
        }
        this.c = n4;
        return n4;
    }

    public String toString() {
        return this.e().toString();
    }
}

