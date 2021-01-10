/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.InetAddress
 *  java.net.InetSocketAddress
 *  java.net.Proxy
 *  java.net.Proxy$Type
 *  java.net.ProxySelector
 *  java.net.SocketAddress
 *  java.net.SocketException
 *  java.net.URI
 *  java.net.UnknownHostException
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.NoSuchElementException
 */
package j.f0.f;

import j.c0;
import j.e;
import j.f0.c;
import j.f0.f.d;
import j.o;
import j.p;
import j.s;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public final class f {
    private final j.a a;
    private final d b;
    private final e c;
    private final p d;
    private List<Proxy> e = Collections.emptyList();
    private int f;
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<c0> h = new ArrayList();

    public f(j.a a2, d d2, e e2, p p2) {
        this.a = a2;
        this.b = d2;
        this.c = e2;
        this.d = p2;
        f.super.a(a2.k(), a2.f());
    }

    static String a(InetSocketAddress inetSocketAddress) {
        InetAddress inetAddress = inetSocketAddress.getAddress();
        if (inetAddress == null) {
            return inetSocketAddress.getHostName();
        }
        return inetAddress.getHostAddress();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(s s2, Proxy proxy) {
        void var5_4;
        if (proxy != null) {
            List list = Collections.singletonList((Object)proxy);
        } else {
            List list = this.a.h().select(s2.n());
            if (list != null && !list.isEmpty()) {
                List list2 = c.a(list);
            } else {
                Proxy[] arrproxy = new Proxy[]{Proxy.NO_PROXY};
                List<Proxy> list3 = c.a(arrproxy);
            }
        }
        this.e = var5_4;
        this.f = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Proxy proxy) {
        String string2;
        int n2;
        this.g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress socketAddress = proxy.address();
            if (!(socketAddress instanceof InetSocketAddress)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Proxy.address() is not an InetSocketAddress: ");
                stringBuilder.append((Object)socketAddress.getClass());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress)socketAddress;
            string2 = f.a(inetSocketAddress);
            n2 = inetSocketAddress.getPort();
        } else {
            string2 = this.a.k().g();
            n2 = this.a.k().j();
        }
        if (n2 >= 1 && n2 <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.g.add((Object)InetSocketAddress.createUnresolved((String)string2, (int)n2));
                return;
            }
            this.d.a(this.c, string2);
            List<InetAddress> list = this.a.c().a(string2);
            if (list.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)this.a.c());
                stringBuilder.append(" returned no addresses for ");
                stringBuilder.append(string2);
                throw new UnknownHostException(stringBuilder.toString());
            }
            this.d.a(this.c, string2, list);
            int n3 = 0;
            int n4 = list.size();
            while (n3 < n4) {
                InetAddress inetAddress = (InetAddress)list.get(n3);
                this.g.add((Object)new InetSocketAddress(inetAddress, n2));
                ++n3;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No route to ");
        stringBuilder.append(string2);
        stringBuilder.append(":");
        stringBuilder.append(n2);
        stringBuilder.append("; port is out of range");
        SocketException socketException = new SocketException(stringBuilder.toString());
        throw socketException;
    }

    private boolean c() {
        return this.f < this.e.size();
    }

    private Proxy d() {
        if (this.c()) {
            List<Proxy> list = this.e;
            int n2 = this.f;
            this.f = n2 + 1;
            Proxy proxy = (Proxy)list.get(n2);
            this.a(proxy);
            return proxy;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No route to ");
        stringBuilder.append(this.a.k().g());
        stringBuilder.append("; exhausted proxy configurations: ");
        stringBuilder.append(this.e);
        throw new SocketException(stringBuilder.toString());
    }

    public void a(c0 c02, IOException iOException) {
        if (c02.b().type() != Proxy.Type.DIRECT && this.a.h() != null) {
            this.a.h().connectFailed(this.a.k().n(), c02.b().address(), iOException);
        }
        this.b.b(c02);
    }

    public boolean a() {
        return this.c() || !this.h.isEmpty();
        {
        }
    }

    public a b() {
        NoSuchElementException noSuchElementException;
        if (this.a()) {
            ArrayList arrayList = new ArrayList();
            while (this.c()) {
                Proxy proxy = this.d();
                int n2 = this.g.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    c0 c02 = new c0(this.a, proxy, (InetSocketAddress)this.g.get(i2));
                    if (this.b.c(c02)) {
                        this.h.add((Object)c02);
                        continue;
                    }
                    arrayList.add((Object)c02);
                }
                if (arrayList.isEmpty()) continue;
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.h);
                this.h.clear();
            }
            return new a((List<c0>)arrayList);
        }
        noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public static final class a {
        private final List<c0> a;
        private int b = 0;

        a(List<c0> list) {
            this.a = list;
        }

        public List<c0> a() {
            return new ArrayList(this.a);
        }

        public boolean b() {
            return this.b < this.a.size();
        }

        public c0 c() {
            if (this.b()) {
                List<c0> list = this.a;
                int n2 = this.b;
                this.b = n2 + 1;
                return (c0)list.get(n2);
            }
            throw new NoSuchElementException();
        }
    }

}

