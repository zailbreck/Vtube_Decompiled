/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  i.k.b.d
 *  i.k.b.h.a
 *  i.m.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 */
package i.m;

import i.k.b.d;
import java.util.Iterator;

public final class h<T, R>
implements i.m.a<R> {
    private final i.m.a<T> a;
    private final i.k.a.a<T, R> b;

    public h(i.m.a<? extends T> a2, i.k.a.a<? super T, ? extends R> a3) {
        d.c(a2, (String)"sequence");
        d.c(a3, (String)"transformer");
        this.a = a2;
        this.b = a3;
    }

    public Iterator<R> iterator() {
        return new Iterator<R>(){
            private final Iterator<T> b;
            {
                this.b = h2.a.iterator();
            }

            public boolean hasNext() {
                return this.b.hasNext();
            }

            public R next() {
                return this.b.a(this.b.next());
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }

}

