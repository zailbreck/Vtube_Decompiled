/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.os.Handler
 *  android.os.Message
 *  android.os.Process
 *  android.util.Log
 *  java.io.BufferedWriter
 *  java.io.File
 *  java.io.FileWriter
 *  java.io.PrintWriter
 *  java.io.Writer
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.List
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.mintegral.msdk.base.common.report.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.mintegral.msdk.base.common.report.d;
import f.f.a.e.b.c.e;
import f.f.a.f.c;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a
implements Thread.UncaughtExceptionHandler {
    private static volatile a e;
    private WeakReference<Context> a;
    private Thread.UncaughtExceptionHandler b;
    private Throwable c;
    Handler d;

    private a(Context context) {
        this.d = new Handler(){

            public final void handleMessage(Message message) {
                HashMap hashMap;
                super.handleMessage(message);
                if (message.what != 101) {
                    return;
                }
                Context context = (Context)a.this.a.get();
                if (context == null) {
                    return;
                }
                Object object = message.obj;
                if (object instanceof HashMap && (hashMap = (HashMap)object) != null) {
                    new d(context).a((String)hashMap.get((Object)"crashinfo"), (File)hashMap.get((Object)"file"));
                }
            }
        };
        this.a = new WeakReference((Object)context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a a(Context context) {
        if (e != null) return e;
        Class<a> class_ = a.class;
        synchronized (a.class) {
            if (e != null) return e;
            e = new a(context);
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return e;
        }
    }

    private String a(Throwable throwable) {
        StackTraceElement[] arrstackTraceElement = throwable.getStackTrace();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < arrstackTraceElement.length; ++i2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(arrstackTraceElement[i2].toString());
            stringBuilder2.append("\n");
            stringBuilder.append(stringBuilder2.toString());
        }
        return stringBuilder.toString();
    }

    /*
     * Exception decompiling
     */
    private String a(Throwable var1, String var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl157 : FAKE_TRY : trying to set 1 previously set to 0
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

    private List<String> a(String string, String string2) {
        ArrayList arrayList = new ArrayList();
        try {
            Matcher matcher = Pattern.compile((String)string2).matcher((CharSequence)string);
            while (matcher.find()) {
                arrayList.add((Object)matcher.group(1));
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return arrayList;
    }

    private void a(String string, String string2, Throwable throwable, Thread thread) {
        if (string.contains((CharSequence)string2)) {
            HashMap<String, Object> hashMap = a.super.b();
            if (hashMap != null && hashMap.get((Object)"file") != null) {
                Message message = Message.obtain();
                HashMap hashMap2 = new HashMap();
                hashMap2.put((Object)"crashinfo", (Object)a.super.a(throwable, (String)hashMap.get((Object)"time")));
                hashMap2.put((Object)"file", hashMap.get((Object)"file"));
                message.obj = hashMap2;
                message.what = 101;
                this.d.sendMessage(message);
                a.super.a(thread, throwable);
                return;
            }
        } else {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, throwable);
            }
        }
    }

    private void a(Thread thread, Throwable throwable) {
        try {
            Thread.sleep((long)2000L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        Process.killProcess((int)Process.myPid());
    }

    private int b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int n2 = packageManager.getPackageInfo((String)context.getPackageName(), (int)0).versionCode;
            return n2;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            nameNotFoundException.printStackTrace();
            return 0;
        }
    }

    private HashMap<String, Object> b() {
        HashMap hashMap = new HashMap();
        if (this.c == null) {
            return null;
        }
        String string = e.b(f.f.a.e.b.c.c.j);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/");
        File file = new File(stringBuilder.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        String string2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string);
        stringBuilder2.append("/");
        stringBuilder2.append("sdkcrash");
        stringBuilder2.append(string2);
        stringBuilder2.append(".txt");
        File file2 = new File(stringBuilder2.toString());
        try {
            PrintWriter printWriter = new PrintWriter((Writer)new BufferedWriter((Writer)new FileWriter(file2)));
            printWriter.println(this.a(this.c, string2));
            printWriter.println("====");
            this.c.printStackTrace(printWriter);
            printWriter.close();
            hashMap.put((Object)"file", (Object)file2);
            hashMap.put((Object)"time", (Object)string2);
            return hashMap;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static String c(Context context) {
        try {
            String string = context.getApplicationContext().getPackageManager().getPackageInfo((String)context.getPackageName(), (int)0).versionName;
            return string;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Log.e((String)"", (String)nameNotFoundException.getMessage());
            return "";
        }
    }

    private String d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int n2 = packageManager.getPackageInfo((String)context.getPackageName(), (int)0).applicationInfo.labelRes;
            String string = context.getResources().getString(n2);
            return string;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            nameNotFoundException.printStackTrace();
            return null;
        }
    }

    public final void a() {
        this.b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void uncaughtException(Thread thread, Throwable throwable) {
        List<String> list;
        try {
            String string;
            this.c = throwable;
            f.f.a.f.a a2 = c.b().a(f.f.a.e.c.a.i().f());
            if (a2 == null) {
                a2 = c.b().a();
            }
            if ((list = a.super.a(string = a2.K() == null ? "mintegral" : a2.K(), "<mvpackage>(.*?)</mvpackage>")).size() <= 0) {
                a.super.a(a.super.a(throwable), string, throwable, thread);
                return;
            }
        }
        catch (Exception exception) {
            a.super.a(thread, throwable);
            exception.printStackTrace();
            return;
        }
        for (int i2 = 0; i2 < list.size(); ++i2) {
            String string = (String)list.get(i2);
            a.super.a(a.super.a(throwable), string, throwable, thread);
        }
    }

}

