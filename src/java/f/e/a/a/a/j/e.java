/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.a.j;

public final class e
extends Enum<e> {
    public static final /* enum */ e b = new e();
    public static final /* enum */ e c = new e();
    public static final /* enum */ e d = new e();
    private static final /* synthetic */ e[] e;

    static {
        e[] arre = new e[]{b, c, d};
        e = arre;
    }

    public static e valueOf(String string) {
        return (e)Enum.valueOf(e.class, (String)string);
    }

    public static e[] values() {
        return (e[])e.clone();
    }
}

