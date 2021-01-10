/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.Proxy
 *  java.net.ProxySelector
 *  java.util.List
 *  javax.net.SocketFactory
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.SSLSocketFactory
 */
package j;

import j.b;
import j.f0.c;
import j.g;
import j.k;
import j.o;
import j.s;
import j.w;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class a {
    final s a;
    final o b;
    final SocketFactory c;
    final b d;
    final List<w> e;
    final List<k> f;
    final ProxySelector g;
    final Proxy h;
    final SSLSocketFactory i;
    final HostnameVerifier j;
    final g k;

    public a(String string2, int n2, o o2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g g2, b b2, Proxy proxy, List<w> list, List<k> list2, ProxySelector proxySelector) {
        s.a a2 = new s.a();
        String string3 = sSLSocketFactory != null ? "https" : "http";
        a2.d(string3);
        a2.b(string2);
        a2.a(n2);
        this.a = a2.a();
        if (o2 != null) {
            this.b = o2;
            if (socketFactory != null) {
                this.c = socketFactory;
                if (b2 != null) {
                    this.d = b2;
                    if (list != null) {
                        this.e = c.a(list);
                        if (list2 != null) {
                            this.f = c.a(list2);
                            if (proxySelector != null) {
                                this.g = proxySelector;
                                this.h = proxy;
                                this.i = sSLSocketFactory;
                                this.j = hostnameVerifier;
                                this.k = g2;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    public g a() {
        return this.k;
    }

    boolean a(a a2) {
        return this.b.equals((Object)a2.b) && this.d.equals((Object)a2.d) && this.e.equals(a2.e) && this.f.equals(a2.f) && this.g.equals((Object)a2.g) && c.a((Object)this.h, (Object)a2.h) && c.a((Object)this.i, (Object)a2.i) && c.a((Object)this.j, (Object)a2.j) && c.a(this.k, (Object)a2.k) && this.k().j() == a2.k().j();
    }

    public List<k> b() {
        return this.f;
    }

    public o c() {
        return this.b;
    }

    public HostnameVerifier d() {
        return this.j;
    }

    public List<w> e() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (object instanceof a) {
            s s2 = this.a;
            a a2 = (a)object;
            if (s2.equals(a2.a) && this.a(a2)) {
                return true;
            }
        }
        return false;
    }

    public Proxy f() {
        return this.h;
    }

    public b g() {
        return this.d;
    }

    public ProxySelector h() {
        return this.g;
    }

    public int hashCode() {
        int n2 = 31 * (31 * (31 * (31 * (31 * (31 * (527 + this.a.hashCode()) + this.b.hashCode()) + this.d.hashCode()) + this.e.hashCode()) + this.f.hashCode()) + this.g.hashCode());
        Proxy proxy = this.h;
        int n3 = proxy != null ? proxy.hashCode() : 0;
        int n4 = 31 * (n2 + n3);
        SSLSocketFactory sSLSocketFactory = this.i;
        int n5 = sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0;
        int n6 = 31 * (n4 + n5);
        HostnameVerifier hostnameVerifier = this.j;
        int n7 = hostnameVerifier != null ? hostnameVerifier.hashCode() : 0;
        int n8 = 31 * (n6 + n7);
        g g2 = this.k;
        int n9 = 0;
        if (g2 != null) {
            n9 = g2.hashCode();
        }
        return n8 + n9;
    }

    public SocketFactory i() {
        return this.c;
    }

    public SSLSocketFactory j() {
        return this.i;
    }

    public s k() {
        return this.a;
    }

    public String toString() {
        Proxy proxy;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Address{");
        stringBuilder.append(this.a.g());
        stringBuilder.append(":");
        stringBuilder.append(this.a.j());
        if (this.h != null) {
            stringBuilder.append(", proxy=");
            proxy = this.h;
        } else {
            stringBuilder.append(", proxySelector=");
            proxy = this.g;
        }
        stringBuilder.append((Object)proxy);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

