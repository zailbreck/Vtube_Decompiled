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
package f.f.a.n.d;

import f.f.a.e.b.h.e.b;
import f.f.a.e.b.h.n;
import f.f.a.e.e.a;
import f.f.a.e.f.h;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public abstract class c
extends f.f.a.e.b.h.h<JSONObject> {
    private static final String h = "c";
    private int f;
    private String g;

    public abstract void a(int var1, String var2);

    public final void a(f.f.a.e.b.h.b.a a2) {
        String string = h;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("errorCode = ");
        stringBuilder.append(a2.b);
        h.d((String)string, (String)stringBuilder.toString());
        int n2 = a2.b;
        this.a(n2, f.f.a.e.b.h.j.a.a((int)n2));
    }

    @Override
    public final void a(n<JSONObject> n2) {
        block2 : {
            JSONObject jSONObject;
            int n3;
            block6 : {
                int n4;
                block5 : {
                    int n5;
                    block3 : {
                        int n6;
                        JSONObject jSONObject2;
                        block4 : {
                            f.f.a.e.b.h.i.a a2;
                            super.a(n2);
                            if (n2 == null || (a2 = n2.b) == null) break block2;
                            n5 = this.f;
                            if (n5 != 0) break block3;
                            List list = a2.c;
                            jSONObject2 = (JSONObject)n2.a;
                            n6 = jSONObject2.optInt("status");
                            if (1 != n6) break block4;
                            this.a(System.currentTimeMillis());
                            f.f.a.e.e.b b2 = f.f.a.e.e.b.a(jSONObject2.optJSONObject("data"), this.g);
                            if (b2 == null || b2.c() == null || b2.c().size() <= 0) break block4;
                            this.a((List<b>)list, b2);
                            n4 = b2.c().size();
                            break block5;
                        }
                        this.a(n6, jSONObject2.optString("msg"));
                        return;
                    }
                    if (n5 != 1) break block2;
                    jSONObject = (JSONObject)n2.a;
                    n3 = jSONObject.optInt("status");
                    if (1 != n3) break block6;
                    this.a(System.currentTimeMillis());
                    f.f.a.e.e.b b3 = f.f.a.e.e.b.a(jSONObject.optJSONObject("data"), this.g);
                    if (b3 == null || b3.i() == null || b3.i().size() <= 0) break block6;
                    List<f.f.a.m.c> list = b3.i();
                    this.a(list);
                    n4 = list.size();
                }
                this.a(n4);
                return;
            }
            this.a(n3, jSONObject.optString("msg"));
        }
    }

    public final void a(String string) {
        this.g = string;
    }

    @Override
    public abstract void a(List<f.f.a.m.c> var1);

    public abstract void a(List<b> var1, f.f.a.e.e.b var2);
}

