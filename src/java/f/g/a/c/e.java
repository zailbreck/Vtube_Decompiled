/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package f.g.a.c;

import java.util.HashMap;
import java.util.Map;

public class e {
    public Long a;
    public String b;
    public String c;
    public String d;
    public Integer e;

    public e(Long l2, String string2, String string3, String string4, Integer n2) {
        this.a = l2;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = n2;
    }

    public Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"host", (Object)this.b);
        hashMap.put((Object)"protocol", (Object)this.c);
        hashMap.put((Object)"realm", (Object)this.d);
        hashMap.put((Object)"port", (Object)this.e);
        return hashMap;
    }
}

