/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.NoSuchElementException
 */
package i.i;

import i.i.i;
import i.i.p;
import i.k.b.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class q
extends p {
    public static final <C extends Collection<? super T>, T> C a(Iterable<? extends T> iterable, C c2) {
        d.c(iterable, "$this$filterNotNullTo");
        d.c(c2, "destination");
        for (Object object : iterable) {
            if (object == null) continue;
            c2.add(object);
        }
        return c2;
    }

    public static <T> List<T> a(Iterable<? extends T> iterable) {
        d.c(iterable, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        q.a(iterable, arrayList);
        return (List)arrayList;
    }

    public static <T> boolean a(Iterable<? extends T> iterable, T t2) {
        d.c(iterable, "$this$contains");
        if (iterable instanceof Collection) {
            return ((Collection)iterable).contains(t2);
        }
        return q.b(iterable, t2) >= 0;
    }

    public static final <T> int b(Iterable<? extends T> iterable, T t2) {
        d.c(iterable, "$this$indexOf");
        if (iterable instanceof List) {
            return ((List)iterable).indexOf(t2);
        }
        int n2 = 0;
        for (Object object : iterable) {
            if (n2 >= 0) {
                if (d.a(t2, object)) {
                    return n2;
                }
                ++n2;
                continue;
            }
            i.b();
            throw null;
        }
        return -1;
    }

    public static <T> T b(Iterable<? extends T> iterable) {
        d.c(iterable, "$this$single");
        if (iterable instanceof List) {
            return q.c((List)iterable);
        }
        Iterator iterator = iterable.iterator();
        if (iterator.hasNext()) {
            Object object = iterator.next();
            if (!iterator.hasNext()) {
                return (T)object;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T b(List<? extends T> list) {
        d.c(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return (T)list.get(0);
    }

    public static final <T> T c(List<? extends T> list) {
        d.c(list, "$this$single");
        int n2 = list.size();
        if (n2 != 0) {
            if (n2 == 1) {
                return (T)list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }
}

