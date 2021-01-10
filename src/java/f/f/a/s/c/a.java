/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  f.f.a.e.b.h.g
 *  f.f.a.e.b.h.j.d
 *  f.f.a.e.b.h.k.c
 *  f.f.a.s.c.a$a
 *  f.f.a.s.c.a$b
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.s.c;

import android.content.Context;
import f.f.a.e.b.h.g;
import f.f.a.e.b.h.h;
import f.f.a.e.b.h.j.d;
import f.f.a.s.c.a;
import f.f.a.s.c.c;

public class a {
    private static final String a = "f.f.a.s.c.a";

    static /* synthetic */ String a() {
        return a;
    }

    public final void a(Context context, String string2, String string3) {
        f.f.a.s.c.b b2 = new f.f.a.s.c.b(context);
        f.f.a.e.b.h.k.c c2 = new f.f.a.e.b.h.k.c();
        c2.a("app_id", string2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        c2.a("sign", f.f.a.e.f.a.a(stringBuilder.toString()));
        b2.a(1, d.a().h, c2, (g)new a((a)this, string2));
    }

    public final void a(Context context, String string2, String string3, String string4, c c2) {
        f.f.a.s.c.b b2 = new f.f.a.s.c.b(context);
        f.f.a.e.b.h.k.c c3 = new f.f.a.e.b.h.k.c();
        c3.a("app_id", string2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        c3.a("sign", f.f.a.e.f.a.a(stringBuilder.toString()));
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("[");
        stringBuilder2.append(string4);
        stringBuilder2.append("]");
        c3.a("unit_ids", stringBuilder2.toString());
        b b3 = new b(this, string2, c2);
        b3.b = string4;
        b2.a(1, d.a().h, c3, (g)b3);
    }
}

