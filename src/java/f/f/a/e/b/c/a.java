/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package f.f.a.e.b.c;

import f.f.a.e.b.c.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a {
    private c a;
    private String b;
    private a c;
    private List<a> d;

    private void a(a a2) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        a2.c = this;
        this.d.add((Object)a2);
    }

    public final c a() {
        return this.a;
    }

    public final void a(c c2) {
        this.a = c2;
    }

    public final void a(c c2, String string) {
        a a2 = new a();
        a2.a = c2;
        a2.b = string;
        a.super.a(a2);
    }

    public final void a(String string) {
        this.b = string;
    }

    public final void a(List<a> list) {
        if (list != null) {
            if (list.size() == 0) {
                return;
            }
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                a.super.a((a)iterator.next());
            }
        }
    }

    public final String b() {
        return this.b;
    }

    public final a c() {
        return this.c;
    }

    public final List<a> d() {
        return this.d;
    }
}

