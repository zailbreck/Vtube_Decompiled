/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  f.f.a.e.d.b
 *  f.f.a.e.d.g
 *  f.f.a.e.d.n$a
 *  f.f.a.e.e.a
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.util.List
 */
package f.f.a.e.d;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import f.f.a.e.d.b;
import f.f.a.e.d.g;
import f.f.a.e.d.n;
import java.util.List;

public class n
extends b<f.f.a.m.a> {
    private static n c;

    private n(g g2) {
        super(g2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static n a(g g2) {
        if (c != null) return c;
        Class<n> class_ = n.class;
        synchronized (n.class) {
            if (c != null) return c;
            c = new n(g2);
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return c;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(String string) {
        void var10_2 = this;
        synchronized (var10_2) {
            Cursor cursor;
            block5 : {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SELECT get_time FROM sc WHERE package_name='");
                stringBuilder.append(string);
                stringBuilder.append("'");
                String string2 = stringBuilder.toString();
                cursor = this.a().rawQuery(string2, null);
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
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final long a(f.f.a.e.e.a a2) {
        block8 : {
            void var15_2 = this;
            // MONITORENTER : var15_2
            if (a2 == null) {
                long l2 = 0L;
                // MONITOREXIT : var15_2
                return l2;
            }
            SQLiteDatabase sQLiteDatabase = this.b();
            if (sQLiteDatabase != null) break block8;
            // MONITOREXIT : var15_2
            return -1L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", a2.g());
        contentValues.put("download_url", a2.F());
        contentValues.put("click_mode", a2.G());
        contentValues.put("ttc", Boolean.valueOf((boolean)a2.n1()));
        contentValues.put("get_time", Long.valueOf((long)System.currentTimeMillis()));
        if (n.super.a(a2.g())) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("package_name = '");
            stringBuilder.append(a2.g());
            stringBuilder.append("'");
            String string = stringBuilder.toString();
            return this.b().update("sc", contentValues, string, null);
        }
        long l3 = this.b().insert("sc", null, contentValues);
        // MONITOREXIT : var15_2
        return l3;
        catch (Exception exception) {
            exception.printStackTrace();
            // MONITOREXIT : var15_2
            return -1L;
        }
    }

    public final void a(List<f.f.a.e.e.a> list) {
        void var3_2 = this;
        synchronized (var3_2) {
            block6 : {
                if (list != null) {
                    if (list.size() == 0) {
                        break block6;
                    }
                    new Thread((Runnable)new a((n)this, list)).start();
                    return;
                }
            }
            return;
        }
    }
}

