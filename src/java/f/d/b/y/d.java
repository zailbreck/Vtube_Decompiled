/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.a0.a
 *  f.d.b.a0.c
 *  f.d.b.b
 *  f.d.b.c
 *  f.d.b.f
 *  f.d.b.v
 *  f.d.b.w
 *  f.d.b.x.a
 *  f.d.b.x.d
 *  f.d.b.x.e
 *  f.d.b.z.a
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.Field
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
package f.d.b.y;

import f.d.b.b;
import f.d.b.c;
import f.d.b.f;
import f.d.b.v;
import f.d.b.w;
import f.d.b.x.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class d
implements w,
Cloneable {
    public static final d h = new d();
    private double b = -1.0;
    private int c = 136;
    private boolean d = true;
    private boolean e;
    private List<b> f = Collections.emptyList();
    private List<b> g = Collections.emptyList();

    private boolean a(f.d.b.x.d d2) {
        return d2 == null || !(d2.value() > this.b);
    }

    private boolean a(f.d.b.x.d d2, e e2) {
        return d.super.a(d2) && d.super.a(e2);
    }

    private boolean a(e e2) {
        return e2 == null || !(e2.value() <= this.b);
    }

    private boolean a(Class<?> class_) {
        if (this.b != -1.0 && !d.super.a((f.d.b.x.d)class_.getAnnotation(f.d.b.x.d.class), (e)class_.getAnnotation(e.class))) {
            return true;
        }
        if (!this.d && d.super.c(class_)) {
            return true;
        }
        return d.super.b(class_);
    }

    private boolean b(Class<?> class_) {
        return !Enum.class.isAssignableFrom(class_) && (class_.isAnonymousClass() || class_.isLocalClass());
    }

    private boolean b(Class<?> class_, boolean bl) {
        List<b> list = bl ? this.f : this.g;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!((b)iterator.next()).a(class_)) continue;
            return true;
        }
        return false;
    }

    private boolean c(Class<?> class_) {
        return class_.isMemberClass() && !d.super.d(class_);
    }

    private boolean d(Class<?> class_) {
        return (8 & class_.getModifiers()) != 0;
    }

    public boolean a(Class<?> class_, boolean bl) {
        return d.super.a(class_) || d.super.b(class_, bl);
        {
        }
    }

    public boolean a(Field field, boolean bl) {
        if ((this.c & field.getModifiers()) != 0) {
            return true;
        }
        if (this.b != -1.0 && !d.super.a((f.d.b.x.d)field.getAnnotation(f.d.b.x.d.class), (e)field.getAnnotation(e.class))) {
            return true;
        }
        if (field.isSynthetic()) {
            return true;
        }
        if (this.e) {
            f.d.b.x.a a2 = (f.d.b.x.a)field.getAnnotation(f.d.b.x.a.class);
            if (a2 != null) {
                if (bl ? !a2.serialize() : !a2.deserialize()) {
                    return true;
                }
            } else {
                return true;
            }
        }
        if (!this.d && d.super.c(field.getType())) {
            return true;
        }
        if (d.super.b(field.getType())) {
            return true;
        }
        List<b> list = bl ? this.f : this.g;
        if (!list.isEmpty()) {
            c c2 = new c(field);
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!((b)iterator.next()).a(c2)) continue;
                return true;
            }
        }
        return false;
    }

    protected d clone() {
        try {
            d d2 = (d)super.clone();
            return d2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError((Object)cloneNotSupportedException);
        }
    }

    public <T> v<T> create(final f f2, final f.d.b.z.a<T> a2) {
        Class class_ = a2.a();
        boolean bl = d.super.a(class_);
        final boolean bl2 = bl || d.super.b(class_, true);
        final boolean bl3 = bl || d.super.b(class_, false);
        if (!bl2 && !bl3) {
            return null;
        }
        v v2 = new v<T>(){
            private v<T> a;

            private v<T> a() {
                v v2;
                v<T> v3 = this.a;
                if (v3 != null) {
                    return v3;
                }
                this.a = v2 = f2.a((w)d.this, a2);
                return v2;
            }

            public T read(f.d.b.a0.a a22) {
                if (bl3) {
                    a22.B();
                    return null;
                }
                return (T)a.super.a().read(a22);
            }

            public void write(f.d.b.a0.c c2, T t2) {
                if (bl2) {
                    c2.r();
                    return;
                }
                a.super.a().write(c2, t2);
            }
        };
        return v2;
    }

}

