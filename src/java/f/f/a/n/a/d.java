/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  com.mintegral.msdk.base.common.report.c
 *  f.f.a.a
 *  f.f.a.e.b.a.c
 *  f.f.a.e.b.b
 *  f.f.a.e.b.c.c
 *  f.f.a.e.b.c.e
 *  f.f.a.e.b.h.g
 *  f.f.a.e.b.h.j.b
 *  f.f.a.e.b.h.j.d
 *  f.f.a.e.b.h.k.c
 *  f.f.a.e.c.a
 *  f.f.a.e.e.a
 *  f.f.a.e.e.a$b
 *  f.f.a.e.e.a$b$a
 *  f.f.a.e.e.g
 *  f.f.a.e.e.h
 *  f.f.a.e.f.h
 *  f.f.a.e.f.l
 *  f.f.a.e.f.r
 *  f.f.a.f.a
 *  f.f.a.f.b.a
 *  f.f.a.f.c
 *  f.f.a.k.g.f
 *  f.f.a.n.a.a
 *  f.f.a.n.a.b
 *  f.f.a.n.a.c
 *  f.f.a.n.a.c$f
 *  f.f.a.n.a.c$l
 *  f.f.a.n.a.c$o
 *  f.f.a.n.a.d$a
 *  f.f.a.n.a.d$b
 *  f.f.a.n.a.d$c$a
 *  f.f.a.n.a.d$c$b
 *  f.f.a.n.a.d$c$c
 *  f.f.a.n.a.d$d$a
 *  f.f.a.n.a.d$d$b
 *  f.f.a.n.a.d$e$a
 *  f.f.a.n.a.d$f
 *  f.f.a.n.a.d$g
 *  f.f.a.n.a.d$h
 *  f.f.a.n.a.d$i
 *  f.f.a.n.a.d$j
 *  f.f.a.n.a.d$k
 *  f.f.a.n.a.d$l
 *  f.f.a.n.b.a
 *  f.f.a.n.c.a
 *  f.f.a.r.a.a.b
 *  f.f.a.r.b.a.j
 *  f.f.a.s.a
 *  f.f.a.s.a$a
 *  f.f.a.s.a$b
 *  f.f.a.s.d.c
 *  f.f.a.s.f.c
 *  f.f.a.s.f.j
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.CopyOnWriteArrayList
 *  org.json.JSONArray
 */
package f.f.a.n.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import f.f.a.e.e.a;
import f.f.a.e.f.r;
import f.f.a.n.a.c;
import f.f.a.n.a.d;
import f.f.a.s.a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;

/*
 * Exception performing whole class analysis.
 */
