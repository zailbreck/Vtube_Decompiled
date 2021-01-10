/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  f.f.a.j.a.c
 *  f.f.a.j.r
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.j.a;

import android.text.TextUtils;
import f.f.a.j.a.c;
import f.f.a.j.r;

public final class g
implements c {
    public final String b(String string) {
        int n2 = string.lastIndexOf(46);
        int n3 = string.lastIndexOf(47);
        String string2 = n2 != -1 && n2 > n3 && 4 + (n2 + 2) > string.length() ? string.substring(n2 + 1, string.length()) : "";
        String string3 = r.d((String)string);
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return string3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(".");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

