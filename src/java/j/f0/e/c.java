/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Date
 *  java.util.concurrent.TimeUnit
 */
package j.f0.e;

import j.a0;
import j.d;
import j.f0.g.e;
import j.q;
import j.r;
import j.s;
import j.y;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public final class c {
    public final y a;
    public final a0 b;

    c(y y2, a0 a02) {
        this.a = y2;
        this.b = a02;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean a(a0 var0_1, y var1) {
        block6 : {
            var2_2 = var0_1.m();
            if (var2_2 == 200 || var2_2 == 410 || var2_2 == 414 || var2_2 == 501 || var2_2 == 203 || var2_2 == 204) break block6;
            if (var2_2 == 307) ** GOTO lbl-1000
            if (var2_2 == 308 || var2_2 == 404 || var2_2 == 405) break block6;
            switch (var2_2) {
                default: {
                    return false;
                }
                case 302: lbl-1000: // 2 sources:
                {
                    if (var0_1.b("Expires") != null || var0_1.b().d() != -1 || var0_1.b().c()) break;
                    if (var0_1.b().b() == false) return false;
                    break;
                }
                case 300: 
                case 301: 
            }
        }
        var3_3 = var0_1.b().i();
        var4_4 = false;
        if (var3_3 != false) return var4_4;
        var5_5 = var1.b().i();
        var4_4 = false;
        if (var5_5 != false) return var4_4;
        return true;
    }

    public static class a {
        final long a;
        final y b;
        final a0 c;
        private Date d;
        private String e;
        private Date f;
        private String g;
        private Date h;
        private long i;
        private long j;
        private String k;
        private int l = -1;

        public a(long l2, y y2, a0 a02) {
            this.a = l2;
            this.b = y2;
            this.c = a02;
            if (a02 != null) {
                this.i = a02.t();
                this.j = a02.r();
                r r2 = a02.o();
                int n2 = r2.b();
                for (int i2 = 0; i2 < n2; ++i2) {
                    String string2 = r2.a(i2);
                    String string3 = r2.b(i2);
                    if ("Date".equalsIgnoreCase(string2)) {
                        this.d = j.f0.g.d.a(string3);
                        this.e = string3;
                        continue;
                    }
                    if ("Expires".equalsIgnoreCase(string2)) {
                        this.h = j.f0.g.d.a(string3);
                        continue;
                    }
                    if ("Last-Modified".equalsIgnoreCase(string2)) {
                        this.f = j.f0.g.d.a(string3);
                        this.g = string3;
                        continue;
                    }
                    if ("ETag".equalsIgnoreCase(string2)) {
                        this.k = string3;
                        continue;
                    }
                    if (!"Age".equalsIgnoreCase(string2)) continue;
                    this.l = e.a(string3, -1);
                }
            }
        }

        private static boolean a(y y2) {
            return y2.a("If-Modified-Since") != null || y2.a("If-None-Match") != null;
            {
            }
        }

        private long b() {
            int n2;
            Date date = this.d;
            long l2 = 0L;
            if (date != null) {
                l2 = Math.max((long)l2, (long)(this.j - date.getTime()));
            }
            if ((n2 = this.l) != -1) {
                l2 = Math.max((long)l2, (long)TimeUnit.SECONDS.toMillis((long)n2));
            }
            long l3 = this.j;
            long l4 = l3 - this.i;
            return this.a - l3 + (l2 + l4);
        }

        private long c() {
            long l2;
            Date date;
            long l3;
            d d2 = this.c.b();
            if (d2.d() != -1) {
                return TimeUnit.SECONDS.toMillis((long)d2.d());
            }
            Date date2 = this.h;
            long l4 = 0L;
            if (date2 != null) {
                Date date3 = this.d;
                long l5 = date3 != null ? date3.getTime() : this.j;
                long l6 = this.h.getTime() - l5;
                if (l6 > l4) {
                    l4 = l6;
                }
                return l4;
            }
            if (this.f != null && this.c.s().g().k() == null && (l2 = (l3 = (date = this.d) != null ? date.getTime() : this.i) - this.f.getTime()) > l4) {
                l4 = l2 / 10L;
            }
            return l4;
        }

        private c d() {
            block12 : {
                block16 : {
                    String string2;
                    String string3;
                    block14 : {
                        block15 : {
                            block13 : {
                                long l2;
                                if (this.c == null) {
                                    return new c(this.b, null);
                                }
                                if (this.b.d() && this.c.n() == null) {
                                    return new c(this.b, null);
                                }
                                if (!c.a(this.c, this.b)) {
                                    return new c(this.b, null);
                                }
                                d d2 = this.b.b();
                                if (d2.h() || a.a(this.b)) break block12;
                                d d3 = this.c.b();
                                if (d3.a()) {
                                    return new c(null, this.c);
                                }
                                long l3 = this.b();
                                long l4 = this.c();
                                if (d2.d() != -1) {
                                    l4 = Math.min((long)l4, (long)TimeUnit.SECONDS.toMillis((long)d2.d()));
                                }
                                int n2 = d2.f();
                                long l5 = 0L;
                                long l6 = n2 != -1 ? TimeUnit.SECONDS.toMillis((long)d2.f()) : l5;
                                if (!d3.g() && d2.e() != -1) {
                                    l5 = TimeUnit.SECONDS.toMillis((long)d2.e());
                                }
                                if (!d3.h() && (l2 = l6 + l3) < l5 + l4) {
                                    a0.a a2 = this.c.p();
                                    if (l2 >= l4) {
                                        a2.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (l3 > 86400000L && this.e()) {
                                        a2.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    return new c(null, a2.a());
                                }
                                string3 = this.k;
                                string2 = "If-Modified-Since";
                                if (string3 == null) break block13;
                                string2 = "If-None-Match";
                                break block14;
                            }
                            if (this.f == null) break block15;
                            string3 = this.g;
                            break block14;
                        }
                        if (this.d == null) break block16;
                        string3 = this.e;
                    }
                    r.a a3 = this.b.c().a();
                    j.f0.a.a.a(a3, string2, string3);
                    y.a a4 = this.b.f();
                    a4.a(a3.a());
                    return new c(a4.a(), this.c);
                }
                return new c(this.b, null);
            }
            return new c(this.b, null);
        }

        private boolean e() {
            return this.c.b().d() == -1 && this.h == null;
        }

        public c a() {
            c c2 = this.d();
            if (c2.a != null && this.b.b().j()) {
                c2 = new c(null, null);
            }
            return c2;
        }
    }

}

