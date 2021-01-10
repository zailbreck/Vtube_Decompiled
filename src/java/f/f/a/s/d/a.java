/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package f.f.a.s.d;

import android.text.TextUtils;
import f.f.a.s.b.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {
    private Map<String, Integer> a;
    private Map<String, d> b;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static a a(String string2) {
        a a2;
        void var5_13;
        block6 : {
            boolean bl = TextUtils.isEmpty((CharSequence)string2);
            a2 = null;
            if (bl) return a2;
            a a3 = new a();
            try {
                JSONObject jSONObject = new JSONObject(string2);
                JSONObject jSONObject2 = jSONObject.optJSONObject("caplist");
                if (jSONObject2 != null && jSONObject2.length() > 0) {
                    HashMap hashMap = new HashMap();
                    Iterator iterator = jSONObject2.keys();
                    while (iterator != null && iterator.hasNext()) {
                        String string3 = (String)iterator.next();
                        int n2 = jSONObject2.optInt(string3, 1000);
                        if (TextUtils.isEmpty((CharSequence)string3)) continue;
                        Integer n3 = !TextUtils.isEmpty((CharSequence)string3) && n2 == 0 ? Integer.valueOf((int)1000) : Integer.valueOf((int)n2);
                        hashMap.put((Object)string3, (Object)n3);
                    }
                    a3.a = hashMap;
                }
                a3.b = d.a(jSONObject.optJSONArray("reward"));
                a3.c = jSONObject.optLong("getpf", 43200L);
                a3.d = jSONObject.optLong("ruct", 5400L);
                a3.e = jSONObject.optLong("plct", 3600L);
                a3.f = jSONObject.optLong("dlct", 3600L);
                a3.g = jSONObject.optLong("vcct", 5L);
                a3.h = jSONObject.optLong("current_time");
                return a3;
            }
            catch (Exception exception) {
                a2 = a3;
            }
            break block6;
            catch (Exception exception) {
                // empty catch block
            }
        }
        var5_13.printStackTrace();
        return a2;
    }

    public final long a() {
        return 1000L * this.c;
    }

    public final void a(long l2) {
        this.c = l2;
    }

    public final void a(Map<String, Integer> map) {
        this.a = map;
    }

    public final long b() {
        return 1000L * this.d;
    }

    public final void b(long l2) {
        this.d = l2;
    }

    public final void b(Map<String, d> map) {
        this.b = map;
    }

    public final long c() {
        return 1000L * this.e;
    }

    public final void c(long l2) {
        this.e = l2;
    }

    public final long d() {
        return this.f;
    }

    public final void d(long l2) {
        this.f = l2;
    }

    public final long e() {
        return this.g;
    }

    public final void e(long l2) {
        this.g = l2;
    }

    public final long f() {
        return this.h;
    }

    public final Map<String, Integer> g() {
        if (this.a == null) {
            this.a = new HashMap();
            this.a.put((Object)"1", (Object)1000);
            this.a.put((Object)"9", (Object)1000);
            this.a.put((Object)"8", (Object)1000);
        }
        return this.a;
    }

    public final Map<String, d> h() {
        return this.b;
    }
}

