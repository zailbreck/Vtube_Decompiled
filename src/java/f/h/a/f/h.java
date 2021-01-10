/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package f.h.a.f;

import f.h.a.d;
import f.h.a.f.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class h {
    public static Map<String, Object> a(f f2) {
        d d2 = f2.a();
        if (d2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"sql", (Object)d2.c());
            hashMap.put((Object)"arguments", d2.b());
            return hashMap;
        }
        return null;
    }
}

