/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 */
package f.f.a.f;

import android.text.TextUtils;
import f.f.a.f.a;
import f.f.a.f.a$c;
import f.f.a.f.d;
import java.util.HashMap;

public class c {
    private static c a;
    private static HashMap<String, d> b;
    private static a c;

    static {
        b = new HashMap();
        c = null;
    }

    private c() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c b() {
        if (a != null) return a;
        Class<c> class_ = c.class;
        synchronized (c.class) {
            if (a != null) return a;
            a = new c();
            // ** MonitorExit[var1] (shouldn't be in output)
            return a;
        }
    }

    private d e(String string, String string2) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = f.f.a.e.c.a.i().f();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_");
        stringBuilder.append(string2);
        String string3 = stringBuilder.toString();
        d d2 = null;
        if (b.containsKey((Object)string3)) {
            return (d)b.get((Object)string3);
        }
        try {
            d2 = d.a(f.f.a.e.a.a.a.a().a(string3));
            b.put((Object)string3, (Object)d2);
            return d2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return d2;
        }
    }

    public final a a() {
        a a2 = new a();
        a2.e("US");
        a2.h(86400L);
        a2.g(1);
        a2.h(1);
        a2.c(true);
        a2.d(true);
        a2.f(3600L);
        a2.g(0L);
        a2.b(false);
        a2.a(false);
        a2.b(7200L);
        a2.d(20L);
        a2.e(10L);
        a2.a(1);
        a2.b(1);
        a2.d("\u6b63\u5728\u4e0b\u8f7d\u4e2d\uff0c\u8bf7\u53bb\u901a\u77e5\u680f\u67e5\u770b\u4e0b\u8f7d\u8fdb\u5ea6");
        a2.b("mintegral");
        a2.w(1);
        a2.c(1800L);
        a2.J(100);
        a2.I(43200);
        a2.H(1);
        a2.a(604800L);
        a2.f(1);
        a2.c(3);
        a2.x(1);
        a2.G(1);
        a2.E(1);
        a2.F(86400);
        a2.d(259200);
        a2.y(1);
        a2.z(900);
        a2.A(20);
        a2.c("pid");
        a2.B(1);
        a2.C(1);
        a2.D(1);
        a2.e(1);
        a2.r(1);
        a2.q(1);
        a2.s(1);
        a2.t(0);
        a2.u(1);
        a2.v(-1);
        a2.a(a$c.a);
        a2.p(2);
        a2.o(86400);
        a2.m(0);
        a2.f("https://cdn-adn-https.rayjump.com/cdn-adn/v2/portal/19/08/20/11/06/5d5b63cb457e2.js");
        a2.l(120);
        a2.k(10);
        a2.e(false);
        a2.i(0);
        a2.j(120);
        return a2;
    }

    public final a a(String string) {
        if (c == null) {
            try {
                c = a.g(f.f.a.e.a.a.a.a().a(string));
                if (c != null) {
                    c.r();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return c;
    }

    public final d a(String string, String string2) {
        d d2 = this.c(string, string2);
        if (d2 == null) {
            d2 = d.g();
        }
        return d2;
    }

    public final d b(String string, String string2) {
        d d2 = c.super.e(string, string2);
        if (d2 == null) {
            d2 = d.g();
        }
        return d2;
    }

    public final void b(String string) {
        f.f.a.e.a.a.a a2 = f.f.a.e.a.a.a.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ivreward_");
        stringBuilder.append(string);
        a2.b(stringBuilder.toString());
    }

    public final d c(String string, String string2) {
        d d2 = c.super.e(string, string2);
        if (d2 != null && d2.e() == 0) {
            d2.a(1);
        }
        return d2;
    }

    public final d d(String string, String string2) {
        return c.super.e(string, string2);
    }
}

