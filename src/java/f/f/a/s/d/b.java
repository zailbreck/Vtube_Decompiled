/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.mintegral.msdk.base.common.report.e
 *  f.f.a.e.a.a.a
 *  f.f.a.e.c.a
 *  f.f.a.e.f.h
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package f.f.a.s.d;

import android.content.Context;
import android.text.TextUtils;
import com.mintegral.msdk.base.common.report.e;
import f.f.a.e.f.h;
import f.f.a.s.b.d;
import f.f.a.s.d.b;
import f.f.a.s.d.c;
import f.f.a.s.f.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class b {
    private static Map<String, c> a = new HashMap();
    public static f.f.a.s.d.a b = null;
    private static b c;

    private b() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static c a(boolean bl) {
        c c2 = new c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Object)new f.f.a.s.b.b(1, 15, null));
            c2.a((List<f.f.a.s.b.b>)arrayList);
            c2.n(1);
            c2.m(1);
            c2.o(1);
            c2.s(1);
            c2.a(1.0);
            c2.b(1.0);
            c2.t(2);
            c2.p(2);
            c2.q(1);
            c2.r(1);
            c2.i(3);
            c2.j(80);
            c2.k(100);
            c2.l(0);
            c2.h(1);
            c2.f(-1);
            c2.w(70);
            c2.e(1);
            if (bl) {
                c2.d(5);
            } else {
                c2.d(-1);
            }
            c2.c(0);
            c2.b(0);
            c2.g(1);
            c2.u(1);
            c2.a(0);
            c2.v(0);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add((Object)4);
            arrayList2.add((Object)6);
            c2.a((ArrayList<Integer>)arrayList2);
            return c2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return c2;
        }
    }

    private final boolean a(c c2) {
        f.f.a.s.d.a a2 = this.a();
        if (a2 != null && c2 != null) {
            long l2 = a2.b();
            long l3 = System.currentTimeMillis();
            long l4 = l2 + c2.w();
            if (l4 > l3) {
                if (h.b) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("unit setting  nexttime is not ready  [settingNextRequestTime= ");
                    stringBuilder.append(l4);
                    stringBuilder.append(" currentTime = ");
                    stringBuilder.append(l3);
                    stringBuilder.append("]");
                    h.b((String)"RewardSettingManager", (String)stringBuilder.toString());
                }
                return false;
            }
        }
        return true;
    }

    public static boolean a(String string2) {
        block4 : {
            JSONArray jSONArray;
            boolean bl;
            try {
                if (TextUtils.isEmpty((CharSequence)string2) || (jSONArray = new JSONObject(string2).optJSONArray("unitSetting")) == null) break block4;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return false;
            }
            String string3 = jSONArray.optJSONObject(0).optString("unitId");
            if (jSONArray == null) break block4;
            if (jSONArray.length() <= 0 || (bl = TextUtils.isEmpty((CharSequence)string3))) break block4;
            return true;
        }
        return false;
    }

    private void b(String string2, String string3) {
        new f.f.a.s.c.a().a(f.f.a.e.c.a.i().e(), string2, string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b c() {
        if (c != null) return c;
        Class<b> class_ = b.class;
        synchronized (b.class) {
            if (c != null) return c;
            c = new b();
            // ** MonitorExit[var1] (shouldn't be in output)
            return c;
        }
    }

    private void c(String string2, String string3) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            Context context = f.f.a.e.c.a.i().e();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("alert url is exception ,url:");
            stringBuilder.append(string2);
            e.a((Context)context, (String)string2, (String)string3, (int)2, (String)stringBuilder.toString());
            return;
        }
        g.a().a(string2, new g.f((b)this, string2, string3){
            final /* synthetic */ String a;
            final /* synthetic */ String b;
            {
                this.a = string2;
                this.b = string3;
            }

            public final void a(String string2, String string3) {
                e.a((Context)f.f.a.e.c.a.i().e(), (String)this.a, (String)this.b, (int)2, (String)string2);
            }

            public final void b(String string2) {
                e.a((Context)f.f.a.e.c.a.i().e(), (String)this.a, (String)this.b, (int)1, (String)"");
            }
        });
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final f.f.a.s.d.a a() {
        block4 : {
            var1_1 = b.b;
            if (var1_1 != null) return var1_1;
            var2_2 = f.f.a.e.a.a.a.a();
            var3_3 = new StringBuilder();
            var3_3.append("reward_");
            var3_3.append(f.f.a.e.c.a.i().f());
            var6_4 = var2_2.a(var3_3.toString());
            if (TextUtils.isEmpty((CharSequence)var6_4)) break block4;
            var7_5 = f.f.a.s.d.a.a(var6_4);
            if (var7_5 == null) ** GOTO lbl-1000
            var9_6 = var7_5.a();
            var11_7 = System.currentTimeMillis();
            var13_8 = var9_6 + var7_5.f();
            if (var13_8 > var11_7) {
                if (h.b) {
                    var15_9 = new StringBuilder();
                    var15_9.append("app setting nexttime is not ready  [settingNextRequestTime= ");
                    var15_9.append(var13_8);
                    var15_9.append(" currentTime = ");
                    var15_9.append(var11_7);
                    var15_9.append("]");
                    h.b((String)"RewardSettingManager", (String)var15_9.toString());
                }
                var8_10 = false;
            } else lbl-1000: // 2 sources:
            {
                h.b((String)"RewardSettingManager", (String)"app setting timeout or not exists");
                var8_10 = true;
            }
            if (!var8_10) {
                return var7_5;
            }
        }
        this.b(f.f.a.e.c.a.i().f(), f.f.a.e.c.a.i().g());
        return this.b();
    }

    public final c a(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("reward");
        stringBuilder.append("_");
        stringBuilder.append(string2);
        stringBuilder.append("_");
        stringBuilder.append(string3);
        String string4 = stringBuilder.toString();
        if (a.containsKey((Object)string4)) {
            return (c)a.get((Object)string4);
        }
        c c2 = c.b(f.f.a.e.a.a.a.a().a(string4));
        if (b.super.a(c2)) {
            return null;
        }
        a.put((Object)string4, (Object)c2);
        return c2;
    }

    public final c a(String string2, String string3, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("reward_");
        stringBuilder.append(string2);
        stringBuilder.append("_");
        stringBuilder.append(string3);
        String string4 = stringBuilder.toString();
        if (a.containsKey((Object)string4)) {
            return (c)a.get((Object)string4);
        }
        c c2 = c.b(f.f.a.e.a.a.a.a().a(string4));
        if (b.super.a(c2)) {
            if (c2 == null) {
                return b.a(bl);
            }
            return c2;
        }
        a.put((Object)string4, (Object)c2);
        return c2;
    }

    public final void a(String string2, String string3, String string4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("reward_");
        stringBuilder.append(string2);
        stringBuilder.append("_");
        stringBuilder.append(string3);
        String string5 = stringBuilder.toString();
        f.f.a.e.a.a.a.a().a(string5, string4);
        c c2 = c.b(string4);
        a.put((Object)string5, (Object)c2);
        b.super.c(c.E, string3);
    }

    public final void a(String string2, String string3, String string4, f.f.a.s.c.c c2) {
        new f.f.a.s.c.a().a(f.f.a.e.c.a.i().e(), string2, string3, string4, c2);
    }

    public final f.f.a.s.d.a b() {
        f.f.a.s.d.a a2 = new f.f.a.s.d.a();
        HashMap hashMap = new HashMap(5);
        Integer n2 = 1000;
        hashMap.put((Object)"1", (Object)n2);
        hashMap.put((Object)"9", (Object)n2);
        hashMap.put((Object)"8", (Object)n2);
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put((Object)"1", (Object)new d("Virtual Item", 1));
        a2.a((Map<String, Integer>)hashMap);
        a2.b((Map<String, d>)hashMap2);
        a2.a(43200L);
        a2.b(5400L);
        a2.c(3600L);
        a2.d(3600L);
        a2.e(5L);
        return a2;
    }
}

