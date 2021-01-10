/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.b.e;

public final class e
extends Enum<e> {
    public static final /* enum */ e c = new e("html");
    public static final /* enum */ e d = new e("native");
    public static final /* enum */ e e = new e("javascript");
    private static final /* synthetic */ e[] f;
    private final String b;

    static {
        e[] arre = new e[]{c, d, e};
        f = arre;
    }

    private e(String string2) {
        this.b = string2;
    }

    public static e valueOf(String string) {
        return (e)Enum.valueOf(e.class, (String)string);
    }

    public static e[] values() {
        return (e[])f.clone();
    }

    public String toString() {
        return this.b;
    }
}

