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
package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

public final class j
extends Enum<j> {
    public static final /* enum */ j c = new j(0);
    public static final /* enum */ j d = new j(1);
    public static final /* enum */ j e = new j(2);
    private static final /* synthetic */ j[] f;
    private final int b;

    static {
        j[] arrj = new j[]{c, d, e};
        f = arrj;
    }

    private j(int n3) {
        this.b = n3;
    }

    public static j a(int n2) {
        IllegalArgumentException illegalArgumentException;
        for (j j2 : j.values()) {
            if (n2 != j2.a()) continue;
            return j2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No enum constant: ");
        stringBuilder.append(n2);
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    public static j valueOf(String string) {
        return (j)Enum.valueOf(j.class, (String)string);
    }

    public static j[] values() {
        return (j[])f.clone();
    }

    public int a() {
        return this.b;
    }
}

