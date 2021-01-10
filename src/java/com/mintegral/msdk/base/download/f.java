/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.mintegral.msdk.base.download;

public final class f
extends Enum<f> {
    public static final /* enum */ f b = new f();
    public static final /* enum */ f c = new f();
    public static final /* enum */ f d = new f();
    public static final /* enum */ f e = new f();
    private static final /* synthetic */ f[] f;

    static {
        f[] arrf = new f[]{b, c, d, e};
        f = arrf;
    }

    public static f valueOf(String string) {
        return (f)Enum.valueOf(f.class, (String)string);
    }

    public static f[] values() {
        return (f[])f.clone();
    }
}

