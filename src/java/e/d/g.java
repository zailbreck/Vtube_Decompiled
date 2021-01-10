/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ConcurrentModificationException
 */
package e.d;

import e.d.c;
import java.util.ConcurrentModificationException;

public class g<K, V> {
    static Object[] e;
    static int f;
    static Object[] g;
    static int h;
    int[] b;
    Object[] c;
    int d;

    public g() {
        this.b = c.a;
        this.c = c.c;
        this.d = 0;
    }

    public g(int n2) {
        if (n2 == 0) {
            this.b = c.a;
            this.c = c.c;
        } else {
            g.super.e(n2);
        }
        this.d = 0;
    }

    private static int a(int[] arrn, int n2, int n3) {
        try {
            int n4 = c.a(arrn, n2, n3);
            return n4;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new ConcurrentModificationException();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(int[] arrn, Object[] arrobject, int n2) {
        if (arrn.length == 8) {
            Class<g> class_ = g.class;
            synchronized (g.class) {
                if (h < 10) {
                    arrobject[0] = g;
                    arrobject[1] = arrn;
                    for (int i2 = (n2 << 1) - 1; i2 >= 2; --i2) {
                        arrobject[i2] = null;
                    }
                    g = arrobject;
                    h = 1 + h;
                }
                // ** MonitorExit[var7_3] (shouldn't be in output)
                return;
            }
        }
        if (arrn.length != 4) {
            return;
        }
        Class<g> class_ = g.class;
        synchronized (g.class) {
            if (f < 10) {
                arrobject[0] = e;
                arrobject[1] = arrn;
                for (int i3 = (n2 << 1) - 1; i3 >= 2; --i3) {
                    arrobject[i3] = null;
                }
                e = arrobject;
                f = 1 + f;
            }
            // ** MonitorExit[var7_4] (shouldn't be in output)
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void e(int n2) {
        if (n2 == 8) {
            Class<g> class_ = g.class;
            // MONITORENTER : e.d.g.class
            if (g != null) {
                Object[] arrobject = g;
                this.c = arrobject;
                g = (Object[])arrobject[0];
                this.b = (int[])arrobject[1];
                arrobject[1] = null;
                arrobject[0] = null;
                --h;
                // MONITOREXIT : class_
                return;
            }
            // MONITOREXIT : class_
        } else if (n2 == 4) {
            Class<g> class_ = g.class;
            // MONITORENTER : e.d.g.class
            if (e != null) {
                Object[] arrobject = e;
                this.c = arrobject;
                e = (Object[])arrobject[0];
                this.b = (int[])arrobject[1];
                arrobject[1] = null;
                arrobject[0] = null;
                --f;
                // MONITOREXIT : class_
                return;
            }
            // MONITOREXIT : class_
        }
        this.b = new int[n2];
        this.c = new Object[n2 << 1];
    }

    int a() {
        int n2;
        int n3 = this.d;
        if (n3 == 0) {
            return -1;
        }
        int n4 = g.a(this.b, n3, 0);
        if (n4 < 0) {
            return n4;
        }
        if (this.c[n4 << 1] == null) {
            return n4;
        }
        for (n2 = n4 + 1; n2 < n3 && this.b[n2] == 0; ++n2) {
            if (this.c[n2 << 1] != null) continue;
            return n2;
        }
        for (int i2 = n4 - 1; i2 >= 0 && this.b[i2] == 0; --i2) {
            if (this.c[i2 << 1] != null) continue;
            return i2;
        }
        return ~n2;
    }

    public int a(Object object) {
        if (object == null) {
            return this.a();
        }
        return this.a(object, object.hashCode());
    }

    int a(Object object, int n2) {
        int n3;
        int n4 = this.d;
        if (n4 == 0) {
            return -1;
        }
        int n5 = g.a(this.b, n4, n2);
        if (n5 < 0) {
            return n5;
        }
        if (object.equals(this.c[n5 << 1])) {
            return n5;
        }
        for (n3 = n5 + 1; n3 < n4 && this.b[n3] == n2; ++n3) {
            if (!object.equals(this.c[n3 << 1])) continue;
            return n3;
        }
        for (int i2 = n5 - 1; i2 >= 0 && this.b[i2] == n2; --i2) {
            if (!object.equals(this.c[i2 << 1])) continue;
            return i2;
        }
        return ~n3;
    }

    public V a(int n2, V v2) {
        int n3 = 1 + (n2 << 1);
        Object[] arrobject = this.c;
        Object object = arrobject[n3];
        arrobject[n3] = v2;
        return (V)object;
    }

    public void a(int n2) {
        int n3 = this.d;
        int[] arrn = this.b;
        if (arrn.length < n2) {
            Object[] arrobject = this.c;
            g.super.e(n2);
            if (this.d > 0) {
                System.arraycopy((Object)arrn, (int)0, (Object)this.b, (int)0, (int)n3);
                System.arraycopy((Object)arrobject, (int)0, (Object)this.c, (int)0, (int)(n3 << 1));
            }
            g.a(arrn, arrobject, n3);
        }
        if (this.d == n3) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    int b(Object object) {
        int n2 = 2 * this.d;
        Object[] arrobject = this.c;
        if (object == null) {
            for (int i2 = 1; i2 < n2; i2 += 2) {
                if (arrobject[i2] != null) continue;
                return i2 >> 1;
            }
        } else {
            for (int i3 = 1; i3 < n2; i3 += 2) {
                if (!object.equals(arrobject[i3])) continue;
                return i3 >> 1;
            }
        }
        return -1;
    }

    public K b(int n2) {
        return (K)this.c[n2 << 1];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public V c(int n2) {
        int n3;
        Object[] arrobject = this.c;
        int n4 = n2 << 1;
        Object object = arrobject[n4 + 1];
        int n5 = this.d;
        if (n5 <= 1) {
            g.a(this.b, arrobject, n5);
            this.b = c.a;
            this.c = c.c;
            n3 = 0;
        } else {
            n3 = n5 - 1;
            int[] arrn = this.b;
            int n6 = arrn.length;
            int n7 = 8;
            if (n6 > n7 && n5 < arrn.length / 3) {
                if (n5 > n7) {
                    n7 = n5 + (n5 >> 1);
                }
                int[] arrn2 = this.b;
                Object[] arrobject2 = this.c;
                g.super.e(n7);
                if (n5 != this.d) throw new ConcurrentModificationException();
                if (n2 > 0) {
                    System.arraycopy((Object)arrn2, (int)0, (Object)this.b, (int)0, (int)n2);
                    System.arraycopy((Object)arrobject2, (int)0, (Object)this.c, (int)0, (int)n4);
                }
                if (n2 < n3) {
                    int n8 = n2 + 1;
                    int[] arrn3 = this.b;
                    int n9 = n3 - n2;
                    System.arraycopy((Object)arrn2, (int)n8, (Object)arrn3, (int)n2, (int)n9);
                    System.arraycopy((Object)arrobject2, (int)(n8 << 1), (Object)this.c, (int)n4, (int)(n9 << 1));
                }
            } else {
                if (n2 < n3) {
                    int[] arrn4 = this.b;
                    int n10 = n2 + 1;
                    int n11 = n3 - n2;
                    System.arraycopy((Object)arrn4, (int)n10, (Object)arrn4, (int)n2, (int)n11);
                    Object[] arrobject3 = this.c;
                    System.arraycopy((Object)arrobject3, (int)(n10 << 1), (Object)arrobject3, (int)n4, (int)(n11 << 1));
                }
                Object[] arrobject4 = this.c;
                int n12 = n3 << 1;
                arrobject4[n12] = null;
                arrobject4[n12 + 1] = null;
            }
        }
        if (n5 != this.d) throw new ConcurrentModificationException();
        this.d = n3;
        return (V)object;
    }

    public void clear() {
        int n2 = this.d;
        if (n2 > 0) {
            int[] arrn = this.b;
            Object[] arrobject = this.c;
            this.b = c.a;
            this.c = c.c;
            this.d = 0;
            g.a(arrn, arrobject, n2);
        }
        if (this.d <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object object) {
        return this.a(object) >= 0;
    }

    public boolean containsValue(Object object) {
        return this.b(object) >= 0;
    }

    public V d(int n2) {
        return (V)this.c[1 + (n2 << 1)];
    }

    /*
     * Exception decompiling
     */
    public boolean equals(Object var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl114.1 : ICONST_0 : trying to set 0 previously set to 1
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

    public V get(Object object) {
        return this.getOrDefault(object, null);
    }

    public V getOrDefault(Object object, V object2) {
        int n2 = this.a(object);
        if (n2 >= 0) {
            object2 = this.c[1 + (n2 << 1)];
        }
        return object2;
    }

    public int hashCode() {
        int[] arrn = this.b;
        Object[] arrobject = this.c;
        int n2 = this.d;
        int n3 = 0;
        int n4 = 0;
        int n5 = 1;
        while (n3 < n2) {
            Object object = arrobject[n5];
            int n6 = arrn[n3];
            int n7 = object == null ? 0 : object.hashCode();
            n4 += n7 ^ n6;
            ++n3;
            n5 += 2;
        }
        return n4;
    }

    public boolean isEmpty() {
        return this.d <= 0;
    }

    public V put(K k2, V v2) {
        int[] arrn;
        int n2;
        int n3;
        int n4;
        int n5 = this.d;
        if (k2 == null) {
            n2 = this.a();
            n3 = 0;
        } else {
            int n6 = k2.hashCode();
            int n7 = this.a(k2, n6);
            n3 = n6;
            n2 = n7;
        }
        if (n2 >= 0) {
            int n8 = 1 + (n2 << 1);
            Object[] arrobject = this.c;
            Object object = arrobject[n8];
            arrobject[n8] = v2;
            return (V)object;
        }
        int n9 = ~n2;
        if (n5 >= this.b.length) {
            int n10 = 4;
            if (n5 >= 8) {
                n10 = n5 + (n5 >> 1);
            } else if (n5 >= n10) {
                n10 = 8;
            }
            int[] arrn2 = this.b;
            Object[] arrobject = this.c;
            g.super.e(n10);
            if (n5 == this.d) {
                int[] arrn3 = this.b;
                if (arrn3.length > 0) {
                    System.arraycopy((Object)arrn2, (int)0, (Object)arrn3, (int)0, (int)arrn2.length);
                    System.arraycopy((Object)arrobject, (int)0, (Object)this.c, (int)0, (int)arrobject.length);
                }
                g.a(arrn2, arrobject, n5);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (n9 < n5) {
            int[] arrn4 = this.b;
            int n11 = n9 + 1;
            System.arraycopy((Object)arrn4, (int)n9, (Object)arrn4, (int)n11, (int)(n5 - n9));
            Object[] arrobject = this.c;
            System.arraycopy((Object)arrobject, (int)(n9 << 1), (Object)arrobject, (int)(n11 << 1), (int)(this.d - n9 << 1));
        }
        if (n5 == (n4 = this.d) && n9 < (arrn = this.b).length) {
            arrn[n9] = n3;
            Object[] arrobject = this.c;
            int n12 = n9 << 1;
            arrobject[n12] = k2;
            arrobject[n12 + 1] = v2;
            this.d = n4 + 1;
            return null;
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k2, V v2) {
        V v3 = this.get(k2);
        if (v3 == null) {
            v3 = this.put(k2, v2);
        }
        return v3;
    }

    public V remove(Object object) {
        int n2 = this.a(object);
        if (n2 >= 0) {
            return this.c(n2);
        }
        return null;
    }

    public boolean remove(Object object, Object object2) {
        V v2;
        int n2 = this.a(object);
        if (n2 >= 0 && (object2 == (v2 = this.d(n2)) || object2 != null && object2.equals(v2))) {
            this.c(n2);
            return true;
        }
        return false;
    }

    public V replace(K k2, V v2) {
        int n2 = this.a(k2);
        if (n2 >= 0) {
            return this.a(n2, v2);
        }
        return null;
    }

    public boolean replace(K k2, V v2, V v3) {
        V v4;
        int n2 = this.a(k2);
        if (n2 >= 0 && ((v4 = this.d(n2)) == v2 || v2 != null && v2.equals(v4))) {
            this.a(n2, v3);
            return true;
        }
        return false;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(28 * this.d);
        stringBuilder.append('{');
        for (int i2 = 0; i2 < this.d; ++i2) {
            K k2;
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            if ((k2 = this.b(i2)) != this) {
                stringBuilder.append(k2);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            V v2 = this.d(i2);
            if (v2 != this) {
                stringBuilder.append(v2);
                continue;
            }
            stringBuilder.append("(this Map)");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

