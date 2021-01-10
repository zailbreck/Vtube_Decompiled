/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.a.d;

public final class f
extends Enum<f> {
    public static final /* enum */ f c = new f("native");
    public static final /* enum */ f d = new f("javascript");
    public static final /* enum */ f e = new f("none");
    private static final /* synthetic */ f[] f;
    private final String b;

    static {
        f[] arrf = new f[]{c, d, e};
        f = arrf;
    }

    private f(String string2) {
        this.b = string2;
    }

    public static f valueOf(String string) {
        return (f)Enum.valueOf(f.class, (String)string);
    }

    public static f[] values() {
        return (f[])f.clone();
    }

    public String toString() {
        return this.b;
    }
}

