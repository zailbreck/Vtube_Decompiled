/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  f.f.a.e.b.b
 *  f.f.a.e.b.h.k.a
 *  f.f.a.e.b.h.k.c
 *  f.f.a.e.b.h.k.d
 *  f.f.a.e.f.d
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.h;

import android.content.Context;
import android.os.Build;
import f.f.a.e.b.b;
import f.f.a.e.b.h.k.a;
import f.f.a.e.b.h.k.c;
import f.f.a.e.b.h.k.d;

public final class b$e
extends a {
    public b$e(Context context) {
        super(context);
    }

    public final void a(String string, c c2) {
        super.a(string, c2);
        c2.a("platform", "1");
        c2.a("os_version", Build.VERSION.RELEASE);
        c2.a("package_name", f.f.a.e.f.d.x((Context)this.a));
        c2.a("app_version_name", f.f.a.e.f.d.s((Context)this.a));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f.f.a.e.f.d.r((Context)this.a));
        stringBuilder.append("");
        c2.a("app_version_code", stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(f.f.a.e.f.d.p((Context)this.a));
        stringBuilder2.append("");
        c2.a("orientation", stringBuilder2.toString());
        c2.a("model", f.f.a.e.f.d.m());
        c2.a("brand", f.f.a.e.f.d.n());
        c2.a("gaid", "");
        c2.a("gaid2", f.f.a.e.f.d.t());
        c2.a("mnc", f.f.a.e.f.d.l((Context)this.a));
        c2.a("mcc", f.f.a.e.f.d.k((Context)this.a));
        int n2 = f.f.a.e.f.d.z((Context)this.a);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(n2);
        stringBuilder3.append("");
        c2.a("network_type", stringBuilder3.toString());
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(f.f.a.e.f.d.a((Context)this.a, (int)n2));
        stringBuilder4.append("");
        c2.a("network_str", stringBuilder4.toString());
        c2.a("language", f.f.a.e.f.d.o((Context)this.a));
        c2.a("timezone", f.f.a.e.f.d.q());
        c2.a("useragent", f.f.a.e.f.d.o());
        c2.a("sdk_version", "MAL_10.5.01");
        c2.a("gp_version", f.f.a.e.f.d.A((Context)this.a));
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(f.f.a.e.f.d.u((Context)this.a));
        stringBuilder5.append("x");
        stringBuilder5.append(f.f.a.e.f.d.v((Context)this.a));
        c2.a("screen_size", stringBuilder5.toString());
        c2.a("is_clever", b.d);
        d.a((c)c2, (Context)this.a);
        d.a((c)c2);
    }
}

