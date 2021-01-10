/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.a
 *  j.a0
 *  j.a0$a
 *  j.b
 *  j.c0
 *  j.e
 *  j.f0.c
 *  j.f0.d
 *  j.f0.f.b
 *  j.f0.f.e
 *  j.f0.f.g
 *  j.f0.g.c
 *  j.f0.g.e
 *  j.f0.i.b
 *  j.f0.i.g
 *  j.f0.i.g$g
 *  j.f0.i.g$h
 *  j.f0.i.i
 *  j.f0.j.f
 *  j.f0.k.d
 *  j.g
 *  j.h
 *  j.i
 *  j.j
 *  j.k
 *  j.p
 *  j.q
 *  j.r
 *  j.s
 *  j.t
 *  j.t$a
 *  j.w
 *  j.y
 *  j.y$a
 *  java.io.IOException
 *  java.lang.AssertionError
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.Reference
 *  java.net.ConnectException
 *  java.net.InetSocketAddress
 *  java.net.ProtocolException
 *  java.net.Proxy
 *  java.net.Proxy$Type
 *  java.net.Socket
 *  java.net.UnknownServiceException
 *  java.security.Principal
 *  java.security.cert.Certificate
 *  java.security.cert.X509Certificate
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.TimeUnit
 *  javax.net.SocketFactory
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.SSLPeerUnverifiedException
 *  javax.net.ssl.SSLSession
 *  javax.net.ssl.SSLSocket
 *  javax.net.ssl.SSLSocketFactory
 *  k.l
 *  k.r
 *  k.s
 *  k.t
 */
package j.f0.f;

import j.a;
import j.a0;
import j.c0;
import j.f0.d;
import j.f0.f.b;
import j.f0.f.e;
import j.f0.i.f;
import j.f0.i.g;
import j.g;
import j.h;
import j.i;
import j.j;
import j.k;
import j.p;
import j.q;
import j.r;
import j.s;
import j.t;
import j.v;
import j.w;
import j.y;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import k.l;

