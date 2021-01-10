/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.text.TextUtils
 *  f.f.a.e.c.a
 *  f.f.a.e.d.b
 *  f.f.a.e.d.g
 *  f.f.a.e.e.a
 *  f.f.a.e.f.h
 *  f.f.a.e.f.p
 *  f.f.a.f.a
 *  f.f.a.f.c
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
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
import f.f.a.e.f.h;
import f.f.a.e.f.p;
import f.f.a.f.a;
import f.f.a.g.a;

public class c
extends b<a.a> {
    public static final String e = "c";
    private static c f;
    private a c;
    private int d = 100;

    private c(g g2) {
        super(g2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c a(g g2) {
        if (f != null) return f;
        Class<c> class_ = c.class;
        synchronized (c.class) {
            if (f != null) return f;
            f = new c(g2);
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return f;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c(String string, String string2) {
        void var15_3 = this;
        synchronized (var15_3) {
            Cursor cursor;
            block5 : {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SELECT id FROM campaignclick WHERE id='");
                stringBuilder.append(string);
                stringBuilder.append("' AND ");
                stringBuilder.append("unitid");
                stringBuilder.append("= '");
                stringBuilder.append(string2);
                stringBuilder.append("'");
                String string3 = stringBuilder.toString();
                cursor = this.a().rawQuery(string3, null);
                if (cursor == null) break block5;
                if (cursor.getCount() <= 0) break block5;
                cursor.close();
                return true;
            }
            if (cursor == null) return false;
            cursor.close();
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(f.f.a.e.e.a a2, String string, boolean bl, int n2, int n3) {
        c c2 = this;
        synchronized (c2) {
            String string2;
            ContentValues contentValues;
            block11 : {
                if (a2 == null) {
                    return 0L;
                }
                try {
                    String string3 = p.a((Object)a2.f0());
                    contentValues = new ContentValues();
                    contentValues.put("id", a2.e());
                    contentValues.put("unitid", string);
                    contentValues.put("result", string3);
                    contentValues.put("cpti", Integer.valueOf((int)(1000 * a2.G0())));
                    contentValues.put("cti", Integer.valueOf((int)(1000 * a2.D())));
                    contentValues.put("package_name", a2.g());
                    a a3 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
                    if (bl) {
                        contentValues.put("pts", Long.valueOf((long)System.currentTimeMillis()));
                        if (n2 == 0 || n2 == 1) {
                            contentValues.put("cps", Integer.valueOf((int)n2));
                        }
                        if (a3 != null && a3.a() > 0) {
                            contentValues.put("n4", Integer.valueOf((int)(1000 * a3.a())));
                        }
                        contentValues.put("ttc_ct2", Integer.valueOf((int)(1000 * a2.X0())));
                        contentValues.put("ttc_type", Integer.valueOf((int)n3));
                    } else {
                        contentValues.put("ts", Long.valueOf((long)System.currentTimeMillis()));
                    }
                    if (a3 != null && a3.l() > 0) {
                        contentValues.put("cpei", Integer.valueOf((int)(1000 * a3.l())));
                    }
                    if (a3 != null && a3.m() > 0) {
                        contentValues.put("cpoci", Integer.valueOf((int)(1000 * a3.m())));
                    }
                    if (!this.c(a2.e(), string)) return this.b().insert("campaignclick", null, contentValues);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("id = ");
                    stringBuilder.append(a2.e());
                    stringBuilder.append(" AND ");
                    stringBuilder.append("unitid");
                    stringBuilder.append(" = ");
                    stringBuilder.append(string);
                    string2 = stringBuilder.toString();
                    SQLiteDatabase sQLiteDatabase = this.b();
                    if (sQLiteDatabase != null) break block11;
                }
                catch (Exception exception) {
                    return -1L;
                }
                return -1L;
            }
            return this.b().update("campaignclick", contentValues, string2, null);
        }
    }

    /*
     * Exception decompiling
     */
    public final String a(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl355 : FAKE_TRY : trying to set 1 previously set to 0
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
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean a(String string, String string2) {
        void var20_3 = this;
        // MONITORENTER : var20_3
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT id FROM campaignclick WHERE id='");
        stringBuilder.append(string);
        stringBuilder.append("' AND ");
        stringBuilder.append("unitid");
        stringBuilder.append("='");
        stringBuilder.append(string2);
        stringBuilder.append("' AND ");
        stringBuilder.append("cti");
        stringBuilder.append(" + ");
        stringBuilder.append("ts");
        stringBuilder.append(" > ");
        stringBuilder.append(System.currentTimeMillis());
        String string3 = stringBuilder.toString();
        Cursor cursor = this.a().rawQuery(string3, null);
        if (cursor != null && cursor.getCount() > 0) {
            cursor.close();
            // MONITOREXIT : var20_3
            return true;
        }
        if (cursor != null) {
            cursor.close();
        }
        // MONITOREXIT : var20_3
        return false;
        catch (Exception exception) {
            h.d((String)e, (String)exception.getMessage());
            // MONITOREXIT : var20_3
            return false;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final a.a b(String var1, String var2_2) {
        block13 : {
            block12 : {
                block14 : {
                    block11 : {
                        var9_3 = this;
                        // MONITORENTER : var9_3
                        var4_4 = this.a().query("campaignclick", null, "id=? AND unitid=?", new String[]{var1, var2_2}, null, null, null, null);
                        if (var4_4 == null) ** GOTO lbl16
                        if (var4_4.getCount() <= 0 || !var4_4.moveToFirst() || TextUtils.isEmpty((CharSequence)(var7_5 = var4_4.getString(var4_4.getColumnIndex("result"))))) ** GOTO lbl16
                        var8_6 = (a.a)p.a((String)var7_5);
                        if (var4_4 == null) ** GOTO lbl12
                        var4_4.close();
lbl12: // 2 sources:
                        // MONITOREXIT : var9_3
                        return var8_6;
                        catch (Exception var3_7) {
                            break block11;
                        }
lbl16: // 2 sources:
                        if (var4_4 == null) break block12;
                        break block14;
                        catch (Throwable var5_10) {
                            var4_4 = null;
                            break block13;
                        }
                        catch (Exception var3_8) {
                            var4_4 = null;
                        }
                    }
                    var3_9.printStackTrace();
                    if (var4_4 == null) break block12;
                }
                var4_4.close();
                return null;
            }
            // MONITOREXIT : var9_3
            return null;
            catch (Throwable var5_11) {
                // empty catch block
            }
        }
        if (var4_4 == null) throw var5_12;
        var4_4.close();
        throw var5_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        c c2 = this;
        synchronized (c2) {
            try {
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("(pts not ");
                    stringBuilder.append(null);
                    stringBuilder.append(" AND (  ( ");
                    stringBuilder.append("ttc_type");
                    stringBuilder.append(" = ");
                    stringBuilder.append(2);
                    stringBuilder.append(" AND (  ( ");
                    stringBuilder.append("cps");
                    stringBuilder.append(" = ");
                    stringBuilder.append(1);
                    stringBuilder.append(" AND (");
                    stringBuilder.append(System.currentTimeMillis());
                    stringBuilder.append(" - ");
                    stringBuilder.append("pts");
                    stringBuilder.append(") > ");
                    stringBuilder.append("cpti");
                    stringBuilder.append(" )  OR  (");
                    stringBuilder.append("cps");
                    stringBuilder.append(" = ");
                    stringBuilder.append(0);
                    stringBuilder.append(" AND (");
                    stringBuilder.append(System.currentTimeMillis());
                    stringBuilder.append(" - ");
                    stringBuilder.append("pts");
                    stringBuilder.append(") > ");
                    stringBuilder.append("cpei");
                    stringBuilder.append(" )  )  ) OR ( ");
                    stringBuilder.append("ttc_type");
                    stringBuilder.append(" = ");
                    stringBuilder.append(1);
                    stringBuilder.append(" AND  ( ");
                    stringBuilder.append(System.currentTimeMillis());
                    stringBuilder.append(" - ");
                    stringBuilder.append("pts");
                    stringBuilder.append(" )  > ");
                    stringBuilder.append("ttc_ct2");
                    stringBuilder.append(" ) ) ) OR ( ");
                    stringBuilder.append("pts");
                    stringBuilder.append(" is ");
                    stringBuilder.append(null);
                    stringBuilder.append(" AND  ( ");
                    stringBuilder.append(System.currentTimeMillis());
                    stringBuilder.append(" - ");
                    stringBuilder.append("ts");
                    stringBuilder.append(") > ");
                    stringBuilder.append("cti");
                    stringBuilder.append(")");
                    String string = stringBuilder.toString();
                    this.b().delete("campaignclick", string, null);
                }
                catch (Exception exception) {
                    h.d((String)e, (String)exception.getMessage());
                }
                return;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }
}

