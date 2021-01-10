/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.BitmapFactory
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package io.flutter.plugins.imagepicker;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import io.flutter.plugins.imagepicker.ExifDataCopier;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class ImageResizer {
    private final ExifDataCopier exifDataCopier;
    private final File externalFilesDirectory;

    ImageResizer(File file, ExifDataCopier exifDataCopier) {
        this.externalFilesDirectory = file;
        this.exifDataCopier = exifDataCopier;
    }

    /*
     * Enabled aggressive block sorting
     */
    private File resizedImage(String string2, Double d2, Double d3) {
        Double d4;
        Double d5;
        Bitmap bitmap;
        block3 : {
            double d6;
            block5 : {
                double d7;
                double d8;
                block8 : {
                    double d9;
                    block6 : {
                        block7 : {
                            boolean bl;
                            block4 : {
                                bitmap = BitmapFactory.decodeFile((String)string2);
                                double d10 = bitmap.getWidth();
                                Double.isNaN((double)d10);
                                d7 = d10 * 1.0;
                                double d11 = bitmap.getHeight();
                                Double.isNaN((double)d11);
                                d8 = d11 * 1.0;
                                boolean bl2 = d2 != null;
                                bl = d3 != null;
                                double d12 = bl2 ? Math.min((double)d7, (double)d2) : d7;
                                d4 = d12;
                                double d13 = bl ? Math.min((double)d8, (double)d3) : d8;
                                d5 = d13;
                                boolean bl3 = bl2 && d2 < d7;
                                boolean bl4 = bl && d3 < d8;
                                boolean bl5 = bl3 || bl4;
                                if (!bl5) break block3;
                                d9 = d7 * (d5 / d8);
                                d6 = d8 * (d4 / d7);
                                if (!(d4 < d5)) break block4;
                                if (bl2) break block5;
                                break block6;
                            }
                            if (!(d5 < d4)) break block7;
                            if (bl) break block6;
                            break block5;
                        }
                        if (!(d7 < d8)) break block8;
                    }
                    d4 = d9;
                    break block3;
                }
                if (!(d8 < d7)) break block3;
            }
            d5 = d6;
        }
        Bitmap bitmap2 = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)d4.intValue(), (int)d5.intValue(), (boolean)false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap.CompressFormat compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        bitmap2.compress(compressFormat, 100, (OutputStream)byteArrayOutputStream);
        String[] arrstring = string2.split("/");
        String string3 = arrstring[arrstring.length - 1];
        File file = this.externalFilesDirectory;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/scaled_");
        stringBuilder.append(string3);
        File file2 = new File(file, stringBuilder.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        return file2;
    }

    String resizeImageIfNeeded(String string2, Double d2, Double d3) {
        boolean bl = d2 != null || d3 != null;
        if (!bl) {
            return string2;
        }
        try {
            File file = ImageResizer.super.resizedImage(string2, d2, d3);
            this.exifDataCopier.copyExif(string2, file.getPath());
            String string3 = file.getPath();
            return string3;
        }
        catch (IOException iOException) {
            throw new RuntimeException((Throwable)iOException);
        }
    }
}

