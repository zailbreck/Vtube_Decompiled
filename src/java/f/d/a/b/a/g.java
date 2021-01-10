/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.util.Locale
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.atomic.AtomicLong
 */
package f.d.a.b.a;

import f.d.a.a.b;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class g {
    private String a = null;
    private Boolean b = null;
    private Integer c = null;
    private Thread.UncaughtExceptionHandler d = null;
    private ThreadFactory e = null;

    private static ThreadFactory a(g g2) {
        final String string = g2.a;
        final Boolean bl = g2.b;
        final Integer n2 = g2.c;
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = g2.d;
        ThreadFactory threadFactory = g2.e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        final ThreadFactory threadFactory2 = threadFactory;
        AtomicLong atomicLong = string != null ? new AtomicLong(0L) : null;
        final AtomicLong atomicLong2 = atomicLong;
        ThreadFactory threadFactory3 = new ThreadFactory(){

            public Thread newThread(Runnable runnable) {
                Boolean bl2;
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2;
                Integer n22;
                Thread thread = threadFactory2.newThread(runnable);
                String string2 = string;
                if (string2 != null) {
                    Object[] arrobject = new Object[]{atomicLong2.getAndIncrement()};
                    thread.setName(g.b(string2, arrobject));
                }
                if ((bl2 = bl) != null) {
                    thread.setDaemon(bl2.booleanValue());
                }
                if ((n22 = n2) != null) {
                    thread.setPriority(n22.intValue());
                }
                if ((uncaughtExceptionHandler2 = uncaughtExceptionHandler) != null) {
                    thread.setUncaughtExceptionHandler(uncaughtExceptionHandler2);
                }
                return thread;
            }
        };
        return threadFactory3;
    }

    private static /* varargs */ String b(String string, Object ... arrobject) {
        return String.format((Locale)Locale.ROOT, (String)string, (Object[])arrobject);
    }

    public g a(int n2) {
        boolean bl = n2 >= 1;
        b.a(bl, "Thread priority (%s) must be >= %s", n2, 1);
        boolean bl2 = false;
        if (n2 <= 10) {
            bl2 = true;
        }
        b.a(bl2, "Thread priority (%s) must be <= %s", n2, 10);
        this.c = n2;
        return this;
    }

    public g a(String string) {
        Object[] arrobject = new Object[]{0};
        g.b(string, arrobject);
        this.a = string;
        return this;
    }

    public ThreadFactory a() {
        return g.a(this);
    }

}

