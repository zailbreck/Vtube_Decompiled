/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.atomic.AtomicLong
 */
package h.b.r.g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class e
extends AtomicLong
implements ThreadFactory {
    final String b;
    final int c;

    public e(String string2) {
        super(string2, 5);
    }

    public e(String string2, int n2) {
        this.b = string2;
        this.c = n2;
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder(this.b);
        stringBuilder.append('-');
        stringBuilder.append(this.incrementAndGet());
        Thread thread = new Thread(runnable, stringBuilder.toString());
        thread.setPriority(this.c);
        thread.setDaemon(true);
        return thread;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RxThreadFactory[");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

