/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.b.e;

public final class f
extends Enum<f> {
    public static final /* enum */ f c = new f("definedByJavaScript");
    public static final /* enum */ f d = new f("htmlDisplay");
    public static final /* enum */ f e = new f("nativeDisplay");
    public static final /* enum */ f f = new f("video");
    public static final /* enum */ f g = new f("audio");
    private static final /* synthetic */ f[] h;
    private final String b;

    static {
        f[] arrf = new f[]{c, d, e, f, g};
        h = arrf;
    }

    private f(String string2) {
        this.b = string2;
    }

    public static f valueOf(String string) {
        return (f)Enum.valueOf(f.class, (String)string);
    }

    public static f[] values() {
        return (f[])h.clone();
    }

    public String toString() {
        return this.b;
    }
}

