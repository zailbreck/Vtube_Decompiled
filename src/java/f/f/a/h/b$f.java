/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.f.a.e.b.h.b.a
 *  f.f.a.e.b.h.e.b
 *  f.f.a.e.b.h.i.a
 *  f.f.a.e.b.h.j.a
 *  f.f.a.e.b.h.n
 *  f.f.a.e.f.h
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.List
 *  org.json.JSONObject
 */
package f.f.a.h;

import f.f.a.e.b.h.e.b;
import f.f.a.e.b.h.n;
import f.f.a.e.e.a;
import f.f.a.e.f.h;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public abstract class b$f
extends f.f.a.e.b.h.h<JSONObject> {
    private static final String f = "b$f";

    public abstract void a(int var1, String var2, f.f.a.e.e.b var3);

    public final void a(f.f.a.e.b.h.b.a a2) {
        String string = f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("errorCode = ");
        stringBuilder.append(a2.b);
        h.d((String)string, (String)stringBuilder.toString());
        int n2 = a2.b;
        this.a(n2, f.f.a.e.b.h.j.a.a((int)n2), null);
    }

    @Override
    public final void a(n<JSONObject> n2) {
        f.f.a.e.b.h.i.a a2;
        if (n2 != null && (a2 = n2.b) != null) {
            List list = a2.c;
            JSONObject jSONObject = (JSONObject)n2.a;
            int n3 = jSONObject.optInt("status");
            f.f.a.e.e.b b2 = null;
            if (1 == n3) {
                this.a(System.currentTimeMillis());
                b2 = f.f.a.e.e.b.a(jSONObject.optJSONObject("data"));
                if (b2 != null && b2.c() != null && b2.c().size() > 0) {
                    this.a((List<b>)list, b2);
                    this.a(b2.c().size());
                    return;
                }
            }
            this.a(n3, jSONObject.optString("msg"), b2);
        }
    }

    public abstract void a(List<b> var1, f.f.a.e.e.b var2);
}

