/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 */
package j.f0.i;

import j.f0.c;
import j.f0.i.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.e;
import k.f;
import k.l;
import k.s;

final class d {
    static final j.f0.i.c[] a;
    static final Map<f, Integer> b;

    static {
        j.f0.i.c[] arrc = new j.f0.i.c[]{new j.f0.i.c(j.f0.i.c.i, ""), new j.f0.i.c(j.f0.i.c.f, "GET"), new j.f0.i.c(j.f0.i.c.f, "POST"), new j.f0.i.c(j.f0.i.c.g, "/"), new j.f0.i.c(j.f0.i.c.g, "/index.html"), new j.f0.i.c(j.f0.i.c.h, "http"), new j.f0.i.c(j.f0.i.c.h, "https"), new j.f0.i.c(j.f0.i.c.e, "200"), new j.f0.i.c(j.f0.i.c.e, "204"), new j.f0.i.c(j.f0.i.c.e, "206"), new j.f0.i.c(j.f0.i.c.e, "304"), new j.f0.i.c(j.f0.i.c.e, "400"), new j.f0.i.c(j.f0.i.c.e, "404"), new j.f0.i.c(j.f0.i.c.e, "500"), new j.f0.i.c("accept-charset", ""), new j.f0.i.c("accept-encoding", "gzip, deflate"), new j.f0.i.c("accept-language", ""), new j.f0.i.c("accept-ranges", ""), new j.f0.i.c("accept", ""), new j.f0.i.c("access-control-allow-origin", ""), new j.f0.i.c("age", ""), new j.f0.i.c("allow", ""), new j.f0.i.c("authorization", ""), new j.f0.i.c("cache-control", ""), new j.f0.i.c("content-disposition", ""), new j.f0.i.c("content-encoding", ""), new j.f0.i.c("content-language", ""), new j.f0.i.c("content-length", ""), new j.f0.i.c("content-location", ""), new j.f0.i.c("content-range", ""), new j.f0.i.c("content-type", ""), new j.f0.i.c("cookie", ""), new j.f0.i.c("date", ""), new j.f0.i.c("etag", ""), new j.f0.i.c("expect", ""), new j.f0.i.c("expires", ""), new j.f0.i.c("from", ""), new j.f0.i.c("host", ""), new j.f0.i.c("if-match", ""), new j.f0.i.c("if-modified-since", ""), new j.f0.i.c("if-none-match", ""), new j.f0.i.c("if-range", ""), new j.f0.i.c("if-unmodified-since", ""), new j.f0.i.c("last-modified", ""), new j.f0.i.c("link", ""), new j.f0.i.c("location", ""), new j.f0.i.c("max-forwards", ""), new j.f0.i.c("proxy-authenticate", ""), new j.f0.i.c("proxy-authorization", ""), new j.f0.i.c("range", ""), new j.f0.i.c("referer", ""), new j.f0.i.c("refresh", ""), new j.f0.i.c("retry-after", ""), new j.f0.i.c("server", ""), new j.f0.i.c("set-cookie", ""), new j.f0.i.c("strict-transport-security", ""), new j.f0.i.c("transfer-encoding", ""), new j.f0.i.c("user-agent", ""), new j.f0.i.c("vary", ""), new j.f0.i.c("via", ""), new j.f0.i.c("www-authenticate", "")};
        a = arrc;
        b = d.a();
    }

    private static Map<f, Integer> a() {
        j.f0.i.c[] arrc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        for (int i2 = 0; i2 < (arrc = a).length; ++i2) {
            if (linkedHashMap.containsKey((Object)arrc[i2].a)) continue;
            linkedHashMap.put((Object)d.a[i2].a, (Object)i2);
        }
        return Collections.unmodifiableMap((Map)linkedHashMap);
    }

