/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.d$a
 *  f.d.b.d$b
 *  f.d.b.d$c
 *  f.d.b.d$d
 *  f.d.b.d$e
 *  f.d.b.d$f
 *  f.d.b.e
 *  java.lang.Character
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.d.b;

import f.d.b.d;

public abstract class d
extends Enum<d>
implements f.d.b.e {
    public static final /* enum */ d b = new a("IDENTITY", 0);
    public static final /* enum */ d c = new b("UPPER_CAMEL_CASE", 1);
    public static final /* enum */ d d = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2);
    public static final /* enum */ d e = new d("LOWER_CASE_WITH_UNDERSCORES", 3);
    public static final /* enum */ d f = new e("LOWER_CASE_WITH_DASHES", 4);
    public static final /* enum */ d g = new f("LOWER_CASE_WITH_DOTS", 5);
    private static final /* synthetic */ d[] h;

    static {
        d[] arrd = new d[]{b, c, d, e, f, g};
        h = arrd;
    }

    private d() {
    }

    /* synthetic */ d(String string, int n2, a a2) {
    }

    static String a(String string) {
        int n2;
        int n3 = string.length() - 1;
        for (n2 = 0; !Character.isLetter((char)string.charAt(n2)) && n2 < n3; ++n2) {
        }
        char c2 = string.charAt(n2);
        if (Character.isUpperCase((char)c2)) {
            return string;
        }
        char c3 = Character.toUpperCase((char)c2);
        if (n2 == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c3);
            stringBuilder.append(string.substring(1));
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string.substring(0, n2));
        stringBuilder.append(c3);
        stringBuilder.append(string.substring(n2 + 1));
        return stringBuilder.toString();
    }

    static String a(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (Character.isUpperCase((char)c2) && stringBuilder.length() != 0) {
                stringBuilder.append(string2);
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static d valueOf(String string) {
        return (d)Enum.valueOf(d.class, (String)string);
    }

    public static d[] values() {
        return (d[])h.clone();
    }
}

