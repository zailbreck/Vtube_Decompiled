/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  org.json.JSONObject
 */
package f.f.a.e.b.h.j;

import android.text.TextUtils;
import f.f.a.e.b.h.n;
import f.f.a.e.f.h;
import f.f.a.f.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class c {
    private int a;
    private ArrayList<Integer> b;
    private ConcurrentHashMap<String, b> c;

    private c() {
        this.b = new ArrayList();
        this.c = new ConcurrentHashMap();
        f.f.a.f.a a2 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
        if (a2 == null) {
            a2 = f.f.a.f.c.b().a();
        }
        this.a = 1000 * a2.A();
        if (a2.B() != null && a2.B().size() > 0) {
            h.d("IDErrorUtil", "Setting ercd not EMPTY will use setting.");
            this.b.addAll(a2.B());
            return;
        }
        h.d("IDErrorUtil", "Setting ercd is EMPTY and use default code list.");
        ArrayList<Integer> arrayList = this.b;
        Object[] arrobject = new Integer[]{-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616};
        arrayList.addAll((Collection)Arrays.asList((Object[])arrobject));
    }

    /* synthetic */ c(a a2) {
    }

    private b a(String string) {
        void var18_2 = this;
        synchronized (var18_2) {
            block8 : {
                b b2;
                block10 : {
                    block9 : {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("getErrorInfo : ");
                        stringBuilder.append(string);
                        h.d("IDErrorUtil", stringBuilder.toString());
                        if (!this.c.containsKey((Object)string) || (b2 = (b)this.c.get((Object)string)) == null) break block8;
                        int n2 = b2.b;
                        if (n2 != -1) break block9;
                        return b2;
                    }
                    try {
                        long l2 = b2.a + (long)this.a;
                        if (System.currentTimeMillis() <= l2) break block10;
                        this.c.remove((Object)string);
                        if (this.c.size() > 0) {
                            Iterator iterator = this.c.entrySet().iterator();
                            while (iterator.hasNext()) {
                                h.d("IDErrorUtil", "getErrorInfo : delete timeout entry");
                                Map.Entry entry = (Map.Entry)iterator.next();
                                b b3 = (b)entry.getValue();
                                if (System.currentTimeMillis() - b3.a <= (long)this.a) continue;
                                this.c.remove(entry.getKey());
                            }
                        }
                        return null;
                    }
                    catch (Throwable throwable) {}
                    {
                        throw throwable;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("getErrorInfo : ");
                stringBuilder.append(b2.c);
                h.d("IDErrorUtil", stringBuilder.toString());
                return b2;
            }
            return null;
        }
    }

    public static c a() {
        return c.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final n a(f.f.a.e.b.h.k.c c2) {
        String string = (String)c2.b().get((Object)"app_id");
        String string2 = (String)c2.b().get((Object)"placement_id");
        String string3 = (String)c2.b().get((Object)"unit_id");
        String string4 = (String)c2.b().get((Object)"ad_type");
        String string5 = (String)c2.b().get((Object)"token");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_");
        stringBuilder.append(string2);
        stringBuilder.append("_");
        stringBuilder.append(string3);
        stringBuilder.append("_");
        stringBuilder.append(string4);
        String string6 = stringBuilder.toString();
        b b2 = c.super.a(string6);
        if (b2 != null && !TextUtils.isEmpty((CharSequence)b2.c)) {
            try {
                int n2;
                if (b2.b != -1) {
                    return n.a(new JSONObject(b2.c), new f.f.a.e.b.h.i.a(200, b2.c.getBytes(), null));
                }
                if (!TextUtils.isEmpty((CharSequence)string5)) {
                    return null;
                }
                if (string4 != null && !TextUtils.isEmpty((CharSequence)string4) && (n2 = Integer.parseInt((String)string4)) != 287 && n2 != 94) {
                    long l2 = (long)(1000 * f.f.a.f.c.b().b(string, string3).a()) + b2.a;
                    if (System.currentTimeMillis() < l2) {
                        return n.a(new JSONObject(b2.c), new f.f.a.e.b.h.i.a(200, b2.c.getBytes(), null));
                    }
                    this.c.remove((Object)string6);
                    return null;
                }
            }
            catch (Exception exception) {
                h.d("IDErrorUtil", exception.getMessage());
            }
        }
        h.d("IDErrorUtil", "getErrorInfo RETURN NULL");
        return null;
    }

    public final void a(String string, int n2, String string2, long l2) {
        void var16_5 = this;
        synchronized (var16_5) {
            block7 : {
                block6 : {
                    boolean bl = this.c.containsKey((Object)string);
                    if (!bl) break block6;
                    return;
                }
                boolean bl = TextUtils.isEmpty((CharSequence)string2);
                if (!bl) break block7;
                return;
            }
            if (this.b.contains((Object)n2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("addErrorInfo : ");
                stringBuilder.append(string);
                stringBuilder.append(" ");
                stringBuilder.append(string2);
                h.d("IDErrorUtil", stringBuilder.toString());
                b b2 = new b(l2, n2, string2);
                this.c.put((Object)string, (Object)b2);
            }
            return;
        }
    }

    private static final class b {
        public long a;
        public int b;
        public String c;

        public b(long l2, int n2, String string) {
            this.a = l2;
            this.b = n2;
            this.c = string;
        }
    }

    private static final class c {
        private static final c a = new c(null);
    }

}

