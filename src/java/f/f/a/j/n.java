/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.Proxy
 *  java.net.ProxySelector
 *  java.net.URI
 *  java.net.URISyntaxException
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Locale
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 */
package f.f.a.j;

import f.f.a.j.k;
import f.f.a.j.o;
import f.f.a.j.q;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class n {
    private final ExecutorService a = Executors.newSingleThreadExecutor();
    private final String b;
    private final int c;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VideoCache");
        stringBuilder.append(n.class.getSimpleName());
        stringBuilder.toString();
    }

    n(String string, int n2) {
        o.a(string);
        this.b = string;
        this.c = n2;
    }

    private List<Proxy> a() {
        try {
            List list = ProxySelector.getDefault().select(new URI(this.c()));
            return list;
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new IllegalStateException((Throwable)uRISyntaxException);
        }
    }

    private boolean b() {
        k k2 = new k(this.c());
        try {
            byte[] arrby = "ping ok".getBytes();
            k2.a(0L);
            byte[] arrby2 = new byte[arrby.length];
            k2.a(arrby2);
            boolean bl = Arrays.equals((byte[])arrby, (byte[])arrby2);
            return bl;
        }
        catch (q q2) {
            return false;
        }
        finally {
            k2.b();
        }
    }

    private String c() {
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{this.b, this.c, "ping"};
        return String.format((Locale)locale, (String)"http://%s:%d/%s", (Object[])arrobject);
    }

    /*
     * Exception decompiling
     */
    final boolean a(int var1, int var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl46.1 : IINC : trying to set 1 previously set to 0
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

    private final class b
    implements Callable<Boolean> {
        final /* synthetic */ n b;

        private b(n n2) {
            this.b = n2;
        }

        /* synthetic */ b(n n2, a a2) {
            super(n2);
        }

        public final /* synthetic */ Object call() {
            return this.b.b();
        }
    }

}

