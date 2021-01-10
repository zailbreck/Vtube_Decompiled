/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.e.a.a.b.f.a
 *  f.e.a.a.b.l.a
 *  f.e.a.a.b.m.b
 *  f.e.a.a.b.m.b$c
 *  f.e.a.a.b.m.b$c$b
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashSet
 *  org.json.JSONObject
 */
package f.e.a.a.b.m;

import f.e.a.a.b.e.l;
import f.e.a.a.b.l.a;
import f.e.a.a.b.m.b;
import f.e.a.a.b.m.b$b;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONObject;

public class b$f
extends b$b {
    public b$f(b.c.b b2, HashSet<String> hashSet, JSONObject jSONObject, long l2) {
        super(b2, hashSet, jSONObject, l2);
    }

    private void b(String string) {
        f.e.a.a.b.f.a a2 = f.e.a.a.b.f.a.d();
        if (a2 != null) {
            for (l l2 : a2.a()) {
                if (!this.c.contains((Object)l2.j())) continue;
                l2.k().b(string, this.e);
            }
        }
    }

    protected /* varargs */ String a(Object ... arrobject) {
        return this.d.toString();
    }

    protected void a(String string) {
        b$f.super.b(string);
        b.c.super.a(string);
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a(arrobject);
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((String)object);
    }
}

