/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  i.i.a
 *  i.i.g
 *  i.i.h
 *  i.k.b.d
 *  java.lang.ArithmeticException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package i.i;

import i.i.a;
import i.i.g;
import i.i.h;
import i.i.s;
import i.k.b.d;
import java.util.List;

class i
extends h {
    public static <T> List<T> a() {
        return s.b;
    }

    public static /* varargs */ <T> List<T> a(T ... arrT) {
        d.c(arrT, (String)"elements");
        if (arrT.length > 0) {
            return a.a((Object[])arrT);
        }
        return g.a();
    }

    public static final void b() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

