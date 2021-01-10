/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package f.g.a.c;

import java.util.HashMap;
import java.util.Map;

public class a {
    public Long a;
    public String b;
    public String c;
    public Long d;

    public a(Long l2, String string2, String string3, Long l3) {
        this.a = l2;
        this.b = string2;
        this.c = string3;
        this.d = l3;
    }

    public Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"username", (Object)this.b);
        hashMap.put((Object)"password", (Object)this.c);
        return hashMap;
    }
}

