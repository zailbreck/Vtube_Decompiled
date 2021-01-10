/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.text.TextUtils
 *  f.f.a.e.c.a
 *  f.f.a.j.v
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Queue
 *  java.util.Random
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package f.f.a.s.d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import f.f.a.e.c.a;
import f.f.a.e.d.h;
import f.f.a.j.v;
import f.f.a.s.b.b;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c {
    private static h D;
    public static String E;
    private int A;
    private int B = 20;
    private int C;
    private String a;
    private List<b> b;
    private long c;
    private int d = -1;
    private int e = 0;
    private int f = 1;
    private int g = 1;
    private double h = 1.0;
    private int i = 5;
    private int j = 1;
    private int k = 100;
    private int l = 0;
    private f.f.a.s.b.c m;
    private double n = 1.0;
    private int o = 2;
    private double p = 1.0;
    private int q = 1;
    private int r = 0;
    private int s = 10;
    private int t = 60;
    private int u = 0;
    private int v = 70;
    private int w = 0;
    private int x = -1;
    private int y = -1;
    private int z = -1;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static c b(String var0) {
        block16 : {
            block15 : {
                if (c.D == null) {
                    c.D = h.a(a.i().e());
                }
                var1_1 = TextUtils.isEmpty((CharSequence)var0);
                var2_2 = null;
                if (var1_1 != false) return var2_2;
                try {
                    var3_3 = new JSONObject(var0);
                    var5_4 = var3_3.optJSONArray("unitSetting");
                    if (var5_4 == null) return null;
                    var6_5 = var5_4.optJSONObject(0);
                    if (var6_5 == null) return null;
                    if (TextUtils.isEmpty((CharSequence)var6_5.optString("unitId")) != false) return null;
                    var7_6 = new c();
                }
                catch (Exception var4_17) {
                    // empty catch block
                    ** GOTO lbl80
                }
                var7_6.b = b.a(var6_5.optJSONArray("adSourceList"));
                var6_5.optInt("callbackType");
                var9_7 = var6_5.optInt("aqn", 1);
                if (var9_7 <= 0) {
                    var9_7 = 1;
                }
                var7_6.f = var9_7;
                var10_8 = var6_5.optInt("acn", 1);
                if (var10_8 < 0) {
                    var10_8 = 1;
                }
                var7_6.g = var10_8;
                var6_5.optInt("vcn", 5);
                var7_6.h = var6_5.optDouble("cbp", 1.0);
                var6_5.optInt("ttc_type", 2);
                var7_6.i = var6_5.optInt("offset", 5);
                var7_6.j = var6_5.optInt("dlnet", 1);
                var7_6.C = var6_5.optInt("endscreen_type", 1);
                var6_5.optInt("tv_start", 3);
                var6_5.optInt("tv_end", 80);
                var7_6.k(var6_5.optInt("ready_rate", 100));
                var7_6.l(var6_5.optInt("cd_rate", 0));
                var7_6.c = var3_3.optLong("current_time");
                var7_6.u = var6_5.optInt("orientation", 0);
                var7_6.w = var6_5.optInt("daily_play_cap", 0);
                var7_6.x = var6_5.optInt("video_skip_time", -1);
                var7_6.y = var6_5.optInt("video_skip_result", 1);
                var7_6.z = var6_5.optInt("video_interactive_type", -1);
                var7_6.A = var6_5.optInt("close_button_delay", 1);
                var7_6.d = var6_5.optInt("playclosebtn_tm", -1);
                var6_5.optInt("play_ctdown", 0);
                var7_6.e = var6_5.optInt("close_alert", 0);
                var7_6.B = var6_5.optInt("rdrct", 20);
                var7_6.v = var6_5.optInt("load_global_timeout", 70);
                var6_5.optInt("rfpv", -1);
                var7_6.n = var6_5.optDouble("vdcmp", 1.0);
                var7_6.m = f.f.a.s.b.c.a(var6_5.optJSONObject("cbprule"));
                var7_6.o = var6_5.optInt("ccbprule", 2);
                var7_6.p = var6_5.optDouble("ccbp", 1.0);
                c.E = var6_5.optString("atzu");
                var17_9 = var6_5.optJSONArray("atl_type");
                var18_10 = new ArrayList();
                if (var17_9 == null) break block15;
                break block16;
            }
            var18_10.add((Object)4);
            var18_10.add((Object)6);
            ** GOTO lbl74
        }
        try {
            for (var26_11 = 0; var26_11 < var17_9.length(); ++var26_11) {
                var18_10.add((Object)var17_9.getInt(var26_11));
            }
            ** GOTO lbl74
        }
        catch (Exception var19_12) {
            block17 : {
                block18 : {
                    try {
                        var19_12.printStackTrace();
lbl74: // 3 sources:
                        var6_5.optInt("atl_dyt", 0);
                        var21_13 = var6_5.optInt("tmorl", 1);
                        if (var21_13 <= 2 && var21_13 > 0) break block17;
                        break block18;
                    }
                    catch (Exception var4_16) {
                        var2_2 = var7_6;
                    }
lbl80: // 2 sources:
                    var4_18.printStackTrace();
                    return var2_2;
                }
                var21_13 = 1;
            }
            var7_6.q = var21_13;
            if (var7_6.h == 1.0) {
                var22_14 = 0;
            } else {
                var23_15 = new Random().nextDouble() DCMPL var7_6.h;
                var22_14 = 0;
                if (var23_15 > 0) {
                    var22_14 = 1;
                }
            }
            var7_6.r = var22_14;
            var7_6.a = var6_5.optString("placementid");
            var7_6.s = var6_5.optInt("ltafemty", 10);
            var7_6.t = var6_5.optInt("ltorwc", 60);
        }
        return var7_6;
    }

    public final int A() {
        return this.o;
    }

    public final double B() {
        return this.p;
    }

    public final int C() {
        return this.q;
    }

    public final String a() {
        return this.a;
    }

    public final void a(double d2) {
        this.h = d2;
    }

    public final void a(int n2) {
        this.r = n2;
    }

    public final void a(String string2) {
        this.a = string2;
    }

    public final void a(ArrayList<Integer> arrayList) {
    }

    public final void a(List<b> list) {
        this.b = list;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Queue<Integer> b() {
        LinkedList linkedList;
        Exception exception;
        block5 : {
            int n2;
            try {
                List<b> list = this.b;
                LinkedList linkedList2 = null;
                if (list == null) return linkedList2;
                int n3 = this.b.size();
                linkedList2 = null;
                if (n3 <= 0) return linkedList2;
                linkedList = new LinkedList();
                n2 = 0;
            }
            catch (Exception exception2) {
                linkedList = null;
                exception = exception2;
                break block5;
            }
            try {
                while (n2 < this.b.size()) {
                    linkedList.add((Object)((b)this.b.get(n2)).b());
                    ++n2;
                }
                return linkedList;
            }
            catch (Exception exception3) {}
        }
        exception.printStackTrace();
        return linkedList;
    }

    public final void b(double d2) {
        this.p = d2;
    }

    public final void b(int n2) {
        this.u = n2;
    }

    public final int c() {
        return this.v;
    }

    public final void c(int n2) {
        this.w = n2;
    }

    public final int d() {
        return this.s;
    }

    public final void d(int n2) {
        this.x = n2;
    }

    public final int e() {
        return this.t;
    }

    public final void e(int n2) {
        this.y = n2;
    }

    public final int f() {
        return this.r;
    }

    public final void f(int n2) {
        this.z = n2;
    }

    public final int g() {
        return this.u;
    }

    public final void g(int n2) {
        this.A = n2;
    }

    public final int h() {
        return this.w;
    }

    public final void h(int n2) {
        this.C = n2;
    }

    public final int i() {
        return this.x;
    }

    public final void i(int n2) {
    }

    public final int j() {
        return this.y;
    }

    public final void j(int n2) {
    }

    public final int k() {
        return this.z;
    }

    public final void k(int n2) {
        try {
            if (v.a((ApplicationInfo)a.i().e().getApplicationInfo())) {
                this.k = 100;
                return;
            }
            this.k = n2;
            return;
        }
        catch (Exception exception) {
            this.k = 100;
            return;
        }
    }

    public final int l() {
        return this.d;
    }

    public final void l(int n2) {
        try {
            if (v.a((ApplicationInfo)a.i().e().getApplicationInfo())) {
                this.l = 0;
                return;
            }
            this.l = n2;
            return;
        }
        catch (Exception exception) {
            this.l = 0;
            return;
        }
    }

    public final int m() {
        return this.e;
    }

    public final void m(int n2) {
        this.f = n2;
    }

    public final int n() {
        return this.B;
    }

    public final void n(int n2) {
        this.g = n2;
    }

    public final int o() {
        return this.A;
    }

    public final void o(int n2) {
    }

    public final int p() {
        return this.C;
    }

    public final void p(int n2) {
    }

    public final int q() {
        return this.k;
    }

    public final void q(int n2) {
        this.i = n2;
    }

    public final int r() {
        return this.l;
    }

    public final void r(int n2) {
        this.j = n2;
    }

    public final int s() {
        return this.f;
    }

    public final void s(int n2) {
    }

    public final int t() {
        return this.g;
    }

    public final void t(int n2) {
        this.o = n2;
    }

    public final int u() {
        return this.i;
    }

    public final void u(int n2) {
        this.q = n2;
    }

    public final int v() {
        return this.j;
    }

    public final void v(int n2) {
    }

    public final long w() {
        return this.c;
    }

    public final void w(int n2) {
        this.v = n2;
    }

    public final List<b> x() {
        return this.b;
    }

    public final f.f.a.s.b.c y() {
        return this.m;
    }

    public final double z() {
        return this.n;
    }
}

