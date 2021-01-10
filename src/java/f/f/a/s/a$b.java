/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  f.f.a.e.c.a
 *  f.f.a.e.e.a
 *  f.f.a.e.f.h
 *  f.f.a.f.a
 *  f.f.a.f.c
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package f.f.a.s;

import android.content.Context;
import android.text.TextUtils;
import f.f.a.e.d.e;
import f.f.a.e.f.h;
import f.f.a.f.c;
import f.f.a.s.a;
import f.f.a.s.d.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a$b {
    private static final String b = "f.f.a.s.a$b";
    private static a$b c;
    private e a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private a$b() {
        try {
            Context context = f.f.a.e.c.a.i().e();
            if (context != null) {
                this.a = e.a(f.f.a.e.d.h.a(context));
                return;
            }
            h.d((String)b, (String)"RewardCampaignCache get Context is null");
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a$b a() {
        if (c != null) return c;
        Class<a$b> class_ = a$b.class;
        synchronized (a$b.class) {
            if (c != null) return c;
            c = new a$b();
            // ** MonitorExit[var1] (shouldn't be in output)
            return c;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean b(f.f.a.e.e.a a2) {
        block3 : {
            long l2;
            long l3;
            long l4;
            long l5;
            try {
                f.f.a.s.d.a a3 = b.c().a();
                l4 = a3 != null ? a3.c() : 0L;
                l5 = System.currentTimeMillis();
                if (a2 == null) break block3;
                l2 = 1000L * a2.E0();
                l3 = a2.j();
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return true;
            }
            long l6 = l5 - l3;
            if (l2 > 0L && l2 >= l6 || l2 <= 0L && l4 >= l6) {
                return false;
            }
        }
        return true;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final List<f.f.a.e.e.a> a(String string2, int n2) {
        ArrayList arrayList;
        void var3_9;
        block5 : {
            if (TextUtils.isEmpty((CharSequence)string2)) return null;
            List<f.f.a.e.e.a> list = this.a.a(string2, 0, 0, n2);
            if (list == null) return null;
            arrayList = new ArrayList();
            try {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    f.f.a.e.e.a a2 = (f.f.a.e.e.a)iterator.next();
                    if (a2 == null) continue;
                    arrayList.add((Object)a2);
                }
                return arrayList;
            }
            catch (Exception exception) {}
            break block5;
            catch (Exception exception) {
                arrayList = null;
            }
        }
        var3_9.printStackTrace();
        return arrayList;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final List<f.f.a.e.e.a> a(String string2, int n2, boolean bl) {
        Iterator iterator;
        ArrayList arrayList;
        long l2;
        long l3;
        block5 : {
            void var5_16;
            ArrayList arrayList2;
            block6 : {
                arrayList2 = null;
                f.f.a.s.d.a a2 = b.c().a();
                l3 = a2 != null ? a2.c() : 0L;
                if (TextUtils.isEmpty((CharSequence)string2)) return null;
                List<f.f.a.e.e.a> list = this.a.a(string2, 0, 0, n2, bl);
                l2 = System.currentTimeMillis();
                if (list == null) return null;
                arrayList = new ArrayList();
                try {
                    iterator = list.iterator();
                    break block5;
                }
                catch (Exception exception) {
                    arrayList2 = arrayList;
                    break block6;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            var5_16.printStackTrace();
            return arrayList2;
        }
        while (iterator.hasNext()) {
            f.f.a.e.e.a a3 = (f.f.a.e.e.a)iterator.next();
            if (a3 == null || a3.I0() != 0 && a3.m0() != 1) continue;
            long l4 = 1000L * a3.E0();
            long l5 = l2 - a3.j();
            if ((l4 <= 0L || l4 < l5) && (l4 > 0L || l3 < l5)) continue;
            arrayList.add((Object)a3);
        }
        return arrayList;
    }

    public final List<f.f.a.e.e.a> a(String string2, String string3) {
        List<f.f.a.e.e.a> list;
        if (this.a != null && !TextUtils.isEmpty((CharSequence)string2) && !TextUtils.isEmpty((CharSequence)string3) && (list = this.a.c(string2, string3)) != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (f.f.a.e.e.a a2 : list) {
                if (a2.I0() != 0 && a2.m0() != 1 || a$b.super.b(a2)) continue;
                arrayList.add((Object)a2);
            }
            return arrayList;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(long l2, String string2) {
        void var6_3 = this;
        synchronized (var6_3) {
            try {
                try {
                    this.a.a(l2, string2);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    h.d((String)b, (String)exception.getMessage());
                }
                return;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    public final void a(f.f.a.e.e.a a2) {
        if (a2 != null) {
            try {
                if (!TextUtils.isEmpty((CharSequence)a2.e())) {
                    this.a.a(a2.e(), a2.L0());
                    return;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public final void a(f.f.a.e.e.a a2, String string2) {
        if (a2 != null) {
            try {
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    this.a.a(a2.e(), string2, a2.k1(), a2.L0());
                    return;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(String string2, String string3, List<f.f.a.e.e.a> list) {
        if (TextUtils.isEmpty((CharSequence)string3) || list == null) return;
        try {
            if (list.size() <= 0) return;
            this.a.a(list, string2, string3, 0);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final void a(String string2, List<f.f.a.e.e.a> list) {
        e e2;
        if (!TextUtils.isEmpty((CharSequence)string2) && list != null && list.size() > 0 && (e2 = this.a) != null) {
            e2.b(string2, list);
        }
    }

    public final void a(String string2, List<f.f.a.e.e.a> list, String string3, int n2) {
        e e2;
        if (!TextUtils.isEmpty((CharSequence)string2) && list != null && list.size() > 0 && !TextUtils.isEmpty((CharSequence)string3) && (e2 = this.a) != null) {
            e2.a(string2, list, string3, n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int b(String string2, int n2, boolean bl) {
        try {
            if (TextUtils.isEmpty((CharSequence)string2)) return 0;
            ArrayList arrayList = new ArrayList();
            List<f.f.a.e.e.a> list = this.a.a(string2, 0, 0, n2, bl);
            if (list == null) return 0;
            Iterator iterator = list.iterator();
            do {
                if (!iterator.hasNext()) {
                    return arrayList.size();
                }
                f.f.a.e.e.a a2 = (f.f.a.e.e.a)iterator.next();
                if (a2 == null || a2.I0() != 0) continue;
                arrayList.add((Object)a2);
            } while (true);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(String string2, int n2) {
        int n3;
        block10 : {
            void var26_3 = this;
            // MONITORENTER : var26_3
            f.f.a.f.a a2 = c.b().a(f.f.a.e.c.a.i().f());
            if (a2 == null) {
                a2 = c.b().a();
            }
            if ((n3 = a2.y()) != 0) break block10;
            // MONITOREXIT : var26_3
            return;
        }
        e e2 = this.a;
        boolean bl = true;
        boolean bl2 = n3 == 2;
        catch (Exception exception) {
            h.d((String)b, (String)exception.getMessage());
        }
        // MONITOREXIT : var26_3
        return;
        List<f.f.a.e.e.a> list = e2.b(string2, n2, bl2);
        if (list != null && list.size() > 0) {
            for (f.f.a.e.e.a a3 : list) {
                String string3 = a3.M0();
                String string4 = a3.e();
                String string5 = a3.B();
                String string6 = a3.p0();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string5);
                stringBuilder.append("_");
                stringBuilder.append(string4);
                stringBuilder.append("_");
                stringBuilder.append(string3);
                stringBuilder.append("_");
                stringBuilder.append(string6);
                a.b(stringBuilder.toString());
            }
        }
        e e3 = this.a;
        if (n3 != 2) {
            bl = false;
        }
        e3.a(string2, n2, bl);
    }

    public final void b(String string2, String string3) {
        if (this.a != null && !TextUtils.isEmpty((CharSequence)string2)) {
            this.a.d(string2, string3);
        }
    }

    public final List<f.f.a.e.e.a> c(String string2, int n2, boolean bl) {
        try {
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                List<f.f.a.e.e.a> list = this.a.a(string2, 0, 0, n2, bl);
                return list;
            }
        }
        catch (Exception exception) {
            h.d((String)b, (String)exception.getLocalizedMessage());
        }
        return null;
    }

    public final void c(String string2, String string3) {
        if (this.a != null && !TextUtils.isEmpty((CharSequence)string2)) {
            this.a.e(string2, string3);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final List<f.f.a.e.e.a> d(String string2, int n2, boolean bl) {
        long l3;
        long l2;
        Iterator iterator;
        ArrayList arrayList;
        block8 : {
            ArrayList arrayList2;
            void var5_19;
            block9 : {
                arrayList2 = null;
                String string3 = f.f.a.e.c.a.i().f();
                f.f.a.f.a a2 = c.b().a(string3);
                if (a2 == null) {
                    a2 = c.b().a();
                }
                l2 = 1000L * a2.d();
                boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
                if (bl2) return null;
                List<f.f.a.e.e.a> list = this.a.a(string2, 0, 0, n2, bl);
                l3 = System.currentTimeMillis();
                if (list == null) return null;
                arrayList = new ArrayList();
                try {
                    iterator = list.iterator();
                    break block8;
                }
                catch (Exception exception) {
                    arrayList2 = arrayList;
                    break block9;
                }
                catch (Exception exception) {
                    arrayList2 = null;
                }
                break block9;
                catch (Exception exception) {
                    // empty catch block
                }
            }
            var5_19.printStackTrace();
            return arrayList2;
        }
        while (iterator.hasNext()) {
            f.f.a.e.e.a a3 = (f.f.a.e.e.a)iterator.next();
            if (a3 == null || a3.I0() != 0) continue;
            long l4 = 1000L * a3.F0();
            long l5 = l3 - a3.j();
            if ((l4 > 0L || l2 < l5) && (l4 <= 0L || l4 < l5)) continue;
            arrayList.add((Object)a3);
        }
        return arrayList;
    }
}

