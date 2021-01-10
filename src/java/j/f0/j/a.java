/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  j.f0.c
 *  j.f0.j.a$c
 *  j.f0.j.e
 *  j.f0.j.f
 *  j.f0.k.c
 *  j.f0.k.e
 *  j.w
 *  java.io.IOException
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.net.InetSocketAddress
 *  java.net.Socket
 *  java.net.SocketAddress
 *  java.nio.charset.Charset
 *  java.security.Security
 *  java.security.cert.Certificate
 *  java.security.cert.X509Certificate
 *  java.util.List
 *  javax.net.ssl.SSLContext
 *  javax.net.ssl.SSLPeerUnverifiedException
 *  javax.net.ssl.SSLSocket
 *  javax.net.ssl.X509TrustManager
 */
package j.f0.j;

import android.os.Build;
import android.util.Log;
import j.f0.j.a;
import j.f0.j.e;
import j.f0.j.f;
import j.w;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

class a
extends f {
    private final e<Socket> c;
    private final e<Socket> d;
    private final e<Socket> e;
    private final e<Socket> f;
    private final c g = c.a();

    a(Class<?> class_, e<Socket> e2, e<Socket> e3, e<Socket> e4, e<Socket> e5) {
        this.c = e2;
        this.d = e3;
        this.e = e4;
        this.f = e5;
    }

    private boolean a(String string, Class<?> class_, Object object) {
        try {
            boolean bl = (Boolean)class_.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(object, new Object[0]);
            return bl;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return super.b(string);
        }
    }

    /*
     * Exception decompiling
     */
    public static f b() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl4 : ALOAD_0 : trying to set 1 previously set to 0
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

    private boolean b(String string, Class<?> class_, Object object) {
        try {
            boolean bl = (Boolean)class_.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(object, new Object[]{string});
            return bl;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return a.super.a(string, class_, object);
        }
    }

    private static boolean e() {
        if (Security.getProvider((String)"GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName((String)"android.net.Network");
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    public j.f0.k.c a(X509TrustManager x509TrustManager) {
        try {
            Class class_ = Class.forName((String)"android.net.http.X509TrustManagerExtensions");
            a a2 = new a(class_.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), class_.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, String.class, String.class}));
            return a2;
        }
        catch (Exception exception) {
            return super.a(x509TrustManager);
        }
    }

    public Object a(String string) {
        return this.g.a(string);
    }

    /*
     * Exception decompiling
     */
    public SSLContext a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl14.3 : FAKE_TRY : trying to set 0 previously set to 1
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

    public void a(int n2, String string, Throwable throwable) {
        int n3 = 5;
        if (n2 != n3) {
            n3 = 3;
        }
        if (throwable != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append('\n');
            stringBuilder.append(Log.getStackTraceString((Throwable)throwable));
            string = stringBuilder.toString();
        }
        int n4 = 0;
        int n5 = string.length();
        block0 : while (n4 < n5) {
            int n6 = string.indexOf(10, n4);
            if (n6 == -1) {
                n6 = n5;
            }
            do {
                int n7 = Math.min((int)n6, (int)(n4 + 4000));
                Log.println((int)n3, (String)"OkHttp", (String)string.substring(n4, n7));
                if (n7 >= n6) {
                    n4 = n7 + 1;
                    continue block0;
                }
                n4 = n7;
            } while (true);
        }
    }

    public void a(String string, Object object) {
        if (!this.g.a(object)) {
            this.a(5, string, null);
        }
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int n2) {
        try {
            socket.connect((SocketAddress)inetSocketAddress, n2);
            return;
        }
        catch (ClassCastException classCastException) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause((Throwable)classCastException);
                throw iOException;
            }
            throw classCastException;
        }
        catch (SecurityException securityException) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause((Throwable)securityException);
            throw iOException;
        }
        catch (AssertionError assertionError) {
            if (j.f0.c.a((AssertionError)assertionError)) {
                throw new IOException((Throwable)assertionError);
            }
            throw assertionError;
        }
    }

    public void a(SSLSocket sSLSocket, String string, List<w> list) {
        e<Socket> e2;
        if (string != null) {
            e<Socket> e3 = this.c;
            Object[] arrobject = new Object[]{true};
            e3.c((Object)sSLSocket, arrobject);
            this.d.c((Object)sSLSocket, new Object[]{string});
        }
        if ((e2 = this.f) != null && e2.a((Object)sSLSocket)) {
            Object[] arrobject = new Object[]{f.b(list)};
            this.f.d((Object)sSLSocket, arrobject);
        }
    }

    public j.f0.k.e b(X509TrustManager x509TrustManager) {
        try {
            Method method = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            method.setAccessible(true);
            b b2 = new b(x509TrustManager, method);
            return b2;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return super.b(x509TrustManager);
        }
    }

    public String b(SSLSocket sSLSocket) {
        e<Socket> e2 = this.e;
        if (e2 == null) {
            return null;
        }
        if (!e2.a((Object)sSLSocket)) {
            return null;
        }
        byte[] arrby = (byte[])this.e.d((Object)sSLSocket, new Object[0]);
        String string = null;
        if (arrby != null) {
            string = new String(arrby, j.f0.c.j);
        }
        return string;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean b(String string) {
        void var2_7;
        try {
            Class class_ = Class.forName((String)"android.security.NetworkSecurityPolicy");
            return a.super.b(string, class_, class_.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw j.f0.c.a((String)"unable to determine cleartext support", (Exception)var2_7);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw j.f0.c.a((String)"unable to determine cleartext support", (Exception)var2_7);
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw j.f0.c.a((String)"unable to determine cleartext support", (Exception)var2_7);
        catch (ClassNotFoundException | NoSuchMethodException throwable) {
            return super.b(string);
        }
    }

    static final class a
    extends j.f0.k.c {
        private final Object a;
        private final Method b;

        a(Object object, Method method) {
            this.a = object;
            this.b = method;
        }

        public List<Certificate> a(List<Certificate> list, String string) {
            try {
                X509Certificate[] arrx509Certificate = (X509Certificate[])list.toArray((Object[])new X509Certificate[list.size()]);
                List list2 = (List)this.b.invoke(this.a, new Object[]{arrx509Certificate, "RSA", string});
                return list2;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError((Object)illegalAccessException);
            }
            catch (InvocationTargetException invocationTargetException) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(invocationTargetException.getMessage());
                sSLPeerUnverifiedException.initCause((Throwable)invocationTargetException);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object object) {
            return object instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    static final class b
    implements j.f0.k.e {
        private final X509TrustManager a;
        private final Method b;

        b(X509TrustManager x509TrustManager, Method method) {
            this.b = method;
            this.a = x509TrustManager;
        }

        /*
         * Exception decompiling
         */
        public X509Certificate a(X509Certificate var1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
            // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
            // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
            // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            b b2 = (b)object;
            return this.a.equals((Object)b2.a) && this.b.equals((Object)b2.b);
        }

        public int hashCode() {
            return this.a.hashCode() + 31 * this.b.hashCode();
        }
    }

}

