/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.base.download.DownloadProgress
 *  com.mintegral.msdk.base.download.a.d
 *  com.mintegral.msdk.base.download.a.m
 *  com.mintegral.msdk.base.download.c.a
 *  com.mintegral.msdk.base.download.c.b
 *  com.mintegral.msdk.base.download.c.b$a
 *  com.mintegral.msdk.base.download.d
 *  com.mintegral.msdk.base.download.i
 *  com.mintegral.msdk.base.download.j
 *  java.lang.Object
 *  java.util.concurrent.CountDownLatch
 */
package com.mintegral.msdk.base.download.a;

import com.mintegral.msdk.base.download.DownloadProgress;
import com.mintegral.msdk.base.download.a.d;
import com.mintegral.msdk.base.download.a.m;
import com.mintegral.msdk.base.download.c.b;
import com.mintegral.msdk.base.download.i;
import com.mintegral.msdk.base.download.j;
import java.util.concurrent.CountDownLatch;

public final class g
implements m {
    private volatile d a;
    private volatile com.mintegral.msdk.base.download.d b;
    private com.mintegral.msdk.base.download.c.b c;
    private com.mintegral.msdk.base.download.c.a d = null;

    private g(d d2, com.mintegral.msdk.base.download.d d3, com.mintegral.msdk.base.download.c.b b2) {
        this.a = d2;
        this.b = d3;
        this.c = b2;
    }

    static m a(d d2, com.mintegral.msdk.base.download.d d3, com.mintegral.msdk.base.download.c.b b2) {
        return new g(d2, d3, b2);
    }

    private void a(d d2, com.mintegral.msdk.base.download.d d3, DownloadProgress downloadProgress) {
        if (d2.g() != j.f) {
            d2.a(d3, downloadProgress);
        }
    }

    /*
     * Exception decompiling
     */
    public final i a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl248 : ALOAD_0 : trying to set 1 previously set to 0
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

