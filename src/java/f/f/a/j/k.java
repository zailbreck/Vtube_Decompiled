/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  f.f.a.e.f.h
 *  f.f.a.j.c.b
 *  f.f.a.j.e.c
 *  f.f.a.j.o
 *  f.f.a.j.q
 *  f.f.a.j.r
 *  f.f.a.j.s
 *  f.f.a.j.t
 *  java.io.BufferedInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InterruptedIOException
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package f.f.a.j;

import android.text.TextUtils;
import f.f.a.e.f.h;
import f.f.a.j.c.a;
import f.f.a.j.c.b;
import f.f.a.j.e.c;
import f.f.a.j.m;
import f.f.a.j.o;
import f.f.a.j.q;
import f.f.a.j.r;
import f.f.a.j.s;
import f.f.a.j.t;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

public class k
implements s {
    public static final String f = "k";
    private final c a;
    private final b b;
    private t c;
    private HttpURLConnection d;
    private InputStream e;

    public k(String string) {
        super(string, new f.f.a.j.e.b());
    }

    private k(String string, c c2) {
        super(string, c2, new a());
    }

    public k(String string, c c2, b b2) {
        o.a((Object)c2);
        this.a = c2;
        o.a((Object)b2);
        this.b = b2;
        t t2 = c2.b(string);
        if (t2 == null) {
            t2 = new t(string, Integer.MIN_VALUE, r.a((String)string));
        }
        this.c = t2;
    }

    private long a(HttpURLConnection httpURLConnection) {
        String string = httpURLConnection.getHeaderField("Content-Length");
        if (string == null) {
            return -1L;
        }
        return Long.parseLong((String)string);
    }

    private HttpURLConnection a(long l2, int n2, String string) {
        q q2;
        int n3;
        block9 : {
            HttpURLConnection httpURLConnection;
            boolean bl;
            String string2 = this.c.a;
            n3 = 0;
            do {
                String string3;
                String string4;
                int n4;
                StringBuilder stringBuilder;
                block11 : {
                    StringBuilder stringBuilder2;
                    block12 : {
                        block10 : {
                            string4 = "";
                            string3 = f;
                            if (n2 <= 0) break block10;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("fetchContentInfo ");
                            if (l2 <= 0L) break block11;
                            stringBuilder2 = new StringBuilder();
                            break block12;
                        }
                        super();
                        stringBuilder.append("open connection ");
                        if (l2 <= 0L) break block11;
                        stringBuilder2 = new StringBuilder();
                    }
                    stringBuilder2.append(" with offset ");
                    stringBuilder2.append(l2);
                    string4 = stringBuilder2.toString();
                }
                stringBuilder.append(string4);
                stringBuilder.append(" to ");
                stringBuilder.append(string2);
                h.b((String)string3, (String)stringBuilder.toString());
                httpURLConnection = (HttpURLConnection)new URL(string2).openConnection();
                k.super.a(httpURLConnection, string2);
                if (l2 > 0L) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("bytes=");
                    stringBuilder3.append(l2);
                    stringBuilder3.append("-");
                    httpURLConnection.setRequestProperty("Range", stringBuilder3.toString());
                }
                if (n2 > 0) {
                    httpURLConnection.setConnectTimeout(n2);
                    httpURLConnection.setReadTimeout(n2);
                } else {
                    httpURLConnection.setConnectTimeout(15000);
                    httpURLConnection.setReadTimeout(30000);
                }
                if (string != null) {
                    httpURLConnection.setRequestMethod(string);
                }
                bl = (n4 = httpURLConnection.getResponseCode()) == 301 || n4 == 302 || n4 == 303;
                if (bl) {
                    string2 = httpURLConnection.getHeaderField("Location");
                    ++n3;
                    httpURLConnection.disconnect();
                }
                if (n3 > 5) break block9;
            } while (bl);
            return httpURLConnection;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Too many redirects: ");
        stringBuilder.append(n3);
        q2 = new q(stringBuilder.toString());
        throw q2;
    }

    private void a(HttpURLConnection httpURLConnection, String string) {
        for (Map.Entry entry : this.b.b(string).entrySet()) {
            httpURLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue());
        }
    }

    /*
     * Exception decompiling
     */
    private void e() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl62 : ALOAD_2 : trying to set 1 previously set to 0
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

    public final int a(byte[] arrby) {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            try {
                int n2 = inputStream.read(arrby, 0, arrby.length);
                return n2;
            }
            catch (IOException iOException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error reading data from ");
                stringBuilder.append(this.c.a);
                throw new q(stringBuilder.toString(), (Throwable)iOException);
            }
            catch (InterruptedIOException interruptedIOException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Reading source ");
                stringBuilder.append(this.c.a);
                stringBuilder.append(" is interrupted");
                throw new m(stringBuilder.toString(), interruptedIOException);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error reading data from ");
        stringBuilder.append(this.c.a);
        stringBuilder.append(": connection is absent!");
        throw new q(stringBuilder.toString());
    }

    public final long a() {
        k k2 = this;
        synchronized (k2) {
            if (this.c.b == Integer.MIN_VALUE) {
                this.e();
            }
            long l2 = this.c.b;
            return l2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(long l2) {
        String string;
        long l3;
        block3 : {
            int n2;
            block2 : {
                try {
                    this.d = k.super.a(l2, -1, null);
                    string = this.d.getContentType();
                    this.e = new BufferedInputStream(this.d.getInputStream(), 8192);
                    HttpURLConnection httpURLConnection = this.d;
                    n2 = this.d.getResponseCode();
                    l3 = k.super.a(httpURLConnection);
                    if (n2 != 200) break block2;
                    break block3;
                }
                catch (IOException iOException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Error opening connection for ");
                    stringBuilder.append(this.c.a);
                    stringBuilder.append(" with offset ");
                    stringBuilder.append(l2);
                    throw new q(stringBuilder.toString(), (Throwable)iOException);
                }
            }
            l3 = n2 == 206 ? (l3 += l2) : this.c.b;
        }
        this.c = new t(this.c.a, l3, string);
        this.a.a(this.c.a, this.c);
    }

    /*
     * Exception decompiling
     */
    public final void b() {
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

    public final String c() {
        k k2 = this;
        synchronized (k2) {
            if (TextUtils.isEmpty((CharSequence)this.c.c)) {
                this.e();
            }
            String string = this.c.c;
            return string;
        }
    }

    public final String d() {
        return this.c.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HttpUrlSource{sourceInfo='");
        stringBuilder.append((Object)this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

