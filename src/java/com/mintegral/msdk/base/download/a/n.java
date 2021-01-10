/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.base.download.DownloadProgress
 *  com.mintegral.msdk.base.download.a.d
 *  com.mintegral.msdk.base.download.a.l
 *  com.mintegral.msdk.base.download.a.m
 *  com.mintegral.msdk.base.download.b
 *  com.mintegral.msdk.base.download.c.a
 *  com.mintegral.msdk.base.download.c.b
 *  com.mintegral.msdk.base.download.d
 *  com.mintegral.msdk.base.download.e.a.a
 *  com.mintegral.msdk.base.download.e.b
 *  com.mintegral.msdk.base.download.g.a
 *  com.mintegral.msdk.base.download.g.b
 *  com.mintegral.msdk.base.download.g.d
 *  com.mintegral.msdk.base.download.h
 *  com.mintegral.msdk.base.download.i
 *  com.mintegral.msdk.base.download.j
 *  java.io.File
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package com.mintegral.msdk.base.download.a;

import com.mintegral.msdk.base.download.DownloadProgress;
import com.mintegral.msdk.base.download.a.d;
import com.mintegral.msdk.base.download.a.l;
import com.mintegral.msdk.base.download.a.m;
import com.mintegral.msdk.base.download.b;
import com.mintegral.msdk.base.download.h;
import com.mintegral.msdk.base.download.i;
import com.mintegral.msdk.base.download.j;
import f.f.a.q.a.o;
import java.io.File;
import java.io.InputStream;

final class n
implements m {
    private final d a;
    private com.mintegral.msdk.base.download.c.a b;
    private final com.mintegral.msdk.base.download.c.b c;
    private i d;
    private InputStream e;
    private com.mintegral.msdk.base.download.e.a.a f;
    private o g;
    private volatile com.mintegral.msdk.base.download.d h;
    private String i = "";

    private n(d d2, com.mintegral.msdk.base.download.c.a a2, com.mintegral.msdk.base.download.c.b b2, com.mintegral.msdk.base.download.d d3) {
        this.a = d2;
        this.b = a2;
        this.c = b2;
        this.h = d3;
    }

    public static m a(d d2, com.mintegral.msdk.base.download.c.a a2, com.mintegral.msdk.base.download.c.b b2, com.mintegral.msdk.base.download.d d3) {
        return new n(d2, a2, b2, d3);
    }

    private void a(String string2, String string3, String string4, Exception exception) {
        if (com.mintegral.msdk.base.download.g.b.b((Object)this.c)) {
            l.f().a().a("DownloadTask", "\u79fb\u9664\uff1ahandlerException");
            this.c.a(string4, string3);
        }
        b b2 = new b(exception);
        this.d.a(b2);
        this.d.a(false);
    }

    private void a(String string2, String string3, String string4, String string5) {
        int n2;
        if (com.mintegral.msdk.base.download.g.b.a((Object)this.b)) {
            this.b = com.mintegral.msdk.base.download.c.a.a((String)this.a.f(), (String)this.h.a(), (String)this.h.f(), (String)string5, (String)string3, (String)this.h.b(), (long)this.a.c(), (long)0L, (int)this.h.c(), (int)1, (h)this.h.d());
            this.c.a(this.b);
        } else {
            this.b = com.mintegral.msdk.base.download.c.a.a((String)this.b.a(), (String)this.b.b(), (String)this.h.f(), (String)this.b.c(), (String)this.b.d(), (String)this.b.e(), (long)this.a.c(), (long)this.b.g(), (int)this.h.c(), (int)(1 + this.b.h()), (h)this.h.d());
            this.c.a(this.b, string3);
        }
        com.mintegral.msdk.base.download.e.b.a();
        File file = new File(string3, string2);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        this.f = new com.mintegral.msdk.base.download.e.a.b(file);
        this.f.a(this.a.b());
        byte[] arrby = new byte[l.f().c()];
        while ((n2 = this.e.read(arrby)) != -1) {
            this.f.a(arrby, 0, n2);
            d d2 = this.a;
            d2.a(d2.b() + (long)n2);
            this.f.a();
            int n3 = com.mintegral.msdk.base.download.g.d.a((long)this.a.c(), (long)this.a.b());
            d d3 = this.a;
            com.mintegral.msdk.base.download.d d4 = this.h;
            long l2 = this.a.b();
            long l3 = this.a.c();
            if (d3.g() != j.f) {
                DownloadProgress downloadProgress = new DownloadProgress(l2, l3, n3);
                d3.a(d4, downloadProgress);
            }
            if (this.h.c() != 100 && n3 >= this.h.c()) break;
            if (this.a.g() != j.f) continue;
            this.d.b(true);
            break;
        }
        l.f().b().a(string4, string3, com.mintegral.msdk.base.download.c.a.a((String)string4, (String)this.h.a(), (String)this.h.f(), (String)string5, (String)string3, (String)this.h.b(), (long)this.a.c(), (long)this.a.b(), (int)this.h.c(), (int)this.b.h(), (h)this.h.d()));
        if (!this.d.c()) {
            this.d.a(true);
        }
    }

    /*
     * Exception decompiling
     */
    public final i a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl480.1 : ALOAD : trying to set 1 previously set to 0
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

}

