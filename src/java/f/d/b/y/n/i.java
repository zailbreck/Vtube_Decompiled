/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.a0.a
 *  f.d.b.a0.b
 *  f.d.b.a0.c
 *  f.d.b.e
 *  f.d.b.f
 *  f.d.b.v
 *  f.d.b.w
 *  f.d.b.x.b
 *  f.d.b.x.c
 *  f.d.b.y.b
 *  f.d.b.y.c
 *  f.d.b.y.i
 *  f.d.b.y.k
 *  f.d.b.y.n.i$c
 *  f.d.b.y.o.b
 *  f.d.b.z.a
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.AccessibleObject
 *  java.lang.reflect.Field
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 */
package f.d.b.y.n;

import f.d.b.e;
import f.d.b.f;
import f.d.b.t;
import f.d.b.v;
import f.d.b.w;
import f.d.b.y.k;
import f.d.b.y.n.d;
import f.d.b.y.n.i;
import f.d.b.y.n.m;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class i
implements w {
    private final f.d.b.y.c b;
    private final e c;
    private final f.d.b.y.d d;
    private final d e;
    private final f.d.b.y.o.b f = f.d.b.y.o.b.a();

    public i(f.d.b.y.c c2, e e2, f.d.b.y.d d2, d d3) {
        this.b = c2;
        this.c = e2;
        this.d = d2;
        this.e = d3;
    }

    private c a(final f f2, final Field field, String string, final f.d.b.z.a<?> a2, boolean bl, boolean bl2) {
        final boolean bl3 = k.a((Type)a2.a());
        f.d.b.x.b b2 = (f.d.b.x.b)field.getAnnotation(f.d.b.x.b.class);
        v v2 = b2 != null ? this.e.a(this.b, f2, a2, b2) : null;
        final boolean bl4 = v2 != null;
        if (v2 == null) {
            v2 = f2.a(a2);
        }
        final v v3 = v2;
        c c2 = new c(this, string, bl, bl2){

            void a(f.d.b.a0.a a22, Object object) {
                Object object2 = v3.read(a22);
                if (object2 != null || !bl3) {
                    field.set(object, object2);
                }
            }

            void a(f.d.b.a0.c c2, Object object) {
                Object object2 = field.get(object);
                m m2 = bl4 ? v3 : new m(f2, v3, a2.b());
                m2.write(c2, object2);
            }

            public boolean a(Object object) {
                if (!this.b) {
                    return false;
                }
                Object object2 = field.get(object);
                boolean bl = false;
                if (object2 != object) {
                    bl = true;
                }
                return bl;
            }
        };
        return c2;
    }

    private List<String> a(Field field) {
        f.d.b.x.c c2 = (f.d.b.x.c)field.getAnnotation(f.d.b.x.c.class);
        if (c2 == null) {
            return Collections.singletonList((Object)this.c.a(field));
        }
        String string = c2.value();
        String[] arrstring = c2.alternate();
        if (arrstring.length == 0) {
            return Collections.singletonList((Object)string);
        }
        ArrayList arrayList = new ArrayList(1 + arrstring.length);
        arrayList.add((Object)string);
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add((Object)arrstring[i2]);
        }
        return arrayList;
    }

    private Map<String, c> a(f f2, f.d.b.z.a<?> a2, Class<?> class_) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (class_.isInterface()) {
            return linkedHashMap;
        }
        Type type = a2.b();
        f.d.b.z.a a3 = a2;
        Class class_2 = class_;
        while (class_2 != Object.class) {
            for (Field field : class_2.getDeclaredFields()) {
                boolean bl = this.a(field, true);
                boolean bl2 = this.a(field, false);
                if (!bl && !bl2) continue;
                this.f.a((AccessibleObject)field);
                Type type2 = f.d.b.y.b.a((Type)a3.b(), (Class)class_2, (Type)field.getGenericType());
                List<String> list = i.super.a(field);
                int n2 = list.size();
                c c2 = null;
                int n3 = 0;
                while (n3 < n2) {
                    String string = (String)list.get(n3);
                    boolean bl3 = n3 != 0 ? false : bl;
                    f.d.b.z.a a4 = f.d.b.z.a.a((Type)type2);
                    c c3 = c2;
                    Field field2 = field;
                    int n4 = n3;
                    int n5 = n2;
                    List<String> list2 = list;
                    boolean bl4 = bl3;
                    Field field3 = field;
                    c c4 = linkedHashMap.put((Object)string, (Object)i.super.a(f2, field2, string, a4, bl4, bl2));
                    c2 = c3 == null ? c4 : c3;
                    n3 = n4 + 1;
                    bl = bl3;
                    list = list2;
                    n2 = n5;
                    field = field3;
                }
                c c5 = c2;
                if (c5 == null) {
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)type);
                stringBuilder.append(" declares multiple JSON fields named ");
                stringBuilder.append(c5.a);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            a3 = f.d.b.z.a.a((Type)f.d.b.y.b.a((Type)a3.b(), class_2, (Type)class_2.getGenericSuperclass()));
            class_2 = a3.a();
        }
        return linkedHashMap;
    }

    static boolean a(Field field, boolean bl, f.d.b.y.d d2) {
        return !d2.a(field.getType(), bl) && !d2.a(field, bl);
    }

    public boolean a(Field field, boolean bl) {
        return i.a(field, bl, this.d);
    }

    public <T> v<T> create(f f2, f.d.b.z.a<T> a2) {
        Class class_ = a2.a();
        if (!Object.class.isAssignableFrom(class_)) {
            return null;
        }
        return new b(this.b.a(a2), i.super.a(f2, a2, class_));
    }

    public static final class b<T>
    extends v<T> {
        private final f.d.b.y.i<T> a;
        private final Map<String, c> b;

        b(f.d.b.y.i<T> i2, Map<String, c> map) {
            this.a = i2;
            this.b = map;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public T read(f.d.b.a0.a a2) {
            if (a2.A() == f.d.b.a0.b.j) {
                a2.y();
                return null;
            }
            Object object = this.a.a();
            try {
                a2.b();
                while (a2.q()) {
                    String string = a2.x();
                    c c2 = this.b.get((Object)string);
                    if (c2 != null && c2.c) {
                        c2.a(a2, object);
                        continue;
                    }
                    a2.B();
                }
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError((Object)illegalAccessException);
            }
            catch (IllegalStateException illegalStateException) {
                t t2 = new t(illegalStateException);
                throw t2;
            }
            a2.o();
            return (T)object;
        }

        public void write(f.d.b.a0.c c2, T t2) {
            if (t2 == null) {
                c2.r();
                return;
            }
            c2.b();
            try {
                for (c c3 : this.b.values()) {
                    if (!c3.a(t2)) continue;
                    c2.b(c3.a);
                    c3.a(c2, t2);
                }
            }
            catch (IllegalAccessException illegalAccessException) {
                AssertionError assertionError = new AssertionError((Object)illegalAccessException);
                throw assertionError;
            }
            c2.n();
        }
    }

}

