/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ContentResolver
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ProviderInfo
 *  android.content.pm.ResolveInfo
 *  android.database.Cursor
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  com.mintegral.msdk.activity.MTGCommonActivity
 *  com.mintegral.msdk.base.common.report.e
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.ref.WeakReference
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package f.f.a.h;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import com.mintegral.msdk.activity.MTGCommonActivity;
import f.f.a.e.d.e;
import f.f.a.e.d.h;
import f.f.a.h.a$c;
import f.f.a.h.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    private static volatile b b;
    private WeakReference<Context> a;

    private b(Context context) {
        new Handler(Looper.getMainLooper()){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final void handleMessage(Message message) {
                if (message.what != 10000) {
                    return;
                }
                try {
                    int n2 = message.arg1;
                    Object object = message.obj;
                    boolean bl = object instanceof String;
                    String string = null;
                    if (bl) {
                        string = (String)object;
                    }
                    b.a(b.this, n2, string);
                    return;
                }
                catch (Exception exception) {
                    if (f.f.a.a.a) {
                        exception.printStackTrace();
                    }
                    return;
                }
            }
        };
        this.a = new WeakReference((Object)context);
    }

    private Cursor a(String string, String string2, Context context) {
        return context.getContentResolver().query(Uri.parse((String)string), new String[]{"title"}, "title=?", new String[]{string2}, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b a(Context context) {
        if (b != null) return b;
        Class<b> class_ = b.class;
        synchronized (b.class) {
            if (b != null) return b;
            b = new b(context);
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return b;
        }
    }

    private void a(Activity activity) {
        if (activity != null) {
            activity.finish();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(Context var1, f.f.a.e.e.a var2_3, int var3_2) {
        block3 : {
            var4_4 = new Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
            var4_4.putExtra("android.intent.extra.shortcut.NAME", var2_3.c());
            var6_5 = new Intent(var1, MTGCommonActivity.class);
            var6_5.setAction("android.intent.action.VIEW");
            var4_4.putExtra("android.intent.extra.shortcut.INTENT", (Parcelable)var6_5);
            var1.sendBroadcast(var4_4);
            var9_6 = e.a(h.a(var1));
            var10_7 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
            if (var10_7 == null) {
                var10_7 = f.f.a.f.c.b().a();
            }
            var11_8 = var10_7.E();
            if (b.super.a("com.android.launcher.permission.READ_SETTINGS") || b.super.a("com.google.android.launcher.permission.READ_SETTINGS")) break block3;
            b.super.a(var2_3, 2, -1);
            var13_9 = new ContentValues();
            ** GOTO lbl22
        }
        var12_10 = b.super.b(var2_3.c()) < var3_2;
        if (var12_10) {
            b.super.a(var2_3, 2, 1);
            var2_3.p(1);
            var13_9 = new ContentValues();
lbl22: // 2 sources:
            var13_9.put("is_deleted", Integer.valueOf((int)1));
            var9_6.a(var2_3.e(), var13_9);
        } else {
            b.super.a(var2_3, 2, 0);
        }
        var9_6.c(var11_8);
    }

    private void a(Context context, f.f.a.f.a a2) {
        List<f.f.a.e.e.a> list;
        if (!TextUtils.isEmpty((CharSequence)a2.E()) && (list = e.a(h.a(context)).a(a2.E(), 0)) != null && list.size() > 0 && b.super.a("com.android.launcher.permission.UNINSTALL_SHORTCUT")) {
            for (f.f.a.e.e.a a3 : list) {
                int n2 = b.super.b(a3.c());
                Context context2 = (Context)this.a.get();
                if (context2 == null || !(!b.super.a("com.android.launcher.permission.READ_SETTINGS") && !b.super.a("com.google.android.launcher.permission.READ_SETTINGS") ? b.super.a("com.android.launcher.permission.UNINSTALL_SHORTCUT") : b.super.a(context2, a3.c()))) continue;
                b.super.a(context2, a3, n2);
            }
        }
    }

    private void a(f.f.a.e.e.a a2, int n2, int n3) {
        if (this.a.get() != null && a2.c0() != 1) {
            com.mintegral.msdk.base.common.report.e.a((Context)((Context)this.a.get()), (f.f.a.e.e.a)a2, (int)n2, (int)n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static /* synthetic */ void a(b b2, int n2, String string) {
        try {
            final Context context = (Context)b2.a.get();
            if (context == null) {
                return;
            }
            f.f.a.f.a a2 = null;
            if (string != null) {
                a2 = f.f.a.f.c.b().a(string);
            }
            if (a2 == null) {
                a2 = f.f.a.f.c.b().a();
            }
            if (!b2.b(a2)) return;
            new Handler().postDelayed(new Runnable(){

                public final void run() {
                    f.f.a.f.a a2 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
                    if (a2 == null) {
                        a2 = f.f.a.f.c.b().a();
                    }
                    if (a2.D() == 1) {
                        f.f.a.h.a.a().a(context, f.f.a.h.a.c, new a$c(this, a2){
                            final /* synthetic */ f.f.a.f.a a;
                            final /* synthetic */ c b;
                            {
                                this.b = c2;
                                this.a = a2;
                            }

                            public final void a() {
                                c c2 = this.b;
                                b.b(c2.b.this, c2.context, this.a);
                            }

                            public final void a(int n2, String string) {
                            }

                            public final void a(List<f.f.a.e.e.a> list) {
                                if (list != null && list.size() > 0) {
                                    this.b.b.this.a((f.f.a.e.e.a)list.get(0), null);
                                }
                            }
                        });
                    }
                }
            }, (long)n2);
            return;
        }
        catch (Exception exception) {
            if (!f.f.a.a.a) return;
            exception.printStackTrace();
        }
    }

    static /* synthetic */ void a(b b2, Activity activity) {
        b2.a(activity);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static /* synthetic */ void a(b b2, Context context, Bitmap bitmap, f.f.a.e.e.a a2, Activity activity) {
        if (!TextUtils.isEmpty((CharSequence)a2.c()) && bitmap != null) {
            try {
                Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                intent.putExtra("android.intent.extra.shortcut.NAME", a2.c());
                intent.putExtra("duplicate", false);
                intent.putExtra("android.intent.extra.shortcut.ICON", (Parcelable)Bitmap.createScaledBitmap((Bitmap)bitmap, (int)140, (int)140, (boolean)true));
                Intent intent2 = new Intent(context, MTGCommonActivity.class);
                intent2.putExtra("intent_flag", "shortcuts");
                JSONObject jSONObject = null;
                try {
                    jSONObject = f.f.a.e.e.a.a(a2);
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                }
                if (jSONObject != null) {
                    intent2.putExtra("intent_jsonobject", jSONObject.toString());
                }
                intent2.setFlags(32768);
                intent.putExtra("android.intent.extra.shortcut.INTENT", (Parcelable)intent2);
                context.sendBroadcast(intent);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        b2.a(activity);
    }

    static /* synthetic */ void a(b b2, Context context, f.f.a.f.a a2) {
        b2.a(context, a2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static /* synthetic */ void a(b var0_2, f.f.a.e.e.a var1_1, f.f.a.f.a var2_4, e var3_3, int var4) {
        block2 : {
            var1_1.a(0L);
            if (var0_2.a("com.android.launcher.permission.READ_SETTINGS") || var0_2.a("com.google.android.launcher.permission.READ_SETTINGS")) break block2;
            var1_1.n(1);
            var0_2.a(var1_1, 1, -1);
            var1_1.n(-1);
            ** GOTO lbl16
        }
        var5_5 = var0_2.b(var1_1.c()) > var4;
        if (var5_5) {
            var1_1.n(1);
            var3_3.a(var1_1, var2_4.E(), 0);
            var0_2.a(var1_1, 1, 1);
            var1_1.n(-1);
        } else {
            var1_1.n(0);
lbl16: // 2 sources:
            var3_3.a(var1_1, var2_4.E(), 0);
        }
        f.f.a.e.a.a.a.a().a("mtg_shortcuts_ctime", String.valueOf((long)System.currentTimeMillis()));
    }

    private boolean a(Context context, String string) {
        boolean bl;
        bl = false;
        if (context != null) {
            if (TextUtils.isEmpty((CharSequence)string)) {
                return false;
            }
            boolean bl2 = TextUtils.isEmpty(null);
            String string2 = null;
            if (bl2) {
                string2 = b.super.b(context);
            }
            boolean bl3 = TextUtils.isEmpty(string2);
            bl = false;
            if (!bl3) {
                Cursor cursor;
                block10 : {
                    cursor = b.super.a(string2, string, context);
                    bl = false;
                    if (cursor == null) break block10;
                    try {
                        int n2 = cursor.getCount();
                        bl = false;
                        if (n2 <= 0) break block10;
                        bl = true;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                if (cursor != null) {
                    if (!cursor.isClosed()) {
                        cursor.close();
                        return bl;
                    }
                }
            }
        }
        return bl;
    }

    static /* synthetic */ boolean a(b b2, String string) {
        return b2.a(string);
    }

    private boolean a(String string) {
        Context context = (Context)this.a.get();
        boolean bl = false;
        if (context != null) {
            int n2 = context.getPackageManager().checkPermission(string, context.getPackageName());
            bl = false;
            if (n2 == 0) {
                bl = true;
            }
        }
        return bl;
    }

    static /* synthetic */ int b(b b2, String string) {
        return b2.b(string);
    }

    private int b(String string) {
        Context context = (Context)this.a.get();
        if (context != null) {
            if (!b.super.a("com.android.launcher.permission.READ_SETTINGS") && !b.super.a("com.google.android.launcher.permission.READ_SETTINGS")) {
                return 0;
            }
            String string2 = b.super.b(context);
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                Cursor cursor;
                block9 : {
                    cursor = b.super.a(string2, string, context);
                    if (cursor == null) break block9;
                    try {
                        if (cursor.getCount() <= 0) break block9;
                        return cursor.getCount();
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                if (cursor != null) {
                    if (!cursor.isClosed()) {
                        cursor.close();
                        return 0;
                    }
                }
            }
        }
        return 0;
    }

    private String b(Context context) {
        String string = b.super.b(context, "com.android.launcher.permission.READ_SETTINGS");
        if (string == null || string.trim().equals((Object)"")) {
            String string2 = this.b();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(".permission.READ_SETTINGS");
            string = b.super.b(context, stringBuilder.toString());
        }
        if (TextUtils.isEmpty((CharSequence)string)) {
            int n2 = Build.VERSION.SDK_INT;
            string = n2 < 8 ? "com.android.launcher.settings" : (n2 < 19 ? "com.android.launcher2.settings" : "com.android.launcher3.settings");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("content://");
        stringBuilder.append(string);
        stringBuilder.append("/favorites?notify=true");
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private String b(Context var1, String var2_2) {
        block8 : {
            if (TextUtils.isEmpty((CharSequence)var2_2)) {
                return "";
            }
            try {
                var4_3 = var1.getPackageManager().getInstalledPackages(8);
                if (var4_3 == null) {
                    return "";
                }
                var5_4 = var4_3.iterator();
                do lbl-1000: // 2 sources:
                {
                    if (var5_4.hasNext() == false) return "";
                    var6_8 = ((PackageInfo)var5_4.next()).providers;
                    if (var6_8 == null) ** GOTO lbl-1000
                    var7_7 = var6_8.length;
                    var8_5 = 0;
                    break block8;
                    break;
                } while (true);
            }
            catch (Exception var3_10) {
                var3_10.printStackTrace();
            }
            return "";
        }
        do {
            if (var8_5 >= var7_7) ** continue;
            var9_6 = var6_8[var8_5];
            if (!b.super.a("com.android.launcher.permission.READ_SETTINGS")) {
                var2_2 = "com.google.android.launcher.permission.READ_SETTINGS";
            }
            if ((var2_2.equals((Object)var9_6.readPermission) || var2_2.equals((Object)var9_6.writePermission)) && !TextUtils.isEmpty((CharSequence)var9_6.authority) && var9_6.authority.contains((CharSequence)".launcher.settings")) {
                return var9_6.authority;
            }
            ++var8_5;
        } while (true);
    }

    static /* synthetic */ void b(b b2, Context context, f.f.a.f.a a2) {
        b2.a(context, a2);
    }

    private boolean b(f.f.a.f.a a2) {
        if (a2 == null) {
            return false;
        }
        int n2 = a2.C();
        long l2 = System.currentTimeMillis();
        long l3 = 0L;
        if (!f.f.a.e.a.a.a.a().a("mtg_shortcuts_ctime").equals((Object)"")) {
            l3 = Long.parseLong((String)f.f.a.e.a.a.a.a().a("mtg_shortcuts_ctime"));
        }
        return (l2 - l3) / 1000L > (long)n2;
    }

    public final int a() {
        List<f.f.a.e.e.a> list;
        Context context = (Context)this.a.get();
        if (context == null) {
            return 0;
        }
        e e2 = e.a(h.a(context));
        f.f.a.f.a a2 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
        if (a2 == null) {
            a2 = f.f.a.f.c.b().a();
        }
        if ((list = e2.a(a2.E(), 0)) != null && list.size() > 0) {
            return list.size();
        }
        return 0;
    }

    public final void a(f.f.a.e.e.a a2, Activity activity) {
        boolean bl;
        Context context;
        block9 : {
            context = (Context)this.a.get();
            if (context == null) {
                return;
            }
            if (context == null) {
                bl = false;
            } else {
                e e2 = e.a(h.a(context));
                f.f.a.f.a a3 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
                if (a3 == null) {
                    a3 = f.f.a.f.c.b().a();
                }
                List<f.f.a.e.e.a> list = e2.a(a3.E(), 0);
                bl = false;
                if (list != null) {
                    int n2 = list.size();
                    bl = false;
                    if (n2 > 0) {
                        f.f.a.e.e.a a4;
                        Iterator iterator = list.iterator();
                        do {
                            boolean bl2 = iterator.hasNext();
                            bl = false;
                            if (!bl2) break block9;
                        } while (!(a4 = (f.f.a.e.e.a)iterator.next()).e().equals((Object)a2.e()) || !a4.c().equals((Object)a2.c()));
                        bl = true;
                    }
                }
            }
        }
        if (bl) {
            b.super.a(activity);
            return;
        }
        if (!TextUtils.isEmpty((CharSequence)a2.d())) {
            f.f.a.e.b.d.b.a(context).a(a2.d(), new f.f.a.e.b.d.c((b)this, activity, context, a2){
                final /* synthetic */ Activity b;
                final /* synthetic */ Context c;
                final /* synthetic */ f.f.a.e.e.a d;
                final /* synthetic */ b e;
                {
                    this.e = b2;
                    this.b = activity;
                    this.c = context;
                    this.d = a2;
                }

                public final void a(Bitmap bitmap, String string) {
                    e e2 = e.a(h.a(this.c));
                    f.f.a.f.a a2 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
                    if (a2 == null) {
                        a2 = f.f.a.f.c.b().a();
                    }
                    b.a(this.e, this.c, a2);
                    if (b.a(this.e, "com.android.launcher.permission.INSTALL_SHORTCUT")) {
                        int n2 = b.b(this.e, this.d.c());
                        b.a(this.e, this.c, bitmap, this.d, this.b);
                        b.a(this.e, this.d, a2, e2, n2);
                    }
                }

                public final void a(String string, String string2) {
                    b.a(this.e, this.b);
                }
            });
            return;
        }
        b.super.a(activity);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(f.f.a.f.a a2) {
        Context context;
        block7 : {
            context = (Context)this.a.get();
            if (context != null) break block7;
            return;
        }
        e e2 = e.a(h.a(context));
        List<f.f.a.e.e.a> list = e2.a(a2.E(), 0);
        if (list == null) return;
        try {
            if (list.size() <= 0) return;
            for (f.f.a.e.e.a a3 : list) {
                if (a3.a0() != 0 || a3.c0() != 0) continue;
                if (b.super.b(a3.c()) != 0) {
                    b.super.a(a3, 1, 1);
                    f.f.a.e.a.a.a.a().a("mtg_shortcuts_ctime", String.valueOf((long)System.currentTimeMillis()));
                } else {
                    b.super.a(a3, 1, 0);
                }
                a3.n(-1);
                ContentValues contentValues = new ContentValues();
                contentValues.put("is_add_sucesful", Integer.valueOf((int)a3.a0()));
                e2.a(a3.e(), contentValues);
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final String b() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        Context context = (Context)this.a.get();
        if (context == null) {
            return "";
        }
        ResolveInfo resolveInfo = context.getPackageManager().resolveActivity(intent, 0);
        if (resolveInfo != null) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo == null) {
                return "";
            }
            if (activityInfo.packageName.equals((Object)"android")) {
                return "";
            }
            return resolveInfo.activityInfo.packageName;
        }
        return "";
    }

    public final void b(f.f.a.e.e.a a2, Activity activity) {
        if (Build.VERSION.SDK_INT < 26) {
            Context context = (Context)this.a.get();
            if (context == null) {
                return;
            }
            f.f.a.f.a a3 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
            if (a3 == null) {
                a3 = f.f.a.f.c.b().a();
            }
            if (b.super.b(a3) && a3.D() == 1) {
                f.f.a.h.a.a().a(context, a2, new a$c((b)this, activity, context, a3){
                    final /* synthetic */ Activity a;
                    final /* synthetic */ Context b;
                    final /* synthetic */ f.f.a.f.a c;
                    final /* synthetic */ b d;
                    {
                        this.d = b2;
                        this.a = activity;
                        this.b = context;
                        this.c = a2;
                    }

                    public final void a() {
                        b.b(this.d, this.b, this.c);
                        b.a(this.d, this.a);
                    }

                    public final void a(int n2, String string) {
                        b.a(this.d, this.a);
                    }

                    public final void a(List<f.f.a.e.e.a> list) {
                        if (list != null && list.size() > 0) {
                            WeakReference weakReference = new WeakReference((Object)this.a);
                            if (weakReference.get() != null) {
                                Activity activity = (Activity)weakReference.get();
                                this.d.a((f.f.a.e.e.a)list.get(0), activity);
                                return;
                            }
                        } else {
                            b.a(this.d, this.a);
                        }
                    }
                });
                return;
            }
            f.f.a.h.a.a().a(context, a2, 1);
        }
        b.super.a(activity);
    }

    public final String c() {
        boolean bl = this.a("com.android.launcher.permission.INSTALL_SHORTCUT");
        String string = "1";
        String string2 = bl ? string : "0";
        String string3 = this.a("com.android.launcher.permission.UNINSTALL_SHORTCUT") ? string : "0";
        if (!this.a("com.android.launcher.permission.READ_SETTINGS") && !this.a("com.google.android.launcher.permission.READ_SETTINGS")) {
            string = "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(string2);
        stringBuilder.append(",");
        stringBuilder.append(string3);
        stringBuilder.append(",");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}

