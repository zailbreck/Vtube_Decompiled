/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.f
 *  f.d.b.k
 *  f.d.b.s
 *  f.d.b.v
 *  f.d.b.w
 *  f.d.b.x.b
 *  f.d.b.y.c
 *  f.d.b.y.i
 *  f.d.b.z.a
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 */
package f.d.b.y.n;

import f.d.b.f;
import f.d.b.k;
import f.d.b.s;
import f.d.b.v;
import f.d.b.w;
import f.d.b.x.b;
import f.d.b.y.c;
import f.d.b.y.i;
import f.d.b.y.n.l;
import f.d.b.z.a;
import java.lang.annotation.Annotation;

public final class d
implements w {
    private final c b;

    public d(c c2) {
        this.b = c2;
    }

    v<?> a(c c2, f f2, a<?> a2, b b2) {
        l l2;
        Object object = c2.a(a.a((Class)b2.value())).a();
        if (object instanceof v) {
            l2 = (l)((Object)object);
        } else if (object instanceof w) {
            l2 = ((w)object).create(f2, a2);
        } else {
            boolean bl = object instanceof s;
            if (!bl && !(object instanceof k)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid attempt to bind an instance of ");
                stringBuilder.append(object.getClass().getName());
                stringBuilder.append(" as a @JsonAdapter for ");
                stringBuilder.append(a2.toString());
                stringBuilder.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            s s2 = bl ? (s)object : null;
            boolean bl2 = object instanceof k;
            k k2 = null;
            if (bl2) {
                k2 = (k)object;
            }
            k k3 = k2;
            l2 = new l(s2, k3, f2, a2, null);
        }
        if (l2 != null && b2.nullSafe()) {
            l2 = l2.nullSafe();
        }
        return l2;
    }

    public <T> v<T> create(f f2, a<T> a2) {
        b b2 = (b)a2.a().getAnnotation(b.class);
        if (b2 == null) {
            return null;
        }
        return this.a(this.b, f2, a2, b2);
    }
}

