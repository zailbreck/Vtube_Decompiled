/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  org.json.JSONObject
 */
package f.e.a.a.a.d;

import f.e.a.a.a.d.f;
import f.e.a.a.a.g.b;
import f.e.a.a.a.g.e;
import org.json.JSONObject;

public class c {
    private final f a;
    private final f b;
    private final boolean c;

    private c(f f2, f f3, boolean bl) {
        this.a = f2;
        this.b = f3 == null ? f.e : f3;
        this.c = bl;
    }

    public static c a(f f2, f f3, boolean bl) {
        e.a((Object)f2, "Impression owner is null");
        e.a(f2);
        return new c(f2, f3, bl);
    }

    public boolean a() {
        return f.c == this.a;
    }

    public boolean b() {
        return f.c == this.b;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "impressionOwner", (Object)this.a);
        b.a(jSONObject, "videoEventsOwner", (Object)this.b);
        b.a(jSONObject, "isolateVerificationScripts", this.c);
        return jSONObject;
    }
}

