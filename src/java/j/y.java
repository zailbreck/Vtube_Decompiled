/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.LinkedHashMap
 *  java.util.Map
 */
package j;

import j.d;
import j.f0.c;
import j.f0.g.f;
import j.r;
import j.s;
import j.z;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class y {
    final s a;
    final String b;
    final r c;
    final z d;
    final Map<Class<?>, Object> e;
    private volatile d f;

    y(a a2) {
        this.a = a2.a;
        this.b = a2.b;
        this.c = a2.c.a();
        this.d = a2.d;
        this.e = c.a(a2.e);
    }

    public z a() {
        return this.d;
    }

    public String a(String string2) {
        return this.c.a(string2);
    }

    public d b() {
        d d2;
        d d3 = this.f;
        if (d3 != null) {
            return d3;
        }
        this.f = d2 = d.a(this.c);
        return d2;
    }

    public r c() {
        return this.c;
    }

    public boolean d() {
        return this.a.h();
    }

    public String e() {
        return this.b;
    }

    public a f() {
        return new a(this);
    }

    public s g() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{method=");
        stringBuilder.append(this.b);
        stringBuilder.append(", url=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", tags=");
        stringBuilder.append(this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static class a {
        s a;
        String b;
        r.a c;
        z d;
        Map<Class<?>, Object> e;

        public a() {
            this.e = Collections.emptyMap();
            this.b = "GET";
            this.c = new r.a();
        }

        a(y y2) {
            this.e = Collections.emptyMap();
            this.a = y2.a;
            this.b = y2.b;
            this.d = y2.d;
            Object object = y2.e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap(y2.e);
            this.e = object;
            this.c = y2.c.a();
        }

        public a a(r r2) {
            this.c = r2.a();
            return this;
        }

        public a a(s s2) {
            if (s2 != null) {
                this.a = s2;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a a(z z2) {
            this.a("DELETE", z2);
            return this;
        }

        public a a(String string2) {
            this.c.b(string2);
            return this;
        }

        public a a(String string2, z z2) {
            if (string2 != null) {
                if (string2.length() != 0) {
                    if (z2 != null && !f.b(string2)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("method ");
                        stringBuilder.append(string2);
                        stringBuilder.append(" must not have a request body.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    if (z2 == null && f.e(string2)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("method ");
                        stringBuilder.append(string2);
                        stringBuilder.append(" must have a request body.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    this.b = string2;
                    this.d = z2;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public a a(String string2, String string3) {
            this.c.a(string2, string3);
            return this;
        }

        public y a() {
            if (this.a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b() {
            this.a(c.d);
            return this;
        }

        /*
         * Enabled aggressive block sorting
         */
        public a b(String string2) {
            block6 : {
                int n2;
                StringBuilder stringBuilder;
                block5 : {
                    block4 : {
                        if (string2 == null) {
                            NullPointerException nullPointerException = new NullPointerException("url == null");
                            throw nullPointerException;
                        }
                        if (!string2.regionMatches(true, 0, "ws:", 0, 3)) break block4;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("http:");
                        n2 = 3;
                        break block5;
                    }
                    if (!string2.regionMatches(true, 0, "wss:", 0, 4)) break block6;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("https:");
                    n2 = 4;
                }
                stringBuilder.append(string2.substring(n2));
                string2 = stringBuilder.toString();
            }
            this.a(s.d(string2));
            return this;
        }

        public a b(String string2, String string3) {
            this.c.c(string2, string3);
            return this;
        }

        public a c() {
            this.a("GET", (z)null);
            return this;
        }

        public a d() {
            this.a("HEAD", (z)null);
            return this;
        }
    }

}

