/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Arrays
 *  k.f
 *  k.o
 *  k.u
 */
package k;

import java.util.Arrays;
import k.c;
import k.f;
import k.o;
import k.u;

final class q
extends f {
    final transient byte[][] g;
    final transient int[] h;

    q(c c2, int n2) {
        super(null);
        u.a((long)c2.c, (long)0L, (long)n2);
        o o2 = c2.b;
        int n3 = 0;
        o o3 = o2;
        int n4 = 0;
        int n5 = 0;
        while (n4 < n2) {
            int n6 = o3.c;
            int n7 = o3.b;
            if (n6 != n7) {
                n4 += n6 - n7;
                ++n5;
                o3 = o3.f;
                continue;
            }
            throw new AssertionError((Object)"s.limit == s.pos");
        }
        this.g = new byte[n5][];
        this.h = new int[n5 * 2];
        o o4 = c2.b;
        int n8 = 0;
        while (n3 < n2) {
            this.g[n8] = o4.a;
            if ((n3 += o4.c - o4.b) > n2) {
                n3 = n2;
            }
            int[] arrn = this.h;
            arrn[n8] = n3;
            arrn[n8 + this.g.length] = o4.b;
            o4.d = true;
            ++n8;
            o4 = o4.f;
        }
    }

    private int b(int n2) {
        int n3 = Arrays.binarySearch((int[])this.h, (int)0, (int)this.g.length, (int)(n2 + 1));
        if (n3 >= 0) {
            return n3;
        }
        return ~n3;
    }

    private f i() {
        return new f(this.g());
    }

    public byte a(int n2) {
        u.a((long)this.h[-1 + this.g.length], (long)n2, (long)1L);
        int n3 = q.super.b(n2);
        int n4 = n3 == 0 ? 0 : this.h[n3 - 1];
        int[] arrn = this.h;
        byte[][] arrby = this.g;
        int n5 = arrn[n3 + arrby.length];
        return arrby[n3][n5 + (n2 - n4)];
    }

    public String a() {
        return this.i().a();
    }

    public f a(int n2, int n3) {
        return q.super.i().a(n2, n3);
    }

    void a(c c2) {
        int n2 = this.g.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int[] arrn = this.h;
            int n4 = arrn[n2 + i2];
            int n5 = arrn[i2];
            o o2 = new o(this.g[i2], n4, n4 + n5 - n3, true, false);
            o o3 = c2.b;
            if (o3 == null) {
                o2.g = o2;
                o2.f = o2;
                c2.b = o2;
            } else {
                o3.g.a(o2);
            }
            n3 = n5;
        }
        c2.c += (long)n3;
    }

    public boolean a(int n2, f f2, int n3, int n4) {
        if (n2 >= 0) {
            if (n2 > this.e() - n4) {
                return false;
            }
            int n5 = q.super.b(n2);
            while (n4 > 0) {
                int n6;
                byte[][] arrby = this.g;
                int[] arrn = this.h;
                int n7 = n5 == 0 ? 0 : this.h[n5 - 1];
                int n8 = arrn[n5 + arrby.length] + (n2 - n7);
                if (!f2.a(n3, arrby[n5], n8, n6 = Math.min((int)n4, (int)(n7 + (this.h[n5] - n7) - n2)))) {
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
        if (n2 >= 0 && n2 <= this.e() - n4 && n3 >= 0) {
            if (n3 > arrby.length - n4) {
                return false;
            }
            int n5 = q.super.b(n2);
            while (n4 > 0) {
                int n6;
                byte[][] arrby2 = this.g;
                int[] arrn = this.h;
                int n7 = n5 == 0 ? 0 : this.h[n5 - 1];
                int n8 = arrn[n5 + arrby2.length] + (n2 - n7);
                if (!u.a((byte[])arrby2[n5], (int)n8, (byte[])arrby, (int)n3, (int)(n6 = Math.min((int)n4, (int)(n7 + (this.h[n5] - n7) - n2))))) {
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

    public String b() {
        return this.i().b();
    }

    public f c() {
        return this.i().c();
    }

    public f d() {
        return this.i().d();
    }

    public int e() {
        return this.h[-1 + this.g.length];
    }

    public boolean equals(Object object) {
        f f2;
        if (object == this) {
            return true;
        }
        return object instanceof f && (f2 = (f)object).e() == this.e() && this.a(0, f2, 0, this.e());
    }

    public f f() {
        return this.i().f();
    }

    public byte[] g() {
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

    public String h() {
        return this.i().h();
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
        return this.i().toString();
    }
}

