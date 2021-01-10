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
 *  java.util.Comparator
 *  java.util.List
 *  javax.net.ssl.SSLSocket
 */
package j;

import j.d0;
import j.f0.c;
import j.h;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class k {
    private static final h[] e;
    private static final h[] f;
    public static final k g;
    public static final k h;
    final boolean a;
    final boolean b;
    final String[] c;
    final String[] d;

    static {
        h[] arrh = new h[]{h.k, h.m, h.l, h.n, h.p, h.o};
        e = arrh;
        h[] arrh2 = new h[]{h.k, h.m, h.l, h.n, h.p, h.o, h.i, h.j, h.g, h.h, h.e, h.f, h.d};
        f = arrh2;
        a a2 = new a(true);
        a2.a(e);
        d0[] arrd0 = new d0[]{d0.d};
        a2.a(arrd0);
        a2.a(true);
        a2.a();
        a a3 = new a(true);
        a3.a(f);
        d0[] arrd02 = new d0[]{d0.d, d0.e, d0.f};
        a3.a(arrd02);
        a3.a(true);
        g = a3.a();
        a a4 = new a(g);
        d0[] arrd03 = new d0[]{d0.f};
        a4.a(arrd03);
        a4.a(true);
        a4.a();
        h = new a(false).a();
    }

    k(a a2) {
        this.a = a2.a;
        this.c = a2.b;
        this.d = a2.c;
        this.b = a2.d;
    }

    private k b(SSLSocket sSLSocket, boolean bl) {
        String[] arrstring = this.c != null ? c.a(h.b, sSLSocket.getEnabledCipherSuites(), this.c) : sSLSocket.getEnabledCipherSuites();
        String[] arrstring2 = this.d != null ? c.a(c.p, sSLSocket.getEnabledProtocols(), this.d) : sSLSocket.getEnabledProtocols();
        String[] arrstring3 = sSLSocket.getSupportedCipherSuites();
        int n2 = c.a(h.b, arrstring3, "TLS_FALLBACK_SCSV");
        if (bl && n2 != -1) {
            arrstring = c.a(arrstring, arrstring3[n2]);
        }
        a a2 = new a((k)this);
        a2.a(arrstring);
        a2.b(arrstring2);
        return a2.a();
    }

    public List<h> a() {
        String[] arrstring = this.c;
        if (arrstring != null) {
            return h.a(arrstring);
        }
        return null;
    }

    void a(SSLSocket sSLSocket, boolean bl) {
        String[] arrstring;
        k k2 = k.super.b(sSLSocket, bl);
        String[] arrstring2 = k2.d;
        if (arrstring2 != null) {
            sSLSocket.setEnabledProtocols(arrstring2);
        }
        if ((arrstring = k2.c) != null) {
            sSLSocket.setEnabledCipherSuites(arrstring);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] arrstring = this.d;
        if (arrstring != null && !c.b(c.p, arrstring, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] arrstring2 = this.c;
        return arrstring2 == null || c.b(h.b, arrstring2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public List<d0> d() {
        String[] arrstring = this.d;
        if (arrstring != null) {
            return d0.a(arrstring);
        }
        return null;
    }

    public boolean equals(Object object) {
        if (!(object instanceof k)) {
            return false;
        }
        if (object == this) {
            return true;
        }
        k k2 = (k)object;
        boolean bl = this.a;
        if (bl != k2.a) {
            return false;
        }
        if (bl) {
            if (!Arrays.equals((Object[])this.c, (Object[])k2.c)) {
                return false;
            }
            if (!Arrays.equals((Object[])this.d, (Object[])k2.d)) {
                return false;
            }
            if (this.b != k2.b) {
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
            string2 = this.d().toString();
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

        public a(k k2) {
            this.a = k2.a;
            this.b = k2.c;
            this.c = k2.d;
            this.d = k2.b;
        }

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

        public /* varargs */ a a(d0 ... arrd0) {
            IllegalStateException illegalStateException;
            if (this.a) {
                String[] arrstring = new String[arrd0.length];
                for (int i2 = 0; i2 < arrd0.length; ++i2) {
                    arrstring[i2] = arrd0[i2].b;
                }
                this.b(arrstring);
                return this;
            }
            illegalStateException = new IllegalStateException("no TLS versions for cleartext connections");
            throw illegalStateException;
        }

        public /* varargs */ a a(h ... arrh) {
            IllegalStateException illegalStateException;
            if (this.a) {
                String[] arrstring = new String[arrh.length];
                for (int i2 = 0; i2 < arrh.length; ++i2) {
                    arrstring[i2] = arrh[i2].a;
                }
                this.a(arrstring);
                return this;
            }
            illegalStateException = new IllegalStateException("no cipher suites for cleartext connections");
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

        public k a() {
            return new k(this);
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

