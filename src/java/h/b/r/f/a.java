/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicLong
 *  java.util.concurrent.atomic.AtomicReferenceArray
 */
package h.b.r.f;

import h.b.r.c.d;
import h.b.r.h.c;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class a<T>
implements d<T> {
    static final int j = Integer.getInteger((String)"jctools.spsc.max.lookahead.step", (int)4096);
    private static final Object k = new Object();
    final AtomicLong b = new AtomicLong();
    int c;
    long d;
    final int e;
    AtomicReferenceArray<Object> f;
    final int g;
    AtomicReferenceArray<Object> h;
    final AtomicLong i = new AtomicLong();

    public a(int n2) {
        AtomicReferenceArray atomicReferenceArray;
        int n3 = c.a(Math.max((int)8, (int)n2));
        int n4 = n3 - 1;
        this.f = atomicReferenceArray = new AtomicReferenceArray(n3 + 1);
        this.e = n4;
        a.super.a(n3);
        this.h = atomicReferenceArray;
        this.g = n4;
        this.d = n4 - 1;
        a.super.b(0L);
    }

    private static int a(long l2, int n2) {
        int n3 = n2 & (int)l2;
        a.b(n3);
        return n3;
    }

    private long a() {
        return this.i.get();
    }

    private static <E> Object a(AtomicReferenceArray<Object> atomicReferenceArray, int n2) {
        return atomicReferenceArray.get(n2);
    }

    private T a(AtomicReferenceArray<Object> atomicReferenceArray, long l2, int n2) {
        this.h = atomicReferenceArray;
        int n3 = a.a(l2, n2);
        Object object = a.a(atomicReferenceArray, n3);
        if (object != null) {
            a.a(atomicReferenceArray, n3, null);
            a.super.a(l2 + 1L);
        }
        return (T)object;
    }

    private AtomicReferenceArray<Object> a(AtomicReferenceArray<Object> atomicReferenceArray) {
        int n2 = -1 + atomicReferenceArray.length();
        a.b(n2);
        return (AtomicReferenceArray)a.a(atomicReferenceArray, n2);
    }

    private void a(int n2) {
        this.c = Math.min((int)(n2 / 4), (int)j);
    }

    private void a(long l2) {
        this.i.lazySet(l2);
    }

    private static void a(AtomicReferenceArray<Object> atomicReferenceArray, int n2, Object object) {
        atomicReferenceArray.lazySet(n2, object);
    }

    private void a(AtomicReferenceArray<Object> atomicReferenceArray, long l2, int n2, T t2, long l3) {
        AtomicReferenceArray atomicReferenceArray2;
        this.f = atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.d = l3 + l2 - 1L;
        a.a((AtomicReferenceArray<Object>)atomicReferenceArray2, n2, t2);
        this.a(atomicReferenceArray, (AtomicReferenceArray<Object>)atomicReferenceArray2);
        a.a(atomicReferenceArray, n2, k);
        this.b(l2 + 1L);
    }

    private void a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        int n2 = -1 + atomicReferenceArray.length();
        a.b(n2);
        a.a(atomicReferenceArray, n2, atomicReferenceArray2);
    }

    private boolean a(AtomicReferenceArray<Object> atomicReferenceArray, T t2, long l2, int n2) {
        a.a(atomicReferenceArray, n2, t2);
        a.super.b(l2 + 1L);
        return true;
    }

    private static int b(int n2) {
        return n2;
    }

    private void b(long l2) {
        this.b.lazySet(l2);
    }

    private long c() {
        return this.b.get();
    }

    private long d() {
        return this.i.get();
    }

    private long e() {
        return this.b.get();
    }

    @Override
    public boolean a(T t2) {
        if (t2 != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f;
            long l2 = a.super.c();
            int n2 = this.e;
            int n3 = a.a(l2, n2);
            if (l2 < this.d) {
                return a.super.a(atomicReferenceArray, t2, l2, n3);
            }
            long l3 = l2 + (long)this.c;
            if (a.a(atomicReferenceArray, a.a(l3, n2)) == null) {
                this.d = l3 - 1L;
                return a.super.a(atomicReferenceArray, t2, l2, n3);
            }
            if (a.a(atomicReferenceArray, a.a(1L + l2, n2)) == null) {
                return a.super.a(atomicReferenceArray, t2, l2, n3);
            }
            a.super.a(atomicReferenceArray, l2, n3, t2, n2);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override
    public T b() {
        int n2;
        AtomicReferenceArray<Object> atomicReferenceArray = this.h;
        long l2 = this.a();
        int n3 = a.a(l2, n2 = this.g);
        Object object = a.a(atomicReferenceArray, n3);
        boolean bl = object == k;
        if (object != null && !bl) {
            a.a(atomicReferenceArray, n3, null);
            this.a(l2 + 1L);
            return (T)object;
        }
        if (bl) {
            return this.a(this.a(atomicReferenceArray), l2, n2);
        }
        return null;
    }

    @Override
    public void clear() {
        while (this.b() != null || !this.isEmpty()) {
        }
    }

    @Override
    public boolean isEmpty() {
        return this.e() == this.d();
    }
}

