/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 *  java.util.Map
 *  java.util.TreeMap
 */
package f.f.a.e.b.h.i;

import f.f.a.e.b.h.e.b;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class a {
    public final int a;
    public final byte[] b;
    public final List<b> c;

    public a(int n2, byte[] arrby, List<b> list) {
        super(n2, arrby, a.a(list), list);
    }

    private a(int n2, byte[] arrby, Map<String, String> map, List<b> list) {
        this.a = n2;
        this.b = arrby;
        List list2 = list == null ? null : Collections.unmodifiableList(list);
        this.c = list2;
    }

    private static Map<String, String> a(List<b> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (b b2 : list) {
            treeMap.put((Object)b2.a(), (Object)b2.b());
        }
        return treeMap;
    }
}

