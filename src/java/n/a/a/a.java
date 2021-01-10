/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  java.io.ByteArrayOutputStream
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  n.a.a.a$a
 *  n.a.a.a$b
 */
package n.a.a;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import n.a.a.a;

public class a
implements MethodChannel.MethodCallHandler {
    private static String c = "ThumbnailPlugin";
    private ExecutorService b = Executors.newCachedThreadPool();

    /*
     * Exception decompiling
     */
    public static Bitmap a(String var0_1, int var1, int var2_3, int var3_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.b.a.a.j.b(Op04StructuredStatement.java:409)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:487)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
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

    private static String a(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                return new String("jpg");
            }
            return new String("webp");
        }
        return new String("png");
    }

    private String a(String string, String string2, int n2, int n3, int n4, int n5, int n6) {
        String string3 = c;
        Object[] arrobject = new Object[]{n2, n3, n4, n5, n6};
        Log.d((String)string3, (String)String.format((String)"buildThumbnailFile( format:%d, maxh:%d, maxw:%d, timeMs:%d, quality:%d )", (Object[])arrobject));
        byte[] arrby = this.a(string, n2, n3, n4, n5, n6);
        String string4 = a.a(n2);
        int n7 = string.lastIndexOf(".");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string.substring(0, n7 + 1));
        stringBuilder.append(string4);
        String string5 = stringBuilder.toString();
        if (string2 != null) {
            if (string2.endsWith(string4)) {
                string5 = string2;
            } else {
                StringBuilder stringBuilder2;
                int n8 = string5.lastIndexOf("/");
                if (string2.endsWith("/")) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string2);
                    ++n8;
                } else {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string2);
                }
                stringBuilder2.append(string5.substring(n8));
                string5 = stringBuilder2.toString();
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(string5);
            fileOutputStream.write(arrby);
            fileOutputStream.close();
            String string6 = c;
            Object[] arrobject2 = new Object[]{arrby.length};
            Log.d((String)string6, (String)String.format((String)"buildThumbnailFile( written:%d )", (Object[])arrobject2));
            return string5;
        }
        catch (IOException iOException) {
            iOException.getStackTrace();
            throw new RuntimeException((Throwable)iOException);
        }
    }

    static /* synthetic */ String a(a a2, String string, String string2, int n2, int n3, int n4, int n5, int n6) {
        return a2.a(string, string2, n2, n3, n4, n5, n6);
    }

    private void a(MethodChannel.Result result, Object object, boolean bl, Exception exception) {
        b b2 = new b((a)this, bl, result, exception, object);
        a.a((Runnable)b2);
    }

    public static void a(PluginRegistry.Registrar registrar) {
        new MethodChannel(registrar.messenger(), "video_thumbnail").setMethodCallHandler(new a());
    }

    private static void a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    static /* synthetic */ void a(a a2, MethodChannel.Result result, Object object, boolean bl, Exception exception) {
        a2.a(result, object, bl, exception);
    }

    private byte[] a(String string, int n2, int n3, int n4, int n5, int n6) {
        String string2 = c;
        Object[] arrobject = new Object[]{n2, n3, n4, n5, n6};
        Log.d((String)string2, (String)String.format((String)"buildThumbnailData( format:%d, maxh:%d, maxw:%d, timeMs:%d, quality:%d )", (Object[])arrobject));
        Bitmap bitmap = a.a(string, n3, n4, n5);
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(a.b(n2), n6, (OutputStream)byteArrayOutputStream);
            bitmap.recycle();
            if (bitmap != null) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    static /* synthetic */ byte[] a(a a2, String string, int n2, int n3, int n4, int n5, int n6) {
        return a2.a(string, n2, n3, n4, n5, n6);
    }

    private static Bitmap.CompressFormat b(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                return Bitmap.CompressFormat.JPEG;
            }
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.PNG;
    }

    @Override
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Map map = (Map)methodCall.arguments();
        String string = (String)map.get((Object)"video");
        int n2 = (Integer)map.get((Object)"format");
        int n3 = (Integer)map.get((Object)"maxh");
        int n4 = (Integer)map.get((Object)"maxw");
        int n5 = (Integer)map.get((Object)"timeMs");
        int n6 = (Integer)map.get((Object)"quality");
        String string2 = methodCall.method;
        ExecutorService executorService = this.b;
        a a2 = new a((a)this, string2, map, string, n2, n3, n4, n5, n6, result);
        executorService.execute((Runnable)a2);
    }
}

