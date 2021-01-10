/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.a.a.a.a.h;

import android.util.Log;
import f.a.a.a.a.h.e;

public class d {
    private static boolean a;

    public static void a(String string) {
        d.a("OSS-Android-SDK", string);
    }

    public static void a(String string, String string2) {
        d.a(string, string2, true);
    }

    public static void a(String string, String string2, boolean bl) {
        if (a) {
            Log.d((String)string, (String)"[Debug]: ".concat(string2));
            d.a(string2, bl);
        }
    }

    private static void a(String string, boolean bl) {
        if (bl) {
            e.f().a(string);
        }
    }

    public static void a(Throwable throwable) {
        if (a) {
            e.f().a((Object)throwable);
        }
    }

    public static boolean a() {
        return a;
    }

    public static void b(String string) {
        d.b("OSS-Android-SDK", string);
    }

    public static void b(String string, String string2) {
        d.a(string, string2, true);
    }

    public static void b(String string, String string2, boolean bl) {
        if (a) {
            Log.d((String)string, (String)"[Error]: ".concat(string2));
            d.a(string2, bl);
        }
    }

    public static void b(String string, boolean bl) {
        d.a("OSS-Android-SDK", string, bl);
    }

    public static void c(String string) {
        d.d(string, true);
    }

    public static void c(String string, boolean bl) {
        d.b("OSS-Android-SDK", string, bl);
    }

    public static void d(String string, boolean bl) {
        if (a) {
            Log.i((String)"OSS-Android-SDK", (String)"[INFO]: ".concat(string));
            d.a(string, bl);
        }
    }
}

