/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.os.StatFs
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.UUID
 */
package f.f.a.e.f;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import f.f.a.e.b.c.d;
import f.f.a.e.b.c.e;
import f.f.a.e.c.a;
import f.f.a.e.f.h;
import f.f.a.e.f.q;
import java.io.File;
import java.util.UUID;

public final class j {
    static boolean a = false;
    private static boolean b = false;
    private static int c = -1;
    private static int d = -1;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static int a() {
        var1 = a.i().e();
        var2_1 = (Long)q.b(var1, "freeExternalSize", 0L);
        var4_2 = System.currentTimeMillis();
        if (var4_2 - var2_1 > 1800000L) ** GOTO lbl8
        try {
            if (j.d != -1) return j.d;
lbl8: // 2 sources:
            j.d = Long.valueOf((long)(j.b() / 1000L / 1000L)).intValue();
            q.a(var1, "freeExternalSize", var4_2);
            return j.d;
        }
        catch (Throwable var0_3) {
            h.b("CommonSDCardUtil", var0_3.getMessage(), var0_3);
        }
        return j.d;
    }

    private static File a(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)UUID.randomUUID());
        stringBuilder.append("");
        File file2 = new File(file, stringBuilder.toString());
        if (file2.exists()) {
            file2.delete();
        }
        if (file2.mkdirs()) {
            file2.delete();
            return file.getAbsoluteFile();
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public static void a(Context var0) {
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

    public static long b() {
        if (j.d()) {
            int n2;
            long l2;
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                l2 = statFs.getBlockSize();
                n2 = statFs.getAvailableBlocks();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return l2 * (long)n2;
        }
        return 0L;
    }

    private static void b(Context context) {
        e.a(new d(j.c(context)));
        e.b().a();
    }

    public static int c() {
        if (c == -1) {
            try {
                c = new Long(j.e() / 1000L / 1000L).intValue();
            }
            catch (Throwable throwable) {
                h.b("CommonSDCardUtil", throwable.getMessage(), throwable);
            }
        }
        return c;
    }

    private static String c(Context context) {
        File file;
        block9 : {
            block8 : {
                if (Build.VERSION.SDK_INT >= 18) {
                    File file2 = context.getExternalFilesDir(null);
                    if (file2 == null) break block8;
                    try {
                        file = j.a(file2);
                        break block9;
                    }
                    catch (Throwable throwable) {
                        h.b("common-exception", "hasSDCard is failed", throwable);
                    }
                }
            }
            file = null;
        }
        if (a) {
            boolean bl;
            if (file == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Environment.getExternalStorageDirectory().getPath());
                stringBuilder.append(File.separator);
                stringBuilder.append("Android");
                stringBuilder.append(File.separator);
                stringBuilder.append("data");
                stringBuilder.append(File.separator);
                stringBuilder.append(context.getPackageName());
                file = j.a(new File(stringBuilder.toString()));
            }
            if (!(bl = j.b() > 31457280L)) {
                file = null;
            }
        }
        if (file == null || !file.exists()) {
            file = context.getFilesDir().getAbsoluteFile();
        }
        return file.getAbsolutePath();
    }

    /*
     * Exception decompiling
     */
    private static boolean d() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl12 : ICONST_0 : trying to set 1 previously set to 0
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

    private static long e() {
        if (j.d()) {
            int n2;
            long l2;
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                l2 = statFs.getBlockSize();
                n2 = statFs.getBlockCount();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return l2 * (long)n2;
        }
        return 0L;
    }
}

