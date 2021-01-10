/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  com.mintegral.msdk.base.common.report.a
 *  com.mintegral.msdk.base.common.report.e
 *  com.mintegral.msdk.base.common.report.e$b
 *  f.f.a.a
 *  f.f.a.e.b.c.c
 *  f.f.a.e.b.c.e
 *  f.f.a.e.b.h.g
 *  f.f.a.e.b.h.j.d
 *  f.f.a.e.b.h.k.c
 *  f.f.a.e.c.a
 *  f.f.a.e.e.a
 *  f.f.a.e.e.m
 *  f.f.a.e.e.n
 *  f.f.a.e.f.h
 *  f.f.a.e.f.l
 *  f.f.a.e.f.t
 *  f.f.a.j.d
 *  f.f.a.s.f.a$b
 *  f.f.a.s.f.a$c
 *  f.f.a.s.f.a$d
 *  f.f.a.s.f.d
 *  f.f.a.s.f.n
 *  f.f.a.s.g.b
 *  java.io.File
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.net.URLEncoder
 *  java.util.concurrent.CopyOnWriteArrayList
 *  java.util.concurrent.ExecutorService
 */
package f.f.a.s.f;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mintegral.msdk.base.common.report.e;
import f.f.a.e.b.c.e;
import f.f.a.e.b.h.g;
import f.f.a.e.d.h;
import f.f.a.e.d.q;
import f.f.a.e.d.r;
import f.f.a.e.e.m;
import f.f.a.e.f.l;
import f.f.a.e.f.t;
import f.f.a.s.f.a;
import f.f.a.s.f.n;
import java.io.File;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

