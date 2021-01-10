/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  f.f.a.e.b.d.b
 *  f.f.a.e.c.a
 *  f.f.a.e.e.a
 *  f.f.a.e.e.a$b
 *  f.f.a.e.e.a$b$a
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package f.f.a.s.f;

import android.content.Context;
import android.text.TextUtils;
import f.f.a.e.e.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class j {
    private static Map<String, Boolean> e = new HashMap();
    private Map<String, Boolean> a;
    private Map<String, Boolean> b;
    private Map<String, Boolean> c;
    private Map<String, Boolean> d;

    private j() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    /* synthetic */ j(a a2) {
    }

    public static j a() {
        return b.a;
    }

    public final void a(String string2, boolean bl) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put((Object)string2, (Object)bl);
    }

    public final void a(List<f.f.a.e.e.a> list) {
        if (list != null) {
            if (list.size() == 0) {
                return;
            }
            for (f.f.a.e.e.a a2 : list) {
                if (a2 == null) continue;
                if (a2 != null) {
                    List list2;
                    a.b b2;
                    String string2 = a2.d1();
                    Map<String, Boolean> map = this.a;
                    if (map != null && !map.containsKey((Object)string2)) {
                        this.a.put((Object)string2, (Object)false);
                    }
                    String string3 = a2.i1();
                    Map<String, Boolean> map2 = this.b;
                    if (map2 != null && !map2.containsKey((Object)string3)) {
                        this.b.put((Object)string3, (Object)false);
                    }
                    if ((b2 = a2.R0()) != null && (list2 = b2.e()) != null) {
                        for (a.b.a a3 : list2) {
                            List list3;
                            if (a3 == null || (list3 = a3.b) == null || list3.size() == 0) continue;
                            for (String string4 : list3) {
                                Map<String, Boolean> map3;
                                if (TextUtils.isEmpty((CharSequence)string4) || (map3 = e) == null || map3.containsKey((Object)string4)) continue;
                                boolean bl = f.f.a.e.b.d.b.a((Context)f.f.a.e.c.a.i().e()).b(string4);
                                e.put((Object)string4, (Object)bl);
                            }
                        }
                    }
                }
                String string5 = a2.e();
                if (this.c == null) {
                    this.c = new HashMap();
                }
                this.c.put((Object)string5, (Object)false);
            }
        }
    }

    public final boolean a(String string2) {
        if (this.a != null && !TextUtils.isEmpty((CharSequence)string2) && this.a.containsKey((Object)string2)) {
            return (Boolean)this.a.get((Object)string2);
        }
        return false;
    }

    public final void b(String string2, boolean bl) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put((Object)string2, (Object)bl);
    }

    public final boolean b(String string2) {
        if (this.b != null && !TextUtils.isEmpty((CharSequence)string2) && this.b.containsKey((Object)string2)) {
            return (Boolean)this.b.get((Object)string2);
        }
        return false;
    }

    public final void c(String string2, boolean bl) {
        if (e == null) {
            e = new HashMap();
        }
        e.put((Object)string2, (Object)bl);
    }

    public final boolean c(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return false;
        }
        if (this.d.containsKey((Object)string2)) {
            return (Boolean)this.d.get((Object)string2);
        }
        return false;
    }

    public final void d(String string2, boolean bl) {
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.put((Object)string2, (Object)bl);
    }

    private static final class b {
        public static j a = new j(null);
    }

}

