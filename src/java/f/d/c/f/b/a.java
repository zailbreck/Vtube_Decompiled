/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.d.c.f.b;

public final class a
extends Enum<a> {
    public static final /* enum */ a c = new a(1);
    public static final /* enum */ a d = new a(0);
    public static final /* enum */ a e = new a(3);
    public static final /* enum */ a f = new a(2);
    private static final /* synthetic */ a[] g;
    private final int b;

    static {
        a a2 = c;
        a a3 = d;
        a a4 = e;
        a a5 = f;
        a[] arra = new a[]{a2, a3, a4, a5};
        g = arra;
        a[] arra2 = new a[]{a3, a2, a5, a4};
    }

    private a(int n3) {
        this.b = n3;
    }

    public static a valueOf(String string) {
        return (a)Enum.valueOf(a.class, (String)string);
    }

    public static a[] values() {
        return (a[])g.clone();
    }

    public int a() {
        return this.b;
    }
}

