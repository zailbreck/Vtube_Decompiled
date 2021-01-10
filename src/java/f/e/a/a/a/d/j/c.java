/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package f.e.a.a.a.d.j;

import f.e.a.a.a.d.j.b;
import f.e.a.a.a.g.e;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    private final boolean a;
    private final Float b;
    private final boolean c;
    private final b d;

    private c(boolean bl, Float f2, boolean bl2, b b2) {
        this.a = bl;
        this.b = f2;
        this.c = bl2;
        this.d = b2;
    }

    public static c a(boolean bl, b b2) {
        e.a((Object)b2, "Position is null");
        return new c(false, null, bl, b2);
    }

    JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.a);
            if (this.a) {
                jSONObject.put("skipOffset", (Object)this.b);
            }
            jSONObject.put("autoPlay", this.c);
            jSONObject.put("position", (Object)this.d);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            f.e.a.a.a.g.c.a("VastProperties: JSON error", (Exception)((Object)jSONException));
            return jSONObject;
        }
    }
}

