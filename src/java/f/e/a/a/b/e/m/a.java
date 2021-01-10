/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.b.e.m;

public final class a
extends Enum<a> {
    public static final /* enum */ a c = new a("click");
    public static final /* enum */ a d = new a("invitationAccept");
    private static final /* synthetic */ a[] e;
    String b;

    static {
        a[] arra = new a[]{c, d};
        e = arra;
    }

    private a(String string2) {
        this.b = string2;
    }

    public static a valueOf(String string) {
        return (a)Enum.valueOf(a.class, (String)string);
    }

    public static a[] values() {
        return (a[])e.clone();
    }

    public String toString() {
        return this.b;
    }
}

