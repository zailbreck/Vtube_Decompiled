/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  org.json.JSONArray
 */
package f.f.a.e.f;

import java.util.ArrayList;
import org.json.JSONArray;

public final class n {
    public static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray != null) {
            int n2 = jSONArray.length();
            ArrayList arrayList = new ArrayList(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                arrayList.add((Object)jSONArray.optString(i2));
            }
            return arrayList;
        }
        return null;
    }
}

