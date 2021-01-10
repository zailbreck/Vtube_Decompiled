/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.io.FileWriter
 *  java.io.IOException
 *  java.io.PrintWriter
 *  java.io.Writer
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.text.SimpleDateFormat
 *  java.util.Date
 */
package f.a.a.a.a.h;

import android.content.Context;
import f.a.a.a.a.h.d;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class e {
    private static f.a.a.a.a.h.b b = f.a.a.a.a.h.b.b();
    private static Context c;
    private static e d;
    private static File e;
    private static SimpleDateFormat f;
    private static long g;
    private boolean a = true;

    static {
        f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        g = 0x500000L;
    }

    private e() {
    }

    private String a(StackTraceElement[] arrstackTraceElement) {
        if (arrstackTraceElement == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(f.format(new Date()));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        return null;
    }

    public static void a(Context context, f.a.a.a.a.a a2) {
        File file;
        d.b("init ...", false);
        if (a2 != null) {
            g = a2.g();
        }
        if (c != null && d != null && (file = e) != null && file.exists()) {
            d.b("LogToFileUtils has been init ...", false);
            return;
        }
        c = context.getApplicationContext();
        d = e.f();
        b.a(new Runnable(){

            public void run() {
                e = d.g();
                if (e != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("LogFilePath is: ");
                    stringBuilder.append(e.getPath());
                    d.d(stringBuilder.toString(), false);
                    long l2 = e.c(e);
                    if (g < l2) {
                        d.d("init reset log file", false);
                        d.a();
                    }
                }
            }
        });
    }

    public static long c(File file) {
        if (file != null && file.exists()) {
            return file.length();
        }
        return 0L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e f() {
        if (d != null) return d;
        Class<e> class_ = e.class;
        synchronized (e.class) {
            if (d != null) return d;
            d = new e();
            // ** MonitorExit[var1] (shouldn't be in output)
            return d;
        }
    }

    /*
     * Exception decompiling
     */
    private File g() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl86 : ACONST_NULL : trying to set 1 previously set to 0
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
     * Exception decompiling
     */
    private long h() {
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

    /*
     * Exception decompiling
     */
    private long i() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl33 : NEW : trying to set 1 previously set to 0
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

    public void a() {
        d.b("Reset Log File ... ", false);
        if (!e.getParentFile().exists()) {
            d.b("Reset Log make File dir ... ", false);
            e.getParentFile().mkdir();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(e.getParent());
        stringBuilder.append("/logs.csv");
        File file = new File(stringBuilder.toString());
        if (file.exists()) {
            file.delete();
        }
        this.a(file);
    }

    public void a(File file) {
        try {
            file.createNewFile();
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Create log file failure !!! ");
            stringBuilder.append(exception.toString());
            d.c(stringBuilder.toString(), false);
            return;
        }
    }

    public void a(Object object) {
        void var4_2 = this;
        synchronized (var4_2) {
            if (d.a()) {
                if (c != null && d != null && e != null) {
                    if (!e.exists()) {
                        this.a();
                    }
                    b b2 = new b(object);
                    b.a(b2);
                } else {
                    return;
                }
            }
            return;
        }
    }

    private static class b
    implements Runnable {
        private Object b;

        public b(Object object) {
            this.b = object;
        }

        private PrintWriter a(PrintWriter printWriter) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("crash_time\uff1a");
            stringBuilder.append(f.format(new Date()));
            printWriter.println(stringBuilder.toString());
            ((Throwable)this.b).printStackTrace(printWriter);
            return printWriter;
        }

        public void run() {
            if (e != null) {
                e.f();
                if (e.c(e) > g) {
                    e.f().a();
                }
                try {
                    PrintWriter printWriter = new PrintWriter((Writer)new FileWriter(e, true), true);
                    if (this.b instanceof Throwable) {
                        this.a(printWriter);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(e.f().a(null));
                        stringBuilder.append(" - ");
                        stringBuilder.append(this.b.toString());
                        printWriter.println(stringBuilder.toString());
                    }
                    printWriter.println("------>end of log");
                    printWriter.println();
                    printWriter.close();
                    return;
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }

}

