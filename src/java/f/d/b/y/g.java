/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigDecimal
 */
package f.d.b.y;

import java.math.BigDecimal;

public final class g
extends Number {
    private final String b;

    public g(String string) {
        this.b = string;
    }

    public double doubleValue() {
        return Double.parseDouble((String)this.b);
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return bl;
        }
        if (object instanceof g) {
            g g2 = (g)((Object)object);
            String string = this.b;
            String string2 = g2.b;
            if (string != string2) {
                if (string.equals((Object)string2)) {
                    return bl;
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public float floatValue() {
        return Float.parseFloat((String)this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public int intValue() {
        try {
            int n2 = Integer.parseInt((String)this.b);
            return n2;
        }
        catch (NumberFormatException numberFormatException) {
            long l2;
            try {
                l2 = Long.parseLong((String)this.b);
            }
            catch (NumberFormatException numberFormatException2) {
                return new BigDecimal(this.b).intValue();
            }
            return (int)l2;
        }
    }

    public long longValue() {
        try {
            long l2 = Long.parseLong((String)this.b);
            return l2;
        }
        catch (NumberFormatException numberFormatException) {
            return new BigDecimal(this.b).longValue();
        }
    }

    public String toString() {
        return this.b;
    }
}

