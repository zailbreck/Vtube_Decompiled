/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.a0
 *  j.a0$a
 *  j.b0
 *  j.f0.a
 *  j.f0.c
 *  j.f0.e.b
 *  j.f0.e.d
 *  j.r
 *  j.r$a
 *  j.t
 *  j.t$a
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 *  k.l
 *  k.r
 *  k.s
 *  k.t
 */
package j.f0.e;

import j.a0;
import j.b0;
import j.f0.c;
import j.f0.e.b;
import j.f0.e.d;
import j.f0.g.h;
import j.r;
import j.t;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import k.e;
import k.l;
import k.s;

public final class a
implements t {
    final d a;

    public a(d d2) {
        this.a = d2;
    }

    private static a0 a(a0 a02) {
        if (a02 != null && a02.a() != null) {
            a0.a a2 = a02.p();
            a2.a(null);
            a02 = a2.a();
        }
        return a02;
    }

    private a0 a(b b2, a0 a02) {
        if (b2 == null) {
            return a02;
        }
        k.r r2 = b2.a();
        if (r2 == null) {
            return a02;
        }
        s s2 = new s((a)this, a02.a().o(), b2, l.a((k.r)r2)){
            boolean b;
            final /* synthetic */ e c;
            final /* synthetic */ b d;
            final /* synthetic */ k.d e;
            {
                this.c = e2;
                this.d = b2;
                this.e = d2;
            }

            public long a(k.c c2, long l2) {
                long l3;
                block3 : {
                    block4 : {
                        try {
                            l3 = this.c.a(c2, l2);
                            if (l3 != -1L) break block3;
                            if (this.b) break block4;
                        }
                        catch (IOException iOException) {
                            if (!this.b) {
                                this.b = true;
                                this.d.b();
                            }
                            throw iOException;
                        }
                        this.b = true;
                        this.e.close();
                    }
                    return -1L;
                }
                c2.a(this.e.c(), c2.p() - l3, l3);
                this.e.l();
                return l3;
            }

            public void close() {
                if (!this.b && !c.a((s)this, (int)100, (TimeUnit)TimeUnit.MILLISECONDS)) {
                    this.b = true;
                    this.d.b();
                }
                this.c.close();
            }

            public k.t d() {
                return this.c.d();
            }
        };
        String string = a02.b("Content-Type");
        long l2 = a02.a().m();
        a0.a a2 = a02.p();
        a2.a((b0)new h(string, l2, l.a((s)s2)));
        return a2.a();
    }

    private static r a(r r2, r r3) {
        r.a a2 = new r.a();
        int n2 = r2.b();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = r2.a(i2);
            String string2 = r2.b(i2);
            if ("Warning".equalsIgnoreCase(string) && string2.startsWith("1") || !a.a(string) && a.b(string) && r3.a(string) != null) continue;
            j.f0.a.a.a(a2, string, string2);
        }
        int n4 = r3.b();
        while (n3 < n4) {
            String string = r3.a(n3);
            if (!a.a(string) && a.b(string)) {
                j.f0.a.a.a(a2, string, r3.b(n3));
            }
            ++n3;
        }
        return a2.a();
    }

    static boolean a(String string) {
        return "Content-Length".equalsIgnoreCase(string) || "Content-Encoding".equalsIgnoreCase(string) || "Content-Type".equalsIgnoreCase(string);
        {
        }
    }

    static boolean b(String string) {
        return !"Connection".equalsIgnoreCase(string) && !"Keep-Alive".equalsIgnoreCase(string) && !"Proxy-Authenticate".equalsIgnoreCase(string) && !"Proxy-Authorization".equalsIgnoreCase(string) && !"TE".equalsIgnoreCase(string) && !"Trailers".equalsIgnoreCase(string) && !"Transfer-Encoding".equalsIgnoreCase(string) && !"Upgrade".equalsIgnoreCase(string);
    }

    /*
     * Exception decompiling
     */
    public a0 a(t.a var1) {
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

}

