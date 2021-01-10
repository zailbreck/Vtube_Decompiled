/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  f.f.a.e.d.b
 *  f.f.a.e.d.g
 *  f.f.a.e.e.i
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
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
import f.f.a.e.e.i;
import java.util.ArrayList;
import java.util.List;

public class l
extends b<i> {
    private static l c;

    private l(g g2) {
        super(g2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static l a(g g2) {
        if (c != null) return c;
        Class<l> class_ = l.class;
        synchronized (l.class) {
            if (c != null) return c;
            c = new l(g2);
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return c;
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
    public final List<i> a(int var1) {
        block21 : {
            block22 : {
                block19 : {
                    block20 : {
                        var32_2 = this;
                        // MONITORENTER : var32_2
                        var2_3 = new StringBuilder();
                        var2_3.append("select * from load_stat LIMIT ");
                        var2_3.append(var1);
                        var6_4 = var2_3.toString();
                        var7_5 = null;
                        var12_6 = this.a().rawQuery(var6_4, null);
                        var10_7 = null;
                        if (var12_6 == null) break block19;
                        try {
                            try {
                                var13_8 = var12_6.getCount();
                                var10_7 = null;
                                if (var13_8 <= 0) break block19;
                                var9_9 = new ArrayList();
                            }
                            catch (Exception var8_25) {
                                var9_9 = null;
                                break block20;
                            }
                            try {
                                for (var14_10 = 0; var12_6.moveToNext() && var14_10 < var1; ++var14_10) {
                                    var15_15 = var12_6.getInt(var12_6.getColumnIndex("ad_source_id"));
                                    var16_22 = var12_6.getString(var12_6.getColumnIndex("time"));
                                    var17_20 = var12_6.getInt(var12_6.getColumnIndex("adNum"));
                                    var18_16 = var12_6.getString(var12_6.getColumnIndex("unitId"));
                                    var19_11 = var12_6.getInt(var12_6.getColumnIndex("fb"));
                                    var20_23 = var12_6.getInt(var12_6.getColumnIndex("timeout"));
                                    var21_21 = var12_6.getInt(var12_6.getColumnIndex("network_type"));
                                    var22_12 = var12_6.getInt(var12_6.getColumnIndex("hb"));
                                    var23_18 = new i(var15_15, var16_22, var17_20, var18_16, var19_11, var20_23, var21_21);
                                    var23_18.a(var22_12);
                                    var9_9.add((Object)var23_18);
                                    var25_19 = var12_6.getInt(var12_6.getColumnIndex("id"));
                                    if (this.b() == null) continue;
                                    var26_17 = this.b();
                                    var27_14 = new String[1];
                                    var28_13 = new StringBuilder();
                                    var28_13.append(var25_19);
                                    var28_13.append("");
                                    var27_14[0] = var28_13.toString();
                                    var26_17.delete("load_stat", "id = ?", var27_14);
                                }
                            }
                            catch (Exception var8_24) {
                            }
                            var10_7 = var9_9;
                            break block19;
                        }
                        catch (Throwable var11_28) {
                            break block21;
                        }
                    }
                    var7_5 = var12_6;
                    ** GOTO lbl-1000
                }
                if (var12_6 == null) return var10_7;
                {
                    var12_6.close();
                    return var10_7;
                }
                catch (Throwable var11_29) {
                    var12_6 = var7_5;
                    break block21;
                }
                catch (Exception var8_27) {
                    var9_9 = null;
                }
lbl-1000: // 2 sources:
                {
                    var8_26.printStackTrace();
                    if (var7_5 == null) break block22;
                }
                var7_5.close();
            }
            var10_7 = var9_9;
            // MONITOREXIT : var32_2
            return var10_7;
        }
        if (var12_6 == null) throw var11_30;
        var12_6.close();
        throw var11_30;
    }

    public final void a(i i2) {
        void var7_2 = this;
        synchronized (var7_2) {
            block4 : {
                SQLiteDatabase sQLiteDatabase = this.b();
                if (sQLiteDatabase != null) break block4;
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("time", i2.c());
            contentValues.put("ad_source_id", Integer.valueOf((int)i2.b()));
            contentValues.put("adNum", Integer.valueOf((int)i2.d()));
            contentValues.put("unitId", i2.e());
            contentValues.put("fb", Integer.valueOf((int)i2.f()));
            contentValues.put("hb", Integer.valueOf((int)i2.a()));
            contentValues.put("timeout", Integer.valueOf((int)i2.g()));
            contentValues.put("network_type", Integer.valueOf((int)i2.h()));
            this.b().insert("load_stat", null, contentValues);
            return;
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
    public final int c() {
        block12 : {
            block13 : {
                var7_1 = this;
                // MONITORENTER : var7_1
                var1_2 = null;
                var1_2 = this.a().rawQuery("select count(*) from load_stat", null);
                var3_3 = 0;
                if (var1_2 != null) {
                    var6_4 = var1_2.moveToFirst();
                    var3_3 = 0;
                    if (var6_4) {
                        var3_3 = var1_2.getInt(0);
                    }
                }
                if (var1_2 == null) return var3_3;
lbl-1000: // 2 sources:
                {
                    do {
                        var1_2.close();
                        return var3_3;
                        break;
                    } while (true);
                }
                {
                    catch (Throwable var5_5) {
                        break block12;
                    }
                    catch (Exception var2_6) {}
                    {
                        var2_6.printStackTrace();
                        var3_3 = 0;
                        if (var1_2 == null) break block13;
                        var3_3 = 0;
                        ** continue;
                    }
                }
            }
            // MONITOREXIT : var7_1
            return var3_3;
        }
        if (var1_2 == null) throw var5_5;
        var1_2.close();
        throw var5_5;
    }
}

