/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.URLEncoder
 */
package f.a.a.a.a.h.g;

import java.net.URLEncoder;

public class e {
    public static String a(String string, String string2) {
        if (string == null) {
            return "";
        }
        try {
            String string3 = URLEncoder.encode((String)string, (String)string2).replace((CharSequence)"+", (CharSequence)"%20").replace((CharSequence)"*", (CharSequence)"%2A").replace((CharSequence)"%7E", (CharSequence)"~").replace((CharSequence)"%2F", (CharSequence)"/");
            return string3;
        }
        catch (Exception exception) {
            throw new IllegalArgumentException("failed to encode url!", (Throwable)exception);
        }
    }
}

