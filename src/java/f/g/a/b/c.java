/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.g.a.b;

public final class c
extends Enum<c> {
    public static final /* enum */ c c = new c("block");
    public static final /* enum */ c d = new c("css-display-none");
    public static final /* enum */ c e = new c("make-https");
    private static final /* synthetic */ c[] f;
    private final String b;

    static {
        c[] arrc = new c[]{c, d, e};
        f = arrc;
    }

    private c(String string3) {
        this.b = string3;
    }

    public static c a(String string2) {
        IllegalArgumentException illegalArgumentException;
        for (c c2 : c.values()) {
            if (!string2.equals((Object)c2.b)) continue;
            return c2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No enum constant: ");
        stringBuilder.append(string2);
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    public static c valueOf(String string2) {
        return (c)Enum.valueOf(c.class, (String)string2);
    }

    public static c[] values() {
        return (c[])f.clone();
    }

    public String toString() {
        return this.b;
    }
}

