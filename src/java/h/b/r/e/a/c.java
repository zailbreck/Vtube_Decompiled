/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 */
package h.b.r.e.a;

import h.b.f;
import h.b.g;
import h.b.h;
import h.b.r.c.b;
import h.b.r.c.e;
import h.b.r.g.i;

public final class c<T>
extends h.b.r.e.a.a<T, T> {
    final h b;
    final boolean c;
    final int d;

    public c(f<T> f2, h h2, boolean bl, int n2) {
        super(f2);
        this.b = h2;
        this.c = bl;
        this.d = n2;
    }

    @Override
    protected void b(g<? super T> g2) {
        h h2 = this.b;
        if (h2 instanceof i) {
            this.a.a(g2);
            return;
        }
        h.b b2 = h2.a();
        this.a.a(new a<T>(g2, b2, this.c, this.d));
    }

    static final class a<T>
    extends h.b.r.d.a<T>
    implements g<T>,
    Runnable {
        final g<? super T> b;
        final h.b c;
        final boolean d;
        final int e;
        e<T> f;
        h.b.o.b g;
        Throwable h;
        volatile boolean i;
        volatile boolean j;
        int k;
        boolean l;

        a(g<? super T> g2, h.b b2, boolean bl, int n2) {
            this.b = g2;
            this.c = b2;
            this.d = bl;
            this.e = n2;
        }

        @Override
        public int a(int n2) {
            if ((n2 & 2) != 0) {
                this.l = true;
                return 2;
            }
            return 0;
        }

        @Override
        public void a() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.e();
        }

        @Override
        public void a(h.b.o.b b2) {
            if (h.b.r.a.b.a(this.g, b2)) {
                this.g = b2;
                if (b2 instanceof b) {
                    b b3 = (b)b2;
                    int n2 = b3.a(7);
                    if (n2 == 1) {
                        this.k = n2;
                        this.f = b3;
                        this.i = true;
                        this.b.a((h.b.o.b)this);
                        this.e();
                        return;
                    }
                    if (n2 == 2) {
                        this.k = n2;
                        this.f = b3;
                        this.b.a((h.b.o.b)this);
                        return;
                    }
                }
                this.f = new h.b.r.f.a(this.e);
                this.b.a((h.b.o.b)this);
            }
        }

        @Override
        public void a(Throwable throwable) {
            if (this.i) {
                h.b.s.a.a(throwable);
                return;
            }
            this.h = throwable;
            this.i = true;
            this.e();
        }

        boolean a(boolean bl, boolean bl2, g<? super T> g2) {
            if (this.j) {
                this.f.clear();
                return true;
            }
            if (bl) {
                Throwable throwable = this.h;
                if (this.d) {
                    if (bl2) {
                        if (throwable != null) {
                            g2.a(throwable);
                        } else {
                            g2.a();
                        }
                        this.c.dispose();
                        return true;
                    }
                } else {
                    if (throwable != null) {
                        this.f.clear();
                        g2.a(throwable);
                        this.c.dispose();
                        return true;
                    }
                    if (bl2) {
                        g2.a();
                        this.c.dispose();
                        return true;
                    }
                }
            }
            return false;
        }

        @Override
        public T b() {
            return this.f.b();
        }

        @Override
        public void b(T t2) {
            if (this.i) {
                return;
            }
            if (this.k != 2) {
                this.f.a(t2);
            }
            this.e();
        }

        /*
         * Enabled aggressive block sorting
         */
        void c() {
            int n2 = 1;
            do {
                if (this.j) {
                    return;
                }
                boolean bl = this.i;
                Throwable throwable = this.h;
                if (!this.d && bl && throwable != null) {
                    this.b.a(throwable);
                } else {
                    this.b.b(null);
                    if (!bl) continue;
                    Throwable throwable2 = this.h;
                    if (throwable2 != null) {
                        this.b.a(throwable2);
                    } else {
                        this.b.a();
                    }
                }
                this.c.dispose();
                return;
            } while ((n2 = this.addAndGet(-n2)) != 0);
        }

        @Override
        public void clear() {
            this.f.clear();
        }

        /*
         * Exception decompiling
         */
        void d() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
            // org.benf.cfr.reader.b.a.a.j.b(Op04StructuredStatement.java:409)
            // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:487)
            // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
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

        @Override
        public void dispose() {
            if (!this.j) {
                this.j = true;
                this.g.dispose();
                this.c.dispose();
                if (this.getAndIncrement() == 0) {
                    this.f.clear();
                }
            }
        }

        void e() {
            if (this.getAndIncrement() == 0) {
                this.c.a(this);
            }
        }

        @Override
        public boolean isEmpty() {
            return this.f.isEmpty();
        }

        public void run() {
            if (this.l) {
                this.c();
                return;
            }
            this.d();
        }
    }

}