public final class d
implements f.f.a.n.a.a {
    volatile boolean A;
    private List<f.f.a.e.e.a> B;
    private List<f.f.a.e.e.a> C;
    private Context a;
    private String b;
    private String c;
    private int d;
    private int e;
    private boolean f;
    private String g;
    private String h;
    private volatile f.f.a.n.a.b i;
    private f.f.a.s.d.c j;
    private k k;
    private boolean l;
    private boolean m;
    private CopyOnWriteArrayList<f.f.a.e.e.a> n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private f.f.a.e.e.b s;
    private List<f.f.a.e.e.a> t;
    private long u;
    private Handler v;
    volatile boolean w;
    volatile boolean x;
    volatile boolean y;
    volatile boolean z;

    public d(Context context, String string, String string2) {
        this.l = false;
        this.m = false;
        this.n = new CopyOnWriteArrayList();
        this.o = 2;
        this.u = 0L;
        this.v = new a((d)this, Looper.getMainLooper());
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = false;
        try {
            this.a = context.getApplicationContext();
            this.b = string2;
            this.c = string;
            this.b();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    static /* synthetic */ long a(d d2, long l2) {
        d2.u = l2;
        return l2;
    }

    static /* synthetic */ String a(d d2) {
        return d2.g;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private List<f.f.a.e.e.a> a(f.f.a.e.e.b var1) {
        var2_2 = new ArrayList();
        f.f.a.e.f.l.a(var1.c());
        if (this.j != null) {
            this.j.t();
        }
        if (var1 == null) return var2_2;
        if (var1.c() == null) return var2_2;
        if (var1.c().size() <= 0) return var2_2;
        var4_3 = var1.c();
        this.B = var4_3;
        if (var1 != null && var1.c() != null && var1.c().size() > 0) {
            var27_4 = var1.c();
            for (var28_5 = 0; var28_5 < var27_4.size(); ++var28_5) {
                var29_6 = (f.f.a.e.e.a)var27_4.get(var28_5);
                var29_6.s(this.b);
                var27_4.set(var28_5, (Object)var29_6);
            }
        }
        var5_11 = 0;
        do {
            block19 : {
                block26 : {
                    block24 : {
                        block25 : {
                            block22 : {
                                block23 : {
                                    block20 : {
                                        block21 : {
                                            if (var5_11 >= var4_3.size() || var5_11 >= Integer.MAX_VALUE) ** GOTO lbl72
                                            var6_12 = (f.f.a.e.e.a)var4_3.get(var5_11);
                                            if (!var6_12.m1()) ** GOTO lbl69
                                            if (TextUtils.isEmpty((CharSequence)var6_12.r0().trim())) break block19;
                                            var9_15 = var6_12.m();
                                            var10_18 = var9_15 == 287 ? "3" : (var6_12.m() == 94 ? "1" : (var6_12.m() == 42 ? "2" : ""));
                                            var16_19 = f.f.a.e.b.c.e.b((f.f.a.e.b.c.c)f.f.a.e.b.c.c.h);
                                            var17_16 = f.f.a.e.f.a.a(var6_12.r0());
                                            if (TextUtils.isEmpty((CharSequence)var17_16)) {
                                                var17_16 = String.valueOf((long)System.currentTimeMillis());
                                            }
                                            var18_14 = new File(var16_19, var17_16.concat(".html"));
                                            var12_17 = new FileOutputStream(var18_14);
                                            try {
                                                var19_10 = new StringBuilder();
                                                var19_10.append("<script>");
                                                var19_10.append(f.f.a.f.b.a.b().a());
                                                var19_10.append("</script>");
                                                var19_10.append(var6_12.r0());
                                                var12_17.write(var19_10.toString().getBytes());
                                                var12_17.flush();
                                                var6_12.N(var18_14.getAbsolutePath());
                                                com.mintegral.msdk.base.common.report.c.a((f.f.a.e.e.a)var6_12, (String)"", (String)this.b, (String)var10_18);
                                                break block20;
                                            }
                                            catch (Exception var13_9) {
                                                break block21;
                                            }
                                            catch (Throwable var14_21) {
                                                var12_17 = null;
                                                break block22;
                                            }
                                            catch (Exception var11_7) {
                                                var12_17 = null;
                                                var13_8 = var11_7;
                                            }
                                        }
                                        try {
                                            var13_8.printStackTrace();
                                            var6_12.N("");
                                            com.mintegral.msdk.base.common.report.c.a((f.f.a.e.e.a)var6_12, (String)var13_8.getMessage(), (String)this.b, (String)var10_18);
                                            if (var12_17 == null) break block23;
                                        }
                                        catch (Throwable var14_23) {}
                                    }
                                    var12_17.close();
                                }
                                try {
                                    var15_13 = new File(var6_12.r0());
                                    if (!(var15_13.exists() && var15_13.isFile() && var15_13.canRead())) {
                                        d.super.d("mraid resource write fail");
                                        break block19;
                                    }
lbl69: // 3 sources:
                                    if (var6_12 == null || var6_12.z0() == 99) break block19;
                                    if (!(d.super.b(var6_12) != false ? r.a((String)var6_12.i1()) != false && TextUtils.isEmpty((CharSequence)var6_12.r0()) != false : r.a((String)var6_12.d1()) != false)) break block24;
                                    break block25;
lbl72: // 1 sources:
                                    var24_24 = new StringBuilder();
                                    var24_24.append("onload \u8fd4\u56de\u6709\u4ee5\u4e0b\u5e26\u6709\u89c6\u9891\u7d20\u6750\u7684compaign\uff1a");
                                    var24_24.append(var2_2.size());
                                    f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)var24_24.toString());
                                    return var2_2;
                                }
                                catch (Exception var3_25) {
                                    var3_25.printStackTrace();
                                }
                                return var2_2;
                            }
                            if (var12_17 == null) throw var14_22;
                            var12_17.close();
                            throw var14_22;
                        }
                        var7_20 = false;
                        break block26;
                    }
                    var7_20 = true;
                }
                if (var7_20 && (var6_12.g1() == 1 || !f.f.a.e.f.l.a((Context)this.a, (String)var6_12.g()) || f.f.a.e.f.l.b((f.f.a.e.e.a)var6_12) || f.f.a.e.f.l.a((f.f.a.e.e.a)var6_12))) {
                    var2_2.add((Object)var6_12);
                }
            }
            ++var5_11;
        } while (true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(f.f.a.e.e.a a2) {
        a.b b2 = a.b.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\u5220\u9664 Campaign id\uff1a ");
        stringBuilder.append(a2.e());
        f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)stringBuilder.toString());
        if (b2 == null) return;
        try {
            b2.a(a2);
            return;
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)throwable.getMessage(), (Throwable)throwable);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    static /* synthetic */ void a(d var0_1, f.f.a.e.e.b var1) {
        block9 : {
            var0_1.s = var1;
            var2_2 = new StringBuilder();
            var2_2.append("Campaign \u8bf7\u6c42\u6210\u529f\uff1a ");
            var2_2.append(var1.c().size());
            var2_2.append(" \u6761");
            f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)var2_2.toString());
            var6_3 = var0_1.t = var0_1.a(var1);
            if (var6_3 == null || var6_3.size() <= 0) break block9;
            var7_4 = new StringBuilder();
            var7_4.append("onload load\u6210\u529f size:");
            var7_4.append(var0_1.t.size());
            f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)var7_4.toString());
            var10_5 = var0_1.v;
            if (var10_5 != null) {
                var10_5.sendEmptyMessage(3);
            }
            if (var1 != null && r.b((String)(var31_6 = var1.k()))) {
                var32_7 = new StringBuilder();
                var32_7.append("onload sessionId:");
                var32_7.append(var31_6);
                f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)var32_7.toString());
                f.f.a.n.b.a.D = var31_6;
            }
            if ((var11_8 = var0_1.t) == null) ** GOTO lbl26
            try {
                if (var11_8.size() > 0) {
                    var0_1.d += var11_8.size();
                }
lbl26: // 4 sources:
                if (var0_1.j == null || var0_1.d > var0_1.j.u()) {
                    f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)"onload \u91cd\u7f6eoffset\u4e3a0");
                    var0_1.d = 0;
                }
                var28_9 = new StringBuilder();
                var28_9.append("onload \u7b97\u51fa \u4e0b\u6b21\u7684offset\u662f:");
                var28_9.append(var0_1.d);
                f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)var28_9.toString());
                if (r.b((String)var0_1.b)) {
                    f.f.a.n.b.a.a((String)var0_1.b, (int)var0_1.d);
                }
            }
            catch (Exception var12_10) {
                var12_10.printStackTrace();
            }
            if ((var13_11 = var0_1.t) != null && var13_11.size() > 0) {
                var22_12 = new StringBuilder();
                var22_12.append("#######onload \u628a\u5e7f\u544a\u5b58\u5728\u672c\u5730 size:");
                var22_12.append(var0_1.t.size());
                f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)var22_12.toString());
                var25_13 = var0_1.c;
                var26_14 = var0_1.b;
                var27_15 = var0_1.t;
                if (a.b.a() != null) {
                    a.b.a().a(var25_13, var26_14, var27_15);
                }
            }
            new Thread((Runnable)new f(var0_1, var1)).start();
            var15_16 = (f.f.a.e.e.a)var0_1.t.get(0);
            var16_17 = true ^ TextUtils.isEmpty((CharSequence)var15_16.p0());
            var17_18 = var15_16.v0();
            var0_1.w = false;
            var0_1.x = false;
            var0_1.y = false;
            var0_1.A = false;
            var0_1.z = false;
            var18_19 = c.o.a();
            var19_20 = var0_1.a;
            var20_21 = var0_1.q;
            var21_22 = var0_1.p != false ? 287 : 94;
            var18_19.a(var19_20, var16_17, var17_18, var20_21, var21_22, var0_1.c, var0_1.b, var15_16.L0(), var0_1.t, new c.f(){

                public final void a(String string, String string2, String string3, List<f.f.a.e.e.a> list) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Campaign \u4e0b\u8f7d\u6210\u529f\uff1a ");
                    stringBuilder.append(list.size());
                    f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)stringBuilder.toString());
                    d d2 = d.this;
                    d2.w = true;
                    Context context = d2.a;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("resource download success is tpl :");
                    stringBuilder2.append(var16_17);
                    f.f.a.n.c.a.c((Context)context, (String)stringBuilder2.toString(), (String)d.this.b, (boolean)d.this.q, (String)string3);
                    if (!var16_17) {
                        f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"Campaign \u4e0b\u8f7d\u6210\u529f\uff1a \u975e\u5927\u6a21\u677f");
                        for (f.f.a.e.e.a a2 : list) {
                            String string4;
                            if (a2 != null && a2.R0() != null && !TextUtils.isEmpty((CharSequence)a2.R0().d()) && d.this.v != null) {
                                f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"Campaign \u4e0b\u8f7d\u6210\u529f\uff1a \u975e\u5927\u6a21\u677f\uff0c\u5f00\u59cb\u9884\u52a0\u8f7d\u64ad\u653e\u6a21\u677f");
                                Handler handler = d.this.v;
                                a a3 = new a(this, a2, string, string2, string3, list);
                                handler.post((Runnable)a3);
                                continue;
                            }
                            f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"Campaign \u4e0b\u8f7d\u6210\u529f\uff1a \u975e\u5927\u6a21\u677f\uff0c\u4e0d\u5b58\u5728\u64ad\u653e\u6a21\u677f");
                            d d3 = d.this;
                            if (d3.a((List<f.f.a.e.e.a>)d3.t, var16_17, var17_18)) {
                                f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"Campaign \u4e0b\u8f7d\u6210\u529f\uff1a \u975e\u5927\u6a21\u677f\uff0c\u4e0d\u5b58\u5728\u64ad\u653e\u6a21\u677f,isReay true");
                                d d4 = d.this;
                                d.a(d4, d4.b, list, d.this.C, d.this.q);
                                if (d.this.v != null) {
                                    d.this.v.removeMessages(5);
                                }
                                if (d.this.i == null || d.this.z) continue;
                                d d5 = d.this;
                                d5.z = true;
                                if (!TextUtils.isEmpty((CharSequence)d5.b)) {
                                    f.f.a.n.c.a.a((Context)d.this.a, (List)d.this.t, (String)d.this.b);
                                }
                                d.this.i.a();
                                string4 = "Campaign \u4e0b\u8f7d\u6210\u529f\uff1a \u975e\u5927\u6a21\u677f\uff0c\u64ad\u653e\u6a21\u677f\u9884\u52a0\u8f7d\u6210\u529f,isReay true onVideoLoadSuccess";
                            } else {
                                f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"Campaign \u4e0b\u8f7d\u6210\u529f\uff1a \u975e\u5927\u6a21\u677f\uff0c\u4e0d\u5b58\u5728\u64ad\u653e\u6a21\u677f,isReay false");
                                d d6 = d.this;
                                d.a(d6, string2, d6.B, d.this.q);
                                if (d.this.v != null) {
                                    d.this.v.removeMessages(5);
                                }
                                if (d.this.i == null || d.this.A) continue;
                                d d7 = d.this;
                                d7.A = true;
                                if (!TextUtils.isEmpty((CharSequence)d7.b)) {
                                    f.f.a.n.c.a.a((Context)d.this.a, (String)"have no temp but isReady false", (String)d.this.b, (boolean)d.this.q, (String)string3);
                                }
                                d.this.i.b("errorCode: 3503 errorMessage: have no temp but isReady false");
                                string4 = "Campaign \u4e0b\u8f7d\u6210\u529f\uff1a \u975e\u5927\u6a21\u677f\uff0c\u4e0d\u5b58\u5728\u64ad\u653e\u6a21\u677f,isReay false onVideoLoadFail";
                            }
                            f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)string4);
                        }
                    } else {
                        f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"Campaign \u4e0b\u8f7d\u6210\u529f\uff1a \u5927\u6a21\u677f");
                        if (d.this.x && !d.this.y && d.this.v != null) {
                            f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"Campaign \u4e0b\u8f7d\u6210\u529f\uff1a \u5927\u6a21\u677f\uff0c\u5927\u6a21\u677f\u4e0b\u8f7d\u6210\u529f\uff0c\u5f00\u59cb\u9884\u52a0\u8f7d\u5927\u6a21\u677f");
                            d.this.y = true;
                            f.f.a.e.f.h.a((String)"test_pre_load_tpl", (String)"Campaign \u4e0b\u8f7d\u6210\u529f\uff0c\u5927\u6a21\u677f\u4e0b\u8f7d\u6210\u529f\uff0c\u5f00\u59cb\u9884\u52a0\u8f7d\u5927\u6a21\u677f");
                            d.this.v.post((Runnable)new b(this, string3, string2, list));
                            return;
                        }
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("Campaign \u4e0b\u8f7d\u6210\u529f\uff1a \u5927\u6a21\u677f\uff0c\u5927\u6a21\u677f\u4e0b\u8f7d\u4e0d\u6210\u529f\uff1a isCampaignTPLDownloadSuccess\uff1a ");
                        stringBuilder3.append(d.this.x);
                        stringBuilder3.append("  isCampaignTPLProLoad\uff1a ");
                        stringBuilder3.append(d.this.y);
                        f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)stringBuilder3.toString());
                    }
                }

                public final void a(String string, String string2, String string3, List<f.f.a.e.e.a> list, String string4) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Campaign \u4e0b\u8f7d\u5931\u8d25\uff1a ");
                    stringBuilder.append(list.size());
                    f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)stringBuilder.toString());
                    d d2 = d.this;
                    d2.w = false;
                    Context context = d2.a;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string4);
                    stringBuilder2.append(" is tpl: ");
                    stringBuilder2.append(var16_17);
                    f.f.a.n.c.a.c((Context)context, (String)stringBuilder2.toString(), (String)d.this.b, (boolean)d.this.q, (String)string3);
                    if (d.this.i != null && d.this.v != null) {
                        d.this.v.post((Runnable)new c(this, string2, string3));
                    }
                }
            }, new c.l(){

                public final void a(String string, String string2, String string3, String string4) {
                    f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"template \u4e0b\u8f7d\u6210\u529f\uff1a ");
                }

                /*
                 * Enabled aggressive block sorting
                 */
                public final void a(String string, String string2, String string3, String string4, String string5) {
                    block4 : {
                        a a2;
                        Handler handler;
                        block3 : {
                            block2 : {
                                f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"template \u4e0b\u8f7d\u5931\u8d25\uff1a ");
                                if (var16_17 || d.this.i == null || d.this.v == null) break block2;
                                f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"\u64ad\u653e\u6a21\u677f\u4e0b\u8f7d\u5931\u8d25\uff0c\u975e\u5927\u6a21\u677f");
                                handler = d.this.v;
                                a2 = new a(this, string2, string3);
                                break block3;
                            }
                            if (var17_18 != 1) break block4;
                            f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"\u64ad\u653e\u6a21\u677f\u4e0b\u8f7d\u5931\u8d25\uff0c\u5927\u6a21\u677f\uff0cnscpt 1");
                            if (d.this.i == null || d.this.v == null) break block4;
                            handler = d.this.v;
                            a2 = new b(this, string2, string3);
                        }
                        handler.post((Runnable)a2);
                        return;
                    }
                }
            });
            if (var16_17 == false) return;
            c.o.a().a(var0_1.a, var15_16, var0_1.c, var0_1.b, var15_16.L0(), new c.l(){

                public final void a(String string, String string2, String string3, String string4) {
                    f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"\u5927\u6a21\u677f\u4e1a\u52a1\uff0c\u5927\u6a21\u677f\u4e0b\u8f7d\u6210\u529f");
                    d d2 = d.this;
                    d2.x = true;
                    if (d2.w && !d.this.y && d.this.v != null) {
                        f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"\u5927\u6a21\u677f\u4e1a\u52a1\uff0c\u5927\u6a21\u677f\u4e0b\u8f7d\u6210\u529f\uff0cCampaign \u4e0b\u8f7d\u6210\u529f\uff0c\u5f00\u59cb\u9884\u52a0\u8f7d\u5927\u6a21\u677f");
                        f.f.a.e.f.h.a((String)"test_pre_load_tpl", (String)"\u5927\u6a21\u677f\u4e0b\u8f7d\u6210\u529f\uff0cCampaign \u4e0b\u8f7d\u6210\u529f\uff0c\u5f00\u59cb\u9884\u52a0\u8f7d\u5927\u6a21\u677f");
                        d d3 = d.this;
                        d3.y = true;
                        d3.v.post((Runnable)new a(this, string3, string, string2));
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("\u5927\u6a21\u677f\u4e1a\u52a1\uff0c\u5927\u6a21\u677f\u4e0b\u8f7d\u6210\u529f\uff0cCampaign \u4e0b\u8f7d\u4e0d\u6210\u529f\uff0cisCampaignsDownloadSuccess\uff1a ");
                    stringBuilder.append(d.this.w);
                    stringBuilder.append("  isCampaignTPLProLoad\uff1a ");
                    stringBuilder.append(d.this.y);
                    f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)stringBuilder.toString());
                }

                public final void a(String string, String string2, String string3, String string4, String string5) {
                    f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"\u5927\u6a21\u677f\u4e1a\u52a1\uff0c\u5927\u6a21\u677f\u4e0b\u8f7d\u5931\u8d25");
                    d d2 = d.this;
                    d2.x = false;
                    d.a(d2, string2, d2.B, d.this.q);
                    if (d.this.v != null) {
                        d.this.v.removeMessages(5);
                    }
                    if (d.this.i != null && !d.this.A) {
                        d d3 = d.this;
                        d3.A = true;
                        f.f.a.n.c.a.a((Context)d3.a, (String)"tpl temp resource download failed", (String)d.this.b, (boolean)d.this.q, (String)string3);
                        d.this.i.b("errorCode: 3203 errorMessage: tpl temp resource download failed");
                        f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)"\u5927\u6a21\u677f\u4e1a\u52a1\uff0c\u5927\u6a21\u677f\u4e0b\u8f7d\u5931\u8d25 onVideoLoadFail");
                    }
                }
            });
            return;
        }
        f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)"onload load\u5931\u8d25 \u8fd4\u56de\u7684compaign \u6ca1\u6709\u5e26\u89c6\u9891\u7d20\u6750");
        var0_1.d("No video campaign");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static /* synthetic */ void a(d d2, f.f.a.k.g.b b2, String string, f.f.a.e.e.a a2, List list, String string2, String string3, f.f.a.s.d.c c2, String string4) {
        try {
            a.a a3 = new a.a();
            f.f.a.k.g.b b3 = new f.f.a.k.g.b(f.f.a.e.c.a.i().e());
            a3.a(b3);
            f.f.a.r.b.a.j j2 = list != null && list.size() > 0 ? new f.f.a.r.b.a.j(null, a2, list) : new f.f.a.r.b.a.j(null, a2);
            f.f.a.r.b.a.j j3 = j2;
            j3.a(d2.o);
            j3.b(string3);
            j3.a(c2);
            i i2 = new /* Unavailable Anonymous Inner Class!! */;
            l l2 = new /* Unavailable Anonymous Inner Class!! */;
            b3.setWebViewListener((f.f.a.k.g.f)l2);
            b3.setObject((Object)j3);
            b3.loadUrl(string2);
            d2.v.postDelayed((Runnable)i2, 5000L);
            return;
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)throwable.getMessage());
            return;
        }
        catch (Exception exception) {
            if (f.f.a.a.a) {
                exception.printStackTrace();
            }
            return;
        }
    }

    static /* synthetic */ void a(d d2, String string) {
        d2.d(string);
    }

    static /* synthetic */ void a(d d2, String string, f.f.a.e.e.a a2, String string2, String string3, f.f.a.s.d.c c2) {
        a.a a3 = new a.a();
        f.f.a.k.g.b b2 = new f.f.a.k.g.b(f.f.a.e.c.a.i().e());
        a3.a(b2);
        String string4 = f.f.a.r.a.a.b.b().a();
        a3.a(string4);
        f.f.a.r.b.a.j j2 = d2.s != null && d2.s.c() != null && d2.s.c().size() > 0 ? new f.f.a.r.b.a.j(null, a2, d2.s.c()) : new f.f.a.r.b.a.j(null, a2);
        f.f.a.r.b.a.j j3 = j2;
        try {
            j3.a(d2.o);
            j3.b(string3);
            j3.a(string4);
            j3.a(c2);
            h h2 = new /* Unavailable Anonymous Inner Class!! */;
            g g2 = new /* Unavailable Anonymous Inner Class!! */;
            b2.setWebViewListener((f.f.a.k.g.f)g2);
            b2.setObject((Object)j3);
            b2.loadUrl(string2);
            d2.v.postDelayed((Runnable)h2, 5000L);
            return;
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)throwable.getMessage());
            return;
        }
        catch (Exception exception) {
            if (f.f.a.a.a) {
                exception.printStackTrace();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static /* synthetic */ void a(d d2, String string, String string2) {
        try {
            f.f.a.n.a.b b2;
            f.f.a.e.f.h.d((String)"RewardMVVideoAdapter", (String)"====delCampaignFromDownLoadCampaignListByUrld");
            if (d2.n == null || TextUtils.isEmpty((CharSequence)string2)) {
                if (d2.i == null) return;
                if (d2.v != null) {
                    d2.v.removeMessages(5);
                }
                f.f.a.e.f.h.d((String)"RewardMVVideoAdapter", (String)"====del campaign and callback failed");
                d2.d(string);
                b2 = d2.i;
            } else {
                for (f.f.a.e.e.a a2 : d2.n) {
                    if (a2 == null) continue;
                    String string3 = a2.d1();
                    if (!TextUtils.isEmpty((CharSequence)string3) && string2.equals((Object)string3)) {
                        d2.n.remove((Object)a2);
                    } else {
                        String string4 = a2.i1();
                        if (!TextUtils.isEmpty((CharSequence)string4) && string2.equals((Object)string4)) {
                            d2.n.remove((Object)a2);
                        } else {
                            String string5;
                            a.b b3 = a2.R0();
                            if (b3 == null) continue;
                            List list = b3.e();
                            if (list != null) {
                                for (a.b.a a3 : list) {
                                    if (a3 == null || a3.b == null || !a3.b.contains((Object)string2)) continue;
                                    d2.n.remove((Object)a2);
                                    d2.a(a2);
                                    break;
                                }
                            }
                            if (TextUtils.isEmpty((CharSequence)(string5 = b3.d())) || !string2.equals((Object)string5)) continue;
                            d2.n.remove((Object)a2);
                        }
                    }
                    d2.a(a2);
                    break;
                }
                if (d2.i == null) return;
                if (d2.n == null) return;
                if (d2.n.size() != 0) return;
                if (d2.v != null) {
                    d2.v.removeMessages(5);
                }
                f.f.a.e.f.h.d((String)"RewardMVVideoAdapter", (String)"====del campaign and callback failed");
                d2.d(string);
                b2 = d2.i;
            }
            b2.b(string);
            return;
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)throwable.getMessage(), (Throwable)throwable);
            try {
                if (d2.i == null) return;
                if (d2.v != null) {
                    d2.v.removeMessages(5);
                }
                f.f.a.e.f.h.d((String)"RewardMVVideoAdapter", (String)"====del campaign and callback failed");
                d2.d(string);
                return;
            }
            catch (Throwable throwable2) {
                f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)throwable2.getMessage(), (Throwable)throwable2);
            }
        }
    }

    static /* synthetic */ void a(d d2, String string, List list, List list2, boolean bl) {
        f.f.a.e.d.e.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e())).a(string, (List<f.f.a.e.e.a>)list, (List<f.f.a.e.e.a>)list2, bl);
        if (list2 != null && list2.size() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\u6807\u8bb0\u7f13\u5b58\u6570\u636e \uff1a ");
            stringBuilder.append(list2.size());
            f.f.a.e.f.h.a((String)"test_isReay_db", (String)stringBuilder.toString());
            for (f.f.a.e.e.a a2 : list2) {
                if (a2.R0() == null || TextUtils.isEmpty((CharSequence)a2.R0().d())) continue;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string);
                stringBuilder2.append("_");
                stringBuilder2.append(a2.e());
                stringBuilder2.append("_");
                stringBuilder2.append(a2.L0());
                stringBuilder2.append("_");
                stringBuilder2.append(a2.R0().d());
                f.f.a.s.a.b((String)stringBuilder2.toString());
                f.f.a.s.a.b((int)a2.m(), (f.f.a.e.e.a)a2);
            }
        }
    }

    static /* synthetic */ void a(d d2, String string, List list, boolean bl) {
        if (!TextUtils.isEmpty((CharSequence)string) && list != null && list.size() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\u5220\u9664\u5931\u8d25\u7684\u6570\u636e \uff1a ");
            stringBuilder.append(list.size());
            f.f.a.e.f.h.a((String)"RewardMVVideoAdapter", (String)stringBuilder.toString());
            f.f.a.e.d.e.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e())).a(string, (List<f.f.a.e.e.a>)list, bl);
        }
    }

    static /* synthetic */ void a(d d2, List list) {
        f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)"onload \u5f00\u59cb \u66f4\u65b0\u672c\u673a\u5df2\u5b89\u88c5\u5e7f\u544a\u5217\u8868");
        if (d2.a != null && list != null && list.size() != 0) {
            f.f.a.e.d.k k2 = f.f.a.e.d.k.a(f.f.a.e.d.h.a(d2.a));
            boolean bl = false;
            for (int i2 = 0; i2 < list.size(); ++i2) {
                f.f.a.e.e.a a2 = (f.f.a.e.e.a)list.get(i2);
                if (a2 == null) continue;
                if (f.f.a.e.f.l.a((Context)d2.a, (String)a2.g())) {
                    if (f.f.a.e.c.a.h() == null) continue;
                    f.f.a.e.e.h h2 = new f.f.a.e.e.h(a2.e(), a2.g());
                    f.f.a.e.c.a.h().add((Object)h2);
                    bl = true;
                    continue;
                }
                if (k2 == null || k2.a(a2.e())) continue;
                f.f.a.e.e.g g2 = new f.f.a.e.e.g();
                g2.a(a2.e());
                g2.a(a2.M());
                g2.b(a2.N());
                g2.d(0);
                g2.c(0);
                g2.a(System.currentTimeMillis());
                k2.a(g2);
            }
            if (bl) {
                f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)"\u66f4\u65b0\u5b89\u88c5\u5217\u8868");
                f.f.a.e.c.a.i().c();
                return;
            }
        } else {
            f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)"onload \u5217\u8868\u4e3a\u7a7a \u4e0d\u505a\u66f4\u65b0\u672c\u673a\u5df2\u5b89\u88c5\u5e7f\u544a\u5217\u8868");
        }
    }

    static /* synthetic */ boolean a(d d2, boolean bl) {
        d2.l = bl;
        return bl;
    }

    static /* synthetic */ String b(d d2) {
        return d2.h;
    }

    static /* synthetic */ String b(d d2, String string) {
        d2.g = string;
        return string;
    }

    private void b(String string) {
        new Thread((Runnable)new /* Unavailable Anonymous Inner Class!! */).start();
        if (this.v != null) {
            this.k = new /* Unavailable Anonymous Inner Class!! */;
            this.v.postDelayed((Runnable)this.k, 90000L);
            return;
        }
        f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)"handler \u4e3a\u7a7a \u76f4\u63a5load");
        d.super.c(string);
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

    static /* synthetic */ boolean b(d d2, boolean bl) {
        d2.m = bl;
        return bl;
    }

    static /* synthetic */ String c(d d2, String string) {
        d2.h = string;
        return string;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void c(String var1) {
        block13 : {
            block12 : {
                block11 : {
                    try {
                        if (this.a == null) {
                            d.super.d("Context is null");
                            return;
                        }
                        if (r.a((String)this.b)) {
                            d.super.d("UnitId is null");
                            return;
                        }
                        if (this.j == null) {
                            d.super.d("RewardUnitSetting is null");
                            return;
                        }
                        if (TextUtils.isEmpty((CharSequence)var1)) {
                            var11_2 = 1000 * this.j.d();
                            if (System.currentTimeMillis() - this.u < (long)var11_2) {
                                d.super.d("EXCEPTION_RETURN_EMPTY");
                                return;
                            }
                        }
                        f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)"load \u5f00\u59cb\u51c6\u5907\u8bf7\u6c42\u53c2\u6570");
                        var3_3 = d.super.d();
                        if (var3_3 == null) {
                            f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)"load \u8bf7\u6c42\u53c2\u6570\u4e3a\u7a7a load\u5931\u8d25");
                            d.super.d("Load param is null");
                            return;
                        }
                        var4_4 = f.f.a.e.b.h.j.d.a().a(var1);
                        if (var3_3 != null && !TextUtils.isEmpty((CharSequence)var1)) {
                            var3_3.a("token", var1);
                        }
                        if (this.p) {
                            var8_5 = this.r;
                            var9_6 = f.f.a.e.b.b.n;
                            if (var8_5 != var9_6 && this.r != f.f.a.e.b.b.m) break block11;
                            break block12;
                        }
lbl30: // 3 sources:
                        do {
                            f.f.a.n.c.a.c((Context)this.a, (String)"start load offer from server", (String)this.b, (boolean)this.q, (String)"");
                            var5_8 = new f.f.a.n.d.b(this.a);
                            var6_9 = new b((d)this);
                            var6_9.a(var1);
                            var6_9.b = this.b;
                            var6_9.c = this.c;
                            var7_10 = this.p != false ? 287 : 94;
                            var6_9.d = var7_10;
                            var5_8.a(1, var4_4, var3_3, (f.f.a.e.b.h.g)var6_9);
                            return;
                            break;
                        } while (true);
                    }
                    catch (Exception var2_11) {
                        var2_11.printStackTrace();
                        d.super.d("Load exception");
                        d.super.h();
                        return;
                    }
                }
                var10_7 = "0";
                break block13;
            }
            var10_7 = "1";
        }
        var3_3.a("ivrwd", var10_7);
        ** while (true)
    }

    private f.f.a.e.b.h.k.c d() {
        int n2;
        String string = f.f.a.e.c.a.i().f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f.f.a.e.c.a.i().f());
        stringBuilder.append(f.f.a.e.c.a.i().g());
        String string2 = f.f.a.e.f.a.a(stringBuilder.toString());
        int n3 = this.f ? 2 : 3;
        f.f.a.s.d.c c2 = this.j;
        int n4 = 0;
        if (c2 != null) {
            n4 = c2.s();
            n2 = this.j.t();
        } else {
            n2 = 0;
        }
        String string3 = this.h;
        String string4 = this.g;
        String string5 = f.f.a.e.b.a.c.a((String)this.b, (String)"reward");
        String string6 = this.j();
        this.d = this.g();
        String string7 = this.i();
        int n5 = this.e;
        int n6 = this.p ? 287 : 94;
        f.f.a.e.b.h.k.c c3 = new f.f.a.e.b.h.k.c();
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"app_id", (String)string);
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"unit_id", (String)this.b);
        if (!TextUtils.isEmpty((CharSequence)this.c)) {
            f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)f.f.a.a.j, (String)this.c);
        }
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"sign", (String)string2);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(n3);
        stringBuilder2.append("");
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"req_type", (String)stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(n4);
        stringBuilder3.append("");
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"ad_num", (String)stringBuilder3.toString());
        StringBuilder stringBuilder4 = new StringBuilder();
        if (this.p) {
            n2 = 1;
        }
        stringBuilder4.append(n2);
        stringBuilder4.append("");
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"tnum", (String)stringBuilder4.toString());
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append("1");
        stringBuilder5.append("");
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"only_impression", (String)stringBuilder5.toString());
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"ping_mode", (String)"1");
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"ttc_ids", (String)string4);
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"display_info", (String)string5);
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"exclude_ids", (String)string3);
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"install_ids", (String)string6);
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append(n5);
        stringBuilder6.append("");
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"ad_source_id", (String)stringBuilder6.toString());
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"session_id", (String)string7);
        StringBuilder stringBuilder7 = new StringBuilder();
        stringBuilder7.append(n6);
        stringBuilder7.append("");
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"ad_type", (String)stringBuilder7.toString());
        StringBuilder stringBuilder8 = new StringBuilder();
        stringBuilder8.append(this.d);
        stringBuilder8.append("");
        f.f.a.e.b.h.j.b.a((f.f.a.e.b.h.k.c)c3, (String)"offset", (String)stringBuilder8.toString());
        return c3;
    }

    private void d(String string) {
        if (this.v != null) {
            if (TextUtils.isEmpty((CharSequence)string)) {
                this.v.sendEmptyMessage(4);
                return;
            }
            Message message = Message.obtain();
            message.what = 4;
            message.obj = string;
            if (string.contains((CharSequence)"exception")) {
                this.v.sendMessageAtFrontOfQueue(message);
                return;
            }
            this.v.sendMessage(message);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String e() {
        block16 : {
            var1_1 = "";
            var3_2 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
            if (var3_2 != null) ** GOTO lbl7
            var3_2 = f.f.a.f.c.b().a();
lbl7: // 2 sources:
            var4_3 = new JSONArray();
            if (var3_2 == null) break block16;
            if (var3_2.k() != 1) break block16;
            var15_4 = new StringBuilder();
            var15_4.append("excludes cfc:");
            var15_4.append(var3_2.k());
            f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)var15_4.toString());
            var18_5 = f.f.a.e.d.k.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e())).c();
            if (var18_5 == null) break block16;
            var19_6 = var18_5.length;
            for (var20_7 = 0; var20_7 < var19_6; ++var20_7) {
                var21_9 = var18_5[var20_7];
                var23_8 = new StringBuilder();
                var23_8.append("excludes campaignIds:");
                var23_8.append((Object)var18_5);
                f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)var23_8.toString());
                var4_3.put(var21_9);
            }
        }
        var5_10 = this.m();
        if (var5_10 == null) ** GOTO lbl-1000
        var6_11 = var5_10.size();
        var7_12 = 0;
        if (var6_11 <= 0) ** GOTO lbl-1000
        do {
            if (var7_12 >= var5_10.size()) ** GOTO lbl-1000
            var11_13 = (String)var5_10.get(var7_12);
            var12_15 = r.b((String)var11_13);
            ** if (!var12_15) goto lbl-1000
lbl-1000: // 1 sources:
            {
                try {
                    var4_3.put(Long.parseLong((String)var11_13));
                }
                catch (Exception var13_14) {
                    var13_14.printStackTrace();
                }
            }
lbl-1000: // 2 sources:
            {
            }
lbl-1000: // 3 sources:
            {
                if (var4_3.length() > 0) {
                    var1_1 = f.f.a.e.f.l.a((JSONArray)var4_3);
                }
                var8_16 = new StringBuilder();
                var8_16.append("get excludes:");
                var8_16.append(var1_1);
                f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)var8_16.toString());
                return var1_1;
            }
            {
                catch (Exception var2_17) {
                    var2_17.printStackTrace();
                    return var1_1;
                }
            }
            ++var7_12;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void f() {
        block4 : {
            if (a.b.a() != null) {
                try {
                    f.f.a.f.a a2 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
                    if (a2 == null) {
                        a2 = f.f.a.f.c.b().a();
                    }
                    long l2 = 1000L * a2.d();
                    a.b.a().a(l2, this.b);
                    return;
                }
                catch (Exception exception) {
                    if (!f.f.a.a.a) break block4;
                    exception.printStackTrace();
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int g() {
        try {
            int n2 = r.b((String)this.b) ? f.f.a.n.b.a.a((String)this.b) : 0;
            if (this.j == null) return 0;
            {
                int n3 = this.j.u();
                if (n2 <= n3) return n2;
                return 0;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }

    private void h() {
        try {
            if (r.b((String)this.b)) {
                f.f.a.n.b.a.a((String)this.b, (int)0);
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private String i() {
        try {
            if (r.b((String)f.f.a.n.b.a.D)) {
                String string = f.f.a.n.b.a.D;
                return string;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String j() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = f.f.a.e.c.a.i().d();
            if (list != null && list.size() > 0) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    jSONArray.put(((Long)iterator.next()).longValue());
                }
            }
            if (jSONArray.length() <= 0) return "";
            return f.f.a.e.f.l.a((JSONArray)jSONArray);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return "";
    }

    static /* synthetic */ CopyOnWriteArrayList k(d d2) {
        return d2.n;
    }

    private void k() {
        block3 : {
            try {
                if (f.f.a.e.b.a.c.b != null && f.f.a.e.b.a.c.b.size() > 0) {
                    f.f.a.e.b.a.c.b.clear();
                    return;
                }
            }
            catch (Exception exception) {
                if (!f.f.a.a.a) break block3;
                exception.printStackTrace();
            }
        }
    }

    static /* synthetic */ f.f.a.e.e.b l(d d2) {
        return d2.s;
    }

    private void l() {
        try {
            f.f.a.e.d.j.a(f.f.a.e.d.h.a(this.a)).b(this.b);
            return;
        }
        catch (Exception exception) {
            if (f.f.a.a.a) {
                exception.printStackTrace();
            }
            return;
        }
    }

    private List<String> m() {
        try {
            List<String> list = f.f.a.e.d.j.a(f.f.a.e.d.h.a(this.a)).a(this.b);
            return list;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    static /* synthetic */ boolean m(d d2) {
        return d2.p;
    }

    static /* synthetic */ void n(d d2) {
        d2.h();
    }

    static /* synthetic */ int o(d d2) {
        return d2.o;
    }

    static /* synthetic */ f.f.a.s.d.c p(d d2) {
        return d2.j;
    }

    static /* synthetic */ String q(d d2) {
        return d2.c;
    }

    static /* synthetic */ String r(d d2) {
        return d2.e();
    }

    static /* synthetic */ boolean s(d d2) {
        return d2.m;
    }

    static /* synthetic */ boolean t(d d2) {
        return d2.l;
    }

    static /* synthetic */ k u(d d2) {
        return d2.k;
    }

    public final String a() {
        return this.b;
    }

    public final void a(int n2) {
        this.o = n2;
    }

    public final void a(int n2, int n3, boolean bl) {
        this.a(n2, n3, bl, "");
    }

    public final void a(int n2, int n3, boolean bl, String string) {
        List<f.f.a.e.e.a> list;
        this.e = n2;
        this.f = bl;
        List<f.f.a.e.e.a> list2 = this.t;
        if (list2 != null) {
            list2.clear();
        }
        if ((list = this.B) != null) {
            list.clear();
        }
        this.w = false;
        this.x = false;
        this.y = false;
        this.A = false;
        this.z = false;
        if (this.a == null) {
            d.super.d("Context is null");
            return;
        }
        if (r.a((String)this.b)) {
            d.super.d("UnitId is null");
            return;
        }
        if (this.j == null) {
            d.super.d("RewardUnitSetting is null");
            return;
        }
        d.super.k();
        d.super.l();
        f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)"load \u5f00\u59cb\u6e05\u9664\u8fc7\u671f\u6570\u636e");
        d.super.f();
        d.super.b(string);
    }

    public final void a(f.f.a.n.a.b b2) {
        String string = b2 != null ? "======set listener is not null" : "======set listener is  null";
        f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)string);
        this.i = b2;
    }

    public final void a(String string) {
        if (this.j != null && TextUtils.isEmpty((CharSequence)string)) {
            int n2 = 1000 * this.j.e();
            List<f.f.a.e.e.a> list = this.C;
            if (list != null && list.size() > 0) {
                long l2 = ((f.f.a.e.e.a)this.C.get(0)).j();
                if (System.currentTimeMillis() - l2 < (long)n2) {
                    d.super.d("hit ltorwc");
                    return;
                }
            }
        }
        d.super.c(string);
    }

    public final void a(List<f.f.a.e.e.a> list) {
        this.C = list;
    }

    public final void a(boolean bl) {
        this.p = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean a(List<f.f.a.e.e.a> list, boolean bl, int n2) {
        block1 : {
            block0 : {
                String string;
                block3 : {
                    block4 : {
                        f.f.a.e.e.a a2;
                        block2 : {
                            if (list == null || list.size() <= 0) break block0;
                            a2 = (f.f.a.e.e.a)list.get(0);
                            if (!f.f.a.s.f.c.a().a(94, this.b, this.q, list.size(), bl, n2, list)) break block1;
                            if (!bl) break block2;
                            f.f.a.s.f.j j2 = f.f.a.s.f.j.a();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(this.b);
                            stringBuilder.append("_");
                            stringBuilder.append(a2.L0());
                            stringBuilder.append("_");
                            stringBuilder.append(a2.p0());
                            if (!j2.c(stringBuilder.toString())) break block1;
                            string = "\u5927\u6a21\u677f\u4e1a\u52a1\uff0c\u5f00\u59cb\u68c0\u67e5\u5927\u6a21\u677f\u9884\u52a0\u8f7d\u60c5\u51b5\uff0c\u5927\u6a21\u677f\u9884\u52a0\u8f7d\u6210\u529f";
                            break block3;
                        }
                        if (a2.R0() == null || TextUtils.isEmpty((CharSequence)a2.R0().d())) break block4;
                        f.f.a.s.f.j j3 = f.f.a.s.f.j.a();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(this.b);
                        stringBuilder.append("_");
                        stringBuilder.append(a2.L0());
                        stringBuilder.append("_");
                        stringBuilder.append(a2.R0().d());
                        if (!j3.c(stringBuilder.toString())) break block1;
                        string = "\u975e\u5927\u6a21\u677f\u4e1a\u52a1\uff0c\u5b58\u5728\u64ad\u653e\u6a21\u677f\uff0c\u64ad\u653e\u6a21\u677f\u9884\u52a0\u8f7d\u6210\u529f";
                        break block3;
                    }
                    string = "\u975e\u5927\u6a21\u677f \u6ca1\u6709 template";
                }
                f.f.a.e.f.h.a((String)"RewardVideoController", (String)string);
                return true;
            }
            f.f.a.e.f.h.a((String)"RewardVideoController", (String)"\u6570\u636e\u4e3a\u7a7a");
        }
        return false;
    }

    public final void b() {
        try {
            this.j = f.f.a.n.b.a.a();
            return;
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.b((String)"RewardMVVideoAdapter", (String)throwable.getMessage(), (Throwable)throwable);
            return;
        }
    }

    public final void b(boolean bl) {
        this.q = bl;
    }

    public final void c(boolean bl) {
        if (bl) {
            return;
        }
        List<f.f.a.e.e.a> list = this.t;
        if (list != null && list.size() > 0) {
            a.b.a().a(this.b, this.t);
        }
    }

    public final boolean c() {
        List list = a.b.a().a(this.b, 1, this.q);
        if (list != null && list.size() > 0) {
            f.f.a.e.e.a a2 = (f.f.a.e.e.a)list.get(0);
            int n2 = a.b.a().b(this.b, 1, this.q);
            if (!TextUtils.isEmpty((CharSequence)a2.p0()) && a2.v0() == 1 && list.size() < n2) {
                return false;
            }
            return this.a((List<f.f.a.e.e.a>)list, true ^ TextUtils.isEmpty((CharSequence)a2.p0()), a2.v0());
        }
        f.f.a.e.f.h.a((String)"RewardVideoController", (String)"\u6570\u636e\u5e93\u53ef\u7528\u7684\u7f13\u5b58\u6570\u636e\u6761\u6570\uff1a0");
        return false;
    }

    public final void d(boolean bl) {
        block5 : {
            List<f.f.a.e.e.a> list;
            String string;
            a.b b2;
            block6 : {
                block4 : {
                    if (!bl) break block4;
                    List<f.f.a.e.e.a> list2 = this.C;
                    if (list2 == null || list2.size() <= 0) break block5;
                    for (f.f.a.e.e.a a2 : this.C) {
                        if (a2 == null) continue;
                        a2.v(0);
                        if (a2.R0() == null || TextUtils.isEmpty((CharSequence)a2.R0().d())) continue;
                        f.f.a.s.f.j j2 = f.f.a.s.f.j.a();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(this.b);
                        stringBuilder.append("_");
                        stringBuilder.append(a2.L0());
                        stringBuilder.append("_");
                        stringBuilder.append(a2.R0().d());
                        j2.d(stringBuilder.toString(), false);
                    }
                    b2 = a.b.a();
                    string = this.b;
                    list = this.C;
                    break block6;
                }
                List<f.f.a.e.e.a> list3 = this.t;
                if (list3 == null || list3.size() <= 0) break block5;
                for (f.f.a.e.e.a a3 : this.t) {
                    if (a3 == null) continue;
                    a3.v(0);
                    if (a3.R0() == null || TextUtils.isEmpty((CharSequence)a3.R0().d())) continue;
                    f.f.a.s.f.j j3 = f.f.a.s.f.j.a();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.b);
                    stringBuilder.append("_");
                    stringBuilder.append(a3.L0());
                    stringBuilder.append("_");
                    stringBuilder.append(a3.R0().d());
                    j3.d(stringBuilder.toString(), false);
                }
                b2 = a.b.a();
                string = this.b;
                list = this.t;
            }
            b2.a(string, list, "load_timeout", 0);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean e(boolean bl) {
        block5 : {
            List<f.f.a.e.e.a> list;
            String string;
            a.b b2;
            block6 : {
                block4 : {
                    if (!bl) break block4;
                    List<f.f.a.e.e.a> list2 = this.C;
                    if (list2 == null || list2.size() <= 0) break block5;
                    for (f.f.a.e.e.a a2 : this.C) {
                        if (a2 == null) continue;
                        a2.v(1);
                        if (a2.R0() == null || TextUtils.isEmpty((CharSequence)a2.R0().d())) continue;
                        f.f.a.s.f.j j2 = f.f.a.s.f.j.a();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(this.b);
                        stringBuilder.append("_");
                        stringBuilder.append(a2.L0());
                        stringBuilder.append("_");
                        stringBuilder.append(a2.R0().d());
                        j2.d(stringBuilder.toString(), true);
                    }
                    b2 = a.b.a();
                    string = this.b;
                    list = this.C;
                    break block6;
                }
                List<f.f.a.e.e.a> list3 = this.t;
                if (list3 == null || list3.size() <= 0) break block5;
                for (f.f.a.e.e.a a3 : this.t) {
                    if (a3 == null) continue;
                    a3.v(1);
                    if (a3.R0() == null || TextUtils.isEmpty((CharSequence)a3.R0().d())) continue;
                    f.f.a.s.f.j j3 = f.f.a.s.f.j.a();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.b);
                    stringBuilder.append("_");
                    stringBuilder.append(a3.L0());
                    stringBuilder.append("_");
                    stringBuilder.append(a3.R0().d());
                    j3.d(stringBuilder.toString(), true);
                }
                b2 = a.b.a();
                string = this.b;
                list = this.t;
            }
            b2.a(string, list, "load_timeout", 1);
            return true;
        }
        return false;
    }

}

