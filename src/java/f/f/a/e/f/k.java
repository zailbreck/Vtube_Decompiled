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
 *  android.os.Process
 *  android.text.TextUtils
 *  android.util.Log
 *  com.mintegral.msdk.optimize.a
 *  com.mintegral.msdk.optimize.b
 *  java.io.File
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 */
package f.f.a.e.f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import f.f.a.a;
import f.f.a.e.b.c.e;
import f.f.a.e.f.f;
import f.f.a.e.f.h;
import f.f.a.e.f.q;
import f.f.a.e.f.s;
import f.f.a.m.g;
import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public final class k {
    public static boolean a;

    public static String a(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return null;
        }
        File file = e.a(f.f.a.e.b.c.c.g);
        boolean bl = TextUtils.isEmpty((CharSequence)string);
        String string2 = "";
        if (!bl) {
            if (string.lastIndexOf("/") == -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string.hashCode());
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string.hashCode() + string.substring(1 + string.lastIndexOf("/")).hashCode());
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
            }
        }
        return new File(file, string2).getAbsolutePath();
    }

    public static void a(Context context, f.f.a.e.e.a a2, String string, boolean bl) {
        String string2 = a2 != null && !TextUtils.isEmpty((CharSequence)a2.g()) ? a2.g() : string;
        try {
            File file = f.a("/apk", context, new boolean[1]);
            String string3 = f.f.a.g.c.a(string);
            com.mintegral.msdk.optimize.b b2 = new com.mintegral.msdk.optimize.b(bl, a2, context, string2, string){};
            com.mintegral.msdk.optimize.a.a((File)file, (String)string3, (String)string, (com.mintegral.msdk.optimize.b)b2);
            return;
        }
        catch (Throwable throwable) {
            f.f.a.g.c.a(f.f.a.e.c.a.i().e(), string, string2);
            return;
        }
    }

    public static void a(Context context, String string, f.f.a.e.e.a a2, f.f.a.m.f f2) {
        if (context == null) {
            return;
        }
        if (a) {
            k.a(context, string, f2);
            return;
        }
        try {
            Class.forName((String)"com.mintegral.msdk.activity.MTGCommonActivity");
            Intent intent = new Intent(context, Class.forName((String)"com.mintegral.msdk.activity.MTGCommonActivity"));
            if (TextUtils.isEmpty((CharSequence)string)) {
                return;
            }
            if (d.b(string)) {
                string = string.replace((CharSequence)"market://details?id=", (CharSequence)"");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("https://play.google.com/store/apps/details?id=");
                stringBuilder.append(string);
                string = stringBuilder.toString();
            }
            h.b("SDKUtil", "openInnerBrowserUrl = openurl");
            intent.putExtra("url", string);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("webview url = ");
            stringBuilder.append(string);
            h.b("url", stringBuilder.toString());
            intent.setFlags(268435456);
            intent.putExtra("mvcommon", (Serializable)a2);
            context.startActivity(intent);
            return;
        }
        catch (Exception exception) {
            k.a(context, string, f2);
            h.b("MTGCommonActivity", "", exception);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, String string, f.f.a.m.f f2) {
        if (string != null) {
            if (context == null) {
                return;
            }
            try {
                if (d.b(string)) {
                    string = string.replace((CharSequence)"market://details?id=", (CharSequence)"");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("https://play.google.com/store/apps/details?id=");
                    stringBuilder.append(string);
                    string = stringBuilder.toString();
                }
                h.b("SDKUtil", "openBrowserUrl = openurl");
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
                intent.addFlags(268435456);
                ResolveInfo resolveInfo = context.getPackageManager().resolveActivity(intent, 65536);
                if (resolveInfo != null) {
                    intent.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
                }
                context.startActivity(intent);
                k.a(f2);
                return;
            }
            catch (Exception exception) {
                h.d("SDKUtil", "openBrowserUrl = error");
                exception.printStackTrace();
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
                    intent.addFlags(268468224);
                    context.startActivity(intent);
                    k.a(f2);
                    return;
                }
                catch (Exception exception2) {
                    h.d("SDKUtil", "openBrowserUrl = error2");
                    exception2.printStackTrace();
                }
            }
        }
    }

    private static void a(final f.f.a.e.e.a a2, final String string, final boolean bl) {
        String string2 = a2 != null && !TextUtils.isEmpty((CharSequence)a2.g()) ? a2.g() : string;
        try {
            k.a(string, 2, a2);
            Context context = f.f.a.e.c.a.i().e();
            if (!s.b(context)) {
                f.f.a.g.c.a(context, string, string2);
                return;
            }
            Context context2 = f.f.a.e.c.a.i().e();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("isDowning");
            q.a(context2, stringBuilder.toString(), System.currentTimeMillis());
            Context context3 = f.f.a.e.c.a.i().e();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string2);
            stringBuilder2.append("process");
            q.a(context3, stringBuilder2.toString(), Process.myPid());
            new Thread(new Runnable(){

                public final void run() {
                    k.a(f.f.a.e.c.a.i().e(), a2, string, bl);
                }
            }).start();
            return;
        }
        catch (Throwable throwable) {
            if (a.a) {
                throwable.printStackTrace();
            }
            return;
        }
    }

    public static void a(f.f.a.m.f f2) {
        if (f2 instanceof g) {
            ((g)f2).c();
        }
    }

    public static void a(String string, int n2, f.f.a.e.e.a a2) {
        if (a2 != null && !TextUtils.isEmpty((CharSequence)a2.g())) {
            string = a2.g();
        }
        Context context = f.f.a.e.c.a.i().e();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("downloadType");
        q.a(context, stringBuilder.toString(), n2);
        if (a2 != null) {
            Context context2 = f.f.a.e.c.a.i().e();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string);
            stringBuilder2.append("linkType");
            q.a(context2, stringBuilder2.toString(), a2.l0());
            Context context3 = f.f.a.e.c.a.i().e();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string);
            stringBuilder3.append("rid");
            q.a(context3, stringBuilder3.toString(), a2.M0());
            Context context4 = f.f.a.e.c.a.i().e();
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(string);
            stringBuilder4.append("cid");
            q.a(context4, stringBuilder4.toString(), a2.e());
            return;
        }
        Context context5 = f.f.a.e.c.a.i().e();
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(string);
        stringBuilder5.append("linkType");
        q.a(context5, stringBuilder5.toString(), -1);
        Context context6 = f.f.a.e.c.a.i().e();
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append(string);
        stringBuilder6.append("rid");
        q.a(context6, stringBuilder6.toString(), "");
        Context context7 = f.f.a.e.c.a.i().e();
        StringBuilder stringBuilder7 = new StringBuilder();
        stringBuilder7.append(string);
        stringBuilder7.append("cid");
        q.a(context7, stringBuilder7.toString(), "");
    }

    /*
     * Exception decompiling
     */
    public static void a(String var0, String var1, f.f.a.e.e.a var2, boolean var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl175 : GETSTATIC : trying to set 1 previously set to 0
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

    public static final class d {
        private static Intent a(Context context) {
            return new Intent("android.intent.action.VIEW", Uri.parse((String)"market://details?id=com.package.name"));
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static boolean a(Context context, String string, f.f.a.m.f f2) {
            List<ResolveInfo> list;
            block6 : {
                block7 : {
                    try {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("try google play: url = ");
                        stringBuilder.append(string);
                        h.d("SDKUtil", stringBuilder.toString());
                        list = d.b(context);
                        if (list == null) {
                            return false;
                        }
                        if (list.size() <= 0) {
                            return false;
                        }
                        if (d.b(string)) break block6;
                        if (!d.c(string)) break block7;
                        String string2 = string.substring(string.indexOf("details?id="));
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("market://");
                        stringBuilder2.append(string2);
                        string = stringBuilder2.toString();
                        break block6;
                    }
                    catch (Throwable throwable) {
                        h.d("SDKUtil", Log.getStackTraceString((Throwable)throwable));
                        return false;
                    }
                }
                string = null;
            }
            if (TextUtils.isEmpty((CharSequence)string)) {
                return false;
            }
            Intent intent = d.a(context);
            intent.setData(Uri.parse((String)string));
            intent.addFlags(268435456);
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!((ResolveInfo)iterator.next()).activityInfo.packageName.equals((Object)"com.android.vending")) continue;
                intent.setPackage("com.android.vending");
                break;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("open google play: details = ");
            stringBuilder.append(string);
            h.b("SDKUtil", stringBuilder.toString());
            context.startActivity(intent);
            k.a(f2);
            return true;
        }

        public static boolean a(String string) {
            return d.b(string) || d.c(string);
            {
            }
        }

        private static List<ResolveInfo> b(Context context) {
            try {
                List list = context.getPackageManager().queryIntentActivities(d.a(context), 0);
                return list;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return null;
            }
        }

        public static boolean b(String string) {
            try {
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    boolean bl = Uri.parse((String)string).getScheme().equals((Object)"market");
                    return bl;
                }
            }
            catch (Throwable throwable) {
                h.d("SDKUtil", Log.getStackTraceString((Throwable)throwable));
            }
            return false;
        }

        private static boolean c(String string) {
            block4 : {
                try {
                    boolean bl;
                    block6 : {
                        block5 : {
                            if (TextUtils.isEmpty((CharSequence)string)) break block4;
                            Uri uri = Uri.parse((String)string);
                            if (uri.getHost().equals((Object)"play.google.com")) break block5;
                            boolean bl2 = uri.getHost().equals((Object)"market.android.com");
                            bl = false;
                            if (!bl2) break block6;
                        }
                        bl = true;
                    }
                    return bl;
                }
                catch (Throwable throwable) {
                    h.d("SDKUtil", Log.getStackTraceString((Throwable)throwable));
                }
            }
            return false;
        }
    }

}

