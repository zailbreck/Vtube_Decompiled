/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.regex.Pattern
 */
package f.f.a.k.g;

import android.net.Uri;
import android.text.TextUtils;
import f.f.a.k.g.g;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public final class l {
    private static final String[] a = new String[]{"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};
    private static final Pattern b;
    private static final Pattern c;
    private static final Pattern d;
    private static Map<String, String> e;

    static {
        Pattern.compile((String)"hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");
        b = Pattern.compile((String)"mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");
        c = Pattern.compile((String)"ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");
        d = Pattern.compile((String)"mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");
        e = new HashMap();
        for (g g2 : g.values()) {
            e.put((Object)g2.a(), (Object)g2.b());
        }
    }

    public static boolean a(String string2) {
        String[] arrstring = a;
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!arrstring[i2].equals((Object)string2)) continue;
            return true;
        }
        return false;
    }

    public static Pattern b(String string2) {
        if ("wv_hybrid:".equals((Object)string2)) {
            return d;
        }
        if ("mraid:".equals((Object)string2)) {
            return b;
        }
        if ("ssp:".equals((Object)string2)) {
            return c;
        }
        if ("mvb_hybrid:".equals((Object)string2)) {
            return d;
        }
        return null;
    }

    public static String c(String string2) {
        char[] arrc = new char[]{'\'', '\\'};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            char c2;
            int n2;
            block5 : {
                c2 = string2.charAt(i2);
                n2 = 1;
                if (c2 > '\u00ff') {
                    stringBuffer.append("\\u");
                    String string3 = Integer.toHexString((int)(c2 >>> 8)).toUpperCase();
                    if (string3.length() == n2) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(string3);
                    String string4 = Integer.toHexString((int)(c2 & 255)).toUpperCase();
                    if (string4.length() == n2) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(string4);
                    continue;
                }
                int n3 = arrc.length;
                for (int i3 = 0; i3 < n3; ++i3) {
                    if (arrc[i3] != c2) continue;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("\\");
                    stringBuilder.append(c2);
                    stringBuffer.append(stringBuilder.toString());
                    break block5;
                }
                n2 = 0;
            }
            if (n2 != 0) continue;
            stringBuffer.append(c2);
        }
        return new String(stringBuffer);
    }

    public static boolean d(String string2) {
        return l.e(string2).startsWith("image");
    }

    public static String e(String string2) {
        String string3 = l.f(string2);
        String string4 = (String)e.get((Object)string3);
        if (string4 == null) {
            string4 = "";
        }
        return string4;
    }

    private static String f(String string2) {
        int n2;
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return "";
        }
        String string3 = Uri.parse((String)string2).getPath();
        if (string3 != null && (n2 = string3.lastIndexOf(".")) != -1) {
            return string3.substring(n2 + 1);
        }
        return "";
    }
}

