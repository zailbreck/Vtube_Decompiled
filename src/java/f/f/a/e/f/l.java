/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.View
 *  android.view.WindowManager
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.net.URLEncoder
 *  java.text.DecimalFormat
 *  java.text.DecimalFormatSymbols
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Locale
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package f.f.a.e.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import f.f.a.a;
import f.f.a.e.d.n;
import f.f.a.e.f.h;
import f.f.a.e.f.r;
import f.f.a.f.c;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class l {
    static List<String> a;
    private static String b = "[\u4e00-\u9fa5]";
    private static int c;
    private static boolean d;

    static {
        Pattern.compile((String)b);
        c = 1;
        d = true;
    }

    public static double a(Double d2) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("format before num:");
            stringBuilder.append((Object)d2);
            h.b("CommonUtils", stringBuilder.toString());
            String string = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance((Locale)Locale.US)).format((Object)d2);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("format after format:");
            stringBuilder2.append(string);
            h.b("CommonUtils", stringBuilder2.toString());
            if (r.b(string)) {
                double d3 = Double.parseDouble((String)string);
                return d3;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0.0;
    }

    public static int a() {
        int n2 = c;
        c = n2 + 1;
        return n2;
    }

    public static int a(Context context, float f2) {
        float f3 = 2.5f;
        if (context != null) {
            try {
                float f4 = context.getResources().getDisplayMetrics().density;
                if (f4 != 0.0f) {
                    f3 = f4;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return (int)(0.5f + f2 / f3);
    }

    public static int a(Object object) {
        if (object != null) {
            try {
                if (object instanceof String) {
                    int n2 = Integer.parseInt((String)((String)object));
                    return n2;
                }
            }
            catch (Throwable throwable) {
                h.b("CommonUtils", throwable.getMessage(), throwable);
            }
        }
        return 0;
    }

    /*
     * Exception decompiling
     */
    public static long a(File var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl54.1 : LLOAD_1 : trying to set 0 previously set to 1
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

    public static String a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        String string = f.f.a.e.c.a.i().f();
        f.f.a.f.a a2 = c.b().a(string);
        if (a2 == null) {
            a2 = c.b().a();
        }
        int n2 = a2.c();
        if (jSONArray.length() > n2) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < n2; ++i2) {
                try {
                    jSONArray2.put(jSONArray.get(i2));
                    continue;
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                }
            }
            return jSONArray2.toString();
        }
        return jSONArray.toString();
    }

    public static void a(View view) {
        if (view == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                view.setSystemUiVisibility(4102);
                return;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void a(List<f.f.a.e.e.a> list) {
        if (list != null) {
            if (list.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int n2 = list.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                f.f.a.e.e.a a2 = (f.f.a.e.e.a)list.get(i2);
                if ((l.a(f.f.a.e.c.a.i().e(), a2.g()) || a2.z0() != 99) && !l.a(a2)) continue;
                arrayList.add((Object)a2);
            }
            n.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e())).a((List<f.f.a.e.e.a>)arrayList);
        }
    }

    public static boolean a(Context context) {
        return d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(Context context, String string) {
        List<String> list = a;
        if (list != null) {
            return list.contains((Object)string);
        }
        a = new ArrayList();
        try {
            PackageManager packageManager = context.getPackageManager();
            if (f.f.a.e.c.a.f == null || f.f.a.e.c.a.f.size() == 0) {
                f.f.a.e.c.a.f = new ArrayList();
                List list2 = packageManager.getInstalledPackages(0);
                List<String> list3 = f.f.a.e.c.a.i().b();
                for (int i2 = 0; i2 < list2.size(); ++i2) {
                    List<String> list4;
                    String string2;
                    PackageInfo packageInfo = (PackageInfo)list2.get(i2);
                    if ((1 & packageInfo.applicationInfo.flags) <= 0) {
                        list4 = f.f.a.e.c.a.f;
                        string2 = packageInfo.packageName;
                    } else {
                        if (list3 == null || list3.size() <= 0 || !list3.contains((Object)packageInfo.packageName)) continue;
                        list4 = f.f.a.e.c.a.f;
                        string2 = packageInfo.packageName;
                    }
                    list4.add((Object)string2);
                }
            }
            int n2 = 0;
            while (n2 < f.f.a.e.c.a.f.size()) {
                String string3 = (String)f.f.a.e.c.a.f.get(n2);
                a.add((Object)string3);
                ++n2;
            }
            return a.contains((Object)string);
        }
        catch (Throwable throwable) {
            if (!a.a) return false;
            throwable.printStackTrace();
            return false;
        }
    }

    public static boolean a(f.f.a.e.e.a a2) {
        if (a2 != null) {
            return true ^ TextUtils.isEmpty((CharSequence)a2.I());
        }
        return false;
    }

    public static <T extends String> boolean a(T t2) {
        return t2 == null || t2.length() == 0;
        {
        }
    }

    public static double b(String string) {
        try {
            if (!TextUtils.isEmpty((CharSequence)string)) {
                double d2 = Double.parseDouble((String)string);
                return d2;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0.0;
    }

    public static float b(Context context) {
        if (context != null) {
            try {
                float f2 = context.getResources().getDisplayMetrics().density;
                if (f2 == 0.0f) {
                    return 2.5f;
                }
                return f2;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return 2.5f;
    }

    public static int b(Context context, float f2) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        if (resources == null) {
            return 0;
        }
        return (int)(0.5f + f2 * resources.getDisplayMetrics().density);
    }

    public static List<String> b(JSONArray jSONArray) {
        block5 : {
            if (jSONArray != null) {
                ArrayList arrayList;
                int n2;
                try {
                    if (jSONArray.length() <= 0) break block5;
                    arrayList = new ArrayList();
                    n2 = 0;
                }
                catch (Throwable throwable) {
                    h.b("CommonUtils", throwable.getMessage(), throwable);
                }
                do {
                    block6 : {
                        if (n2 >= jSONArray.length()) break;
                        String string = jSONArray.optString(n2);
                        if (!r.b(string)) break block6;
                        arrayList.add((Object)string);
                    }
                    ++n2;
                } while (true);
                return arrayList;
            }
        }
        return null;
    }

    public static boolean b(f.f.a.e.e.a a2) {
        if (a2 != null) {
            try {
                int n2 = a2.N0();
                return n2 == 1;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return false;
    }

    public static float c(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static String c(String string) {
        try {
            if (r.b(string)) {
                String string2 = URLEncoder.encode((String)string, (String)"utf-8");
                return string2;
            }
        }
        catch (Throwable throwable) {
            h.b("CommonUtils", throwable.getMessage(), throwable);
        }
        return "";
    }

    public static int d(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            int n2 = l.j((Context)context).heightPixels;
            return n2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public static int e(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            int n2 = l.j((Context)context).widthPixels;
            return n2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public static int f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            int n2 = context.getResources().getDisplayMetrics().widthPixels;
            return n2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public static int g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            int n2 = context.getResources().getDisplayMetrics().heightPixels;
            return n2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public static int h(Context context) {
        if (context != null) {
            return 0;
        }
        try {
            if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") != 0) {
                int n2 = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
                int n3 = context.getResources().getDimensionPixelSize(n2);
                return n3;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean i(Context context) {
        Throwable throwable;
        boolean bl;
        block6 : {
            if (context == null) {
                return false;
            }
            Resources resources = context.getResources();
            int n2 = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            bl = n2 > 0 ? resources.getBoolean(n2) : false;
            try {
                Class class_ = Class.forName((String)"android.os.SystemProperties");
                String string = (String)class_.getMethod("get", new Class[]{String.class}).invoke((Object)class_, new Object[]{"qemu.hw.mainkeys"});
                if ("1".equals((Object)string)) {
                    return false;
                }
                boolean bl2 = "0".equals((Object)string);
                if (!bl2) return bl;
                return true;
            }
            catch (Throwable throwable2) {}
            break block6;
            catch (Throwable throwable3) {
                throwable = throwable3;
                bl = false;
            }
        }
        h.b("CommonUtils", throwable.getMessage(), throwable);
        return bl;
    }

    private static DisplayMetrics j(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Display display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
            Class.forName((String)"android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke((Object)display, new Object[]{displayMetrics});
            return displayMetrics;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return context.getResources().getDisplayMetrics();
        }
    }
}

