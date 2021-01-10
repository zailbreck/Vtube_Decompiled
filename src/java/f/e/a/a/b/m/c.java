/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.e.a.a.b.m.b
 *  f.e.a.a.b.m.b$c
 *  f.e.a.a.b.m.b$c$b
 *  f.e.a.a.b.m.b$f
 *  f.e.a.a.b.m.b$g
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashSet
 *  org.json.JSONObject
 */
package f.e.a.a.b.m;

import f.e.a.a.b.m.b;
import f.e.a.a.b.m.b$d;
import f.e.a.a.b.m.b$e;
import java.util.HashSet;
import org.json.JSONObject;

public class c
implements b.c.b {
    private JSONObject a;
    private final b$d b;

    public c(b$d b$d) {
        this.b = b$d;
    }

    public void a() {
        this.b.b(new b$e(this));
    }

    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long l2) {
        b$d b$d = this.b;
        b.g g2 = new b.g((b.c.b)this, hashSet, jSONObject, l2);
        b$d.b((b.c)g2);
    }

    public JSONObject b() {
        return this.a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long l2) {
        b$d b$d = this.b;
        b.f f2 = new b.f((b.c.b)this, hashSet, jSONObject, l2);
        b$d.b((b.c)f2);
    }
}

