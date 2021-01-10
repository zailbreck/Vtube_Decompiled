/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.b.e;

public final class g
extends Enum<g> {
    public static final /* enum */ g b = new g();
    public static final /* enum */ g c = new g();
    public static final /* enum */ g d = new g();
    public static final /* enum */ g e = new g();
    private static final /* synthetic */ g[] f;

    static {
        g[] arrg = new g[]{b, c, d, e};
        f = arrg;
    }

    public static g valueOf(String string) {
        return (g)Enum.valueOf(g.class, (String)string);
    }

    public static g[] values() {
        return (g[])f.clone();
    }
}

