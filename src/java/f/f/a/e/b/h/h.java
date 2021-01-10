/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.base.common.report.a
 *  com.mintegral.msdk.base.common.report.a$c
 *  f.f.a.e.b.h.g
 *  f.f.a.e.b.h.j.c
 *  f.f.a.e.b.h.n
 *  f.f.a.e.c.a
 *  f.f.a.e.e.i
 *  f.f.a.e.f.h
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  org.json.JSONObject
 */
package f.f.a.e.b.h;

import com.mintegral.msdk.base.common.report.a;
import f.f.a.e.b.h.g;
import f.f.a.e.b.h.j.c;
import f.f.a.e.b.h.n;
import f.f.a.e.e.i;
import org.json.JSONObject;

public class h<T>
implements g<T> {
    private long a;
    public String b = "";
    public String c = "";
    public int d = 0;
    private a.c e = null;

    public final void a(int n2) {
        a.c c2 = this.e;
        if (c2 != null) {
            c2.b(n2);
            this.e.a();
        }
    }

    public final void a(long l2) {
        this.e = new a.c(new i());
        this.e.b(this.b);
        this.e.a(1);
        a.c c2 = this.e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(l2 - this.a);
        stringBuilder.append("");
        c2.a(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(n<T> n2) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f.f.a.e.c.a.i().f());
            stringBuilder.append("_");
            stringBuilder.append(this.c);
            stringBuilder.append("_");
            stringBuilder.append(this.b);
            stringBuilder.append("_");
            stringBuilder.append(this.d);
            String string = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(n2.a);
            stringBuilder2.append(" ");
            stringBuilder2.append(string);
            f.f.a.e.f.h.d((String)"Listener", (String)stringBuilder2.toString());
            boolean bl = n2.a instanceof JSONObject;
            if (bl) {
                int n3 = ((JSONObject)n2.a).optInt("status");
                String string2 = ((JSONObject)n2.a).toString();
                c.a().a(string, n3, string2, System.currentTimeMillis());
            }
            if (!(n2.a instanceof String)) return;
            int n4 = new JSONObject((String)n2.a).optInt("status");
            String string3 = (String)n2.a;
            c.a().a(string, n4, string3, System.currentTimeMillis());
            return;
        }
        catch (Exception exception) {
            f.f.a.e.f.h.d((String)"Listener", (String)exception.getMessage());
        }
    }
}

