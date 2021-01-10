/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.f.a.e.f;

import android.util.Log;
import f.f.a.a;

public final class h {
    public static boolean a = true;
    public static boolean b = true;
    public static boolean c = true;
    public static boolean d = true;
    public static boolean e;

    static {
        if (!a.a) {
            a = false;
            b = false;
            c = false;
            d = false;
            e = false;
        }
    }

    public static void a(String string, String string2) {
        if (a) {
            Log.d((String)string, (String)string2);
        }
    }

    public static void a(String string, String string2, Throwable throwable) {
        if (a) {
            Log.d((String)string, (String)string2, (Throwable)throwable);
        }
    }

    public static void b(String string, String string2) {
        if (b) {
            Log.i((String)string, (String)string2);
        }
    }

    public static void b(String string, String string2, Throwable throwable) {
        if (d && string2 != null && throwable != null) {
            Log.e((String)string, (String)string2, (Throwable)throwable);
        }
    }

    public static void c(String string, String string2) {
        if (c) {
            Log.w((String)string, (String)string2);
        }
    }

    public static void d(String string, String string2) {
        if (d && string2 != null) {
            Log.e((String)string, (String)string2);
        }
    }
}

