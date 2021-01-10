/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  f.f.a.e.d.b
 *  f.f.a.e.d.g
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.f.a.e.d;

import android.database.sqlite.SQLiteDatabase;
import f.f.a.e.d.b;
import f.f.a.e.d.g;

public class o
extends b {
    private static o c;

    private o(g g2) {
        super(g2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static o a(g g2) {
        if (c != null) return c;
        Class<o> class_ = o.class;
        synchronized (o.class) {
            if (c != null) return c;
            c = new o(g2);
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
                int n2 = this.b().delete("settingCampaign", "id=?", arrstring);
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
}

