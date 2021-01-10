/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.webkit.URLUtil
 *  f.f.a.e.b.f.a
 *  f.f.a.e.b.f.a$a
 *  f.f.a.e.b.f.a$b
 *  f.f.a.e.b.f.b
 *  f.f.a.e.e.a
 *  f.f.a.e.f.k
 *  f.f.a.e.f.k$d
 *  f.f.a.g.d
 *  f.f.a.g.e
 *  f.f.a.g.f
 *  f.f.a.g.f$a
 *  f.f.a.g.g
 *  f.f.a.g.g$f
 *  f.f.a.g.h$a
 *  f.f.a.o.a
 *  f.f.a.o.b
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.util.concurrent.Semaphore
 */
package f.f.a.g;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import f.f.a.e.b.f.a;
import f.f.a.e.f.k;
import f.f.a.g.a;
import f.f.a.g.d;
import f.f.a.g.e;
import f.f.a.g.f;
import f.f.a.g.g;
import f.f.a.g.h;
import java.util.concurrent.Semaphore;

public final class h
extends d
implements a.b {
    private boolean a = false;
    private long b = 0L;
    private e c;
    private a.a d;
    private boolean e = true;
    private boolean f;
    private Context g;
    private f.f.a.e.b.f.b h;
    private f.a i;
    private Handler j = new Handler(Looper.getMainLooper());
    private boolean k;

    public h(Context context, boolean bl) {
        this.g = context;
        this.k = bl;
        f.f.a.e.b.f.b b2 = bl ? new f.f.a.e.b.f.b(context, 1) : new f.f.a.e.b.f.b(context);
        this.h = b2;
    }

    static /* synthetic */ a.a a(h h2, a.a a2) {
        h2.d = a2;
        return a2;
    }

    static /* synthetic */ f.a a(h h2, f.a a2) {
        h2.i = a2;
        return a2;
    }

    static /* synthetic */ boolean a(h h2) {
        return h2.f;
    }

    static /* synthetic */ boolean b(h h2) {
        return h2.e;
    }

    static /* synthetic */ f.a c(h h2) {
        return h2.i;
    }

    static /* synthetic */ e g(h h2) {
        return h2.c;
    }

    static /* synthetic */ boolean h(h h2) {
        return h2.k;
    }

    public final void a(a.a a2) {
        if (a2 == a.a.f) {
            if (!this.e) {
                return;
            }
            this.j.post((Runnable)new a((h)this));
        }
    }

    public final void a(String string, e e2, boolean bl, String string2, String string3, String string4, f.f.a.o.b b2, f.f.a.e.e.a a2, boolean bl2, boolean bl3) {
        this.c = e2;
        this.f = bl;
        f.f.a.e.b.f.b b3 = this.h;
        b b4 = (h)this.new b(this.g, string, string2, string3, string4, b2, a2, bl2, bl3);
        b3.a((f.f.a.e.b.f.a)b4, (a.b)this);
    }

    private final class b
    extends f.f.a.e.b.f.a {
        private final Semaphore e = new Semaphore(0);
        private final Context f;
        private String g;
        private String h;
        private String i;
        private String j;
        private f.f.a.o.b k;
        private f.f.a.e.e.a l;
        private boolean m;
        private boolean n;
        private g.f o;

        public b(Context context, String string, String string2, String string3, String string4, f.f.a.o.b b2, f.f.a.e.e.a a2, boolean bl, boolean bl2) {
            this.o = new g.f(){

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                private void a() {
                    h h2;
                    h h3 = h2 = h.this;
                    synchronized (h3) {
                        h.this.d.b(true);
                        b.this.e.release();
                        return;
                    }
                }

                public final void a(int n2, String string, String string2, String string3) {
                    if (!TextUtils.isEmpty((CharSequence)string2)) {
                        h.this.d.b(string2);
                    }
                    if (!TextUtils.isEmpty((CharSequence)string3)) {
                        h.this.d.a(string3);
                    }
                    b.this.a(string);
                    b.a(b.this, true, false, string, string2);
                    a.super.a();
                }

                public final void a(String string, boolean bl, String string2) {
                    b.this.a(string);
                    h.this.d.a(string2);
                    b.a(b.this, true, false, string, "timeout");
                    a.super.a();
                }

                public final boolean a(String string) {
                    boolean bl = b.this.a(string);
                    b.a(b.this, false, true, string, "");
                    if (bl) {
                        b.a(b.this, true, true, string, "");
                        a.super.a();
                    }
                    return bl;
                }

                public final boolean b(String string) {
                    boolean bl = b.this.a(string);
                    b.a(b.this, false, true, string, "");
                    if (bl) {
                        a.super.a();
                    }
                    return bl;
                }

                public final boolean c(String string) {
                    b.a(b.this, false, false, string, "");
                    return false;
                }
            };
            this.f = context;
            this.g = string;
            this.h = string2;
            this.i = string3;
            this.j = string4;
            this.k = b2;
            this.l = a2;
            this.m = bl;
            this.n = bl2;
        }

        /*
         * Exception decompiling
         */
        private a.a a(String var1, boolean var2, boolean var3, f.f.a.e.e.a var4) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
            // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
            // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
            // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

        static /* synthetic */ void a(b b2, boolean bl, boolean bl2, String string, String string2) {
            int n2;
            long l2 = b2.h.this.b;
            if (l2 == 0L) {
                long l3 = System.currentTimeMillis();
                b2.h.this.b = l3;
                n2 = 0;
            } else {
                long l4 = System.currentTimeMillis();
                int n3 = (int)(l4 - l2);
                b2.h.this.b = l4;
                n2 = n3;
            }
            if (bl) {
                if (bl2) {
                    if (b2.k != null && !b2.h.this.a) {
                        b2.h.this.a = true;
                        b2.k.a(string, f.f.a.o.a.b, n2, 0, "", string2);
                        return;
                    }
                } else if (b2.k != null && !b2.h.this.a) {
                    b2.h.this.a = true;
                    b2.k.b(string, f.f.a.o.a.b, n2, 0, "", string2);
                    return;
                }
            } else {
                f.f.a.o.b b3 = b2.k;
                if (b3 != null) {
                    b3.c(string, f.f.a.o.a.b, n2, 0, "", string2);
                }
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        private boolean a(String string) {
            f.f.a.e.e.a a2 = this.l;
            if (a2 != null) {
                a2.l0();
            }
            if (k.d.a((String)string)) {
                h.this.d.a(1);
            } else {
                if (!b.super.c(string)) {
                    h.this.d.a(2);
                    h.this.d.e(string);
                    return false;
                }
                h.this.d.a(3);
            }
            h.this.d.e(string);
            h.this.d.c(true);
            return true;
        }

        private boolean b(String string) {
            return true ^ URLUtil.isNetworkUrl((String)string);
        }

        private boolean c(String string) {
            return !TextUtils.isEmpty((CharSequence)string) && string.toLowerCase().contains((CharSequence)"apk");
        }

        /*
         * Exception decompiling
         */
        public final void a() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl175 : ALOAD_0 : trying to set 1 previously set to 0
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

        public final void b() {
        }

    }

}

