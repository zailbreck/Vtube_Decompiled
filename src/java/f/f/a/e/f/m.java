/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Set
 */
package f.f.a.e.f;

import android.content.Context;
import android.content.SharedPreferences;
import f.f.a.e.c.a;
import f.f.a.e.e.h;
import java.util.Set;

public class m {
    private static m c;
    private Context a;
    private SharedPreferences b;

    private m(Context context) {
        this.a = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static m a(Context context) {
        if (c != null) return c;
        Class<m> class_ = m.class;
        synchronized (m.class) {
            if (c != null) return c;
            c = new m(context);
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return c;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(Set<h> set) {
        SharedPreferences.Editor editor;
        if (set == null || set.size() < 0) return;
        String string = h.a(set);
        if (this.a == null) return;
        this.b = this.a.getSharedPreferences("installed", 0);
        if (this.b == null || (editor = this.b.edit()) == null) return;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a.i().f());
            stringBuilder.append("_");
            stringBuilder.append("installed");
            editor.putString(stringBuilder.toString(), string);
            editor.apply();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

