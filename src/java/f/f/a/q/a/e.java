/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 */
package f.f.a.q.a;

import f.f.a.q.a.c;
import f.f.a.q.a.p;
import java.util.Arrays;
import java.util.List;

public final class e {
    private static final c[] e;
    private static final c[] f;
    public static final e g;
    public static final e h;
    final boolean a;
    final boolean b;
    final String[] c;
    final String[] d;

    static {
        c[] arrc = new c[]{c.q, c.r, c.s, c.t, c.u, c.k, c.m, c.l, c.n, c.p, c.o};
        e = arrc;
        c[] arrc2 = new c[]{c.q, c.r, c.s, c.t, c.u, c.k, c.m, c.l, c.n, c.p, c.o, c.i, c.j, c.g, c.h, c.e, c.f, c.d};
        f = arrc2;
        a a2 = new a(true);
        a2.a(e);
        p[] arrp = new p[]{p.c, p.d};
        a2.a(arrp);
        a2.a(true);
        a2.a();
        a a3 = new a(true);
        a3.a(f);
        p[] arrp2 = new p[]{p.c, p.d, p.e, p.f};
        a3.a(arrp2);
        a3.a(true);
        g = a3.a();
        a a4 = new a(true);
        a4.a(f);
        p[] arrp3 = new p[]{p.f};
        a4.a(arrp3);
        a4.a(true);
        a4.a();
        h = new a(false).a();
    }

    e(a a2) {
        this.a = a2.a;
        this.c = a2.b;
        this.d = a2.c;
        this.b = a2.d;
    }

    public List<c> a() {
        String[] arrstring = this.c;
        if (arrstring != null) {
            return c.a(arrstring);
        }
        return null;
    }

    public List<p> b() {
        String[] arrstring = this.d;
        if (arrstring != null) {
            return p.a(arrstring);
        }
        return null;
    }

    public boolean equals(Object object) {
        if (!(object instanceof e)) {
            return false;
        }
        if (object == this) {
            return true;
        }
        e e2 = (e)object;
        boolean bl = this.a;
        if (bl != e2.a) {
            return false;
        }
        if (bl) {
            if (!Arrays.equals((Object[])this.c, (Object[])e2.c)) {
                return false;
            }
            if (!Arrays.equals((Object[])this.d, (Object[])e2.d)) {
                return false;
            }
            if (this.b != e2.b) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.a) {
            return 31 * (31 * (527 + Arrays.hashCode((Object[])this.c)) + Arrays.hashCode((Object[])this.d)) + (true ^ this.b);
        }
        return 17;
    }

    public String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        String[] arrstring = this.c;
        String string2 = "[all enabled]";
        String string3 = arrstring != null ? this.a().toString() : string2;
        if (this.d != null) {
            string2 = this.b().toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ConnectionSpec(cipherSuites=");
        stringBuilder.append(string3);
        stringBuilder.append(", tlsVersions=");
        stringBuilder.append(string2);
        stringBuilder.append(", supportsTlsExtensions=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public static final class a {
        boolean a;
        String[] b;
        String[] c;
        boolean d;

        a(boolean bl) {
            this.a = bl;
        }

        public a a(boolean bl) {
            if (this.a) {
                this.d = bl;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public /* varargs */ a a(c ... arrc) {
            IllegalStateException illegalStateException;
            if (this.a) {
                String[] arrstring = new String[arrc.length];
                for (int i2 = 0; i2 < arrc.length; ++i2) {
                    arrstring[i2] = arrc[i2].a;
                }
                this.a(arrstring);
                return this;
            }
            illegalStateException = new IllegalStateException("no cipher suites for cleartext connections");
            throw illegalStateException;
        }

        public /* varargs */ a a(p ... arrp) {
            IllegalStateException illegalStateException;
            if (this.a) {
                String[] arrstring = new String[arrp.length];
                for (int i2 = 0; i2 < arrp.length; ++i2) {
                    arrstring[i2] = arrp[i2].b;
                }
                this.b(arrstring);
                return this;
            }
            illegalStateException = new IllegalStateException("no TLS versions for cleartext connections");
            throw illegalStateException;
        }

        public /* varargs */ a a(String ... arrstring) {
            if (this.a) {
                if (arrstring.length != 0) {
                    this.b = (String[])arrstring.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public e a() {
            return new e(this);
        }

        public /* varargs */ a b(String ... arrstring) {
            if (this.a) {
                if (arrstring.length != 0) {
                    this.c = (String[])arrstring.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

}

