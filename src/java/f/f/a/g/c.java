/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.webkit.MimeTypeMap
 *  android.widget.Toast
 *  com.mintegral.msdk.base.common.report.d
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package f.f.a.g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import f.f.a.e.f.d;
import f.f.a.e.f.h;
import f.f.a.e.f.q;
import f.f.a.f.a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class c {
    static Handler a = new Handler(Looper.getMainLooper()){

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void handleMessage(Message message) {
            String string;
            int n2;
            int n3;
            String string2;
            block5 : {
                block4 : {
                    super.handleMessage(message);
                    try {
                        if (message.what != 1000) {
                            return;
                        }
                        n3 = message.arg1;
                        n2 = message.arg2;
                        Bundle bundle = message.getData();
                        string = "";
                        if (bundle == null) break block4;
                        string = bundle.getString("rid");
                        string2 = bundle.getString("cid");
                        break block5;
                    }
                    catch (Throwable throwable) {
                        if (f.f.a.a.a) {
                            throwable.printStackTrace();
                        }
                        return;
                    }
                }
                string2 = string;
            }
            new com.mintegral.msdk.base.common.report.d(f.f.a.e.c.a.i().e()).a(n3, n2, string, string2);
        }
    };

    private static String a(File file) {
        String string = file.getName();
        String string2 = string.substring(1 + string.lastIndexOf("."), string.length()).toLowerCase();
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(string2);
    }

    public static String a(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return "";
        }
        if (string.lastIndexOf("/") == -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string.hashCode());
            stringBuilder.append("");
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string.hashCode() + string.substring(1 + string.lastIndexOf("/")).hashCode());
        stringBuilder.append("");
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(String string, String string2, String string3) {
        block6 : {
            if (!TextUtils.isEmpty((CharSequence)string)) break block6;
            return string;
        }
        String string4 = Uri.parse((String)string).getHost();
        f.f.a.f.a a2 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
        if (a2 == null) return string;
        Map<String, a.a> map = a2.s();
        if (map == null) return string;
        try {
            String string5;
            if (TextUtils.isEmpty((CharSequence)string4)) return string;
            Iterator iterator = map.entrySet().iterator();
            do {
                if (!iterator.hasNext()) return string;
            } while (TextUtils.isEmpty((CharSequence)(string5 = (String)((Map.Entry)iterator.next()).getKey())) || !string4.contains((CharSequence)string5));
            a.a a3 = (a.a)map.get((Object)string5);
            string = c.a(string, a3.d(), String.valueOf((float)d.v(f.f.a.e.c.a.i().e())));
            string = c.a(string, a3.c(), String.valueOf((float)d.u(f.f.a.e.c.a.i().e())));
            string = c.a(string, a3.a(), string2);
            return c.a(string, a3.b(), string3);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return string;
    }

    private static String a(String string, List<String> list, String string2) {
        if (list != null) {
            for (String string3 : list) {
                if (TextUtils.isEmpty((CharSequence)string3)) continue;
                string = string.replaceAll(string3, string2);
            }
        }
        return string;
    }

    private static void a(int n2, int n3, String string, String string2) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                new com.mintegral.msdk.base.common.report.d(f.f.a.e.c.a.i().e()).a(n2, n3, string, string2);
                return;
            }
            Message message = Message.obtain();
            message.what = 1000;
            message.arg1 = n2;
            message.arg2 = n3;
            Bundle bundle = new Bundle();
            bundle.putString("rid", string);
            bundle.putString("cid", string2);
            message.setData(bundle);
            a.sendMessage(message);
            return;
        }
        catch (Throwable throwable) {
            if (f.f.a.a.a) {
                throwable.printStackTrace();
            }
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public static void a(Context var0, Uri var1, String var2, String var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl183 : ILOAD : trying to set 1 previously set to 0
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, String string) {
        if (string != null) {
            if (context == null) {
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
                intent.addFlags(268435456);
                ResolveInfo resolveInfo = context.getPackageManager().resolveActivity(intent, 65536);
                if (resolveInfo != null) {
                    intent.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
                }
                context.startActivity(intent);
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                catch (Exception exception2) {
                    exception2.printStackTrace();
                }
            }
        }
    }

    public static void a(Context context, String string, String string2) {
        try {
            Context context2 = f.f.a.e.c.a.i().e();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("downloadType");
            q.a(context2, stringBuilder.toString(), 3);
            c.a(context, string);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string2);
            stringBuilder2.append("downloadType");
            int n2 = (Integer)q.b(context, stringBuilder2.toString(), -1);
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string2);
            stringBuilder3.append("linkType");
            int n3 = (Integer)q.b(context, stringBuilder3.toString(), -1);
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(string2);
            stringBuilder4.append("rid");
            String string3 = (String)q.b(context, stringBuilder4.toString(), "");
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(string2);
            stringBuilder5.append("cid");
            c.a(n2, n3, string3, (String)q.b(context, stringBuilder5.toString(), ""));
            return;
        }
        catch (Throwable throwable) {
            if (f.f.a.a.a) {
                throwable.printStackTrace();
            }
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public static boolean b(Context var0, String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl24.1 : ICONST_0 : trying to set 1 previously set to 0
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

    public static boolean c(Context context, String string) {
        try {
            if (!TextUtils.isEmpty((CharSequence)string)) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)string)));
                return true;
            }
        }
        catch (Throwable throwable) {
            h.b("SDKCLICK", throwable.getMessage(), throwable);
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void d(Context context, String string) {
        ResolveInfo resolveInfo;
        Intent intent;
        if (TextUtils.isEmpty((CharSequence)string) || !c.b(context, string) || (intent = context.getPackageManager().getLaunchIntentForPackage(string)) == null) return;
        List list = context.getPackageManager().queryIntentActivities(intent, 0);
        if (list == null) return;
        if (list.size() <= 0 || (resolveInfo = (ResolveInfo)list.iterator().next()) == null) return;
        try {
            ComponentName componentName = new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            Intent intent2 = new Intent();
            intent2.setComponent(componentName);
            intent2.addFlags(268435456);
            context.startActivity(intent2);
            return;
        }
        catch (Exception exception) {
            Toast.makeText((Context)context, (CharSequence)"The app connot start up", (int)0).show();
            exception.printStackTrace();
        }
    }

}

