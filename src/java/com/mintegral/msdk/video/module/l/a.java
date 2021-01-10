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
package com.mintegral.msdk.video.module.l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import f.f.a.e.b.h.k.c;
import f.f.a.e.f.b;
import f.f.a.e.f.d;
import org.json.JSONObject;

public final class a
extends f.f.a.e.b.h.k.a {
    public a(Context context) {
        super(context);
    }

    @Override
    public final void a(String string2, c c2) {
        super.a(string2, c2);
        c2.a("platform", "1");
        c2.a("os_version", Build.VERSION.RELEASE);
        c2.a("package_name", d.x(this.a));
        c2.a("app_version_name", d.s(this.a));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.r(this.a));
        stringBuilder.append("");
        c2.a("app_version_code", stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(d.p(this.a));
        stringBuilder2.append("");
        c2.a("orientation", stringBuilder2.toString());
        c2.a("model", d.m());
        c2.a("brand", d.n());
        c2.a("gaid", "");
        c2.a("gaid2", d.t());
        c2.a("mnc", d.l(this.a));
        c2.a("mcc", d.k(this.a));
        int n2 = d.z(this.a);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(n2);
        stringBuilder3.append("");
        c2.a("network_type", stringBuilder3.toString());
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(d.a(this.a, n2));
        stringBuilder4.append("");
        c2.a("network_str", stringBuilder4.toString());
        c2.a("language", d.o(this.a));
        c2.a("timezone", d.q());
        c2.a("useragent", d.o());
        c2.a("sdk_version", "MAL_10.5.01");
        c2.a("gp_version", d.A(this.a));
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(d.u(this.a));
        stringBuilder5.append("x");
        stringBuilder5.append(d.v(this.a));
        c2.a("screen_size", stringBuilder5.toString());
        f.f.a.f.a a2 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
        if (a2 != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                String string3;
                if (a2.e() == 1) {
                    if (d.i(this.a) != null) {
                        jSONObject.put("imei", (Object)d.i(this.a));
                    }
                    if (d.q(this.a) != null) {
                        jSONObject.put("mac", (Object)d.q(this.a));
                    }
                }
                if (a2.f() == 1 && d.m(this.a) != null) {
                    jSONObject.put("android_id", (Object)d.m(this.a));
                }
                if (!TextUtils.isEmpty((CharSequence)jSONObject.toString()) && !TextUtils.isEmpty((CharSequence)(string3 = b.a(jSONObject.toString())))) {
                    c2.a("dvi", string3);
                    return;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}

