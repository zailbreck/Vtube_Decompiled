/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.f.a.e.b.c.a
 *  f.f.a.e.b.c.b
 *  f.f.a.e.b.c.c
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package f.f.a.e.b.c;

import f.f.a.e.b.c.a;
import f.f.a.e.b.c.b;
import f.f.a.e.b.c.c;
import java.util.ArrayList;
import java.util.List;

public final class d
extends b {
    public d(String string) {
        super(string);
    }

    protected final List<a> b() {
        ArrayList arrayList = new ArrayList();
        this.a(arrayList, c.l, "res");
        this.a(arrayList, c.c, "res/Movies").a(c.d, "res/.Mintegral_VC");
        a a2 = this.a(arrayList, c.e, "res/.mintegral700");
        a2.a(c.g, "res/img");
        a2.a(c.f, "res/res");
        a2.a(c.h, "res/html");
        this.a(arrayList, c.k, "other").a(c.i, "apk");
        this.a(arrayList, c.j, "crashinfo");
        this.a(arrayList, c.k, "other");
        return arrayList;
    }
}

