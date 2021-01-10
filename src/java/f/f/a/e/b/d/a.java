/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  java.io.ByteArrayInputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 */
package f.f.a.e.b.d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import f.f.a.e.b.d.b;
import f.f.a.e.f.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class a {
    public static Bitmap a(String string) {
        boolean bl = f.a(string);
        Bitmap bitmap = null;
        if (bl) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            try {
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile((String)string, (BitmapFactory.Options)options);
                options.inJustDecodeBounds = false;
                options.inPurgeable = true;
                options.inInputShareable = true;
                options.inDither = true;
                Bitmap bitmap2 = BitmapFactory.decodeFile((String)string, (BitmapFactory.Options)options);
                return bitmap2;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return null;
            }
            catch (OutOfMemoryError outOfMemoryError) {
                outOfMemoryError.printStackTrace();
                System.gc();
                b.b();
                try {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    bitmap = BitmapFactory.decodeFile((String)string, (BitmapFactory.Options)options);
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    return bitmap;
                }
                catch (OutOfMemoryError outOfMemoryError2) {
                    outOfMemoryError2.printStackTrace();
                }
            }
        }
        return bitmap;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static InputStream a(Bitmap bitmap) {
        void var2_9;
        ByteArrayOutputStream byteArrayOutputStream;
        block15 : {
            block14 : {
                byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)byteArrayOutputStream);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                try {
                    byteArrayOutputStream.close();
                    return byteArrayInputStream;
                }
                catch (Exception exception) {
                    if (!f.f.a.a.a) return byteArrayInputStream;
                    exception.printStackTrace();
                    return byteArrayInputStream;
                }
                catch (Exception exception) {
                    break block14;
                }
                catch (Throwable throwable) {
                    byteArrayOutputStream = null;
                    break block15;
                }
                catch (Exception exception) {
                    byteArrayOutputStream = null;
                }
            }
            if (f.f.a.a.a) {
                void var4_6;
                var4_6.printStackTrace();
            }
            if (byteArrayOutputStream == null) return null;
            try {
                byteArrayOutputStream.close();
                return null;
            }
            catch (Exception exception) {
                if (!f.f.a.a.a) return null;
                exception.printStackTrace();
            }
            return null;
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (byteArrayOutputStream == null) throw var2_9;
        try {
            byteArrayOutputStream.close();
            throw var2_9;
        }
        catch (Exception exception) {
            if (!f.f.a.a.a) throw var2_9;
            exception.printStackTrace();
        }
        throw var2_9;
    }
}

