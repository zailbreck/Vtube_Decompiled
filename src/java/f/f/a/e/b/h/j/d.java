/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.e.b.h.j;

import android.text.TextUtils;
import f.f.a.e.f.h;

public final class d {
    private String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;

    private d() {
        this.a = "https://{}hb.rayjump.com";
        this.b = "https://analytics.rayjump.com";
        this.c = "https://net.rayjump.com";
        this.d = "https://setting.rayjump.com";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("/load");
        this.e = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.a);
        stringBuilder2.append("/bid");
        this.f = stringBuilder2.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(this.c);
        stringBuilder3.append("/openapi/ad/v3");
        this.g = stringBuilder3.toString();
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(this.c);
        stringBuilder4.append("/openapi/ad/v4");
        stringBuilder4.toString();
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(this.d);
        stringBuilder5.append("/setting");
        stringBuilder5.toString();
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append(this.d);
        stringBuilder6.append("/sdk/customid");
        stringBuilder6.toString();
        StringBuilder stringBuilder7 = new StringBuilder();
        stringBuilder7.append(this.d);
        stringBuilder7.append("/rewardsetting");
        this.h = stringBuilder7.toString();
        StringBuilder stringBuilder8 = new StringBuilder();
        stringBuilder8.append(this.d);
        stringBuilder8.append("/mapping");
        stringBuilder8.toString();
        StringBuilder stringBuilder9 = new StringBuilder();
        stringBuilder9.append(this.c);
        stringBuilder9.append("/image");
        stringBuilder9.toString();
        StringBuilder stringBuilder10 = new StringBuilder();
        stringBuilder10.append(this.d);
        stringBuilder10.append("/appwall/setting");
        stringBuilder10.toString();
    }

    /* synthetic */ d(a a2) {
    }

    public static d a() {
        return b.a;
    }

    public final String a(String string) {
        try {
            String[] arrstring;
            if (!TextUtils.isEmpty((CharSequence)string) && (arrstring = string.split("_")).length > 1) {
                String string2 = this.a(true, arrstring[1]);
                return string2;
            }
        }
        catch (Exception exception) {
            h.d("RequestUrlUtil", exception.getMessage());
        }
        if (TextUtils.isEmpty((CharSequence)string)) {
            return this.g;
        }
        return this.a(true, "");
    }

    public final String a(boolean bl, String string) {
        if (bl) {
            if (this.e.contains((CharSequence)"{}") && !TextUtils.isEmpty((CharSequence)string)) {
                String string2 = this.e;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("-");
                return string2.replace((CharSequence)"{}", (CharSequence)stringBuilder.toString());
            }
            return this.e.replace((CharSequence)"{}", (CharSequence)"");
        }
        return this.f.replace((CharSequence)"{}", (CharSequence)"");
    }

    private static final class b {
        private static final d a = new d(null);
    }

}

