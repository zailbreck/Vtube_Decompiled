/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package j;

import java.io.IOException;

public final class w
extends Enum<w> {
    public static final /* enum */ w c = new w("http/1.0");
    public static final /* enum */ w d = new w("http/1.1");
    public static final /* enum */ w e = new w("spdy/3.1");
    public static final /* enum */ w f = new w("h2");
    public static final /* enum */ w g = new w("h2_prior_knowledge");
    public static final /* enum */ w h = new w("quic");
    private static final /* synthetic */ w[] i;
    private final String b;

    static {
        w[] arrw = new w[]{c, d, e, f, g, h};
        i = arrw;
    }

    private w(String string3) {
        this.b = string3;
    }

    public static w a(String string2) {
        if (string2.equals((Object)w.c.b)) {
            return c;
        }
        if (string2.equals((Object)w.d.b)) {
            return d;
        }
        if (string2.equals((Object)w.g.b)) {
            return g;
        }
        if (string2.equals((Object)w.f.b)) {
            return f;
        }
        if (string2.equals((Object)w.e.b)) {
            return e;
        }
        if (string2.equals((Object)w.h.b)) {
            return h;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected protocol: ");
        stringBuilder.append(string2);
        throw new IOException(stringBuilder.toString());
    }

    public static w valueOf(String string2) {
        return (w)Enum.valueOf(w.class, (String)string2);
    }

    public static w[] values() {
        return (w[])i.clone();
    }

    public String toString() {
        return this.b;
    }
}

