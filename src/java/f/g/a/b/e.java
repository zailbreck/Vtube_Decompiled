/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.regex.Pattern
 */
package f.g.a.b;

import f.g.a.b.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class e {
    public String a;
    public Pattern b;
    public List<f> c = new ArrayList();
    public List<String> d = new ArrayList();
    public List<String> e = new ArrayList();
    public List<String> f = new ArrayList();
    public List<String> g = new ArrayList();
    public List<String> h = new ArrayList();

    public e(String string2, Boolean bl, List<f> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6) {
        this.a = string2;
        this.b = Pattern.compile((String)this.a);
        if (list == null) {
            list = this.c;
        }
        this.c = list;
        boolean bl2 = bl != null ? bl : false;
        Boolean.valueOf((boolean)bl2);
        if (list2 == null) {
            list2 = this.d;
        }
        this.d = list2;
        if (list3 == null) {
            list3 = this.e;
        }
        this.e = list3;
        boolean bl3 = !this.d.isEmpty() && !this.e.isEmpty();
        if (!bl3) {
            if (list4 == null) {
                list4 = this.f;
            }
            this.f = list4;
            if (this.f.size() <= 2) {
                if (list5 == null) {
                    list5 = this.g;
                }
                this.g = list5;
                if (list6 == null) {
                    list6 = this.h;
                }
                this.h = list6;
                boolean bl4 = this.g.isEmpty();
                boolean bl5 = false;
                if (!bl4) {
                    boolean bl6 = this.h.isEmpty();
                    bl5 = false;
                    if (!bl6) {
                        bl5 = true;
                    }
                }
                if (!bl5) {
                    return;
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    public static e a(Map<String, Object> map) {
        String string2 = (String)map.get((Object)"url-filter");
        Boolean bl = (Boolean)map.get((Object)"url-filter-is-case-sensitive");
        List list = (List)map.get((Object)"resource-type");
        ArrayList arrayList = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)f.a((String)iterator.next()));
        }
        List list2 = (List)map.get((Object)"if-domain");
        List list3 = (List)map.get((Object)"unless-domain");
        List list4 = (List)map.get((Object)"load-type");
        List list5 = (List)map.get((Object)"if-top-url");
        List list6 = (List)map.get((Object)"unless-top-url");
        e e2 = new e(string2, bl, (List<f>)arrayList, (List<String>)list2, (List<String>)list3, (List<String>)list4, (List<String>)list5, (List<String>)list6);
        return e2;
    }
}

