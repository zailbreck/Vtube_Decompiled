/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.nio.MappedByteBuffer
 *  java.nio.channels.FileChannel
 *  java.nio.channels.FileChannel$MapMode
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 */
package f.f.a.e.f;

import f.f.a.e.f.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class e {
    private static String a = "CommonFileMD5";
    protected static char[] b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    protected static MessageDigest c = null;

    static {
        try {
            c = MessageDigest.getInstance((String)"MD5");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            PrintStream printStream = System.err;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(e.class.getName());
            stringBuilder.append("\u521d\u59cb\u5316\u5931\u8d25\uff0cMessageDigest\u4e0d\u652f\u6301MD5Util.");
            printStream.println(stringBuilder.toString());
            noSuchAlgorithmException.printStackTrace();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String a(File var0) {
        block7 : {
            var1_1 = null;
            var2_2 = new FileInputStream(var0);
            try {
                var5_3 = var2_2.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, var0.length());
                e.c.update((ByteBuffer)var5_3);
                var6_4 = e.c.digest();
                var7_5 = e.a(var6_4, 0, var6_4.length);
            }
            catch (Throwable var4_6) {
                break block7;
            }
            catch (Exception var3_9) {
                var1_1 = var2_2;
                ** GOTO lbl-1000
            }
            var2_2.close();
            return var7_5;
            catch (Throwable var4_7) {
                var2_2 = var1_1;
                break block7;
            }
            catch (Exception var3_10) {
                // empty catch block
            }
lbl-1000: // 2 sources:
            {
                h.b(e.a, "FILE EXCEPTION", (Throwable)var3_11);
                if (var1_1 == null) return "";
            }
            var1_1.close();
            return "";
        }
        if (var2_2 == null) throw var4_8;
        var2_2.close();
        throw var4_8;
    }

    private static String a(byte[] arrby, int n2, int n3) {
        StringBuffer stringBuffer = new StringBuffer(n3 * 2);
        int n4 = n3 + n2;
        while (n2 < n4) {
            byte by = arrby[n2];
            char[] arrc = b;
            char c2 = arrc[(by & 240) >> 4];
            char c3 = arrc[by & 15];
            stringBuffer.append(c2);
            stringBuffer.append(c3);
            ++n2;
        }
        return stringBuffer.toString();
    }
}

