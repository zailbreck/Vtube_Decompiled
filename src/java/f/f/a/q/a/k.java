/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.q.a;

public final class k
extends Enum<k> {
    public static final /* enum */ k c = new k("http/1.0");
    public static final /* enum */ k d = new k("http/1.1");
    public static final /* enum */ k e = new k("spdy/3.1");
    public static final /* enum */ k f = new k("h2");
    public static final /* enum */ k g = new k("h2_prior_knowledge");
    public static final /* enum */ k h = new k("quic");
    private static final /* synthetic */ k[] i;
    private final String b;

    static {
        k[] arrk = new k[]{c, d, e, f, g, h};
        i = arrk;
    }

    private k(String string3) {
        this.b = string3;
    }

    public static k valueOf(String string2) {
        return (k)Enum.valueOf(k.class, (String)string2);
    }

    public static k[] values() {
        return (k[])i.clone();
    }

    public String toString() {
        return this.b;
    }
}

