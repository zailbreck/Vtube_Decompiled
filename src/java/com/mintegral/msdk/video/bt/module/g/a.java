/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.mintegral.msdk.video.bt.module.g.b
 *  com.mintegral.msdk.video.bt.module.g.f
 *  f.f.a.e.f.h
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Random
 */
package com.mintegral.msdk.video.bt.module.g;

import android.content.Context;
import com.mintegral.msdk.video.bt.module.g.b;
import com.mintegral.msdk.video.bt.module.g.f;
import f.f.a.e.f.h;
import f.f.a.s.b.c;
import f.f.a.s.b.d;
import java.util.List;
import java.util.Random;

public final class a
extends b {
    private f a;
    private f.f.a.s.d.c b;
    private String c;
    private String d;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;

    public a(Context context, boolean bl, f.f.a.s.d.c c2, f.f.a.e.e.a a2, f f2, String string, String string2) {
        this.a = f2;
        this.e = this.a(c2, a2);
        this.b = c2;
        this.c = string2;
        this.d = string;
    }

    private boolean a(int n2) {
        c c2;
        f.f.a.s.d.c c3 = this.b;
        if (c3 != null && (c2 = c3.y()) != null) {
            if (c2.a() == 0) {
                return n2 <= 4;
            }
            List<Integer> list = c2.b();
            if (list != null) {
                return list.contains((Object)n2);
            }
        }
        return n2 <= 4;
    }

    /*
     * Exception decompiling
     */
    private boolean a(f.f.a.s.d.c var1, f.f.a.e.e.a var2) {
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

    private boolean a(boolean bl) {
        block7 : {
            boolean bl2;
            block10 : {
                block8 : {
                    block9 : {
                        block6 : {
                            try {
                                if (this.b != null) break block6;
                                return false;
                            }
                            catch (Throwable throwable) {
                                h.b((String)"DeductionShowRewardListener", (String)"", (Throwable)throwable);
                                return false;
                            }
                        }
                        int n2 = this.b.A();
                        if (n2 == 1) break block7;
                        if (n2 == 2) break block8;
                        if (n2 == 3) break block9;
                        return false;
                    }
                    return a.super.d();
                }
                bl2 = false;
                if (bl) {
                    boolean bl3 = a.super.d();
                    bl2 = false;
                    if (!bl3) break block10;
                    bl2 = true;
                }
            }
            return bl2;
        }
        return bl;
    }

    private int c() {
        c c2;
        f.f.a.s.d.c c3 = this.b;
        if (c3 != null && (c2 = c3.y()) != null) {
            return c2.a();
        }
        return 1;
    }

    private boolean d() {
        double d2;
        block6 : {
            block5 : {
                try {
                    if (this.b != null) break block5;
                    return false;
                }
                catch (Throwable throwable) {
                    h.b((String)"DeductionShowRewardListener", (String)"", (Throwable)throwable);
                    return false;
                }
            }
            d2 = this.b.B();
            if (d2 != 1.0) break block6;
            return false;
        }
        double d3 = new Random().nextDouble();
        double d4 = d3 DCMPL d2;
        boolean bl = false;
        if (d4 > 0) {
            bl = true;
        }
        return bl;
    }

    public final void a() {
        super.a();
        if (this.a != null && !this.f) {
            boolean bl = this.e;
            if (!bl || bl && !this.a(1)) {
                this.a.a();
            }
            this.a.a(2, this.d, this.c);
            this.f = true;
        }
    }

    public final void a(String string, String string2) {
        boolean bl;
        f f2;
        super.a(string, string2);
        if (this.a != null && (!(bl = this.e) || bl && !a.super.a(2))) {
            this.a.a(string, string2);
        }
        if ((f2 = this.a) != null) {
            f2.a(5, string, string2);
        }
    }

    public final void a(boolean bl, int n2) {
        super.a(bl, n2);
        f f2 = this.a;
        if (f2 != null && !this.h) {
            if (!this.e) {
                f2.a(bl, n2);
                return;
            }
            if (!a.super.a(5)) {
                if (a.super.c() == 0 && a.super.a(1)) {
                    this.a.b("");
                }
                this.a.a(bl, n2);
            }
        }
    }

    public final void a(boolean bl, d d2) {
        super.a(bl, d2);
        f f2 = this.a;
        if (f2 != null && !this.h) {
            f2.a(7, this.d, this.c);
            if (!this.e) {
                this.a.a(bl, d2);
                this.h = true;
                return;
            }
            if (!a.super.a(5)) {
                if (a.super.c() == 0 && a.super.a(1)) {
                    this.a.b("");
                }
                this.a.a(bl, d2);
            } else {
                this.i = true;
            }
            this.h = true;
        }
    }

    public final void a(boolean bl, String string, String string2) {
        boolean bl2;
        super.a(bl, string, string2);
        if (this.a != null && (!(bl2 = this.e) || bl2 && !a.super.a(4)) && !a.super.a(bl)) {
            this.a.a(bl, string, string2);
        }
    }

    public final void b(String string) {
        super.b(string);
        if (this.a != null && !this.g) {
            boolean bl = this.e;
            if (!bl || bl && !a.super.a(1)) {
                this.a.b(string);
            }
            this.a.a(4, this.d, this.c);
            this.g = true;
        }
    }

    public final void b(String string, String string2) {
        boolean bl;
        f f2;
        super.b(string, string2);
        if (this.a != null && (!(bl = this.e) || bl && !a.super.a(3))) {
            this.a.b(string, string2);
        }
        if ((f2 = this.a) != null) {
            f2.a(6, string, string2);
        }
    }

    public final boolean b() {
        return this.i;
    }
}

