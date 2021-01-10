/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  i.k.b.h.a
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 */
package i.i;

import i.k.b.h.a;
import java.util.Iterator;

public abstract class t
implements Iterator<Integer>,
a {
    public abstract int a();

    public final Integer next() {
        return this.a();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

