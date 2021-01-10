/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Array
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NoSuchElementException
 *  java.util.Set
 */
package e.d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class f<K, V> {
    f<K, V> a;
    f<K, V> b;
    f<K, V> c;

    f() {
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (map.containsKey(iterator.next())) continue;
            return false;
        }
        return true;
    }

    /*
     * Exception decompiling
     */
    public static <T> boolean a(Set<T> var0, Object var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl27.1 : ICONST_0 : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    public static <K, V> boolean b(Map<K, V> map, Collection<?> collection) {
        int n2 = map.size();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            map.remove(iterator.next());
        }
        return n2 != map.size();
    }

    public static <K, V> boolean c(Map<K, V> map, Collection<?> collection) {
        int n2 = map.size();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            if (collection.contains(iterator.next())) continue;
            iterator.remove();
        }
        return n2 != map.size();
    }

    protected abstract int a(Object var1);

    protected abstract Object a(int var1, int var2);

    protected abstract V a(int var1, V var2);

    protected abstract void a();

    protected abstract void a(int var1);

    protected abstract void a(K var1, V var2);

    public <T> T[] a(T[] arrobject, int n2) {
        int n3 = this.c();
        if (arrobject.length < n3) {
            arrobject = (Object[])Array.newInstance((Class)arrobject.getClass().getComponentType(), (int)n3);
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            arrobject[i2] = this.a(i2, n2);
        }
        if (arrobject.length > n3) {
            arrobject[n3] = null;
        }
        return arrobject;
    }

    protected abstract int b(Object var1);

    protected abstract Map<K, V> b();

    public Object[] b(int n2) {
        int n3 = this.c();
        Object[] arrobject = new Object[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            arrobject[i2] = this.a(i2, n2);
        }
        return arrobject;
    }

    protected abstract int c();

    public Set<Map.Entry<K, V>> d() {
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    public Set<K> e() {
        if (this.b == null) {
            this.b = new c();
        }
        return this.b;
    }

    public Collection<V> f() {
        if (this.c == null) {
            this.c = new e();
        }
        return this.c;
    }

    final class a<T>
    implements Iterator<T> {
        final int b;
        int c;
        int d;
        boolean e = false;

        a(int n2) {
            this.b = n2;
            this.c = f.this.c();
        }

        public boolean hasNext() {
            return this.d < this.c;
        }

        public T next() {
            if (this.hasNext()) {
                Object object = f.this.a(this.d, this.b);
                this.d = 1 + this.d;
                this.e = true;
                return (T)object;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.e) {
                this.d = -1 + this.d;
                this.c = -1 + this.c;
                this.e = false;
                f.this.a(this.d);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class b
    implements Set<Map.Entry<K, V>> {
        b() {
        }

        public boolean a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int n2 = f.this.c();
            for (Map.Entry entry : collection) {
                f.this.a(entry.getKey(), entry.getValue());
            }
            return n2 != f.this.c();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry)object;
            int n2 = f.this.a(entry.getKey());
            if (n2 < 0) {
                return false;
            }
            return e.d.c.a(f.this.a(n2, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (this.contains(iterator.next())) continue;
                return false;
            }
            return true;
        }

        public boolean equals(Object object) {
            return f.a(this, object);
        }

        public int hashCode() {
            int n2 = 0;
            for (int i2 = f.this.c() - 1; i2 >= 0; --i2) {
                Object object = f.this.a(i2, 0);
                Object object2 = f.this.a(i2, 1);
                int n3 = object == null ? 0 : object.hashCode();
                int n4 = object2 == null ? 0 : object2.hashCode();
                n2 += n3 ^ n4;
            }
            return n2;
        }

        public boolean isEmpty() {
            return f.this.c() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object object) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return f.this.c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] arrT) {
            throw new UnsupportedOperationException();
        }
    }

    final class c
    implements Set<K> {
        c() {
        }

        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object object) {
            return f.this.a(object) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return f.a(f.this.b(), collection);
        }

        public boolean equals(Object object) {
            return f.a(this, object);
        }

        public int hashCode() {
            int n2 = 0;
            for (int i2 = -1 + f.this.c(); i2 >= 0; --i2) {
                Object object = f.this.a(i2, 0);
                int n3 = object == null ? 0 : object.hashCode();
                n2 += n3;
            }
            return n2;
        }

        public boolean isEmpty() {
            return f.this.c() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object object) {
            int n2 = f.this.a(object);
            if (n2 >= 0) {
                f.this.a(n2);
                return true;
            }
            return false;
        }

        public boolean removeAll(Collection<?> collection) {
            return f.b(f.this.b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return f.c(f.this.b(), collection);
        }

        public int size() {
            return f.this.c();
        }

        public Object[] toArray() {
            return f.this.b(0);
        }

        public <T> T[] toArray(T[] arrT) {
            return f.this.a(arrT, 0);
        }
    }

    final class d
    implements Iterator<Map.Entry<K, V>>,
    Map.Entry<K, V> {
        int b;
        int c;
        boolean d = false;

        d() {
            this.b = -1 + f.this.c();
            this.c = -1;
        }

        public boolean equals(Object object) {
            if (this.d) {
                if (!(object instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry)object;
                boolean bl = e.d.c.a(entry.getKey(), f.this.a(this.c, 0));
                boolean bl2 = false;
                if (bl) {
                    boolean bl3 = e.d.c.a(entry.getValue(), f.this.a(this.c, 1));
                    bl2 = false;
                    if (bl3) {
                        bl2 = true;
                    }
                }
                return bl2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public K getKey() {
            if (this.d) {
                return (K)f.this.a(this.c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.d) {
                return (V)f.this.a(this.c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.c < this.b;
        }

        public int hashCode() {
            if (this.d) {
                Object object = f.this.a(this.c, 0);
                Object object2 = f.this.a(this.c, 1);
                int n2 = object == null ? 0 : object.hashCode();
                int n3 = object2 == null ? 0 : object2.hashCode();
                return n2 ^ n3;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Map.Entry<K, V> next() {
            if (this.hasNext()) {
                this.c = 1 + this.c;
                this.d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.d) {
                f.this.a(this.c);
                this.c = -1 + this.c;
                this.b = -1 + this.b;
                this.d = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v2) {
            if (this.d) {
                return f.this.a(this.c, v2);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getKey());
            stringBuilder.append("=");
            stringBuilder.append(this.getValue());
            return stringBuilder.toString();
        }
    }

    final class e
    implements Collection<V> {
        e() {
        }

        public boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object object) {
            return f.this.b(object) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (this.contains(iterator.next())) continue;
                return false;
            }
            return true;
        }

        public boolean isEmpty() {
            return f.this.c() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object object) {
            int n2 = f.this.b(object);
            if (n2 >= 0) {
                f.this.a(n2);
                return true;
            }
            return false;
        }

        public boolean removeAll(Collection<?> collection) {
            int n2 = f.this.c();
            boolean bl = false;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!collection.contains(f.this.a(i2, 1))) continue;
                f.this.a(i2);
                --i2;
                --n2;
                bl = true;
            }
            return bl;
        }

        public boolean retainAll(Collection<?> collection) {
            int n2 = f.this.c();
            boolean bl = false;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (collection.contains(f.this.a(i2, 1))) continue;
                f.this.a(i2);
                --i2;
                --n2;
                bl = true;
            }
            return bl;
        }

        public int size() {
            return f.this.c();
        }

        public Object[] toArray() {
            return f.this.b(1);
        }

        public <T> T[] toArray(T[] arrT) {
            return f.this.a(arrT, 1);
        }
    }

}

