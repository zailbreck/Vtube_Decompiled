/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Environment
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.Enumeration
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipFile
 */
package f.f.a.e.f;

import android.content.Context;
import android.os.Environment;
import f.f.a.a;
import f.f.a.e.b.c.c;
import f.f.a.e.b.c.e;
import f.f.a.e.f.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class f {
    public static File a(String string, Context context, boolean[] arrbl) {
        if (Environment.getExternalStorageState().equals((Object)"mounted")) {
            String string2 = e.b(c.i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("/download/.mtg");
            stringBuilder.append(string);
            File file = new File(stringBuilder.toString());
            file.mkdirs();
            if (file.exists()) {
                arrbl[0] = true;
                return file;
            }
        }
        String string3 = context.getCacheDir().getAbsolutePath();
        new File(string3).mkdir();
        f.a(string3, 505, -1, -1);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append("/mtgdownload");
        String string4 = stringBuilder.toString();
        new File(string4).mkdir();
        f.a(string4, 505, -1, -1);
        File file = new File(string4);
        arrbl[0] = false;
        return file;
    }

    /*
     * Exception decompiling
     */
    public static String a(File var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl64 : ALOAD_2 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String a(String string, String string2) {
        void var10_19;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        block38 : {
            String string3;
            block43 : {
                void var8_23;
                block39 : {
                    block42 : {
                        ZipFile zipFile;
                        Enumeration enumeration;
                        File file;
                        if (string == null) return "unzip srcFile or destDir is null ";
                        if (string2 == null) {
                            return "unzip srcFile or destDir is null ";
                        }
                        if (!string2.endsWith("/")) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(string2);
                            stringBuilder.append("/");
                            string2 = stringBuilder.toString();
                        }
                        if (!(file = new File(string)).exists()) {
                            return "unzip file not exists";
                        }
                        inputStream = null;
                        try {
                            zipFile = new ZipFile(file);
                            enumeration = zipFile.entries();
                            fileOutputStream = null;
                        }
                        catch (Throwable throwable) {
                            fileOutputStream = null;
                            inputStream = null;
                            break block38;
                        }
                        catch (IOException iOException) {
                            fileOutputStream = null;
                            break block39;
                        }
                        do {
                            ZipEntry zipEntry;
                            block40 : {
                                block41 : {
                                    if (!enumeration.hasMoreElements()) break;
                                    zipEntry = (ZipEntry)enumeration.nextElement();
                                    if (zipEntry != null) break block40;
                                    if (inputStream == null) break block41;
                                    try {
                                        inputStream.close();
                                    }
                                    catch (IOException iOException) {
                                        iOException.printStackTrace();
                                    }
                                }
                                if (fileOutputStream == null) return "unzip zipEntry is null";
                                try {
                                    fileOutputStream.close();
                                    return "unzip zipEntry is null";
                                }
                                catch (IOException iOException) {
                                    iOException.printStackTrace();
                                }
                                return "unzip zipEntry is null";
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(string2);
                            stringBuilder.append(zipEntry.getName());
                            File file2 = new File(stringBuilder.toString());
                            if (zipEntry.isDirectory()) {
                                file2.mkdirs();
                                continue;
                            }
                            if (!file2.getParentFile().exists()) {
                                file2.getParentFile().mkdirs();
                            }
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                            try {
                                int n2;
                                inputStream = zipFile.getInputStream(zipEntry);
                                byte[] arrby = new byte[1024];
                                while ((n2 = inputStream.read(arrby, 0, 1024)) != -1) {
                                    fileOutputStream2.write(arrby, 0, n2);
                                    fileOutputStream2.flush();
                                }
                            }
                            catch (IOException iOException) {}
                            finally {
                                fileOutputStream = fileOutputStream2;
                                continue;
                            }
                            break;
                        } while (true);
                        zipFile.close();
                        if (inputStream == null) break block42;
                        try {
                            inputStream.close();
                        }
                        catch (IOException iOException) {
                            iOException.printStackTrace();
                        }
                    }
                    if (fileOutputStream == null) return "";
                    try {
                        fileOutputStream.close();
                        return "";
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                    }
                    return "";
                    catch (IOException iOException) {}
                }
                if (a.a) {
                    var8_23.printStackTrace();
                }
                string3 = var8_23.getMessage();
                if (inputStream == null) break block43;
                try {
                    inputStream.close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
            if (fileOutputStream == null) return string3;
            try {
                fileOutputStream.close();
                return string3;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            return string3;
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        if (fileOutputStream == null) throw var10_19;
        try {
            fileOutputStream.close();
            throw var10_19;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        throw var10_19;
    }

    public static boolean a(String string) {
        if (f.f.a.e.b.d.e.a(string)) {
            return false;
        }
        File file = new File(string);
        boolean bl = file.exists();
        boolean bl2 = false;
        if (bl) {
            boolean bl3 = file.isFile();
            bl2 = false;
            if (bl3) {
                bl2 = true;
            }
        }
        return bl2;
    }

    private static boolean a(String string, int n2, int n3, int n4) {
        void var4_13;
        try {
            Class class_ = Class.forName((String)"android.os.FileUtils");
            Class[] arrclass = new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE};
            Method method = class_.getMethod("setPermissions", arrclass);
            Object[] arrobject = new Object[]{string, n2, -1, -1};
            method.invoke(null, arrobject);
            return true;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
        }
        catch (NoSuchMethodException noSuchMethodException) {
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        h.a("CommonFileUtil", "error when set permissions:", (Throwable)var4_13);
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean a(byte[] var0_1, File var1) {
        block15 : {
            var2_2 = null;
            var7_3 = var1.getParentFile();
            var2_2 = null;
            if (var7_3 != null) {
                var8_4 = var1.exists();
                var2_2 = null;
                if (!var8_4) {
                    var1.getParentFile().mkdirs();
                }
            }
            var10_5 = new FileOutputStream(var1);
            var10_5.write(var0_1);
            try {
                var10_5.close();
                return true;
            }
            catch (IOException var11_6) {
                var11_6.printStackTrace();
            }
            return true;
            catch (Throwable var5_7) {
                var2_2 = var10_5;
                break block15;
            }
            catch (Exception var3_10) {
                var2_2 = var10_5;
                ** GOTO lbl-1000
            }
            catch (Throwable var5_8) {
                break block15;
            }
            catch (Exception var3_11) {
                // empty catch block
            }
lbl-1000: // 2 sources:
            {
                var3_12.printStackTrace();
                if (var2_2 == null) return false;
            }
            try {
                var2_2.close();
                return false;
            }
            catch (IOException var4_13) {
                var4_13.printStackTrace();
            }
            return false;
        }
        if (var2_2 == null) throw var5_9;
        try {
            var2_2.close();
            throw var5_9;
        }
        catch (IOException var6_14) {
            var6_14.printStackTrace();
        }
        throw var5_9;
    }

    public static String b(File file) {
        String string;
        block9 : {
            block10 : {
                block8 : {
                    string = "";
                    if (!file.isFile()) break block8;
                    file.delete();
                    return string;
                }
                if (!file.isDirectory()) break block9;
                File[] arrfile = file.listFiles();
                if (arrfile == null) break block10;
                if (arrfile.length == 0) break block10;
                int n2 = arrfile.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    f.b(arrfile[i2]);
                }
                file.delete();
                return string;
            }
            try {
                file.delete();
                return string;
            }
            catch (Exception exception) {
                string = exception.getMessage();
            }
        }
        return string;
    }
}

