/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.WeakHashMap
 */
package e.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/*
 * Exception performing whole class analysis.
 */
public class b<K, V>
implements Iterable<Map.Entry<K, V>> {
    c<K, V> b;
    private c<K, V> c;
    private WeakHashMap<f<K, V>, Boolean> d;
    private int e;

    public b() {
        this.d = new WeakHashMap();
        this.e = 0;
    }

    protected c<K, V> a(K k2) {
        c<K, V> c2 = this.b;
        while (c2 != null) {
            if (c2.b.equals(k2)) {
                return c2;
            }
            c2 = c2.d;
        }
        return c2;
    }

    protected c<K, V> a(K k2, V v2) {
        c<K, V> c2 = new c<K, V>(k2, v2);
        this.e = 1 + this.e;
        c<K, V> c3 = this.c;
        if (c3 == null) {
            this.b = c2;
            this.c = this.b;
            return c2;
        }
        c3.d = c2;
        c2.e = c3;
        this.c = c2;
        return c2;
    }

    public Iterator<Map.Entry<K, V>> a() {
        e e2 = }
    java.lang.IllegalStateException: Inner class got unexpected class file - revert this change
    
    