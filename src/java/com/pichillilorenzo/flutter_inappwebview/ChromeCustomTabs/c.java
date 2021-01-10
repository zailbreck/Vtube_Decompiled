/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.d;
import java.util.ArrayList;
import java.util.List;

public class c {
    private static String a;

    /*
     * Enabled aggressive block sorting
     */
    public static String a(Context context) {
        Intent intent;
        String string;
        String string2 = a;
        if (string2 != null) {
            return string2;
        }
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveInfo = packageManager.resolveActivity(intent = new Intent("android.intent.action.VIEW", Uri.parse((String)"http://www.example.com")), 0);
        String string3 = resolveInfo != null ? resolveInfo.activityInfo.packageName : null;
        List list = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo2 : list) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo2.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) == null) continue;
            arrayList.add((Object)resolveInfo2.activityInfo.packageName);
        }
        if (arrayList.isEmpty()) {
            a = null;
            return a;
        }
        if (arrayList.size() == 1) {
            string = (String)arrayList.get(0);
        } else {
            if (!TextUtils.isEmpty((CharSequence)string3) && !c.b(context, intent) && arrayList.contains((Object)string3)) {
                a = string3;
                return a;
            }
            string = "com.android.chrome";
            if (!(arrayList.contains((Object)string) || arrayList.contains((Object)(string = "com.chrome.beta")) || arrayList.contains((Object)(string = "com.chrome.dev")))) {
                string = "com.google.android.apps.chrome";
                if (!arrayList.contains((Object)string)) return a;
            }
        }
        a = string;
        return a;
    }

    public static void a(Context context, Intent intent) {
        intent.putExtra("android.support.customtabs.extra.KEEP_ALIVE", (Parcelable)new Intent().setClassName(context.getPackageName(), d.class.getCanonicalName()));
    }

    /*
     * Exception decompiling
     */
    private static boolean b(Context var0, Intent var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl51 : ICONST_0 : trying to set 1 previously set to 0
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
}

