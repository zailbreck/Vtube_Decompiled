/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URLEncoder
 */
package com.mintegral.msdk.video.bt.module.g;

import android.content.Context;
import android.text.TextUtils;
import com.mintegral.msdk.base.common.report.e$b;
import com.mintegral.msdk.base.common.report.e$c;
import com.mintegral.msdk.video.bt.module.g.e;
import f.f.a.e.b.h.g;
import f.f.a.e.b.h.j.d;
import f.f.a.e.b.h.k.c;
import f.f.a.e.f.h;
import java.net.URLEncoder;

public class e {
    private static final String a = "com.mintegral.msdk.video.bt.module.g.e";

    static /* synthetic */ String a() {
        return a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, f.f.a.e.e.a a2, String string) {
        if (context == null) return;
        if (a2 == null) return;
        try {
            String string2;
            if (TextUtils.isEmpty((CharSequence)string)) return;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000054&");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("network_type=");
            stringBuilder.append(f.f.a.e.f.d.z(context));
            stringBuilder.append("&");
            stringBuffer.append(stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("unit_id=");
            stringBuilder2.append(string);
            stringBuilder2.append("&");
            stringBuffer.append(stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("cid=");
            stringBuilder3.append(a2.e());
            stringBuilder3.append("&");
            stringBuffer.append(stringBuilder3.toString());
            stringBuffer.append("reason=&");
            stringBuffer.append("result=2&");
            if (a2 != null && a2.m() == 287) {
                string2 = "ad_type=3&";
            } else {
                string2 = "ad_type=1&";
                if (a2 != null) {
                    a2.m();
                }
            }
            stringBuffer.append(string2);
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("creative=");
            stringBuilder4.append(URLEncoder.encode((String)a2.i1()));
            stringBuilder4.append("&");
            stringBuffer.append(stringBuilder4.toString());
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append("devid=");
            stringBuilder5.append(f.f.a.e.f.d.s());
            stringBuilder5.append("&");
            stringBuffer.append(stringBuilder5.toString());
            if (a2 != null) {
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append("rid_n=");
                stringBuilder6.append(a2.M0());
                stringBuffer.append(stringBuilder6.toString());
            }
            if (com.mintegral.msdk.base.common.report.a.b().a()) {
                com.mintegral.msdk.base.common.report.a.b().a(stringBuffer.toString());
                return;
            }
            e.a(context, stringBuffer.toString(), string);
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, f.f.a.e.e.a a2, String string, String string2) {
        if (context == null || a2 == null) return;
        {
            try {
                boolean bl = !TextUtils.isEmpty((CharSequence)string);
                if (!(bl & (true ^ TextUtils.isEmpty((CharSequence)string2)))) return;
                {
                    String string3;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("network_type=");
                    stringBuilder.append(f.f.a.e.f.d.z(context));
                    stringBuilder.append("&");
                    stringBuffer.append(stringBuilder.toString());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("unit_id=");
                    stringBuilder2.append(string);
                    stringBuilder2.append("&");
                    stringBuffer.append(stringBuilder2.toString());
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("cid=");
                    stringBuilder3.append(a2.e());
                    stringBuilder3.append("&");
                    stringBuffer.append(stringBuilder3.toString());
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("reason=");
                    stringBuilder4.append(string2);
                    stringBuilder4.append("&");
                    stringBuffer.append(stringBuilder4.toString());
                    stringBuffer.append("result=1&");
                    StringBuilder stringBuilder5 = new StringBuilder();
                    stringBuilder5.append("creative=");
                    stringBuilder5.append(URLEncoder.encode((String)a2.i1()));
                    stringBuilder5.append("&");
                    stringBuffer.append(stringBuilder5.toString());
                    StringBuilder stringBuilder6 = new StringBuilder();
                    stringBuilder6.append("devid=");
                    stringBuilder6.append(f.f.a.e.f.d.s());
                    stringBuilder6.append("&");
                    stringBuffer.append(stringBuilder6.toString());
                    if (a2 != null && a2.m() == 287) {
                        string3 = "ad_type=3&";
                    } else {
                        string3 = "ad_type=1&";
                        if (a2 != null) {
                            a2.m();
                        }
                    }
                    stringBuffer.append(string3);
                    if (a2 != null) {
                        StringBuilder stringBuilder7 = new StringBuilder();
                        stringBuilder7.append("rid_n=");
                        stringBuilder7.append(a2.M0());
                        stringBuffer.append(stringBuilder7.toString());
                    }
                    if (com.mintegral.msdk.base.common.report.a.b().a()) {
                        com.mintegral.msdk.base.common.report.a.b().a(stringBuffer.toString());
                        return;
                    }
                    e.a(context, stringBuffer.toString(), string);
                    return;
                }
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    private static void a(Context context, String string, String string2) {
        if (context != null && !TextUtils.isEmpty((CharSequence)string) && !TextUtils.isEmpty((CharSequence)string2)) {
            try {
                e$b e$b = new e$b(context);
                c c2 = com.mintegral.msdk.base.common.report.e.a(string, context, string2);
                e$b.b(0, d.a().b, c2, new e$c(){

                    public final void a(String string) {
                        h.d(e.a(), string);
                    }

                    public final void b(String string) {
                        h.d(e.a(), string);
                    }
                });
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                h.d(a, exception.getMessage());
            }
        }
    }
}

