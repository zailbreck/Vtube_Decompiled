/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package f.f.a.e.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import f.f.a.e.c.a;
import f.f.a.e.f.h;
import java.io.File;

public final class c {
    private static int a = -1;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int a() {
        Context context = a.i().e();
        try {
            Intent intent = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int[] arrn = new int[2];
            if (intent != null) {
                arrn[0] = intent.getIntExtra("level", 50);
                arrn[1] = intent.getIntExtra("plugged", 0);
                boolean bl = arrn[1] != 0;
                c.a(bl);
                arrn[0] = c.a(arrn[0], arrn[1]);
                c.a(arrn[0]);
                return arrn[0];
            } else {
                arrn[0] = 50;
                arrn[1] = 0;
            }
            return arrn[0];
        }
        catch (Exception exception) {
            int n2 = a;
            if (n2 == -1) return 50;
            return n2;
        }
    }

    private static int a(int n2, int n3) {
        String string = Build.MODEL;
        if (!(string.equalsIgnoreCase("SCH-i909") || string.equalsIgnoreCase("SCH-I535") || string.equalsIgnoreCase("SCH-W899"))) {
            if (!(string.trim().toUpperCase().contains((CharSequence)"XT702") || string.trim().toUpperCase().contains((CharSequence)"XT907") || string.trim().toUpperCase().contains((CharSequence)"XT1058") || string.trim().toUpperCase().contains((CharSequence)"XT1080") || !Build.MANUFACTURER.equalsIgnoreCase("motorola"))) {
                File file;
                File file2 = new File("/sys/class/power_supply/battery/charge_counter");
                int n4 = file2.exists() ? Integer.parseInt((String)c.a(file2)) : 0;
                if (n4 <= 0 && (file = new File("/sys/class/power_supply/battery/capacity")).exists()) {
                    Integer.parseInt((String)c.a(file));
                }
                if (n4 <= 100 && n4 > 0 && n2 % 10 == 0) {
                    n2 = n4;
                }
            }
        } else if (n2 > 100) {
            n2 /= 10;
        }
        if (n2 > 100) {
            if (n3 != 0 && n2 < 110) {
                return 100;
            }
            while ((n2 /= 10) > 100) {
            }
        }
        return n2;
    }

    /*
     * Exception decompiling
     */
    private static String a(File var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl52 : ALOAD_1 : trying to set 1 previously set to 0
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

    private static void a(int n2) {
        Class<c> class_ = c.class;
        synchronized (c.class) {
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return;
        }
    }

    private static void a(int n2, char[] arrc, StringBuilder stringBuilder) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrc[i2] == '\n' || arrc[i2] == '\r') continue;
            stringBuilder.append(arrc[i2]);
        }
    }

    private static void a(boolean bl) {
        Class<c> class_ = c.class;
        synchronized (c.class) {
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return;
        }
    }

    public static int b() {
        int n2;
        Context context = a.i().e();
        int n3 = 1;
        try {
            n2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("status", n3);
        }
        catch (Throwable throwable) {
            h.b("BatteryStatusUtil", throwable.getMessage(), throwable);
            n2 = 0;
        }
        if (n2 != 2) {
            if (n2 == 5) {
                return n3;
            }
            n3 = 0;
        }
        return n3;
    }
}

