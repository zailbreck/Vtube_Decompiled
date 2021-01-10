/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.Void
 *  java.lang.reflect.Type
 */
package f.d.b.y;

import java.lang.reflect.Type;

public final class k {
    public static <T> Class<T> a(Class<T> object) {
        if (object == Integer.TYPE) {
            return Integer.class;
        }
        if (object == Float.TYPE) {
            return Float.class;
        }
        if (object == Byte.TYPE) {
            return Byte.class;
        }
        if (object == Double.TYPE) {
            return Double.class;
        }
        if (object == Long.TYPE) {
            return Long.class;
        }
        if (object == Character.TYPE) {
            return Character.class;
        }
        if (object == Boolean.TYPE) {
            return Boolean.class;
        }
        if (object == Short.TYPE) {
            return Short.class;
        }
        if (object == Void.TYPE) {
            object = Void.class;
        }
        return object;
    }

    public static boolean a(Type type) {
        return type instanceof Class && ((Class)type).isPrimitive();
    }
}

