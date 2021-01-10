/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 */
package l.a.a.a.f;

import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a {
    public static MessageDigest a() {
        return a.a("SHA-256");
    }

    public static MessageDigest a(String string2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance((String)string2);
            return messageDigest;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new IllegalArgumentException((Throwable)noSuchAlgorithmException);
        }
    }

    public static byte[] a(InputStream inputStream) {
        return a.a(a.a(), inputStream);
    }

    public static byte[] a(MessageDigest messageDigest, InputStream inputStream) {
        a.b(messageDigest, inputStream);
        return messageDigest.digest();
    }

    public static MessageDigest b(MessageDigest messageDigest, InputStream inputStream) {
        int n2;
        byte[] arrby = new byte[1024];
        while ((n2 = inputStream.read(arrby, 0, 1024)) > -1) {
            messageDigest.update(arrby, 0, n2);
        }
        return messageDigest;
    }
}

