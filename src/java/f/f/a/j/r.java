/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Log
 *  android.webkit.MimeTypeMap
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.Throwable
 *  java.net.URLDecoder
 *  java.net.URLEncoder
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 */
package f.f.a.j;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import f.f.a.j.o;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class r {
    public static final String a = "r";

    static String a(String string) {
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        String string2 = MimeTypeMap.getFileExtensionFromUrl((String)string);
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(string2);
    }

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
                return;
            }
            catch (IOException iOException) {
                Log.e((String)a, (String)"Error closing resource", (Throwable)iOException);
            }
        }
    }

    static void a(byte[] arrby, long l2, int n2) {
        o.a(arrby, "Buffer must be not null!");
        boolean bl = true;
        boolean bl2 = l2 >= 0L;
        o.a(bl2, "Data offset must be positive!");
        if (n2 < 0 || n2 > arrby.length) {
            bl = false;
        }
        o.a(bl, "Length must be in range [0..buffer.length]");
    }

    static String b(String string) {
        try {
            String string2 = URLEncoder.encode((String)string, (String)"utf-8");
            return string2;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException("Error encoding url", (Throwable)unsupportedEncodingException);
        }
    }

    static String c(String string) {
        try {
            String string2 = URLDecoder.decode((String)string, (String)"utf-8");
            return string2;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException("Error decoding url", (Throwable)unsupportedEncodingException);
        }
    }

    public static String d(String string) {
        byte[] arrby = MessageDigest.getInstance((String)"MD5").digest(string.getBytes());
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = arrby.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = arrby[i2];
            Object[] arrobject = new Object[]{by};
            stringBuffer.append(String.format((String)"%02x", (Object[])arrobject));
        }
        try {
            String string2 = stringBuffer.toString();
            return string2;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            IllegalStateException illegalStateException;
            illegalStateException = new IllegalStateException((Throwable)noSuchAlgorithmException);
            throw illegalStateException;
        }
    }
}

