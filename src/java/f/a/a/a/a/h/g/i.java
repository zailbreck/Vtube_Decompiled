/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package f.a.a.a.a.h.g;

import android.os.Build;
import f.a.a.a.a.h.d;
import f.a.a.a.a.h.g.e;
import f.a.a.a.a.h.g.h;

public class i {
    private static String a;

    private static String a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        stringBuilder.append(System.getProperty((String)"os.name"));
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("/Android ");
        stringBuilder2.append(Build.VERSION.RELEASE);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("/");
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(e.a(Build.MODEL, "utf-8"));
        stringBuilder3.append(";");
        stringBuilder3.append(e.a(Build.ID, "utf-8"));
        stringBuilder.append(stringBuilder3.toString());
        stringBuilder.append(")");
        String string = stringBuilder.toString();
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("user agent : ");
        stringBuilder4.append(string);
        d.a(stringBuilder4.toString());
        if (h.c(string)) {
            string = System.getProperty((String)"http.agent").replaceAll("[^\\p{ASCII}]", "?");
        }
        return string;
    }

    public static String a(String string) {
        if (h.c(a)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("aliyun-sdk-android/");
            stringBuilder.append(i.b());
            stringBuilder.append(i.a());
            a = stringBuilder.toString();
        }
        if (h.c(string)) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        stringBuilder.append("/");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static String b() {
        return "2.9.5";
    }
}

