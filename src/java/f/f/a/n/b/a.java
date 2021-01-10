/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  f.f.a.a
 *  f.f.a.e.c.a
 *  f.f.a.e.e.a
 *  f.f.a.e.f.h
 *  f.f.a.e.f.q
 *  f.f.a.e.f.r
 *  f.f.a.i.b
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Queue
 *  java.util.concurrent.atomic.AtomicInteger
 */
package f.f.a.n.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import f.f.a.e.d.e;
import f.f.a.e.f.h;
import f.f.a.e.f.q;
import f.f.a.e.f.r;
import f.f.a.n.a.d;
import f.f.a.n.b.a;
import f.f.a.s.a$b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class a {
    private static f.f.a.s.d.c C;
    public static String D;
    private static Map<String, Integer> E;
    public static Map<String, Object> F;
    volatile boolean A = false;
    volatile boolean B = false;
    private Context a;
    private d b;
    private f.f.a.s.d.a c;
    private f.f.a.s.g.a d;
    private volatile c e;
    private String f;
    private volatile String g;
    private Handler h = new Handler(Looper.getMainLooper()){

        /*
         * Unable to fully structure code
         * Enabled aggressive exception aggregation
         */
        public final void handleMessage(Message var1) {
            var2_2 = var1.what;
            var3_3 = "";
            switch (var2_2) {
                default: {
                    return;
                }
                case 1001002: {
                    var17_4 = a.b() != null ? a.b().c() : 0;
                    if (a.c(a.this) == null) ** GOTO lbl74
                    if (a.c(a.this).c()) {
                        if (a.d(a.this) == null) break;
                        h.a((String)"RewardVideoController", (String)"load timeout task called for onVideoLoadSuccess by isReady exception");
                        var27_5 = f.f.a.e.c.a.i().e();
                        var28_6 = new StringBuilder();
lbl14: // 4 sources:
                        do {
                            var28_6.append("load timeout task called onVideoLoadSuccess after ");
                            var28_6.append(var17_4);
                            var28_6.append("s exception");
                            f.f.a.n.c.a.c(var27_5, var28_6.toString(), a.g(a.this), a.i(a.this), var3_3);
                            f.f.a.n.c.a.a(a.j(a.this), (List<f.f.a.e.e.a>)a.a(a.this), a.g(a.this));
                            c.b(a.d(a.this), a.f(a.this), a.g(a.this));
                            return;
                            break;
                        } while (true);
                    }
                    if (!a.c(a.this).e(false)) ** GOTO lbl51
                    if (!a.c(a.this).c()) ** GOTO lbl30
                    if (a.d(a.this) == null) break;
                    h.a((String)"RewardVideoController", (String)"load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState exception");
                    a.c(a.this).c(false);
                    var27_5 = f.f.a.e.c.a.i().e();
                    var28_6 = new StringBuilder();
                    ** GOTO lbl14
lbl30: // 1 sources:
                    a.c(a.this).d(false);
                    if (!a.c(a.this).e(true)) ** GOTO lbl45
                    if (!a.c(a.this).c()) ** GOTO lbl39
                    if (a.d(a.this) == null) break;
                    h.a((String)"RewardVideoController", (String)"load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState exception");
                    a.c(a.this).c(true);
                    var27_5 = f.f.a.e.c.a.i().e();
                    var28_6 = new StringBuilder();
                    ** GOTO lbl14
lbl39: // 1 sources:
                    if (a.d(a.this) == null) ** GOTO lbl65
                    var23_7 = new StringBuilder();
                    var23_7.append("load timeout task called for onVideoLoadFail after ");
                    var23_7.append(var17_4);
                    var23_7.append("s exception");
                    ** GOTO lbl64
lbl45: // 1 sources:
                    if (a.d(a.this) == null) break;
                    var19_8 = new StringBuilder();
                    var19_8.append("load timeout task called for onVideoLoadFail after ");
                    var19_8.append(var17_4);
                    var19_8.append("s exception");
                    ** GOTO lbl72
lbl51: // 1 sources:
                    if (!a.c(a.this).e(true)) ** GOTO lbl67
                    if (a.c(a.this).c()) {
                        if (a.d(a.this) == null) break;
                        h.a((String)"RewardVideoController", (String)"load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState");
                        a.c(a.this).c(true);
                        var27_5 = f.f.a.e.c.a.i().e();
                        var28_6 = new StringBuilder();
                        ** continue;
                    }
                    if (a.d(a.this) == null) ** GOTO lbl65
                    var23_7 = new StringBuilder();
                    var23_7.append("load timeout task called for onVideoLoadFail after ");
                    var23_7.append(var17_4);
                    var23_7.append(" s");
lbl64: // 2 sources:
                    h.a((String)"RewardVideoController", (String)var23_7.toString());
lbl65: // 3 sources:
                    a.c(a.this).d(true);
                    return;
lbl67: // 1 sources:
                    if (a.d(a.this) == null) break;
                    var19_8 = new StringBuilder();
                    var19_8.append("load timeout task called for onVideoLoadFail after ");
                    var19_8.append(var17_4);
                    var19_8.append(" s");
lbl72: // 2 sources:
                    var18_9 = var19_8.toString();
                    ** GOTO lbl76
lbl74: // 1 sources:
                    if (a.d(a.this) == null) break;
                    var18_9 = "load timeout task called for onVideoLoadFail by mRewardMvVideoAdapter is null exception";
lbl76: // 2 sources:
                    h.a((String)"RewardVideoController", (String)var18_9);
                    return;
                }
                case 1001001: {
                    a.this.a(false);
                    return;
                }
                case 18: {
                    if (a.h(a.this) == null || !a.e(a.this)) break;
                    var16_10 = var1.obj;
                    if (var16_10 instanceof String) {
                        var3_3 = var16_10.toString();
                    }
                    f.f.a.s.a.a();
                    f.f.a.s.a.b();
                    try {
                        a.h(a.this).a(var3_3);
                        return;
                    }
                    catch (Exception var9_11) {
                        if (!f.f.a.a.a) break;
lbl93: // 4 sources:
                        do {
                            var9_12.printStackTrace();
                            return;
                            break;
                        } while (true);
                    }
                }
                case 17: {
                    if (a.h(a.this) == null || !a.e(a.this)) break;
                    var12_16 = var1.obj;
                    var13_17 = var12_16 instanceof String != false ? var12_16.toString() : var3_3;
                    var14_18 = var1.getData();
                    if (var14_18 != null && var14_18.containsKey(f.f.a.a.j) && !TextUtils.isEmpty((CharSequence)(var15_19 = var14_18.getString(f.f.a.a.j)))) {
                        var3_3 = var15_19;
                    }
                    try {
                        a.h(a.this).a(var3_3, var13_17);
                        return;
                    }
                    catch (Exception var9_13) {
                        if (!f.f.a.a.a) break;
                        ** GOTO lbl93
                    }
                }
                case 16: {
                    if (a.h(a.this) == null || !a.e(a.this)) break;
                    var11_20 = var1.obj;
                    if (var11_20 instanceof String) {
                        var3_3 = var11_20.toString();
                    }
                    f.f.a.s.a.a();
                    f.f.a.s.a.b();
                    try {
                        a.h(a.this).a(var3_3);
                        return;
                    }
                    catch (Exception var9_14) {
                        if (!f.f.a.a.a) break;
                        ** GOTO lbl93
                    }
                }
                case 9: {
                    if (a.h(a.this) == null || !a.e(a.this)) break;
                    var6_21 = var1.obj;
                    var7_22 = var6_21 instanceof String != false ? var6_21.toString() : var3_3;
                    var8_23 = var1.getData();
                    if (var8_23 != null && var8_23.containsKey(f.f.a.a.j) && !TextUtils.isEmpty((CharSequence)(var10_24 = var8_23.getString(f.f.a.a.j)))) {
                        var3_3 = var10_24;
                    }
                    try {
                        a.h(a.this).b(var3_3, var7_22);
                        return;
                    }
                    catch (Exception var9_15) {
                        if (!f.f.a.a.a) break;
                        ** continue;
                    }
                }
                case 8: {
                    if (a.a(a.this) == null || a.a(a.this).size() <= 0) break;
                    var4_25 = a.b(a.this) != null && a.b(a.this).size() > 0 ? true ^ TextUtils.isEmpty((CharSequence)((f.f.a.e.e.a)a.b(a.this).get(0)).p0()) : false;
                    var5_26 = ((f.f.a.e.e.a)a.a(a.this).get(0)).v0();
                    if (a.c(a.this) != null && a.c(a.this).a((List<f.f.a.e.e.a>)a.a(a.this), var4_25, var5_26)) {
                        if (a.d(a.this) == null || !a.e(a.this)) break;
                        c.a(a.d(a.this), a.f(a.this), a.g(a.this));
                        return;
                    }
                    if (a.d(a.this) == null || !a.e(a.this)) break;
                    f.f.a.s.a.a();
                    f.f.a.s.a.b();
                    c.a(a.d(a.this), "load timeout");
                }
            }
        }
    };
    private int i = 2;
    private boolean j = false;
    private boolean k = false;
    private boolean l;
    private Queue<Integer> m;
    private String n;
    private f.f.a.e.d.h o = null;
    private volatile boolean p = true;
    private volatile boolean q = false;
    private volatile boolean r = false;
    private volatile boolean s = false;
    private volatile boolean t = false;
    private volatile boolean u = false;
    private List<f.f.a.e.e.a> v;
    private List<f.f.a.e.e.a> w;
    volatile boolean x = false;
    volatile boolean y = false;
    volatile boolean z = false;

    static {
        E = new HashMap();
        F = new HashMap();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(String string2) {
        if (!r.b((String)string2)) return 0;
        if (E == null) return 0;
        if (!E.containsKey((Object)string2)) return 0;
        Integer n2 = (Integer)E.get((Object)string2);
        if (n2 == null) return 0;
        try {
            return n2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }

    public static f.f.a.s.d.c a() {
        return C;
    }

    static /* synthetic */ List a(a a2) {
        return a2.v;
    }

    public static void a(String string2, int n2) {
        try {
            if (E != null && r.b((String)string2)) {
                E.put((Object)string2, (Object)n2);
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static /* synthetic */ f.f.a.s.d.c b() {
        return C;
    }

    static /* synthetic */ List b(a a2) {
        return a2.w;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void b(boolean bl, String string2) {
        if (this.e == null) return;
        if (!this.k) {
            this.u = a.super.b(this.f);
            if (this.u) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\u672c\u5730\u5b58\u5728\u53ef\u7528\u7684\u7f13\u5b58: ");
                stringBuilder.append(this.v.size());
                stringBuilder.append(" \u6761");
                h.a((String)"RewardVideoController", (String)stringBuilder.toString());
                h.a((String)"RewardVideoController", (String)"\u672c\u5730\u5b58\u5728\u53ef\u7528\u7684\u7f13\u5b58\uff0c\u975e BID Campaign");
                if (!a.super.g()) {
                    h.a((String)"RewardVideoController", (String)"\u672c\u5730\u5b58\u5728\u53ef\u7528\u7684\u7f13\u5b58\uff0c\u6ca1\u6709\u8d85\u8fc7\u4e0a\u9650\uff0c\u5e76\u9884\u52a0\u8f7d\u5404\u79cd\u8d44\u6e90");
                    List<f.f.a.e.e.a> list = this.v;
                    if (list == null) return;
                    if (list.size() <= 0) {
                        return;
                    }
                    c.c(this.e, this.g, this.f);
                    h.a((String)"RewardVideoController", (String)"\u975eBID\uff0c\u672c\u5730\u5b58\u5728\u53ef\u7528\u7684\u7f13\u5b58\uff0c\u6ca1\u6709\u8d85\u8fc7\u4e0a\u9650\uff0c\u56de\u8c03 onCampaignLoadSuccess\uff0c\u5f00\u59cb\u9884\u52a0\u8f7d\u8d44\u6e90");
                    (f.f.a.e.e.a)list.get(0);
                    this.e.a(this.k);
                    throw null;
                }
                this.u = false;
                h.a((String)"RewardVideoController", (String)"\u975eBID\uff0c\u672c\u5730\u5b58\u5728\u53ef\u7528\u7684\u7f13\u5b58\uff0c\u8d85\u8fc7\u4e0a\u9650");
                d d2 = this.b;
                if (d2 != null) {
                    d2.a(this.v);
                }
                this.e.a(this.k);
                throw null;
            }
            h.a((String)"RewardVideoController", (String)"\u975eBID\uff0c\u4e0d\u5b58\u5728\u53ef\u7528\u7684\u7f13\u5b58");
            this.u = false;
            d d3 = this.b;
            if (d3 != null) {
                d3.a(this.v);
            }
            this.e.a(this.k);
            throw null;
        }
        List<f.f.a.e.e.a> list = a$b.a().a(this.f, string2);
        a$b.a().b(this.f, string2);
        if (list != null && list.size() > 0) {
            h.a((String)"RewardVideoController", (String)"BID\uff0c\u672c\u5730\u5b58\u5728\u53ef\u7528\u7684\u7f13\u5b58");
            if (a.super.g()) {
                h.a((String)"RewardVideoController", (String)"BID\uff0c\u672c\u5730\u5b58\u5728\u53ef\u7528\u7684\u7f13\u5b58\uff0c\u8d85\u8fc7\u4e0a\u9650");
                a$b.a().c(this.f, string2);
                this.u = false;
                d d4 = this.b;
                if (d4 != null) {
                    d4.a(list);
                }
                this.e.a(this.k);
                throw null;
            }
            h.a((String)"RewardVideoController", (String)"BID\uff0c\u672c\u5730\u5b58\u5728\u53ef\u7528\u7684\u7f13\u5b58\uff0c\u6ca1\u6709\u8d85\u8fc7\u4e0a\u9650\uff0c\u56de\u8c03 onCampaignLoadSuccess\uff0c\u5f00\u59cb\u9884\u52a0\u8f7d\u8d44\u6e90");
            this.u = true;
            this.e.a(this.k);
            throw null;
        }
        h.a((String)"RewardVideoController", (String)"BID\uff0c\u4e0d\u5b58\u5728\u53ef\u7528\u7684\u7f13\u5b58");
        a$b.a().c(this.f, string2);
        this.u = false;
        this.e.a(this.k);
        throw null;
    }

    /*
     * Exception decompiling
     */
    private boolean b(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl39.1 : INVOKESTATIC : trying to set 1 previously set to 0
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

    static /* synthetic */ d c(a a2) {
        return a2.b;
    }

    private void c() {
        e.a(f.f.a.e.d.h.a(this.a)).a(this.f);
    }

    static /* synthetic */ c d(a a2) {
        return a2.e;
    }

    /*
     * Exception decompiling
     */
    private void d() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl112.1 : RETURN : trying to set 1 previously set to 0
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void e() {
        int n2;
        List<f.f.a.s.b.b> list = C.x();
        if (list == null) return;
        try {
            if (list.size() <= 0) return;
            n2 = 0;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        do {
            if (n2 >= list.size()) return;
            f.f.a.s.b.b b2 = (f.f.a.s.b.b)list.get(n2);
            Context context = this.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.g);
            stringBuilder.append("_");
            stringBuilder.append(b2.a());
            q.a((Context)context, (String)stringBuilder.toString(), (Object)0);
            ++n2;
        } while (true);
    }

    static /* synthetic */ boolean e(a a2) {
        return a2.l;
    }

    static /* synthetic */ String f(a a2) {
        return a2.g;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean f() {
        List<f.f.a.s.b.b> list;
        Map<String, Integer> map;
        try {
            list = C.x();
            map = this.c.g();
            if (list == null || list.size() <= 0) return true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            h.d((String)"RewardVideoController", (String)exception.getMessage());
            return true;
        }
        for (int i2 = 0; i2 < list.size(); ++i2) {
            int n2;
            f.f.a.s.b.b b2 = (f.f.a.s.b.b)list.get(i2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b2.a());
            stringBuilder.append("");
            if (map.containsKey((Object)stringBuilder.toString())) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(b2.a());
                stringBuilder2.append("");
                n2 = (Integer)map.get((Object)stringBuilder2.toString());
            } else {
                n2 = 0;
            }
            Context context = this.a;
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(this.g);
            stringBuilder3.append("_");
            stringBuilder3.append(b2.a());
            Object object = q.b((Context)context, (String)stringBuilder3.toString(), (Object)0);
            int n3 = object != null ? (Integer)object : 0;
            if (n3 >= n2) continue;
            return false;
        }
        return true;
    }

    static /* synthetic */ String g(a a2) {
        return a2.f;
    }

    /*
     * Exception decompiling
     */
    private boolean g() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl42 : ICONST_0 : trying to set 1 previously set to 0
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

    static /* synthetic */ f.f.a.s.g.a h(a a2) {
        return a2.d;
    }

    static /* synthetic */ boolean i(a a2) {
        return a2.k;
    }

    static /* synthetic */ Context j(a a2) {
        return a2.a;
    }

    public final void a(boolean bl) {
        this.a(bl, "");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean bl, String string2) {
        block25 : {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\u53d1\u8d77\u4e00\u6b21 load\uff1a isDevCall ");
            stringBuilder.append(bl);
            stringBuilder.append(" ");
            stringBuilder.append(string2);
            h.a((String)"RewardVideoController", (String)stringBuilder.toString());
            if (this.e != null && this.e.b.get() == 1) {
                String string3;
                if (this.l) {
                    if (bl) {
                        h.a((String)"RewardVideoController", (String)"\u672c\u5730\u5b58\u5728\u7531\u5f00\u53d1\u8005\u53d1\u8d77\u7684load\uff0c\u6b64\u6b21 load \u4e5f\u662f\u5f00\u53d1\u8005\u53d1\u8d77\u7684\uff0c\u56de\u8c03 CURRENT_UNIT_IS_LOADING");
                        f.f.a.n.c.a.b(this.a, "current unit is loading", this.f, this.k, "");
                        this.e.a("errorCode: 3501 errorMessage: current unit is loading");
                        return;
                    }
                    string3 = "\u672c\u5730\u5b58\u5728\u7531\u5f00\u53d1\u8005\u53d1\u8d77\u7684load\uff0c\u6b64\u6b21 load \u662f\u81ea\u52a8 load\uff0c\u4e0d\u505a\u4efb\u4f55\u5904\u7406";
                } else {
                    if (bl) {
                        h.a((String)"RewardVideoController", (String)"\u672c\u5730\u5b58\u5728\u7531\u81ea\u52a8 load \u53d1\u8d77\u7684load\uff0c\u6b64\u6b21 load \u662f\u5f00\u53d1\u8005\u53d1\u8d77\u7684\uff0c\u5c06\u56de\u8c03\u8f6c\u79fb\u7ed9\u5f00\u53d1\u8005");
                        this.l = bl;
                        return;
                    }
                    string3 = "\u672c\u5730\u5b58\u5728\u7531\u81ea\u52a8 load \u53d1\u8d77\u7684load\uff0c\u6b64\u6b21 load \u662f\u81ea\u52a8 load \u53d1\u8d77\u7684\uff0c\u4e0d\u505a\u4efb\u4f55\u5904\u7406";
                }
                h.a((String)"RewardVideoController", (String)string3);
                return;
            }
            if (this.e != null && this.e.b.get() == 3) {
                this.p = false;
            } else {
                this.p = true;
                this.e.b.set(1);
            }
            this.l = bl;
            this.h.removeMessages(1001001);
            this.r = false;
            this.q = false;
            this.s = false;
            this.t = false;
            a.super.d();
            a.super.c();
            f.f.a.n.a.c.b().a();
            if (TextUtils.isEmpty((CharSequence)string2)) {
                if (this.j) {
                    f.f.a.i.b.a().a(this.g, this.f);
                } else {
                    f.f.a.i.b.a().b(this.g, this.f);
                }
            }
            if (this.k && TextUtils.isEmpty((CharSequence)string2)) {
                if (this.e == null) return;
                f.f.a.n.c.a.b(this.a, "bidToken is empty", this.f, this.k, "");
                c.c(this.e, "bidToken is empty");
                return;
            }
            if (f.f.a.p.b.a == null) {
                if (this.e == null) return;
                f.f.a.n.c.a.b(this.a, "init error", this.f, this.k, "");
                c.c(this.e, "init error");
                h.a((String)"RewardVideoController", (String)"SDK \u521d\u59cb\u5316\u9519\u8bef");
                return;
            }
            C = f.f.a.s.d.b.c().a(f.f.a.e.c.a.i().f(), this.f);
            if (C == null) {
                h.a((String)"RewardVideoController", (String)"\u5f53\u524d RewardUnitSetting \u4e3a\u7a7a\uff0c\u8bf7\u6c42\u65b0\u7684\u914d\u7f6e\u4fe1\u606f");
                this.n = f.f.a.e.c.a.i().f();
                f.f.a.s.d.b.c().a(this.n, f.f.a.e.c.a.i().g(), this.f, new f.f.a.s.c.c((a)this){

                    public final void a(String string2) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("RewardUnitSetting \u8bf7\u6c42\u5931\u8d25\uff1a ");
                        stringBuilder.append(string2);
                        h.a((String)"RewardVideoController", (String)stringBuilder.toString());
                    }

                    public final void b(String string2) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("RewardUnitSetting \u8bf7\u6c42\u6210\u529f\uff1a ");
                        stringBuilder.append(string2);
                        h.a((String)"RewardVideoController", (String)stringBuilder.toString());
                    }
                });
                C = f.f.a.s.d.b.c().a(f.f.a.e.c.a.i().f(), this.f, this.j);
            }
            if (!TextUtils.isEmpty((CharSequence)this.g)) {
                C.a(this.g);
            }
            int n2 = 1000 * C.c();
            if (this.h != null) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("start load timeout for ");
                stringBuilder2.append(n2);
                stringBuilder2.append(" ms");
                h.a((String)"RewardVideoController", (String)stringBuilder2.toString());
                this.h.sendEmptyMessageDelayed(1001002, (long)n2);
            }
            this.m = C.b();
            try {
                if (a.super.f()) {
                    h.a((String)"RewardVideoController", (String)"\u5f53\u524d cap \u5168\u6ee1\uff0c\u6e05\u9664\u6240\u6709\u7684 cap");
                    a.super.e();
                }
            }
            catch (Exception exception) {
                if (!f.f.a.a.a) break block25;
                exception.printStackTrace();
            }
        }
        try {
            a.super.b(bl, string2);
            return;
        }
        catch (Exception exception) {
            try {
                Context context = this.a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("load exception: ");
                stringBuilder.append(exception.getMessage());
                f.f.a.n.c.a.c(context, stringBuilder.toString(), this.f, this.k, "");
                if (this.e == null) return;
                c.a(this.e, "load exception");
                return;
            }
            catch (Exception exception2) {
                if (this.e != null) {
                    c.a(this.e, "load exception");
                    Context context2 = this.a;
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("load exception ");
                    stringBuilder3.append(exception2.getMessage());
                    f.f.a.n.c.a.b(context2, stringBuilder3.toString(), this.f, this.k, "");
                }
                if (!f.f.a.a.a) return;
                exception2.printStackTrace();
            }
        }
    }

    private final class c {
        private WeakReference<f.f.a.s.g.a> a;
        private volatile AtomicInteger b;
        private Handler c;
        final /* synthetic */ a d;

        static /* synthetic */ void a(c c2, String string2) {
            Handler handler = c2.c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\u6536\u5230 onVideoLoadFail\uff0c\u5f53\u524d\u72b6\u6001\uff1a ");
            stringBuilder.append(c2.b.get());
            stringBuilder.append(" hasCalledVideoLoadFail: ");
            stringBuilder.append(c2.d.s);
            stringBuilder.append(" ");
            stringBuilder.append(string2);
            h.a((String)"RewardVideoController_Listener", (String)stringBuilder.toString());
            WeakReference<f.f.a.s.g.a> weakReference = c2.a;
            if (weakReference != null && weakReference.get() != null && (c2.b.get() == 1 || c2.b.get() == 3) && c2.c != null) {
                c2.d.s = true;
                if (!c2.d.u || string2.equals((Object)"resource load timeout")) {
                    c2.d.t = true;
                }
                if (c2.d.r) {
                    c2.b.set(2);
                }
                if (c2.d.s && c2.d.t && !c2.d.r) {
                    c2.b.set(2);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("\u6536\u5230 onVideoLoadFail\uff0c\u5f53\u524d\u72b6\u6001\uff1a ");
                    stringBuilder2.append(c2.b.get());
                    stringBuilder2.append(" hasCalledVideoLoadFail: ");
                    stringBuilder2.append(c2.d.s);
                    stringBuilder2.append(" ");
                    stringBuilder2.append(string2);
                    stringBuilder2.append(" \u54cd\u5e94");
                    h.d((String)"RewardVideoController_Listener", (String)stringBuilder2.toString());
                    Message message = Message.obtain();
                    message.obj = string2;
                    message.what = 16;
                    c2.c.sendMessage(message);
                    return;
                }
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("\u6536\u5230 onVideoLoadFail\uff0c\u5f53\u524d\u72b6\u6001\uff1a ");
                stringBuilder3.append(c2.b.get());
                stringBuilder3.append(" hasCalledVideoLoadFail: ");
                stringBuilder3.append(c2.d.s);
                stringBuilder3.append(" ");
                stringBuilder3.append(string2);
                stringBuilder3.append(" \u65e0\u9700\u54cd\u5e94");
                h.a((String)"RewardVideoController_Listener", (String)stringBuilder3.toString());
            }
        }

        static /* synthetic */ void a(c c2, String string2, String string3) {
            Handler handler = c2.c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\u6536\u5230 onVideoLoadSuccess\uff0c\u5f53\u524d\u72b6\u6001\uff1a ");
            stringBuilder.append(c2.b.get());
            stringBuilder.append(" hasCalledVideoLoadSuccess: ");
            stringBuilder.append(c2.d.r);
            h.a((String)"RewardVideoController_Listener", (String)stringBuilder.toString());
            WeakReference<f.f.a.s.g.a> weakReference = c2.a;
            if (weakReference != null && weakReference.get() != null && (c2.b.get() == 1 || c2.b.get() == 3) && c2.c != null) {
                c2.b.set(2);
                if (!c2.d.r) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("\u6536\u5230 onVideoLoadSuccess\uff0c\u5f53\u524d\u72b6\u6001\uff1a ");
                    stringBuilder2.append(c2.b.get());
                    stringBuilder2.append(" hasCalledVideoLoadSuccess: ");
                    stringBuilder2.append(c2.d.r);
                    stringBuilder2.append(" \u54cd\u5e94");
                    h.d((String)"RewardVideoController_Listener", (String)stringBuilder2.toString());
                    c2.d.r = true;
                    Message message = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(f.f.a.a.j, string2);
                    bundle.putString("unit_id", string3);
                    message.setData(bundle);
                    message.obj = string3;
                    message.what = 9;
                    c2.c.sendMessage(message);
                    return;
                }
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("\u6536\u5230 onVideoLoadSuccess\uff0c\u5f53\u524d\u72b6\u6001\uff1a ");
                stringBuilder3.append(c2.b.get());
                stringBuilder3.append(" hasCalledVideoLoadSuccess: ");
                stringBuilder3.append(c2.d.r);
                stringBuilder3.append(" \u65e0\u9700\u54cd\u5e94");
                h.a((String)"RewardVideoController_Listener", (String)stringBuilder3.toString());
            }
        }

        private void a(String string2) {
            if (this.c != null) {
                Message message = Message.obtain();
                message.obj = string2;
                message.what = 18;
                this.c.sendMessage(message);
            }
        }

        static /* synthetic */ void b(c c2, String string2, String string3) {
            Handler handler = c2.c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\u6536\u5230 onVideoLoadSuccessForCache\uff0c\u5f53\u524d\u72b6\u6001\uff1a ");
            stringBuilder.append(c2.b.get());
            stringBuilder.append(" hasCalledVideoLoadSuccess: ");
            stringBuilder.append(c2.d.r);
            h.a((String)"RewardVideoController_Listener", (String)stringBuilder.toString());
            WeakReference<f.f.a.s.g.a> weakReference = c2.a;
            if (weakReference != null && weakReference.get() != null && (c2.b.get() == 1 || c2.b.get() == 3) && c2.c != null) {
                if (c2.b.get() == 1) {
                    c2.b.set(3);
                }
                if (!c2.d.r) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("\u6536\u5230 onVideoLoadSuccessForCache\uff0c\u5f53\u524d\u72b6\u6001\uff1a ");
                    stringBuilder2.append(c2.b.get());
                    stringBuilder2.append(" hasCalledVideoLoadSuccess: ");
                    stringBuilder2.append(c2.d.r);
                    stringBuilder2.append(" \u54cd\u5e94");
                    h.d((String)"RewardVideoController_Listener", (String)stringBuilder2.toString());
                    c2.d.r = true;
                    Message message = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(f.f.a.a.j, string2);
                    bundle.putString("unit_id", string3);
                    message.setData(bundle);
                    message.obj = string3;
                    message.what = 9;
                    c2.c.sendMessage(message);
                    if (c2.d.s) {
                        c2.b.set(2);
                        return;
                    }
                } else {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("\u6536\u5230 onVideoLoadSuccessForCache\uff0c\u5f53\u524d\u72b6\u6001\uff1a ");
                    stringBuilder3.append(c2.b.get());
                    stringBuilder3.append(" hasCalledVideoLoadSuccess: ");
                    stringBuilder3.append(c2.d.r);
                    stringBuilder3.append(" \u65e0\u9700\u54cd\u5e94");
                    h.a((String)"RewardVideoController_Listener", (String)stringBuilder3.toString());
                }
            }
        }

        static /* synthetic */ void c(c c2, String string2) {
            c2.b.set(2);
            c2.a(string2);
        }

        static /* synthetic */ void c(c c2, String string2, String string3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\u6536\u5230 onCampaignLoadSuccessForCache\uff0c\u5f53\u524d\u72b6\u6001\uff1a ");
            stringBuilder.append(c2.b.get());
            stringBuilder.append(" hasCalledCampaignLoadSuccess: ");
            stringBuilder.append(c2.d.q);
            h.a((String)"RewardVideoController_Listener", (String)stringBuilder.toString());
            WeakReference<f.f.a.s.g.a> weakReference = c2.a;
            if (weakReference != null && weakReference.get() != null && c2.c != null) {
                if (!c2.d.q) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("\u6536\u5230 onCampaignLoadSuccessForCache\uff0c\u5f53\u524d\u72b6\u6001\uff1a ");
                    stringBuilder2.append(c2.b.get());
                    stringBuilder2.append(" hasCalledCampaignLoadSuccess: ");
                    stringBuilder2.append(c2.d.q);
                    stringBuilder2.append(" \u54cd\u5e94");
                    h.d((String)"RewardVideoController_Listener", (String)stringBuilder2.toString());
                    c2.d.q = true;
                    Message message = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(f.f.a.a.j, string2);
                    bundle.putString("unit_id", string3);
                    message.setData(bundle);
                    message.obj = string3;
                    message.what = 17;
                    c2.c.sendMessage(message);
                    return;
                }
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("\u6536\u5230 onCampaignLoadSuccessForCache\uff0c\u5f53\u524d\u72b6\u6001\uff1a ");
                stringBuilder3.append(c2.b.get());
                stringBuilder3.append(" hasCalledCampaignLoadSuccess: ");
                stringBuilder3.append(c2.d.q);
                stringBuilder3.append(" \u65e0\u9700\u54cd\u5e94");
                h.a((String)"RewardVideoController_Listener", (String)stringBuilder3.toString());
            }
        }

        public final void a(boolean bl) {
            throw null;
        }
    }

}

