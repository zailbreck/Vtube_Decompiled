/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  f.f.a.e.d.b
 *  f.f.a.e.d.g
 *  f.f.a.e.e.f
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package f.f.a.e.d;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import f.f.a.e.d.b;
import f.f.a.e.d.g;
import f.f.a.e.e.f;
import java.util.ArrayList;
import java.util.List;

public class j
extends b<f> {
    private static j c;

    private j(g g2) {
        super(g2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static j a(g g2) {
        if (c != null) return c;
        Class<j> class_ = j.class;
        synchronized (j.class) {
            if (c != null) return c;
            c = new j(g2);
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return c;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private boolean a(String string, String string2) {
        void var15_3 = this;
        // MONITORENTER : var15_3
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("select id from exclude_info where unitId='");
        stringBuilder.append(string);
        stringBuilder.append("' and ");
        stringBuilder.append("id");
        stringBuilder.append("='");
        stringBuilder.append(string2);
        stringBuilder.append("'");
        String string3 = stringBuilder.toString();
        Cursor cursor = this.a().rawQuery(string3, null);
        if (cursor != null && cursor.getCount() > 0) {
            cursor.close();
            // MONITOREXIT : var15_3
            return true;
        }
        if (cursor != null) {
            cursor.close();
        }
        // MONITOREXIT : var15_3
        return false;
        catch (Exception exception) {
            exception.printStackTrace();
            // MONITOREXIT : var15_3
            return false;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final List<String> a(String var1) {
        block20 : {
            block21 : {
                block19 : {
                    block18 : {
                        var17_2 = this;
                        // MONITORENTER : var17_2
                        var2_3 = null;
                        var11_4 = this.a();
                        if (var11_4 != null) break block18;
                        // MONITOREXIT : var17_2
                        return null;
                    }
                    var12_5 = new String[]{var1};
                    var10_6 = this.a().rawQuery("select id from exclude_info where unitId=?", var12_5);
                    var5_7 = null;
                    if (var10_6 == null) break block19;
                    try {
                        var14_8 = var10_6.getCount();
                        var5_7 = null;
                        if (var14_8 <= 0) break block19;
                        var4_9 = new ArrayList();
                        try {
                            while (var10_6.moveToNext()) {
                                var4_9.add((Object)var10_6.getString(var10_6.getColumnIndex("id")));
                            }
                            var5_7 = var4_9;
                            break block19;
                        }
                        catch (Exception var15_10) {
                            var2_3 = var10_6;
                            var3_11 = var15_10;
                            ** GOTO lbl-1000
                        }
                    }
                    catch (Throwable var9_13) {
                        break block20;
                    }
                    catch (Exception var13_15) {
                        var2_3 = var10_6;
                        var3_11 = var13_15;
                        var4_9 = null;
                        ** GOTO lbl-1000
                    }
                }
                if (var10_6 == null) return var5_7;
                {
                    var10_6.close();
                    return var5_7;
                }
                catch (Throwable var7_16) {
                    var8_17 = var2_3;
                    var9_14 = var7_16;
                    var10_6 = var8_17;
                    break block20;
                }
                catch (Exception var3_12) {
                    var4_9 = null;
                }
lbl-1000: // 3 sources:
                {
                    var3_11.printStackTrace();
                    if (var2_3 == null) break block21;
                }
                var2_3.close();
            }
            var5_7 = var4_9;
            // MONITOREXIT : var17_2
            return var5_7;
        }
        if (var10_6 == null) throw var9_14;
        var10_6.close();
        throw var9_14;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(f f2) {
        void var17_2 = this;
        synchronized (var17_2) {
            Throwable throwable2;
            block10 : {
                block9 : {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.b();
                        if (sQLiteDatabase != null) break block9;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    return;
                }
                if (f2 != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", f2.a());
                    contentValues.put("time", Long.valueOf((long)f2.d()));
                    contentValues.put("unitId", f2.b());
                    contentValues.put("type", Integer.valueOf((int)f2.c()));
                    if (j.super.a(f2.b(), f2.a())) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("id = ");
                        stringBuilder.append(f2.a());
                        stringBuilder.append(" AND ");
                        stringBuilder.append("unitId");
                        stringBuilder.append(" = ");
                        stringBuilder.append(f2.b());
                        String string = stringBuilder.toString();
                        this.b().update("exclude_info", contentValues, string, null);
                    } else {
                        this.b().insert("exclude_info", null, contentValues);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    public final void b(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl59.1 : ALOAD : trying to set 1 previously set to 0
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

