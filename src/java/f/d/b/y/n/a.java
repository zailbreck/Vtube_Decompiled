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
 *  f.d.b.z.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Array
 *  java.lang.reflect.GenericArrayType
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 */
package f.d.b.y.n;

import f.d.b.a0.c;
import f.d.b.f;
import f.d.b.v;
import f.d.b.w;
import f.d.b.y.b;
import f.d.b.y.n.m;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class a<E>
extends v<Object> {
    public static final w c = new w(){

        public <T> v<T> create(f f2, f.d.b.z.a<T> a2) {
            Type type = a2.b();
            if (!(type instanceof GenericArrayType || type instanceof Class && ((Class)type).isArray())) {
                return null;
            }
            Type type2 = b.d((Type)type);
            return new a(f2, f2.a(f.d.b.z.a.a((Type)type2)), b.e((Type)type2));
        }
    };
    private final Class<E> a;
    private final v<E> b;

    public a(f f2, v<E> v2, Class<E> class_) {
        this.b = new m<E>(f2, v2, (Type)class_);
        this.a = class_;
    }

    public Object read(f.d.b.a0.a a2) {
        if (a2.A() == f.d.b.a0.b.j) {
            a2.y();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        a2.a();
        while (a2.q()) {
            arrayList.add(this.b.read(a2));
        }
        a2.n();
        int n2 = arrayList.size();
        Object object = Array.newInstance(this.a, (int)n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Array.set((Object)object, (int)i2, (Object)arrayList.get(i2));
        }
        return object;
    }

    public void write(c c2, Object object) {
        if (object == null) {
            c2.r();
            return;
        }
        c2.a();
        int n2 = Array.getLength((Object)object);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2 = Array.get((Object)object, (int)i2);
            this.b.write(c2, object2);
        }
        c2.m();
    }

}

