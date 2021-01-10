/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.a.a.b
 *  f.d.a.b.a.a$a
 *  f.d.a.b.a.a$b
 *  f.d.a.b.a.a$c
 *  f.d.a.b.a.a$d
 *  f.d.a.b.a.a$e
 *  f.d.a.b.a.a$g
 *  f.d.a.b.a.a$l
 *  f.d.a.b.a.e
 *  f.d.a.b.a.i.a
 *  f.d.a.b.a.i.b
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Locale
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.Future
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 *  java.util.concurrent.locks.LockSupport
 *  java.util.logging.Level
 *  java.util.logging.Logger
 *  sun.misc.Unsafe
 */
package f.d.a.b.a;

import f.d.a.b.a.a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/*
 * Exception performing whole class analysis.
 */
public abstract class a<V>
extends f.d.a.b.a.i.a
implements f.d.a.b.a.e<V> {
    private static final boolean e;
    private static final Logger f;
    private static final b g;
    private static final Object h;
    private volatile Object b;
    private volatile e c;
    private volatile l d;

    static {
        Throwable throwable;
        Throwable throwable2;
        b b2;
        e = Boolean.parseBoolean((String)System.getProperty((String)"guava.concurrent.generate_cancellation_cause", (String)"false"));
        f = Logger.getLogger((String)a.class.getName());
        try {
            b2 = new k(null);
            throwable = null;
            throwable2 = null;
        }
        catch (Throwable throwable3) {
            try {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, (String)"a");
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, (String)"b");
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = AtomicReferenceFieldUpdater.newUpdater(a.class, l.class, (String)"d");
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, (String)"c");
                f f2 = new f((AtomicReferenceFieldUpdater<l, Thread>)atomicReferenceFieldUpdater, (AtomicReferenceFieldUpdater<l, l>)atomicReferenceFieldUpdater2, (AtomicReferenceFieldUpdater<a, l>)atomicReferenceFieldUpdater3, (AtomicReferenceFieldUpdater<a, e>)atomicReferenceFieldUpdater4, (AtomicReferenceFieldUpdater<a, Object>)AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, (String)"b"));
                throwable = throwable3;
                b2 = f2;
                throwable2 = null;
            }
            catch (Throwable throwable4) {
                h h2 = new h(null);
                throwable2 = throwable4;
                throwable = throwable3;
                b2 = h2;
            }
        }
        g = b2;
        if (throwable2 != null) {
            f.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", throwable);
            f.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable2);
        }
        h = new Object();
    }

    protected a() {
    }

    private e a(e e2) {
        e e3;
        while (!g.a((a)this, e3 = this.c, e.d)) {
        }
        e e4 = e2;
        e e5 = e3;
        while (e5 != null) {
            e e6 = e5.c;
            e5.c = e4;
            e4 = e5;
            e5 = e6;
        }
        return e4;
    }

    static /* synthetic */ Object a(f.d.a.b.a.e e2) {
        return a.b(e2);
    }

    /*
     * Exception decompiling
     */
    private static <V> V a(Future<V> var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl3 : FAKE_TRY : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    private static CancellationException a(String string, Throwable throwable) {
        CancellationException cancellationException = new CancellationException(string);
        cancellationException.initCause(throwable);
        return cancellationException;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(l var1) {
        var1.a = null;
        block0 : do {
            if ((var2_3 = this.d) == l.c) {
                return;
            }
            var3_4 = null;
            while (var2_3 != null) {
                var4_2 = var2_3.b;
                if (var2_3.a != null) {
                    var3_4 = var2_3;
                } else if (var3_4 != null) {
                    var3_4.b = var4_2;
                    if (var3_4.a == null) {
                        continue block0;
                    }
                } else {
                    if (a.g.a((a)this, var2_3, var4_2)) ** break;
                    continue block0;
                }
                var2_3 = var4_2;
            }
            return;
            break;
        } while (true);
    }

    /*
     * Exception decompiling
     */
    private void a(StringBuilder var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl47 : ALOAD_1 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    private static Object b(f.d.a.b.a.e<?> e2) {
        Object object;
        block15 : {
            Throwable throwable;
            if (e2 instanceof i) {
                Object object2 = ((a)e2).b;
                if (object2 instanceof c) {
                    c c2 = object2;
                    if (c2.a) {
                        Throwable throwable2 = c2.b;
                        if (throwable2 != null) {
                            return new /* Unavailable Anonymous Inner Class!! */;
                        }
                        object2 = c.d;
                    }
                }
                return object2;
            }
            if (e2 instanceof f.d.a.b.a.i.a && (throwable = f.d.a.b.a.i.b.a((f.d.a.b.a.i.a)((f.d.a.b.a.i.a)e2))) != null) {
                return new /* Unavailable Anonymous Inner Class!! */;
            }
            boolean bl = e2.isCancelled();
            if (bl & (true ^ e)) {
                return c.d;
            }
            object = a.a(e2);
            if (!bl) break block15;
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                stringBuilder.append(e2);
                return new /* Unavailable Anonymous Inner Class!! */;
            }
            catch (Throwable throwable3) {
                return new /* Unavailable Anonymous Inner Class!! */;
            }
            catch (CancellationException cancellationException) {
                if (!bl) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                    stringBuilder.append(e2);
                    return new /* Unavailable Anonymous Inner Class!! */;
                }
                return new /* Unavailable Anonymous Inner Class!! */;
            }
            catch (ExecutionException executionException) {
                if (bl) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    stringBuilder.append(e2);
                    return new /* Unavailable Anonymous Inner Class!! */;
                }
                return new /* Unavailable Anonymous Inner Class!! */;
            }
        }
        if (object == null) {
            object = h;
        }
        return object;
    }

    private V b(Object object) {
        if (!(object instanceof c)) {
            if (!(object instanceof d)) {
                if (object == h) {
                    object = null;
                }
                return (V)object;
            }
            throw new ExecutionException((object).a);
        }
        throw a.a("Task was cancelled.", (object).b);
    }

    static /* synthetic */ void b(a a2) {
        a.e(a2);
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
            return;
        }
        catch (RuntimeException runtimeException) {
            Logger logger = f;
            Level level = Level.SEVERE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RuntimeException while executing runnable ");
            stringBuilder.append((Object)runnable);
            stringBuilder.append(" with executor ");
            stringBuilder.append((Object)executor);
            logger.log(level, stringBuilder.toString(), (Throwable)runtimeException);
            return;
        }
    }

    private String c(Object object) {
        if (object == this) {
            return "this future";
        }
        return String.valueOf((Object)object);
    }

    static /* synthetic */ b e() {
        return g;
    }

    private static void e(a<?> a2) {
        e e2 = null;
        block0 : do {
            a.super.g();
            a2.b();
            e e3 = a.super.a(e2);
            while (e3 != null) {
                e2 = e3.c;
                Runnable runnable = e3.a;
                if (runnable instanceof g) {
                    Object object;
                    g g2 = runnable;
                    a2 = g2.b;
                    if (a2.b == g2 && g.a(a2, (Object)g2, object = a.b(g2.c))) {
                        continue block0;
                    }
                } else {
                    a.b(runnable, e3.b);
                }
                e3 = e2;
            }
            break;
        } while (true);
    }

    static /* synthetic */ boolean f() {
        return e;
    }

    private void g() {
        l l2;
        while (!g.a(this, l2 = this.d, l.c)) {
        }
        while (l2 != null) {
            l2.a();
            l2 = l2.b;
        }
    }

    protected final Throwable a() {
        Object object;
        if (this instanceof i && (object = this.b) instanceof d) {
            return (object).a;
        }
        return null;
    }

    public void a(Runnable runnable, Executor executor) {
        e e2;
        f.d.a.a.b.a((Object)runnable, (Object)"Runnable was null.");
        f.d.a.a.b.a((Object)executor, (Object)"Executor was null.");
        if (!this.isDone() && (e2 = this.c) != e.d) {
            e e3 = new /* Unavailable Anonymous Inner Class!! */;
            do {
                e3.c = e2;
                if (!g.a((a)this, e2, e3)) continue;
                return;
            } while ((e2 = this.c) != e.d);
        }
        a.b(runnable, executor);
    }

    protected boolean a(V object) {
        if (object == null) {
            object = h;
        }
        if (g.a((a)this, null, object)) {
            a.e(this);
            return true;
        }
        return false;
    }

    protected boolean a(Throwable throwable) {
        f.d.a.a.b.a((Object)throwable);
        d d2 = new /* Unavailable Anonymous Inner Class!! */;
        if (g.a((a)this, null, (Object)d2)) {
            a.e(this);
            return true;
        }
        return false;
    }

    protected void b() {
    }

    protected void c() {
    }

    public boolean cancel(boolean bl) {
        boolean bl2;
        block6 : {
            Object object = this.b;
            bl2 = true;
            boolean bl3 = object == null;
            if (bl3 | object instanceof g) {
                c c2 = e ? new /* Unavailable Anonymous Inner Class!! */ : (bl ? c.c : c.d);
                boolean bl4 = false;
                Object object2 = object;
                a a2 = this;
                do {
                    if (g.a(a2, object2, (Object)c2)) {
                        if (bl) {
                            a2.c();
                        }
                        a.e(a2);
                        if (!(object2 instanceof g)) break block6;
                        f.d.a.b.a.e e2 = (object2).c;
                        if (e2 instanceof i) {
                            a2 = (a)e2;
                            object2 = a2.b;
                            boolean bl5 = object2 == null;
                            if (bl5 | object2 instanceof g) {
                                bl4 = true;
                                continue;
                            }
                            break block6;
                        }
                        e2.cancel(bl);
                        return bl2;
                    }
                    object2 = a2.b;
                    if (!(object2 instanceof g)) break;
                } while (true);
                return bl4;
            }
            bl2 = false;
        }
        return bl2;
    }

    protected String d() {
        Object object = this.b;
        if (object instanceof g) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setFuture=[");
            stringBuilder.append(this.c((Object)(object).c));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        if (this instanceof ScheduledFuture) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("remaining delay=[");
            stringBuilder.append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
            stringBuilder.append(" ms]");
            return stringBuilder.toString();
        }
        return null;
    }

    public V get() {
        InterruptedException interruptedException;
        if (!Thread.interrupted()) {
            Object object = this.b;
            boolean bl = object != null;
            if (bl & (true ^ object instanceof g)) {
                return this.b(object);
            }
            l l2 = this.d;
            if (l2 != l.c) {
                l l3 = new /* Unavailable Anonymous Inner Class!! */;
                do {
                    block5 : {
                        Object object2;
                        boolean bl2;
                        l3.a(l2);
                        if (!g.a(this, l2, l3)) continue;
                        do {
                            LockSupport.park((Object)((Object)this));
                            if (Thread.interrupted()) break block5;
                        } while (!((bl2 = (object2 = this.b) != null) & (true ^ object2 instanceof g)));
                        return this.b(object2);
                    }
                    this.a(l3);
                    throw new InterruptedException();
                } while ((l2 = this.d) != l.c);
            }
            return this.b(this.b);
        }
        interruptedException = new InterruptedException();
        throw interruptedException;
    }

    public V get(long l2, TimeUnit timeUnit) {
        InterruptedException interruptedException;
        long l3 = timeUnit.toNanos(l2);
        if (!Thread.interrupted()) {
            long l4;
            block15 : {
                Object object = this.b;
                boolean bl = object != null;
                if (bl & (true ^ object instanceof g)) {
                    return a.super.b(object);
                }
                l4 = l3 > 0L ? l3 + System.nanoTime() : 0L;
                if (l3 >= 1000L) {
                    l l5 = this.d;
                    if (l5 != l.c) {
                        l l6 = new /* Unavailable Anonymous Inner Class!! */;
                        do {
                            block14 : {
                                l6.a(l5);
                                if (!g.a((a)this, l5, l6)) continue;
                                do {
                                    LockSupport.parkNanos((Object)this, (long)l3);
                                    if (Thread.interrupted()) break block14;
                                    Object object2 = this.b;
                                    boolean bl2 = object2 != null;
                                    if (!(bl2 & (true ^ object2 instanceof g))) continue;
                                    return a.super.b(object2);
                                } while ((l3 = l4 - System.nanoTime()) >= 1000L);
                                a.super.a(l6);
                                break block15;
                            }
                            a.super.a(l6);
                            throw new InterruptedException();
                        } while ((l5 = this.d) != l.c);
                    }
                    return a.super.b(this.b);
                }
            }
            while (l3 > 0L) {
                Object object = this.b;
                boolean bl = object != null;
                if (bl & (true ^ object instanceof g)) {
                    return a.super.b(object);
                }
                if (!Thread.interrupted()) {
                    l3 = l4 - System.nanoTime();
                    continue;
                }
                throw new InterruptedException();
            }
            String string = this.toString();
            String string2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Waited ");
            stringBuilder.append(l2);
            stringBuilder.append(" ");
            stringBuilder.append(timeUnit.toString().toLowerCase(Locale.ROOT));
            String string3 = stringBuilder.toString();
            if (l3 + 1000L < 0L) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string3);
                stringBuilder2.append(" (plus ");
                String string4 = stringBuilder2.toString();
                long l7 = -l3;
                long l8 = timeUnit.convert(l7, TimeUnit.NANOSECONDS);
                long l9 = l7 - timeUnit.toNanos(l8);
                boolean bl = l8 == 0L || l9 > 1000L;
                if (l8 > 0L) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(string4);
                    stringBuilder3.append(l8);
                    stringBuilder3.append(" ");
                    stringBuilder3.append(string2);
                    String string5 = stringBuilder3.toString();
                    if (bl) {
                        StringBuilder stringBuilder4 = new StringBuilder();
                        stringBuilder4.append(string5);
                        stringBuilder4.append(",");
                        string5 = stringBuilder4.toString();
                    }
                    StringBuilder stringBuilder5 = new StringBuilder();
                    stringBuilder5.append(string5);
                    stringBuilder5.append(" ");
                    string4 = stringBuilder5.toString();
                }
                if (bl) {
                    StringBuilder stringBuilder6 = new StringBuilder();
                    stringBuilder6.append(string4);
                    stringBuilder6.append(l9);
                    stringBuilder6.append(" nanoseconds ");
                    string4 = stringBuilder6.toString();
                }
                StringBuilder stringBuilder7 = new StringBuilder();
                stringBuilder7.append(string4);
                stringBuilder7.append("delay)");
                string3 = stringBuilder7.toString();
            }
            if (this.isDone()) {
                StringBuilder stringBuilder8 = new StringBuilder();
                stringBuilder8.append(string3);
                stringBuilder8.append(" but future completed as timeout expired");
                throw new TimeoutException(stringBuilder8.toString());
            }
            StringBuilder stringBuilder9 = new StringBuilder();
            stringBuilder9.append(string3);
            stringBuilder9.append(" for ");
            stringBuilder9.append(string);
            throw new TimeoutException(stringBuilder9.toString());
        }
        interruptedException = new InterruptedException();
        throw interruptedException;
    }

    public boolean isCancelled() {
        return this.b instanceof c;
    }

    public boolean isDone() {
        Object object = this.b;
        boolean bl = object != null;
        return bl & (true ^ object instanceof g);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public String toString() {
        block6 : {
            var1_1 = new StringBuilder();
            var1_1.append(Object.super.toString());
            var1_1.append("[status=");
            if (!this.isCancelled()) break block6;
            var9_2 = "CANCELLED";
            ** GOTO lbl26
        }
        if (this.isDone()) ** GOTO lbl-1000
        try {
            var8_3 = this.d();
        }
        catch (RuntimeException var4_4) {
            var5_5 = new StringBuilder();
            var5_5.append("Exception thrown from implementation: ");
            var5_5.append((Object)var4_4.getClass());
            var8_3 = var5_5.toString();
        }
        if (var8_3 != null && !var8_3.isEmpty()) {
            var1_1.append("PENDING, info=[");
            var1_1.append(var8_3);
            var1_1.append("]");
        } else if (this.isDone()) lbl-1000: // 2 sources:
        {
            this.a(var1_1);
        } else {
            var9_2 = "PENDING";
lbl26: // 2 sources:
            var1_1.append(var9_2);
        }
        var1_1.append("]");
        return var1_1.toString();
    }

    private static final class f
    extends b {
        final AtomicReferenceFieldUpdater<l, Thread> a;
        final AtomicReferenceFieldUpdater<l, l> b;
        final AtomicReferenceFieldUpdater<a, l> c;
        final AtomicReferenceFieldUpdater<a, e> d;
        final AtomicReferenceFieldUpdater<a, Object> e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        void a(l l2, l l3) {
            this.b.lazySet((Object)l2, (Object)l3);
        }

        void a(l l2, Thread thread) {
            this.a.lazySet((Object)l2, (Object)thread);
        }

        boolean a(a<?> a2, e e2, e e3) {
            return this.d.compareAndSet(a2, (Object)e2, (Object)e3);
        }

        boolean a(a<?> a2, l l2, l l3) {
            return this.c.compareAndSet(a2, (Object)l2, (Object)l3);
        }

        boolean a(a<?> a2, Object object, Object object2) {
            return this.e.compareAndSet(a2, object, object2);
        }
    }

    private static final class h
    extends b {
        private h() {
            super(null);
        }

        /* synthetic */ h(a a2) {
        }

        void a(l l2, l l3) {
            l2.b = l3;
        }

        void a(l l2, Thread thread) {
            l2.a = thread;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        boolean a(a<?> a2, e e2, e e3) {
            a<?> a3 = a2;
            synchronized (a3) {
                if (a2.c == e2) {
                    a2.c = e3;
                    return true;
                }
                return false;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        boolean a(a<?> a2, l l2, l l3) {
            a<?> a3 = a2;
            synchronized (a3) {
                if (a2.d == l2) {
                    a2.d = l3;
                    return true;
                }
                return false;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        boolean a(a<?> a2, Object object, Object object2) {
            a<?> a3 = a2;
            synchronized (a3) {
                if (a2.b == object) {
                    a2.b = object2;
                    return true;
                }
                return false;
            }
        }
    }

    static interface i<V>
    extends f.d.a.b.a.e<V> {
    }

    private static final class k
    extends b {
        static final Unsafe a;
        static final long b;
        static final long c;
        static final long d;
        static final long e;
        static final long f;

        /*
         * Exception decompiling
         */
        static {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl10 : FAKE_TRY : trying to set 1 previously set to 0
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
            // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
            // org.benf.cfr.reader.b.a(Driver.java:128)
            // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
            // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
            // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
            // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
            // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
            // java.lang.Thread.run(Thread.java:761)
            throw new IllegalStateException("Decompilation failed");
        }

        private k() {
            super(null);
        }

        /* synthetic */ k(a a2) {
        }

        void a(l l2, l l3) {
            a.putObject((Object)l2, f, (Object)l3);
        }

        void a(l l2, Thread thread) {
            a.putObject((Object)l2, e, (Object)thread);
        }

        boolean a(a<?> a2, e e2, e e3) {
            return a.compareAndSwapObject(a2, b, (Object)e2, (Object)e3);
        }

        boolean a(a<?> a2, l l2, l l3) {
            return a.compareAndSwapObject(a2, c, (Object)l2, (Object)l3);
        }

        boolean a(a<?> a2, Object object, Object object2) {
            return a.compareAndSwapObject(a2, d, object, object2);
        }
    }

}

