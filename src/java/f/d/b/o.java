/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.l
 *  f.d.b.y.h
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package f.d.b;

import f.d.b.l;
import f.d.b.n;
import f.d.b.y.h;
import java.util.Map;
import java.util.Set;

public final class o
extends l {
    private final h<String, l> a = new h();

    public void a(String string, l l2) {
        h<String, l> h2 = this.a;
        if (l2 == null) {
            l2 = n.a;
        }
        h2.put((Object)string, (Object)l2);
    }

    public boolean equals(Object object) {
        return object == this || object instanceof o && ((o)object).a.equals(this.a);
        {
        }
    }

    public Set<Map.Entry<String, l>> h() {
        return this.a.entrySet();
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

