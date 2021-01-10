/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package f.a.a.a.a;

import f.a.a.a.a.h.d;

public class f
extends Exception {
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;

    public f(int n2, String string, String string2, String string3, String string4, String string5) {
        super(string);
        this.b = n2;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = string5;
        d.a((Throwable)this);
    }

    public String a() {
        return this.c;
    }

    public void a(String string) {
    }

    public String b() {
        return this.e;
    }

    public void b(String string) {
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.d;
    }

    public int e() {
        return this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[StatusCode]: ");
        stringBuilder.append(this.b);
        stringBuilder.append(", [Code]: ");
        stringBuilder.append(this.a());
        stringBuilder.append(", [Message]: ");
        stringBuilder.append(this.getMessage());
        stringBuilder.append(", [Requestid]: ");
        stringBuilder.append(this.d());
        stringBuilder.append(", [HostId]: ");
        stringBuilder.append(this.b());
        stringBuilder.append(", [RawMessage]: ");
        stringBuilder.append(this.c());
        return stringBuilder.toString();
    }
}

