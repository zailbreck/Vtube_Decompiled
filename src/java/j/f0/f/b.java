/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InterruptedIOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.ProtocolException
 *  java.net.UnknownServiceException
 *  java.security.cert.CertificateException
 *  java.util.Arrays
 *  java.util.List
 *  javax.net.ssl.SSLHandshakeException
 *  javax.net.ssl.SSLPeerUnverifiedException
 *  javax.net.ssl.SSLProtocolException
 *  javax.net.ssl.SSLSocket
 */
package j.f0.f;

import j.f0.a;
import j.k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

public final class b {
    private final List<k> a;
    private int b = 0;
    private boolean c;
    private boolean d;

    public b(List<k> list) {
        this.a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i2 = this.b; i2 < this.a.size(); ++i2) {
            if (!((k)this.a.get(i2)).a(sSLSocket)) continue;
            return true;
        }
        return false;
    }

    public k a(SSLSocket sSLSocket) {
        UnknownServiceException unknownServiceException;
        k k2;
        block2 : {
            int n2 = this.a.size();
            for (int i2 = this.b; i2 < n2; ++i2) {
                k2 = (k)this.a.get(i2);
                boolean bl = k2.a(sSLSocket);
                if (!bl) continue;
                this.b = i2;
                break block2;
            }
            k2 = null;
        }
        if (k2 != null) {
            this.c = b.super.b(sSLSocket);
            a.a.a(k2, sSLSocket, this.d);
            return k2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to find acceptable protocols. isFallback=");
        stringBuilder.append(this.d);
        stringBuilder.append(", modes=");
        stringBuilder.append(this.a);
        stringBuilder.append(", supported protocols=");
        stringBuilder.append(Arrays.toString((Object[])sSLSocket.getEnabledProtocols()));
        unknownServiceException = new UnknownServiceException(stringBuilder.toString());
        throw unknownServiceException;
    }

    public boolean a(IOException iOException) {
        boolean bl;
        this.d = bl = true;
        if (!this.c) {
            return false;
        }
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return false;
        }
        boolean bl2 = iOException instanceof SSLHandshakeException;
        if (bl2 && iOException.getCause() instanceof CertificateException) {
            return false;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return false;
        }
        if (!bl2) {
            if (iOException instanceof SSLProtocolException) {
                return bl;
            }
            bl = false;
        }
        return bl;
    }
}

