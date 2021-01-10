/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.a0.a
 *  f.d.b.a0.b
 *  f.d.b.a0.c
 *  f.d.b.f
 *  f.d.b.v
 *  f.d.b.w
 *  f.d.b.y.b
 *  f.d.b.y.c
 *  f.d.b.y.i
 *  f.d.b.z.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Type
 *  java.util.Collection
 */
package f.d.b.y.n;

import f.d.b.f;
import f.d.b.v;
import f.d.b.w;
import f.d.b.y.c;
import f.d.b.y.i;
import f.d.b.y.n.m;
import java.lang.reflect.Type;
import java.util.Collection;

public final class b
implements w {
    private final c b;

    public b(c c2) {
        this.b = c2;
    }

    public <T> v<T> create(f f2, f.d.b.z.a<T> a2) {
        Type type = a2.b();
        Class class_ = a2.a();
        if (!Collection.class.isAssignableFrom(class_)) {
            return null;
        }
        Type type2 = f.d.b.y.b.a((Type)type, (Class)class_);
        return new a(f2, type2, f2.a(f.d.b.z.a.a((Type)type2)), this.b.a(a2));
    }

    private static final class a<E>
    extends v<Collection<E>> {
        private final v<E> a;
        private final i<? extends Collection<E>> b;

        public a(f f2, Type type, v<E> v2, i<? extends Collection<E>> i2) {
            this.a = new m<E>(f2, v2, type);
            this.b = i2;
        }

        public void a(f.d.b.a0.c c2, Collection<E> collection) {
            if (collection == null) {
                c2.r();
                return;
            }
            c2.a();
            for (Object object : collection) {
                this.a.write(c2, object);
            }
            c2.m();
        }

        public Collection<E> read(f.d.b.a0.a a2) {
            if (a2.A() == f.d.b.a0.b.j) {
                a2.y();
                return null;
            }
            Collection collection = (Collection)this.b.a();
            a2.a();
            while (a2.q()) {
                collection.add(this.a.read(a2));
            }
            a2.n();
            return collection;
        }
    }

}

