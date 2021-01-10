/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.ref.WeakReference
 *  java.util.HashMap
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.LinkedBlockingDeque
 *  java.util.concurrent.SynchronousQueue
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package f.f.a.e.b.f;

import android.content.Context;
import f.f.a.e.b.f.a;
import f.f.a.e.b.f.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b {
    ThreadPoolExecutor a;
    HashMap<Long, f.f.a.e.b.f.a> b;
    WeakReference<Context> c;

    public b(Context context) {
        ThreadPoolExecutor threadPoolExecutor;
        this.a = threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, (BlockingQueue)new SynchronousQueue());
        this.a.allowCoreThreadTimeOut(true);
        this.b = new HashMap();
        this.c = new WeakReference((Object)context);
    }

    public b(Context context, int n2) {
        void var2_4;
        if (var2_4 == false) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 15L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingDeque());
        } else {
            super((int)var2_4, (int)var2_4, 15L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingDeque());
        }
        this.a = (ThreadPoolExecutor)n2;
        this.a.allowCoreThreadTimeOut(true);
        this.b = new HashMap();
        this.c = new WeakReference((Object)var1);
    }

    private void b(f.f.a.e.b.f.a a2, a.b b2) {
        void var5_3 = this;
        synchronized (var5_3) {
            this.b.put((Object)f.f.a.e.b.f.a.d, (Object)a2);
            a2.c = new a.b((b)this, a2, b2){
                final /* synthetic */ f.f.a.e.b.f.a a;
                final /* synthetic */ a.b b;
                final /* synthetic */ b c;
                {
                    this.c = b2;
                    this.a = a2;
                    this.b = b3;
                }

                /*
                 * Enabled aggressive block sorting
                 */
                public final void a(f.f.a.e.b.f.a$a a2) {
                    if (a2 == f.f.a.e.b.f.a$a.e || a2 == f.f.a.e.b.f.a$a.f) {
                        this.c.b.remove((Object)f.f.a.e.b.f.a.d);
                    } else if (a2 == f.f.a.e.b.f.a$a.c && (Context)this.c.c.get() == null) {
                        this.c.a();
                    }
                    a.b b2 = this.b;
                    if (b2 != null) {
                        b2.a(a2);
                    }
                }
            };
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl29.1 : ALOAD_3 : trying to set 1 previously set to 0
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

    public final void a(f.f.a.e.b.f.a a2) {
        b.super.b(a2, null);
        this.a.execute((Runnable)a2);
    }

    public final void a(f.f.a.e.b.f.a a2, a.b b2) {
        b.super.b(a2, b2);
        this.a.execute((Runnable)a2);
    }
}

