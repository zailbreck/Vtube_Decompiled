/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Object
 *  java.lang.String
 */
package f.a.a.a.a.h.g;

import android.util.Base64;

public class a {
    public static String a(byte[] arrby) {
        return new String(Base64.encode((byte[])arrby, (int)0)).trim();
    }
}

