/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.b.e;

public final class h
extends Enum<h> {
    public static final /* enum */ h c = new h("definedByJavaScript");
    public static final /* enum */ h d = new h("unspecified");
    public static final /* enum */ h e = new h("loaded");
    public static final /* enum */ h f = new h("beginToRender");
    public static final /* enum */ h g = new h("onePixel");
    public static final /* enum */ h h = new h("viewable");
    public static final /* enum */ h i = new h("audible");
    public static final /* enum */ h j = new h("other");
    private static final /* synthetic */ h[] k;
    private final String b;

    static {
        h[] arrh = new h[]{c, d, e, f, g, h, i, j};
        k = arrh;
    }

    private h(String string2) {
        this.b = string2;
    }

    public static h valueOf(String string) {
        return (h)Enum.valueOf(h.class, (String)string);
    }

    public static h[] values() {
        return (h[])k.clone();
    }

    public String toString() {
        return this.b;
    }
}

