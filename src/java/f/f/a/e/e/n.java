/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.net.URLEncoder
 */
package f.f.a.e.e;

import android.content.Context;
import android.text.TextUtils;
import f.f.a.e.c.b.b;
import f.f.a.e.e.a;
import f.f.a.e.f.d;
import f.f.a.e.f.l;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class n {
    public static int D = 1;
    public static int E;
    private String A;
    private String B;
    private int C;
    private String a;
    private String b;
    private String c;
    private String d;
    private int e;
    private String f;
    private int g;
    private int h;
    private int i;
    private String j;
    private String k;
    private int l;
    private int m;
    private String n;
    private long o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public n() {
        this.C = 0;
    }

    public n(Context context, a a2, int n2, String string, long l2, int n3) {
        this.C = 0;
        if (n3 != 1 && n3 != 287 && n3 != 94) {
            if (n3 == 95) {
                this.d = "2000025";
            }
        } else {
            this.d = "2000022";
        }
        this.e = d.z(context);
        this.f = d.a(context, this.e);
        this.i = a2.Z0();
        try {
            String string2 = a2.u0() == null ? a2.F() : a2.u0();
            this.j = URLEncoder.encode((String)string2, (String)"utf-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        }
        this.m = n2;
        this.n = string;
        if (l2 == 0L) {
            l2 = a2.c1();
        }
        this.o = l2;
    }

    public n(String string, int n2, String string2, String string3, String string4) {
        this.C = 0;
        this.d = string;
        this.f = string4;
        this.e = n2;
        try {
            this.j = URLEncoder.encode((String)string2, (String)"utf-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        }
        this.k = string3;
    }

    public n(String string, int n2, String string2, String string3, String string4, String string5, String string6, String string7) {
        this.C = 0;
        this.d = string;
        this.m = n2;
        this.n = string2;
        try {
            this.y = URLEncoder.encode((String)string3, (String)"utf-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        }
        this.r = string4;
        this.q = string5;
        this.k = string6;
        this.x = string7;
        if (Integer.valueOf((String)string2) > 60000) {
            this.m = 2;
        }
    }

    public n(String string, String string2, String string3, String string4, int n2) {
        this.C = 0;
        this.d = string;
        this.r = string2;
        this.p = string3;
        this.q = string4;
        this.e = n2;
    }

    public n(String string, String string2, String string3, String string4, int n2, int n3, String string5) {
        this.C = 0;
        this.d = string;
        this.r = string2;
        this.p = string3;
        this.q = string4;
        this.e = n2;
        this.k = string5;
        this.l = n3;
    }

    public static String a(n n2) {
        if (n2 != null) {
            StringBuffer stringBuffer = new StringBuffer();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("key=");
            stringBuilder.append(n2.d);
            stringBuilder.append("&");
            stringBuffer.append(stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("cid=");
            stringBuilder2.append(n2.r);
            stringBuilder2.append("&");
            stringBuffer.append(stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("unit_id=");
            stringBuilder3.append(n2.q);
            stringBuilder3.append("&");
            stringBuffer.append(stringBuilder3.toString());
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("network_type=");
            stringBuilder4.append(n2.e);
            stringBuilder4.append("&");
            stringBuffer.append(stringBuilder4.toString());
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append("mraid_type=");
            stringBuilder5.append(n2.C);
            stringBuilder5.append("&");
            stringBuffer.append(stringBuilder5.toString());
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append("rid_n=");
            stringBuilder6.append(n2.p);
            stringBuffer.append(stringBuilder6.toString());
            stringBuffer.append("\n");
            return stringBuffer.toString();
        }
        return null;
    }

    public static String b(n n2) {
        if (n2 != null) {
            StringBuffer stringBuffer = new StringBuffer();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("key=");
            stringBuilder.append(n2.d);
            stringBuilder.append("&");
            stringBuffer.append(stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("result=");
            stringBuilder2.append(n2.m);
            stringBuilder2.append("&");
            stringBuffer.append(stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("duration=");
            stringBuilder3.append(n2.n);
            stringBuilder3.append("&");
            stringBuffer.append(stringBuilder3.toString());
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("endcard_url=");
            stringBuilder4.append(n2.y);
            stringBuilder4.append("&");
            stringBuffer.append(stringBuilder4.toString());
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append("cid=");
            stringBuilder5.append(n2.r);
            stringBuilder5.append("&");
            stringBuffer.append(stringBuilder5.toString());
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append("reason=");
            stringBuilder6.append(n2.k);
            stringBuilder6.append("&");
            stringBuffer.append(stringBuilder6.toString());
            StringBuilder stringBuilder7 = new StringBuilder();
            stringBuilder7.append("type=");
            stringBuilder7.append(n2.x);
            stringBuilder7.append("&");
            stringBuffer.append(stringBuilder7.toString());
            StringBuilder stringBuilder8 = new StringBuilder();
            stringBuilder8.append("ad_type=");
            stringBuilder8.append(n2.B);
            stringBuilder8.append("&");
            stringBuffer.append(stringBuilder8.toString());
            StringBuilder stringBuilder9 = new StringBuilder();
            stringBuilder9.append("unit_id=");
            stringBuilder9.append(n2.q);
            stringBuilder9.append("&");
            stringBuffer.append(stringBuilder9.toString());
            StringBuilder stringBuilder10 = new StringBuilder();
            stringBuilder10.append("devid=");
            stringBuilder10.append(n2.b);
            stringBuilder10.append("&");
            stringBuffer.append(stringBuilder10.toString());
            StringBuilder stringBuilder11 = new StringBuilder();
            stringBuilder11.append("mraid_type=");
            stringBuilder11.append(n2.C);
            stringBuilder11.append("&");
            stringBuffer.append(stringBuilder11.toString());
            StringBuilder stringBuilder12 = new StringBuilder();
            stringBuilder12.append("network_type=");
            stringBuilder12.append(n2.e);
            stringBuilder12.append("&");
            stringBuffer.append(stringBuilder12.toString());
            if (n2.a != null) {
                StringBuilder stringBuilder13 = new StringBuilder();
                stringBuilder13.append("resource_type=");
                stringBuilder13.append(n2.a);
                stringBuilder13.append("&");
                stringBuffer.append(stringBuilder13.toString());
            }
            StringBuilder stringBuilder14 = new StringBuilder();
            stringBuilder14.append("rid_n=");
            stringBuilder14.append(n2.p);
            stringBuffer.append(stringBuilder14.toString());
            stringBuffer.append("\n");
            return stringBuffer.toString();
        }
        return null;
    }

    public static String c(n n2) {
        if (n2 != null) {
            StringBuffer stringBuffer = new StringBuffer();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("key=");
            stringBuilder.append(n2.d);
            stringBuilder.append("&");
            stringBuffer.append(stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("result=");
            stringBuilder2.append(n2.m);
            stringBuilder2.append("&");
            stringBuffer.append(stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("duration=");
            stringBuilder3.append(n2.n);
            stringBuilder3.append("&");
            stringBuffer.append(stringBuilder3.toString());
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("cid=");
            stringBuilder4.append(n2.r);
            stringBuilder4.append("&");
            stringBuffer.append(stringBuilder4.toString());
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append("unit_id=");
            stringBuilder5.append(n2.q);
            stringBuilder5.append("&");
            stringBuffer.append(stringBuilder5.toString());
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append("reason=");
            stringBuilder6.append(n2.k);
            stringBuilder6.append("&");
            stringBuffer.append(stringBuilder6.toString());
            StringBuilder stringBuilder7 = new StringBuilder();
            stringBuilder7.append("ad_type=");
            stringBuilder7.append(n2.B);
            stringBuilder7.append("&");
            stringBuffer.append(stringBuilder7.toString());
            StringBuilder stringBuilder8 = new StringBuilder();
            stringBuilder8.append("rid_n=");
            stringBuilder8.append(n2.p);
            stringBuilder8.append("&");
            stringBuffer.append(stringBuilder8.toString());
            StringBuilder stringBuilder9 = new StringBuilder();
            stringBuilder9.append("network_type=");
            stringBuilder9.append(n2.e);
            stringBuilder9.append("&");
            stringBuffer.append(stringBuilder9.toString());
            StringBuilder stringBuilder10 = new StringBuilder();
            stringBuilder10.append("mraid_type=");
            stringBuilder10.append(n2.C);
            stringBuilder10.append("&");
            stringBuffer.append(stringBuilder10.toString());
            StringBuilder stringBuilder11 = new StringBuilder();
            stringBuilder11.append("devid=");
            stringBuilder11.append(n2.b);
            stringBuilder11.append("&");
            stringBuffer.append(stringBuilder11.toString());
            if (n2.a != null) {
                StringBuilder stringBuilder12 = new StringBuilder();
                stringBuilder12.append("resource_type=");
                stringBuilder12.append(n2.a);
                stringBuilder12.append("&");
                stringBuffer.append(stringBuilder12.toString());
            }
            if (!TextUtils.isEmpty((CharSequence)n2.y)) {
                StringBuilder stringBuilder13 = new StringBuilder();
                stringBuilder13.append("endcard_url=");
                stringBuilder13.append(n2.y);
                stringBuilder13.append("&");
                stringBuffer.append(stringBuilder13.toString());
            }
            StringBuilder stringBuilder14 = new StringBuilder();
            stringBuilder14.append("type=");
            stringBuilder14.append(n2.x);
            stringBuffer.append(stringBuilder14.toString());
            return stringBuffer.toString();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String d(n n2) {
        if (n2 == null) return null;
        try {
            String string;
            StringBuffer stringBuffer = new StringBuffer();
            boolean bl = b.b().a("authority_general_data");
            if (bl) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("key=");
                stringBuilder.append(n2.d);
                stringBuilder.append("&");
                stringBuffer.append(stringBuilder.toString());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("error=");
                stringBuilder2.append(l.c(n2.u));
                stringBuilder2.append("&");
                stringBuffer.append(stringBuilder2.toString());
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("template_url=");
                stringBuilder3.append(l.c(n2.s));
                stringBuilder3.append("&");
                stringBuffer.append(stringBuilder3.toString());
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("unit_id=");
                stringBuilder4.append(l.c(n2.q));
                stringBuilder4.append("&");
                stringBuffer.append(stringBuilder4.toString());
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append("cid=");
                stringBuilder5.append(l.c(n2.r));
                stringBuilder5.append("&");
                stringBuffer.append(stringBuilder5.toString());
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append("network_str=");
                stringBuilder6.append(n2.f);
                stringBuilder6.append("&");
                stringBuffer.append(stringBuilder6.toString());
                StringBuilder stringBuilder7 = new StringBuilder();
                stringBuilder7.append("network_type=");
                stringBuilder7.append(n2.e);
                string = stringBuilder7.toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("key=");
                stringBuilder.append(n2.d);
                stringBuilder.append("&");
                stringBuffer.append(stringBuilder.toString());
                StringBuilder stringBuilder8 = new StringBuilder();
                stringBuilder8.append("error=");
                stringBuilder8.append(l.c(n2.u));
                stringBuilder8.append("&");
                stringBuffer.append(stringBuilder8.toString());
                StringBuilder stringBuilder9 = new StringBuilder();
                stringBuilder9.append("template_url=");
                stringBuilder9.append(l.c(n2.s));
                stringBuilder9.append("&");
                stringBuffer.append(stringBuilder9.toString());
                StringBuilder stringBuilder10 = new StringBuilder();
                stringBuilder10.append("unit_id=");
                stringBuilder10.append(l.c(n2.q));
                stringBuilder10.append("&");
                stringBuffer.append(stringBuilder10.toString());
                StringBuilder stringBuilder11 = new StringBuilder();
                stringBuilder11.append("cid=");
                stringBuilder11.append(l.c(n2.r));
                stringBuilder11.append("&");
                string = stringBuilder11.toString();
            }
            stringBuffer.append(string);
            return stringBuffer.toString();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String e(n n2) {
        if (n2 == null) return null;
        try {
            String string;
            StringBuffer stringBuffer = new StringBuffer();
            boolean bl = b.b().a("authority_general_data");
            if (bl) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("key=");
                stringBuilder.append(n2.d);
                stringBuilder.append("&");
                stringBuffer.append(stringBuilder.toString());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("event=");
                stringBuilder2.append(l.c(n2.v));
                stringBuilder2.append("&");
                stringBuffer.append(stringBuilder2.toString());
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("template=");
                stringBuilder3.append(l.c(n2.t));
                stringBuilder3.append("&");
                stringBuffer.append(stringBuilder3.toString());
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("layout=");
                stringBuilder4.append(l.c(n2.w));
                stringBuilder4.append("&");
                stringBuffer.append(stringBuilder4.toString());
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append("unit_id=");
                stringBuilder5.append(l.c(n2.q));
                stringBuilder5.append("&");
                stringBuffer.append(stringBuilder5.toString());
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append("cid=");
                stringBuilder6.append(l.c(n2.r));
                stringBuilder6.append("&");
                stringBuffer.append(stringBuilder6.toString());
                StringBuilder stringBuilder7 = new StringBuilder();
                stringBuilder7.append("network_str=");
                stringBuilder7.append(n2.f);
                stringBuilder7.append("&");
                stringBuffer.append(stringBuilder7.toString());
                StringBuilder stringBuilder8 = new StringBuilder();
                stringBuilder8.append("network_type=");
                stringBuilder8.append(n2.e);
                string = stringBuilder8.toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("key=");
                stringBuilder.append(n2.d);
                stringBuilder.append("&");
                stringBuffer.append(stringBuilder.toString());
                StringBuilder stringBuilder9 = new StringBuilder();
                stringBuilder9.append("event=");
                stringBuilder9.append(l.c(n2.v));
                stringBuilder9.append("&");
                stringBuffer.append(stringBuilder9.toString());
                StringBuilder stringBuilder10 = new StringBuilder();
                stringBuilder10.append("template=");
                stringBuilder10.append(l.c(n2.t));
                stringBuilder10.append("&");
                stringBuffer.append(stringBuilder10.toString());
                StringBuilder stringBuilder11 = new StringBuilder();
                stringBuilder11.append("layout=");
                stringBuilder11.append(l.c(n2.w));
                stringBuilder11.append("&");
                stringBuffer.append(stringBuilder11.toString());
                StringBuilder stringBuilder12 = new StringBuilder();
                stringBuilder12.append("unit_id=");
                stringBuilder12.append(l.c(n2.q));
                stringBuilder12.append("&");
                stringBuffer.append(stringBuilder12.toString());
                StringBuilder stringBuilder13 = new StringBuilder();
                stringBuilder13.append("cid=");
                stringBuilder13.append(l.c(n2.r));
                stringBuilder13.append("&");
                string = stringBuilder13.toString();
            }
            stringBuffer.append(string);
            return stringBuffer.toString();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static String f(n n2) {
        if (n2 != null) {
            StringBuffer stringBuffer = new StringBuffer();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("key=");
            stringBuilder.append(n2.d);
            stringBuilder.append("&");
            stringBuffer.append(stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("cid=");
            stringBuilder2.append(n2.r);
            stringBuilder2.append("&");
            stringBuffer.append(stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("rid_n=");
            stringBuilder3.append(n2.p);
            stringBuilder3.append("&");
            stringBuffer.append(stringBuilder3.toString());
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("unit_id=");
            stringBuilder4.append(n2.q);
            stringBuilder4.append("&");
            stringBuffer.append(stringBuilder4.toString());
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append("network_type=");
            stringBuilder5.append(n2.e);
            stringBuilder5.append("&");
            stringBuffer.append(stringBuilder5.toString());
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append("mraid_type=");
            stringBuilder6.append(n2.C);
            stringBuilder6.append("&");
            stringBuffer.append(stringBuilder6.toString());
            stringBuffer.append("platform=1");
            return stringBuffer.toString();
        }
        return "";
    }

    public static String g(n n2) {
        if (n2 != null) {
            StringBuffer stringBuffer = new StringBuffer();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("key=");
            stringBuilder.append(n2.d);
            stringBuilder.append("&");
            stringBuffer.append(stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("cid=");
            stringBuilder2.append(n2.r);
            stringBuilder2.append("&");
            stringBuffer.append(stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("rid_n=");
            stringBuilder3.append(n2.p);
            stringBuilder3.append("&");
            stringBuffer.append(stringBuilder3.toString());
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("unit_id=");
            stringBuilder4.append(n2.q);
            stringBuilder4.append("&");
            stringBuffer.append(stringBuilder4.toString());
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append("reason=");
            stringBuilder5.append(n2.k);
            stringBuilder5.append("&");
            stringBuffer.append(stringBuilder5.toString());
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append("case=");
            stringBuilder6.append(n2.l);
            stringBuilder6.append("&");
            stringBuffer.append(stringBuilder6.toString());
            StringBuilder stringBuilder7 = new StringBuilder();
            stringBuilder7.append("network_type=");
            stringBuilder7.append(n2.e);
            stringBuffer.append(stringBuilder7.toString());
            return stringBuffer.toString();
        }
        return "";
    }

    public final String a() {
        return this.a;
    }

    public final void a(int n2) {
        this.C = n2;
    }

    public final void a(String string) {
        this.b = string;
    }

    public final String b() {
        return this.b;
    }

    public final void b(int n2) {
        this.e = n2;
    }

    public final void b(String string) {
        try {
            this.A = URLEncoder.encode((String)string, (String)"utf-8");
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public final String c() {
        return this.c;
    }

    public final void c(int n2) {
        this.m = n2;
    }

    public final void c(String string) {
        try {
            this.z = URLEncoder.encode((String)string, (String)"utf-8");
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public final String d() {
        return this.A;
    }

    public final void d(String string) {
        try {
            this.y = URLEncoder.encode((String)string, (String)"utf-8");
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public final String e() {
        return this.z;
    }

    public final void e(String string) {
        this.x = string;
    }

    public final String f() {
        return this.y;
    }

    public final void f(String string) {
        this.B = string;
    }

    public final String g() {
        return this.x;
    }

    public final void g(String string) {
        try {
            this.s = URLEncoder.encode((String)string, (String)"utf-8");
            return;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
            return;
        }
    }

    public final String h() {
        return this.B;
    }

    public final void h(String string) {
        this.u = string;
    }

    public final String i() {
        return this.s;
    }

    public final void i(String string) {
        this.p = string;
    }

    public final String j() {
        return this.p;
    }

    public final void j(String string) {
        this.q = string;
    }

    public final String k() {
        return this.q;
    }

    public final void k(String string) {
        this.r = string;
    }

    public final String l() {
        return this.r;
    }

    public final void l(String string) {
        this.d = string;
    }

    public final String m() {
        return this.d;
    }

    public final void m(String string) {
        this.k = string;
    }

    public final int n() {
        return this.h;
    }

    public final void n(String string) {
        this.n = string;
    }

    public final int o() {
        return this.i;
    }

    public final void o(String string) {
        this.f = string;
    }

    public final String p() {
        return this.j;
    }

    public final String q() {
        return this.k;
    }

    public final String r() {
        return this.n;
    }

    public final long s() {
        return this.o;
    }

    public final int t() {
        return this.e;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RewardReportData [key=");
        stringBuilder.append(this.d);
        stringBuilder.append(", networkType=");
        stringBuilder.append(this.e);
        stringBuilder.append(", isCompleteView=");
        stringBuilder.append(this.g);
        stringBuilder.append(", watchedMillis=");
        stringBuilder.append(this.h);
        stringBuilder.append(", videoLength=");
        stringBuilder.append(this.i);
        stringBuilder.append(", offerUrl=");
        stringBuilder.append(this.j);
        stringBuilder.append(", reason=");
        stringBuilder.append(this.k);
        stringBuilder.append(", result=");
        stringBuilder.append(this.m);
        stringBuilder.append(", duration=");
        stringBuilder.append(this.n);
        stringBuilder.append(", videoSize=");
        stringBuilder.append(this.o);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final String u() {
        return this.f;
    }

    public final int v() {
        return this.g;
    }

    public final int w() {
        return this.m;
    }
}

