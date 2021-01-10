/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.mintegral.msdk.base.download.e;

import java.io.File;

public class b {
    private static volatile b a;

    private b() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b a() {
        if (a != null) return a;
        Class<b> class_ = b.class;
        synchronized (b.class) {
            if (a != null) return a;
            a = new b();
            // ** MonitorExit[var1] (shouldn't be in output)
            return a;
        }
    }

    /*
     * Exception decompiling
     */
    public final String a(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl9 : LDC : trying to set 1 previously set to 0
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

    /*
     * Enabled aggressive block sorting
     */
    public final void a(File file) {
        if (file == null) {
            return;
        }
        if (!file.exists()) {
            return;
        }
        if (!file.isFile()) {
            File[] arrfile = file.listFiles();
            int n2 = arrfile.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                this.a(new File(arrfile[i2].getAbsolutePath()));
            }
        }
        file.delete();
    }

    public final long b(File file) {
        long l2 = 0L;
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] arrfile = file.listFiles();
                int n2 = arrfile.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    l2 += this.b(arrfile[i2]);
                }
                return l2;
            }
            l2 = file.length();
        }
        return l2;
    }
}

