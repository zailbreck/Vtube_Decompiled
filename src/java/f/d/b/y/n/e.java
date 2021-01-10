/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.a0.a
 *  f.d.b.a0.b
 *  f.d.b.l
 *  f.d.b.y.n.e$a
 *  java.io.Reader
 *  java.lang.AssertionError
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package f.d.b.y.n;

import f.d.b.a0.b;
import f.d.b.i;
import f.d.b.l;
import f.d.b.n;
import f.d.b.o;
import f.d.b.q;
import f.d.b.y.n.e;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class e
extends f.d.b.a0.a {
    private static final Reader v = new a();
    private static final Object w = new Object();
    private Object[] r = new Object[32];
    private int s = 0;
    private String[] t = new String[32];
    private int[] u = new int[32];

    public e(l l2) {
        super(v);
        e.super.a((Object)l2);
    }

    private Object D() {
        return this.r[-1 + this.s];
    }

    private Object E() {
        int n2;
        Object[] arrobject = this.r;
        this.s = n2 = -1 + this.s;
        Object object = arrobject[n2];
        arrobject[this.s] = null;
        return object;
    }

    private void a(b b2) {
        if (this.A() == b2) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append((Object)b2);
        stringBuilder.append(" but was ");
        stringBuilder.append((Object)this.A());
        stringBuilder.append(e.super.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    private void a(Object object) {
        int n2 = this.s;
        Object[] arrobject = this.r;
        if (n2 == arrobject.length) {
            int n3 = n2 * 2;
            this.r = Arrays.copyOf((Object[])arrobject, (int)n3);
            this.u = Arrays.copyOf((int[])this.u, (int)n3);
            this.t = (String[])Arrays.copyOf((Object[])this.t, (int)n3);
        }
        Object[] arrobject2 = this.r;
        int n4 = this.s;
        this.s = n4 + 1;
        arrobject2[n4] = object;
    }

    private String s() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at path ");
        stringBuilder.append(this.p());
        return stringBuilder.toString();
    }

    public b A() {
        if (this.s == 0) {
            return b.k;
        }
        Object object = this.D();
        if (object instanceof Iterator) {
            boolean bl = this.r[-2 + this.s] instanceof o;
            Iterator iterator = (Iterator)object;
            if (iterator.hasNext()) {
                if (bl) {
                    return b.f;
                }
                this.a(iterator.next());
                return this.A();
            }
            if (bl) {
                return b.e;
            }
            return b.c;
        }
        if (object instanceof o) {
            return b.d;
        }
        if (object instanceof i) {
            return b.b;
        }
        if (object instanceof q) {
            q q2 = (q)((Object)object);
            if (q2.p()) {
                return b.g;
            }
            if (q2.n()) {
                return b.i;
            }
            if (q2.o()) {
                return b.h;
            }
            throw new AssertionError();
        }
        if (object instanceof n) {
            return b.j;
        }
        if (object == w) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new AssertionError();
    }

    public void B() {
        if (this.A() == b.f) {
            this.x();
            this.t[-2 + this.s] = "null";
        } else {
            this.E();
            int n2 = this.s;
            if (n2 > 0) {
                this.t[n2 - 1] = "null";
            }
        }
        int n3 = this.s;
        if (n3 > 0) {
            int[] arrn = this.u;
            int n4 = n3 - 1;
            arrn[n4] = 1 + arrn[n4];
        }
    }

    public void C() {
        this.a(b.f);
        Map.Entry entry = (Map.Entry)((Iterator)this.D()).next();
        this.a(entry.getValue());
        this.a((Object)new q((String)entry.getKey()));
    }

    public void a() {
        this.a(b.b);
        this.a(((i)((Object)this.D())).iterator());
        this.u[-1 + this.s] = 0;
    }

    public void b() {
        this.a(b.d);
        this.a((Object)((o)((Object)this.D())).h().iterator());
    }

    public void close() {
        Object[] arrobject = new Object[]{w};
        this.r = arrobject;
        this.s = 1;
    }

    public void n() {
        this.a(b.c);
        this.E();
        this.E();
        int n2 = this.s;
        if (n2 > 0) {
            int[] arrn = this.u;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
    }

    public void o() {
        this.a(b.e);
        this.E();
        this.E();
        int n2 = this.s;
        if (n2 > 0) {
            int[] arrn = this.u;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
    }

    public String p() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        for (int i2 = 0; i2 < this.s; ++i2) {
            Object[] arrobject = this.r;
            if (arrobject[i2] instanceof i) {
                if (!(arrobject[++i2] instanceof Iterator)) continue;
                stringBuilder.append('[');
                stringBuilder.append(this.u[i2]);
                stringBuilder.append(']');
                continue;
            }
            if (!(arrobject[i2] instanceof o) || !(arrobject[++i2] instanceof Iterator)) continue;
            stringBuilder.append('.');
            String[] arrstring = this.t;
            if (arrstring[i2] == null) continue;
            stringBuilder.append(arrstring[i2]);
        }
        return stringBuilder.toString();
    }

    public boolean q() {
        b b2 = this.A();
        return b2 != b.e && b2 != b.c;
    }

    public boolean t() {
        this.a(b.i);
        boolean bl = ((q)((Object)this.E())).h();
        int n2 = this.s;
        if (n2 > 0) {
            int[] arrn = this.u;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return bl;
    }

    public String toString() {
        return e.class.getSimpleName();
    }

    public double u() {
        b b2 = this.A();
        if (b2 != b.h && b2 != b.g) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append((Object)b.h);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)b2);
            stringBuilder.append(this.s());
            throw new IllegalStateException(stringBuilder.toString());
        }
        double d2 = ((q)((Object)this.D())).i();
        if (!this.r() && (Double.isNaN((double)d2) || Double.isInfinite((double)d2))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(d2);
            throw new NumberFormatException(stringBuilder.toString());
        }
        this.E();
        int n2 = this.s;
        if (n2 > 0) {
            int[] arrn = this.u;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return d2;
    }

    public int v() {
        b b2 = this.A();
        if (b2 != b.h && b2 != b.g) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append((Object)b.h);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)b2);
            stringBuilder.append(this.s());
            throw new IllegalStateException(stringBuilder.toString());
        }
        int n2 = ((q)((Object)this.D())).j();
        this.E();
        int n3 = this.s;
        if (n3 > 0) {
            int[] arrn = this.u;
            int n4 = n3 - 1;
            arrn[n4] = 1 + arrn[n4];
        }
        return n2;
    }

    public long w() {
        b b2 = this.A();
        if (b2 != b.h && b2 != b.g) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append((Object)b.h);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)b2);
            stringBuilder.append(this.s());
            throw new IllegalStateException(stringBuilder.toString());
        }
        long l2 = ((q)((Object)this.D())).k();
        this.E();
        int n2 = this.s;
        if (n2 > 0) {
            int[] arrn = this.u;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return l2;
    }

    public String x() {
        String string;
        this.a(b.f);
        Map.Entry entry = (Map.Entry)((Iterator)this.D()).next();
        this.t[-1 + this.s] = string = (String)entry.getKey();
        this.a(entry.getValue());
        return string;
    }

    public void y() {
        this.a(b.j);
        this.E();
        int n2 = this.s;
        if (n2 > 0) {
            int[] arrn = this.u;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
    }

    public String z() {
        b b2 = this.A();
        if (b2 != b.g && b2 != b.h) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append((Object)b.g);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)b2);
            stringBuilder.append(this.s());
            throw new IllegalStateException(stringBuilder.toString());
        }
        String string = ((q)((Object)this.E())).m();
        int n2 = this.s;
        if (n2 > 0) {
            int[] arrn = this.u;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return string;
    }
}

