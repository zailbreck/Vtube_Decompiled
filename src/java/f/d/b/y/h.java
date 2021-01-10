/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.y.h.d
 *  java.io.Serializable
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.Comparable
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.AbstractMap
 *  java.util.AbstractSet
 *  java.util.Comparator
 *  java.util.ConcurrentModificationException
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NoSuchElementException
 *  java.util.Set
 */
package f.d.b.y;

import f.d.b.y.h;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class h<K, V>
extends AbstractMap<K, V>
implements Serializable {
    private static final Comparator<Comparable> i = new Comparator<Comparable>(){

        public int a(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo((Object)comparable2);
        }
    };
    Comparator<? super K> b;
    e<K, V> c;
    int d = 0;
    int e = 0;
    final e<K, V> f = new e();
    private h<K, V> g;
    private h<K, V> h;

    public h() {
        this(i);
    }

    public h(Comparator<? super K> comparator) {
        if (comparator == null) {
            comparator = i;
        }
        this.b = comparator;
    }

    private void a(e<K, V> e2) {
        e e3 = e2.c;
        e e4 = e2.d;
        e e5 = e4.c;
        e e6 = e4.d;
        e2.d = e5;
        if (e5 != null) {
            e5.b = e2;
        }
        h.super.a(e2, e4);
        e4.c = e2;
        e2.b = e4;
        int n2 = e3 != null ? e3.i : 0;
        int n3 = e5 != null ? e5.i : 0;
        int n4 = e2.i = 1 + Math.max((int)n2, (int)n3);
        int n5 = 0;
        if (e6 != null) {
            n5 = e6.i;
        }
        e4.i = 1 + Math.max((int)n4, (int)n5);
    }

    private void a(e<K, V> e2, e<K, V> e3) {
        e e4 = e2.b;
        e2.b = null;
        if (e3 != null) {
            e3.b = e4;
        }
        if (e4 != null) {
            if (e4.c == e2) {
                e4.c = e3;
                return;
            }
            e4.d = e3;
            return;
        }
        this.c = e3;
    }

    private boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    private void b(e<K, V> e2) {
        e e3 = e2.c;
        e e4 = e2.d;
        e e5 = e3.c;
        e e6 = e3.d;
        e2.c = e6;
        if (e6 != null) {
            e6.b = e2;
        }
        h.super.a(e2, e3);
        e3.d = e2;
        e2.b = e3;
        int n2 = e4 != null ? e4.i : 0;
        int n3 = e6 != null ? e6.i : 0;
        int n4 = e2.i = 1 + Math.max((int)n2, (int)n3);
        int n5 = 0;
        if (e5 != null) {
            n5 = e5.i;
        }
        e3.i = 1 + Math.max((int)n4, (int)n5);
    }

    private void b(e<K, V> e2, boolean bl) {
        while (e2 != null) {
            int n2;
            e e3;
            e e4 = e2.c;
            int n3 = e4 != null ? e4.i : 0;
            int n4 = n3 - (n2 = (e3 = e2.d) != null ? e3.i : 0);
            if (n4 == -2) {
                int n5;
                e e5 = e3.c;
                e e6 = e3.d;
                int n6 = e6 != null ? e6.i : 0;
                int n7 = 0;
                if (e5 != null) {
                    n7 = e5.i;
                }
                if ((n5 = n7 - n6) != -1 && (n5 != 0 || bl)) {
                    h.super.b(e3);
                }
                h.super.a(e2);
                if (bl) {
                    return;
                }
            } else if (n4 == 2) {
                int n8;
                e e7 = e4.c;
                e e8 = e4.d;
                int n9 = e8 != null ? e8.i : 0;
                int n10 = 0;
                if (e7 != null) {
                    n10 = e7.i;
                }
                if ((n8 = n10 - n9) != 1 && (n8 != 0 || bl)) {
                    h.super.a(e4);
                }
                h.super.b(e2);
                if (bl) {
                    return;
                }
            } else if (n4 == 0) {
                e2.i = n3 + 1;
                if (bl) {
                    return;
                }
            } else {
                e2.i = 1 + Math.max((int)n3, (int)n2);
                if (!bl) {
                    return;
                }
            }
            e2 = e2.b;
        }
    }

    /*
     * Exception decompiling
     */
    e<K, V> a(Object var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    e<K, V> a(K k2, boolean bl) {
        int n2;
        e<K, V> e2;
        Comparator<? super K> comparator = this.b;
        e<K, V> e3 = this.c;
        if (e3 != null) {
            Comparable comparable = comparator == i ? (Comparable)k2 : null;
            do {
                Object k3 = e3.g;
                n2 = comparable != null ? comparable.compareTo(k3) : comparator.compare(k2, k3);
                if (n2 == 0) {
                    return e3;
                }
                e e4 = n2 < 0 ? e3.c : e3.d;
                if (e4 != null) {
                    e3 = e4;
                    continue;
                }
                break;
            } while (true);
        } else {
            n2 = 0;
        }
        if (!bl) {
            return null;
        }
        e<K, V> e5 = this.f;
        if (e3 == null) {
            if (comparator == i && !(k2 instanceof Comparable)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(k2.getClass().getName());
                stringBuilder.append(" is not Comparable");
                throw new ClassCastException(stringBuilder.toString());
            }
            e2 = new e<K, V>(e3, k2, e5, e5.f);
            this.c = e2;
        } else {
            e2 = new e<K, V>(e3, k2, e5, e5.f);
            if (n2 < 0) {
                e3.c = e2;
            } else {
                e3.d = e2;
            }
            h.super.b(e3, true);
        }
        this.d = 1 + this.d;
        this.e = 1 + this.e;
        return e2;
    }

    e<K, V> a(Map.Entry<?, ?> entry) {
        e<K, V> e2 = this.a(entry.getKey());
        boolean bl = e2 != null && h.super.a(e2.h, entry.getValue());
        if (bl) {
            return e2;
        }
        return null;
    }

    void a(e<K, V> e2, boolean bl) {
        if (bl) {
            e e3 = e2.f;
            e3.e = e2.e;
            e2.e.f = e3;
        }
        e e4 = e2.c;
        e e5 = e2.d;
        e e6 = e2.b;
        if (e4 != null && e5 != null) {
            int n2;
            e e7 = e4.i > e5.i ? e4.b() : e5.a();
            this.a((e<K, V>)e7, false);
            e e8 = e2.c;
            if (e8 != null) {
                n2 = e8.i;
                e7.c = e8;
                e8.b = e7;
                e2.c = null;
            } else {
                n2 = 0;
            }
            e e9 = e2.d;
            int n3 = 0;
            if (e9 != null) {
                n3 = e9.i;
                e7.d = e9;
                e9.b = e7;
                e2.d = null;
            }
            e7.i = 1 + Math.max((int)n2, (int)n3);
            h.super.a(e2, e7);
            return;
        }
        if (e4 != null) {
            h.super.a(e2, e4);
            e2.c = null;
        } else if (e5 != null) {
            h.super.a(e2, e5);
            e2.d = null;
        } else {
            h.super.a(e2, null);
        }
        h.super.b(e6, false);
        this.d = -1 + this.d;
        this.e = 1 + this.e;
    }

    e<K, V> b(Object object) {
        e<K, V> e2 = this.a(object);
        if (e2 != null) {
            this.a(e2, true);
        }
        return e2;
    }

    public void clear() {
        this.c = null;
        this.d = 0;
        this.e = 1 + this.e;
        e<K, V> e2 = this.f;
        e2.f = e2;
        e2.e = e2;
    }

    public boolean containsKey(Object object) {
        return this.a(object) != null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        h<K, V> h2 = this.g;
        if (h2 != null) {
            return h2;
        }
        b b2 = new b();
        this.g = b2;
        return b2;
    }

    public V get(Object object) {
        e<K, V> e2 = this.a(object);
        if (e2 != null) {
            return e2.h;
        }
        return null;
    }

    public Set<K> keySet() {
        h<K, V> h2 = this.h;
        if (h2 != null) {
            return h2;
        }
        c c2 = new c();
        this.h = c2;
        return c2;
    }

    public V put(K k2, V v2) {
        if (k2 != null) {
            e<K, V> e2 = this.a(k2, true);
            Object v3 = e2.h;
            e2.h = v2;
            return v3;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object object) {
        e<K, V> e2 = this.b(object);
        if (e2 != null) {
            return e2.h;
        }
        return null;
    }

    public int size() {
        return this.d;
    }

    class b
    extends AbstractSet<Map.Entry<K, V>> {
        b() {
        }

        public void clear() {
            h.this.clear();
        }

        public boolean contains(Object object) {
            return object instanceof Map.Entry && h.this.a((Map.Entry)object) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new f.d.b.y.h.d<Map.Entry<K, V>>(this){

                public Map.Entry<K, V> next() {
                    return ((d)((Object)this)).a();
                }
            };
        }

        public boolean remove(Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            e e2 = h.this.a((Map.Entry)object);
            if (e2 == null) {
                return false;
            }
            h.this.a(e2, true);
            return true;
        }

        public int size() {
            return h.this.d;
        }
    }

    final class c
    extends AbstractSet<K> {
        c() {
        }

        public void clear() {
            h.this.clear();
        }

        public boolean contains(Object object) {
            return h.this.containsKey(object);
        }

        public Iterator<K> iterator() {
            return new h<K, V>(this){

                public K next() {
                    return this.a().g;
                }
            };
        }

        public boolean remove(Object object) {
            return h.this.b(object) != null;
        }

        public int size() {
            return h.this.d;
        }
    }

    private abstract class d<T>
    implements Iterator<T> {
        e<K, V> b;
        e<K, V> c;
        int d;

        d() {
            h h3 = h.this;
            this.b = h3.f.e;
            this.c = null;
            this.d = h3.e;
        }

        final e<K, V> a() {
            e<K, V> e2 = this.b;
            h h2 = h.this;
            if (e2 != h2.f) {
                if (h2.e == this.d) {
                    this.b = e2.e;
                    this.c = e2;
                    return e2;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            return this.b != h.this.f;
        }

        public final void remove() {
            e<K, V> e2 = this.c;
            if (e2 != null) {
                h.this.a(e2, true);
                this.c = null;
                this.d = h.this.e;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static final class e<K, V>
    implements Map.Entry<K, V> {
        e<K, V> b;
        e<K, V> c;
        e<K, V> d;
        e<K, V> e;
        e<K, V> f;
        final K g;
        V h;
        int i;

        e() {
            this.g = null;
            this.f = this;
            this.e = this;
        }

        e(e<K, V> e2, K k2, e<K, V> e3, e<K, V> e4) {
            this.b = e2;
            this.g = k2;
            this.i = 1;
            this.e = e3;
            this.f = e4;
            e4.e = this;
            e3.f = this;
        }

        public e<K, V> a() {
            e<K, V> e2 = this.c;
            e<K, V> e3 = this;
            while (e2 != null) {
                e<K, V> e4 = e2.c;
                e3 = e2;
                e2 = e4;
            }
            return e3;
        }

        public e<K, V> b() {
            e<K, V> e2 = this.d;
            e<K, V> e3 = this;
            while (e2 != null) {
                e<K, V> e4 = e2.d;
                e3 = e2;
                e2 = e4;
            }
            return e3;
        }

        public boolean equals(Object object) {
            boolean bl;
            block2 : {
                block6 : {
                    V v2;
                    Object object2;
                    block5 : {
                        Map.Entry entry;
                        block4 : {
                            K k2;
                            block3 : {
                                boolean bl2 = object instanceof Map.Entry;
                                bl = false;
                                if (!bl2) break block2;
                                entry = (Map.Entry)object;
                                k2 = this.g;
                                if (k2 != null) break block3;
                                Object object3 = entry.getKey();
                                bl = false;
                                if (object3 != null) break block2;
                                break block4;
                            }
                            boolean bl3 = k2.equals(entry.getKey());
                            bl = false;
                            if (!bl3) break block2;
                        }
                        v2 = this.h;
                        object2 = entry.getValue();
                        if (v2 != null) break block5;
                        bl = false;
                        if (object2 != null) break block2;
                        break block6;
                    }
                    boolean bl4 = v2.equals(object2);
                    bl = false;
                    if (!bl4) break block2;
                }
                bl = true;
            }
            return bl;
        }

        public K getKey() {
            return this.g;
        }

        public V getValue() {
            return this.h;
        }

        public int hashCode() {
            K k2 = this.g;
            int n2 = k2 == null ? 0 : k2.hashCode();
            V v2 = this.h;
            int n3 = v2 == null ? 0 : v2.hashCode();
            return n2 ^ n3;
        }

        public V setValue(V v2) {
            V v3 = this.h;
            this.h = v2;
            return v3;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.g);
            stringBuilder.append("=");
            stringBuilder.append(this.h);
            return stringBuilder.toString();
        }
    }

}

