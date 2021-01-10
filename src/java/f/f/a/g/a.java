/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  f.f.a.e.e.a
 *  f.f.a.g.d
 *  f.f.a.g.e
 *  f.f.a.o.b
 *  f.f.a.p.a
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.g;

import android.content.Context;
import f.f.a.g.d;
import f.f.a.g.e;
import f.f.a.g.h;
import f.f.a.o.b;
import java.io.Serializable;

public final class a
extends d {
    private h a;

    /*
     * Exception decompiling
     */
    public a(Context var2_3, boolean var3_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException
        // org.benf.cfr.reader.b.a.f.g.a(VariableFactory.java:53)
        // org.benf.cfr.reader.b.a.a.g.b(Op02WithProcessedDataAndRefs.java:911)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:959)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:56)
        // org.benf.cfr.reader.b.a.a.g$3.a(Op02WithProcessedDataAndRefs.java:2010)
        // org.benf.cfr.reader.b.a.a.g$3.a(Op02WithProcessedDataAndRefs.java:2007)
        // org.benf.cfr.reader.util.d.a.d(AbstractGraphVisitorFI.java:60)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:2019)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:340)
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

    public final void a() {
    }

    public final void a(String string, String string2, f.f.a.e.e.a a2, e e2) {
        this.a(string, string2, a2, e2, null);
    }

    public final void a(String string, String string2, f.f.a.e.e.a a2, e e2, b b2) {
        new String(a2.F());
        boolean bl = "5".equals((Object)a2.G()) || "6".equals((Object)a2.G());
        this.a.a(a2.F(), e2, bl, string, a2.e(), string2, b2, a2, true, false);
    }

    public final void a(String string, String string2, f.f.a.e.e.a a2, e e2, String string3, boolean bl, boolean bl2) {
        String string4;
        boolean bl3;
        a a3;
        block5 : {
            block2 : {
                boolean bl4;
                block4 : {
                    block3 : {
                        if (a2 == null) break block2;
                        if ("5".equals((Object)a2.G())) break block3;
                        boolean bl5 = "6".equals((Object)a2.G());
                        bl4 = false;
                        if (!bl5) break block4;
                    }
                    bl4 = true;
                }
                String string5 = a2.e();
                bl3 = bl4;
                string4 = string5;
                a3 = this;
                break block5;
            }
            bl3 = false;
            a3 = this;
            string4 = "";
        }
        a3.a.a(string3, e2, bl3, string, string4, string2, null, a2, bl, bl2);
    }

    public static class a
    implements f.f.a.p.a,
    Serializable {
        private boolean b;
        private String c;
        private int d;
        private String e;
        private String f;
        private boolean g;
        private String h;
        private String i;
        private String j;
        private int k;
        private int l;

        public int a() {
            return this.d;
        }

        public void a(int n2) {
            this.d = n2;
        }

        public void a(String string) {
            this.h = string;
        }

        public void a(boolean bl) {
        }

        public String b() {
            return this.h;
        }

        public void b(int n2) {
            this.l = n2;
        }

        public void b(String string) {
            this.i = string;
        }

        public void b(boolean bl) {
            this.b = bl;
        }

        public String c() {
            return this.i;
        }

        public void c(int n2) {
            this.k = n2;
        }

        public void c(String string) {
            this.j = string;
        }

        public void c(boolean bl) {
            this.g = bl;
        }

        public String d() {
            return this.j;
        }

        public void d(String string) {
            this.f = string;
        }

        public String e() {
            return this.c;
        }

        public void e(String string) {
            this.e = string;
        }

        public String f() {
            return this.f;
        }

        public int g() {
            return this.l;
        }

        public int h() {
            return this.k;
        }

        public String i() {
            return this.e;
        }

        public boolean j() {
            return this.b;
        }

        public boolean k() {
            return this.g;
        }
    }

}