    static f a(f f2) {
        int n2 = f2.e();
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = f2.a(i2);
            if (by < 65 || by > 90) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PROTOCOL_ERROR response malformed: mixed case name: ");
            stringBuilder.append(f2.h());
            throw new IOException(stringBuilder.toString());
        }
        return f2;
    }

    static final class a {
        private final List<j.f0.i.c> a;
        private final e b;
        private final int c;
        private int d;
        j.f0.i.c[] e;
        int f;
        int g;
        int h;

        a(int n2, int n3, s s2) {
            this.a = new ArrayList();
            this.e = new j.f0.i.c[8];
            this.f = -1 + this.e.length;
            this.g = 0;
            this.h = 0;
            this.c = n2;
            this.d = n3;
            this.b = l.a(s2);
        }

        a(int n2, s s2) {
            super(n2, n2, s2);
        }

        private int a(int n2) {
            return n2 + (1 + this.f);
        }

        private void a(int n2, j.f0.i.c c2) {
            int n3;
            this.a.add((Object)c2);
            int n4 = c2.c;
            if (n2 != -1) {
                n4 -= this.e[a.super.a((int)n2)].c;
            }
            if (n4 > (n3 = this.d)) {
                a.super.e();
                return;
            }
            int n5 = a.super.b(n4 + this.h - n3);
            if (n2 == -1) {
                int n6 = 1 + this.g;
                j.f0.i.c[] arrc = this.e;
                if (n6 > arrc.length) {
                    j.f0.i.c[] arrc2 = new j.f0.i.c[2 * arrc.length];
                    System.arraycopy((Object)arrc, (int)0, (Object)arrc2, (int)arrc.length, (int)arrc.length);
                    this.f = -1 + this.e.length;
                    this.e = arrc2;
                }
                int n7 = this.f;
                this.f = n7 - 1;
                this.e[n7] = c2;
                this.g = 1 + this.g;
            } else {
                int n8 = n2 + (n5 + a.super.a(n2));
                this.e[n8] = c2;
            }
            this.h = n4 + this.h;
        }

        private int b(int n2) {
            int n3 = 0;
            if (n2 > 0) {
                for (int i2 = -1 + this.e.length; i2 >= this.f && n2 > 0; --i2) {
                    j.f0.i.c[] arrc = this.e;
                    n2 -= arrc[i2].c;
                    this.h -= arrc[i2].c;
                    this.g = -1 + this.g;
                    ++n3;
                }
                j.f0.i.c[] arrc = this.e;
                int n4 = this.f;
                System.arraycopy((Object)arrc, (int)(n4 + 1), (Object)arrc, (int)(n3 + (n4 + 1)), (int)this.g);
                this.f = n3 + this.f;
            }
            return n3;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private f c(int n2) {
            j.f0.i.c c2;
            j.f0.i.c[] arrc;
            if (a.super.d(n2)) {
                c2 = d.a[n2];
                do {
                    return c2.a;
                    break;
                } while (true);
            }
            int n3 = a.super.a(n2 - d.a.length);
            if (n3 >= 0 && n3 < (arrc = this.e).length) {
                c2 = arrc[n3];
                return c2.a;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Header index too large ");
            stringBuilder.append(n2 + 1);
            IOException iOException = new IOException(stringBuilder.toString());
            throw iOException;
        }

        private void d() {
            int n2 = this.d;
            int n3 = this.h;
            if (n2 < n3) {
                if (n2 == 0) {
                    this.e();
                    return;
                }
                this.b(n3 - n2);
            }
        }

        private boolean d(int n2) {
            return n2 >= 0 && n2 <= d.a.length - 1;
        }

        private void e() {
            Arrays.fill((Object[])this.e, null);
            this.f = -1 + this.e.length;
            this.g = 0;
            this.h = 0;
        }

        private void e(int n2) {
            j.f0.i.c[] arrc;
            if (a.super.d(n2)) {
                j.f0.i.c c2 = d.a[n2];
                this.a.add((Object)c2);
                return;
            }
            int n3 = a.super.a(n2 - d.a.length);
            if (n3 >= 0 && n3 < (arrc = this.e).length) {
                this.a.add((Object)arrc[n3]);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Header index too large ");
            stringBuilder.append(n2 + 1);
            throw new IOException(stringBuilder.toString());
        }

        private int f() {
            return 255 & this.b.readByte();
        }

        private void f(int n2) {
            a.super.a(-1, new j.f0.i.c(a.super.c(n2), this.b()));
        }

        private void g() {
            f f2 = this.b();
            d.a(f2);
            this.a(-1, new j.f0.i.c(f2, this.b()));
        }

        private void g(int n2) {
            f f2 = a.super.c(n2);
            f f3 = this.b();
            this.a.add((Object)new j.f0.i.c(f2, f3));
        }

        private void h() {
            f f2 = this.b();
            d.a(f2);
            f f3 = this.b();
            this.a.add((Object)new j.f0.i.c(f2, f3));
        }

        int a(int n2, int n3) {
            int n4;
            int n5 = n2 & n3;
            if (n5 < n3) {
                return n5;
            }
            int n6 = 0;
            while (((n4 = a.super.f()) & 128) != 0) {
                n3 += (n4 & 127) << n6;
                n6 += 7;
            }
            return n3 + (n4 << n6);
        }

        public List<j.f0.i.c> a() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }

        f b() {
            int n2 = this.f();
            boolean bl = (n2 & 128) == 128;
            int n3 = this.a(n2, 127);
            if (bl) {
                return f.a(k.b().a(this.b.b(n3)));
            }
            return this.b.a(n3);
        }

        void c() {
            while (!this.b.i()) {
                int n2 = 255 & this.b.readByte();
                if (n2 != 128) {
                    if ((n2 & 128) == 128) {
                        this.e(-1 + this.a(n2, 127));
                        continue;
                    }
                    if (n2 == 64) {
                        this.g();
                        continue;
                    }
                    if ((n2 & 64) == 64) {
                        this.f(-1 + this.a(n2, 63));
                        continue;
                    }
                    if ((n2 & 32) == 32) {
                        this.d = this.a(n2, 31);
                        int n3 = this.d;
                        if (n3 >= 0 && n3 <= this.c) {
                            this.d();
                            continue;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid dynamic table size update ");
                        stringBuilder.append(this.d);
                        throw new IOException(stringBuilder.toString());
                    }
                    if (n2 != 16 && n2 != 0) {
                        this.g(-1 + this.a(n2, 15));
                        continue;
                    }
                    this.h();
                    continue;
                }
                throw new IOException("index == 0");
            }
        }
    }

    static final class b {
        private final k.c a;
        private final boolean b;
        private int c;
        private boolean d;
        int e;
        j.f0.i.c[] f;
        int g;
        int h;
        int i;

        b(int n2, boolean bl, k.c c2) {
            this.c = Integer.MAX_VALUE;
            this.f = new j.f0.i.c[8];
            this.g = -1 + this.f.length;
            this.h = 0;
            this.i = 0;
            this.e = n2;
            this.b = bl;
            this.a = c2;
        }

        b(k.c c2) {
            super(4096, true, c2);
        }

        private void a() {
            int n2 = this.e;
            int n3 = this.i;
            if (n2 < n3) {
                if (n2 == 0) {
                    this.b();
                    return;
                }
                this.b(n3 - n2);
            }
        }

        private void a(j.f0.i.c c2) {
            int n2 = c2.c;
            int n3 = this.e;
            if (n2 > n3) {
                b.super.b();
                return;
            }
            b.super.b(n2 + this.i - n3);
            int n4 = 1 + this.h;
            j.f0.i.c[] arrc = this.f;
            if (n4 > arrc.length) {
                j.f0.i.c[] arrc2 = new j.f0.i.c[2 * arrc.length];
                System.arraycopy((Object)arrc, (int)0, (Object)arrc2, (int)arrc.length, (int)arrc.length);
                this.g = -1 + this.f.length;
                this.f = arrc2;
            }
            int n5 = this.g;
            this.g = n5 - 1;
            this.f[n5] = c2;
            this.h = 1 + this.h;
            this.i = n2 + this.i;
        }

        private int b(int n2) {
            int n3 = 0;
            if (n2 > 0) {
                for (int i2 = -1 + this.f.length; i2 >= this.g && n2 > 0; --i2) {
                    j.f0.i.c[] arrc = this.f;
                    n2 -= arrc[i2].c;
                    this.i -= arrc[i2].c;
                    this.h = -1 + this.h;
                    ++n3;
                }
                j.f0.i.c[] arrc = this.f;
                int n4 = this.g;
                System.arraycopy((Object)arrc, (int)(n4 + 1), (Object)arrc, (int)(n3 + (n4 + 1)), (int)this.h);
                Object[] arrobject = this.f;
                int n5 = this.g;
                Arrays.fill((Object[])arrobject, (int)(n5 + 1), (int)(n3 + (n5 + 1)), null);
                this.g = n3 + this.g;
            }
            return n3;
        }

        private void b() {
            Arrays.fill((Object[])this.f, null);
            this.g = -1 + this.f.length;
            this.h = 0;
            this.i = 0;
        }

        void a(int n2) {
            int n3 = this.e;
            int n4 = Math.min((int)n2, (int)16384);
            if (n3 == n4) {
                return;
            }
            if (n4 < n3) {
                this.c = Math.min((int)this.c, (int)n4);
            }
            this.d = true;
            this.e = n4;
            b.super.a();
        }

        /*
         * Enabled aggressive block sorting
         */
        void a(int n2, int n3, int n4) {
            k.c c2;
            int n5;
            if (n2 < n3) {
                c2 = this.a;
                n5 = n2 | n4;
            } else {
                this.a.writeByte(n4 | n3);
                for (n5 = n2 - n3; n5 >= 128; n5 >>>= 7) {
                    int n6 = n5 & 127;
                    this.a.writeByte(128 | n6);
                }
                c2 = this.a;
            }
            c2.writeByte(n5);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        void a(List<j.f0.i.c> var1) {
            if (this.d) {
                var14_2 = this.c;
                if (var14_2 < this.e) {
                    this.a(var14_2, 31, 32);
                }
                this.d = false;
                this.c = Integer.MAX_VALUE;
                this.a(this.e, 31, 32);
            }
            var2_3 = var1.size();
            var3_4 = 0;
            while (var3_4 < var2_3) {
                block15 : {
                    block16 : {
                        block14 : {
                            block13 : {
                                block12 : {
                                    var4_11 = (j.f0.i.c)var1.get(var3_4);
                                    var5_9 = var4_11.a.f();
                                    var6_13 = var4_11.b;
                                    var7_12 = (Integer)d.b.get((Object)var5_9);
                                    if (var7_12 == null) break block12;
                                    var8_5 = 1 + var7_12;
                                    if (var8_5 <= 1 || var8_5 >= 8) ** GOTO lbl-1000
                                    if (c.a(d.a[var8_5 - 1].b, (Object)var6_13)) {
                                        var9_8 = var8_5;
                                    } else if (c.a(d.a[var8_5].b, (Object)var6_13)) {
                                        var13_7 = var8_5 + 1;
                                        var9_8 = var8_5;
                                        var8_5 = var13_7;
                                    } else lbl-1000: // 2 sources:
                                    {
                                        var9_8 = var8_5;
                                        var8_5 = -1;
                                    }
                                    break block13;
                                }
                                var8_5 = -1;
                                var9_8 = -1;
                            }
                            if (var8_5 == -1) {
                                var12_10 = this.f.length;
                                for (var11_6 = 1 + this.g; var11_6 < var12_10; ++var11_6) {
                                    if (!c.a(this.f[var11_6].a, (Object)var5_9)) continue;
                                    if (c.a(this.f[var11_6].b, (Object)var6_13)) {
                                        var8_5 = var11_6 - this.g + d.a.length;
                                        break;
                                    }
                                    if (var9_8 != -1) continue;
                                    var9_8 = var11_6 - this.g + d.a.length;
                                }
                            }
                            if (var8_5 == -1) break block14;
                            this.a(var8_5, 127, 128);
                            break block15;
                        }
                        if (var9_8 != -1) break block16;
                        this.a.writeByte(64);
                        this.a(var5_9);
                        ** GOTO lbl57
                    }
                    if (var5_9.b(j.f0.i.c.d) && !j.f0.i.c.i.equals(var5_9)) {
                        this.a(var9_8, 15, 0);
                        this.a(var6_13);
                    } else {
                        this.a(var9_8, 63, 64);
lbl57: // 2 sources:
                        this.a(var6_13);
                        b.super.a(var4_11);
                    }
                }
                ++var3_4;
            }
        }

        void a(f f2) {
            int n2;
            int n3;
            if (this.b && k.b().a(f2) < f2.e()) {
                k.c c2 = new k.c();
                k.b().a(f2, c2);
                f2 = c2.n();
                n2 = f2.e();
                n3 = 128;
            } else {
                n2 = f2.e();
                n3 = 0;
            }
            this.a(n2, 127, n3);
            this.a.a(f2);
        }
    }

}

