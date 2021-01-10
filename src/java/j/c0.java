/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.InetSocketAddress
 *  java.net.Proxy
 *  java.net.Proxy$Type
 *  javax.net.ssl.SSLSocketFactory
 */
package j;

import j.a;
import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.net.ssl.SSLSocketFactory;

public final class c0 {
    final a a;
    final Proxy b;
    final InetSocketAddress c;

    public c0(a a2, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (a2 != null) {
            if (proxy != null) {
                if (inetSocketAddress != null) {
                    this.a = a2;
                    this.b = proxy;
                    this.c = inetSocketAddress;
                    return;
                }
                throw new NullPointerException("inetSocketAddress == null");
            }
            throw new NullPointerException("proxy == null");
        }
        throw new NullPointerException("address == null");
    }

    public a a() {
        return this.a;
    }

    public Proxy b() {
        return this.b;
    }

    public boolean c() {
        return this.a.i != null && this.b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (object instanceof c0) {
            c0 c02 = (c0)object;
            if (c02.a.equals(this.a) && c02.b.equals((Object)this.b) && c02.c.equals((Object)this.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 * (31 * (527 + this.a.hashCode()) + this.b.hashCode()) + this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Route{");
        stringBuilder.append((Object)this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

