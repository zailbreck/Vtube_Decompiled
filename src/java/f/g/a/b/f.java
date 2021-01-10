/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.g.a.b;

public final class f
extends Enum<f> {
    public static final /* enum */ f c = new f("document");
    public static final /* enum */ f d = new f("image");
    public static final /* enum */ f e = new f("style-sheet");
    public static final /* enum */ f f = new f("script");
    public static final /* enum */ f g = new f("font");
    public static final /* enum */ f h = new f("svg-document");
    public static final /* enum */ f i = new f("media");
    public static final /* enum */ f j = new f("popup");
    public static final /* enum */ f k = new f("raw");
    private static final /* synthetic */ f[] l;
    private final String b;

    static {
        f[] arrf = new f[]{c, d, e, f, g, h, i, j, k};
        l = arrf;
    }

    private f(String string3) {
        this.b = string3;
    }

    public static f a(String string2) {
        IllegalArgumentException illegalArgumentException;
        for (f f2 : f.values()) {
            if (!string2.equals((Object)f2.b)) continue;
            return f2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No enum constant: ");
        stringBuilder.append(string2);
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    public static f valueOf(String string2) {
        return (f)Enum.valueOf(f.class, (String)string2);
    }

    public static f[] values() {
        return (f[])l.clone();
    }

    public String toString() {
        return this.b;
    }
}

