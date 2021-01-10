/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.zip.GZIPInputStream
 */
package f.f.a.g;

import f.f.a.f.c;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.zip.GZIPInputStream;

public class f {
    private static final String e = "f";
    private f.f.a.f.a a = c.b().a(f.f.a.e.c.a.i().f());
    private String b;
    private boolean c = true;
    private a d;

    public f() {
        if (this.a == null) {
            this.a = c.b().a();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private String a(InputStream var1, boolean var2_2) {
        block14 : {
            var3_3 = new StringBuilder();
            var4_4 = null;
            if (!var2_2) ** GOTO lbl6
            var1 = new GZIPInputStream(var1);
lbl6: // 2 sources:
            var5_5 = new BufferedReader((Reader)new InputStreamReader(var1));
            while ((var10_6 = var5_5.readLine()) != null) {
                var3_3.append(var10_6);
            }
            var5_5.close();
            return var3_3.toString();
            catch (Throwable var8_7) {
                var4_4 = var5_5;
                break block14;
            }
            catch (Exception var6_10) {
                var4_4 = var5_5;
                ** GOTO lbl-1000
            }
            catch (Throwable var8_8) {
                break block14;
            }
            catch (Exception var6_11) {
                // empty catch block
            }
lbl-1000: // 2 sources:
            {
                if (this.d == null) {
                    this.d = new a();
                    this.d.h = var6_12.getMessage();
                }
                var6_12.printStackTrace();
                if (var4_4 == null) return var3_3.toString();
            }
            try {
                var4_4.close();
                return var3_3.toString();
            }
            catch (Exception var7_13) {
                var7_13.printStackTrace();
            }
            return var3_3.toString();
        }
        if (var4_4 == null) throw var8_9;
        try {
            var4_4.close();
            throw var8_9;
        }
        catch (Exception var9_14) {
            var9_14.printStackTrace();
            throw var8_9;
        }
    }

    /*
     * Exception decompiling
     */
    public final a a(String var1, boolean var2, boolean var3, f.f.a.e.e.a var4) {
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

    public static final class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public int e;
        public int f;
        public String g;
        public String h;

        public final String a() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("statusCode=");
            stringBuilder.append(this.f);
            stringBuilder.append(", ");
            stringBuilder.append("location=");
            stringBuilder.append(this.a);
            stringBuilder.append(", ");
            stringBuilder.append("contentType=");
            stringBuilder.append(this.b);
            stringBuilder.append(", ");
            stringBuilder.append("contentLength=");
            stringBuilder.append(this.e);
            stringBuilder.append(", ");
            stringBuilder.append("contentEncoding=");
            stringBuilder.append(this.c);
            stringBuilder.append(", ");
            stringBuilder.append("referer=");
            stringBuilder.append(this.d);
            return stringBuilder.toString();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("http\u54cd\u5e94\u5934\uff1a...\n");
            stringBuilder.append("statusCode=");
            stringBuilder.append(this.f);
            stringBuilder.append(", ");
            stringBuilder.append("location=");
            stringBuilder.append(this.a);
            stringBuilder.append(", ");
            stringBuilder.append("contentType=");
            stringBuilder.append(this.b);
            stringBuilder.append(", ");
            stringBuilder.append("contentLength=");
            stringBuilder.append(this.e);
            stringBuilder.append(", ");
            stringBuilder.append("contentEncoding=");
            stringBuilder.append(this.c);
            stringBuilder.append(", ");
            stringBuilder.append("referer=");
            stringBuilder.append(this.d);
            return stringBuilder.toString();
        }
    }

}

