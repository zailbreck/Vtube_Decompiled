/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package f.f.a.s.b;

import f.f.a.s.b.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {
    private int a;
    private int b;

    public b(int n2, int n3, a a2) {
        this.a = n2;
        this.b = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List<b> a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            try {
                for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                    JSONObject jSONObject = jSONArray.optJSONObject(i2);
                    int n2 = jSONObject.optInt("id");
                    int n3 = jSONObject.optInt("timeout");
                    JSONObject jSONObject2 = jSONObject.optJSONObject("params");
                    a a2 = jSONObject2 != null ? a.a(jSONObject2) : null;
                    arrayList.add((Object)new b(n2, n3, a2));
                }
                return arrayList;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }
}

