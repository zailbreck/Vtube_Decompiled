/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.Matrix
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 */
package m.a.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import m.a.a.a;
import m.a.a.d;

class c {
    private d a;
    private File b;
    private int c;
    private int d;
    private boolean e;

    c(d d2, File file, boolean bl) {
        this.b = file;
        this.a = d2;
        this.e = bl;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        BitmapFactory.decodeStream((InputStream)d2.a(), null, (BitmapFactory.Options)options);
        this.c = options.outWidth;
        this.d = options.outHeight;
    }

    private Bitmap a(Bitmap bitmap, int n2) {
        Matrix matrix = new Matrix();
        matrix.postRotate((float)n2);
        return Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)bitmap.getWidth(), (int)bitmap.getHeight(), (Matrix)matrix, (boolean)true);
    }

    private int b() {
        int n2 = this.c;
        if (n2 % 2 == 1) {
            ++n2;
        }
        this.c = n2;
        int n3 = this.d;
        if (n3 % 2 == 1) {
            ++n3;
        }
        this.d = n3;
        int n4 = Math.max((int)this.c, (int)this.d);
        float f2 = (float)Math.min((int)this.c, (int)this.d) / (float)n4;
        if (f2 <= 1.0f && (double)f2 > 0.5625) {
            if (n4 < 1664) {
                return 1;
            }
            if (n4 < 4990) {
                return 2;
            }
            if (n4 > 4990 && n4 < 10240) {
                return 4;
            }
            int n5 = n4 / 1280;
            if (n5 == 0) {
                n5 = 1;
            }
            return n5;
        }
        double d2 = f2;
        if (d2 <= 0.5625 && d2 > 0.5) {
            int n6 = n4 / 1280;
            if (n6 == 0) {
                n6 = 1;
            }
            return n6;
        }
        double d3 = n4;
        Double.isNaN((double)d2);
        double d4 = 1280.0 / d2;
        Double.isNaN((double)d3);
        return (int)Math.ceil((double)(d3 / d4));
    }

    File a() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = this.b();
        Bitmap bitmap = BitmapFactory.decodeStream((InputStream)this.a.a(), null, (BitmapFactory.Options)options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (a.c.b(this.a.a())) {
            bitmap = this.a(bitmap, a.c.a(this.a.a()));
        }
        Bitmap.CompressFormat compressFormat = this.e ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        bitmap.compress(compressFormat, 60, (OutputStream)byteArrayOutputStream);
        bitmap.recycle();
        FileOutputStream fileOutputStream = new FileOutputStream(this.b);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.flush();
        fileOutputStream.close();
        byteArrayOutputStream.close();
        return this.b;
    }
}

