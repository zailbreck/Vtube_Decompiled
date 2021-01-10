/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Map
 */
package f.d.c.f.c;

import f.d.c.b;
import f.d.c.f.b.c;
import f.d.c.f.c.d;
import f.d.c.f.c.e;
import f.d.c.f.c.f;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class c {
    private static final int[] a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    static int a(int n2) {
        int[] arrn = a;
        if (n2 < arrn.length) {
            return arrn[n2];
        }
        return -1;
    }

    private static int a(f.d.c.e.a a2, f.d.c.f.b.a a3, f.d.c.f.b.c c2, f.d.c.f.c.b b2) {
        int n2 = Integer.MAX_VALUE;
        int n3 = -1;
        for (int i2 = 0; i2 < 8; ++i2) {
            e.a(a2, a3, c2, i2, b2);
            int n4 = c.a(b2);
            if (n4 >= n2) continue;
            n3 = i2;
            n2 = n4;
        }
        return n3;
    }

    private static int a(f.d.c.f.b.b b2, f.d.c.e.a a2, f.d.c.e.a a3, f.d.c.f.b.c c2) {
        return a2.a() + b2.a(c2) + a3.a();
    }

    private static int a(f.d.c.f.c.b b2) {
        return d.a(b2) + d.b(b2) + d.c(b2) + d.d(b2);
    }

    static f.d.c.e.a a(f.d.c.e.a a2, int n2, int n3, int n4) {
        f.d.c.d d2;
        if (a2.b() == n3) {
            ArrayList arrayList = new ArrayList(n4);
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            for (int i2 = 0; i2 < n4; ++i2) {
                int[] arrn = new int[1];
                int[] arrn2 = new int[1];
                c.a(n2, n3, n4, i2, arrn, arrn2);
                int n8 = arrn[0];
                byte[] arrby = new byte[n8];
                a2.a(n5 << 3, arrby, 0, n8);
                byte[] arrby2 = c.a(arrby, arrn2[0]);
                arrayList.add((Object)new f.d.c.f.c.a(arrby, arrby2));
                n6 = Math.max((int)n6, (int)n8);
                n7 = Math.max((int)n7, (int)arrby2.length);
                n5 += arrn[0];
            }
            if (n3 == n5) {
                f.d.c.e.a a3 = new f.d.c.e.a();
                int n9 = 0;
                do {
                    if (n9 >= n6) break;
                    Iterator iterator = arrayList.iterator();
                    while (iterator.hasNext()) {
                        byte[] arrby = ((f.d.c.f.c.a)iterator.next()).a();
                        if (n9 >= arrby.length) continue;
                        a3.a(arrby[n9], 8);
                    }
                    ++n9;
                } while (true);
                for (int i3 = 0; i3 < n7; ++i3) {
                    Iterator iterator = arrayList.iterator();
                    while (iterator.hasNext()) {
                        byte[] arrby = ((f.d.c.f.c.a)iterator.next()).b();
                        if (i3 >= arrby.length) continue;
                        a3.a(arrby[i3], 8);
                    }
                }
                if (n2 == a3.b()) {
                    return a3;
                }
                StringBuilder stringBuilder = new StringBuilder("Interleaving error: ");
                stringBuilder.append(n2);
                stringBuilder.append(" and ");
                stringBuilder.append(a3.b());
                stringBuilder.append(" differ.");
                throw new f.d.c.d(stringBuilder.toString());
            }
            throw new f.d.c.d("Data bytes does not match offset");
        }
        d2 = new f.d.c.d("Number of bits and data bytes does not match");
        throw d2;
    }

    private static f.d.c.f.b.b a(String string, String string2) {
        if ("Shift_JIS".equals((Object)string2) && c.a(string)) {
            return f.d.c.f.b.b.j;
        }
        boolean bl = false;
        boolean bl2 = false;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 >= '0' && c2 <= '9') {
                bl2 = true;
                continue;
            }
            if (c.a(c2) != -1) {
                bl = true;
                continue;
            }
            return f.d.c.f.b.b.h;
        }
        if (bl) {
            return f.d.c.f.b.b.f;
        }
        if (bl2) {
            return f.d.c.f.b.b.e;
        }
        return f.d.c.f.b.b.h;
    }

    private static f.d.c.f.b.c a(int n2, f.d.c.f.b.a a2) {
        f.d.c.d d2;
        for (int i2 = 1; i2 <= 40; ++i2) {
            f.d.c.f.b.c c2 = f.d.c.f.b.c.a(i2);
            if (!c.a(n2, c2, a2)) continue;
            return c2;
        }
        d2 = new f.d.c.d("Data too big");
        throw d2;
    }

    private static f.d.c.f.b.c a(f.d.c.f.b.a a2, f.d.c.f.b.b b2, f.d.c.e.a a3, f.d.c.e.a a4) {
        return c.a(c.a(b2, a3, a4, c.a(c.a(b2, a3, a4, f.d.c.f.b.c.a(1)), a2)), a2);
    }

    public static f a(String string, f.d.c.f.b.a a2, Map<b, ?> map) {
        f.d.c.e.c c2;
        f.d.c.f.b.c c3;
        String string2 = map != null && map.containsKey((Object)b.c) ? map.get((Object)b.c).toString() : "ISO-8859-1";
        f.d.c.f.b.b b2 = c.a(string, string2);
        f.d.c.e.a a3 = new f.d.c.e.a();
        if (b2 == f.d.c.f.b.b.h && !"ISO-8859-1".equals((Object)string2) && (c2 = f.d.c.e.c.a(string2)) != null) {
            c.a(c2, a3);
        }
        c.a(b2, a3);
        f.d.c.e.a a4 = new f.d.c.e.a();
        c.a(string, b2, a4, string2);
        if (map != null && map.containsKey((Object)b.l)) {
            c3 = f.d.c.f.b.c.a(Integer.parseInt((String)map.get((Object)b.l).toString()));
            if (!c.a(c.a(b2, a3, a4, c3), c3, a2)) {
                throw new f.d.c.d("Data too big for requested version");
            }
        } else {
            c3 = c.a(a2, b2, a3, a4);
        }
        f.d.c.e.a a5 = new f.d.c.e.a();
        a5.a(a3);
        int n2 = b2 == f.d.c.f.b.b.h ? a4.b() : string.length();
        c.a(n2, c3, b2, a5);
        a5.a(a4);
        c.b b3 = c3.a(a2);
        int n3 = c3.b() - b3.d();
        c.a(n3, a5);
        f.d.c.e.a a6 = c.a(a5, c3.b(), n3, b3.c());
        f f2 = new f();
        f2.a(a2);
        f2.a(b2);
        f2.a(c3);
        int n4 = c3.a();
        f.d.c.f.c.b b4 = new f.d.c.f.c.b(n4, n4);
        int n5 = c.a(a6, a2, c3, b4);
        f2.a(n5);
        e.a(a6, a2, c3, n5, b4);
        f2.a(b4);
        return f2;
    }

    static void a(int n2, int n3, int n4, int n5, int[] arrn, int[] arrn2) {
        if (n5 < n4) {
            int n6 = n2 % n4;
            int n7 = n4 - n6;
            int n8 = n2 / n4;
            int n9 = n3 / n4;
            int n10 = n8 - n9;
            int n11 = n8 + 1;
            int n12 = n9 + 1;
            int n13 = n11 - n12;
            if (n10 == n13) {
                if (n4 == n7 + n6) {
                    if (n2 == n7 * (n9 + n10) + n6 * (n12 + n13)) {
                        if (n5 < n7) {
                            arrn[0] = n9;
                            arrn2[0] = n10;
                            return;
                        }
                        arrn[0] = n12;
                        arrn2[0] = n13;
                        return;
                    }
                    throw new f.d.c.d("Total bytes mismatch");
                }
                throw new f.d.c.d("RS blocks mismatch");
            }
            throw new f.d.c.d("EC bytes mismatch");
        }
        throw new f.d.c.d("Block ID too large");
    }

    static void a(int n2, f.d.c.e.a a2) {
        f.d.c.d d2;
        int n3 = n2 << 3;
        if (a2.a() <= n3) {
            int n4 = 0;
            for (int i2 = 0; i2 < 4 && a2.a() < n3; ++i2) {
                a2.a(false);
            }
            int n5 = 7 & a2.a();
            if (n5 > 0) {
                while (n5 < 8) {
                    a2.a(false);
                    ++n5;
                }
            }
            int n6 = n2 - a2.b();
            while (n4 < n6) {
                int n7 = (n4 & 1) == 0 ? 236 : 17;
                a2.a(n7, 8);
                ++n4;
            }
            if (a2.a() == n3) {
                return;
            }
            throw new f.d.c.d("Bits size does not equal capacity");
        }
        StringBuilder stringBuilder = new StringBuilder("data bits cannot fit in the QR Code");
        stringBuilder.append(a2.a());
        stringBuilder.append(" > ");
        stringBuilder.append(n3);
        d2 = new f.d.c.d(stringBuilder.toString());
        throw d2;
    }

    static void a(int n2, f.d.c.f.b.c c2, f.d.c.f.b.b b2, f.d.c.e.a a2) {
        int n3 = b2.a(c2);
        int n4 = 1 << n3;
        if (n2 < n4) {
            a2.a(n2, n3);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n2);
        stringBuilder.append(" is bigger than ");
        stringBuilder.append(n4 - 1);
        throw new f.d.c.d(stringBuilder.toString());
    }

    private static void a(f.d.c.e.c c2, f.d.c.e.a a2) {
        a2.a(f.d.c.f.b.b.i.a(), 4);
        a2.a(c2.a(), 8);
    }

    static void a(f.d.c.f.b.b b2, f.d.c.e.a a2) {
        a2.a(b2.a(), 4);
    }

    static void a(CharSequence charSequence, f.d.c.e.a a2) {
        int n2 = charSequence.length();
        int n3 = 0;
        while (n3 < n2) {
            int n4 = c.a(charSequence.charAt(n3));
            if (n4 != -1) {
                int n5 = n3 + 1;
                if (n5 < n2) {
                    int n6 = c.a(charSequence.charAt(n5));
                    if (n6 != -1) {
                        a2.a(n6 + n4 * 45, 11);
                        n3 += 2;
                        continue;
                    }
                    throw new f.d.c.d();
                }
                a2.a(n4, 6);
                n3 = n5;
                continue;
            }
            throw new f.d.c.d();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    static void a(String var0_1, f.d.c.e.a var1) {
        try {}
        catch (UnsupportedEncodingException var2_9) {
            var3_10 = new f.d.c.d(var2_9);
            throw var3_10;
        }
        var4_2 = var0_1.getBytes("Shift_JIS");
        var5_3 = var4_2.length;
        var6_4 = 0;
        while (var6_4 < var5_3) {
            var7_8 = 255 & var4_2[var6_4];
            var8_5 = 255 & var4_2[var6_4 + 1] | var7_8 << 8;
            var9_6 = 33088;
            if (var8_5 >= var9_6 && var8_5 <= 40956) ** GOTO lbl16
            if (var8_5 >= 57408 && var8_5 <= 60351) {
                var9_6 = 49472;
lbl16: // 2 sources:
                var10_7 = var8_5 - var9_6;
            } else {
                var10_7 = -1;
            }
            if (var10_7 == -1) throw new f.d.c.d("Invalid byte sequence");
            var1.a(192 * (var10_7 >> 8) + (var10_7 & 255), 13);
            var6_4 += 2;
        }
    }

    static void a(String string, f.d.c.e.a a2, String string2) {
        byte[] arrby;
        try {
            arrby = string.getBytes(string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            f.d.c.d d2;
            d2 = new f.d.c.d(unsupportedEncodingException);
            throw d2;
        }
        int n2 = arrby.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            a2.a(arrby[i2], 8);
        }
        return;
    }

    static void a(String string, f.d.c.f.b.b b2, f.d.c.e.a a2, String string2) {
        int n2 = a.a[b2.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 == 4) {
                        c.a(string, a2);
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder("Invalid mode: ");
                    stringBuilder.append((Object)b2);
                    throw new f.d.c.d(stringBuilder.toString());
                }
                c.a(string, a2, string2);
                return;
            }
            c.a((CharSequence)string, a2);
            return;
        }
        c.b(string, a2);
    }

    private static boolean a(int n2, f.d.c.f.b.c c2, f.d.c.f.b.a a2) {
        return c2.b() - c2.a(a2).d() >= (n2 + 7) / 8;
    }

    private static boolean a(String string) {
        byte[] arrby;
        try {
            arrby = string.getBytes("Shift_JIS");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return false;
        }
        int n2 = arrby.length;
        if (n2 % 2 != 0) {
            return false;
        }
        for (int i2 = 0; i2 < n2; i2 += 2) {
            int n3 = 255 & arrby[i2];
            if (n3 >= 129 && n3 <= 159) continue;
            if (n3 >= 224) {
                if (n3 <= 235) continue;
                return false;
            }
            return false;
        }
        return true;
    }

    static byte[] a(byte[] arrby, int n2) {
        int n3 = arrby.length;
        int[] arrn = new int[n3 + n2];
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            arrn[i2] = 255 & arrby[i2];
        }
        new f.d.c.e.d.c(f.d.c.e.d.a.h).a(arrn, n2);
        byte[] arrby2 = new byte[n2];
        while (n4 < n2) {
            arrby2[n4] = (byte)arrn[n3 + n4];
            ++n4;
        }
        return arrby2;
    }

    static void b(CharSequence charSequence, f.d.c.e.a a2) {
        int n2 = charSequence.length();
        int n3 = 0;
        while (n3 < n2) {
            int n4 = -48 + charSequence.charAt(n3);
            int n5 = n3 + 2;
            if (n5 < n2) {
                int n6 = -48 + charSequence.charAt(n3 + 1);
                a2.a(-48 + charSequence.charAt(n5) + (n4 * 100 + n6 * 10), 10);
                n3 += 3;
                continue;
            }
            if (++n3 < n2) {
                a2.a(-48 + charSequence.charAt(n3) + n4 * 10, 7);
                n3 = n5;
                continue;
            }
            a2.a(n4, 4);
        }
    }

}

