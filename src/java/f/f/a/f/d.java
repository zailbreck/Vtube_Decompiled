/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package f.f.a.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import f.f.a.e.c.a;
import f.f.a.j.v;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {
    private String a;
    private String b;
    private List<Integer> c;
    private int d = 1;
    private int e;
    private int f;
    private long g;
    private int h = 10;
    private int i;
    private int j = 0;

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static d a(String string) {
        void var2_13;
        d d2;
        block8 : {
            JSONObject jSONObject;
            d d3;
            block9 : {
                JSONArray jSONArray;
                block10 : {
                    ArrayList arrayList;
                    JSONArray jSONArray2;
                    block11 : {
                        d2 = null;
                        boolean bl = TextUtils.isEmpty((CharSequence)string);
                        d2 = null;
                        if (bl) return d2;
                        d3 = new d();
                        jSONObject = new JSONObject(string);
                        d3.a = jSONObject.optString("unitId");
                        jSONArray2 = jSONObject.optJSONArray("adSourceList");
                        if (jSONArray2 == null || jSONArray2.length() <= 0) break block10;
                        arrayList = new ArrayList();
                        break block11;
                        catch (Exception exception) {
                            // empty catch block
                        }
                        break block8;
                    }
                    for (int i2 = 0; i2 < jSONArray2.length(); ++i2) {
                        arrayList.add((Object)jSONArray2.optInt(i2));
                    }
                    d3.c = arrayList;
                }
                if ((jSONArray = jSONObject.optJSONArray("ad_source_timeout")) == null || jSONArray.length() <= 0) break block9;
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < jSONArray.length(); ++i3) {
                    arrayList.add((Object)jSONArray.optInt(i3));
                }
            }
            try {
                jSONObject.optInt("tpqn");
                jSONObject.optInt("aqn");
                jSONObject.optInt("acn");
                jSONObject.optInt("wt");
                jSONObject.optInt("iscasf", 1);
                jSONObject.optInt("spmxrt", 5000);
                jSONObject.optInt("ttc_type");
                d3.b = jSONObject.optString("fbPlacementId");
                jSONObject.optLong("current_time");
                d3.d = jSONObject.optInt("offset");
                jSONObject.optString("admobUnitId");
                jSONObject.optString("myTargetSlotId");
                d3.g = jSONObject.optLong("dlct", 3600L);
                d3.e = jSONObject.optInt("autoplay", 0);
                d3.f = jSONObject.optInt("dlnet", 2);
                jSONObject.optString("no_offer");
                jSONObject.optInt("cb_type");
                jSONObject.optLong("clct", 86400L);
                jSONObject.optLong("clcq", 300L);
                d3.b(jSONObject.optInt("ready_rate", 100));
                d3.c(jSONObject.optInt("cd_rate", 0));
                jSONObject.optInt("content", 1);
                jSONObject.optInt("impt", 0);
                jSONObject.optDouble("cbp", 1.0);
                jSONObject.optInt("icon_type", 1);
                jSONObject.optString("no_ads_url", "");
                jSONObject.optInt("playclosebtn_tm", -1);
                jSONObject.optInt("play_ctdown", 0);
                jSONObject.optInt("close_alert", 0);
                jSONObject.optInt("intershowlimit", 30);
                jSONObject.optInt("refreshFq", 60);
                jSONObject.optInt("closeBtn", 0);
                jSONObject.optInt("tmorl", 1);
                jSONObject.optString("placementid", "");
                d3.h = jSONObject.optInt("ltafemty", 10);
                jSONObject.optInt("ltorwc", 60);
                return d3;
            }
            catch (Exception exception) {
                d2 = d3;
            }
        }
        var2_13.printStackTrace();
        return d2;
    }

    public static d b(String string) {
        d d2 = new d();
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)1);
        ArrayList arrayList2 = new ArrayList();
        Integer n2 = 8;
        arrayList2.add((Object)n2);
        arrayList2.add((Object)n2);
        d2.d = 1;
        d2.a = string;
        d2.c = arrayList;
        d2.g = 3600L;
        d2.f = 2;
        d2.e = 1;
        d2.b(100);
        d2.c(0);
        d2.h = 10;
        return d2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b(int n2) {
        try {
            if (v.a(a.i().e().getApplicationInfo()) && n2 != 0) {
                this.i = 100;
                return;
            }
            this.i = n2;
            return;
        }
        catch (Exception exception) {
            this.i = 100;
            return;
        }
    }

    public static d c(String string) {
        d d2 = new d();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Object)1);
            d2.c = arrayList;
            new ArrayList().add((Object)30);
            d2.a = string;
            d2.d = 1;
            d2.g = 3600L;
            d2.f = 2;
            d2.e = 3;
            return d2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return d2;
        }
    }

    private void c(int n2) {
        try {
            if (v.a(a.i().e().getApplicationInfo())) {
                this.j = 0;
                return;
            }
            this.j = n2;
            return;
        }
        catch (Exception exception) {
            this.j = 0;
            return;
        }
    }

    public static d g() {
        return new d();
    }

    public final int a() {
        return this.h;
    }

    public final void a(int n2) {
        this.e = n2;
    }

    public final int b() {
        return this.i;
    }

    public final int c() {
        return this.j;
    }

    public final long d() {
        return this.g;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final String toString() {
        List<Integer> list = this.c;
        String string = "";
        if (list != null && list.size() > 0) {
            for (Integer n2 : this.c) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append((Object)n2);
                stringBuilder.append(",");
                string = stringBuilder.toString();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("offset = ");
        stringBuilder.append(this.d);
        stringBuilder.append(" unitId = ");
        stringBuilder.append(this.a);
        stringBuilder.append(" fbPlacementId = ");
        stringBuilder.append(this.b);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

