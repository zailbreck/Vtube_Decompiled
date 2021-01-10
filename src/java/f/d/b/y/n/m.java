/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.a0.a
 *  f.d.b.a0.c
 *  f.d.b.f
 *  f.d.b.v
 *  f.d.b.z.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Type
 *  java.lang.reflect.TypeVariable
 */
package f.d.b.y.n;

import f.d.b.a0.a;
import f.d.b.a0.c;
import f.d.b.f;
import f.d.b.v;
import f.d.b.y.n.i;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class m<T>
extends v<T> {
    private final f a;
    private final v<T> b;
    private final Type c;

    m(f f2, v<T> v2, Type type) {
        this.a = f2;
        this.b = v2;
        this.c = type;
    }

    private Type a(Type type, Object object) {
        if (object != null && (type == Object.class || type instanceof TypeVariable || type instanceof Class)) {
            type = object.getClass();
        }
        return type;
    }

    public T read(a a2) {
        return (T)this.b.read(a2);
    }

    public void write(c c2, T t2) {
        v<T> v2;
        v<T> v3 = this.b;
        Type type = m.super.a(this.c, t2);
        if (type != this.c && (v3 = this.a.a(f.d.b.z.a.a((Type)type))) instanceof i.b && !((v2 = this.b) instanceof i.b)) {
            v3 = v2;
        }
        v3.write(c2, t2);
    }
}

