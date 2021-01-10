/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  i.k.b.h.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.lang.Void
 *  java.util.ListIterator
 *  java.util.NoSuchElementException
 */
package i.i;

import i.k.b.h.a;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class r
implements ListIterator,
a {
    public static final r b = new r();

    private r() {
    }

    public /* synthetic */ void add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public Void next() {
        throw new NoSuchElementException();
    }

    public int nextIndex() {
        return 0;
    }

    public Void previous() {
        throw new NoSuchElementException();
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

