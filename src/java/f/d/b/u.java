/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.d.b;

import f.d.b.u;

public abstract class u
extends Enum<u> {
    public static final /* enum */ u b = new u(){};
    public static final /* enum */ u c = new u(){};
    private static final /* synthetic */ u[] d;

    static {
        u[] arru = new u[]{b, c};
        d = arru;
    }

    private u() {
    }

    /* synthetic */ u(String string, int n2, a a2) {
    }

    public static u valueOf(String string) {
        return (u)Enum.valueOf(u.class, (String)string);
    }

    public static u[] values() {
        return (u[])d.clone();
    }
}

