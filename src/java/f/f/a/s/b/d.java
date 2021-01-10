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
 *  java.util.HashMap
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package f.f.a.s.b;

import android.text.TextUtils;
import f.f.a.s.d.a;
import f.f.a.s.d.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {
    private String a;
    private int b;

    public d(String string2, int n2) {
        this.a = string2;
        this.b = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d a(String string2) {
        d d2;
        block4 : {
            d d3;
            block3 : {
                d2 = null;
                try {
                    a a2 = b.c().a();
                    boolean bl = TextUtils.isEmpty((CharSequence)string2);
                    d2 = null;
                    if (bl) {
                        d3 = d.c();
                        break block3;
                    }
                    d2 = null;
                    if (a2 == null) break block4;
                    Map<String, d> map = a2.h();
                    d2 = null;
                    if (map == null) break block4;
                    d3 = (d)a2.h().get((Object)string2);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return d2;
                }
            }
            d2 = d3;
        }
        if (d2 != null) return d2;
        return d.c();
    }

    public static Map<String, d> a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            HashMap hashMap;
            int n2;
            try {
                hashMap = new HashMap();
                n2 = 0;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            do {
                if (n2 >= jSONArray.length()) break;
                JSONObject jSONObject = jSONArray.optJSONObject(n2);
                String string2 = jSONObject.optString("name");
                int n3 = jSONObject.optInt("amount");
                hashMap.put((Object)jSONObject.optString("id"), (Object)new d(string2, n3));
                ++n2;
            } while (true);
            return hashMap;
        }
        return null;
    }

    private static d c() {
        return new d("Virtual Item", 1);
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Reward{name='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", amount=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

