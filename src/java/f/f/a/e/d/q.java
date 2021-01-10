/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.text.TextUtils
 *  f.f.a.e.d.b
 *  f.f.a.e.d.g
 *  f.f.a.e.e.a
 *  f.f.a.e.e.m
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 */
package f.f.a.e.d;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import f.f.a.e.d.b;
import f.f.a.e.d.g;
import f.f.a.e.e.m;
import f.f.a.m.a;

public class q
extends b<a> {
    private static q c;

    private q(g g2) {
        super(g2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static q a(g g2) {
        if (c != null) return c;
        Class<q> class_ = q.class;
        synchronized (q.class) {
            if (c != null) return c;
            c = new q(g2);
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return c;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(String string, String string2) {
        void var18_3 = this;
        synchronized (var18_3) {
            Cursor cursor;
            block7 : {
                String string3;
                if (TextUtils.isEmpty((CharSequence)string2)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("SELECT id FROM video WHERE video_url = '");
                    stringBuilder.append(string);
                    stringBuilder.append("'");
                    string3 = stringBuilder.toString();
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("SELECT id FROM video WHERE video_url = '");
                    stringBuilder.append(string);
                    stringBuilder.append("' AND ");
                    stringBuilder.append("id");
                    stringBuilder.append(" = ");
                    stringBuilder.append(string2);
                    string3 = stringBuilder.toString();
                }
                cursor = this.a().rawQuery(string3, null);
                if (cursor == null) break block7;
                if (cursor.getCount() <= 0) break block7;
                cursor.close();
                return true;
            }
            if (cursor == null) return false;
            cursor.close();
            return false;
        }
    }

    public final long a(f.f.a.e.e.a a2, long l2, String string, int n2) {
        void var12_5 = this;
        synchronized (var12_5) {
            ContentValues contentValues;
            block10 : {
                boolean bl;
                block9 : {
                    if (a2 == null) {
                        return 0L;
                    }
                    SQLiteDatabase sQLiteDatabase = this.b();
                    if (sQLiteDatabase != null) break block9;
                    return -1L;
                }
                contentValues = new ContentValues();
                contentValues.put("unitid", a2.B());
                contentValues.put("id", a2.e());
                contentValues.put("package_name", a2.g());
                contentValues.put("app_name", a2.c());
                contentValues.put("app_desc", a2.b());
                contentValues.put("app_size", a2.i());
                contentValues.put("image_size", a2.W());
                contentValues.put("icon_url", a2.d());
                contentValues.put("image_url", a2.f());
                contentValues.put("impression_url", a2.Y());
                contentValues.put("notice_url", a2.u0());
                contentValues.put("download_url", a2.F());
                contentValues.put("only_impression", a2.B0());
                contentValues.put("ts", Long.valueOf((long)a2.j()));
                contentValues.put("template", Integer.valueOf((int)a2.W0()));
                contentValues.put("click_mode", a2.G());
                contentValues.put("landing_type", a2.k0());
                contentValues.put("link_type", Integer.valueOf((int)a2.l0()));
                contentValues.put("star", Double.valueOf((double)a2.h()));
                contentValues.put("cti", Integer.valueOf((int)a2.D()));
                contentValues.put("cpti", Integer.valueOf((int)a2.G0()));
                contentValues.put("preclick", Boolean.valueOf((boolean)a2.n1()));
                contentValues.put("level", Integer.valueOf((int)a2.A()));
                contentValues.put("adSource", Integer.valueOf((int)a2.k()));
                contentValues.put("ad_call", a2.a());
                contentValues.put("fc_a", Integer.valueOf((int)a2.M()));
                contentValues.put("ad_url_list", a2.p());
                contentValues.put("video_url", a2.d1());
                contentValues.put("total_size", Long.valueOf((long)l2));
                contentValues.put("video_state", Integer.valueOf((int)n2));
                contentValues.put("video_download_start", Long.valueOf((long)(System.currentTimeMillis() / 1000L)));
                contentValues.put("ad_bid_token", a2.x());
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    contentValues.put("video_path", string);
                }
                if (!(bl = q.super.b(a2.d1(), a2.e()))) break block10;
                return 0L;
            }
            try {
                long l3 = this.b().insert("video", null, contentValues);
                return l3;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            catch (Exception exception) {
                return -1L;
            }
            finally {
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final long a(String var1, long var2, int var4) {
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
    public final m a(String var1, String var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl115 : FAKE_TRY : trying to set 1 previously set to 0
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
    public final void a(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl45.1 : ALOAD : trying to set 1 previously set to 0
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
    public final void a(String var1, long var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl61.1 : ALOAD : trying to set 1 previously set to 0
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

