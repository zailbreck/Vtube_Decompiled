/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.e.a.a.b.j;

import android.text.TextUtils;
import android.util.Log;
import f.e.a.a.b.d;

public final class c {
    public static void a(String string) {
        if (d.a.booleanValue() && !TextUtils.isEmpty((CharSequence)string)) {
            Log.i((String)"OMIDLIB", (String)string);
        }
    }

    public static void a(String string, Exception exception) {
        if (d.a.booleanValue() && !TextUtils.isEmpty((CharSequence)string) || exception != null) {
            Log.e((String)"OMIDLIB", (String)string, (Throwable)exception);
        }
    }
}

