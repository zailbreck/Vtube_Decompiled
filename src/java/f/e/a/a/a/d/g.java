/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.a.d;

import f.e.a.a.a.g.e;

public class g {
    private final String a;
    private final String b;

    private g(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public static g a(String string, String string2) {
        e.a(string, "Name is null or empty");
        e.a(string2, "Version is null or empty");
        return new g(string, string2);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}

