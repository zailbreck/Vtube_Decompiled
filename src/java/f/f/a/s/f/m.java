/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  f.f.a.a
 *  f.f.a.e.c.a
 *  f.f.a.e.e.a
 *  f.f.a.e.e.a$b
 *  f.f.a.e.f.d
 *  f.f.a.e.f.h
 *  f.f.a.e.f.r
 *  f.f.a.f.c
 *  f.f.a.f.d
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.CopyOnWriteArrayList
 *  java.util.concurrent.ExecutorService
 */
package f.f.a.s.f;

import android.content.Context;
import android.text.TextUtils;
import f.f.a.e.e.a;
import f.f.a.e.f.h;
import f.f.a.e.f.r;
import f.f.a.s.f.c;
import f.f.a.s.f.d;
import f.f.a.s.f.g;
import f.f.a.s.f.i;
import f.f.a.s.f.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

public final class m {
    private List<f.f.a.e.e.a> a = new ArrayList();
    private boolean b = true;
    private f.f.a.s.g.b c;
    private ConcurrentHashMap<String, f.f.a.s.g.b> d;
    private d e = new d(this){
        final /* synthetic */ m a;
        {
            this.a = m2;
        }

        public final void a(long l2, int n2) {
            if (n2 == 5 || n2 == 4 || n2 == 6) {
                m.a(this.a, true);
                this.a.a();
            }
            if (n2 == 2) {
                m.a(this.a, true);
            }
        }
    };
    private CopyOnWriteArrayList<Map<String, f.f.a.s.f.a>> f = new CopyOnWriteArrayList();
    private Context g = f.f.a.e.c.a.i().e();
    private ExecutorService h;
    private long i = 3600L;
    private String j;
    private f.f.a.s.d.c k;
    private int l = 2;
    private int m = 1;
    f.f.a.f.d n = null;
    f.f.a.f.d o = null;

    public m(Context context, List<f.f.a.e.e.a> list, ExecutorService executorService, String string2, int n2) {
        List<f.f.a.e.e.a> list2 = this.a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.h = executorService;
        this.j = string2;
        this.m = n2;
        this.b(this.a);
    }

    private int a(f.f.a.e.e.a a2) {
        String string2;
        int n2;
        block2 : {
            StringBuilder stringBuilder;
            block3 : {
                block0 : {
                    block1 : {
                        if (a2 == null || TextUtils.isEmpty((CharSequence)a2.p0())) break block0;
                        if (a2.J0() == -1) break block1;
                        n2 = a2.J0();
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("ready_rate(campaign): ");
                        stringBuilder2.append(n2);
                        string2 = stringBuilder2.toString();
                        break block2;
                    }
                    n2 = m.super.d(a2);
                    stringBuilder = new StringBuilder();
                    break block3;
                }
                n2 = m.super.d(a2);
                stringBuilder = new StringBuilder();
            }
            stringBuilder.append("ready_rate(reward_unit_setting): ");
            stringBuilder.append(n2);
            string2 = stringBuilder.toString();
        }
        h.a((String)"UnitCacheCtroller", (String)string2);
        return n2;
    }

    static /* synthetic */ f.f.a.s.g.b a(m m2) {
        return m2.c;
    }

