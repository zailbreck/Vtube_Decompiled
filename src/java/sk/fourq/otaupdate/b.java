/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package sk.fourq.otaupdate;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import l.a.a.a.e.a;

public class b {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean a(String string2, File file) {
        FileInputStream fileInputStream;
        void var5_8;
        void var4_13;
        block13 : {
            void var7_11;
            if (TextUtils.isEmpty((CharSequence)string2)) throw new IllegalArgumentException("checksum or file cannot be empty");
            if (file == null) throw new IllegalArgumentException("checksum or file cannot be empty");
            fileInputStream = null;
            FileInputStream fileInputStream2 = new FileInputStream(file);
            boolean bl = new String(a.a(l.a.a.a.f.a.a((InputStream)fileInputStream2))).equalsIgnoreCase(string2);
            try {
                fileInputStream2.close();
                return bl;
            }
            catch (IOException iOException) {
                throw new IllegalStateException("Cannot close IO stream", (Throwable)iOException);
            }
            catch (Throwable throwable) {
                fileInputStream = fileInputStream2;
                break block13;
            }
            catch (IOException iOException) {
                fileInputStream = fileInputStream2;
                throw new IllegalStateException("Unknown IO error", (Throwable)var7_11);
            }
            catch (FileNotFoundException fileNotFoundException) {
                fileInputStream = fileInputStream2;
                throw new IllegalStateException("File not found", (Throwable)var4_13);
            }
            catch (Throwable throwable) {
                break block13;
            }
            catch (IOException iOException) {
                // empty catch block
            }
            {
                throw new IllegalStateException("Unknown IO error", (Throwable)var7_11);
            }
        }
        if (fileInputStream == null) throw var5_8;
        try {
            fileInputStream.close();
            throw var5_8;
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Cannot close IO stream", (Throwable)iOException);
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileInputStream = null;
            throw new IllegalStateException("File not found", (Throwable)var4_13);
        }
    }
}

