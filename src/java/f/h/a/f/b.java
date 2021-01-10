/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package f.h.a.f;

import f.h.a.d;
import f.h.a.f.f;
import java.util.List;

public abstract class b
implements f {
    private Boolean b(String string) {
        Object t2 = this.a(string);
        if (t2 instanceof Boolean) {
            return (Boolean)t2;
        }
        return null;
    }

    private String e() {
        return (String)this.a("sql");
    }

    private List<Object> f() {
        return (List)this.a("arguments");
    }

    @Override
    public d a() {
        return new d(this.e(), this.f());
    }

    @Override
    public boolean b() {
        return Boolean.TRUE.equals(this.a("noResult"));
    }

    @Override
    public Boolean c() {
        return this.b("inTransaction");
    }

    public boolean d() {
        return Boolean.TRUE.equals(this.a("continueOnError"));
    }
}

