/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package e.d;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class e<K, V> {
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public e(int n2) {
        if (n2 > 0) {
            this.c = n2;
            this.a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int b(K k2, V v2) {
        int n2 = this.a(k2, v2);
        if (n2 >= 0) {
            return n2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Negative size: ");
        stringBuilder.append(k2);
        stringBuilder.append("=");
        stringBuilder.append(v2);
        throw new IllegalStateException(stringBuilder.toString());
    }

    protected int a(K k2, V v2) {
        return 1;
    }

    protected V a(K k2) {
        return null;
    }

    protected void a(boolean bl, K k2, V v2, V v3) {
    }

    public final int createCount() {
        e e2 = this;
        synchronized (e2) {
            int n2 = this.e;
            return n2;
        }
    }

    public final void evictAll() {
        this.trimToSize(-1);
    }

    public final int evictionCount() {
        e e2 = this;
        synchronized (e2) {
            int n2 = this.f;
            return n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final V get(K k2) {
        if (k2 == null) throw new NullPointerException("key == null");
        void var8_2 = this;
        // MONITORENTER : var8_2
        Object object = this.a.get(k2);
        if (object != null) {
            this.g = 1 + this.g;
            // MONITOREXIT : var8_2
            return (V)object;
        }
        this.h = 1 + this.h;
        // MONITOREXIT : var8_2
        V v2 = this.a(k2);
        if (v2 == null) {
            return null;
        }
        var8_2 = this;
        // MONITORENTER : var8_2
        this.e = 1 + this.e;
        Object object2 = this.a.put(k2, v2);
        if (object2 != null) {
            this.a.put(k2, object2);
        } else {
            this.b += e.super.b(k2, v2);
        }
        // MONITOREXIT : var8_2
        if (object2 != null) {
            this.a(false, k2, v2, object2);
            return (V)object2;
        }
        this.trimToSize(this.c);
        return v2;
    }

    public final int hitCount() {
        e e2 = this;
        synchronized (e2) {
            int n2 = this.g;
            return n2;
        }
    }

    public final int maxSize() {
        e e2 = this;
        synchronized (e2) {
            int n2 = this.c;
            return n2;
        }
    }

    public final int missCount() {
        e e2 = this;
        synchronized (e2) {
            int n2 = this.h;
            return n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final V put(K k2, V v2) {
        if (k2 == null) throw new NullPointerException("key == null || value == null");
        if (v2 == null) throw new NullPointerException("key == null || value == null");
        void var5_3 = this;
        // MONITORENTER : var5_3
        this.d = 1 + this.d;
        this.b += e.super.b(k2, v2);
        Object object = this.a.put(k2, v2);
        if (object != null) {
            this.b -= e.super.b(k2, object);
        }
        // MONITOREXIT : var5_3
        if (object != null) {
            this.a(false, k2, object, v2);
        }
        this.trimToSize(this.c);
        return (V)object;
    }

    public final int putCount() {
        e e2 = this;
        synchronized (e2) {
            int n2 = this.d;
            return n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final V remove(K k2) {
        if (k2 == null) throw new NullPointerException("key == null");
        void var4_2 = this;
        // MONITORENTER : var4_2
        Object object = this.a.remove(k2);
        if (object != null) {
            this.b -= e.super.b(k2, object);
        }
        // MONITOREXIT : var4_2
        if (object == null) return (V)object;
        this.a(false, k2, object, null);
        return (V)object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void resize(int n2) {
        if (n2 > 0) {
            void var3_2 = this;
            synchronized (var3_2) {
                this.c = n2;
            }
            this.trimToSize(n2);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final int size() {
        e e2 = this;
        synchronized (e2) {
            int n2 = this.b;
            return n2;
        }
    }

    public final Map<K, V> snapshot() {
        e e2 = this;
        synchronized (e2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.a);
            return linkedHashMap;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        e e2 = this;
        synchronized (e2) {
            int n2 = this.g + this.h;
            int n3 = n2 != 0 ? 100 * this.g / n2 : 0;
            Locale locale = Locale.US;
            Object[] arrobject = new Object[]{this.c, this.g, this.h, n3};
            return String.format((Locale)locale, (String)"LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", (Object[])arrobject);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void trimToSize(int var1) {
        do {
            var10_3 = this;
            // MONITORENTER : var10_3
            if (this.b < 0 || this.a.isEmpty() && this.b != 0) ** GOTO lbl19
            if (this.b <= var1 || this.a.isEmpty()) break;
            var6_5 = (Map.Entry)this.a.entrySet().iterator().next();
            var7_4 = var6_5.getKey();
            var8_2 = var6_5.getValue();
            this.a.remove(var7_4);
            this.b -= e.super.b(var7_4, var8_2);
            this.f = 1 + this.f;
            // MONITOREXIT : var10_3
            this.a(true, var7_4, var8_2, null);
        } while (true);
        // MONITOREXIT : var10_3
        return;
lbl19: // 1 sources:
        var3_6 = new StringBuilder();
        var3_6.append(this.getClass().getName());
        var3_6.append(".sizeOf() is reporting inconsistent results!");
        throw new IllegalStateException(var3_6.toString());
    }
}

