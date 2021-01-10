/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.f0.k.e
 *  java.lang.Object
 *  java.security.cert.X509Certificate
 *  java.util.LinkedHashMap
 *  java.util.LinkedHashSet
 *  java.util.Map
 *  java.util.Set
 *  javax.security.auth.x500.X500Principal
 */
package j.f0.k;

import j.f0.k.e;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class b
implements e {
    private final Map<X500Principal, Set<X509Certificate>> a = new LinkedHashMap();

    public /* varargs */ b(X509Certificate ... arrx509Certificate) {
        for (X509Certificate x509Certificate : arrx509Certificate) {
            X500Principal x500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set)this.a.get((Object)x500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.a.put((Object)x500Principal, (Object)set);
            }
            set.add((Object)x509Certificate);
        }
    }

    /*
     * Exception decompiling
     */
    public X509Certificate a(X509Certificate var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl17 : ALOAD : trying to set 1 previously set to 0
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

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof b && ((b)object).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

