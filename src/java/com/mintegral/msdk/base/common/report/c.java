/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.mintegral.msdk.base.common.report;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mintegral.msdk.base.common.report.a;
import f.f.a.e.e.n;
import f.f.a.e.f.d;

public final class c {
    private static Handler a = new Handler(Looper.getMainLooper());

    public static void a(f.f.a.e.e.a a2, String string, String string2, String string3) {
        if (a2 != null) {
            if (!a2.m1()) {
                return;
            }
            boolean bl = true ^ TextUtils.isEmpty((CharSequence)a2.r0());
            int n2 = bl ? 1 : 3;
            n n3 = new n("2000043", n2, "0", "", a2.e(), string2, string, String.valueOf((int)a2.i0()));
            n3.k(a2.e());
            n3.i(a2.M0());
            n3.f(string3);
            n3.b(d.z(f.f.a.e.c.a.i().e()));
            int n4 = a2.m1() ? n.D : n.E;
            n3.a(n4);
            c.a(n3, f.f.a.e.c.a.i().e(), string2);
        }
    }

    public static void a(n n2, Context context, String string) {
        if (n2 != null) {
            n2.a(d.s());
            String string2 = n.c(n2);
            if (a.b().a()) {
                a.b().a(string2);
                return;
            }
            c.a(string2, context, string);
        }
    }

    private static void a(Runnable runnable) {
        Handler handler = a;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public static void a(String string, Context context, String string2) {
        if (context != null && !TextUtils.isEmpty((CharSequence)string) && !TextUtils.isEmpty((CharSequence)string2)) {
            c.a(new f.f.a.e.b.g.a(string, string2));
        }
    }

    public static void b(n n2, Context context, String string) {
        if (n2 != null) {
            n2.l("2000060");
            n2.j(string);
            n2.b(d.z(context));
            String string2 = n.a(n2);
            if (a.b().a()) {
                a.b().a(string2);
                return;
            }
            c.a(string2, context, string);
        }
    }

    public static void c(n n2, Context context, String string) {
        if (n2 != null) {
            n2.l("2000059");
            n2.j(string);
            n2.b(d.z(context));
            n2.a(d.s());
            String string2 = n.b(n2);
            if (a.b().a()) {
                a.b().a(string2);
                return;
            }
            c.a(string2, context, string);
        }
    }

    public static void d(n n2, Context context, String string) {
        String string2 = n.f(n2);
        if (a.b().a()) {
            a.b().a(string2);
            return;
        }
        c.a(string2, context, string);
    }

    public static void e(n n2, Context context, String string) {
        String string2 = n.g(n2);
        if (a.b().a()) {
            a.b().a(string2);
            return;
        }
        c.a(string2, context, string);
    }
}

