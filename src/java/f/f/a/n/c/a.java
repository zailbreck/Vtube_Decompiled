/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.mintegral.msdk.base.common.report.a
 *  com.mintegral.msdk.base.common.report.e
 *  com.mintegral.msdk.base.common.report.e$b
 *  f.f.a.a
 *  f.f.a.e.b.b
 *  f.f.a.e.b.h.g
 *  f.f.a.e.b.h.j.d
 *  f.f.a.e.b.h.k.c
 *  f.f.a.e.e.a
 *  f.f.a.e.f.d
 *  f.f.a.e.f.h
 *  f.f.a.n.c.a$a
 *  f.f.a.n.c.a$b
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 */
package f.f.a.n.c;

import android.content.Context;
import android.text.TextUtils;
import com.mintegral.msdk.base.common.report.e;
import f.f.a.e.b.h.g;
import f.f.a.e.b.h.j.d;
import f.f.a.e.b.h.k.c;
import f.f.a.e.f.h;
import f.f.a.n.c.a;
import java.util.List;

public class a {
    private static final String a = "f.f.a.n.c.a";

    static /* synthetic */ String a() {
        return a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, f.f.a.e.e.a a2, String string2) {
        if (context == null || a2 == null) return;
        {
            try {
                if (TextUtils.isEmpty((CharSequence)string2)) return;
                {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000048&");
                    if (a2 != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("cid=");
                        stringBuilder.append(a2.e());
                        stringBuilder.append("&");
                        stringBuffer.append(stringBuilder.toString());
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("network_type=");
                    stringBuilder.append(f.f.a.e.f.d.z((Context)context));
                    stringBuilder.append("&");
                    stringBuffer.append(stringBuilder.toString());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("unit_id=");
                    stringBuilder2.append(string2);
                    stringBuilder2.append("&");
                    stringBuffer.append(stringBuilder2.toString());
                    String string3 = a2.k1() ? "hb=1&" : "hb=0&";
                    stringBuffer.append(string3);
                    if (a2 != null) {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("rid_n=");
                        stringBuilder3.append(a2.L0());
                        stringBuffer.append(stringBuilder3.toString());
                    }
                    if (com.mintegral.msdk.base.common.report.a.b().a()) {
                        com.mintegral.msdk.base.common.report.a.b().a(stringBuffer.toString());
                        return;
                    }
                    a.a(context, stringBuffer.toString(), string2);
                    return;
                }
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    private static void a(Context context, String string2) {
        if (context != null && !TextUtils.isEmpty((CharSequence)string2)) {
            try {
                e.b b2 = new e.b(context);
                c c2 = e.a((String)string2, (Context)context);
                b2.b(0, d.a().b, c2, (g)new b());
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                h.d((String)a, (String)exception.getMessage());
            }
        }
    }

    private static void a(Context context, String string2, String string3) {
        if (context != null && !TextUtils.isEmpty((CharSequence)string2) && !TextUtils.isEmpty((CharSequence)string3)) {
            try {
                e.b b2 = new e.b(context);
                c c2 = e.a((String)string2, (Context)context, (String)string3);
                b2.b(0, d.a().b, c2, (g)new a());
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                h.d((String)a, (String)exception.getMessage());
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, String string2, String string3, boolean bl, String string4) {
        StringBuffer stringBuffer;
        block8 : {
            block7 : {
                if (context != null) {
                    try {
                        if (TextUtils.isEmpty((CharSequence)string2) || TextUtils.isEmpty((CharSequence)string3)) break block7;
                        stringBuffer = new StringBuffer();
                        stringBuffer.append("key=2000047&");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("network_type=");
                        stringBuilder.append(f.f.a.e.f.d.z((Context)context));
                        stringBuilder.append("&");
                        stringBuffer.append(stringBuilder.toString());
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("unit_id=");
                        stringBuilder2.append(string3);
                        stringBuilder2.append("&");
                        stringBuffer.append(stringBuilder2.toString());
                        if (!TextUtils.isEmpty((CharSequence)f.f.a.e.b.b.k)) {
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("sys_id=");
                            stringBuilder3.append(f.f.a.e.b.b.k);
                            stringBuilder3.append("&");
                            stringBuffer.append(stringBuilder3.toString());
                        }
                        if (!TextUtils.isEmpty((CharSequence)f.f.a.e.b.b.l)) {
                            StringBuilder stringBuilder4 = new StringBuilder();
                            stringBuilder4.append("bkup_id=");
                            stringBuilder4.append(f.f.a.e.b.b.l);
                            stringBuilder4.append("&");
                            stringBuffer.append(stringBuilder4.toString());
                        }
                        break block8;
                    }
                    catch (Throwable throwable) {
                        throwable.printStackTrace();
                    }
                }
            }
            return;
        }
        String string5 = bl ? "hb=1&" : "hb=0&";
        stringBuffer.append(string5);
        if (!TextUtils.isEmpty((CharSequence)string4)) {
            stringBuffer.append("rid_n=");
            stringBuffer.append(string4);
            stringBuffer.append("&");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("reason=");
        stringBuilder.append(string2);
        stringBuffer.append(stringBuilder.toString());
        if (com.mintegral.msdk.base.common.report.a.b().a()) {
            com.mintegral.msdk.base.common.report.a.b().a(stringBuffer.toString());
            return;
        }
        a.a(context, stringBuffer.toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void a(Context var0_1, List<f.f.a.e.e.a> var1, String var2_2) {
        block8 : {
            if (var0_1 == null) return;
            if (var1 == null) return;
            try {
                if (TextUtils.isEmpty((CharSequence)var2_2)) {
                    return;
                }
                var4_3 = new StringBuffer();
                var4_3.append("key=");
                var4_3.append("2000048");
                var4_3.append("&");
                var4_3.append("network_type=");
                var4_3.append(f.f.a.e.f.d.z((Context)var0_1));
                var4_3.append("&");
                var4_3.append("unit_id=");
                var4_3.append(var2_2);
                var4_3.append("&");
                if (var1 == null) return;
                if (var1.size() <= 0) return;
                var4_3.append("cid=");
                var15_4 = 0;
                break block8;
            }
            catch (Exception var3_8) {
                if (f.f.a.a.a == false) return;
                var3_8.printStackTrace();
            }
            return;
        }
        do {
            if (var15_4 >= var1.size()) ** GOTO lbl36
            var19_5 = (f.f.a.e.e.a)var1.get(var15_4);
            if (var15_4 < -1 + var1.size()) {
                var4_3.append(var19_5.e());
                var22_6 = ",";
            } else {
                var4_3.append(var19_5.e());
                var4_3.append("&");
                var22_6 = var19_5.k1() != false ? "hb=1&" : "hb=0&";
lbl36: // 1 sources:
                var16_7 = (f.f.a.e.e.a)var1.get(0);
                if (var16_7 != null) {
                    var4_3.append("rid_n=");
                    var4_3.append(var16_7.L0());
                }
                if (com.mintegral.msdk.base.common.report.a.b().a()) {
                    com.mintegral.msdk.base.common.report.a.b().a(var4_3.toString());
                    return;
                }
                a.a(var0_1, var4_3.toString(), var2_2);
                return;
            }
            var4_3.append(var22_6);
            ++var15_4;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(Context context, String string2, String string3, boolean bl, String string4) {
        StringBuffer stringBuffer;
        block8 : {
            block7 : {
                if (context != null) {
                    try {
                        if (TextUtils.isEmpty((CharSequence)string2) || TextUtils.isEmpty((CharSequence)string3)) break block7;
                        stringBuffer = new StringBuffer();
                        stringBuffer.append("key=2000047&");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("network_type=");
                        stringBuilder.append(f.f.a.e.f.d.z((Context)context));
                        stringBuilder.append("&");
                        stringBuffer.append(stringBuilder.toString());
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("unit_id=");
                        stringBuilder2.append(string3);
                        stringBuilder2.append("&");
                        stringBuffer.append(stringBuilder2.toString());
                        if (!TextUtils.isEmpty((CharSequence)f.f.a.e.b.b.k)) {
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("sys_id=");
                            stringBuilder3.append(f.f.a.e.b.b.k);
                            stringBuilder3.append("&");
                            stringBuffer.append(stringBuilder3.toString());
                        }
                        if (!TextUtils.isEmpty((CharSequence)f.f.a.e.b.b.l)) {
                            StringBuilder stringBuilder4 = new StringBuilder();
                            stringBuilder4.append("bkup_id=");
                            stringBuilder4.append(f.f.a.e.b.b.l);
                            stringBuilder4.append("&");
                            stringBuffer.append(stringBuilder4.toString());
                        }
                        break block8;
                    }
                    catch (Throwable throwable) {
                        throwable.printStackTrace();
                    }
                }
            }
            return;
        }
        String string5 = bl ? "hb=1&" : "hb=0&";
        stringBuffer.append(string5);
        if (!TextUtils.isEmpty((CharSequence)string4)) {
            stringBuffer.append("rid_n=");
            stringBuffer.append(string4);
            stringBuffer.append("&");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("reason=");
        stringBuilder.append(string2);
        stringBuffer.append(stringBuilder.toString());
        if (com.mintegral.msdk.base.common.report.a.b().a()) {
            com.mintegral.msdk.base.common.report.a.b().a(stringBuffer.toString());
            return;
        }
        a.a(context, stringBuffer.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(Context context, String string2, String string3, boolean bl, String string4) {
        StringBuffer stringBuffer;
        block8 : {
            block7 : {
                if (context != null) {
                    try {
                        if (TextUtils.isEmpty((CharSequence)string2) || TextUtils.isEmpty((CharSequence)string3)) break block7;
                        stringBuffer = new StringBuffer();
                        stringBuffer.append("key=2000078&");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("network_type=");
                        stringBuilder.append(f.f.a.e.f.d.z((Context)context));
                        stringBuilder.append("&");
                        stringBuffer.append(stringBuilder.toString());
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("unit_id=");
                        stringBuilder2.append(string3);
                        stringBuilder2.append("&");
                        stringBuffer.append(stringBuilder2.toString());
                        if (!TextUtils.isEmpty((CharSequence)f.f.a.e.b.b.k)) {
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("sys_id=");
                            stringBuilder3.append(f.f.a.e.b.b.k);
                            stringBuilder3.append("&");
                            stringBuffer.append(stringBuilder3.toString());
                        }
                        if (!TextUtils.isEmpty((CharSequence)f.f.a.e.b.b.l)) {
                            StringBuilder stringBuilder4 = new StringBuilder();
                            stringBuilder4.append("bkup_id=");
                            stringBuilder4.append(f.f.a.e.b.b.l);
                            stringBuilder4.append("&");
                            stringBuffer.append(stringBuilder4.toString());
                        }
                        break block8;
                    }
                    catch (Throwable throwable) {
                        throwable.printStackTrace();
                    }
                }
            }
            return;
        }
        String string5 = bl ? "hb=1&" : "hb=0&";
        stringBuffer.append(string5);
        if (!TextUtils.isEmpty((CharSequence)string4)) {
            stringBuffer.append("rid_n=");
            stringBuffer.append(string4);
            stringBuffer.append("&");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("reason=");
        stringBuilder.append(string2);
        stringBuffer.append(stringBuilder.toString());
        if (com.mintegral.msdk.base.common.report.a.b().a()) {
            com.mintegral.msdk.base.common.report.a.b().a(stringBuffer.toString());
            return;
        }
        a.a(context, stringBuffer.toString());
    }
}

