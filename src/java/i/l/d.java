/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package i.l;

import i.l.b;

public final class d
extends b
implements i.l.a<Integer> {
    private static final d f;
    public static final a g;

    static {
        g = new Object(null){

            public final d a() {
                return f;
            }
        };
        f = new d(1, 0);
    }

    public d(int n2, int n3) {
        super(n2, n3, 1);
    }

    public Integer d() {
        return this.b();
    }

    public Integer e() {
        return this.a();
    }

    @Override
    public boolean equals(Object object) {
        int n2;
        d d2;
        return object instanceof d && (this.isEmpty() && ((d)object).isEmpty() || (n2 = this.a()) == (d2 = (d)object).a() && this.b() == d2.b());
    }

    @Override
    public int hashCode() {
        if (this.isEmpty()) {
            return -1;
        }
        return 31 * this.a() + this.b();
    }

    @Override
    public boolean isEmpty() {
        return this.a() > this.b();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a());
        stringBuilder.append("..");
        stringBuilder.append(this.b());
        return stringBuilder.toString();
    }

}

