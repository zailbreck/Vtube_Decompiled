/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.reflect.AccessibleObject
 */
package f.d.b.y.o;

import f.d.b.y.e;
import f.d.b.y.o.a;
import f.d.b.y.o.c;
import java.lang.reflect.AccessibleObject;

public abstract class b {
    private static final b a;

    static {
        b b2 = e.b() < 9 ? new a() : new c();
        a = b2;
    }

    public static b a() {
        return a;
    }

    public abstract void a(AccessibleObject var1);
}

