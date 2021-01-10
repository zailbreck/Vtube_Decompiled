/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package h.b.r.h;

import h.b.r.h.c;

public final class b<T> {
    final float a;
    int b;
    int c;
    int d;
    T[] e;

    public b() {
        this(16, 0.75f);
    }

    public b(int n2, float f2) {
        this.a = f2;
        int n3 = c.a(n2);
        this.b = n3 - 1;
        this.d = (int)(f2 * (float)n3);
        this.e = new Object[n3];
    }

    static int a(int n2) {
        int n3 = n2 * -1640531527;
        return n3 ^ n3 >>> 16;
    }

    boolean a(int n2, T[] arrT, int n3) {
        --this.c;
        block0 : do {
            int n4 = n2 + 1;
            do {
                T t2;
                int n5;
                if ((t2 = arrT[n5 = n4 & n3]) == null) {
                    arrT[n2] = null;
                    return true;
                }
                int n6 = n3 & b.a(t2.hashCode());
                if (n2 <= n5 ? n2 >= n6 || n6 > n5 : n2 >= n6 && n6 > n5) {
                    arrT[n2] = t2;
                    n2 = n5;
                    continue block0;
                }
                n4 = n5 + 1;
            } while (true);
            break;
        } while (true);
    }

    public boolean a(T t2) {
        int n2;
        T[] arrT = this.e;
        int n3 = this.b;
        int n4 = n3 & b.a(t2.hashCode());
        T t3 = arrT[n4];
        if (t3 != null) {
            T t4;
            if (t3.equals(t2)) {
                return false;
            }
            while ((t4 = arrT[n4 = n3 & n4 + 1]) != null) {
                if (!t4.equals(t2)) continue;
                return false;
            }
        }
        arrT[n4] = t2;
        this.c = n2 = 1 + this.c;
        if (n2 >= this.d) {
            this.b();
        }
        return true;
    }

    public Object[] a() {
        return this.e;
    }

    void b() {
        T[] arrT = this.e;
        int n2 = arrT.length;
        int n3 = n2 << 1;
        int n4 = n3 - 1;
        Object[] arrobject = new Object[n3];
        int n5 = this.c;
        do {
            int n6 = n5 - 1;
            if (n5 == 0) break;
            while (arrT[--n2] == null) {
            }
            int n7 = n4 & b.a(arrT[n2].hashCode());
            if (arrobject[n7] != null) {
                while (arrobject[n7 = n4 & n7 + 1] != null) {
                }
            }
            arrobject[n7] = arrT[n2];
            n5 = n6;
        } while (true);
        this.b = n4;
        this.d = (int)((float)n3 * this.a);
        this.e = arrobject;
    }

    public boolean b(T t2) {
        T t3;
        T[] arrT = this.e;
        int n2 = this.b;
        int n3 = n2 & b.a(t2.hashCode());
        T t4 = arrT[n3];
        if (t4 == null) {
            return false;
        }
        if (t4.equals(t2)) {
            return this.a(n3, arrT, n2);
        }
        do {
            if ((t3 = arrT[n3 = n2 & n3 + 1]) != null) continue;
            return false;
        } while (!t3.equals(t2));
        return this.a(n3, arrT, n2);
    }
}

