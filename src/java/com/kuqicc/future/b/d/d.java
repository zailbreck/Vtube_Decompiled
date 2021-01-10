/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.net.Uri
 *  android.os.Environment
 *  java.io.BufferedOutputStream
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Hashtable
 *  java.util.Map
 *  java.util.UUID
 */
package com.kuqicc.future.b.d;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Environment;
import com.kuqicc.future.MainActivity;
import com.kuqicc.future.b.c.f;
import com.kuqicc.future.b.d.a;
import com.kuqicc.future.b.d.b;
import com.kuqicc.future.b.d.c;
import h.b.h;
import io.flutter.plugin.common.MethodChannel;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Map;
import java.util.UUID;

public class d {
    private static String a = new ContextWrapper((Context)MainActivity.a()).getFilesDir().getPath();

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static Bitmap a(String var0_1, int var1, int var2_2) {
        if (var0_1 == null) return null;
        try {
            if ("".equals((Object)var0_1) != false) return null;
            if (var0_1.length() < 1) {
                return null;
            }
            var4_3 = new Hashtable();
            var4_3.put((Object)f.d.c.b.c, (Object)"utf-8");
            var6_4 = new f.d.c.f.a().a(var0_1, f.d.c.a.m, var1, var2_2, (Map<f.d.c.b, ?>)var4_3);
            var7_5 = new int[var1 * var2_2];
            var8_6 = 0;
            ** GOTO lbl20
        }
        catch (f.d.c.d var3_9) {
            var3_9.printStackTrace();
        }
        return null;
lbl-1000: // 2 sources:
        {
            if (var9_7 < var1) {
                var7_5[var9_7 + var8_6 * var1] = var6_4.a(var9_7, var8_6) != false ? -16777216 : -1;
                ++var9_7;
                continue;
            }
            ++var8_6;
lbl20: // 2 sources:
            if (var8_6 >= var2_2) {
                var10_8 = Bitmap.createBitmap((int)var1, (int)var2_2, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                var10_8.setPixels(var7_5, 0, var1, 0, 0, var1, var2_2);
                return var10_8;
            }
            var9_7 = 0;
            ** while (true)
        }
    }

    public static Bitmap a(String string, byte[] arrby) {
        Bitmap bitmap = BitmapFactory.decodeByteArray((byte[])arrby, (int)0, (int)arrby.length);
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmap2 = d.a(string, 450, 450);
        Bitmap bitmap3 = Bitmap.createBitmap((int)bitmap.getWidth(), (int)bitmap.getHeight(), (Bitmap.Config)bitmap.getConfig());
        Canvas canvas = new Canvas(bitmap3);
        canvas.drawBitmap(bitmap, new Matrix(), null);
        canvas.drawBitmap(bitmap2, 200.0f, 480.0f, null);
        return bitmap3;
    }

    static /* synthetic */ void a() {
    }

    public static void a(Bitmap bitmap) {
        File file = new File(Environment.getExternalStorageDirectory().getPath());
        if (!file.exists()) {
            file.mkdir();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(UUID.randomUUID().toString());
        stringBuilder.append(".jpg");
        String string = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(Environment.getExternalStorageDirectory().getPath());
        stringBuilder2.append("/DCIM/Camera/");
        stringBuilder2.append(string);
        File file2 = new File(stringBuilder2.toString());
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream((OutputStream)new FileOutputStream(file2));
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, (OutputStream)bufferedOutputStream);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile((File)file2));
        MainActivity.a().sendBroadcast(intent);
    }

    static /* synthetic */ void a(MethodChannel.Result result, Throwable throwable) {
        result.error(throwable.getMessage(), throwable.getMessage(), (Object)throwable);
    }

    public static void a(String string, MethodChannel.Result result) {
        if (!new File(string).exists()) {
            result.error("Save Failed!", "Save Failed!", null);
            return;
        }
        Bitmap bitmap = BitmapFactory.decodeFile((String)string);
        try {
            d.a(bitmap);
        }
        catch (IOException iOException) {
            result.error(iOException.getMessage(), iOException.getMessage(), (Object)iOException);
            return;
        }
        result.success("Save Successful");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static /* synthetic */ void a(String string, MethodChannel.Result result, File file, byte[] arrby) {
        try {
            Bitmap bitmap = d.a(string, arrby);
            if (bitmap == null) {
                result.error("\u751f\u6210\u5206\u4eab\u56fe\u7247\u5931\u8d25", "\u751f\u6210\u5206\u4eab\u56fe\u7247\u5931\u8d25", null);
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)fileOutputStream);
            fileOutputStream.close();
            result.success(file.getPath());
            return;
        }
        catch (Exception exception) {
            result.error(exception.getMessage(), exception.getMessage(), (Object)exception);
            return;
        }
    }

    public static void a(String string, String string2, MethodChannel.Result result) {
        File file = new File(a, "fv_share_imgs");
        if (!file.exists()) {
            file.mkdir();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        String string3 = com.kuqicc.future.c.a.a(stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string3);
        stringBuilder2.append(".png");
        File file2 = new File(file, stringBuilder2.toString());
        if (file2.exists()) {
            result.success(file2.getPath());
            return;
        }
        f.a().a(string).b(h.b.t.a.a()).a(h.b.n.b.a.a()).a(new b(string2, result, file2), new a(result), c.a);
    }
}

