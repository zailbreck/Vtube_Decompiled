/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.f.a.a
 *  f.f.a.e.e.a
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.ConcurrentHashMap
 */
package f.f.a.s;

import f.f.a.k.g.b;
import java.util.concurrent.ConcurrentHashMap;

public final class a {
    private static ConcurrentHashMap<String, a> a = new ConcurrentHashMap();
    private static ConcurrentHashMap<String, a> b = new ConcurrentHashMap();
    private static ConcurrentHashMap<String, a> c = new ConcurrentHashMap();
    private static ConcurrentHashMap<String, a> d = new ConcurrentHashMap();
    private static ConcurrentHashMap<String, a> e = new ConcurrentHashMap();
    private static ConcurrentHashMap<String, a> f = new ConcurrentHashMap();
    private static ConcurrentHashMap<String, a> g = new ConcurrentHashMap();
    private static ConcurrentHashMap<String, a> h = new ConcurrentHashMap();
    private static ConcurrentHashMap<String, a> i = new ConcurrentHashMap();
    private static ConcurrentHashMap<String, a> j = new ConcurrentHashMap();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a a(int n2, f.f.a.e.e.a a2) {
        if (a2 == null) {
            return null;
        }
        try {
            String string2 = a2.M0();
            if (n2 == 288) {
                string2 = a2.j0();
            }
            if (n2 != 94) {
                if (n2 != 287) {
                    if (n2 != 288) {
                        if (a == null) return null;
                        if (a.size() <= 0) return null;
                        return (a)a.get((Object)string2);
                    }
                    if (d == null) return null;
                    if (d.size() <= 0) return null;
                    return (a)d.get((Object)string2);
                }
                if (a2.k1()) {
                    if (c == null) return null;
                    if (c.size() <= 0) return null;
                    return (a)c.get((Object)string2);
                }
                if (f == null) return null;
                if (f.size() <= 0) return null;
                return (a)f.get((Object)string2);
            }
            if (a2.k1()) {
                if (b == null) return null;
                if (b.size() <= 0) return null;
                return (a)b.get((Object)string2);
            }
            if (e == null) return null;
            if (e.size() <= 0) return null;
            return (a)e.get((Object)string2);
        }
        catch (Exception exception) {
            if (!f.f.a.a.a) return null;
            exception.printStackTrace();
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static a a(String string2) {
        ConcurrentHashMap<String, a> concurrentHashMap;
        if (g.containsKey((Object)string2)) {
            concurrentHashMap = g;
            do {
                return (a)concurrentHashMap.get((Object)string2);
                break;
            } while (true);
        }
        if (h.containsKey((Object)string2)) {
            concurrentHashMap = h;
            return (a)concurrentHashMap.get((Object)string2);
        }
        if (i.containsKey((Object)string2)) {
            concurrentHashMap = i;
            return (a)concurrentHashMap.get((Object)string2);
        }
        if (!j.containsKey((Object)string2)) return null;
        concurrentHashMap = j;
        return (a)concurrentHashMap.get((Object)string2);
    }

    public static void a() {
        g.clear();
        h.clear();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void a(int var0_1, String var1, a var2_2) {
        if (var0_1 == 94) ** GOTO lbl9
        if (var0_1 != 287) {
            return;
        }
        try {
            block5 : {
                if (a.c == null) {
                    a.c = new ConcurrentHashMap();
                }
                var4_3 = a.c;
                break block5;
lbl9: // 1 sources:
                if (a.b == null) {
                    a.b = new ConcurrentHashMap();
                }
                var4_3 = a.b;
            }
            var4_3.put((Object)var1, (Object)var2_2);
            return;
        }
        catch (Exception var3_4) {
            if (f.f.a.a.a == false) return;
            var3_4.printStackTrace();
            return;
        }
    }

    public static void b() {
        i.clear();
        j.clear();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(int n2, f.f.a.e.e.a a2) {
        if (a2 == null) {
            return;
        }
        try {
            ConcurrentHashMap<String, a> concurrentHashMap;
            String string2 = a2.M0();
            if (n2 == 288) {
                string2 = a2.j0();
            }
            if (n2 != 94) {
                if (n2 != 287) {
                    if (n2 != 288) {
                        if (a == null) return;
                        concurrentHashMap = a;
                    } else {
                        if (d == null) return;
                        concurrentHashMap = d;
                    }
                } else if (a2.k1()) {
                    if (c == null) return;
                    concurrentHashMap = c;
                } else {
                    if (f == null) return;
                    concurrentHashMap = f;
                }
            } else if (a2.k1()) {
                if (b == null) return;
                concurrentHashMap = b;
            } else {
                if (e == null) return;
                concurrentHashMap = e;
            }
            concurrentHashMap.remove((Object)string2);
            return;
        }
        catch (Exception exception) {
            if (!f.f.a.a.a) return;
            exception.printStackTrace();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void b(int var0_1, String var1, a var2_2) {
        if (var0_1 == 94) ** GOTO lbl17
        if (var0_1 == 287) ** GOTO lbl13
        if (var0_1 == 288) ** GOTO lbl9
        try {
            block6 : {
                if (a.a == null) {
                    a.a = new ConcurrentHashMap();
                }
                var3_3 = a.a;
                break block6;
lbl9: // 1 sources:
                if (a.d == null) {
                    a.d = new ConcurrentHashMap();
                }
                var3_3 = a.d;
                break block6;
lbl13: // 1 sources:
                if (a.f == null) {
                    a.f = new ConcurrentHashMap();
                }
                var3_3 = a.f;
                break block6;
lbl17: // 1 sources:
                if (a.e == null) {
                    a.e = new ConcurrentHashMap();
                }
                var3_3 = a.e;
            }
            var3_3.put((Object)var1, (Object)var2_2);
            return;
        }
        catch (Exception var4_4) {}
        if (f.f.a.a.a == false) return;
        var4_4.printStackTrace();
    }

    public static void b(String string2) {
        if (g.containsKey((Object)string2)) {
            g.remove((Object)string2);
        }
        if (i.containsKey((Object)string2)) {
            i.remove((Object)string2);
        }
        if (h.containsKey((Object)string2)) {
            h.remove((Object)string2);
        }
        if (j.containsKey((Object)string2)) {
            j.remove((Object)string2);
        }
    }

    public static final class a {
        private b a;
        private boolean b;

        public final b a() {
            return this.a;
        }

        public final void a(b b2) {
            this.a = b2;
        }

        public final void a(String string2) {
            b b2 = this.a;
            if (b2 != null) {
                b2.setTag((Object)string2);
            }
        }

        public final void a(boolean bl) {
            this.b = bl;
        }

        public final String b() {
            b b2 = this.a;
            if (b2 != null) {
                return (String)b2.getTag();
            }
            return "";
        }

        public final boolean c() {
            return this.b;
        }
    }

}

