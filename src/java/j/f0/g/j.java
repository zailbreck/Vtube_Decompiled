/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.a
 *  j.a0
 *  j.a0$a
 *  j.b
 *  j.b0
 *  j.c0
 *  j.e
 *  j.f0.c
 *  j.f0.f.e
 *  j.f0.f.g
 *  j.f0.g.c
 *  j.f0.i.a
 *  j.g
 *  j.j
 *  j.k
 *  j.o
 *  j.p
 *  j.s
 *  j.t
 *  j.t$a
 *  j.w
 *  j.y
 *  j.z
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.InterruptedIOException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.ProtocolException
 *  java.net.Proxy
 *  java.net.ProxySelector
 *  java.net.SocketTimeoutException
 *  java.security.cert.CertificateException
 *  java.util.List
 *  javax.net.SocketFactory
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.SSLHandshakeException
 *  javax.net.ssl.SSLPeerUnverifiedException
 *  javax.net.ssl.SSLSocketFactory
 */
package j.f0.g;

import j.a;
import j.a0;
import j.b;
import j.b0;
import j.c0;
import j.e;
import j.f0.g.c;
import j.g;
import j.k;
import j.o;
import j.p;
import j.s;
import j.t;
import j.v;
import j.w;
import j.y;
import j.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

public final class j
implements t {
    private final v a;
    private final boolean b;
    private Object c;
    private volatile boolean d;

    public j(v v2, boolean bl) {
        this.a = v2;
        this.b = bl;
    }

    private int a(a0 a02, int n2) {
        String string = a02.b("Retry-After");
        if (string == null) {
            return n2;
        }
        if (string.matches("\\d+")) {
            return Integer.valueOf((String)string);
        }
        return Integer.MAX_VALUE;
    }

    private a a(s s2) {
        g g2;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        if (s2.h()) {
            SSLSocketFactory sSLSocketFactory2 = this.a.z();
            HostnameVerifier hostnameVerifier2 = this.a.l();
            g g3 = this.a.b();
            hostnameVerifier = hostnameVerifier2;
            sSLSocketFactory = sSLSocketFactory2;
            g2 = g3;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            g2 = null;
        }
        a a2 = new a(s2.g(), s2.j(), this.a.h(), this.a.y(), sSLSocketFactory, hostnameVerifier, g2, this.a.u(), this.a.t(), this.a.s(), this.a.e(), this.a.v());
        return a2;
    }

    /*
     * Exception decompiling
     */
    private y a(a0 var1, c0 var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
        // org.benf.cfr.reader.b.a.a.b.as.a(SwitchReplacer.java:478)
        // org.benf.cfr.reader.b.a.a.b.as.a(SwitchReplacer.java:61)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:372)
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

    private boolean a(a0 a02, s s2) {
        s s3 = a02.s().g();
        return s3.g().equals((Object)s2.g()) && s3.j() == s2.j() && s3.m().equals((Object)s2.m());
    }

    private boolean a(IOException iOException, j.f0.f.g g2, boolean bl, y y2) {
        g2.a(iOException);
        if (!this.a.x()) {
            return false;
        }
        if (bl) {
            y2.a();
        }
        if (!j.super.a(iOException, bl)) {
            return false;
        }
        return g2.c();
    }

    private boolean a(IOException iOException, boolean bl) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            boolean bl2 = iOException instanceof SocketTimeoutException;
            boolean bl3 = false;
            if (bl2) {
                bl3 = false;
                if (!bl) {
                    bl3 = true;
                }
            }
            return bl3;
        }
        if (iOException instanceof SSLHandshakeException && iOException.getCause() instanceof CertificateException) {
            return false;
        }
        return !(iOException instanceof SSLPeerUnverifiedException);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public a0 a(t.a var1) {
        var2_2 = var1.d();
        var3_3 = (j.f0.g.g)var1;
        var4_4 = var3_3.e();
        var5_5 = var3_3.g();
        var6_6 = this.a.d();
        var7_7 = j.super.a(var2_2.g());
        var8_8 = this.c;
        var9_9 = new j.f0.f.g(var6_6, var7_7, var4_4, var5_5, var8_8);
        var10_10 = null;
        var11_11 = 0;
        do {
            block14 : {
                block13 : {
                    if (this.d) {
                        var9_9.e();
                        var12_27 = new IOException("Canceled");
                        throw var12_27;
                    }
                    var17_19 = var3_3.a(var2_2, var9_9, null, null);
                    if (var10_10 == null) break block13;
                    var32_18 = var17_19.p();
                    var33_12 = var10_10.p();
                    var33_12.a(null);
                    var32_18.c(var33_12.a());
                    var17_19 = var32_18.a();
                }
                try {
                    var19_16 = j.super.a(var17_19, var9_9.f());
                    if (var19_16 != null) break block14;
                    if (this.b != false) return var17_19;
                }
                catch (IOException var18_25) {
                    var9_9.e();
                    throw var18_25;
                }
                var9_9.e();
                return var17_19;
            }
            j.f0.c.a((Closeable)var17_19.a());
            var20_22 = var11_11 + 1;
            if (var20_22 > 20) {
                var9_9.e();
                var21_24 = new StringBuilder();
                var21_24.append("Too many follow-up requests: ");
                var21_24.append(var20_22);
                throw new ProtocolException(var21_24.toString());
            }
            var19_16.a();
            if (!j.super.a(var17_19, var19_16.g())) {
                var9_9.e();
                var29_15 = this.a.d();
                var30_14 = j.super.a(var19_16.g());
                var31_20 = this.c;
                var9_9 = new j.f0.f.g(var29_15, var30_14, var4_4, var5_5, var31_20);
            } else if (var9_9.a() != null) {
                var25_23 = new StringBuilder();
                var25_23.append("Closing the body of ");
                var25_23.append((Object)var17_19);
                var25_23.append(" didn't close its backing stream. Bad interceptor?");
                throw new IllegalStateException(var25_23.toString());
            }
            var10_10 = var17_19;
            var2_2 = var19_16;
            var11_11 = var20_22;
            continue;
            {
                catch (Throwable var14_26) {
                    ** GOTO lbl68
                }
                catch (IOException var15_17) {}
                {
                    var16_21 = var15_17 instanceof j.f0.i.a == false;
                    catch (j.f0.f.e var13_13) {
                        if (j.super.a(var13_13.b(), var9_9, false, var2_2) == false) throw var13_13.a();
                        continue;
                    }
lbl68: // 1 sources:
                    var9_9.a(null);
                    var9_9.e();
                    throw var14_26;
                    if (j.super.a(var15_17, var9_9, var16_21, var2_2) == false) throw var15_17;
                    continue;
                }
            }
            break;
        } while (true);
    }

    public void a(Object object) {
        this.c = object;
    }

    public boolean a() {
        return this.d;
    }
}

