/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.security.cert.Certificate
 *  java.util.List
 *  javax.net.ssl.X509TrustManager
 */
package j.f0.k;

import j.f0.j.f;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

public abstract class c {
    public static c a(X509TrustManager x509TrustManager) {
        return f.c().a(x509TrustManager);
    }

    public abstract List<Certificate> a(List<Certificate> var1, String var2);
}