public final class a
implements f.f.a.j.d,
Serializable {
    private boolean A = false;
    private long B;
    private f.f.a.s.g.b C;
    private f.f.a.s.g.b D;
    private int E = 100;
    private boolean F = false;
    private q G;
    private boolean H = false;
    private String I;
    private f.f.a.s.f.d J;
    private Handler K;
    private int L;
    private File M;
    private boolean b = false;
    private int c = 1;
    private boolean d = false;
    private int e;
    private Runnable f;
    private volatile int g = 0;
    private CopyOnWriteArrayList<f.f.a.s.f.d> h = new CopyOnWriteArrayList();
    private f.f.a.s.f.d i;
    private ExecutorService j;
    private n k;
    private Class l;
    private Object m;
    private Class n;
    private Object o;
    private f.f.a.e.e.a p;
    private String q;
    private boolean r = false;
    private Context s;
    private long t;
    private String u;
    private String v;
    private boolean w;
    private long x = 0L;
    private int y = 0;
    private String z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public a(Context context, f.f.a.e.e.a a2, ExecutorService executorService, String string) {
        String string2;
        this.J = new f.f.a.s.f.d(){

            public final void a(long l2, int n2) {
                if (!a.this.r) {
                    a.a(a.this, l2, n2);
                }
            }
        };
        this.K = new b((a)this, Looper.getMainLooper());
        if (context == null && a2 == null) {
            return;
        }
        this.B = System.currentTimeMillis();
        this.s = f.f.a.e.c.a.i().e();
        this.p = a2;
        this.q = string;
        this.j = executorService;
        f.f.a.e.e.a a3 = this.p;
        if (a3 != null) {
            this.u = a3.d1();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("=========CampaignDownLoadTask: title:");
            stringBuilder.append(this.p.c());
            stringBuilder.append(" video: ");
            stringBuilder.append(this.p.d1());
            stringBuilder.append(" ");
            stringBuilder.append(this.E);
            f.f.a.e.f.h.d((String)"CampaignDownLoadTask", (String)stringBuilder.toString());
        }
        String string3 = !TextUtils.isEmpty((CharSequence)(string2 = this.u)) ? f.f.a.e.f.a.a(t.a((String)string2.trim())) : "";
        this.I = string3;
        this.v = e.b((f.f.a.e.b.c.c)f.f.a.e.b.c.c.d);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.v);
        stringBuilder.append(File.separator);
        stringBuilder.append(this.I);
        this.z = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("videoLocalPath:");
        stringBuilder2.append(a2.c());
        stringBuilder2.append(this.z);
        f.f.a.e.f.h.b((String)"CampaignDownLoadTask", (String)stringBuilder2.toString());
        this.d = false;
        try {
            if (TextUtils.isEmpty((CharSequence)this.u)) return;
            if (this.c == 3) {
                return;
            }
            boolean bl = TextUtils.isEmpty((CharSequence)this.v);
            File file = null;
            if (!bl && !(file = new File(this.v)).exists()) {
                file.mkdirs();
            }
            if (file != null && file.exists() && (this.M == null || !this.M.exists())) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append((Object)file);
                stringBuilder3.append("/.nomedia");
                this.M = new File(stringBuilder3.toString());
                if (!this.M.exists()) {
                    this.M.createNewFile();
                }
            }
            a.super.d(true);
            a.super.c(this.u);
            return;
        }
        catch (Exception exception) {
            f.f.a.e.f.h.b((String)"CampaignDownLoadTask", (String)exception.getMessage());
        }
    }

    static /* synthetic */ int a(a a2, int n2) {
        a2.g = n2;
        return n2;
    }

    static /* synthetic */ long a(a a2, long l2) {
        a2.t = l2;
        return l2;
    }

    static /* synthetic */ q a(a a2, q q2) {
        a2.G = q2;
        return q2;
    }

    private void a(int n2, String string) {
        r r2 = r.a(h.a(f.f.a.e.c.a.i().e()));
        long l2 = this.B;
        long l3 = 0L;
        if (l2 != l3) {
            l3 = System.currentTimeMillis() - this.B;
        }
        f.f.a.e.e.n n3 = new f.f.a.e.e.n(this.s, this.p, n2, Long.toString((long)l3), this.t, this.L);
        n3.k(this.p.e());
        n3.c(this.p.d1());
        n3.m(string);
        n3.i(this.p.L0());
        n3.j(this.q);
        r2.a(n3);
    }

    static /* synthetic */ void a(a a2, int n2, String string) {
        a2.a(n2, string);
    }

    static /* synthetic */ void a(a a2, long l2, int n2) {
        long l3;
        int n3;
        a2.x = l2;
        n n4 = a2.k;
        if (n4 != null) {
            n4.a(l2, n2);
        }
        if (100L * l2 >= (l3 = (long)(n3 = a2.E) * a2.t) && !a2.F && n2 != 4) {
            String string;
            if (n3 == 100 && n2 != 5) {
                a2.g = 5;
                return;
            }
            a2.F = true;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("video load sucessed state:");
            stringBuilder.append(n2);
            stringBuilder.append("  mReadyRate:");
            stringBuilder.append(a2.E);
            f.f.a.e.f.h.d((String)"CampaignDownLoadTask", (String)stringBuilder.toString());
            if (!TextUtils.isEmpty((CharSequence)a2.j()) && !TextUtils.isEmpty((CharSequence)(string = a2.k()))) {
                f.f.a.s.g.b b2;
                f.f.a.s.g.b b3 = a2.C;
                if (b3 != null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("file is not effective");
                    stringBuilder2.append(string);
                    b3.a(stringBuilder2.toString(), a2.u);
                }
                if ((b2 = a2.D) != null) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("file is not effective");
                    stringBuilder3.append(string);
                    b2.a(stringBuilder3.toString(), a2.u);
                }
            } else {
                f.f.a.s.g.b b4;
                f.f.a.s.g.b b5 = a2.C;
                if (b5 != null) {
                    b5.b(a2.u);
                }
                if ((b4 = a2.D) != null) {
                    b4.b(a2.u);
                }
            }
        }
        if (!a2.b && l2 > 0L) {
            a2.b = true;
            if (a2.G == null) {
                a2.G = q.a(h.a(f.f.a.e.c.a.i().e()));
            }
            a2.G.a(a2.u, l2, a2.g);
        }
        if (a2.r) {
            CopyOnWriteArrayList<f.f.a.s.f.d> copyOnWriteArrayList = a2.h;
            if (copyOnWriteArrayList != null) {
                for (f.f.a.s.f.d d2 : copyOnWriteArrayList) {
                    if (d2 == null) continue;
                    d2.a(l2, n2);
                }
            }
            if (a2.i != null && (a2.g == 5 || a2.g == 4 || a2.g == 2 || a2.g == 6)) {
                a2.i.a(l2, n2);
                a2.i = null;
            }
        }
    }

    static /* synthetic */ void a(a a2, String string) {
        Context context = f.f.a.e.c.a.i().e();
        String string2 = a2.q;
        if (context != null && !TextUtils.isEmpty((CharSequence)string) && !TextUtils.isEmpty((CharSequence)string2)) {
            try {
                if (com.mintegral.msdk.base.common.report.a.b().a()) {
                    com.mintegral.msdk.base.common.report.a.b().a(string);
                    return;
                }
                e.b b2 = new e.b(context);
                f.f.a.e.b.h.k.c c2 = com.mintegral.msdk.base.common.report.e.a((String)string, (Context)context, (String)string2);
                b2.b(0, f.f.a.e.b.h.j.d.a().b, c2, (g)new d());
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                f.f.a.e.f.h.d((String)"CampaignDownLoadTask", (String)exception.getMessage());
            }
        }
    }

    static /* synthetic */ boolean a(a a2, boolean bl) {
        a2.b = bl;
        return bl;
    }

    static /* synthetic */ long b(a a2) {
        return a2.x;
    }

    static /* synthetic */ void b(a a2, String string) {
        block7 : {
            ConnectivityManager connectivityManager;
            block8 : {
                a2.y = 1 + a2.y;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("retryReq");
                stringBuilder.append(a2.y);
                f.f.a.e.f.h.a((String)"CampaignDownLoadTask", (String)stringBuilder.toString());
                if (a2.s == null) break block7;
                Object object = a2.s.getSystemService("connectivity");
                boolean bl = object instanceof ConnectivityManager;
                connectivityManager = null;
                if (!bl) break block8;
                try {
                    connectivityManager = (ConnectivityManager)object;
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
            if (connectivityManager != null) {
                boolean bl;
                if (connectivityManager.getActiveNetworkInfo() != null && !(bl = connectivityManager.getActiveNetworkInfo().isAvailable())) {
                    return;
                }
            }
        }
        if (a2.y <= 1) {
            f.f.a.e.f.h.d((String)"CampaignDownLoadTask", (String)"delFileAndDB 44");
            a2.r();
            a2.K.sendEmptyMessageDelayed(5, 2000L);
            return;
        }
        a2.s();
        a2.a(3, string);
        a2.a(string);
    }

    static /* synthetic */ void b(a a2, boolean bl) {
        a2.d(bl);
    }

    static /* synthetic */ int c(a a2) {
        return a2.g;
    }

    private void c(String string) {
        this.f = new c((a)this, string);
    }

    static /* synthetic */ boolean c(a a2, boolean bl) {
        a2.w = bl;
        return bl;
    }

    static /* synthetic */ f.f.a.s.g.b d(a a2) {
        return a2.C;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void d(boolean bl) {
        q q2;
        block6 : {
            StringBuilder stringBuilder;
            block9 : {
                block10 : {
                    String string;
                    block7 : {
                        File file;
                        block8 : {
                            String string2;
                            q2 = q.a(h.a(f.f.a.e.c.a.i().e()));
                            m m2 = q2.a(string2 = this.u, string = "");
                            if (m2 == null) break block6;
                            this.x = m2.b();
                            if (this.g != 2) {
                                this.g = m2.d();
                            }
                            if (bl && this.g == 1) {
                                this.g = 2;
                            }
                            this.t = m2.c();
                            if (m2.a() > 0L) {
                                this.B = m2.a();
                            }
                            if (this.g != 5 || this.A) break block7;
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(this.v);
                            stringBuilder2.append(File.separator);
                            stringBuilder2.append(this.I);
                            File file2 = new File(stringBuilder2.toString());
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(this.v);
                            stringBuilder3.append(File.separator);
                            stringBuilder3.append(this.I);
                            stringBuilder3.append(".dltmp");
                            file = new File(stringBuilder3.toString());
                            if (!file2.exists()) break block8;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(this.v);
                            stringBuilder.append(File.separator);
                            stringBuilder.append(this.I);
                            break block9;
                        }
                        if (!file.exists()) {
                            f.f.a.e.f.h.d((String)"CampaignDownLoadTask", (String)"delFileAndDB 22");
                            a.super.r();
                            f.f.a.e.f.h.b((String)"CampaignDownLoadTask", (String)"restore state==5 \u6587\u4ef6\u4e0d\u5b58\u5728");
                            return;
                        }
                        stringBuilder = new StringBuilder();
                        break block10;
                    }
                    if (this.g == 0) return;
                    int n2 = this.E;
                    if (n2 != 100 && n2 != 0) {
                        string = ".dltmp";
                    }
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(this.v);
                    stringBuilder4.append(File.separator);
                    stringBuilder4.append(this.I);
                    stringBuilder4.append(string);
                    this.z = stringBuilder4.toString();
                    if (this.g != 6) return;
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append(this.v);
                stringBuilder.append(File.separator);
                stringBuilder.append(this.I);
                stringBuilder.append(".dltmp");
            }
            this.z = stringBuilder.toString();
            return;
        }
        q2.a(this.u, this.B);
    }

    static /* synthetic */ String e(a a2) {
        return a2.u;
    }

    private String e(boolean bl) {
        if (!(this.p == null || TextUtils.isEmpty((CharSequence)this.q) || TextUtils.isEmpty((CharSequence)this.p.L0()) || TextUtils.isEmpty((CharSequence)this.p.d1()))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("key=");
            stringBuilder.append("2000077");
            stringBuilder.append("&");
            stringBuilder.append("unit_id=");
            stringBuilder.append(this.q);
            stringBuilder.append("&");
            stringBuilder.append("request_id=");
            stringBuilder.append(this.p.L0());
            stringBuilder.append("&");
            stringBuilder.append("request_id_notice=");
            stringBuilder.append(this.p.M0());
            stringBuilder.append("&");
            stringBuilder.append("package_name=");
            stringBuilder.append(f.f.a.e.c.a.i().a());
            stringBuilder.append("&");
            stringBuilder.append("app_id=");
            stringBuilder.append(f.f.a.e.c.a.i().f());
            stringBuilder.append("&");
            stringBuilder.append("video_url=");
            stringBuilder.append(URLEncoder.encode((String)this.p.d1()));
            stringBuilder.append("&");
            stringBuilder.append("process_size=");
            long l2 = bl ? this.t : this.x;
            stringBuilder.append(l2);
            stringBuilder.append("&");
            stringBuilder.append("file_size=");
            stringBuilder.append(this.t);
            stringBuilder.append("&");
            stringBuilder.append("ready_rate=");
            stringBuilder.append(this.E);
            stringBuilder.append("&");
            stringBuilder.append("cd_rate=");
            stringBuilder.append(this.e);
            stringBuilder.append("&");
            stringBuilder.append("cid=");
            stringBuilder.append(this.p.e());
            stringBuilder.append("&");
            stringBuilder.append("type=");
            stringBuilder.append(this.g);
            return stringBuilder.toString();
        }
        return "";
    }

    static /* synthetic */ f.f.a.s.g.b f(a a2) {
        return a2.D;
    }

    static /* synthetic */ int g(a a2) {
        return a2.c;
    }

    static /* synthetic */ int h(a a2) {
        return a2.E;
    }

    static /* synthetic */ Context i(a a2) {
        return a2.s;
    }

    static /* synthetic */ String j(a a2) {
        return a2.z;
    }

    static /* synthetic */ long k(a a2) {
        return a2.t;
    }

    static /* synthetic */ String l(a a2) {
        return a2.v;
    }

    static /* synthetic */ String m(a a2) {
        return a2.I;
    }

    static /* synthetic */ q n(a a2) {
        return a2.G;
    }

    static /* synthetic */ f.f.a.e.e.a o(a a2) {
        return a2.p;
    }

    static /* synthetic */ Handler p(a a2) {
        return a2.K;
    }

    /*
     * Exception decompiling
     */
    private void r() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl37 : ALOAD_0 : trying to set 1 previously set to 0
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

    /*
     * Exception decompiling
     */
    private void s() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl113 : RETURN : trying to set 1 previously set to 0
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

    public final String a() {
        return this.u;
    }

    public final void a(int n2) {
        this.c = n2;
    }

    public final void a(int n2, int n3) {
        this.g = n2;
        if (this.G == null) {
            this.G = q.a(h.a(f.f.a.e.c.a.i().e()));
        }
        f.f.a.e.f.h.a((String)"CampaignDownLoadTask", (String)"\u66f4\u65b0\u6570\u636e\u5e931111");
        this.G.a(this.u, n3, n2);
    }

    public final void a(long l2, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("=========\u4e0b\u8f7d\u5b8c\u621000 \uff1a ");
        stringBuilder.append(this.p.c());
        f.f.a.e.f.h.d((String)"CampaignDownLoadTask", (String)stringBuilder.toString());
        int n2 = this.E;
        if (!(n2 != 100 && n2 != 0 || this.c == 3 || l2 == this.t || bl)) {
            this.a("File downloaded is smaller than the file");
            return;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("=========\u4e0b\u8f7d\u5b8c\u621011 \uff1a ");
        stringBuilder2.append(this.p.c());
        f.f.a.e.f.h.d((String)"CampaignDownLoadTask", (String)stringBuilder2.toString());
        Message message = Message.obtain();
        this.g = 5;
        message.what = 4;
        this.K.sendMessage(message);
    }

    public final void a(f.f.a.e.e.a a2) {
        this.p = a2;
    }

    public final void a(f.f.a.s.f.d d2) {
        CopyOnWriteArrayList<f.f.a.s.f.d> copyOnWriteArrayList = this.h;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add((Object)d2);
        }
    }

    public final void a(f.f.a.s.g.b b2) {
        this.C = b2;
    }

    public final void a(File file, String string, int n2) {
        try {
            this.x = l.a((File)file);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public final void a(String string) {
        f.f.a.s.g.b b2;
        if (this.C != null) {
            f.f.a.e.f.h.d((String)"CampaignDownLoadTask", (String)"video load retry fail");
            this.C.a(string, this.u);
        }
        if ((b2 = this.D) != null) {
            b2.a(string, this.u);
        }
        this.g = 4;
        Message message = Message.obtain();
        message.what = 3;
        this.K.sendMessage(message);
    }

    public final void a(Throwable throwable) {
        this.a(throwable.getMessage());
    }

    public final void a(boolean bl) {
        if (!bl) {
            this.d = false;
        }
        this.H = bl;
    }

    public final void b(int n2) {
        this.e = n2;
    }

    public final void b(f.f.a.s.f.d d2) {
        this.i = d2;
    }

    public final void b(String string) {
        a.super.s();
        a.super.a(2, string);
        this.g = 4;
    }

    public final void b(boolean bl) {
    }

    public final boolean b() {
        return this.H;
    }

    public final long c() {
        return this.B;
    }

    public final void c(int n2) {
        this.E = n2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mReadyRate:");
        stringBuilder.append(this.E);
        f.f.a.e.f.h.b((String)"CampaignDownLoadTask", (String)stringBuilder.toString());
    }

    public final void c(boolean bl) {
        if (bl) {
            if (!this.d) {
                Message message = Message.obtain();
                message.what = 10010;
                message.obj = a.super.e(bl);
                this.K.sendMessage(message);
                this.d = true;
                return;
            }
        } else {
            Message message = Message.obtain();
            message.what = 10010;
            message.obj = a.super.e(bl);
            this.K.sendMessage(message);
        }
    }

    public final String d() {
        return this.z;
    }

    public final void d(int n2) {
        this.L = n2;
    }

    public final long e() {
        return this.t;
    }

    public final Runnable f() {
        return this.f;
    }

    public final void g() {
        f.f.a.e.f.h.d((String)"CampaignDownLoadTask", (String)"start()");
        Runnable runnable = this.f;
        if (runnable != null) {
            this.j.execute(runnable);
        } else {
            this.c(this.u);
            this.j.execute(this.f);
        }
        this.r = true;
    }

    public final boolean h() {
        return this.r;
    }

    public final int i() {
        return this.g;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String j() {
        String string;
        block9 : {
            block6 : {
                block7 : {
                    block8 : {
                        int n2 = this.c;
                        string = "";
                        if (n2 == 3) {
                            return string;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(this.v);
                        stringBuilder.append(File.separator);
                        stringBuilder.append(this.I);
                        String string2 = stringBuilder.toString();
                        File file = new File(string2);
                        try {
                            if (file.exists()) {
                                if (!file.isFile()) break block6;
                                if (!file.canRead()) break block7;
                                if (file.length() <= 0L) break block8;
                                this.z = string2;
                                break block9;
                            }
                            string = "file is not exist ";
                        }
                        catch (Throwable throwable) {
                            if (f.f.a.a.a) {
                                throwable.printStackTrace();
                            }
                            string = throwable.getMessage();
                        }
                        break block9;
                    }
                    string = "file length is 0 ";
                    break block9;
                }
                string = "file can not readed ";
                break block9;
            }
            string = "file is not file ";
        }
        if (this.g == 5 && !TextUtils.isEmpty((CharSequence)string)) {
            f.f.a.e.f.h.d((String)"CampaignDownLoadTask", (String)"delFileAndDB 00");
            this.r();
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String k() {
        String string;
        block8 : {
            block5 : {
                block6 : {
                    block7 : {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(this.v);
                        stringBuilder.append(File.separator);
                        stringBuilder.append(this.I);
                        stringBuilder.append(".dltmp");
                        String string2 = stringBuilder.toString();
                        File file = new File(string2);
                        try {
                            if (file.exists()) {
                                if (!file.isFile()) break block5;
                                if (!file.canRead()) break block6;
                                if (file.length() <= 0L) break block7;
                                this.z = string2;
                                string = "";
                                break block8;
                            }
                            string = "file is not exist ";
                        }
                        catch (Throwable throwable) {
                            if (f.f.a.a.a) {
                                throwable.printStackTrace();
                            }
                            string = throwable.getMessage();
                        }
                        break block8;
                    }
                    string = "file length is 0 ";
                    break block8;
                }
                string = "file can not readed ";
                break block8;
            }
            string = "file is not file ";
        }
        if (this.g == 5 && !TextUtils.isEmpty((CharSequence)string)) {
            f.f.a.e.f.h.d((String)"CampaignDownLoadTask", (String)"delFileAndDB 11");
            this.r();
        }
        return string;
    }

    public final f.f.a.e.e.a l() {
        return this.p;
    }

    public final void m() {
        if (this.h != null) {
            this.h = null;
        }
    }

    public final long n() {
        return this.x;
    }

    public final f.f.a.s.f.d o() {
        return this.J;
    }

    /*
     * Exception decompiling
     */
    public final void p() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl34 : ALOAD_0 : trying to set 1 previously set to 0
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

    public final void q() {
        this.c(false);
    }

}

