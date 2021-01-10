/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 */
package f.f.a.s.b;

import org.json.JSONObject;

public final class a {
    private a(String string2, String string3) {
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                a a2 = new a(jSONObject.optString("appId"), jSONObject.optString("placementId"));
                return a2;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }
}

