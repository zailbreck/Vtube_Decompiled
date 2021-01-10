/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.k.g;

public final class g
extends Enum<g> {
    public static final /* enum */ g d = new g("js", "application/x-javascript");
    public static final /* enum */ g e = new g("css", "text/css");
    public static final /* enum */ g f = new g("jpg", "image/jpeg");
    public static final /* enum */ g g = new g("jpep", "image/jpeg");
    public static final /* enum */ g h = new g("png", "image/png");
    public static final /* enum */ g i = new g("webp", "image/webp");
    public static final /* enum */ g j = new g("gif", "image/gif");
    public static final /* enum */ g k = new g("htm", "text/html");
    public static final /* enum */ g l = new g("html", "text/html");
    private static final /* synthetic */ g[] m;
    private String b;
    private String c;

    static {
        g[] arrg = new g[]{d, e, f, g, h, i, j, k, l};
        m = arrg;
    }

    private g(String string3, String string4) {
        this.b = string3;
        this.c = string4;
    }

    public static g valueOf(String string2) {
        return (g)Enum.valueOf(g.class, (String)string2);
    }

    public static g[] values() {
        return (g[])m.clone();
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }
}

