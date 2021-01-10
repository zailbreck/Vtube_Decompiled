/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.l
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package f.d.b;

import f.d.b.l;
import f.d.b.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i
extends l
implements Iterable<l> {
    private final List<l> b = new ArrayList();

    public void a(l l2) {
        if (l2 == null) {
            l2 = n.a;
        }
        this.b.add((Object)l2);
    }

    public boolean equals(Object object) {
        return object == this || object instanceof i && ((i)object).b.equals(this.b);
        {
        }
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public Iterator<l> iterator() {
        return this.b.iterator();
    }
}

