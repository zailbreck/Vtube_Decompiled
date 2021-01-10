/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.concurrent.atomic.AtomicInteger
 */
package h.b.r.d;

import h.b.r.c.b;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a<T>
extends AtomicInteger
implements b<T> {
    @Override
    public final boolean a(T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}

