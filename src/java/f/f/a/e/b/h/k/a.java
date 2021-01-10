/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package f.f.a.e.b.h.k;

import android.content.Context;
import android.text.TextUtils;
import f.f.a.e.b.h.f.a;
import f.f.a.e.b.h.f.b;
import f.f.a.e.b.h.f.e;
import f.f.a.e.b.h.g;
import f.f.a.e.b.h.k.c;
import f.f.a.e.b.h.k.d;
import f.f.a.e.b.h.l;
import f.f.a.e.b.h.n;
import f.f.a.e.b.h.o;
import f.f.a.e.b.h.p;
import f.f.a.e.b.h.q;
import f.f.a.e.f.h;
import java.io.File;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {
    private static final String b = "a";
    protected Context a;

    public a(Context context) {
        this.a = context.getApplicationContext();
    }

    public static void a(File file, String string, g g2) {
        String string2 = b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("downloadFile url = ");
        stringBuilder.append(string);
        h.b(string2, stringBuilder.toString());
        q.a().a(file, string, g2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void a(int var1_1, String var2_4, c var3_3, g var4) {
        var5_5 = new f.f.a.e.b.h.c();
        if (var3_3 != null) ** GOTO lbl5
        try {
            var3_3 = new c();
lbl5: // 2 sources:
            this.a(var2_4, var3_3);
            d.d(var3_3);
            var18_6 = f.f.a.e.b.h.j.c.a().a(var3_3);
            if (var18_6 != null && var4 != null) {
                var4.a(var18_6);
                return;
            }
        }
        catch (Exception var6_7) {
            h.a(a.b, var6_7.getMessage());
        }
        var7_8 = new StringBuilder();
        var7_8.append(var2_4);
        var7_8.append("?");
        var7_8.append(var3_3.toString());
        var11_9 = var7_8.toString();
        var12_10 = a.b;
        var13_11 = new StringBuilder();
        var13_11.append("get url = ");
        var13_11.append(var11_9);
        h.b(var12_10, var13_11.toString());
        var16_12 = var1_1 != 0 ? (var1_1 != 1 ? (var1_1 != 2 ? null : new b(0, var11_9, null, var4)) : new f.f.a.e.b.h.f.c(0, var11_9, null, var4)) : new e(0, var11_9, null, var4);
        if (var16_12 == null) return;
        var16_12.a(var5_5);
        q.a(var16_12);
    }

    public void a(String string, c c2) {
        if (c2 != null) {
            String string2;
            String string3;
            String string4;
            String string5 = f.f.a.e.b.h.a.a();
            if (string5 == null) {
                string5 = "";
            }
            c2.a("channel", string5);
            String string6 = b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("excute addExtraParams , url:");
            stringBuilder.append(string);
            h.a(string6, stringBuilder.toString());
            if (!TextUtils.isEmpty((CharSequence)string) && string.contains((CharSequence)"setting") && !TextUtils.isEmpty((CharSequence)(string3 = f.f.a.e.b.h.a.b()))) {
                c2.a("keyword", string3);
            }
            if ((string2 = (String)c2.b().get((Object)"unit_id")) != null && !TextUtils.isEmpty((CharSequence)(string4 = f.f.a.m.b.a().a(string2, string)))) {
                c2.a("ch_info", string4);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(f.f.a.e.c.b.b.b().a());
            stringBuilder2.append("");
            c2.a("gdpr_consent", stringBuilder2.toString());
            return;
        }
        h.d(b, "addExtraParams error, params is null,frame work error");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void b(int var1_1, String var2_4, c var3_3, g var4) {
        block9 : {
            block10 : {
                block6 : {
                    block7 : {
                        block8 : {
                            var5_5 = new f.f.a.e.b.h.c();
                            if (var3_3 != null) ** GOTO lbl5
                            try {
                                var3_3 = new c();
lbl5: // 2 sources:
                                this.a(var2_4, var3_3);
                                d.d(var3_3);
                            }
                            catch (Exception var6_6) {
                                h.a(a.b, var6_6.getMessage());
                            }
                            var7_7 = a.b;
                            var8_8 = new StringBuilder();
                            var8_8.append("post url = ");
                            var8_8.append(var2_4);
                            h.b(var7_7, var8_8.toString());
                            if (var2_4.contains((CharSequence)f.f.a.e.b.h.j.d.a().b)) {
                                var13_9 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
                                var14_10 = 0;
                                if (var13_9 != null) {
                                    var14_10 = var13_9.w();
                                }
                                if (var14_10 == 2) {
                                    return;
                                }
                                if (var14_10 == 1) {
                                    p.a().a(var3_3.toString(), var4);
                                    return;
                                }
                            }
                            if (var1_1 == 0) break block6;
                            if (var1_1 == 1) break block7;
                            if (var1_1 == 2) break block8;
                            var11_11 = null;
                            break block9;
                        }
                        var11_12 = new b(1, var2_4, var3_3.toString(), var4);
                        break block10;
                    }
                    var11_13 = new f.f.a.e.b.h.f.c(1, var2_4, var3_3.toString(), var4);
                    break block10;
                }
                var11_14 = new e(1, var2_4, var3_3.toString(), var4);
            }
            var11_15.a("Content-Type", "application/x-www-form-urlencoded");
        }
        if (var11_16 == null) return;
        var11_16.a(var5_5);
        q.a((l)var11_16);
    }
}

