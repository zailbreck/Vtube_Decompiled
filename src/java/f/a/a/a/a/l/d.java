/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.a0
 *  j.b0
 *  j.r
 *  java.io.InputStream
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.Callable
 */
package f.a.a.a.a.l;

import f.a.a.a.a.j.g;
import f.a.a.a.a.j.i;
import f.a.a.a.a.j.j;
import f.a.a.a.a.j.k;
import f.a.a.a.a.k.e;
import f.a.a.a.a.l.b;
import j.a0;
import j.b0;
import j.r;
import j.v;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class d<T extends e>
implements Callable<T> {
    private k<T> b;
    private i c;
    private b d;
    private v e;
    private g f;
    private int g = 0;

    public d(i i2, k k2, b b2, int n2) {
        this.b = k2;
        this.c = i2;
        this.d = b2;
        this.e = b2.c();
        this.f = new g(n2);
    }

    private j a(i i2, a0 a02) {
        j j2 = new j();
        j2.a(i2);
        j2.a(a02);
        HashMap hashMap = new HashMap();
        r r2 = a02.o();
        for (int i3 = 0; i3 < r2.b(); ++i3) {
            hashMap.put((Object)r2.a(i3), (Object)r2.b(i3));
        }
        j2.a((Map<String, String>)hashMap);
        j2.a(a02.m());
        j2.a(a02.a().m());
        j2.a(a02.a().a());
        return j2;
    }

    /*
     * Exception decompiling
     */
    public T call() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl634 : ALOAD_0 : trying to set 1 previously set to 0
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

