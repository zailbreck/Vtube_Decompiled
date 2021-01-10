/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.Map
 */
package f.f.a.q.a;

import f.f.a.q.a.f;
import f.f.a.q.a.g;
import f.f.a.q.a.m;
import f.f.a.q.a.r.b;
import java.util.Collections;
import java.util.Map;

public final class l {
    final g a;
    final String b;
    final f c;
    final m d;
    final Map<Class<?>, Object> e;

    l(a a2) {
        this.a = a2.a;
        this.b = a2.b;
        this.c = a2.c.a();
        this.d = a2.d;
        this.e = b.a(a2.e);
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
        g a;
        String b = "GET";
        f.a c = new f.a();
        m d;
        Map<Class<?>, Object> e = Collections.emptyMap();

        public a a(f.f.a.q.a.a a2) {
            String string2 = a2.toString();
            if (string2.isEmpty()) {
                this.a("Cache-Control");
                return this;
            }
            this.b("Cache-Control", string2);
            return this;
        }

        public a a(g g2) {
            if (g2 != null) {
                this.a = g2;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a a(String string2) {
            this.c.a(string2);
            return this;
        }

        public a a(String string2, String string3) {
            this.c.a(string2, string3);
            return this;
        }

        public l a() {
            if (this.a != null) {
                return new l(this);
            }
            throw new IllegalStateException("url == null");
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
            this.a(g.b(string2));
            return this;
        }

        public a b(String string2, String string3) {
            this.c.c(string2, string3);
            return this;
        }
    }

}