    private boolean a(int n2, f.f.a.e.e.a a2, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("check template ");
        stringBuilder.append(string2);
        h.a((String)"UnitCacheCtroller", (String)stringBuilder.toString());
        if (!TextUtils.isEmpty((CharSequence)string2) && a2.m0() == 0) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("check template \u4e0b\u8f7d\u60c5\u51b5\uff1a");
            stringBuilder2.append(g.a().a(string2));
            h.a((String)"UnitCacheCtroller", (String)stringBuilder2.toString());
            if (g.a().a(string2) == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(f.f.a.s.f.a a2, int n2) {
        long l2 = a2.n();
        long l3 = a2.e();
        a2.l().e();
        if (TextUtils.isEmpty((CharSequence)a2.a())) {
            h.a((String)"UnitCacheCtroller", (String)"checkVideoDownload video done return true");
            return true;
        }
        if (n2 == 0) {
            if (a2.l() != null && !TextUtils.isEmpty((CharSequence)a2.l().d1())) {
                return true;
            }
        } else if (l3 > 0L && l2 * 100L >= l3 * (long)n2) {
            if (n2 == 100) {
                if (a2.i() == 5) {
                    return true;
                }
                a2.p();
                return false;
            }
            return true;
        }
        return false;
    }

    static /* synthetic */ boolean a(m m2, boolean bl) {
        m2.b = bl;
        return bl;
    }

    private boolean a(String string2, f.f.a.e.e.a a2) {
        block4 : {
            if (!r.a((String)string2)) break block4;
            h.b((String)"UnitCacheCtroller", (String)"checkEndcardDownload endcardUrl is null return true");
            return true;
        }
        try {
            if (m.super.b(string2, a2)) {
                h.b((String)"UnitCacheCtroller", (String)"checkEndcardDownload endcardUrl done return true");
                return true;
            }
        }
        catch (Throwable throwable) {
            h.b((String)"UnitCacheCtroller", (String)throwable.getMessage(), (Throwable)throwable);
        }
        h.b((String)"UnitCacheCtroller", (String)"checkEndcardDownload endcardUrl return false");
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean a(CopyOnWriteArrayList<Map<String, f.f.a.s.f.a>> copyOnWriteArrayList) {
        try {
            for (Map map : copyOnWriteArrayList) {
                if (map == null) continue;
                Iterator iterator = map.entrySet().iterator();
                while (iterator.hasNext()) {
                    int n2 = ((f.f.a.s.f.a)((Map.Entry)iterator.next()).getValue()).i();
                    if (n2 != 1) continue;
                    return true;
                }
            }
            return false;
        }
        catch (Throwable throwable) {
            if (!f.f.a.a.a) return false;
            throwable.printStackTrace();
        }
        return false;
    }

    static /* synthetic */ ConcurrentHashMap b(m m2) {
        return m2.d;
    }

    /*
     * Exception decompiling
     */
    private void b(List<f.f.a.e.e.a> var1) {
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

    private boolean b(f.f.a.e.e.a a2) {
        block4 : {
            if (a2 != null) {
                try {
                    int n2 = a2.D0();
                    if (n2 == 2) {
                        return true;
                    }
                }
                catch (Throwable throwable) {
                    if (!f.f.a.a.a) break block4;
                    throwable.printStackTrace();
                }
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean b(String string2, f.f.a.e.e.a a2) {
        String string3;
        if (a2.m1()) {
            string3 = "Campaign is Mraid, do not need download endcardurl or Campaign load timeout";
        } else {
            StringBuilder stringBuilder;
            String string4;
            if (a2.m0() == 1 && !m.super.b(a2)) {
                return true;
            }
            if (r.b((String)g.a().a(string2))) {
                stringBuilder = new StringBuilder();
                string4 = "endcard zip \u4e0b\u8f7d\u5b8c\u6210 return true endcardUrl:";
            } else {
                if (!r.b((String)i.a.a.a(string2))) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("checkEndcardZipOrSourceDownLoad endcardUrl return false endcardUrl:");
                    stringBuilder2.append(string2);
                    h.b((String)"UnitCacheCtroller", (String)stringBuilder2.toString());
                    return false;
                }
                stringBuilder = new StringBuilder();
                string4 = "endcard url \u6e90\u7801 \u4e0b\u8f7d\u5b8c\u6210 return true endcardUrl:";
            }
            stringBuilder.append(string4);
            stringBuilder.append(string2);
            string3 = stringBuilder.toString();
        }
        h.b((String)"UnitCacheCtroller", (String)string3);
        return true;
    }

    /*
     * Exception decompiling
     */
    private int c(f.f.a.e.e.a var1) {
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void c() {
        block11 : {
            var1_1 = this.f;
            if (var1_1 == null) return;
            ** try [egrp 0[TRYBLOCK] [0 : 9->14)] { 
lbl4: // 1 sources:
            break block11;
lbl5: // 1 sources:
            catch (Throwable var2_8) {
                var2_8.printStackTrace();
            }
            return;
        }
        var12_2 = var1_1;
        // MONITORENTER : var12_2
        var4_3 = System.currentTimeMillis();
        var6_4 = 0;
        do {
            if (var6_4 >= this.f.size()) {
                // MONITOREXIT : var12_2
                return;
            }
            var7_7 = (Map)this.f.get(var6_4);
            var8_5 = var7_7.entrySet().iterator();
            while (var8_5.hasNext()) {
                var9_6 = (f.f.a.s.f.a)((Map.Entry)var8_5.next()).getValue();
                if (var9_6 == null) continue;
                if (var4_3 - var9_6.c() > 1000L * this.i && var9_6.i() == 1) {
                    var9_6.b("download timeout");
                    var9_6.a(this.l);
                    var9_6.p();
                    this.f.remove((Object)var7_7);
                    --var6_4;
                }
                if (var9_6.i() == 1 || var9_6.i() == 5 || var9_6.i() == 0 || var9_6.i() == 6) continue;
                var9_6.p();
                this.f.remove((Object)var7_7);
                --var6_4;
            }
            ++var6_4;
        } while (true);
    }

    private int d(f.f.a.e.e.a a2) {
        try {
            if (a2.m() == 298) {
                if (this.o == null) {
                    this.o = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f(), this.j);
                }
                return this.o.b();
            }
            if (a2.m() == 42) {
                return m.super.c(null);
            }
            if (this.k == null) {
                this.k = f.f.a.s.d.b.c().a(f.f.a.e.c.a.i().f(), this.j, false);
            }
            int n2 = this.k.q();
            return n2;
        }
        catch (Throwable throwable) {
            h.b((String)"UnitCacheCtroller", (String)throwable.getMessage(), (Throwable)throwable);
            return 100;
        }
    }

    /*
     * Exception decompiling
     */
    private void d() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl65 : RETURN : trying to set 0 previously set to 1
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
    public final f.f.a.s.f.a a(int var1, boolean var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[TRYBLOCK], 2[TRYBLOCK]], but top level block is 16[WHILELOOP]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<f.f.a.s.f.a> a(String var1_1, int var2_4, boolean var3_3, List<f.f.a.e.e.a> var4) {
        var5_5 = var3_3;
        var6_6 = new ArrayList();
        var7_7 = this.f;
        if (var7_7 == null) {
            return var6_6;
        }
        var66_8 = var7_7;
        synchronized (var66_8) {
            var10_9 = System.currentTimeMillis();
            block9 : for (var12_10 = 0; var12_10 < this.f.size(); ++var12_10) {
                var13_26 = (Map)this.f.get(var12_10);
                var14_22 = var13_26.entrySet().iterator();
lbl13: // 2 sources:
                block10 : do {
                    block25 : {
                        block24 : {
                            block26 : {
                                block23 : {
                                    block22 : {
                                        block30 : {
                                            block29 : {
                                                block28 : {
                                                    if (!var14_22.hasNext()) break block28;
                                                    var17_19 = (f.f.a.s.f.a)((Map.Entry)var14_22.next()).getValue();
                                                    if (var17_19 == null || var17_19.l() == null) break block29;
                                                    break block30;
                                                }
                                                var5_5 = var3_3;
                                                continue block9;
                                            }
                                            var18_32 = var10_9;
                                            var20_24 = var14_22;
                                            var21_21 = "UnitCacheCtroller";
                                            var22_28 = "UnitCache isReady ==== task \u6216\u8005 campaign\u4e3a\u7a7a continue";
                                            ** GOTO lbl167
                                        }
                                        var23_15 = var17_19.l();
                                        var24_36 = var4.iterator();
                                        var25_17 = false;
                                        do {
                                            block33 : {
                                                block32 : {
                                                    block34 : {
                                                        block35 : {
                                                            block31 : {
                                                                if (!var24_36.hasNext()) break block31;
                                                                var63_38 = (f.f.a.e.e.a)var24_36.next();
                                                                if (var23_15 == null || var63_38 == null || TextUtils.isEmpty((CharSequence)var23_15.L0()) || TextUtils.isEmpty((CharSequence)var63_38.L0())) break block32;
                                                                var65_27 = var23_15.e();
                                                                var64_23 = var14_22;
                                                                if (var65_27.equals((Object)var63_38.e()) && var23_15.L0().equals((Object)var63_38.L0())) {
                                                                    var25_17 = true;
                                                                }
                                                                break block33;
                                                            }
                                                            var20_24 = var14_22;
                                                            if (!var25_17) {
                                                                var26_16 = "UnitCacheCtroller";
                                                                var60_20 = new StringBuilder();
                                                                var60_20.append("UnitCache isReady ==== Campaign isAvailable = ");
                                                                var60_20.append(var25_17);
                                                                var32_33 = var60_20.toString();
                                                                break block22;
                                                            }
                                                            if (var5_5 && !var23_15.k1() || !var5_5 && var23_15.k1()) {
                                                                var26_16 = "UnitCacheCtroller";
                                                                var27_30 = new StringBuilder();
                                                                var27_30.append("UnitCache isReady ==== isBidCampaign = ");
                                                                var27_30.append(var5_5);
                                                                var27_30.append(" campaign.isBidCampaign() = ");
                                                                var27_30.append(var23_15.k1());
                                                                var32_33 = var27_30.toString();
                                                                break block22;
                                                            }
                                                            var33_11 = var23_15.i1();
                                                            var34_31 = var23_15.d1();
                                                            var35_37 = "";
                                                            if (var23_15 != null && var23_15.R0() != null) {
                                                                var35_37 = var23_15.R0().d();
                                                            }
                                                            var23_15.R0();
                                                            if (var2_4 != 94 && var2_4 != 287) break block34;
                                                            if (!m.super.a(var2_4, var23_15, var35_37)) {
                                                                var26_16 = "UnitCacheCtroller";
                                                                var32_33 = "UnitCache isReady ====  templateZipDownload check false continue";
                                                                break block22;
                                                            }
                                                            if (!m.super.b(var33_11, var23_15)) break block34;
                                                            if (var17_19.b()) {
                                                                var17_19.m();
                                                                var26_16 = "UnitCacheCtroller";
                                                                var32_33 = "isready endcard\u4e0b\u8f7d\u5b8c \u4f46\u662foffer\u5c55\u793a\u8fc7 continue";
                                                                break block22;
                                                            }
                                                            if (!r.a((String)var34_31)) break block35;
                                                            h.b((String)"UnitCacheCtroller", (String)"endcard\u4e3a\u57fa\u51c6 endcard\u548c\u56fe\u7247\u4e0b\u8f7d\u5b8c\u6210 videourl\u4e3a\u7a7a\u4e0d\u7528\u4e0b\u8f7d return task");
                                                            ** GOTO lbl113
                                                        }
                                                        if (!m.a(var17_19, m.super.a(var23_15))) break block34;
                                                        h.b((String)"UnitCacheCtroller", (String)"endcard\u4e3a\u57fa\u51c6 endcard \u56fe\u7247 \u548c videourl \u4e0b\u8f7d\u5b8c\u6210 return task");
                                                        ** GOTO lbl113
                                                    }
                                                    var37_13 = TextUtils.isEmpty((CharSequence)var17_19.j());
                                                    var38_35 = var17_19.i();
                                                    var39_34 = new StringBuilder();
                                                    var39_34.append("isready unit state:");
                                                    var39_34.append(var38_35);
                                                    h.a((String)"UnitCacheCtroller", (String)var39_34.toString());
                                                    if (var38_35 != 5) ** GOTO lbl115
                                                    if (!var17_19.b()) ** GOTO lbl99
                                                    var17_19.m();
                                                    this.f.remove((Object)var13_26);
                                                    --var12_10;
                                                    h.b((String)"UnitCacheCtroller", (String)"isready state == DownLoadConstant.DOWNLOAD_DONE \u4f46\u662foffer\u5c55\u793a\u8fc7 continue");
                                                    var5_5 = var3_3;
                                                    var14_22 = var20_24;
                                                    continue block10;
lbl99: // 1 sources:
                                                    if (!var37_13) {
                                                        var17_19.a(0, 0);
                                                        if (var2_4 != 95) break;
                                                        var42_18 = new StringBuilder();
                                                        var42_18.append("isready ==========done but isEffectivePath:");
                                                        var42_18.append(var37_13);
                                                        var42_18.append(" is feed");
                                                        var42_18.append(var2_4);
                                                        h.b((String)"UnitCacheCtroller", (String)var42_18.toString());
                                                    } else {
                                                        if (!m.super.a(var33_11, var23_15)) {
                                                            h.b((String)"UnitCacheCtroller", (String)"isready done but continue");
                                                            return null;
                                                        }
                                                        h.b((String)"UnitCacheCtroller", (String)"isready videourl\u4e3a\u57fa\u51c6 state\uff1ddone endcard \u56fe\u7247 \u548c videourl \u4e0b\u8f7d\u5b8c\u6210 return task");
                                                    }
lbl113: // 4 sources:
                                                    var6_6.add((Object)var17_19);
                                                    break block23;
lbl115: // 1 sources:
                                                    var49_25 = var17_19.c();
                                                    if (var17_19.i() != 1) break block24;
                                                    var56_14 = var17_19.f();
                                                    var57_29 = var10_9 - var49_25;
                                                    var18_32 = var10_9;
                                                    if (var57_29 <= 1000L * this.i && var56_14 != null) break block25;
                                                    var17_19.b("download timeout");
                                                    var17_19.p();
                                                    this.f.remove((Object)var13_26);
                                                    --var12_10;
                                                    if (var2_4 != 1 && var2_4 != 94) break block25;
                                                    break block26;
                                                }
                                                var64_23 = var14_22;
                                            }
                                            var14_22 = var64_23;
                                        } while (true);
                                        var26_16 = "UnitCacheCtroller";
                                        var32_33 = "isready !isEffectivePath continue";
                                    }
                                    h.b((String)var26_16, (String)var32_33);
                                }
                                var18_32 = var10_9;
                                break block27;
                            }
                            var21_21 = "UnitCacheCtroller";
                            var22_28 = "isready download !timeout continue";
                            ** GOTO lbl167
                        }
                        var18_32 = var10_9;
                    }
                    if (var38_35 == 4 || var38_35 == 2) ** GOTO lbl162
                    if (var38_35 != 1) ** GOTO lbl171
                    break;
                } while (true);
            }
            ** GOTO lbl184
            {
                block27 : {
                    block39 : {
                        block38 : {
                            block37 : {
                                block36 : {
                                    if (!var17_19.b()) break block36;
                                    var21_21 = "UnitCacheCtroller";
                                    var22_28 = "isready run \u5df2\u7ecf\u88ab\u5c55\u793a\u8fc7 continue";
                                    break block37;
                                }
                                if (f.f.a.a.e || !m.a(var17_19, m.super.a(var23_15)) || !m.super.a(var33_11, var23_15)) break block38;
                                var53_12 = new StringBuilder();
                                var53_12.append("isready  IS_DOWANLOAD_FINSH_PLAY is :");
                                var53_12.append(f.f.a.a.e);
                                h.b((String)"UnitCacheCtroller", (String)var53_12.toString());
                                break block39;
lbl162: // 1 sources:
                                this.f.remove((Object)var13_26);
                                var17_19.p();
                                --var12_10;
                                var21_21 = "UnitCacheCtroller";
                                var22_28 = "isready stop continue";
                            }
                            h.b((String)var21_21, (String)var22_28);
                            break block27;
                        }
                        if (var2_4 != 94 && var2_4 != 287 || !m.a(var17_19, m.super.a(var23_15)) || !m.super.a(var33_11, var23_15)) break block27;
                    }
                    var6_6.add((Object)var17_19);
                }
                var5_5 = var3_3;
                var14_22 = var20_24;
                var10_9 = var18_32;
                ** continue;
                {
                    catch (Throwable var9_39) {
                        break;
                    }
                    catch (Exception var8_40) {}
                    {
                        var8_40.printStackTrace();
lbl184: // 2 sources:
                        return var6_6;
                        break;
                    }
                }
            }
            throw var9_39;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a() {
        this.c();
        var1_1 = this.f;
        if (var1_1 == null) return;
        var16_2 = var1_1;
        // MONITORENTER : var16_2
        if (!this.a(this.f)) {
            this.b = true;
        }
        var3_3 = this.f.iterator();
        block2 : do lbl-1000: // 3 sources:
        {
            if (!var3_3.hasNext()) {
                // MONITOREXIT : var16_2
                return;
            }
            var4_8 = (Map)var3_3.next();
            if (var4_8 == null) ** GOTO lbl-1000
            var5_7 = var4_8.entrySet().iterator();
            do {
                block23 : {
                    block24 : {
                        block22 : {
                            if (!var5_7.hasNext()) continue block2;
                            var6_9 = (f.f.a.s.f.a)((Map.Entry)var5_7.next()).getValue();
                            if (var6_9 == null || var6_9.b()) continue;
                            if (this.m == 95) {
                                this.b = true;
                            }
                            var7_15 = var6_9.i();
                            var8_4 = var6_9.l();
                            if (var8_4 != null && var7_15 == 0) {
                                var7_15 = c.a().a(var8_4.e(), var8_4.d1(), var6_9.o());
                            }
                            var6_9.a(new f.f.a.s.g.b(this, var8_4){
                                final /* synthetic */ f.f.a.e.e.a a;
                                final /* synthetic */ m b;
                                {
                                    this.b = m2;
                                    this.a = a2;
                                }

                                public final void a(String string2, String string3) {
                                    f.f.a.s.g.b b2;
                                    if (m.a(this.b) != null) {
                                        m.a(this.b).a(string2, string3);
                                    }
                                    if (m.b(this.b) != null && m.b(this.b).size() > 0 && this.a != null && (b2 = (f.f.a.s.g.b)m.b(this.b).get((Object)this.a.L0())) != null) {
                                        b2.a(string2, string3);
                                    }
                                }

                                public final void b(String string2) {
                                    f.f.a.s.g.b b2;
                                    if (m.a(this.b) != null) {
                                        m.a(this.b).b(string2);
                                    }
                                    if (m.b(this.b) != null && m.b(this.b).size() > 0 && this.a != null && (b2 = (f.f.a.s.g.b)m.b(this.b).get((Object)this.a.L0())) != null) {
                                        b2.b(string2);
                                    }
                                }
                            });
                            if (m.a(var6_9, this.a(var8_4))) {
                                if (this.c != null && (this.m == 297 || this.m == 298)) {
                                    this.c.b(var8_4.d1());
                                }
                                if (this.d == null || this.d.size() <= 0 || (var15_10 = (f.f.a.s.g.b)this.d.get((Object)var8_4.L0())) == null || var8_4 == null) continue;
                                var15_10.b(var8_4.d1());
                                continue;
                            }
                            if (var7_15 == 1 || var7_15 == 5 || var7_15 == 4) continue;
                            if (f.f.a.e.f.d.z((Context)this.g) != 9 && this.l == 2) {
                                // MONITOREXIT : var16_2
                                return;
                            }
                            if (var7_15 != 2 && !this.b) continue;
                            var6_9.b(this.e);
                            var9_11 = this.a(var8_4);
                            if (this.m == 1) {
                                if (this.n == null) {
                                    this.n = f.f.a.f.d.b((String)this.j);
                                }
                                var9_11 = this.c(var8_4);
                            }
                            var6_9.c(var9_11);
                            if (this.m == 94 || this.m == 287 || this.m == 95) break block22;
                            if (this.m == 298) {
                                if (this.o == null) {
                                    this.o = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f(), this.j);
                                }
                                if (this.o != null) {
                                    var6_9.b(this.o.c());
                                }
                            }
                            if (this.m != 42) break block23;
                            if (this.n == null) {
                                this.n = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f(), this.j);
                            }
                            if (this.n == null) break block23;
                            var10_14 = this.n.c();
                            break block24;
                        }
                        if (this.k == null) {
                            var11_5 = f.f.a.s.d.b.c();
                            var12_12 = f.f.a.e.c.a.i().f();
                            var13_6 = this.j;
                            var14_13 = this.m == 287;
                            this.k = var11_5.a(var12_12, var13_6, var14_13);
                        }
                        if (this.k == null) break block23;
                        var10_14 = this.k.r();
                    }
                    var6_9.b(var10_14);
                }
                if (m.a(var6_9, var9_11)) continue;
                if (this.m == 1 || this.m == 95 || this.m == 298) {
                    this.b = false;
                }
                var6_9.g();
            } while (true);
            break;
        } while (true);
    }

    public final void a(f.f.a.s.g.b b2) {
        this.c = b2;
    }

    public final void a(String string2, f.f.a.s.g.b b2) {
        if (this.d == null) {
            this.d = new ConcurrentHashMap();
        }
        this.d.put((Object)string2, (Object)b2);
    }

    public final void a(List<f.f.a.e.e.a> list) {
        List<f.f.a.e.e.a> list2 = this.a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        m.super.b(this.a);
    }

    public final f.f.a.s.f.a b(int n2, boolean bl) {
        try {
            f.f.a.s.f.a a2 = this.a(n2, bl);
            return a2;
        }
        catch (Throwable throwable) {
            h.b((String)"UnitCacheCtroller", (String)throwable.getMessage(), (Throwable)throwable);
            return null;
        }
    }

    public final CopyOnWriteArrayList<Map<String, f.f.a.s.f.a>> b() {
        return this.f;
    }
}

