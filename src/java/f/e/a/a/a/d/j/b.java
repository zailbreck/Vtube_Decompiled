/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.a.d.j;

public final class b
extends Enum<b> {
    public static final /* enum */ b c = new b("preroll");
    public static final /* enum */ b d = new b("midroll");
    public static final /* enum */ b e = new b("postroll");
    public static final /* enum */ b f = new b("standalone");
    private static final /* synthetic */ b[] g;
    private final String b;

    static {
        b[] arrb = new b[]{c, d, e, f};
        g = arrb;
    }

    private b(String string2) {
        this.b = string2;
    }

    public static b valueOf(String string) {
        return (b)Enum.valueOf(b.class, (String)string);
    }

    public static b[] values() {
        return (b[])g.clone();
    }

    public String toString() {
        return this.b;
    }
}

