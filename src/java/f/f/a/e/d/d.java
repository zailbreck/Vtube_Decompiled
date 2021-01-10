/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  f.f.a.e.d.b
 *  f.f.a.e.d.g
 *  f.f.a.e.e.e
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package f.f.a.e.d;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import f.f.a.e.d.b;
import f.f.a.e.d.g;
import f.f.a.e.e.e;
import java.util.ArrayList;
import java.util.List;

public class d
extends b<e> {
    private static d c;

    private d(g g2) {
        super(g2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d a(g g2) {
        if (c != null) return c;
        Class<d> class_ = d.class;
        synchronized (d.class) {
            if (c != null) return c;
            c = new d(g2);
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return c;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final List<e> a(int var1) {
        var39_2 = this;
        synchronized (var39_2) {
            block19 : {
                block18 : {
                    block17 : {
                        block16 : {
                            var2_3 = new StringBuilder();
                            var2_3.append("select * from click_time LIMIT ");
                            var2_3.append(var1);
                            var6_4 = var2_3.toString();
                            var7_5 = this.b();
                            if (var7_5 != null) break block16;
                            return null;
                        }
                        var9_6 = this.b().rawQuery(var6_4, null);
                        if (var9_6 == null) ** GOTO lbl54
                        if (var9_6.getCount() <= 0) ** GOTO lbl54
                        var11_7 = new ArrayList();
                        ** for (var12_8 = 0;
                        ; var9_6.moveToNext() && var12_8 < var1; ++var12_8)
lbl-1000: // 1 sources:
                        {
                            var13_22 = var9_6.getInt(var9_6.getColumnIndex("id"));
                            var14_17 = var9_6.getString(var9_6.getColumnIndex("campaignId"));
                            var15_11 = var9_6.getInt(var9_6.getColumnIndex("click_type"));
                            var16_18 = var9_6.getString(var9_6.getColumnIndex("click_duration"));
                            var17_15 = var9_6.getString(var9_6.getColumnIndex("last_url"));
                            var18_27 = var9_6.getInt(var9_6.getColumnIndex("type"));
                            var19_23 = var9_6.getInt(var9_6.getColumnIndex("code"));
                            var20_19 = var9_6.getString(var9_6.getColumnIndex("header"));
                            var21_16 = var9_6.getString(var9_6.getColumnIndex("exception"));
                            var22_24 = var9_6.getString(var9_6.getColumnIndex("content"));
                            var23_12 = var9_6.getString(var9_6.getColumnIndex("unit_id"));
                            var24_28 = var9_6.getString(var9_6.getColumnIndex("rid"));
                            var25_14 = var9_6.getInt(var9_6.getColumnIndex("landing_type"));
                            var26_13 = var9_6.getInt(var9_6.getColumnIndex("link_type"));
                            var27_25 = var9_6.getInt(var9_6.getColumnIndex("network_type"));
                            var28_10 = var9_6.getString(var9_6.getColumnIndex("network_str"));
                            var29_21 = var9_6.getInt(var9_6.getColumnIndex("market_result"));
                            var30_20 = var9_6.getString(var9_6.getColumnIndex("click_time"));
                            var31_30 = new e(var24_28, var14_17, var16_18, var17_15, var19_23, var21_16, var20_19, var22_24, var18_27, var15_11, var23_12, var25_14, var26_13, var30_20, var27_25, var29_21, var28_10);
                            var11_7.add((Object)var31_30);
                            var33_9 = this.b();
                            var34_26 = new String[1];
                            var35_29 = new StringBuilder();
                            var35_29.append(var13_22);
                            var35_29.append("");
                            var34_26[0] = var35_29.toString();
                            var33_9.delete("click_time", "id = ?", var34_26);
                            continue;
                        }
lbl48: // 1 sources:
                        if (var9_6 == null) ** GOTO lbl51
                        var9_6.close();
lbl51: // 2 sources:
                        return var11_7;
                        catch (Exception var8_31) {
                            break block17;
                        }
lbl54: // 2 sources:
                        if (var9_6 != null) {
                            do {
                                var9_6.close();
                                ** GOTO lbl68
                                break;
                            } while (true);
                        }
                        break block18;
                        catch (Throwable var10_34) {
                            var9_6 = null;
                            break block19;
                        }
                        catch (Exception var8_32) {
                            var9_6 = null;
                        }
                    }
                    try {
                        var8_33.printStackTrace();
                        if (var9_6 != null) ** continue;
                    }
                    catch (Throwable var10_35) {
                        // empty catch block
                    }
                }
                return null;
            }
            if (var9_6 == null) ** GOTO lbl76
            try {
                var9_6.close();
lbl76: // 2 sources:
                throw var10_36;
            }
            catch (Throwable var3_37) {
                throw var3_37;
            }
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
                var1_2 = this.a().rawQuery("select count(*) from click_time", null);
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

