/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.f0.j.f
 *  j.w
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.NoSuchAlgorithmException
 *  java.security.Provider
 *  java.util.List
 *  javax.net.ssl.SSLContext
 *  javax.net.ssl.SSLSocket
 *  javax.net.ssl.SSLSocketFactory
 *  org.conscrypt.Conscrypt
 *  org.conscrypt.OpenSSLProvider
 */
package j.f0.j;

import j.f0.j.f;
import j.w;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;

public class b
extends f {
    private b() {
    }

    public static f b() {
        block3 : {
            try {
                Class.forName((String)"org.conscrypt.ConscryptEngineSocket");
                if (Conscrypt.isAvailable()) break block3;
                return null;
            }
            catch (ClassNotFoundException classNotFoundException) {
                return null;
            }
        }
        b b2 = new b();
        return b2;
    }

    private Provider e() {
        return new OpenSSLProvider();
    }

    public SSLContext a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance((String)"TLS", (Provider)this.e());
            return sSLContext;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new IllegalStateException("No TLS provider", (Throwable)noSuchAlgorithmException);
        }
    }

    public void a(SSLSocket sSLSocket, String string, List<w> list) {
        if (Conscrypt.isConscrypt((SSLSocket)sSLSocket)) {
            if (string != null) {
                Conscrypt.setUseSessionTickets((SSLSocket)sSLSocket, (boolean)true);
                Conscrypt.setHostname((SSLSocket)sSLSocket, (String)string);
            }
            Conscrypt.setApplicationProtocols((SSLSocket)sSLSocket, (String[])((String[])f.a(list).toArray((Object[])new String[0])));
            return;
        }
        super.a(sSLSocket, string, list);
    }

    public void a(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt((SSLSocketFactory)sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket((SSLSocketFactory)sSLSocketFactory, (boolean)true);
        }
    }

    public String b(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt((SSLSocket)sSLSocket)) {
            return Conscrypt.getApplicationProtocol((SSLSocket)sSLSocket);
        }
        return super.b(sSLSocket);
    }
}

