/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  i.j.a
 *  i.k.b.b
 *  i.k.b.h.a
 *  i.l.b$a
 *  i.l.c
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 */
package i.l;

import i.i.t;
import i.l.b;
import i.l.c;
import java.util.Iterator;

/*
 * Exception performing whole class analysis.
 */
public class b
implements Iterable<Integer>,
i.k.b.h.a {
    public static final a e;
    private final int b;
    private final int c;
    private final int d;

    static {
        e = new /* Unavailable Anonymous Inner Class!! */;
    }

    public b(int n2, int n3, int n4) {
        if (n4 != 0) {
            if (n4 != Integer.MIN_VALUE) {
                this.b = n2;
                this.c = i.j.a.b((int)n2, (int)n3, (int)n4);
                this.d = n4;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public boolean equals(Object object) {
        block2 : {
            block3 : {
                if (!(object instanceof b)) break block2;
                if (this.isEmpty() && ((b)object).isEmpty()) break block3;
                int n2 = this.b;
                b b2 = (b)object;
                if (n2 != b2.b || this.c != b2.c || this.d != b2.d) break block2;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.isEmpty()) {
            return -1;
        }
        return 31 * (31 * this.b + this.c) + this.d;
    }

    public boolean isEmpty() {
        return this.d > 0 ? this.b > this.c : this.b < this.c;
    }

    public t iterator() {
        return new c(this.b, this.c, this.d);
    }

    public String toString() {
        StringBuilder stringBuilder;
        int n2;
        if (this.d > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.b);
            stringBuilder.append("..");
            stringBuilder.append(this.c);
            stringBuilder.append(" step ");
            n2 = this.d;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.b);
            stringBuilder.append(" downTo ");
            stringBuilder.append(this.c);
            stringBuilder.append(" step ");
            n2 = -this.d;
        }
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }
}

