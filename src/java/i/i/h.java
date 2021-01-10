/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 */
package i.i;

import i.k.b.d;
import java.util.Collections;
import java.util.List;

class h {
    public static <T> List<T> a(T t2) {
        List list = Collections.singletonList(t2);
        d.b((Object)list, "java.util.Collections.singletonList(element)");
        return list;
    }
}

