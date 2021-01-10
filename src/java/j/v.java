/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.a
 *  j.a0
 *  j.a0$a
 *  j.b
 *  j.c
 *  j.c0
 *  j.e
 *  j.e$a
 *  j.e0
 *  j.f0.a
 *  j.f0.c
 *  j.f0.e.d
 *  j.f0.f.d
 *  j.f0.f.g
 *  j.f0.j.f
 *  j.f0.k.c
 *  j.g
 *  j.j
 *  j.k
 *  j.m
 *  j.n
 *  j.o
 *  j.p
 *  j.p$c
 *  j.r
 *  j.r$a
 *  j.t
 *  j.v$b
 *  j.w
 *  j.y
 *  java.lang.Cloneable
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.Proxy
 *  java.net.ProxySelector
 *  java.net.Socket
 *  java.security.GeneralSecurityException
 *  java.security.SecureRandom
 *  java.util.Iterator
 *  java.util.List
 *  javax.net.SocketFactory
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.KeyManager
 *  javax.net.ssl.SSLContext
 *  javax.net.ssl.SSLSocket
 *  javax.net.ssl.SSLSocketFactory
 *  javax.net.ssl.TrustManager
 *  javax.net.ssl.X509TrustManager
 */
package j;

import j.a0;
import j.c;
import j.c0;
import j.e;
import j.e0;
import j.f0.f.d;
import j.f0.j.f;
import j.g;
import j.j;
import j.k;
import j.m;
import j.n;
import j.o;
import j.p;
import j.r;
import j.t;
import j.v;
import j.w;
import j.x;
import j.y;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/*
 * Exception performing whole class analysis.
 */
public class v
implements Cloneable,
e.a,
e0 {
    static final List<w> C;
    static final List<k> D;
    final int A;
    final int B;
    final n b;
    final Proxy c;
    final List<w> d;
    final List<k> e;
    final List<t> f;
    final List<t> g;
    final p.c h;
    final ProxySelector i;
    final m j;
    final c k;
    final j.f0.e.d l;
    final SocketFactory m;
    final SSLSocketFactory n;
    final j.f0.k.c o;
    final HostnameVerifier p;
    final g q;
    final j.b r;
    final j.b s;
    final j t;
    final o u;
    final boolean v;
    final boolean w;
    final boolean x;
    final int y;
    final int z;

    static {
        Object[] arrobject = new w[]{w.f, w.d};
        C = j.f0.c.a((Object[])arrobject);
        Object[] arrobject2 = new k[]{k.g, k.h};
        D = j.f0.c.a((Object[])arrobject2);
        j.f0.a.a = new j.f0.a(){

            public int a(a0.a a2) {
                return a2.c;
            }

            public j.f0.f.c a(j j2, j.a a2, j.f0.f.g g2, c0 c02) {
                return j2.a(a2, g2, c02);
            }

            public d a(j j2) {
                return j2.e;
            }

            public Socket a(j j2, j.a a2, j.f0.f.g g2) {
                return j2.a(a2, g2);
            }

            public void a(k k2, SSLSocket sSLSocket, boolean bl) {
                k2.a(sSLSocket, bl);
            }

            public void a(r.a a2, String string) {
                a2.a(string);
            }

            public void a(r.a a2, String string, String string2) {
                a2.b(string, string2);
            }

            public boolean a(j.a a2, j.a a3) {
                return a2.a(a3);
            }

            public boolean a(j j2, j.f0.f.c c2) {
                return j2.a(c2);
            }

            public void b(j j2, j.f0.f.c c2) {
                j2.b(c2);
            }
        };
    }

    public v() {
        this(new /* Unavailable Anonymous Inner Class!! */);
    }

    v(b b2) {
        IllegalStateException illegalStateException;
        boolean bl;
        j.f0.k.c c2;
        this.b = b2.a;
        this.c = b2.b;
        this.d = b2.c;
        this.e = b2.d;
        this.f = j.f0.c.a((List)b2.e);
        this.g = j.f0.c.a((List)b2.f);
        this.h = b2.g;
        this.i = b2.h;
        this.j = b2.i;
        this.k = b2.j;
        this.l = b2.k;
        this.m = b2.l;
        Iterator iterator = this.e.iterator();
        block0 : do {
            bl = false;
            while (iterator.hasNext()) {
                k k2 = (k)iterator.next();
                if (!bl && !k2.b()) continue block0;
                bl = true;
            }
            break;
        } while (true);
        if (b2.m == null && bl) {
            X509TrustManager x509TrustManager = j.f0.c.a();
            this.n = v.a(x509TrustManager);
            c2 = j.f0.k.c.a((X509TrustManager)x509TrustManager);
        } else {
            this.n = b2.m;
            c2 = b2.n;
        }
        this.o = c2;
        if (this.n != null) {
            f.c().a(this.n);
        }
        this.p = b2.o;
        this.q = b2.p.a(this.o);
        this.r = b2.q;
        this.s = b2.r;
        this.t = b2.s;
        this.u = b2.t;
        this.v = b2.u;
        this.w = b2.v;
        this.x = b2.w;
        this.y = b2.x;
        this.z = b2.y;
        this.A = b2.z;
        this.B = b2.A;
        if (!this.f.contains(null)) {
            if (!this.g.contains(null)) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Null network interceptor: ");
            stringBuilder.append(this.g);
            throw new IllegalStateException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Null interceptor: ");
        stringBuilder.append(this.f);
        illegalStateException = new IllegalStateException(stringBuilder.toString());
        throw illegalStateException;
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = f.c().a();
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory sSLSocketFactory = sSLContext.getSocketFactory();
            return sSLSocketFactory;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw j.f0.c.a((String)"No System TLS", (Exception)((Object)generalSecurityException));
        }
    }

    public int A() {
        return this.A;
    }

    public j.b a() {
        return this.s;
    }

    public e a(y y2) {
        return x.a((v)this, y2, false);
    }

    public g b() {
        return this.q;
    }

    public int c() {
        return this.y;
    }

    public j d() {
        return this.t;
    }

    public List<k> e() {
        return this.e;
    }

    public m f() {
        return this.j;
    }

    public n g() {
        return this.b;
    }

    public o h() {
        return this.u;
    }

    public p.c i() {
        return this.h;
    }

    public boolean j() {
        return this.w;
    }

    public boolean k() {
        return this.v;
    }

    public HostnameVerifier l() {
        return this.p;
    }

    public List<t> n() {
        return this.f;
    }

    j.f0.e.d o() {
        c c2 = this.k;
        if (c2 != null) {
            return c2.b;
        }
        return this.l;
    }

    public List<t> p() {
        return this.g;
    }

    public b q() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public int r() {
        return this.B;
    }

    public List<w> s() {
        return this.d;
    }

    public Proxy t() {
        return this.c;
    }

    public j.b u() {
        return this.r;
    }

    public ProxySelector v() {
        return this.i;
    }

    public int w() {
        return this.z;
    }

    public boolean x() {
        return this.x;
    }

    public SocketFactory y() {
        return this.m;
    }

    public SSLSocketFactory z() {
        return this.n;
    }

}

