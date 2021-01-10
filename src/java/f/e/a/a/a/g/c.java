/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.e.a.a.a.g;

import android.util.Log;

public final class c {
    public static void a(String string) {
    }

    public static void a(String string, Exception exception) {
        if (exception != null) {
            Log.e((String)"OMIDLIB", (String)string, (Throwable)exception);
        }
    }
}

