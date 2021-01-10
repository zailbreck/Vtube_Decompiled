/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.System
 */
package k;

import k.p;

final class o {
    final byte[] a;
    int b;
    int c;
    boolean d;
    boolean e;
    o f;
    o g;

    o() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    o(byte[] arrby, int n2, int n3, boolean bl, boolean bl2) {
        this.a = arrby;
        this.b = n2;
        this.c = n3;
        this.d = bl;
        this.e = bl2;
    }

    public o a(int n2) {
        if (n2 > 0 && n2 <= this.c - this.b) {
            o o2;
            if (n2 >= 1024) {
                o2 = this.c();
            } else {
                o2 = p.a();
                System.arraycopy((Object)this.a, (int)this.b, (Object)o2.a, (int)0, (int)n2);
            }
            o2.c = n2 + o2.b;
            this.b = n2 + this.b;
            this.g.a(o2);
            return o2;
        }
        throw new IllegalArgumentException();
    }

    public o a(o o2) {
        o2.g = this;
        o2.f = this.f;
        this.f.g = o2;
        this.f = o2;
        return o2;
    }

    public void a() {
        o o2 = this.g;
        if (o2 != this) {
            if (!o2.e) {
                return;
            }
            int n2 = this.c - this.b;
            int n3 = 8192 - o2.c;
            int n4 = o2.d ? 0 : o2.b;
            if (n2 > n3 + n4) {
                return;
            }
            this.a(this.g, n2);
            this.b();
            p.a(this);
            return;
        }
        throw new IllegalStateException();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(o o2, int n2) {
        if (!o2.e) throw new IllegalArgumentException();
        int n3 = o2.c;
        if (n3 + n2 > 8192) {
            if (o2.d) throw new IllegalArgumentException();
            int n4 = n3 + n2;
            int n5 = o2.b;
            if (n4 - n5 > 8192) throw new IllegalArgumentException();
            byte[] arrby = o2.a;
            System.arraycopy((Object)arrby, (int)n5, (Object)arrby, (int)0, (int)(n3 - n5));
            o2.c -= o2.b;
            o2.b = 0;
        }
        System.arraycopy((Object)this.a, (int)this.b, (Object)o2.a, (int)o2.c, (int)n2);
        o2.c = n2 + o2.c;
        this.b = n2 + this.b;
    }

    public o b() {
        o o2 = this.f;
        if (o2 == this) {
            o2 = null;
        }
        o o3 = this.g;
        o3.f = this.f;
        this.f.g = o3;
        this.f = null;
        this.g = null;
        return o2;
    }

    o c() {
        this.d = true;
        o o2 = new o(this.a, this.b, this.c, true, false);
        return o2;
    }
}

