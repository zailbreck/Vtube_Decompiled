/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.f0.k.c
 *  j.f0.k.e
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 *  java.security.Principal
 *  java.security.PublicKey
 *  java.security.cert.Certificate
 *  java.security.cert.X509Certificate
 *  java.util.ArrayDeque
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  javax.net.ssl.SSLPeerUnverifiedException
 */
package j.f0.k;

import j.f0.k.c;
import j.f0.k.e;
import java.security.GeneralSecurityException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class a
extends c {
    private final e a;

    public a(e e2) {
        this.a = e2;
    }

    private boolean a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals((Object)x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        }
        catch (GeneralSecurityException generalSecurityException) {
            return false;
        }
    }

    public List<Certificate> a(List<Certificate> list, String string) {
        SSLPeerUnverifiedException sSLPeerUnverifiedException;
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean bl = false;
        block0 : for (int i2 = 0; i2 < 9; ++i2) {
            X509Certificate x509Certificate = (X509Certificate)arrayList.get(arrayList.size() - 1);
            X509Certificate x509Certificate2 = this.a.a(x509Certificate);
            if (x509Certificate2 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals((Object)x509Certificate2)) {
                    arrayList.add((Object)x509Certificate2);
                }
                if (a.super.a(x509Certificate2, x509Certificate2)) {
                    return arrayList;
                }
                bl = true;
                continue;
            }
            Iterator iterator = arrayDeque.iterator();
            while (iterator.hasNext()) {
                X509Certificate x509Certificate3 = (X509Certificate)iterator.next();
                if (!a.super.a(x509Certificate, x509Certificate3)) continue;
                iterator.remove();
                arrayList.add((Object)x509Certificate3);
                continue block0;
            }
            if (bl) {
                return arrayList;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to find a trusted cert that signed ");
            stringBuilder.append((Object)x509Certificate);
            throw new SSLPeerUnverifiedException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Certificate chain too long: ");
        stringBuilder.append((Object)arrayList);
        sSLPeerUnverifiedException = new SSLPeerUnverifiedException(stringBuilder.toString());
        throw sSLPeerUnverifiedException;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof a && ((a)object).a.equals((Object)this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

