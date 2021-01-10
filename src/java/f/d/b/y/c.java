/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.AccessibleObject
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.util.Collection
 *  java.util.EnumSet
 *  java.util.Map
 *  java.util.Queue
 *  java.util.Set
 *  java.util.SortedMap
 *  java.util.SortedSet
 *  java.util.concurrent.ConcurrentMap
 *  java.util.concurrent.ConcurrentNavigableMap
 */
package f.d.b.y;

import f.d.b.y.c;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class c {
    private final Map<Type, f.d.b.h<?>> a;
    private final f.d.b.y.o.b b = f.d.b.y.o.b.a();

    public c(Map<Type, f.d.b.h<?>> map) {
        this.a = map;
    }

    private <T> f.d.b.y.i<T> a(Class<? super T> class_) {
        try {
            Constructor constructor = class_.getDeclaredConstructor(new Class[0]);
            if (!constructor.isAccessible()) {
                this.b.a((AccessibleObject)constructor);
            }
            f.d.b.y.i i2 = new f.d.b.y.i<T>((c)this, constructor){
                final /* synthetic */ Constructor a;
                {
                    this.a = constructor;
                }

                public T a() {
                    Object object;
                    try {
                        object = this.a.newInstance(null);
                    }
                    catch (java.lang.IllegalAccessException illegalAccessException) {
                        throw new java.lang.AssertionError((Object)((Object)illegalAccessException));
                    }
                    catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                        stringBuilder.append("Failed to invoke ");
                        stringBuilder.append((Object)this.a);
                        stringBuilder.append(" with no args");
                        throw new java.lang.RuntimeException(stringBuilder.toString(), invocationTargetException.getTargetException());
                    }
                    catch (java.lang.InstantiationException instantiationException) {
                        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                        stringBuilder.append("Failed to invoke ");
                        stringBuilder.append((Object)this.a);
                        stringBuilder.append(" with no args");
                        throw new java.lang.RuntimeException(stringBuilder.toString(), (java.lang.Throwable)instantiationException);
                    }
                    return (T)object;
                }
            };
            return i2;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    private <T> f.d.b.y.i<T> a(Type type, Class<? super T> class_) {
        if (Collection.class.isAssignableFrom(class_)) {
            if (SortedSet.class.isAssignableFrom(class_)) {
                return new f.d.b.y.i<T>((c)this){

                    public T a() {
                        return (T)new java.util.TreeSet();
                    }
                };
            }
            if (EnumSet.class.isAssignableFrom(class_)) {
                return new f.d.b.y.i<T>((c)this, type){
                    final /* synthetic */ Type a;
                    {
                        this.a = type;
                    }

                    public T a() {
                        Type type = this.a;
                        if (type instanceof ParameterizedType) {
                            Type type2 = ((ParameterizedType)type).getActualTypeArguments()[0];
                            if (type2 instanceof Class) {
                                return (T)EnumSet.noneOf((Class)((Class)type2));
                            }
                            java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                            stringBuilder.append("Invalid EnumSet type: ");
                            stringBuilder.append(this.a.toString());
                            throw new f.d.b.m(stringBuilder.toString());
                        }
                        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                        stringBuilder.append("Invalid EnumSet type: ");
                        stringBuilder.append(this.a.toString());
                        throw new f.d.b.m(stringBuilder.toString());
                    }
                };
            }
            if (Set.class.isAssignableFrom(class_)) {
                return new f.d.b.y.i<T>((c)this){

                    public T a() {
                        return (T)new java.util.LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(class_)) {
                return new f.d.b.y.i<T>((c)this){

                    public T a() {
                        return (T)new java.util.ArrayDeque();
                    }
                };
            }
            return new f.d.b.y.i<T>((c)this){

                public T a() {
                    return (T)new java.util.ArrayList();
                }
            };
        }
        if (Map.class.isAssignableFrom(class_)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(class_)) {
                return new f.d.b.y.i<T>((c)this){

                    public T a() {
                        return (T)new java.util.concurrent.ConcurrentSkipListMap();
                    }
                };
            }
            if (ConcurrentMap.class.isAssignableFrom(class_)) {
                return new f.d.b.y.i<T>((c)this){

                    public T a() {
                        return (T)new java.util.concurrent.ConcurrentHashMap();
                    }
                };
            }
            if (SortedMap.class.isAssignableFrom(class_)) {
                return new f.d.b.y.i<T>((c)this){

                    public T a() {
                        return (T)new java.util.TreeMap();
                    }
                };
            }
            if (type instanceof ParameterizedType && !String.class.isAssignableFrom(f.d.b.z.a.a(((ParameterizedType)type).getActualTypeArguments()[0]).a())) {
                return new f.d.b.y.i<T>((c)this){

                    public T a() {
                        return (T)new java.util.LinkedHashMap();
                    }
                };
            }
            return new f.d.b.y.i<T>((c)this){

                public T a() {
                    return (T)((Object)new f.d.b.y.h<K, V>());
                }
            };
        }
        return null;
    }

    private <T> f.d.b.y.i<T> b(Type type, Class<? super T> class_) {
        return new f.d.b.y.i<T>((c)this, class_, type){
            private final f.d.b.y.m a;
            final /* synthetic */ Class b;
            final /* synthetic */ Type c;
            {
                this.b = class_;
                this.c = type;
                this.a = f.d.b.y.m.a();
            }

            public T a() {
                T t2;
                try {
                    t2 = this.a.a(this.b);
                }
                catch (java.lang.Exception exception) {
                    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                    stringBuilder.append("Unable to invoke no-args constructor for ");
                    stringBuilder.append((Object)this.c);
                    stringBuilder.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    throw new java.lang.RuntimeException(stringBuilder.toString(), (java.lang.Throwable)exception);
                }
                return t2;
            }
        };
    }

    public <T> f.d.b.y.i<T> a(f.d.b.z.a<T> a2) {
        Type type = a2.b();
        Class<T> class_ = a2.a();
        f.d.b.h h2 = (f.d.b.h)this.a.get((Object)type);
        if (h2 != null) {
            return new f.d.b.y.i<T>((c)this, h2, type){
                final /* synthetic */ f.d.b.h a;
                final /* synthetic */ Type b;
                {
                    this.a = h2;
                    this.b = type;
                }

                public T a() {
                    return this.a.a(this.b);
                }
            };
        }
        f.d.b.h h3 = (f.d.b.h)this.a.get(class_);
        if (h3 != null) {
            return new f.d.b.y.i<T>((c)this, h3, type){
                final /* synthetic */ f.d.b.h a;
                final /* synthetic */ Type b;
                {
                    this.a = h2;
                    this.b = type;
                }

                public T a() {
                    return this.a.a(this.b);
                }
            };
        }
        f.d.b.y.i<T> i2 = c.super.a(class_);
        if (i2 != null) {
            return i2;
        }
        f.d.b.y.i<T> i3 = c.super.a(type, class_);
        if (i3 != null) {
            return i3;
        }
        return c.super.b(type, class_);
    }

    public String toString() {
        return this.a.toString();
    }
}

