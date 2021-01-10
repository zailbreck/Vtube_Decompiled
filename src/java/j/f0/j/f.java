/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.net.InetSocketAddress
 *  java.net.Socket
 *  java.net.SocketAddress
 *  java.security.Security
 *  java.security.cert.X509Certificate
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.logging.Level
 *  java.util.logging.Logger
 *  javax.net.ssl.SSLContext
 *  javax.net.ssl.SSLSocket
 *  javax.net.ssl.SSLSocketFactory
 *  javax.net.ssl.X509TrustManager
 */
package j.f0.j;

import j.f0.j.a;
import j.f0.j.b;
import j.f0.j.c;
import j.f0.j.d;
import j.f0.k.e;
import j.v;
import j.w;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public class f {
    private static final f a = f.b();
    private static final Logger b = Logger.getLogger((String)v.class.getName());

    public static List<String> a(List<w> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            w w2 = (w)((Object)list.get(i2));
            if (w2 == w.c) continue;
            arrayList.add((Object)w2.toString());
        }
        return arrayList;
    }

    private static f b() {
        f f2;
        f f3 = a.b();
        if (f3 != null) {
            return f3;
        }
        if (f.d() && (f2 = b.b()) != null) {
            return f2;
        }
        c c2 = c.b();
        if (c2 != null) {
            return c2;
        }
        f f4 = d.b();
        if (f4 != null) {
            return f4;
        }
        return new f();
    }

    static byte[] b(List<w> list) {
        k.c c2 = new k.c();
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            w w2 = (w)((Object)list.get(i2));
            if (w2 == w.c) continue;
            c2.writeByte(w2.toString().length());
            c2.a(w2.toString());
        }
        return c2.g();
    }

    public static f c() {
        return a;
    }

    public static boolean d() {
        if ("conscrypt".equals((Object)System.getProperty((String)"okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals((Object)Security.getProviders()[0].getName());
    }

    public j.f0.k.c a(X509TrustManager x509TrustManager) {
        return new j.f0.k.a(this.b(x509TrustManager));
    }

    public Object a(String string2) {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(string2);
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public SSLContext a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl11.3 : FAKE_TRY : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    public void a(int n2, String string2, Throwable throwable) {
        Level level = n2 == 5 ? Level.WARNING : Level.INFO;
        b.log(level, string2, throwable);
    }

    public void a(String string2, Object object) {
        if (object == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            string2 = stringBuilder.toString();
        }
        this.a(5, string2, (Throwable)object);
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int n2) {
        socket.connect((SocketAddress)inetSocketAddress, n2);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void a(SSLSocket sSLSocket, String string2, List<w> list) {
    }

    public void a(SSLSocketFactory sSLSocketFactory) {
    }

    public e b(X509TrustManager x509TrustManager) {
        return new j.f0.k.b(x509TrustManager.getAcceptedIssuers());
    }

    public String b(SSLSocket sSLSocket) {
        return null;
    }

    public boolean b(String string2) {
        return true;
    }
}

