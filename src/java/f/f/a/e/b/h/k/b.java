/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.f.a.e.b.h.b.a
 *  f.f.a.e.b.h.j.a
 *  f.f.a.e.b.h.n
 *  f.f.a.e.f.h
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONObject
 */
package f.f.a.e.b.h.k;

import f.f.a.e.b.h.b.a;
import f.f.a.e.b.h.h;
import f.f.a.e.b.h.n;
import org.json.JSONObject;

public abstract class b
extends h<JSONObject> {
    private static final String f = "b";

    public final void a(a a2) {
        String string = f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("errorCode = ");
        stringBuilder.append(a2.b);
        f.f.a.e.f.h.d((String)string, (String)stringBuilder.toString());
        this.a(f.f.a.e.b.h.j.a.a((int)a2.b));
    }

    @Override
    public final void a(n<JSONObject> n2) {
        if (n2 != null) {
            String string = f;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("content = ");
            stringBuilder.append(n2.a);
            f.f.a.e.f.h.b((String)string, (String)stringBuilder.toString());
            int n3 = ((JSONObject)n2.a).optInt("status");
            if (n3 != 1 && n3 != 200) {
                this.a(((JSONObject)n2.a).optString("msg"));
                return;
            }
            this.a(((JSONObject)n2.a).optJSONObject("data"));
        }
    }

    public abstract void a(String var1);

    public abstract void a(JSONObject var1);
}

