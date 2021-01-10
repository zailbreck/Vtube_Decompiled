/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Xfermode
 *  java.lang.Error
 *  java.lang.Exception
 *  java.lang.Object
 */
package f.f.a.e.f;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;

public final class g {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Bitmap a(Bitmap bitmap, int n2, int n3) {
        if (n3 == 0) {
            return bitmap;
        }
        Bitmap bitmap2 = null;
        int n4 = bitmap.getWidth();
        int n5 = bitmap.getHeight();
        bitmap2 = Bitmap.createBitmap((int)n4, (int)n5, (Bitmap.Config)Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, n4, n5);
        RectF rectF = new RectF(rect);
        float f2 = n3;
        try {
            paint.setAntiAlias(true);
            paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, f2, f2, paint);
            if (n2 == 2) {
                canvas.drawRect(0.0f, (float)(n5 - n3), (float)n4, (float)n5, paint);
            }
            paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect, paint);
            return bitmap2;
        }
        catch (Error | Exception throwable) {}
        return bitmap2;
    }
}

