/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package f.f.a.q.b;

final class e {
    final byte[] a;
    int b;
    int c;
    boolean d;
    boolean e;
    e f;
    e g;

    e() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    e(byte[] arrby, int n2, int n3, boolean bl, boolean bl2) {
        this.a = arrby;
        this.b = n2;
        this.c = n3;
        this.d = bl;
        this.e = bl2;
    }

    public final e a() {
        e e2 = this.f;
        if (e2 == this) {
            e2 = null;
        }
        e e3 = this.g;
        e3.f = this.f;
        this.f.g = e3;
        this.f = null;
        this.g = null;
        return e2;
    }

    public final e a(e e2) {
        e2.g = this;
        e2.f = this.f;
        this.f.g = e2;
        this.f = e2;
        return e2;
    }

    final e b() {
        this.d = true;
        e e2 = new e(this.a, this.b, this.c, true, false);
        return e2;
    }
}

