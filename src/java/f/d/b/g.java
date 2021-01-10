/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 *  java.sql.Date
 *  java.sql.Timestamp
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package f.d.b;

import f.d.b.a;
import f.d.b.e;
import f.d.b.f;
import f.d.b.h;
import f.d.b.u;
import f.d.b.w;
import f.d.b.y.d;
import f.d.b.y.n.n;
import java.lang.reflect.Type;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class g {
    private d a = d.h;
    private u b = u.b;
    private e c = f.d.b.d.b;
    private final Map<Type, h<?>> d = new HashMap();
    private final List<w> e = new ArrayList();
    private final List<w> f = new ArrayList();
    private boolean g = false;
    private String h;
    private int i = 2;
    private int j = 2;
    private boolean k = false;
    private boolean l = false;
    private boolean m = true;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;

    private void a(String string, int n2, int n3, List<w> list) {
        block4 : {
            a a2;
            a a3;
            a a4;
            block3 : {
                block2 : {
                    if (string == null || "".equals((Object)string.trim())) break block2;
                    a a5 = new a(java.util.Date.class, string);
                    a2 = new a(Timestamp.class, string);
                    a4 = new a(Date.class, string);
                    a3 = a5;
                    break block3;
                }
                if (n2 == 2 || n3 == 2) break block4;
                a3 = new a(java.util.Date.class, n2, n3);
                a a6 = new a(Timestamp.class, n2, n3);
                a a7 = new a(Date.class, n2, n3);
                a2 = a6;
                a4 = a7;
            }
            list.add((Object)n.a(java.util.Date.class, a3));
            list.add((Object)n.a(Timestamp.class, a2));
            list.add((Object)n.a(Date.class, a4));
        }
    }

    public f a() {
        ArrayList arrayList = new ArrayList(3 + (this.e.size() + this.f.size()));
        arrayList.addAll(this.e);
        Collections.reverse((List)arrayList);
        ArrayList arrayList2 = new ArrayList(this.f);
        Collections.reverse((List)arrayList2);
        arrayList.addAll((Collection)arrayList2);
        this.a(this.h, this.i, this.j, (List<w>)arrayList);
        f f2 = new f(this.a, this.c, this.d, this.g, this.k, this.o, this.m, this.n, this.p, this.l, this.b, this.h, this.i, this.j, this.e, this.f, (List<w>)arrayList);
        return f2;
    }

    public g a(w w2) {
        this.e.add((Object)w2);
        return this;
    }
}

