/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  f.f.a.e.f.h
 *  f.f.a.p.a
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.Locale
 */
package f.f.a.e.f;

import android.text.TextUtils;
import f.f.a.e.f.h;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public class a
implements f.f.a.p.a {
    public static String a(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        try {
            h.a((String)"MD5", (String)string);
            MessageDigest messageDigest = MessageDigest.getInstance((String)"MD5");
            messageDigest.reset();
            messageDigest.update(string.getBytes());
            String string2 = a.a(messageDigest.digest());
            return string2;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return "";
        }
    }

    private static String a(byte[] arrby) {
        StringBuilder stringBuilder = new StringBuilder(2 * arrby.length);
        for (byte by : arrby) {
            stringBuilder.append(Integer.toHexString((int)((by & 240) >>> 4)));
            stringBuilder.append(Integer.toHexString((int)(by & 15)));
        }
        return stringBuilder.toString().toLowerCase(Locale.US);
    }

    public static String b(String string) {
        try {
            h.a((String)"MD5", (String)string);
            MessageDigest messageDigest = MessageDigest.getInstance((String)"MD5");
            messageDigest.reset();
            messageDigest.update(string.getBytes());
            String string2 = a.b(messageDigest.digest());
            return string2;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return "";
        }
    }

    private static String b(byte[] arrby) {
        StringBuilder stringBuilder = new StringBuilder(2 * arrby.length);
        for (byte by : arrby) {
            stringBuilder.append(Integer.toHexString((int)((by & 240) >>> 4)));
            stringBuilder.append(Integer.toHexString((int)(by & 15)));
        }
        return stringBuilder.toString().toUpperCase(Locale.US);
    }
}

