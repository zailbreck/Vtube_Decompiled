/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.e.f;

import android.net.Uri;
import android.text.TextUtils;

public final class t {
    public static String a(String string) {
        try {
            if (!TextUtils.isEmpty((CharSequence)string)) {
                String string2 = Uri.parse((String)string).getPath();
                return string2;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return "url";
    }
}

