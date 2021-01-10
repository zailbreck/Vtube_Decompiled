/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.a.a.a.a.j;

public final class h
extends Enum<h> {
    public static final /* enum */ h b = new h();
    public static final /* enum */ h c = new h();
    public static final /* enum */ h d = new h();
    private static final /* synthetic */ h[] e;

    static {
        h[] arrh = new h[]{b, c, d};
        e = arrh;
    }

    public static h valueOf(String string) {
        return (h)Enum.valueOf(h.class, (String)string);
    }

    public static h[] values() {
        return (h[])e.clone();
    }
}

