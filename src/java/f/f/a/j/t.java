/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.j;

public final class t {
    public final String a;
    public final long b;
    public final String c;

    public t(String string, long l2, String string2) {
        this.a = string;
        this.b = l2;
        this.c = string2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SourceInfo{url='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", length=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mime='");
        stringBuilder.append(this.c);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

