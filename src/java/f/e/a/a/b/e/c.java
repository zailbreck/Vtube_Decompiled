/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  org.json.JSONObject
 */
package f.e.a.a.b.e;

import f.e.a.a.b.e.f;
import f.e.a.a.b.e.h;
import f.e.a.a.b.e.i;
import f.e.a.a.b.j.b;
import f.e.a.a.b.j.e;
import org.json.JSONObject;

public class c {
    private final i a;
    private final i b;
    private final boolean c;
    private final f d;
    private final h e;

    private c(f f2, h h2, i i2, i i3, boolean bl) {
        this.d = f2;
        this.e = h2;
        this.a = i2;
        this.b = i3 == null ? i.e : i3;
        this.c = bl;
    }

    public static c a(f f2, h h2, i i2, i i3, boolean bl) {
        e.a((Object)f2, "CreativeType is null");
        e.a((Object)h2, "ImpressionType is null");
        e.a((Object)i2, "Impression owner is null");
        e.a(i2, f2, h2);
        c c2 = new c(f2, h2, i2, i3, bl);
        return c2;
    }

    public boolean a() {
        return i.c == this.a;
    }

    public boolean b() {
        return i.c == this.b;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "impressionOwner", (Object)this.a);
        b.a(jSONObject, "mediaEventsOwner", (Object)this.b);
        b.a(jSONObject, "creativeType", (Object)this.d);
        b.a(jSONObject, "impressionType", (Object)this.e);
        b.a(jSONObject, "isolateVerificationScripts", this.c);
        return jSONObject;
    }
}

