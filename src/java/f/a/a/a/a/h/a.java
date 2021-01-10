/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.a.a.a.a.h;

public final class a
extends Enum<a> {
    public static final /* enum */ a b = new a();
    public static final /* enum */ a c = new a();
    public static final /* enum */ a d = new a();
    public static final /* enum */ a e = new a();
    public static final /* enum */ a f = new a();
    public static final /* enum */ a g = new a();
    private static final /* synthetic */ a[] h;

    static {
        a[] arra = new a[]{b, c, d, e, f, g};
        h = arra;
    }

    public static a valueOf(String string) {
        return (a)Enum.valueOf(a.class, (String)string);
    }

    public static a[] values() {
        return (a[])h.clone();
    }
}

