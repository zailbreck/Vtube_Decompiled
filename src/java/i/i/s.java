/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  i.k.b.a
 *  i.k.b.d
 *  i.k.b.h.a
 *  java.io.Serializable
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.lang.Void
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.RandomAccess
 */
package i.i;

import i.i.r;
import i.k.b.a;
import i.k.b.d;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class s
implements List,
Serializable,
RandomAccess,
i.k.b.h.a {
    public static final s b = new s();

    private s() {
    }

    public int a() {
        return 0;
    }

    public boolean a(Void void_) {
        d.c((Object)void_, (String)"element");
        return false;
    }

    public /* synthetic */ void add(int n2, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int n2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b(Void void_) {
        d.c((Object)void_, (String)"element");
        return -1;
    }

    public int c(Void void_) {
        d.c((Object)void_, (String)"element");
        return -1;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsAll(Collection collection) {
        d.c((Object)collection, (String)"elements");
        return collection.isEmpty();
    }

    public boolean equals(Object object) {
        return object instanceof List && ((List)object).isEmpty();
    }

    public Void get(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Empty list doesn't contain element at index ");
        stringBuilder.append(n2);
        stringBuilder.append('.');
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public int hashCode() {
        return 1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return r.b;
    }

    public ListIterator listIterator() {
        return r.b;
    }

    public ListIterator listIterator(int n2) {
        if (n2 == 0) {
            return r.b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index: ");
        stringBuilder.append(n2);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public /* synthetic */ Object remove(int n2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int n2, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int n2, int n3) {
        if (n2 == 0 && n3 == 0) {
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fromIndex: ");
        stringBuilder.append(n2);
        stringBuilder.append(", toIndex: ");
        stringBuilder.append(n3);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public Object[] toArray() {
        return a.a((Collection)this);
    }

    public <T> T[] toArray(T[] arrT) {
        return a.a((Collection)this, (Object[])arrT);
    }

    public String toString() {
        return "[]";
    }
}

