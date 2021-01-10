/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package e.d;

import e.d.c;

public class h<E>
implements Cloneable {
    private static final Object f = new Object();
    private boolean b = false;
    private int[] c;
    private Object[] d;
    private int e;

    public h() {
        this(10);
    }

    public h(int n2) {
        if (n2 == 0) {
            this.c = c.a;
            this.d = c.c;
            return;
        }
        int n3 = c.b(n2);
        this.c = new int[n3];
        this.d = new Object[n3];
    }

    private void c() {
        int n2 = this.e;
        int[] arrn = this.c;
        Object[] arrobject = this.d;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = arrobject[i2];
            if (object == f) continue;
            if (i2 != n3) {
                arrn[n3] = arrn[i2];
                arrobject[n3] = object;
                arrobject[i2] = null;
            }
            ++n3;
        }
        this.b = false;
        this.e = n3;
    }

    public E a(int n2) {
        return this.b(n2, null);
    }

    public void a() {
        int n2 = this.e;
        Object[] arrobject = this.d;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrobject[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public void a(int n2, E e2) {
        int n3;
        int n4 = this.e;
        if (n4 != 0 && n2 <= this.c[n4 - 1]) {
            this.c(n2, e2);
            return;
        }
        if (this.b && this.e >= this.c.length) {
            h.super.c();
        }
        if ((n3 = this.e) >= this.c.length) {
            int n5 = c.b(n3 + 1);
            int[] arrn = new int[n5];
            Object[] arrobject = new Object[n5];
            int[] arrn2 = this.c;
            System.arraycopy((Object)arrn2, (int)0, (Object)arrn, (int)0, (int)arrn2.length);
            Object[] arrobject2 = this.d;
            System.arraycopy((Object)arrobject2, (int)0, (Object)arrobject, (int)0, (int)arrobject2.length);
            this.c = arrn;
            this.d = arrobject;
        }
        this.c[n3] = n2;
        this.d[n3] = e2;
        this.e = n3 + 1;
    }

    public int b() {
        if (this.b) {
            this.c();
        }
        return this.e;
    }

    public int b(int n2) {
        if (this.b) {
            h.super.c();
        }
        return c.a(this.c, this.e, n2);
    }

    public E b(int n2, E e2) {
        int n3 = c.a(this.c, this.e, n2);
        if (n3 >= 0) {
            Object[] arrobject = this.d;
            if (arrobject[n3] == f) {
                return e2;
            }
            return (E)arrobject[n3];
        }
        return e2;
    }

    public int c(int n2) {
        if (this.b) {
            h.super.c();
        }
        return this.c[n2];
    }

    public void c(int n2, E e2) {
        int n3;
        int n4;
        Object[] arrobject;
        int n5 = c.a(this.c, this.e, n2);
        if (n5 >= 0) {
            this.d[n5] = e2;
            return;
        }
        int n6 = ~n5;
        if (n6 < this.e && (arrobject = this.d)[n6] == f) {
            this.c[n6] = n2;
            arrobject[n6] = e2;
            return;
        }
        if (this.b && this.e >= this.c.length) {
            h.super.c();
            n6 = -1 ^ c.a(this.c, this.e, n2);
        }
        if ((n4 = this.e) >= this.c.length) {
            int n7 = c.b(n4 + 1);
            int[] arrn = new int[n7];
            Object[] arrobject2 = new Object[n7];
            int[] arrn2 = this.c;
            System.arraycopy((Object)arrn2, (int)0, (Object)arrn, (int)0, (int)arrn2.length);
            Object[] arrobject3 = this.d;
            System.arraycopy((Object)arrobject3, (int)0, (Object)arrobject2, (int)0, (int)arrobject3.length);
            this.c = arrn;
            this.d = arrobject2;
        }
        if ((n3 = this.e) - n6 != 0) {
            int[] arrn = this.c;
            int n8 = n6 + 1;
            System.arraycopy((Object)arrn, (int)n6, (Object)arrn, (int)n8, (int)(n3 - n6));
            Object[] arrobject4 = this.d;
            System.arraycopy((Object)arrobject4, (int)n6, (Object)arrobject4, (int)n8, (int)(this.e - n6));
        }
        this.c[n6] = n2;
        this.d[n6] = e2;
        this.e = 1 + this.e;
    }

    public h<E> clone() {
        try {
            h h2 = (h)super.clone();
            h2.c = (int[])this.c.clone();
            h2.d = (Object[])this.d.clone();
            return h2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError((Object)cloneNotSupportedException);
        }
    }

    public void d(int n2) {
        Object object;
        Object[] arrobject;
        Object object2;
        int n3 = c.a(this.c, this.e, n2);
        if (n3 >= 0 && (object = (arrobject = this.d)[n3]) != (object2 = f)) {
            arrobject[n3] = object2;
            this.b = true;
        }
    }

    public E e(int n2) {
        if (this.b) {
            h.super.c();
        }
        return (E)this.d[n2];
    }

    public String toString() {
        if (this.b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(28 * this.e);
        stringBuilder.append('{');
        for (int i2 = 0; i2 < this.e; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.c(i2));
            stringBuilder.append('=');
            E e2 = this.e(i2);
            if (e2 != this) {
                stringBuilder.append(e2);
                continue;
            }
            stringBuilder.append("(this Map)");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

