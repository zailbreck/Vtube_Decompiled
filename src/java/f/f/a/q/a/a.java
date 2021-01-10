/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.TimeUnit
 */
package f.f.a.q.a;

import java.util.concurrent.TimeUnit;

public final class a {
    private final boolean a;
    private final boolean b;
    private final int c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    String m;

    static {
        a a2 = new a();
        a2.b();
        a2.a();
        a a3 = new a();
        a3.c();
        a3.a(Integer.MAX_VALUE, TimeUnit.SECONDS);
        a3.a();
    }

    a(a a2) {
        this.a = a2.a;
        this.b = a2.b;
        this.c = a2.c;
        this.d = -1;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = a2.d;
        this.i = a2.e;
        this.j = a2.f;
        this.k = a2.g;
        this.l = a2.h;
    }

    private String a() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a) {
            stringBuilder.append("no-cache, ");
        }
        if (this.b) {
            stringBuilder.append("no-store, ");
        }
        if (this.c != -1) {
            stringBuilder.append("max-age=");
            stringBuilder.append(this.c);
            stringBuilder.append(", ");
        }
        if (this.d != -1) {
            stringBuilder.append("s-maxage=");
            stringBuilder.append(this.d);
            stringBuilder.append(", ");
        }
        if (this.e) {
            stringBuilder.append("private, ");
        }
        if (this.f) {
            stringBuilder.append("public, ");
        }
        if (this.g) {
            stringBuilder.append("must-revalidate, ");
        }
        if (this.h != -1) {
            stringBuilder.append("max-stale=");
            stringBuilder.append(this.h);
            stringBuilder.append(", ");
        }
        if (this.i != -1) {
            stringBuilder.append("min-fresh=");
            stringBuilder.append(this.i);
            stringBuilder.append(", ");
        }
        if (this.j) {
            stringBuilder.append("only-if-cached, ");
        }
        if (this.k) {
            stringBuilder.append("no-transform, ");
        }
        if (this.l) {
            stringBuilder.append("immutable, ");
        }
        if (stringBuilder.length() == 0) {
            return "";
        }
        stringBuilder.delete(-2 + stringBuilder.length(), stringBuilder.length());
        return stringBuilder.toString();
    }

    public String toString() {
        String string2;
        String string3 = this.m;
        if (string3 != null) {
            return string3;
        }
        this.m = string2 = this.a();
        return string2;
    }

    public static final class a {
        boolean a;
        boolean b;
        int c = -1;
        int d = -1;
        int e = -1;
        boolean f;
        boolean g;
        boolean h;

        public a a(int n2, TimeUnit timeUnit) {
            if (n2 >= 0) {
                long l2 = timeUnit.toSeconds((long)n2);
                int n3 = l2 > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l2;
                this.d = n3;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("maxStale < 0: ");
            stringBuilder.append(n2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public a a() {
            return new a(this);
        }

        public a b() {
            this.a = true;
            return this;
        }

        public a c() {
            this.f = true;
            return this;
        }
    }

}

