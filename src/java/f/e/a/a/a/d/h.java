/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.net.URL
 */
package f.e.a.a.a.d;

import f.e.a.a.a.g.e;
import java.net.URL;

public final class h {
    private final String a;
    private final URL b;
    private final String c;

    private h(String string, URL uRL, String string2) {
        this.a = string;
        this.b = uRL;
        this.c = string2;
    }

    public static h a(String string, URL uRL) {
        e.a(string, "VendorKey is null or empty");
        e.a((Object)uRL, "ResourceURL is null");
        return new h(string, uRL, null);
    }

    public static h a(String string, URL uRL, String string2) {
        e.a(string, "VendorKey is null or empty");
        e.a((Object)uRL, "ResourceURL is null");
        e.a(string2, "VerificationParameters is null or empty");
        return new h(string, uRL, string2);
    }

    public static h a(URL uRL) {
        e.a((Object)uRL, "ResourceURL is null");
        return new h(null, uRL, null);
    }

    public URL a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }
}

