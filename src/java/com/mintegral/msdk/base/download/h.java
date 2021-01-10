/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.mintegral.msdk.base.download;

public final class h
extends Enum<h> {
    public static final /* enum */ h b = new h(0);
    public static final /* enum */ h c = new h(1);
    public static final /* enum */ h d = new h(2);
    public static final /* enum */ h e = new h(3);
    public static final /* enum */ h f = new h(4);
    private static final /* synthetic */ h[] g;

    static {
        h[] arrh = new h[]{b, c, d, e, f};
        g = arrh;
    }

    private h(int n3) {
    }

    public static h valueOf(String string) {
        return (h)Enum.valueOf(h.class, (String)string);
    }

    public static h[] values() {
        return (h[])g.clone();
    }
}

