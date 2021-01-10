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
package j;

import j.f0.g.e;
import j.r;
import java.util.concurrent.TimeUnit;

public final class d {
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

    d(a a2) {
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

    private d(boolean bl, boolean bl2, int n2, int n3, boolean bl3, boolean bl4, boolean bl5, int n4, int n5, boolean bl6, boolean bl7, boolean bl8, String string2) {
        this.a = bl;
        this.b = bl2;
        this.c = n2;
        this.d = n3;
        this.e = bl3;
        this.f = bl4;
        this.g = bl5;
        this.h = n4;
        this.i = n5;
        this.j = bl6;
        this.k = bl7;
        this.l = bl8;
        this.m = string2;
    }

    public static d a(r r2) {
        r r3 = r2;
        int n2 = r2.b();
        boolean bl = true;
        String string2 = null;
        boolean bl2 = false;
        boolean bl3 = false;
        int n3 = -1;
        int n4 = -1;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        int n5 = -1;
        int n6 = -1;
        boolean bl7 = false;
        boolean bl8 = false;
        boolean bl9 = false;
        for (int i2 = 0; i2 < n2; ++i2) {
            block35 : {
                String string3;
                block34 : {
                    block33 : {
                        String string4;
                        block32 : {
                            string4 = r3.a(i2);
                            string3 = r3.b(i2);
                            if (!string4.equalsIgnoreCase("Cache-Control")) break block32;
                            if (string2 != null) break block33;
                            string2 = string3;
                            break block34;
                        }
                        if (!string4.equalsIgnoreCase("Pragma")) break block35;
                    }
                    bl = false;
                }
                int n7 = 0;
                while (n7 < string3.length()) {
                    int n8;
                    String string5;
                    int n9 = e.a(string3, n7, "=,;");
                    String string6 = string3.substring(n7, n9).trim();
                    if (n9 != string3.length() && string3.charAt(n9) != ',' && string3.charAt(n9) != ';') {
                        int n10 = e.b(string3, n9 + 1);
                        if (n10 < string3.length() && string3.charAt(n10) == '\"') {
                            int n11 = n10 + 1;
                            int n12 = e.a(string3, n11, "\"");
                            string5 = string3.substring(n11, n12);
                            n8 = n12 + 1;
                        } else {
                            n8 = e.a(string3, n10, ",;");
                            string5 = string3.substring(n10, n8).trim();
                        }
                    } else {
                        n8 = n9 + 1;
                        string5 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(string6)) {
                        bl2 = true;
                    } else if ("no-store".equalsIgnoreCase(string6)) {
                        bl3 = true;
                    } else if ("max-age".equalsIgnoreCase(string6)) {
                        n3 = e.a(string5, -1);
                    } else if ("s-maxage".equalsIgnoreCase(string6)) {
                        n4 = e.a(string5, -1);
                    } else if ("private".equalsIgnoreCase(string6)) {
                        bl4 = true;
                    } else if ("public".equalsIgnoreCase(string6)) {
                        bl5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string6)) {
                        bl6 = true;
                    } else if ("max-stale".equalsIgnoreCase(string6)) {
                        n5 = e.a(string5, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(string6)) {
                        n6 = e.a(string5, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(string6)) {
                        bl7 = true;
                    } else if ("no-transform".equalsIgnoreCase(string6)) {
                        bl8 = true;
                    } else if ("immutable".equalsIgnoreCase(string6)) {
                        bl9 = true;
                    }
                    n7 = n8;
                }
            }
            r3 = r2;
        }
        String string7 = !bl ? null : string2;
        d d2 = new d(bl2, bl3, n3, n4, bl4, bl5, bl6, n5, n6, bl7, bl8, bl9, string7);
        return d2;
    }

    private String k() {
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

    public boolean a() {
        return this.l;
    }

    public boolean b() {
        return this.e;
    }

    public boolean c() {
        return this.f;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.h;
    }

    public int f() {
        return this.i;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.a;
    }

    public boolean i() {
        return this.b;
    }

    public boolean j() {
        return this.j;
    }

    public String toString() {
        String string2;
        String string3 = this.m;
        if (string3 != null) {
            return string3;
        }
        this.m = string2 = this.k();
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

        public d a() {
            return new d(this);
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

