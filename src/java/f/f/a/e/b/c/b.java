/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package f.f.a.e.b.c;

import f.f.a.e.b.c.a;
import f.f.a.e.b.c.c;
import java.util.ArrayList;
import java.util.List;

public abstract class b {
    protected a a;

    public b(String string) {
        a a2 = new a();
        a2.a(string);
        a2.a(c.b);
        List<a> list = this.b();
        if (list != null && list.size() > 0) {
            a2.a(list);
        }
        this.a = a2;
    }

    public final a a() {
        return this.a;
    }

    protected final a a(ArrayList<a> arrayList, c c2, String string) {
        a a2 = new a();
        a2.a(c2);
        a2.a(string);
        arrayList.add((Object)a2);
        return a2;
    }

    protected abstract List<a> b();
}

