/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.cert.Certificate
 *  java.security.cert.CertificateParsingException
 *  java.security.cert.X509Certificate
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.SSLException
 *  javax.net.ssl.SSLSession
 */
package j.f0.k;

import j.f0.c;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class d
implements HostnameVerifier {
    public static final d a = new d();

    private d() {
    }

    public static List<String> a(X509Certificate x509Certificate) {
        List<String> list = d.a(x509Certificate, 7);
        List<String> list2 = d.a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static List<String> a(X509Certificate x509Certificate, int n2) {
        ArrayList arrayList = new ArrayList();
        try {
            Collection collection = x509Certificate.getSubjectAlternativeNames();
            if (collection == null) {
                return Collections.emptyList();
            }
            Iterator iterator = collection.iterator();
            do {
                Integer n3;
                String string2;
                if (!iterator.hasNext()) {
                    return arrayList;
                }
                List list = (List)iterator.next();
                if (list == null || list.size() < 2 || (n3 = (Integer)list.get(0)) == null || n3 != n2 || (string2 = (String)list.get(1)) == null) continue;
                arrayList.add((Object)string2);
            } while (true);
        }
        catch (CertificateParsingException certificateParsingException) {
            return Collections.emptyList();
        }
    }

    private boolean b(String string2, X509Certificate x509Certificate) {
        String string3 = string2.toLowerCase(Locale.US);
        Iterator iterator = d.a(x509Certificate, 2).iterator();
        while (iterator.hasNext()) {
            if (!this.a(string3, (String)iterator.next())) continue;
            return true;
        }
        return false;
    }

    private boolean c(String string2, X509Certificate x509Certificate) {
        List<String> list = d.a(x509Certificate, 7);
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string2.equalsIgnoreCase((String)list.get(i2))) continue;
            return true;
        }
        return false;
    }

    public boolean a(String string2, String string3) {
        if (string2 != null && string2.length() != 0 && !string2.startsWith(".")) {
            if (string2.endsWith("..")) {
                return false;
            }
            if (string3 != null && string3.length() != 0 && !string3.startsWith(".")) {
                String string4;
                if (string3.endsWith("..")) {
                    return false;
                }
                if (!string2.endsWith(".")) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append('.');
                    string2 = stringBuilder.toString();
                }
                if (!string3.endsWith(".")) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string3);
                    stringBuilder.append('.');
                    string3 = stringBuilder.toString();
                }
                if (!(string4 = string3.toLowerCase(Locale.US)).contains((CharSequence)"*")) {
                    return string2.equals((Object)string4);
                }
                if (string4.startsWith("*.")) {
                    if (string4.indexOf(42, 1) != -1) {
                        return false;
                    }
                    if (string2.length() < string4.length()) {
                        return false;
                    }
                    if ("*.".equals((Object)string4)) {
                        return false;
                    }
                    String string5 = string4.substring(1);
                    if (!string2.endsWith(string5)) {
                        return false;
                    }
                    int n2 = string2.length() - string5.length();
                    return n2 <= 0 || string2.lastIndexOf(46, n2 - 1) == -1;
                }
            }
        }
        return false;
    }

    public boolean a(String string2, X509Certificate x509Certificate) {
        if (c.d(string2)) {
            return d.super.c(string2, x509Certificate);
        }
        return d.super.b(string2, x509Certificate);
    }

    public boolean verify(String string2, SSLSession sSLSession) {
        try {
            boolean bl = this.a(string2, (X509Certificate)sSLSession.getPeerCertificates()[0]);
            return bl;
        }
        catch (SSLException sSLException) {
            return false;
        }
    }
}

