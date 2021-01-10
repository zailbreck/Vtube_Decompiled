/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Date
 *  java.util.Map
 */
package f.a.a.a.a.k;

import f.a.a.a.a.h.g.c;
import f.a.a.a.a.h.g.d;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public class f {
    private Map<String, String> a = new c();
    private Map<String, Object> b = new c();

    public String a() {
        return (String)this.b.get((Object)"Cache-Control");
    }

    public void a(String string, Object object) {
        this.b.put((Object)string, object);
    }

    public void a(String string, String string2) {
        this.a.put((Object)string, (Object)string2);
    }

    public String b() {
        return (String)this.b.get((Object)"Content-Disposition");
    }

    public String c() {
        return (String)this.b.get((Object)"Content-Encoding");
    }

    public String d() {
        return (String)this.b.get((Object)"Content-MD5");
    }

    public String e() {
        return (String)this.b.get((Object)"ETag");
    }

    public Date f() {
        return d.a((String)this.b.get((Object)"Expires"));
    }

    public Date g() {
        return (Date)this.b.get((Object)"Last-Modified");
    }

    public String h() {
        return (String)this.b.get((Object)"x-oss-object-type");
    }

    public String i() {
        return (String)this.b.get((Object)"Expires");
    }

    public Map<String, Object> j() {
        return Collections.unmodifiableMap(this.b);
    }

    public String k() {
        return (String)this.b.get((Object)"x-oss-server-side-encryption");
    }

    public Map<String, String> l() {
        return this.a;
    }

    /*
     * Exception decompiling
     */
    public String toString() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl8 : NEW : trying to set 1 previously set to 0
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

