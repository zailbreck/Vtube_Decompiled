/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.b.e.m;

public final class c
extends Enum<c> {
    public static final /* enum */ c c = new c("minimized");
    public static final /* enum */ c d = new c("collapsed");
    public static final /* enum */ c e = new c("normal");
    public static final /* enum */ c f = new c("expanded");
    public static final /* enum */ c g = new c("fullscreen");
    private static final /* synthetic */ c[] h;
    private final String b;

    static {
        c[] arrc = new c[]{c, d, e, f, g};
        h = arrc;
    }

    private c(String string2) {
        this.b = string2;
    }

    public static c valueOf(String string) {
        return (c)Enum.valueOf(c.class, (String)string);
    }

    public static c[] values() {
        return (c[])h.clone();
    }

    public String toString() {
        return this.b;
    }
}

