/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayInputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.io.OutputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.e.f;

import f.f.a.e.f.h;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public final class p {
    public static Object a(String string) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string.getBytes("ISO-8859-1"));
            ObjectInputStream objectInputStream = new ObjectInputStream((InputStream)byteArrayInputStream);
            Object object = objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return object;
        }
        catch (Exception exception) {
            h.b("SerializeTools", "Exception", exception);
            return null;
        }
    }

    public static String a(Object object) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream((OutputStream)byteArrayOutputStream);
            objectOutputStream.writeObject(object);
            byte[] arrby = byteArrayOutputStream.toByteArray();
            objectOutputStream.flush();
            objectOutputStream.close();
            String string = new String(arrby, "ISO-8859-1");
            return string;
        }
        catch (IOException iOException) {
            h.b("SerializeTools", "IOException", iOException);
            return "";
        }
    }
}

