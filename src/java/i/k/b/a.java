/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.lang.reflect.Array
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 */
package i.k.b;

import i.k.b.d;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class a {
    private static final Object[] a = new Object[0];

    /*
     * Enabled aggressive block sorting
     */
    public static final Object[] a(Collection<?> collection) {
        d.c(collection, "collection");
        int n2 = collection.size();
        if (n2 == 0) {
            return a;
        }
        Iterator iterator = collection.iterator();
        if (!iterator.hasNext()) {
            return a;
        }
        Object[] arrobject = new Object[n2];
        int n3 = 0;
        do {
            int n4 = n3 + 1;
            arrobject[n3] = iterator.next();
            if (n4 >= arrobject.length) {
                if (!iterator.hasNext()) {
                    return arrobject;
                }
                int n5 = 1 + n4 * 3 >>> 1;
                if (n5 <= n4) {
                    if (n4 >= 2147483645) throw new OutOfMemoryError();
                    n5 = 2147483645;
                }
                arrobject = Arrays.copyOf((Object[])arrobject, (int)n5);
                d.b(arrobject, "Arrays.copyOf(result, newSize)");
            } else if (!iterator.hasNext()) {
                Object[] arrobject2 = Arrays.copyOf((Object[])arrobject, (int)n4);
                d.b(arrobject2, "Arrays.copyOf(result, size)");
                return arrobject2;
            }
            n3 = n4;
        } while (true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Object[] a(Collection<?> collection, Object[] arrobject) {
        d.c(collection, "collection");
        if (arrobject != null) {
            Object[] arrobject2;
            int n2 = collection.size();
            int n3 = 0;
            if (n2 == 0) {
                if (arrobject.length <= 0) return arrobject;
                arrobject[0] = null;
                return arrobject;
            }
            Iterator iterator = collection.iterator();
            if (!iterator.hasNext()) {
                if (arrobject.length <= 0) return arrobject;
                arrobject[0] = null;
                return arrobject;
            }
            if (n2 <= arrobject.length) {
                arrobject2 = arrobject;
                n3 = 0;
            } else {
                Object object = Array.newInstance((Class)arrobject.getClass().getComponentType(), (int)n2);
                if (object == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                arrobject2 = (Object[])object;
            }
            do {
                int n4 = n3 + 1;
                arrobject2[n3] = iterator.next();
                if (n4 >= arrobject2.length) {
                    if (!iterator.hasNext()) {
                        return arrobject2;
                    }
                    int n5 = 1 + n4 * 3 >>> 1;
                    if (n5 <= n4) {
                        if (n4 >= 2147483645) throw new OutOfMemoryError();
                        n5 = 2147483645;
                    }
                    arrobject2 = Arrays.copyOf((Object[])arrobject2, (int)n5);
                    d.b(arrobject2, "Arrays.copyOf(result, newSize)");
                } else if (!iterator.hasNext()) {
                    if (arrobject2 == arrobject) {
                        arrobject[n4] = null;
                        return arrobject;
                    }
                    arrobject = Arrays.copyOf((Object[])arrobject2, (int)n4);
                    d.b(arrobject, "Arrays.copyOf(result, size)");
                    return arrobject;
                }
                n3 = n4;
            } while (true);
        }
        NullPointerException nullPointerException = new NullPointerException();
        throw nullPointerException;
    }
}

