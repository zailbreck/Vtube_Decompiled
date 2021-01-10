/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.BroadcastReceiver
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.hardware.SensorManager
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Looper
 *  android.provider.Settings
 *  android.provider.Settings$System
 *  android.telephony.CellLocation
 *  android.telephony.TelephonyManager
 *  android.telephony.gsm.GsmCellLocation
 *  android.text.TextUtils
 *  android.text.format.Formatter
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.WindowManager
 *  android.view.inputmethod.InputMethodInfo
 *  android.view.inputmethod.InputMethodManager
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  com.mintegral.msdk.optimize.SensitiveDataUtil
 *  java.io.BufferedReader
 *  java.io.FileReader
 *  java.io.IOException
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.TimeZone
 */
package f.f.a.e.f;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mintegral.msdk.optimize.SensitiveDataUtil;
import f.f.a.e.f.d;
import f.f.a.e.f.h;
import f.f.a.e.f.q;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public final class d {
    private static String a;
    private static String b = "";
    private static String c;
    private static String d = "";
    private static int e = -1;
    private static int f = -1;
    private static int g = 0;
    private static String h;
    private static String i;
    private static String j = "";
    private static String k = "";
    private static String l = "";
    private static String m = "";
    private static int n = 0;
    private static String o = "";
    private static String p = "";
    private static String q = "";
    private static String r = "";
    private static String s = "";
    private static String t = "";
    private static int u = -1;
    private static String v = "";
    private static int w;

    public static String A() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.RADIO;
    }

    public static String A(Context context) {
        if (context == null) {
            return "";
        }
        if (TextUtils.isEmpty((CharSequence)r)) {
            try {
                String string = r = context.getPackageManager().getPackageInfo((String)"com.android.vending", (int)0).versionName;
                return string;
            }
            catch (Exception exception) {
                return "";
            }
        }
        return r;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int B(Context context) {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return -1;
        }
        if (context == null) {
            return -1;
        }
        Intent intent = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intent == null) return 0;
        try {
            int n2;
            if (intent.getExtras() == null || (n2 = intent.getIntExtra("status", -1)) != 2 && n2 != 5) return 0;
            return 1;
        }
        catch (Exception exception) {
            h.b("CommonDeviceUtil", exception.getMessage(), exception);
        }
        return 0;
    }

    public static String B() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.BOOTLOADER;
    }

    public static String C() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.HARDWARE;
    }

    public static String C(Context context) {
        double d2;
        block5 : {
            String string;
            void var3_5;
            if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
                return "";
            }
            d2 = 0.0;
            if (context != null) {
                return "";
            }
            try {
                Object object = Class.forName((String)"com.android.internal.os.PowerProfile").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
                d2 = (Double)Class.forName((String)"com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", new Class[0]).invoke(object, new Object[0]);
                break block5;
            }
            catch (Throwable throwable) {
                string = throwable.getMessage();
            }
            catch (Exception exception) {
                string = exception.getMessage();
            }
            h.b("CommonDeviceUtil", string, (Throwable)var3_5);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d2);
        stringBuilder.append(" mAh");
        return String.valueOf((Object)stringBuilder.toString());
    }

    public static int D(Context context) {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return -1;
        }
        if (context == null) {
            return -1;
        }
        try {
            String string = ((TelephonyManager)context.getSystemService("phone")).getSimOperator();
            if (!("46000".equals((Object)string) || "46002".equals((Object)string) || "46007".equals((Object)string) || "46008".equals((Object)string) || "45412".equals((Object)string))) {
                if (!("46001".equals((Object)string) || "46006".equals((Object)string) || "46009".equals((Object)string))) {
                    boolean bl;
                    if (!("46003".equals((Object)string) || "46005".equals((Object)string) || "46011".equals((Object)string) || "45502".equals((Object)string) || (bl = "45507".equals((Object)string)))) {
                        return -2;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
        catch (Exception exception) {
            h.b("CommonDeviceUtil", exception.getMessage(), exception);
            return -1;
        }
    }

    public static String D() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.HOST;
    }

    public static String E() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.VERSION.CODENAME;
    }

    public static String F() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.VERSION.INCREMENTAL;
    }

    public static String G() {
        if (!f.f.a.e.c.b.b.b().a("authority_serial_id")) {
            return "";
        }
        return Build.SERIAL;
    }

    public static String H() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.DISPLAY;
    }

    public static String I() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.BOARD;
    }

    public static int a(int n2) {
        if (n2 != 20) {
            switch (n2) {
                default: {
                    return 0;
                }
                case 13: {
                    return 4;
                }
                case 3: 
                case 5: 
                case 6: 
                case 8: 
                case 9: 
                case 10: 
                case 12: 
                case 14: 
                case 15: {
                    return 3;
                }
                case 1: 
                case 2: 
                case 4: 
                case 7: 
                case 11: 
            }
            return 2;
        }
        return 5;
    }

    public static String a() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.TYPE;
    }

    public static String a(Context context) {
        void var1_4;
        String string;
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        if (context == null) {
            return "";
        }
        try {
            String string2 = Settings.System.getString((ContentResolver)context.getContentResolver(), (String)"time_12_24");
            return string2;
        }
        catch (Throwable throwable) {
            string = throwable.getMessage();
        }
        catch (Exception exception) {
            string = exception.getMessage();
        }
        h.b("CommonDeviceUtil", string, (Throwable)var1_4);
        return "";
    }

    public static String a(Context context, int n2) {
        block5 : {
            if (n2 != 0) {
                TelephonyManager telephonyManager;
                block6 : {
                    if (n2 == 9) {
                        return "";
                    }
                    if (!f.f.a.e.b.b.b) break block5;
                    telephonyManager = (TelephonyManager)context.getSystemService("phone");
                    if (telephonyManager != null) break block6;
                    return "";
                }
                try {
                    String string = String.valueOf((int)telephonyManager.getNetworkType());
                    return string;
                }
                catch (Throwable throwable) {
                    h.b("CommonDeviceUtil", throwable.getMessage(), throwable);
                }
            }
        }
        return "";
    }

    static /* synthetic */ String a(String string) {
        b = string;
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(String string, Context context) {
        if (!TextUtils.isEmpty((CharSequence)v)) {
            return v;
        }
        if (TextUtils.isEmpty((CharSequence)string) || context == null) return v;
        try {
            v = context.getPackageManager().getInstallerPackageName(string);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PKGSource:");
            stringBuilder.append(v);
            h.a("CommonDeviceUtil", stringBuilder.toString());
            return v;
        }
        catch (Exception exception) {
            h.b("CommonDeviceUtil", exception.getMessage(), exception);
        }
        return v;
    }

    public static int b(Context context) {
        void var1_4;
        String string;
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return -1;
        }
        if (context == null) {
            return -1;
        }
        try {
            int n2 = ((SensorManager)context.getSystemService("sensor")).getSensorList(-1).size();
            return n2;
        }
        catch (Throwable throwable) {
            string = throwable.getMessage();
        }
        catch (Exception exception) {
            string = exception.getMessage();
        }
        h.b("CommonDeviceUtil", string, (Throwable)var1_4);
        return -1;
    }

    public static String b() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.VERSION.RELEASE;
    }

    static /* synthetic */ String b(String string) {
        j = string;
        return string;
    }

    public static int c() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return -1;
        }
        return Build.VERSION.SDK_INT;
    }

    public static String c(Context context) {
        void var1_9;
        String string;
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        if (context == null) {
            return "";
        }
        List list = ((InputMethodManager)context.getSystemService("input_method")).getInputMethodList();
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        do {
            if (n2 >= list.size()) break;
            CharSequence charSequence = ((InputMethodInfo)list.get(n2)).loadLabel(context.getPackageManager());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("keybroad");
            stringBuilder2.append(n2);
            stringBuilder2.append((Object)charSequence);
            stringBuilder2.append(" ");
            stringBuilder.append(stringBuilder2.toString());
            ++n2;
        } while (true);
        try {
            String string2 = stringBuilder.toString();
            return string2;
        }
        catch (Throwable throwable) {
            string = throwable.getMessage();
        }
        catch (Exception exception) {
            string = exception.getMessage();
        }
        h.b("CommonDeviceUtil", string, (Throwable)var1_9);
        return "";
    }

    public static int d() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return -1;
        }
        return 1;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String d(Context context) {
        BufferedReader bufferedReader;
        FileReader fileReader;
        block30 : {
            void var9_9;
            block29 : {
                if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
                    return "";
                }
                if (context == null) {
                    return "";
                }
                fileReader = new FileReader("/proc/meminfo");
                bufferedReader = new BufferedReader((Reader)fileReader, 8192);
                String string = Formatter.formatFileSize((Context)context, (long)(1024L * Long.valueOf((String)bufferedReader.readLine().split("\\s+")[1])));
                try {
                    bufferedReader.close();
                }
                catch (IOException iOException) {
                    h.b("CommonDeviceUtil", iOException.getMessage(), iOException);
                }
                try {
                    fileReader.close();
                    return string;
                }
                catch (IOException iOException) {
                    h.b("CommonDeviceUtil", iOException.getMessage(), iOException);
                    return string;
                }
                catch (Throwable throwable) {
                    break block29;
                }
                catch (IOException iOException) {
                    break block30;
                }
                catch (Throwable throwable) {
                    bufferedReader = null;
                    break block29;
                }
                catch (IOException iOException) {
                    bufferedReader = null;
                    break block30;
                }
                catch (Throwable throwable) {
                    bufferedReader = null;
                    fileReader = null;
                }
            }
            h.b("CommonDeviceUtil", var9_9.getMessage(), (Throwable)var9_9);
            try {
                bufferedReader.close();
            }
            catch (IOException iOException) {
                h.b("CommonDeviceUtil", iOException.getMessage(), iOException);
            }
            try {
                fileReader.close();
                return "";
            }
            catch (IOException iOException) {
                h.b("CommonDeviceUtil", iOException.getMessage(), iOException);
                return "";
            }
            catch (IOException iOException) {
                bufferedReader = null;
                fileReader = null;
            }
        }
        try {
            void var3_13;
            h.b("CommonDeviceUtil", var3_13.getMessage(), (Throwable)var3_13);
        }
        catch (Throwable throwable) {
            try {
                bufferedReader.close();
            }
            catch (IOException iOException) {
                h.b("CommonDeviceUtil", iOException.getMessage(), iOException);
            }
            try {
                fileReader.close();
                throw throwable;
            }
            catch (IOException iOException) {
                h.b("CommonDeviceUtil", iOException.getMessage(), iOException);
            }
            throw throwable;
        }
        try {
            bufferedReader.close();
        }
        catch (IOException iOException) {
            h.b("CommonDeviceUtil", iOException.getMessage(), iOException);
        }
        fileReader.close();
        return "";
    }

    /*
     * Exception decompiling
     */
    public static String e() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl89.1 : ICONST_0 : trying to set 1 previously set to 0
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

    static /* synthetic */ void e(Context context) {
        d.f(context);
    }

    public static String f() {
        if (TextUtils.isEmpty((CharSequence)d)) {
            String string;
            if (Build.VERSION.SDK_INT >= 21) {
                string = f.f.a.e.c.b.b.b().a("authority_general_data") && Build.VERSION.SDK_INT >= 21 ? Arrays.asList((Object[])Build.SUPPORTED_ABIS).toString() : "";
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Object)d.x());
                arrayList.add((Object)d.w());
                string = arrayList.toString();
            }
            d = string;
        }
        return d;
    }

    private static void f(Context context) {
        try {
            q.a(context, "mintegral_ua", j);
            return;
        }
        catch (Throwable throwable) {
            h.b("CommonDeviceUtil", throwable.getMessage(), throwable);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static int g() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return 0;
        }
        var1 = f.f.a.e.c.a.i().e();
        var2_1 = 0L;
        var4_2 = (Long)q.b(var1, "FreeRamSize", var2_1);
        var6_3 = System.currentTimeMillis();
        if (var6_3 - var4_2 > 1800000L) ** GOTO lbl11
        try {
            if (d.f != -1) return d.f;
lbl11: // 2 sources:
            if ((var8_4 = f.f.a.e.c.a.i().e()) != null) {
                var9_5 = (ActivityManager)var8_4.getSystemService("activity");
                var10_6 = new ActivityManager.MemoryInfo();
                var9_5.getMemoryInfo(var10_6);
                var2_1 = var10_6.availMem;
            }
            d.f = Long.valueOf((long)(var2_1 / 1000L / 1000L)).intValue();
            q.a(var1, "FreeRamSize", var6_3);
            return d.f;
        }
        catch (Throwable var0_7) {
            h.b("CommonDeviceUtil", var0_7.getMessage(), var0_7);
        }
        return d.f;
    }

    private static String g(Context context) {
        if (!TextUtils.isEmpty((CharSequence)b)) {
            return b;
        }
        try {
            String string = b = new e((Context)context).a;
            return string;
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static int h() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return 0;
        }
        if (d.e >= 1) return d.e;
        var1 = f.f.a.e.c.a.i().e();
        var2_1 = 0L;
        var4_2 = (Long)q.b(var1, "TotalRamSize", var2_1);
        var6_3 = System.currentTimeMillis();
        if (var6_3 - var4_2 > 1800000L) ** GOTO lbl12
        try {
            if (d.e != -1) return d.e;
lbl12: // 2 sources:
            if ((var8_4 = f.f.a.e.c.a.i().e()) != null) {
                var9_5 = (ActivityManager)var8_4.getSystemService("activity");
                var10_6 = new ActivityManager.MemoryInfo();
                var9_5.getMemoryInfo(var10_6);
                var2_1 = var10_6.totalMem;
            }
            d.e = Long.valueOf((long)(var2_1 / 1000L / 1000L)).intValue();
            q.a(var1, "TotalRamSize", var6_3);
            return d.e;
        }
        catch (Throwable var0_7) {
            h.b("CommonDeviceUtil", var0_7.getMessage(), var0_7);
        }
        return d.e;
    }

    public static String h(final Context context) {
        if (!f.f.a.e.c.b.b.b().a("authority_device_id")) {
            return "";
        }
        if (context == null) {
            return "";
        }
        if (!TextUtils.isEmpty((CharSequence)b)) {
            return b;
        }
        try {
            b = d.g(context);
            if (!TextUtils.isEmpty((CharSequence)b)) {
                String string = b;
                return string;
            }
        }
        catch (Throwable throwable) {
            h.a("CommonDeviceUtil", throwable.getMessage(), throwable);
        }
        try {
            if (TextUtils.isEmpty((CharSequence)b)) {
                new Thread(){

                    public final void run() {
                        try {
                            new f.f.a.l.b(context).a(new f.f.a.l.c(this){

                                public final void a(String string, boolean bl) {
                                    d.a(string);
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("getOaid oaid = ");
                                    stringBuilder.append(string);
                                    stringBuilder.append(" isOaidTrackLimited = ");
                                    stringBuilder.append(bl);
                                    h.a("CommonDeviceUtil", stringBuilder.toString());
                                }

                                public final void b(String string) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("getOaid failed ");
                                    stringBuilder.append(string);
                                    h.a("CommonDeviceUtil", stringBuilder.toString());
                                }
                            });
                            return;
                        }
                        catch (Throwable throwable) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("getOaid failed ");
                            stringBuilder.append(throwable.getMessage());
                            h.a("CommonDeviceUtil", stringBuilder.toString());
                            return;
                        }
                    }
                }.start();
            }
        }
        catch (Throwable throwable) {
            h.b("CommonDeviceUtil", throwable.getMessage(), throwable);
        }
        return b;
    }

    static /* synthetic */ int i() {
        return d.l();
    }

    public static String i(Context context) {
        if (!f.f.a.e.c.b.b.b().a("authority_imei_mac")) {
            return "";
        }
        if (context == null) {
            return "";
        }
        try {
            String string = SensitiveDataUtil.getIMEI((Context)context);
            return string;
        }
        catch (Throwable throwable) {
            h.a("CommonDeviceUtil", throwable.getMessage(), throwable);
            return "";
        }
    }

    static /* synthetic */ String j() {
        return j;
    }

    public static String j(Context context) {
        if (!f.f.a.e.c.b.b.b().a("authority_imei_mac")) {
            return "";
        }
        if (context == null) {
            return "";
        }
        try {
            String string = SensitiveDataUtil.getImsi((Context)context);
            return string;
        }
        catch (Throwable throwable) {
            h.a("CommonDeviceUtil", throwable.getMessage(), throwable);
            return "";
        }
    }

    public static String k(Context context) {
        return s;
    }

    private static void k() {
        String string;
        String string2 = Build.VERSION.RELEASE;
        String string3 = d.m();
        String string4 = Build.ID;
        if (!(TextUtils.isEmpty((CharSequence)string2) || TextUtils.isEmpty((CharSequence)string3) || TextUtils.isEmpty((CharSequence)string4))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Mozilla/5.0 (Linux; Android ");
            stringBuilder.append(string2);
            stringBuilder.append("; ");
            stringBuilder.append(string3);
            stringBuilder.append(" Build/");
            stringBuilder.append(string4);
            stringBuilder.append(") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
            string = stringBuilder.toString();
        } else {
            string = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
        }
        j = string;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("append ua:");
        stringBuilder.append(j);
        h.a("CommonDeviceUtil", stringBuilder.toString());
    }

    private static int l() {
        try {
            if (TextUtils.isEmpty((CharSequence)k)) {
                int n2 = d.r();
                return n2;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }

    public static String l(Context context) {
        return t;
    }

    public static String m() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.MODEL;
    }

    public static String m(Context context) {
        if (!f.f.a.e.c.b.b.b().a("authority_android_id")) {
            return "";
        }
        if (context == null) {
            return h;
        }
        try {
            if (TextUtils.isEmpty((CharSequence)h)) {
                h = SensitiveDataUtil.getAndroidID((Context)context);
            }
        }
        catch (Throwable throwable) {
            h.a("CommonDeviceUtil", throwable.getMessage(), throwable);
        }
        return h;
    }

    public static String n() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.BRAND;
    }

    public static String n(Context context) {
        if (context == null) {
            return "";
        }
        i = null;
        try {
            if (TextUtils.isEmpty((CharSequence)i)) {
                i = d.m(context);
                i = f.f.a.e.f.a.b(i);
            }
        }
        catch (Throwable throwable) {
            h.b("CommonDeviceUtil", throwable.getMessage(), throwable);
        }
        return i;
    }

    public static String o() {
        if (TextUtils.isEmpty((CharSequence)j)) {
            d.y(f.f.a.e.c.a.i().e());
        }
        return j;
    }

    public static String o(Context context) {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        if (TextUtils.isEmpty((CharSequence)p)) {
            if (context == null) {
                return "en";
            }
            p = context.getResources().getConfiguration().locale.getLanguage();
            return p;
        }
        return p;
    }

    public static int p() {
        return u;
    }

    public static int p(Context context) {
        if (context != null) {
            if (context.getResources() == null) {
                return 1;
            }
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration == null) {
                return 1;
            }
            if (configuration.orientation == 2) {
                return 2;
            }
        }
        return 1;
    }

    public static String q() {
        block4 : {
            if (f.f.a.e.c.b.b.b().a("authority_other")) break block4;
            return "";
        }
        try {
            if (TextUtils.isEmpty((CharSequence)q)) {
                new Thread(new Runnable(){

                    public final void run() {
                        try {
                            q = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                            return;
                        }
                        catch (Throwable throwable) {
                            throwable.printStackTrace();
                            return;
                        }
                    }
                }).start();
                String string = q;
                return string;
            }
        }
        catch (Throwable throwable) {
            h.b("CommonDeviceUtil", throwable.getMessage(), throwable);
        }
        return q;
    }

    public static String q(Context context) {
        if (!f.f.a.e.c.b.b.b().a("authority_imei_mac")) {
            return "";
        }
        if (context == null) {
            return o;
        }
        try {
            if (TextUtils.isEmpty((CharSequence)o)) {
                o = SensitiveDataUtil.getMacAddress((Context)context);
            }
        }
        catch (Throwable throwable) {
            h.a("CommonDeviceUtil", throwable.getMessage(), throwable);
        }
        return o;
    }

    public static int r() {
        try {
            int n2 = Build.VERSION.SDK_INT;
            return n2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public static int r(Context context) {
        if (context == null) {
            return n;
        }
        int n2 = n;
        if (n2 == 0) {
            try {
                int n3 = n = context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)0).versionCode;
                return n3;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return -1;
            }
        }
        return n2;
    }

    public static String s() {
        if (!f.f.a.e.c.b.b.b().a("authority_device_id")) {
            return "";
        }
        String string = a;
        if (string == null) {
            return "";
        }
        return string;
    }

    public static String s(Context context) {
        if (context == null) {
            return m;
        }
        try {
            if (TextUtils.isEmpty((CharSequence)m)) {
                String string = m = context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)0).versionName;
                return string;
            }
            return m;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    public static int t(Context context) {
        if (context == null) {
            return w;
        }
        if (w == 0) {
            try {
                w = context.getApplicationInfo().targetSdkVersion;
            }
            catch (Exception exception) {
                h.d("CommonDeviceUtil", exception.getMessage());
            }
        }
        return w;
    }

    public static String t() {
        if (!f.f.a.e.c.b.b.b().a("authority_device_id")) {
            return "";
        }
        String string = c;
        if (string == null) {
            return "";
        }
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int u() {
        if (!f.f.a.e.b.b.c) return 0;
        TelephonyManager telephonyManager = (TelephonyManager)f.f.a.e.c.a.i().e().getSystemService("phone");
        if (telephonyManager == null) return 0;
        CellLocation cellLocation = telephonyManager.getCellLocation();
        if (cellLocation == null) return 0;
        try {
            if (!(cellLocation instanceof GsmCellLocation)) return 0;
            return ((GsmCellLocation)cellLocation).getCid();
        }
        catch (Throwable throwable) {
            h.b("CommonDeviceUtil", throwable.getMessage(), throwable);
        }
        return 0;
    }

    public static int u(Context context) {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return 0;
        }
        if (context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap hashMap = d.w(context);
            if (hashMap.get((Object)"width") == null) {
                return displayMetrics.widthPixels;
            }
            int n2 = (Integer)hashMap.get((Object)"width");
            return n2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public static int v(Context context) {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return 0;
        }
        if (context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap hashMap = d.w(context);
            if (hashMap.get((Object)"height") == null) {
                return displayMetrics.heightPixels;
            }
            int n2 = (Integer)hashMap.get((Object)"height");
            return n2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public static String v() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.MANUFACTURER;
    }

    public static String w() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.CPU_ABI2;
    }

    public static HashMap w(Context context) {
        HashMap hashMap = new HashMap();
        if (context == null) {
            return hashMap;
        }
        try {
            Display display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Class.forName((String)"android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke((Object)display, new Object[]{displayMetrics});
            hashMap.put((Object)"height", (Object)displayMetrics.heightPixels);
            hashMap.put((Object)"width", (Object)displayMetrics.widthPixels);
            return hashMap;
        }
        catch (Exception exception) {
            h.b("CommonDeviceUtil", exception.getMessage(), exception);
            return hashMap;
        }
    }

    public static String x() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.CPU_ABI;
    }

    public static String x(Context context) {
        if (context == null) {
            return l;
        }
        try {
            if (TextUtils.isEmpty((CharSequence)l)) {
                String string = l = context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)0).packageName;
                return string;
            }
            return l;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    public static String y() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.TAGS;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String y(final Context var0) {
        block21 : {
            if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
                return null;
            }
            if (TextUtils.isEmpty((CharSequence)d.j)) {
                try {
                    d.j = q.b(var0, "mintegral_ua", "").toString();
                }
                catch (Throwable var22_1) {
                    h.b("CommonDeviceUtil", var22_1.getMessage(), var22_1);
                }
            }
            var2_2 = Looper.myLooper() == Looper.getMainLooper();
            if (!var2_2) ** GOTO lbl66
            h.a("CommonDeviceUtil", "get ua in mainThread");
            var3_3 = TextUtils.isEmpty((CharSequence)d.j);
            if (!var3_3) ** GOTO lbl60
            try {
                var17_4 = d.l();
                if (var17_4 > 17) {
                    try {
                        d.j = WebSettings.getDefaultUserAgent((Context)var0);
                    }
                    catch (Exception v0) {}
                    var19_5 = new StringBuilder();
                    var19_5.append("getDefaultUserAgent:");
                    var19_5.append(d.j);
                    h.a("CommonDeviceUtil", var19_5.toString());
                }
                ** GOTO lbl32
            }
            catch (Throwable var5_6) {
                var5_6.printStackTrace();
lbl32: // 2 sources:
                if (!(var6_7 = TextUtils.isEmpty((CharSequence)d.j))) break block21;
                try {
                    var13_8 = WebSettings.class.getDeclaredConstructor(new Class[]{Context.class, WebView.class});
                    var13_8.setAccessible(true);
                    d.j = ((WebSettings)var13_8.newInstance(new Object[]{var0, null})).getUserAgentString();
                    var13_8.setAccessible(false);
                    var14_9 = new StringBuilder();
                    var14_9.append("invoke getUserAgentString:");
                    var14_9.append(d.j);
                    h.a("CommonDeviceUtil", var14_9.toString());
                    ** GOTO lbl46
                }
                catch (Throwable var7_10) {
                    var7_10.printStackTrace();
lbl46: // 2 sources:
                    var8_11 = TextUtils.isEmpty((CharSequence)d.j);
                    if (!var8_11) ** GOTO lbl58
                    try {
                        d.j = new WebView(var0).getSettings().getUserAgentString();
                        var10_12 = new StringBuilder();
                        var10_12.append("getUserAgentString:");
                        var10_12.append(d.j);
                        h.a("CommonDeviceUtil", var10_12.toString());
                        ** GOTO lbl58
                    }
                    catch (Throwable var9_13) {
                        try {
                            block22 : {
                                var9_13.printStackTrace();
lbl58: // 3 sources:
                                if (!TextUtils.isEmpty((CharSequence)d.j)) break block21;
                                break block22;
lbl60: // 1 sources:
                                try {
                                    new Thread(new Runnable(){

                                        /*
                                         * Exception decompiling
                                         */
                                        public final void run() {
                                            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                                            // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
                                            // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
                                            // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
                                            // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
                                            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
                                            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
                                            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
                                            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
                                            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
                                            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
                                            // org.benf.cfr.reader.entities.g.p(Method.java:396)
                                            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
                                            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                                            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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
                                    }).start();
                                }
                                catch (Exception var4_14) {
                                    var4_14.printStackTrace();
                                }
                                break block21;
lbl66: // 1 sources:
                                h.a("CommonDeviceUtil", "get ua in subThread");
                            }
                            d.k();
                        }
                        catch (Throwable var1_15) {
                            h.b("CommonDeviceUtil", var1_15.getMessage(), var1_15);
                        }
                    }
                }
            }
        }
        d.f(var0);
        return d.j;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int z(Context context) {
        try {
            final Context context2 = f.f.a.e.c.a.i().e();
            if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
                return g;
            }
            if (context2 == null) {
                return g;
            }
            if (g != 0) {
                new Thread(new Runnable(){

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    public final void run() {
                        try {
                            if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
                                return;
                            }
                            if (context2 == null) {
                                return;
                            }
                            ConnectivityManager connectivityManager = (ConnectivityManager)context2.getSystemService("connectivity");
                            if (connectivityManager == null) {
                                return;
                            }
                            if (!f.f.a.e.b.b.b) return;
                            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                            if (networkInfo == null) {
                                g = 0;
                                return;
                            }
                            if (networkInfo.getType() == 1) {
                                g = 9;
                                return;
                            }
                            TelephonyManager telephonyManager = (TelephonyManager)context2.getSystemService("phone");
                            if (telephonyManager == null) {
                                g = 0;
                                return;
                            }
                            g = telephonyManager.getNetworkType();
                            return;
                        }
                        catch (Exception exception) {
                            h.b("CommonDeviceUtil", exception.getMessage(), exception);
                            g = 0;
                        }
                    }
                }).start();
                return g;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager)context2.getSystemService("connectivity");
            if (connectivityManager == null) {
                return g;
            }
            if (!f.f.a.e.b.b.b) {
                g = 0;
                return g;
            }
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo == null) {
                g = 0;
                return g;
            }
            if (networkInfo.getType() == 1) {
                g = 9;
                return g;
            }
            TelephonyManager telephonyManager = (TelephonyManager)context2.getSystemService("phone");
            if (telephonyManager == null) {
                g = 0;
                return g;
            }
            g = telephonyManager.getNetworkType();
            return d.a(g);
        }
        catch (Exception exception) {
            h.b("CommonDeviceUtil", exception.getMessage(), exception);
            g = 0;
            return g;
        }
    }

    public static String z() {
        if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
            return "";
        }
        return Build.USER;
    }

    static final class e {
        private static Object b;
        private static Class<?> c;
        private static Method d;
        private static Method e;
        private static Method f;
        private static Method g;
        final String a;

        static {
            try {
                c = Class.forName((String)"com.android.id.impl.IdProviderImpl");
                b = c.newInstance();
                d = c.getMethod("getUDID", new Class[]{Context.class});
                e = c.getMethod("getOAID", new Class[]{Context.class});
                f = c.getMethod("getVAID", new Class[]{Context.class});
                g = c.getMethod("getAAID", new Class[]{Context.class});
            }
            catch (Throwable throwable) {}
        }

        e(Context context) {
            e.a(context, d);
            this.a = e.a(context, e);
            e.a(context, f);
            e.a(context, g);
        }

        /*
         * Exception decompiling
         */
        private static String a(Context var0, Method var1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl24.1 : ACONST_NULL : trying to set 1 previously set to 0
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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
    }

}

