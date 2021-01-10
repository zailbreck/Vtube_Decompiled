/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package f.g.a.b;

import f.g.a.b.c;
import java.util.Map;

public class b {
    c a;
    String b;

    b(c c2, String string2) {
        this.a = c2;
        this.a.equals((Object)c.d);
        this.b = string2;
    }

    public static b a(Map<String, Object> map) {
        return new b(c.a((String)map.get((Object)"type")), (String)map.get((Object)"selector"));
    }
}

