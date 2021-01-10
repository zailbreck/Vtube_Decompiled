/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.io.StringWriter
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.a.a.a.a.h.g;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;

public class g {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String a(InputStream inputStream, String string) {
        BufferedReader bufferedReader;
        StringWriter stringWriter;
        void var6_10;
        block7 : {
            String string2;
            if (inputStream == null) {
                return "";
            }
            bufferedReader = null;
            stringWriter = new StringWriter();
            char[] arrc = new char[4096];
            BufferedReader bufferedReader2 = new BufferedReader((Reader)new InputStreamReader(inputStream, string));
            try {
                int n2;
                while ((n2 = bufferedReader2.read(arrc)) > 0) {
                    stringWriter.write(arrc, 0, n2);
                }
                string2 = stringWriter.toString();
            }
            catch (Throwable throwable) {
                bufferedReader = bufferedReader2;
            }
            g.a(inputStream);
            bufferedReader2.close();
            stringWriter.close();
            return string2;
            break block7;
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        g.a(inputStream);
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        stringWriter.close();
        throw var6_10;
    }

    /*
     * Exception decompiling
     */
    public static void a(InputStream var0) {
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

