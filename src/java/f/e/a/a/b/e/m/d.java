/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.b.e.m;

public final class d
extends Enum<d> {
    public static final /* enum */ d c = new d("preroll");
    public static final /* enum */ d d = new d("midroll");
    public static final /* enum */ d e = new d("postroll");
    public static final /* enum */ d f = new d("standalone");
    private static final /* synthetic */ d[] g;
    private final String b;

    static {
        d[] arrd = new d[]{c, d, e, f};
        g = arrd;
    }

    private d(String string2) {
        this.b = string2;
    }

    public static d valueOf(String string) {
        return (d)Enum.valueOf(d.class, (String)string);
    }

    public static d[] values() {
        return (d[])g.clone();
    }

    public String toString() {
        return this.b;
    }
}

