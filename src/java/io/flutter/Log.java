/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package io.flutter;

public class Log {
    private static int logLevel = 3;

    public static void d(String string2, String string3) {
    }

    public static void d(String string2, String string3, Throwable throwable) {
    }

    public static void e(String string2, String string3) {
        android.util.Log.e((String)string2, (String)string3);
    }

    public static void e(String string2, String string3, Throwable throwable) {
        android.util.Log.e((String)string2, (String)string3, (Throwable)throwable);
    }

    public static void i(String string2, String string3) {
    }

    public static void i(String string2, String string3, Throwable throwable) {
    }

    public static void setLogLevel(int n2) {
        logLevel = n2;
    }

    public static void v(String string2, String string3) {
    }

    public static void v(String string2, String string3, Throwable throwable) {
    }

    public static void w(String string2, String string3) {
        android.util.Log.w((String)string2, (String)string3);
    }

    public static void w(String string2, String string3, Throwable throwable) {
        android.util.Log.w((String)string2, (String)string3, (Throwable)throwable);
    }

    public static void wtf(String string2, String string3) {
        android.util.Log.wtf((String)string2, (String)string3);
    }

    public static void wtf(String string2, String string3, Throwable throwable) {
        android.util.Log.wtf((String)string2, (String)string3, (Throwable)throwable);
    }
}

