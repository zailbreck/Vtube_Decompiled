/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package e.d;

import e.d.c;

public class d<E>
implements Cloneable {
    private static final Object f = new Object();
    private boolean b = false;
    private long[] c;
    private Object[] d;
    private int e;

    public d() {
        this(10);
    }

    public d(int n2) {
        if (n2 == 0) {
            this.c = c.b;
            this.d = c.c;
            return;
        }
        int n3 = c.c(n2);
        this.c = new long[n3];
        this.d = new Object[n3];
    }

    private void c() {
        int n2 = this.e;
        long[] arrl = this.c;
        Object[] arrobject = this.d;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = arrobject[i2];
            if (object == f) continue;
            if (i2 != n3) {
                arrl[n3] = arrl[i2];
                arrobject[n3] = object;
                arrobject[i2] = null;
            }
            ++n3;
        }
        this.b = false;
        this.e = n3;
    }

    public long a(int n2) {
        if (this.b) {
            d.super.c();
        }
        return this.c[n2];
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

    @Deprecated
    public void a(long l2) {
        this.c(l2);
    }

    public void a(long l2, E e2) {
        int n2;
        int n3 = this.e;
        if (n3 != 0 && l2 <= this.c[n3 - 1]) {
            this.c(l2, e2);
            return;
        }
        if (this.b && this.e >= this.c.length) {
            d.super.c();
        }
        if ((n2 = this.e) >= this.c.length) {
            int n4 = c.c(n2 + 1);
            long[] arrl = new long[n4];
            Object[] arrobject = new Object[n4];
            long[] arrl2 = this.c;
            System.arraycopy((Object)arrl2, (int)0, (Object)arrl, (int)0, (int)arrl2.length);
            Object[] arrobject2 = this.d;
            System.arraycopy((Object)arrobject2, (int)0, (Object)arrobject, (int)0, (int)arrobject2.length);
            this.c = arrl;
            this.d = arrobject;
        }
        this.c[n2] = l2;
        this.d[n2] = e2;
        this.e = n2 + 1;
    }

    public int b() {
        if (this.b) {
            this.c();
        }
        return this.e;
    }

    public E b(int n2) {
        if (this.b) {
            d.super.c();
        }
        return (E)this.d[n2];
    }

    public E b(long l2) {
        return this.b(l2, null);
    }

    public E b(long l2, E e2) {
        int n2 = c.a(this.c, this.e, l2);
        if (n2 >= 0) {
            Object[] arrobject = this.d;
            if (arrobject[n2] == f) {
                return e2;
            }
            return (E)arrobject[n2];
        }
        return e2;
    }

    public void c(long l2) {
        Object object;
        Object[] arrobject;
        Object object2;
        int n2 = c.a(this.c, this.e, l2);
        if (n2 >= 0 && (object = (arrobject = this.d)[n2]) != (object2 = f)) {
            arrobject[n2] = object2;
            this.b = true;
        }
    }

    public void c(long l2, E e2) {
        int n2;
        Object[] arrobject;
        int n3;
        int n4 = c.a(this.c, this.e, l2);
        if (n4 >= 0) {
            this.d[n4] = e2;
            return;
        }
        int n5 = ~n4;
        if (n5 < this.e && (arrobject = this.d)[n5] == f) {
            this.c[n5] = l2;
            arrobject[n5] = e2;
            return;
        }
        if (this.b && this.e >= this.c.length) {
            d.super.c();
            n5 = -1 ^ c.a(this.c, this.e, l2);
        }
        if ((n3 = this.e) >= this.c.length) {
            int n6 = c.c(n3 + 1);
            long[] arrl = new long[n6];
            Object[] arrobject2 = new Object[n6];
            long[] arrl2 = this.c;
            System.arraycopy((Object)arrl2, (int)0, (Object)arrl, (int)0, (int)arrl2.length);
            Object[] arrobject3 = this.d;
            System.arraycopy((Object)arrobject3, (int)0, (Object)arrobject2, (int)0, (int)arrobject3.length);
            this.c = arrl;
            this.d = arrobject2;
        }
        if ((n2 = this.e) - n5 != 0) {
            long[] arrl = this.c;
            int n7 = n5 + 1;
            System.arraycopy((Object)arrl, (int)n5, (Object)arrl, (int)n7, (int)(n2 - n5));
            Object[] arrobject4 = this.d;
            System.arraycopy((Object)arrobject4, (int)n5, (Object)arrobject4, (int)n7, (int)(this.e - n5));
        }
        this.c[n5] = l2;
        this.d[n5] = e2;
        this.e = 1 + this.e;
    }

    public d<E> clone() {
        try {
            d d2 = (d)super.clone();
            d2.c = (long[])this.c.clone();
            d2.d = (Object[])this.d.clone();
            return d2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError((Object)cloneNotSupportedException);
        }
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
            stringBuilder.append(this.a(i2));
            stringBuilder.append('=');
            E e2 = this.b(i2);
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

