/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.b.a.b.b
 *  e.b.a.b.b$c
 *  java.lang.Object
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 */
package e.b.a.b;

import e.b.a.b.b;
import java.util.HashMap;
import java.util.Map;

public class a<K, V>
extends b<K, V> {
    private HashMap<K, b.c<K, V>> f = new HashMap();

    protected b.c<K, V> a(K k2) {
        return (b.c)this.f.get(k2);
    }

    public V b(K k2, V v2) {
        b.c<K, V> c2 = this.a(k2);
        if (c2 != null) {
            return (V)c2.c;
        }
        this.f.put(k2, (Object)this.a(k2, v2));
        return null;
    }

    public Map.Entry<K, V> b(K k2) {
        if (this.contains(k2)) {
            return ((b.c)this.f.get(k2)).e;
        }
        return null;
    }

    public boolean contains(K k2) {
        return this.f.containsKey(k2);
    }

    public V remove(K k2) {
        Object object = super.remove(k2);
        this.f.remove(k2);
        return (V)object;
    }
}

