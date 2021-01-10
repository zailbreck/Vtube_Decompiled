/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e.j.a;

public final class d {
    private final long a;
    private final long b;
    private final float c;

    static {
        new d(-1L, -1L, 0.0f);
    }

    d() {
        this.a = 0L;
        this.b = 0L;
        this.c = 1.0f;
    }

    public d(long l2, long l3, float f2) {
        this.a = l2;
        this.b = l3;
        this.c = f2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (d.class != object.getClass()) {
                return false;
            }
            d d2 = (d)object;
            return this.a == d2.a && this.b == d2.b && this.c == d2.c;
        }
        return false;
    }

    public int hashCode() {
        return (int)((float)(31 * (int)((long)(31 * Long.valueOf((long)this.a).hashCode()) + this.b)) + this.c);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.class.getName());
        stringBuilder.append("{AnchorMediaTimeUs=");
        stringBuilder.append(this.a);
        stringBuilder.append(" AnchorSystemNanoTime=");
        stringBuilder.append(this.b);
        stringBuilder.append(" ClockRate=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

