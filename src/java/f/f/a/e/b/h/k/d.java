/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONObject
 */
package f.f.a.e.b.h.k;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import f.f.a.e.b.b;
import f.f.a.e.b.h.k.c;
import f.f.a.e.f.h;
import f.f.a.e.f.j;
import f.f.a.e.f.l;
import f.f.a.f.a;
import org.json.JSONObject;

public final class d {
    private static String a = "";
    private static String b = "";

    public static void a(c c2) {
        c2.a("api_version", b.a);
    }

    public static void a(c c2, Context context) {
        if (f.f.a.e.c.b.b.b().a("authority_general_data")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(l.a(context, "com.tencent.mm"));
            stringBuilder.append("");
            c2.a("has_wx", stringBuilder.toString());
            f.f.a.e.c.b.b.b();
            if (f.f.a.e.a.a.a.a().a("authority_dnt", 0) == 1) {
                c2.a("dnt", "1");
            }
        }
        if (f.f.a.e.c.b.b.b().a("authority_other")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(j.c());
            stringBuilder.append("");
            c2.a("cache1", stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(j.a());
            stringBuilder2.append("");
            c2.a("cache2", stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(f.f.a.e.f.c.a());
            stringBuilder3.append("");
            c2.a("power_rate", stringBuilder3.toString());
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(f.f.a.e.f.c.b());
            stringBuilder4.append("");
            c2.a("charging", stringBuilder4.toString());
        }
        c2.a("pkg_source", f.f.a.e.f.d.a(f.f.a.e.f.d.x(context), context));
        if (Build.VERSION.SDK_INT > 18) {
            c2.a("http_req", "2");
        }
        d.a(c2, true);
        d.e(c2);
        d.c(c2);
        a a2 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
        if (a2 == null) {
            a2 = f.f.a.f.c.b().a();
        }
        if (a2.z()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f.f.a.e.c.b.b.b().a());
            stringBuilder.append("");
            c2.a("gdpr_consent", stringBuilder.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(c c2, boolean bl) {
        Context context = f.f.a.e.c.a.i().e();
        a a2 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
        if (a2 == null) return;
        JSONObject jSONObject = new JSONObject();
        try {
            if (a2.e() == 1) {
                String string = f.f.a.e.f.d.i(context);
                if (string != null && f.f.a.e.c.b.b.b().a("authority_imei_mac")) {
                    jSONObject.put("imei", (Object)f.f.a.e.f.d.i(context));
                }
                if (f.f.a.e.f.d.q(context) != null && f.f.a.e.c.b.b.b().a("authority_imei_mac")) {
                    jSONObject.put("mac", (Object)f.f.a.e.f.d.q(context));
                }
                if (f.f.a.e.f.d.j(context) != null && bl && f.f.a.e.c.b.b.b().a("authority_imei_mac")) {
                    jSONObject.put("imsi", (Object)f.f.a.e.f.d.j(context));
                }
            }
            if (a2.H() == 1 && bl && f.f.a.e.f.d.h(context) != null && f.f.a.e.c.b.b.b().a("authority_device_id")) {
                jSONObject.put("oaid", (Object)f.f.a.e.f.d.h(context));
            }
            if (a2.f() == 1 && f.f.a.e.f.d.m(context) != null && f.f.a.e.c.b.b.b().a("authority_android_id")) {
                jSONObject.put("android_id", (Object)f.f.a.e.f.d.m(context));
            }
            if (f.f.a.e.c.b.b.b().a("authority_general_data")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(f.f.a.e.f.d.u());
                stringBuilder.append("");
                jSONObject.put("cid", (Object)stringBuilder.toString());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(f.f.a.e.f.d.h());
                stringBuilder2.append("");
                jSONObject.put("dmt", (Object)stringBuilder2.toString());
                jSONObject.put("dmf", f.f.a.e.f.d.g());
                jSONObject.put("ct", (Object)f.f.a.e.f.d.f());
            }
            if (TextUtils.isEmpty((CharSequence)jSONObject.toString())) return;
            if (!jSONObject.equals((Object)a)) {
                b = f.f.a.e.f.b.a(jSONObject.toString());
            }
            if (TextUtils.isEmpty((CharSequence)b)) return;
            c2.a("dvi", b);
            return;
        }
        catch (Exception exception) {
            h.d("CommonRequestParamsForAdd", exception.getMessage());
        }
    }

    public static void b(c c2) {
        d.a(c2, false);
        d.e(c2);
        d.c(c2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(c c2) {
        try {
            boolean bl;
            boolean bl2 = TextUtils.isEmpty((CharSequence)b.k);
            if (bl2) {
                b.k = f.f.a.e.a.a.a.a().a("sys_id");
            }
            if (!TextUtils.isEmpty((CharSequence)b.k)) {
                c2.a("sys_id", b.k);
            }
            if (bl = TextUtils.isEmpty((CharSequence)b.l)) {
                b.l = f.f.a.e.a.a.a.a().a("bkup_id");
            }
            if (TextUtils.isEmpty((CharSequence)b.l)) return;
            c2.a("bkup_id", b.l);
            return;
        }
        catch (Exception exception) {
            h.d("CommonRequestParamsForAdd", exception.getMessage());
        }
    }

    public static void d(c c2) {
        if (c2 != null) {
            if (!f.f.a.e.c.b.b.b().a("authority_general_data")) {
                c2.a("model");
                c2.a("brand");
                c2.a("screen_size");
                c2.a("sub_ip");
                c2.a("network_type");
                c2.a("useragent");
                c2.a("ua");
                c2.a("language");
                c2.a("network_str");
                c2.a("mnc");
                c2.a("mcc");
                c2.a("os_version");
                c2.a("gp_version");
            }
            if (!f.f.a.e.c.b.b.b().a("authority_other")) {
                c2.a("cache1");
                c2.a("cache2");
                c2.a("power_rate");
                c2.a("charging");
                c2.a("timezone");
            }
            if (!f.f.a.e.c.b.b.b().a("authority_device_id")) {
                c2.a("gaid");
                c2.a("gaid2");
                c2.a("oaid");
            }
        }
    }

    private static void e(c c2) {
        int n2 = f.f.a.e.f.d.p();
        if (n2 != -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n2);
            stringBuilder.append("");
            c2.a("unknown_source", stringBuilder.toString());
        }
    }
}

