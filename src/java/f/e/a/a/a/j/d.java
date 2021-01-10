/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.e.a.a.a.j.b.b
 *  f.e.a.a.a.j.b.b$b
 *  f.e.a.a.a.j.b.e
 *  f.e.a.a.a.j.b.f
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashSet
 *  org.json.JSONObject
 */
package f.e.a.a.a.j;

import f.e.a.a.a.j.b.b;
import f.e.a.a.a.j.b.c;
import f.e.a.a.a.j.b.e;
import f.e.a.a.a.j.b.f;
import java.util.HashSet;
import org.json.JSONObject;

public class d
implements b.b {
    private JSONObject a;
    private final c b;

    public d(c c2) {
        this.b = c2;
    }

    public void a() {
        this.b.b(new f.e.a.a.a.j.b.d(this));
    }

    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, double d2) {
        c c2 = this.b;
        f f2 = new f((b.b)this, hashSet, jSONObject, d2);
        c2.b((b)f2);
    }

    public JSONObject b() {
        return this.a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, double d2) {
        c c2 = this.b;
        e e2 = new e((b.b)this, hashSet, jSONObject, d2);
        c2.b((b)e2);
    }
}

