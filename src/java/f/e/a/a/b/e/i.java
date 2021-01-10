/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.b.e;

public final class i
extends Enum<i> {
    public static final /* enum */ i c = new i("native");
    public static final /* enum */ i d = new i("javascript");
    public static final /* enum */ i e = new i("none");
    private static final /* synthetic */ i[] f;
    private final String b;

    static {
        i[] arri = new i[]{c, d, e};
        f = arri;
    }

    private i(String string2) {
        this.b = string2;
    }

    public static i valueOf(String string) {
        return (i)Enum.valueOf(i.class, (String)string);
    }

    public static i[] values() {
        return (i[])f.clone();
    }

    public String toString() {
        return this.b;
    }
}

