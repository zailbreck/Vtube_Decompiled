/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  f.f.a.e.d.b
 *  f.f.a.e.d.g
 *  f.f.a.e.e.g
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package f.f.a.e.d;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import f.f.a.e.d.b;
import f.f.a.e.d.g;

public class k
extends b<f.f.a.e.e.g> {
    private static k c;

    private k(g g2) {
        super(g2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static k a(g g2) {
        if (c != null) return c;
        Class<k> class_ = k.class;
        synchronized (k.class) {
            if (c != null) return c;
            c = new k(g2);
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return c;
        }
    }

    private long b(f.f.a.e.e.g g2) {
        void var7_2 = this;
        synchronized (var7_2) {
            ContentValues contentValues;
            block6 : {
                contentValues = new ContentValues();
                contentValues.put("id", g2.a());
                contentValues.put("fc_a", Integer.valueOf((int)g2.b()));
                contentValues.put("fc_b", Integer.valueOf((int)g2.c()));
                contentValues.put("ts", Long.valueOf((long)g2.f()));
                contentValues.put("impression_count", Integer.valueOf((int)g2.d()));
                contentValues.put("click_count", Integer.valueOf((int)g2.e()));
                contentValues.put("ts", Long.valueOf((long)g2.f()));
                SQLiteDatabase sQLiteDatabase = this.b();
                if (sQLiteDatabase != null) break block6;
                return -1L;
            }
            try {
                long l2 = this.b().insert("frequence", null, contentValues);
                return l2;
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

    public final void a(f.f.a.e.e.g g2) {
        void var5_2 = this;
        synchronized (var5_2) {
            if (!this.a(g2.a())) {
                k.super.b(g2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean a(String string) {
        void var11_2 = this;
        // MONITORENTER : var11_2
        Cursor cursor = null;
        try {
            String string2 = string;
            // MONITORENTER : string2
        }
        catch (Throwable throwable) {
            if (cursor == null) throw throwable;
            cursor.close();
            throw throwable;
        }
        catch (Exception exception) {
            if (cursor != null) {
                cursor.close();
            }
            // MONITOREXIT : var11_2
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT id FROM frequence WHERE id='");
        stringBuilder.append(string);
        stringBuilder.append("'");
        String string3 = stringBuilder.toString();
        cursor = this.a().rawQuery(string3, null);
        if (cursor != null && cursor.getCount() > 0) {
            // MONITOREXIT : string2
            if (cursor != null) {
                cursor.close();
            }
            // MONITOREXIT : var11_2
            return true;
        }
        // MONITOREXIT : string2
        if (cursor != null) {
            cursor.close();
        }
        // MONITOREXIT : var11_2
        return false;
    }

    public final void b(String string) {
        void var7_2 = this;
        synchronized (var7_2) {
            if (this.a(string)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("UPDATE frequence Set impression_count=impression_count+1 WHERE id=");
                stringBuilder.append(string);
                String string2 = stringBuilder.toString();
                if (this.a() != null) {
                    this.a().execSQL(string2);
                }
            }
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final long[] c() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl48 : ALOAD_1 : trying to set 1 previously set to 0
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
    public final void d() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl40.1 : ALOAD : trying to set 1 previously set to 0
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

