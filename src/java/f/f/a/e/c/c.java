/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Message
 *  android.text.TextUtils
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 */
package f.f.a.e.c;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import f.f.a.e.f.h;
import f.f.a.e.f.q;
import f.f.a.j.i;
import java.io.File;

public class c {
    private static c g;
    private Context a;
    private long b;
    private f.f.a.c c;
    private boolean d = false;
    private i e;
    Handler f = new Handler(){

        /*
         * Exception decompiling
         */
        public final void handleMessage(Message var1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl259 : RETURN : trying to set 1 previously set to 0
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
    };

    private c() {
    }

    static /* synthetic */ Context a(c c2) {
        return c2.a;
    }

    private void a(f.f.a.c c2) {
        void var7_2 = this;
        synchronized (var7_2) {
            this.c = c2;
            if (this.d && this.a != null) {
                String string = f.f.a.c.a(c2);
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    q.a(this.a, "mintegral_user", string);
                    this.b = System.currentTimeMillis();
                    q.a(this.a, "mintegral_user_expiretime", this.b);
                } else {
                    c.super.d();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("writeMintegralUser,json:");
                stringBuilder.append(string);
                h.a("com.mintegral.msdk", stringBuilder.toString());
                this.d = false;
            } else {
                h.a("com.mintegral.msdk", "can't write mintegralUser");
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c c() {
        if (g != null) return g;
        Class<c> class_ = c.class;
        synchronized (c.class) {
            if (g != null) return g;
            g = new c();
            // ** MonitorExit[var1] (shouldn't be in output)
            return g;
        }
    }

    private void d() {
        this.c = null;
        this.b = 0L;
        if (this.d && this.a != null) {
            h.a("com.mintegral.msdk", "clearMintegralUser");
            q.a(this.a, "mintegral_user", "");
            q.a(this.a, "mintegral_user_expiretime", 0L);
            this.d = false;
            return;
        }
        h.a("com.mintegral.msdk", "can't clear mintegralUser");
    }

    public final i a(Context context) {
        block3 : {
            i i2;
            if (this.e != null) break block3;
            i.b b2 = new i.b(context);
            b2.a(new File(context.getExternalCacheDir(), "video-cache"));
            this.e = i2 = b2.a();
            return i2;
        }
        try {
            i i3 = this.e;
            return i3;
        }
        catch (Exception | Throwable exception) {
            return null;
        }
    }

    public final i a(Context context, String string) {
        i i2 = this.a(context);
        i2.a(string);
        return i2;
    }

    public final void a() {
        new Thread(new Runnable(){

            /*
             * Exception decompiling
             */
            public final void run() {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl460 : RETURN : trying to set 1 previously set to 0
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
        }).start();
    }

    public final f.f.a.c b() {
        long l2;
        long l3 = System.currentTimeMillis();
        if (l3 - (l2 = this.b) >= 259200000L && l2 != 0L) {
            h.a("com.mintegral.msdk", "getMIntegralUser,expire");
            this.d();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getMIntegralUser,user:");
            stringBuilder.append((Object)this.c);
            h.a("com.mintegral.msdk", stringBuilder.toString());
            if (this.d) {
                this.a(this.c);
            }
        }
        return this.c;
    }

}