public final class c
extends g.h
implements i {
    private final j b;
    private final c0 c;
    private Socket d;
    private Socket e;
    private q f;
    private w g;
    private j.f0.i.g h;
    private k.e i;
    private k.d j;
    public boolean k;
    public int l;
    public int m = 1;
    public final List<Reference<j.f0.f.g>> n = new ArrayList();
    public long o = Long.MAX_VALUE;

    public c(j j2, c0 c02) {
        this.b = j2;
        this.c = c02;
    }

    private y a(int n2, int n3, y y2, s s2) {
        IOException iOException;
        block4 : {
            a0 a02;
            block5 : {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("CONNECT ");
                stringBuilder.append(j.f0.c.a((s)s2, (boolean)true));
                stringBuilder.append(" HTTP/1.1");
                String string = stringBuilder.toString();
                do {
                    j.f0.h.a a2 = new j.f0.h.a(null, null, this.i, this.j);
                    this.i.d().a((long)n2, TimeUnit.MILLISECONDS);
                    this.j.d().a((long)n3, TimeUnit.MILLISECONDS);
                    a2.a(y2.c(), string);
                    a2.a();
                    a0.a a3 = a2.a(false);
                    a3.a(y2);
                    a02 = a3.a();
                    long l2 = j.f0.g.e.a((a0)a02);
                    if (l2 == -1L) {
                        l2 = 0L;
                    }
                    k.s s3 = a2.b(l2);
                    j.f0.c.b((k.s)s3, (int)Integer.MAX_VALUE, (TimeUnit)TimeUnit.MILLISECONDS);
                    s3.close();
                    int n4 = a02.m();
                    if (n4 == 200) break block4;
                    if (n4 != 407) break block5;
                    y y3 = this.c.a().g().a(this.c, a02);
                    if (y3 == null) break;
                    if ("close".equalsIgnoreCase(a02.b("Connection"))) {
                        return y3;
                    }
                    y2 = y3;
                } while (true);
                throw new IOException("Failed to authenticate with proxy");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected response code for CONNECT: ");
            stringBuilder.append(a02.m());
            throw new IOException(stringBuilder.toString());
        }
        if (this.i.c().i() && this.j.c().i()) {
            return null;
        }
        iOException = new IOException("TLS tunnel buffered too many bytes!");
        throw iOException;
    }

    private void a(int n2) {
        this.e.setSoTimeout(0);
        g.g g2 = new g.g(true);
        g2.a(this.e, this.c.a().k().g(), this.i, this.j);
        g2.a((g.h)this);
        g2.a(n2);
        this.h = g2.a();
        this.h.m();
    }

    private void a(int n2, int n3, int n4, j.e e2, p p2) {
        y y2 = this.e();
        s s2 = y2.g();
        for (int i2 = 0; i2 < 21; ++i2) {
            this.a(n2, n3, e2, p2);
            y2 = this.a(n3, n4, y2, s2);
            if (y2 == null) {
                return;
            }
            j.f0.c.a((Socket)this.d);
            this.d = null;
            this.j = null;
            this.i = null;
            p2.a(e2, this.c.d(), this.c.b(), null);
        }
    }

    private void a(int n2, int n3, j.e e2, p p2) {
        Proxy proxy = this.c.b();
        a a2 = this.c.a();
        Socket socket = proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.HTTP ? new Socket(proxy) : a2.i().createSocket();
        this.d = socket;
        p2.a(e2, this.c.d(), proxy);
        this.d.setSoTimeout(n3);
        try {
            j.f0.j.f.c().a(this.d, this.c.d(), n2);
        }
        catch (ConnectException connectException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to connect to ");
            stringBuilder.append((Object)this.c.d());
            ConnectException connectException2 = new ConnectException(stringBuilder.toString());
            connectException2.initCause((Throwable)connectException);
            throw connectException2;
        }
        try {
            this.i = l.a((k.s)l.b((Socket)this.d));
            this.j = l.a((k.r)l.a((Socket)this.d));
            return;
        }
        catch (NullPointerException nullPointerException) {
            if (!"throw with null exception".equals((Object)nullPointerException.getMessage())) {
                return;
            }
            throw new IOException((Throwable)nullPointerException);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void a(b var1) {
        block13 : {
            block12 : {
                var2_2 = this.c.a();
                var3_3 = var2_2.j();
                var4_4 = null;
                var7_5 = (SSLSocket)var3_3.createSocket(this.d, var2_2.k().g(), var2_2.k().j(), true);
                var8_6 = var1.a(var7_5);
                if (var8_6.c()) {
                    j.f0.j.f.c().a(var7_5, var2_2.k().g(), var2_2.e());
                }
                var7_5.startHandshake();
                var9_7 = var7_5.getSession();
                var10_8 = q.a((SSLSession)var9_7);
                if (!var2_2.d().verify(var2_2.k().g(), var9_7)) break block12;
                var2_2.a().a(var2_2.k().g(), var10_8.b());
                var21_9 = var8_6.c();
                var22_10 = null;
                if (var21_9) {
                    var22_10 = j.f0.j.f.c().b(var7_5);
                }
                this.e = var7_5;
                this.i = l.a((k.s)l.b((Socket)this.e));
                this.j = l.a((k.r)l.a((Socket)this.e));
                this.f = var10_8;
                var23_11 = var22_10 != null ? w.a((String)var22_10) : w.d;
                this.g = var23_11;
                if (var7_5 == null) return;
                j.f0.j.f.c().a(var7_5);
                return;
            }
            try {
                var11_12 = (X509Certificate)var10_8.b().get(0);
                var12_13 = new StringBuilder();
                var12_13.append("Hostname ");
                var12_13.append(var2_2.k().g());
                var12_13.append(" not verified:\n    certificate: ");
                var12_13.append(g.a((Certificate)var11_12));
                var12_13.append("\n    DN: ");
                var12_13.append(var11_12.getSubjectDN().getName());
                var12_13.append("\n    subjectAltNames: ");
                var12_13.append((Object)j.f0.k.d.a((X509Certificate)var11_12));
                throw new SSLPeerUnverifiedException(var12_13.toString());
            }
            catch (Throwable var6_14) {}
            catch (AssertionError var5_17) {
                var4_4 = var7_5;
            }
            ** finally { 
lbl45: // 1 sources:
            break block13;
            catch (Throwable var6_15) {
                var7_5 = var4_4;
                break block13;
            }
            catch (AssertionError var5_18) {
                // empty catch block
            }
            {
                if (j.f0.c.a((AssertionError)var5_19) == false) throw var5_19;
                throw new IOException((Throwable)var5_19);
            }
        }
        if (var7_5 != null) {
            j.f0.j.f.c().a(var7_5);
        }
        j.f0.c.a(var7_5);
        throw var6_16;
    }

    private void a(b b2, int n2, j.e e2, p p2) {
        if (this.c.a().j() == null) {
            if (this.c.a().e().contains((Object)w.g)) {
                this.e = this.d;
                this.g = w.g;
                c.super.a(n2);
                return;
            }
            this.e = this.d;
            this.g = w.d;
            return;
        }
        p2.g(e2);
        c.super.a(b2);
        p2.a(e2, this.f);
        if (this.g == w.f) {
            c.super.a(n2);
        }
    }

    private y e() {
        y.a a2 = new y.a();
        a2.a(this.c.a().k());
        a2.b("Host", j.f0.c.a((s)this.c.a().k(), (boolean)true));
        a2.b("Proxy-Connection", "Keep-Alive");
        a2.b("User-Agent", d.a());
        return a2.a();
    }

    public j.f0.g.c a(v v2, t.a a2, j.f0.f.g g2) {
        j.f0.i.g g3 = this.h;
        if (g3 != null) {
            return new f(v2, a2, g2, g3);
        }
        this.e.setSoTimeout(a2.b());
        this.i.d().a((long)a2.b(), TimeUnit.MILLISECONDS);
        this.j.d().a((long)a2.c(), TimeUnit.MILLISECONDS);
        return new j.f0.h.a(v2, g2, this.i, this.j);
    }

    public q a() {
        return this.f;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(int n2, int n3, int n4, int n5, boolean bl, j.e e2, p p2) {
        if (this.g != null) {
            IllegalStateException illegalStateException = new IllegalStateException("already connected");
            throw illegalStateException;
        }
        List list = this.c.a().b();
        b b2 = new b(list);
        if (this.c.a().j() == null) {
            if (!list.contains((Object)k.h)) throw new e((IOException)new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            String string = this.c.a().k().g();
            if (!j.f0.j.f.c().b(string)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("CLEARTEXT communication to ");
                stringBuilder.append(string);
                stringBuilder.append(" not permitted by network security policy");
                throw new e((IOException)new UnknownServiceException(stringBuilder.toString()));
            }
        } else if (this.c.a().e().contains((Object)w.g)) throw new e((IOException)new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        e e3 = null;
        do {
            void var12_14;
            block19 : {
                j j2;
                block18 : {
                    block17 : {
                        block16 : {
                            if (!this.c.c()) break block16;
                            this.a(n2, n3, n4, e2, p2);
                            Socket socket = this.d;
                            if (socket != null) break block17;
                            break block18;
                        }
                        try {
                            this.a(n2, n3, e2, p2);
                        }
                        catch (IOException iOException) {
                            break block19;
                        }
                    }
                    try {
                        this.a(b2, n5, e2, p2);
                        p2.a(e2, this.c.d(), this.c.b(), this.g);
                    }
                    catch (IOException iOException) {}
                }
                if (this.c.c()) {
                    if (this.d == null) throw new e((IOException)new ProtocolException("Too many tunnel connections attempted: 21"));
                }
                if (this.h == null) return;
                j j3 = j2 = this.b;
                // MONITORENTER : j3
                this.m = this.h.b();
                // MONITOREXIT : j3
                return;
                break block19;
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            j.f0.c.a((Socket)this.e);
            j.f0.c.a((Socket)this.d);
            this.e = null;
            this.d = null;
            this.i = null;
            this.j = null;
            this.f = null;
            this.g = null;
            this.h = null;
            p2.a(e2, this.c.d(), this.c.b(), null, (IOException)var12_14);
            if (e3 == null) {
                e3 = new e((IOException)var12_14);
            } else {
                e3.a((IOException)var12_14);
            }
            if (!bl) throw e3;
            if (!b2.a((IOException)var12_14)) throw e3;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(j.f0.i.g g2) {
        j j2;
        j j3 = j2 = this.b;
        synchronized (j3) {
            this.m = g2.b();
            return;
        }
    }

    public void a(j.f0.i.i i2) {
        i2.a(j.f0.i.b.g);
    }

    /*
     * Exception decompiling
     */
    public boolean a(a var1, c0 var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl91.1 : ICONST_0 : trying to set 0 previously set to 1
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

    public boolean a(s s2) {
        if (s2.j() != this.c.a().k().j()) {
            return false;
        }
        boolean bl = s2.g().equals((Object)this.c.a().k().g());
        boolean bl2 = true;
        if (!bl) {
            if (this.f != null && j.f0.k.d.a.a(s2.g(), (X509Certificate)this.f.b().get(0))) {
                return bl2;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public boolean a(boolean var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl62.1 : ICONST_1 : trying to set 0 previously set to 1
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

    public boolean b() {
        return this.h != null;
    }

    public c0 c() {
        return this.c;
    }

    public Socket d() {
        return this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Connection{");
        stringBuilder.append(this.c.a().k().g());
        stringBuilder.append(":");
        stringBuilder.append(this.c.a().k().j());
        stringBuilder.append(", proxy=");
        stringBuilder.append((Object)this.c.b());
        stringBuilder.append(" hostAddress=");
        stringBuilder.append((Object)this.c.d());
        stringBuilder.append(" cipherSuite=");
        q q2 = this.f;
        String string = q2 != null ? q2.a() : "none";
        stringBuilder.append((Object)string);
        stringBuilder.append(" protocol=");
        stringBuilder.append((Object)this.g);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

