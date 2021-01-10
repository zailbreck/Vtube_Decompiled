/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  f.f.a.e.d.b
 *  f.f.a.e.d.g
 *  f.f.a.e.e.l
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
import f.f.a.e.e.l;
import java.util.ArrayList;
import java.util.List;

public class m
extends b {
    private static m c;

    private m(g g2) {
        super(g2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static m a(g g2) {
        if (c != null) return c;
        Class<m> class_ = m.class;
        synchronized (m.class) {
            if (c != null) return c;
            c = new m(g2);
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return c;
        }
    }

    public final int a(String string) {
        void var6_2 = this;
        synchronized (var6_2) {
            String[] arrstring;
            block6 : {
                arrstring = new String[]{string};
                SQLiteDatabase sQLiteDatabase = this.b();
                if (sQLiteDatabase != null) break block6;
                return -1;
            }
            try {
                int n2 = this.b().delete("reporterror", "url=?", arrstring);
                return n2;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            catch (Exception exception) {
                return -1;
            }
            finally {
            }
        }
    }

    public final int a(String string, String string2) {
        void var7_3 = this;
        synchronized (var7_3) {
            String[] arrstring;
            block7 : {
                if (string == null) {
                    string = "";
                }
                arrstring = new String[]{string2, string};
                SQLiteDatabase sQLiteDatabase = this.b();
                if (sQLiteDatabase != null) break block7;
                return -1;
            }
            try {
                int n2 = this.b().delete("reporterror", "url=? and data=?", arrstring);
                return n2;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            catch (Exception exception) {
                return -1;
            }
            finally {
            }
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
    public final List<l> a(int n2) {
        Throwable throwable;
        Cursor cursor;
        block19 : {
            ArrayList arrayList;
            ArrayList arrayList2;
            block20 : {
                Exception exception;
                block18 : {
                    block17 : {
                        void var19_2 = this;
                        // MONITORENTER : var19_2
                        SQLiteDatabase sQLiteDatabase = this.a();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(n2);
                        stringBuilder.append("");
                        cursor = sQLiteDatabase.query("reporterror", null, null, null, null, null, null, stringBuilder.toString());
                        arrayList = null;
                        if (cursor == null) break block17;
                        int n3 = cursor.getCount();
                        arrayList = null;
                        if (n3 <= 0) break block17;
                        arrayList2 = new ArrayList();
                        try {
                            while (cursor.moveToNext()) {
                                String string = cursor.getString(cursor.getColumnIndex("url"));
                                String string2 = cursor.getString(cursor.getColumnIndex("data"));
                                arrayList2.add((Object)new l(string, cursor.getString(cursor.getColumnIndex("method")), string2, cursor.getString(cursor.getColumnIndex("unitId"))));
                            }
                            arrayList = arrayList2;
                            break block17;
                        }
                        catch (Exception exception2) {
                            break block18;
                        }
                        catch (Exception exception3) {
                            exception = exception3;
                            arrayList2 = null;
                            break block18;
                        }
                    }
                    if (cursor == null) return arrayList;
                    {
                        cursor.close();
                        return arrayList;
                    }
                    catch (Throwable throwable2) {
                        throwable = throwable2;
                        cursor = null;
                        break block19;
                    }
                    catch (Exception exception4) {
                        arrayList2 = null;
                        exception = exception4;
                        cursor = null;
                    }
                }
                exception.printStackTrace();
                if (cursor == null) break block20;
                cursor.close();
            }
            arrayList = arrayList2;
            // MONITOREXIT : var19_2
            return arrayList;
            catch (Throwable throwable3) {
                // empty catch block
            }
        }
        if (cursor == null) throw throwable;
        cursor.close();
        throw throwable;
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
        block13 : {
            block14 : {
                var9_1 = this;
                // MONITORENTER : var9_1
                var1_2 = new String[]{" count(*) "};
                var2_3 = null;
                var2_3 = this.a().query("reporterror", var1_2, null, null, null, null, null);
                var4_4 = 0;
                if (var2_3 != null) {
                    var7_5 = var2_3.moveToFirst();
                    var4_4 = 0;
                    if (var7_5) {
                        var4_4 = var8_6 = var2_3.getInt(0);
                    }
                }
                if (var2_3 == null) return var4_4;
lbl-1000: // 2 sources:
                {
                    do {
                        var2_3.close();
                        return var4_4;
                        break;
                    } while (true);
                }
                {
                    catch (Throwable var6_7) {
                        break block13;
                    }
                    catch (Exception var3_8) {}
                    {
                        var3_8.printStackTrace();
                        var4_4 = 0;
                        if (var2_3 == null) break block14;
                        var4_4 = 0;
                        ** continue;
                    }
                }
            }
            // MONITOREXIT : var9_1
            return var4_4;
        }
        if (var2_3 == null) throw var6_7;
        var2_3.close();
        throw var6_7;
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
    public final int d() {
        block11 : {
            block12 : {
                var7_1 = this;
                // MONITORENTER : var7_1
                var1_2 = null;
                var2_3 = new String[]{" count(*) "};
                var1_2 = this.a().query("reporterror", var2_3, null, null, null, null, null, null);
                var4_4 = var1_2.getCount();
                if (var1_2 == null) return var4_4;
lbl-1000: // 2 sources:
                {
                    do {
                        var1_2.close();
                        return var4_4;
                        break;
                    } while (true);
                }
                {
                    catch (Throwable var6_5) {
                        break block11;
                    }
                    catch (Exception var3_6) {}
                    {
                        var3_6.printStackTrace();
                        var4_4 = 0;
                        if (var1_2 == null) break block12;
                        var4_4 = 0;
                        ** continue;
                    }
                }
            }
            // MONITOREXIT : var7_1
            return var4_4;
        }
        if (var1_2 == null) throw var6_5;
        var1_2.close();
        throw var6_5;
    }
}

