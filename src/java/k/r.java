/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.Flushable
 *  java.lang.Object
 */
package k;

import java.io.Closeable;
import java.io.Flushable;
import k.c;
import k.t;

public interface r
extends Closeable,
Flushable {
    public void b(c var1, long var2);

    public void close();

    public t d();

    public void flush();
}

