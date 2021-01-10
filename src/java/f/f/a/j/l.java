/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.net.Proxy
 *  java.net.ProxySelector
 *  java.net.SocketAddress
 *  java.net.URI
 *  java.util.Arrays
 *  java.util.List
 */
package f.f.a.j;

import f.f.a.j.o;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

final class l
extends ProxySelector {
    private static final List<Proxy> d;
    private final ProxySelector a;
    private final String b;
    private final int c;

    static {
        Object[] arrobject = new Proxy[]{Proxy.NO_PROXY};
        d = Arrays.asList((Object[])arrobject);
    }

    private l(ProxySelector proxySelector, String string, int n2) {
        o.a(proxySelector);
        this.a = proxySelector;
        o.a(string);
        this.b = string;
        this.c = n2;
    }

    static void a(String string, int n2) {
        ProxySelector.setDefault((ProxySelector)new l(ProxySelector.getDefault(), string, n2));
    }

    public final void connectFailed(URI uRI, SocketAddress socketAddress, IOException iOException) {
        this.a.connectFailed(uRI, socketAddress, iOException);
    }

    public final List<Proxy> select(URI uRI) {
        boolean bl = this.b.equals((Object)uRI.getHost()) && this.c == uRI.getPort();
        if (bl) {
            return d;
        }
        return this.a.select(uRI);
    }
}

