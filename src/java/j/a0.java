/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package j;

import j.b0;
import j.d;
import j.q;
import j.r;
import j.s;
import j.w;
import j.y;
import java.io.Closeable;

public final class a0
implements Closeable {
    final y b;
    final w c;
    final int d;
    final String e;
    final q f;
    final r g;
    final b0 h;
    final a0 i;
    final a0 j;
    final a0 k;
    final long l;
    final long m;
    private volatile d n;

    a0(a a2) {
        this.b = a2.a;
        this.c = a2.b;
        this.d = a2.c;
        this.e = a2.d;
        this.f = a2.e;
        this.g = a2.f.a();
        this.h = a2.g;
        this.i = a2.h;
        this.j = a2.i;
        this.k = a2.j;
        this.l = a2.k;
        this.m = a2.l;
    }

    public b0 a() {
        return this.h;
    }

    public String a(String string2, String string3) {
        String string4 = this.g.a(string2);
        if (string4 != null) {
            return string4;
        }
        return string3;
    }

    public d b() {
        d d2;
        d d3 = this.n;
        if (d3 != null) {
            return d3;
        }
        this.n = d2 = d.a(this.g);
        return d2;
    }

    public String b(String string2) {
        return this.a(string2, null);
    }

    public void close() {
        b0 b02 = this.h;
        if (b02 != null) {
            b02.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public int m() {
        return this.d;
    }

    public q n() {
        return this.f;
    }

    public r o() {
        return this.g;
    }

    public a p() {
        return new a(this);
    }

    public a0 q() {
        return this.k;
    }

    public long r() {
        return this.m;
    }

    public y s() {
        return this.b;
    }

    public long t() {
        return this.l;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Response{protocol=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", code=");
        stringBuilder.append(this.d);
        stringBuilder.append(", message=");
        stringBuilder.append(this.e);
        stringBuilder.append(", url=");
        stringBuilder.append((Object)this.b.g());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static class a {
        y a;
        w b;
        int c;
        String d;
        q e;
        r.a f;
        b0 g;
        a0 h;
        a0 i;
        a0 j;
        long k;
        long l;

        public a() {
            this.c = -1;
            this.f = new r.a();
        }

        a(a0 a02) {
            this.c = -1;
            this.a = a02.b;
            this.b = a02.c;
            this.c = a02.d;
            this.d = a02.e;
            this.e = a02.f;
            this.f = a02.g.a();
            this.g = a02.h;
            this.h = a02.i;
            this.i = a02.j;
            this.j = a02.k;
            this.k = a02.l;
            this.l = a02.m;
        }

        private void a(String string2, a0 a02) {
            if (a02.h == null) {
                if (a02.i == null) {
                    if (a02.j == null) {
                        if (a02.k == null) {
                            return;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(string2);
                        stringBuilder.append(".priorResponse != null");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append(".cacheResponse != null");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(".networkResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(".body != null");
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        private void d(a0 a02) {
            if (a02.h == null) {
                return;
            }
            throw new IllegalArgumentException("priorResponse.body != null");
        }

        public a a(int n2) {
            this.c = n2;
            return this;
        }

        public a a(long l2) {
            this.l = l2;
            return this;
        }

        public a a(a0 a02) {
            if (a02 != null) {
                a.super.a("cacheResponse", a02);
            }
            this.i = a02;
            return this;
        }

        public a a(b0 b02) {
            this.g = b02;
            return this;
        }

        public a a(q q2) {
            this.e = q2;
            return this;
        }

        public a a(r r2) {
            this.f = r2.a();
            return this;
        }

        public a a(w w2) {
            this.b = w2;
            return this;
        }

        public a a(y y2) {
            this.a = y2;
            return this;
        }

        public a a(String string2) {
            this.d = string2;
            return this;
        }

        public a a(String string2, String string3) {
            this.f.a(string2, string3);
            return this;
        }

        public a0 a() {
            if (this.a != null) {
                if (this.b != null) {
                    if (this.c >= 0) {
                        if (this.d != null) {
                            return new a0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("code < 0: ");
                    stringBuilder.append(this.c);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }

        public a b(long l2) {
            this.k = l2;
            return this;
        }

        public a b(a0 a02) {
            if (a02 != null) {
                a.super.a("networkResponse", a02);
            }
            this.h = a02;
            return this;
        }

        public a c(a0 a02) {
            if (a02 != null) {
                a.super.d(a02);
            }
            this.j = a02;
            return this;
        }
    }

}

