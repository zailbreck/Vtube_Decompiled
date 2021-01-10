/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.d.f
 *  e.d.g
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package e.d;

import e.d.f;
import e.d.g;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V>
extends g<K, V>
implements Map<K, V> {
    f<K, V> i;

    public a() {
    }

    public a(int n2) {
        super(n2);
    }

    private f<K, V> b() {
        if (this.i == null) {
            this.i = new f<K, V>(){

                protected int a(Object object) {
                    return a.this.a(object);
                }

                protected Object a(int n2, int n3) {
                    return a.this.c[n3 + (n2 << 1)];
                }

                protected V a(int n2, V v2) {
                    return (V)a.this.a(n2, v2);
                }

                protected void a() {
                    a.this.clear();
                }

                protected void a(int n2) {
                    a.this.c(n2);
                }

                protected void a(K k2, V v2) {
                    a.this.put(k2, v2);
                }

                protected int b(Object object) {
                    return a.this.b(object);
                }

                protected Map<K, V> b() {
                    return a.this;
                }

                protected int c() {
                    return a.this.d;
                }
            };
        }
        return this.i;
    }

    public boolean a(Collection<?> collection) {
        return f.c((Map)this, collection);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return this.b().d();
    }

    public Set<K> keySet() {
        return this.b().e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        this.a(this.d + map.size());
        for (Map.Entry entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return this.b().f();
    }

}

