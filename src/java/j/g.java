/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.Principal
 *  java.security.PublicKey
 *  java.security.cert.Certificate
 *  java.security.cert.X509Certificate
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.LinkedHashSet
 *  java.util.List
 *  java.util.Set
 *  javax.net.ssl.SSLPeerUnverifiedException
 */
package j;

import j.f0.k.c;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import k.f;

public final class g {
    public static final g c = new a().a();
    private final Set<b> a;
    private final c b;

    g(Set<b> set, c c2) {
        this.a = set;
        this.b = c2;
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sha256/");
            stringBuilder.append(g.b((X509Certificate)certificate).a());
            return stringBuilder.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static f a(X509Certificate x509Certificate) {
        return f.a(x509Certificate.getPublicKey().getEncoded()).c();
    }

    static f b(X509Certificate x509Certificate) {
        return f.a(x509Certificate.getPublicKey().getEncoded()).d();
    }

    g a(c c2) {
        if (j.f0.c.a(this.b, (Object)c2)) {
            return this;
        }
        return new g(this.a, c2);
    }

    List<b> a(String string2) {
        List list = Collections.emptyList();
        for (b b2 : this.a) {
            if (!b2.a(string2)) continue;
            if (list.isEmpty()) {
                list = new ArrayList();
            }
            list.add((Object)b2);
        }
        return list;
    }

    public void a(String string2, List<Certificate> list) {
        SSLPeerUnverifiedException sSLPeerUnverifiedException;
        List<b> list2 = this.a(string2);
        if (list2.isEmpty()) {
            return;
        }
        c c2 = this.b;
        if (c2 != null) {
            list = c2.a(list, string2);
        }
        int n2 = list.size();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            X509Certificate x509Certificate = (X509Certificate)list.get(i2);
            int n4 = list2.size();
            f f2 = null;
            f f3 = null;
            for (int i3 = 0; i3 < n4; ++i3) {
                b b2 = (b)list2.get(i3);
                if (b2.c.equals((Object)"sha256/")) {
                    if (f2 == null) {
                        f2 = g.b(x509Certificate);
                    }
                    if (!b2.d.equals(f2)) continue;
                    return;
                }
                if (b2.c.equals((Object)"sha1/")) {
                    if (f3 == null) {
                        f3 = g.a(x509Certificate);
                    }
                    if (!b2.d.equals(f3)) continue;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unsupported hashAlgorithm: ");
                stringBuilder.append(b2.c);
                throw new AssertionError((Object)stringBuilder.toString());
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Certificate pinning failure!");
        stringBuilder.append("\n  Peer certificate chain:");
        int n5 = list.size();
        for (int i4 = 0; i4 < n5; ++i4) {
            X509Certificate x509Certificate = (X509Certificate)list.get(i4);
            stringBuilder.append("\n    ");
            stringBuilder.append(g.a((Certificate)x509Certificate));
            stringBuilder.append(": ");
            stringBuilder.append(x509Certificate.getSubjectDN().getName());
        }
        stringBuilder.append("\n  Pinned certificates for ");
        stringBuilder.append(string2);
        stringBuilder.append(":");
        int n6 = list2.size();
        while (n3 < n6) {
            b b3 = (b)list2.get(n3);
            stringBuilder.append("\n    ");
            stringBuilder.append((Object)b3);
            ++n3;
        }
        sSLPeerUnverifiedException = new SSLPeerUnverifiedException(stringBuilder.toString());
        throw sSLPeerUnverifiedException;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof g) {
            c c2 = this.b;
            g g2 = (g)object;
            if (j.f0.c.a(c2, (Object)g2.b) && this.a.equals(g2.a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        c c2 = this.b;
        int n2 = c2 != null ? c2.hashCode() : 0;
        return n2 * 31 + this.a.hashCode();
    }

    public static final class a {
        private final List<b> a = new ArrayList();

        public g a() {
            return new g((Set<b>)new LinkedHashSet(this.a), null);
        }
    }

    static final class b {
        final String a;
        final String b;
        final String c;
        final f d;

        boolean a(String string2) {
            if (this.a.startsWith("*.")) {
                String string3;
                int n2;
                int n3 = string2.indexOf(46);
                return string2.length() - n3 - 1 == this.b.length() && string2.regionMatches(false, n2 = n3 + 1, string3 = this.b, 0, string3.length());
            }
            return string2.equals((Object)this.b);
        }

        public boolean equals(Object object) {
            if (object instanceof b) {
                String string2 = this.a;
                b b2 = (b)object;
                if (string2.equals((Object)b2.a) && this.c.equals((Object)b2.c) && this.d.equals(b2.d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return 31 * (31 * (527 + this.a.hashCode()) + this.c.hashCode()) + this.d.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append(this.d.a());
            return stringBuilder.toString();
        }
    }

}

