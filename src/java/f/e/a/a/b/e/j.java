/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.b.e;

import f.e.a.a.b.j.e;

public class j {
    private final String a;
    private final String b;

    private j(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public static j a(String string, String string2) {
        e.a(string, "Name is null or empty");
        e.a(string2, "Version is null or empty");
        return new j(string, string2);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}

