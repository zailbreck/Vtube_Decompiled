/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 */
package f.d.b.z;

import f.d.b.y.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class a<T> {
    final Class<? super T> a;
    final Type b;
    final int c;

    protected a() {
        this.b = a.b(a.class);
        this.a = b.e(this.b);
        this.c = this.b.hashCode();
    }

    a(Type type) {
        f.d.b.y.a.a(type);
        this.b = b.b(type);
        this.a = b.e(this.b);
        this.c = this.b.hashCode();
    }

    public static <T> a<T> a(Class<T> class_) {
        return new a<T>((Type)class_);
    }

    public static a<?> a(Type type) {
        return new a<T>(type);
    }

    static Type b(Class<?> class_) {
        Type type = class_.getGenericSuperclass();
        if (!(type instanceof Class)) {
            return b.b(((ParameterizedType)type).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final Class<? super T> a() {
        return this.a;
    }

    public final Type b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        return object instanceof a && b.a(this.b, ((a)object).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return b.h(this.b);
    }
}

