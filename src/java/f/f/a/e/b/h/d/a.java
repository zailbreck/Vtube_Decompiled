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
 */
package f.f.a.e.b.h.d;

import f.f.a.e.b.h.h;
import f.f.a.e.b.h.n;

public abstract class a
extends h<String> {
    private static final String f = "a";

    public final void a(f.f.a.e.b.h.b.a a2) {
        String string = f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("errorCode = ");
        stringBuilder.append(a2.b);
        f.f.a.e.f.h.d((String)string, (String)stringBuilder.toString());
        this.b(f.f.a.e.b.h.j.a.a((int)a2.b));
    }

    @Override
    public final void a(n<String> n2) {
        if (n2 != null) {
            this.a((String)n2.a);
        }
    }

    public abstract void a(String var1);

    public abstract void b(String var1);
}

