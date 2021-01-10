/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.a0.a
 *  f.d.b.a0.b
 *  f.d.b.a0.c
 *  f.d.b.f
 *  f.d.b.l
 *  f.d.b.v
 *  f.d.b.w
 *  f.d.b.y.b
 *  f.d.b.y.c
 *  f.d.b.y.f
 *  f.d.b.y.i
 *  f.d.b.y.l
 *  f.d.b.y.n.n
 *  f.d.b.z.a
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package f.d.b.y.n;

import f.d.b.f;
import f.d.b.q;
import f.d.b.t;
import f.d.b.v;
import f.d.b.w;
import f.d.b.y.b;
import f.d.b.y.c;
import f.d.b.y.i;
import f.d.b.y.l;
import f.d.b.y.n.m;
import f.d.b.y.n.n;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class g
implements w {
    private final c b;
    final boolean c;

    public g(c c2, boolean bl) {
        this.b = c2;
        this.c = bl;
    }

    private v<?> a(f f2, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return f2.a(f.d.b.z.a.a((Type)type));
        }
        return n.f;
    }

    public <T> v<T> create(f f2, f.d.b.z.a<T> a2) {
        Type type = a2.b();
        if (!Map.class.isAssignableFrom(a2.a())) {
            return null;
        }
        Type[] arrtype = b.b((Type)type, (Class)b.e((Type)type));
        v<?> v2 = g.super.a(f2, arrtype[0]);
        v v3 = f2.a(f.d.b.z.a.a((Type)arrtype[1]));
        i i2 = this.b.a(a2);
        a a3 = (g)this.new a(f2, arrtype[0], v2, arrtype[1], v3, i2);
        return a3;
    }

    private final class a<K, V>
    extends v<Map<K, V>> {
        private final v<K> a;
        private final v<V> b;
        private final i<? extends Map<K, V>> c;

        public a(f f2, Type type, v<K> v2, Type type2, v<V> v3, i<? extends Map<K, V>> i2) {
            this.a = new m<K>(f2, v2, type);
            this.b = new m<V>(f2, v3, type2);
            this.c = i2;
        }

        private String a(f.d.b.l l2) {
            if (l2.g()) {
                q q2 = l2.c();
                if (q2.o()) {
                    return String.valueOf((Object)q2.l());
                }
                if (q2.n()) {
                    return Boolean.toString((boolean)q2.h());
                }
                if (q2.p()) {
                    return q2.m();
                }
                throw new AssertionError();
            }
            if (l2.e()) {
                return "null";
            }
            throw new AssertionError();
        }

        public void a(f.d.b.a0.c c2, Map<K, V> map) {
            if (map == null) {
                c2.r();
                return;
            }
            if (!g.this.c) {
                c2.b();
                for (Map.Entry entry : map.entrySet()) {
                    c2.b(String.valueOf((Object)entry.getKey()));
                    this.b.write(c2, entry.getValue());
                }
                c2.n();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator iterator = map.entrySet().iterator();
            int n2 = 0;
            boolean bl = false;
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                f.d.b.l l2 = this.a.toJsonTree(entry.getKey());
                arrayList.add((Object)l2);
                arrayList2.add(entry.getValue());
                boolean bl2 = l2.d() || l2.f();
                bl |= bl2;
            }
            if (bl) {
                c2.a();
                int n3 = arrayList.size();
                while (n2 < n3) {
                    c2.a();
                    l.a((f.d.b.l)((f.d.b.l)arrayList.get(n2)), (f.d.b.a0.c)c2);
                    this.b.write(c2, arrayList2.get(n2));
                    c2.m();
                    ++n2;
                }
                c2.m();
                return;
            }
            c2.b();
            int n4 = arrayList.size();
            while (n2 < n4) {
                c2.b(a.super.a((f.d.b.l)arrayList.get(n2)));
                this.b.write(c2, arrayList2.get(n2));
                ++n2;
            }
            c2.n();
        }

        public Map<K, V> read(f.d.b.a0.a a2) {
            f.d.b.a0.b b2 = a2.A();
            if (b2 == f.d.b.a0.b.j) {
                a2.y();
                return null;
            }
            Map map = (Map)this.c.a();
            if (b2 == f.d.b.a0.b.b) {
                a2.a();
                while (a2.q()) {
                    a2.a();
                    Object object = this.a.read(a2);
                    if (map.put(object, this.b.read(a2)) == null) {
                        a2.n();
                        continue;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("duplicate key: ");
                    stringBuilder.append(object);
                    throw new t(stringBuilder.toString());
                }
                a2.n();
                return map;
            }
            a2.b();
            while (a2.q()) {
                f.d.b.y.f.a.a(a2);
                Object object = this.a.read(a2);
                if (map.put(object, this.b.read(a2)) == null) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("duplicate key: ");
                stringBuilder.append(object);
                throw new t(stringBuilder.toString());
            }
            a2.o();
            return map;
        }
    }

}

