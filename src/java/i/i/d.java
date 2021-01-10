/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package i.i;

import i.i.c;
import i.i.f;
import java.util.List;

class d
extends c {
    public static <T> List<T> a(T[] arrT) {
        i.k.b.d.c(arrT, "$this$asList");
        List<T> list = f.a(arrT);
        i.k.b.d.b(list, "ArraysUtilJVM.asList(this)");
        return list;
    }
}

