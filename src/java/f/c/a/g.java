/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package f.c.a;

import java.util.HashMap;
import java.util.Map;

final class g {
    private final Map<String, Integer> a = new HashMap();
    private final Map<String, String> b = new HashMap();

    g() {
    }

    int a(String string, int n2) {
        Integer n3;
        if (this.a.containsKey((Object)string) && (n3 = (Integer)this.a.get((Object)string)) != null) {
            n2 = n3;
        }
        return n2;
    }

    void a(String string, Integer n2) {
        this.a.put((Object)string, (Object)n2);
    }

    void a(String string, String string2) {
        this.b.put((Object)string, (Object)string2);
    }
}

