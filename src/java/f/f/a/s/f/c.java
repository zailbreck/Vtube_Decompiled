/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  f.f.a.a
 *  f.f.a.e.e.a
 *  f.f.a.e.f.h
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.CopyOnWriteArrayList
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.LinkedBlockingDeque
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package f.f.a.s.f;

import android.content.Context;
import android.text.TextUtils;
import f.f.a.e.f.h;
import f.f.a.s.f.a;
import f.f.a.s.f.d;
import f.f.a.s.f.m;
import f.f.a.s.g.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c {
    private static c g;
    private ThreadPoolExecutor a;
    private boolean b = false;
    private ConcurrentHashMap<String, m> c = new ConcurrentHashMap();
    private Map<String, List<Map<String, a>>> d;
    private Map<String, List<f.f.a.e.e.a>> e;
    private Map<String, List<a>> f;

    private c() {
        ThreadPoolExecutor threadPoolExecutor;
        this.a = threadPoolExecutor = new ThreadPoolExecutor(5, 5, 15L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingDeque());
        this.a.allowCoreThreadTimeOut(true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c a() {
        if (g != null) return g;
        Class<c> class_ = c.class;
        synchronized (c.class) {
            if (g != null) return g;
            g = new c();
            // ** MonitorExit[var1] (shouldn't be in output)
            return g;
        }
    }

    private m d(String string2) {
        ConcurrentHashMap<String, m> concurrentHashMap = this.c;
        if (concurrentHashMap != null && concurrentHashMap.containsKey((Object)string2)) {
            return (m)this.c.get((Object)string2);
        }
        return null;
    }

    public final int a(String string2, String string3, d d2) {
        ConcurrentHashMap<String, m> concurrentHashMap = this.c;
        if (concurrentHashMap != null) {
            Iterator iterator = concurrentHashMap.entrySet().iterator();
            while (iterator.hasNext()) {
                CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList;
                m m2 = (m)((Map.Entry)iterator.next()).getValue();
                if (m2 == null || (copyOnWriteArrayList = m2.b()) == null) continue;
                int n2 = copyOnWriteArrayList.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    Iterator iterator2;
                    f.f.a.e.e.a a2;
                    a a3;
                    Map map = (Map)copyOnWriteArrayList.get(i2);
                    if (map == null || !(iterator2 = map.entrySet().iterator()).hasNext() || (a3 = (a)((Map.Entry)iterator2.next()).getValue()) == null || !a3.h() || (a2 = a3.l()) == null) continue;
                    String string4 = a2.d1();
                    if (TextUtils.isEmpty((CharSequence)string3) || TextUtils.isEmpty((CharSequence)string4) || !string3.equals((Object)string4) || !a3.h()) continue;
                    a3.a(d2);
                    return a3.i();
                }
            }
        }
        return 0;
    }

    public final a a(int n2, String string2, boolean bl) {
        m m2 = c.super.d(string2);
        if (m2 != null) {
            return m2.b(n2, bl);
        }
        return null;
    }

    public m a(Context context, String string2, List<f.f.a.e.e.a> list, int n2, b b2) {
        if (!TextUtils.isEmpty((CharSequence)string2) && list != null && list.size() != 0) {
            if (this.c.containsKey((Object)string2)) {
                m m2 = (m)this.c.get((Object)string2);
                if (n2 != 94 && n2 != 287) {
                    m2.a(b2);
                } else {
                    m2.a(((f.f.a.e.e.a)list.get(0)).L0(), b2);
                }
                m2.a(list);
                return m2;
            }
            m m3 = new m(context, list, (ExecutorService)this.a, string2, n2);
            if (b2 != null) {
                m3.a(b2);
            }
            this.c.put((Object)string2, (Object)m3);
            return m3;
        }
        return null;
    }

    public final List<f.f.a.e.e.a> a(String string2) {
        Map<String, List<f.f.a.e.e.a>> map = this.e;
        if (map != null && map.containsKey((Object)string2)) {
            List list = (List)this.e.get((Object)string2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\u6210\u529f\u7684 Campaign\uff1a ");
            stringBuilder.append(list.size());
            h.a((String)"DownLoadManager", (String)stringBuilder.toString());
            if (list != null) {
                for (f.f.a.e.e.a a2 : list) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("\u6210\u529f\u7684 Campaign\uff1a");
                    stringBuilder2.append(a2.e());
                    stringBuilder2.append("   ");
                    stringBuilder2.append(a2.L0());
                    h.a((String)"DownLoadManager", (String)stringBuilder2.toString());
                }
            }
            return list;
        }
        return null;
    }

    public final void a(boolean bl) {
        ConcurrentHashMap<String, m> concurrentHashMap;
        if (bl) {
            if (this.b) {
                return;
            }
        } else {
            this.b = false;
        }
        if ((concurrentHashMap = this.c) != null) {
            Iterator iterator = concurrentHashMap.entrySet().iterator();
            while (iterator.hasNext()) {
                ((m)((Map.Entry)iterator.next()).getValue()).a();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(int n2, String string2, boolean bl, int n3, boolean bl2, int n4, List<f.f.a.e.e.a> list) {
        List<a> list2;
        boolean bl3;
        block24 : {
            block25 : {
                bl3 = false;
                if (list == null) return bl3;
                try {
                    if (list.size() == 0) {
                        return false;
                    }
                    m m2 = this.d(string2);
                    bl3 = false;
                    if (m2 == null) return bl3;
                    list2 = m2.a(string2, n2, bl, list);
                    bl3 = false;
                    if (list2 == null) break block24;
                    if (list2.size() == 0) {
                        return false;
                    }
                    if (bl2) {
                        bl3 = false;
                        if (n4 == 0) {
                            ArrayList arrayList = new ArrayList();
                            Iterator iterator = list2.iterator();
                            block2 : do {
                                boolean bl4 = iterator.hasNext();
                                bl3 = false;
                                if (!bl4) break;
                                a a2 = (a)iterator.next();
                                Iterator iterator2 = list.iterator();
                                do {
                                    boolean bl5 = iterator2.hasNext();
                                    bl3 = false;
                                    if (!bl5) continue block2;
                                    f.f.a.e.e.a a3 = (f.f.a.e.e.a)iterator2.next();
                                    bl3 = false;
                                    if (a2 == null || a2.l() == null) continue;
                                    bl3 = false;
                                    if (a3 == null) continue;
                                    boolean bl6 = a3.e().equals((Object)a2.l().e());
                                    bl3 = false;
                                    if (!bl6) continue;
                                    boolean bl7 = a3.L0().equals((Object)a2.l().L0());
                                    bl3 = false;
                                    if (!bl7) continue;
                                    arrayList.add((Object)a2);
                                } while (true);
                                break;
                            } while (true);
                            int n5 = arrayList.size();
                            bl3 = false;
                            if (n5 <= 0) break block24;
                            break block25;
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator iterator = list2.iterator();
                        block4 : do {
                            boolean bl8 = iterator.hasNext();
                            bl3 = false;
                            if (!bl8) break;
                            a a4 = (a)iterator.next();
                            Iterator iterator3 = list.iterator();
                            do {
                                boolean bl9 = iterator3.hasNext();
                                bl3 = false;
                                if (!bl9) continue block4;
                                f.f.a.e.e.a a5 = (f.f.a.e.e.a)iterator3.next();
                                bl3 = false;
                                if (a4 == null || a4.l() == null) continue;
                                bl3 = false;
                                if (a5 == null) continue;
                                boolean bl10 = a5.e().equals((Object)a4.l().e());
                                bl3 = false;
                                if (!bl10) continue;
                                boolean bl11 = a5.L0().equals((Object)a4.l().L0());
                                bl3 = false;
                                if (!bl11) continue;
                                arrayList.add((Object)a4);
                            } while (true);
                            break;
                        } while (true);
                        if (arrayList.size() < n3) {
                            arrayList.size();
                            return false;
                        }
                        break block25;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator iterator = list2.iterator();
                    block6 : do {
                        boolean bl12 = iterator.hasNext();
                        bl3 = false;
                        if (!bl12) break;
                        a a6 = (a)iterator.next();
                        Iterator iterator4 = list.iterator();
                        do {
                            boolean bl13 = iterator4.hasNext();
                            bl3 = false;
                            if (!bl13) continue block6;
                            f.f.a.e.e.a a7 = (f.f.a.e.e.a)iterator4.next();
                            bl3 = false;
                            if (a6 == null || a6.l() == null) continue;
                            bl3 = false;
                            if (a7 == null) continue;
                            boolean bl14 = a7.e().equals((Object)a6.l().e());
                            bl3 = false;
                            if (!bl14) continue;
                            boolean bl15 = a7.L0().equals((Object)a6.l().L0());
                            bl3 = false;
                            if (!bl15) continue;
                            arrayList.add((Object)a6);
                        } while (true);
                        break;
                    } while (true);
                    int n6 = arrayList.size();
                    bl3 = false;
                    if (n6 <= 0) break block24;
                }
                catch (Exception exception) {
                    if (!f.f.a.a.a) return bl3;
                    exception.printStackTrace();
                    return bl3;
                }
            }
            bl3 = true;
        }
        if (!bl3) return bl3;
        if (this.d == null) {
            this.d = new HashMap();
        } else if (this.d.containsKey((Object)string2)) {
            this.d.remove((Object)string2);
        }
        if (this.f == null) {
            this.f = new HashMap();
        } else if (this.f.containsKey((Object)string2)) {
            this.f.remove((Object)string2);
        }
        if (this.e == null) {
            this.e = new HashMap();
        } else if (this.e.containsKey((Object)string2)) {
            this.e.remove((Object)string2);
        }
        if (list2 == null) return bl3;
        if (list2.size() <= 0) return bl3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator iterator = list2.iterator();
        do {
            if (!iterator.hasNext()) {
                this.d.put((Object)string2, (Object)arrayList);
                this.e.put((Object)string2, (Object)arrayList2);
                this.f.put((Object)string2, (Object)arrayList3);
                return bl3;
            }
            a a8 = (a)iterator.next();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            f.f.a.e.e.a a9 = a8.l();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a9.e());
            stringBuilder.append(a9.d1());
            stringBuilder.append(a9.x());
            concurrentHashMap.put((Object)stringBuilder.toString(), (Object)a8);
            arrayList.add((Object)concurrentHashMap);
            arrayList2.add((Object)a9);
            arrayList3.add((Object)a8);
        } while (true);
    }

    public final List<a> b(String string2) {
        Map<String, List<a>> map = this.f;
        if (map != null && map.containsKey((Object)string2)) {
            return (List)this.f.get((Object)string2);
        }
        return null;
    }

    public void c(String string2) {
        m m2 = c.super.d(string2);
        if (m2 != null) {
            m2.a();
        }
    }
}

