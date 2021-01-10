/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.e.f;

import android.text.TextUtils;

public final class r {
    public static boolean a(String string) {
        return string == null || TextUtils.isEmpty((CharSequence)string.trim()) || "null".equals((Object)string);
        {
        }
    }

    public static boolean b(String string) {
        return string != null && !TextUtils.isEmpty((CharSequence)string.trim()) && !"null".equals((Object)string);
        {
        }
    }
}

