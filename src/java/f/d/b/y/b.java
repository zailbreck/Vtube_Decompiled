/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Array
 *  java.lang.reflect.GenericArrayType
 *  java.lang.reflect.GenericDeclaration
 *  java.lang.reflect.Modifier
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.lang.reflect.TypeVariable
 *  java.lang.reflect.WildcardType
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Map
 *  java.util.NoSuchElementException
 *  java.util.Properties
 */
package f.d.b.y;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class b {
    static final Type[] a = new Type[0];

    static int a(Object object) {
        if (object != null) {
            return object.hashCode();
        }
        return 0;
    }

    private static int a(Object[] arrobject, Object object) {
        NoSuchElementException noSuchElementException;
        int n2 = arrobject.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!object.equals(arrobject[i2])) continue;
            return i2;
        }
        noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    private static Class<?> a(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class)genericDeclaration;
        }
        return null;
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static /* varargs */ ParameterizedType a(Type type, Type type2, Type ... arrtype) {
        return new b(type, type2, arrtype);
    }

    public static Type a(Type type, Class<?> class_) {
        Type type2 = b.b(type, class_, Collection.class);
        if (type2 instanceof WildcardType) {
            type2 = ((WildcardType)type2).getUpperBounds()[0];
        }
        if (type2 instanceof ParameterizedType) {
            return ((ParameterizedType)type2).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    static Type a(Type type, Class<?> class_, Class<?> class_2) {
        if (class_2 == class_) {
            return type;
        }
        if (class_2.isInterface()) {
            Class[] arrclass = class_.getInterfaces();
            int n2 = arrclass.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (arrclass[i2] == class_2) {
                    return class_.getGenericInterfaces()[i2];
                }
                if (!class_2.isAssignableFrom(arrclass[i2])) continue;
                return b.a(class_.getGenericInterfaces()[i2], arrclass[i2], class_2);
            }
        }
        if (!class_.isInterface()) {
            while (class_ != Object.class) {
                Class class_3 = class_.getSuperclass();
                if (class_3 == class_2) {
                    return class_.getGenericSuperclass();
                }
                if (class_2.isAssignableFrom(class_3)) {
                    return b.a(class_.getGenericSuperclass(), class_3, class_2);
                }
                class_ = class_3;
            }
        }
        return class_2;
    }

    public static Type a(Type type, Class<?> class_, Type type2) {
        return b.a(type, class_, type2, (Collection<TypeVariable>)new HashSet());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Type a(Type type, Class<?> class_, Type type2, Collection<TypeVariable> collection) {
        Class class_2;
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable)type2;
            if (collection.contains((Object)typeVariable)) {
                return type2;
            }
            collection.add((Object)typeVariable);
            type2 = b.a(type, class_, typeVariable);
            if (type2 != typeVariable) continue;
            return type2;
        }
        if (type2 instanceof Class && (class_2 = (Class)type2).isArray()) {
            Type type3;
            Class class_3 = class_2.getComponentType();
            if (class_3 != (type3 = b.a(type, class_, (Type)class_3, collection))) return b.a(type3);
            return class_2;
        }
        if (type2 instanceof GenericArrayType) {
            Type type4;
            GenericArrayType genericArrayType = (GenericArrayType)type2;
            Type type5 = genericArrayType.getGenericComponentType();
            if (type5 != (type4 = b.a(type, class_, type5, collection))) return b.a(type4);
            return genericArrayType;
        }
        boolean bl = type2 instanceof ParameterizedType;
        if (bl) {
            ParameterizedType parameterizedType = (ParameterizedType)type2;
            Type type6 = parameterizedType.getOwnerType();
            Type type7 = b.a(type, class_, type6, collection);
            boolean bl2 = type7 != type6;
            Type[] arrtype = parameterizedType.getActualTypeArguments();
            int n2 = arrtype.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                Type type8 = b.a(type, class_, arrtype[i2], collection);
                if (type8 == arrtype[i2]) continue;
                if (!bl2) {
                    arrtype = (Type[])arrtype.clone();
                    bl2 = true;
                }
                arrtype[i2] = type8;
            }
            if (!bl2) return parameterizedType;
            return b.a(type7, parameterizedType.getRawType(), arrtype);
        }
        if (!(type2 instanceof WildcardType)) return type2;
        type2 = (WildcardType)type2;
        Type[] arrtype = type2.getLowerBounds();
        Type[] arrtype2 = type2.getUpperBounds();
        if (arrtype.length == 1) {
            Type type9 = b.a(type, class_, arrtype[0], collection);
            if (type9 == arrtype[0]) return type2;
            return b.g(type9);
        }
        if (arrtype2.length != 1) return type2;
        Type type10 = arrtype2[0];
        Type type11 = b.a(type, class_, type10, collection);
        if (type11 == arrtype2[0]) return type2;
        return b.f(type11);
    }

    static Type a(Type type, Class<?> class_, TypeVariable<?> typeVariable) {
        Class<?> class_2 = b.a(typeVariable);
        if (class_2 == null) {
            return typeVariable;
        }
        Type type2 = b.a(type, class_, class_2);
        if (type2 instanceof ParameterizedType) {
            int n2 = b.a((Object[])class_2.getTypeParameters(), typeVariable);
            return ((ParameterizedType)type2).getActualTypeArguments()[n2];
        }
        return typeVariable;
    }

    static boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    public static boolean a(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals((Object)type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType)type;
            ParameterizedType parameterizedType2 = (ParameterizedType)type2;
            return b.a((Object)parameterizedType.getOwnerType(), (Object)parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals((Object)parameterizedType2.getRawType()) && Arrays.equals((Object[])parameterizedType.getActualTypeArguments(), (Object[])parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            GenericArrayType genericArrayType = (GenericArrayType)type;
            GenericArrayType genericArrayType2 = (GenericArrayType)type2;
            return b.a(genericArrayType.getGenericComponentType(), genericArrayType2.getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType)type;
            WildcardType wildcardType2 = (WildcardType)type2;
            return Arrays.equals((Object[])wildcardType.getUpperBounds(), (Object[])wildcardType2.getUpperBounds()) && Arrays.equals((Object[])wildcardType.getLowerBounds(), (Object[])wildcardType2.getLowerBounds());
        }
        if (type instanceof TypeVariable) {
            if (!(type2 instanceof TypeVariable)) {
                return false;
            }
            TypeVariable typeVariable = (TypeVariable)type;
            TypeVariable typeVariable2 = (TypeVariable)type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals((Object)typeVariable2.getName());
        }
        return false;
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Object object = (Class)type;
            if (object.isArray()) {
                object = new a(b.b((Type)object.getComponentType()));
            }
            return object;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType)type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType)type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType)type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    static Type b(Type type, Class<?> class_, Class<?> class_2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType)type).getUpperBounds()[0];
        }
        f.d.b.y.a.a(class_2.isAssignableFrom(class_));
        return b.a(type, class_, b.a(type, class_, class_2));
    }

    public static Type[] b(Type type, Class<?> class_) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type type2 = b.b(type, class_, Map.class);
        if (type2 instanceof ParameterizedType) {
            return ((ParameterizedType)type2).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    static void c(Type type) {
        boolean bl = !(type instanceof Class) || !((Class)type).isPrimitive();
        f.d.b.y.a.a(bl);
    }

    public static Type d(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType)type).getGenericComponentType();
        }
        return ((Class)type).getComponentType();
    }

    public static Class<?> e(Type type) {
        if (type instanceof Class) {
            return (Class)type;
        }
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType)type).getRawType();
            f.d.b.y.a.a(type2 instanceof Class);
            return (Class)type2;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(b.e(((GenericArrayType)type).getGenericComponentType()), (int)0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return b.e(((WildcardType)type).getUpperBounds()[0]);
        }
        String string = type == null ? "null" : type.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        stringBuilder.append((Object)type);
        stringBuilder.append("> is of type ");
        stringBuilder.append(string);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static WildcardType f(Type type) {
        Type[] arrtype = type instanceof WildcardType ? ((WildcardType)type).getUpperBounds() : new Type[]{type};
        return new c(arrtype, a);
    }

    public static WildcardType g(Type type) {
        Type[] arrtype = type instanceof WildcardType ? ((WildcardType)type).getLowerBounds() : new Type[]{type};
        return new c(new Type[]{Object.class}, arrtype);
    }

    public static String h(Type type) {
        if (type instanceof Class) {
            return ((Class)type).getName();
        }
        return type.toString();
    }

    private static final class a
    implements GenericArrayType,
    Serializable {
        private final Type b;

        public a(Type type) {
            this.b = b.b(type);
        }

        public boolean equals(Object object) {
            return object instanceof GenericArrayType && b.a((Type)this, (Type)((GenericArrayType)object));
        }

        public Type getGenericComponentType() {
            return this.b;
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b.h(this.b));
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }
    }

    private static final class b
    implements ParameterizedType,
    Serializable {
        private final Type b;
        private final Type c;
        private final Type[] d;

        public /* varargs */ b(Type type, Type type2, Type ... arrtype) {
            boolean bl = type2 instanceof Class;
            int n2 = 0;
            if (bl) {
                Class class_ = (Class)type2;
                boolean bl2 = Modifier.isStatic((int)class_.getModifiers());
                boolean bl3 = true;
                boolean bl4 = bl2 || class_.getEnclosingClass() == null;
                if (type == null && !bl4) {
                    bl3 = false;
                }
                f.d.b.y.a.a(bl3);
            }
            Type type3 = type == null ? null : b.b(type);
            this.b = type3;
            this.c = b.b(type2);
            this.d = (Type[])arrtype.clone();
            int n3 = this.d.length;
            while (n2 < n3) {
                f.d.b.y.a.a(this.d[n2]);
                b.c(this.d[n2]);
                Type[] arrtype2 = this.d;
                arrtype2[n2] = b.b(arrtype2[n2]);
                ++n2;
            }
        }

        public boolean equals(Object object) {
            return object instanceof ParameterizedType && b.a((Type)this, (Type)((ParameterizedType)object));
        }

        public Type[] getActualTypeArguments() {
            return (Type[])this.d.clone();
        }

        public Type getOwnerType() {
            return this.b;
        }

        public Type getRawType() {
            return this.c;
        }

        public int hashCode() {
            return Arrays.hashCode((Object[])this.d) ^ this.c.hashCode() ^ b.a((Object)this.b);
        }

        public String toString() {
            int n2 = this.d.length;
            if (n2 == 0) {
                return b.h(this.c);
            }
            StringBuilder stringBuilder = new StringBuilder(30 * (n2 + 1));
            stringBuilder.append(b.h(this.c));
            stringBuilder.append("<");
            stringBuilder.append(b.h(this.d[0]));
            for (int i2 = 1; i2 < n2; ++i2) {
                stringBuilder.append(", ");
                stringBuilder.append(b.h(this.d[i2]));
            }
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }

    private static final class c
    implements WildcardType,
    Serializable {
        private final Type b;
        private final Type c;

        public c(Type[] arrtype, Type[] arrtype2) {
            int n2 = arrtype2.length;
            int n3 = 1;
            boolean bl = n2 <= n3;
            f.d.b.y.a.a(bl);
            boolean bl2 = arrtype.length == n3;
            f.d.b.y.a.a(bl2);
            if (arrtype2.length == n3) {
                f.d.b.y.a.a(arrtype2[0]);
                b.c(arrtype2[0]);
                if (arrtype[0] != Object.class) {
                    n3 = 0;
                }
                f.d.b.y.a.a((boolean)n3);
                this.c = b.b(arrtype2[0]);
                this.b = Object.class;
                return;
            }
            f.d.b.y.a.a(arrtype[0]);
            b.c(arrtype[0]);
            this.c = null;
            this.b = b.b(arrtype[0]);
        }

        public boolean equals(Object object) {
            return object instanceof WildcardType && b.a((Type)this, (Type)((WildcardType)object));
        }

        public Type[] getLowerBounds() {
            Type type = this.c;
            if (type != null) {
                return new Type[]{type};
            }
            return b.a;
        }

        public Type[] getUpperBounds() {
            Type[] arrtype = new Type[]{this.b};
            return arrtype;
        }

        public int hashCode() {
            Type type = this.c;
            int n2 = type != null ? 31 + type.hashCode() : 1;
            return n2 ^ 31 + this.b.hashCode();
        }

        /*
         * Enabled aggressive block sorting
         */
        public String toString() {
            StringBuilder stringBuilder;
            Type type;
            if (this.c != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("? super ");
                type = this.c;
            } else {
                if (this.b == Object.class) {
                    return "?";
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("? extends ");
                type = this.b;
            }
            stringBuilder.append(b.h(type));
            return stringBuilder.toString();
        }
    }

}

