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
 */
package f.f.a.e.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import f.f.a.e.f.h;

public class a {
    public static final String b = "a";
    private static a c;
    SharedPreferences a;

    private a() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a a() {
        if (c != null) return c;
        Class<a> class_ = a.class;
        synchronized (a.class) {
            if (c != null) return c;
            c = new a();
            // ** MonitorExit[var1] (shouldn't be in output)
            return c;
        }
    }

    public final int a(String string, int n2) {
        Context context;
        block5 : {
            try {
                context = f.f.a.e.c.a.i().e();
                if (context != null) break block5;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return n2;
            }
            h.d(b, "context is null in get");
            return n2;
        }
        if (this.a == null) {
            this.a = context.getSharedPreferences("mintegral", 0);
        }
        int n3 = this.a.getInt(string, n2);
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String a(String string) {
        Context context;
        block5 : {
            try {
                context = f.f.a.e.c.a.i().e();
                if (context != null) break block5;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return null;
            }
            h.d(b, "context is null in get");
            return null;
        }
        if (this.a != null) return this.a.getString(string, "");
        if (context == null) return this.a.getString(string, "");
        this.a = context.getSharedPreferences("mintegral", 0);
        return this.a.getString(string, "");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string, String string2) {
        try {
            Context context = f.f.a.e.c.a.i().e();
            if (context == null) {
                h.d(b, "context is null in put");
                return;
            }
            if (this.a == null && context != null) {
                this.a = context.getSharedPreferences("mintegral", 0);
            }
            SharedPreferences.Editor editor = this.a.edit();
            editor.putString(string, string2);
            editor.apply();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public final void b(String string) {
        Context context = f.f.a.e.c.a.i().e();
        if (context == null) {
            h.d(b, "context is null in put");
            return;
        }
        if (this.a == null && context != null) {
            this.a = context.getSharedPreferences("mintegral", 0);
        }
        this.a.edit().remove(string).apply();
    }
}

