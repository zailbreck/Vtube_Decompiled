/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.ContentResolver
 *  android.content.ContentUris
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.provider.DocumentsContract
 *  android.provider.MediaStore
 *  android.provider.MediaStore$Audio
 *  android.provider.MediaStore$Audio$Media
 *  android.provider.MediaStore$Images
 *  android.provider.MediaStore$Images$Media
 *  android.provider.MediaStore$Video
 *  android.provider.MediaStore$Video$Media
 *  android.text.TextUtils
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package io.flutter.plugins.imagepicker;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.InputStream;
import java.io.OutputStream;

class FileUtils {
    FileUtils() {
    }

    private static void copy(InputStream inputStream, OutputStream outputStream) {
        int n2;
        byte[] arrby = new byte[4096];
        while ((n2 = inputStream.read(arrby)) != -1) {
            outputStream.write(arrby, 0, n2);
        }
        outputStream.flush();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static String getDataColumn(Context context, Uri uri, String string2, String[] arrstring) {
        Cursor cursor;
        void var5_10;
        block7 : {
            block5 : {
                int n2;
                block6 : {
                    String[] arrstring2 = new String[]{"_data"};
                    cursor = context.getContentResolver().query(uri, arrstring2, string2, arrstring, null);
                    if (cursor == null) break block5;
                    try {
                        if (!cursor.moveToFirst()) break block5;
                        n2 = cursor.getColumnIndex("_data");
                        if (n2 != -1) break block6;
                        if (cursor == null) return null;
                    }
                    catch (Throwable throwable) {}
                    cursor.close();
                    return null;
                }
                String string3 = cursor.getString(n2);
                if (cursor == null) return string3;
                cursor.close();
                return string3;
                break block7;
            }
            if (cursor == null) return null;
            cursor.close();
            return null;
            catch (Throwable throwable) {
                cursor = null;
            }
        }
        if (cursor == null) throw var5_10;
        cursor.close();
        throw var5_10;
    }

    @SuppressLint(value={"NewApi"})
    private String getPathFromLocalUri(Context context, Uri uri) {
        boolean bl = Build.VERSION.SDK_INT >= 19;
        if (bl && DocumentsContract.isDocumentUri((Context)context, (Uri)uri)) {
            if (FileUtils.isExternalStorageDocument(uri)) {
                String[] arrstring = DocumentsContract.getDocumentId((Uri)uri).split(":");
                if ("primary".equalsIgnoreCase(arrstring[0])) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((Object)Environment.getExternalStorageDirectory());
                    stringBuilder.append("/");
                    stringBuilder.append(arrstring[1]);
                    return stringBuilder.toString();
                }
            } else if (FileUtils.isDownloadsDocument(uri)) {
                String string2 = DocumentsContract.getDocumentId((Uri)uri);
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    try {
                        String string3 = FileUtils.getDataColumn(context, ContentUris.withAppendedId((Uri)Uri.parse((String)Environment.DIRECTORY_DOWNLOADS), (long)Long.valueOf((String)string2)), null, null);
                        return string3;
                    }
                    catch (NumberFormatException numberFormatException) {
                        return null;
                    }
                }
            } else if (FileUtils.isMediaDocument(uri)) {
                Uri uri2;
                String[] arrstring = DocumentsContract.getDocumentId((Uri)uri).split(":");
                String string4 = arrstring[0];
                if ("image".equals((Object)string4)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals((Object)string4)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else {
                    boolean bl2 = "audio".equals((Object)string4);
                    uri2 = null;
                    if (bl2) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                }
                String[] arrstring2 = new String[]{arrstring[1]};
                return FileUtils.getDataColumn(context, uri2, "_id=?", arrstring2);
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (FileUtils.isGooglePhotosUri(uri)) {
                    return null;
                }
                return FileUtils.getDataColumn(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    private static String getPathFromRemoteUri(Context var0, Uri var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl94 : ACONST_NULL : trying to set 1 previously set to 0
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

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals((Object)uri.getAuthority());
    }

    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals((Object)uri.getAuthority());
    }

    private static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.contentprovider".equals((Object)uri.getAuthority());
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals((Object)uri.getAuthority());
    }

    String getPathFromUri(Context context, Uri uri) {
        String string2 = FileUtils.super.getPathFromLocalUri(context, uri);
        if (string2 == null) {
            string2 = FileUtils.getPathFromRemoteUri(context, uri);
        }
        return string2;
    }
}

