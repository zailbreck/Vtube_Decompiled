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
 *  f.d.b.y.h
 *  f.d.b.y.n.h$b
 *  f.d.b.z.a
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package f.d.b.y.n;

import f.d.b.a0.c;
import f.d.b.f;
import f.d.b.v;
import f.d.b.w;
import f.d.b.y.n.h;
import java.util.ArrayList;

public final class h
extends v<Object> {
    public static final w b = new w(){

        public <T> v<T> create(f f2, f.d.b.z.a<T> a2) {
            if (a2.a() == Object.class) {
                return new h(f2);
            }
            return null;
        }
    };
    private final f a;

    h(f f2) {
        this.a = f2;
    }

    public Object read(f.d.b.a0.a a2) {
        f.d.b.a0.b b2 = a2.A();
        switch (b.a[b2.ordinal()]) {
            default: {
                throw new IllegalStateException();
            }
            case 6: {
                a2.y();
                return null;
            }
            case 5: {
                return a2.t();
            }
            case 4: {
                return a2.u();
            }
            case 3: {
                return a2.z();
            }
            case 2: {
                f.d.b.y.h h2 = new f.d.b.y.h();
                a2.b();
                while (a2.q()) {
                    h2.put((Object)a2.x(), this.read(a2));
                }
                a2.o();
                return h2;
            }
            case 1: 
        }
        ArrayList arrayList = new ArrayList();
        a2.a();
        while (a2.q()) {
            arrayList.add(this.read(a2));
        }
        a2.n();
        return arrayList;
    }

    public void write(c c2, Object object) {
        if (object == null) {
            c2.r();
            return;
        }
        v v2 = this.a.a(object.getClass());
        if (v2 instanceof h) {
            c2.b();
            c2.n();
            return;
        }
        v2.write(c2, object);
    }

}

