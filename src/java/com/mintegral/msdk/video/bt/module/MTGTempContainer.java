/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.webkit.WebView
 *  android.widget.FrameLayout
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  com.mintegral.msdk.base.common.report.d
 *  com.mintegral.msdk.video.bt.module.MTGTempContainer$a
 *  com.mintegral.msdk.video.bt.module.MTGTempContainer$b
 *  com.mintegral.msdk.video.bt.module.MTGTempContainer$c
 *  com.mintegral.msdk.video.bt.module.MTGTempContainer$d
 *  com.mintegral.msdk.video.bt.module.MTGTempContainer$e
 *  com.mintegral.msdk.video.bt.module.MTGTempContainer$f
 *  com.mintegral.msdk.video.bt.module.MTGTempContainer$g
 *  com.mintegral.msdk.video.bt.module.MTGTempContainer$h
 *  com.mintegral.msdk.video.bt.module.MTGTempContainer$i
 *  com.mintegral.msdk.video.bt.module.MTGTempContainer$i$a
 *  com.mintegral.msdk.video.bt.module.f.b
 *  com.mintegral.msdk.video.bt.module.g.f
 *  com.mintegral.msdk.video.module.MintegralContainerView
 *  com.mintegral.msdk.video.module.MintegralVideoView
 *  com.mintegral.msdk.video.module.j.a.f
 *  com.mintegral.msdk.video.module.j.b
 *  com.mintegral.msdk.video.module.k.a
 *  f.e.a.a.a.d.a
 *  f.e.a.a.a.d.b
 *  f.e.a.a.a.d.j.b
 *  f.e.a.a.a.d.j.c
 *  f.e.a.a.a.d.j.d
 *  f.f.a.a
 *  f.f.a.d.a
 *  f.f.a.e.b.b
 *  f.f.a.e.c.a
 *  f.f.a.e.c.c
 *  f.f.a.e.e.a$b
 *  f.f.a.e.e.n
 *  f.f.a.e.f.d
 *  f.f.a.e.f.h
 *  f.f.a.e.f.l
 *  f.f.a.e.f.o
 *  f.f.a.e.f.r
 *  f.f.a.f.c
 *  f.f.a.j.d
 *  f.f.a.j.i
 *  f.f.a.k.f.d
 *  f.f.a.k.f.e
 *  f.f.a.k.f.e$b
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mintegral.msdk.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.mintegral.msdk.video.bt.module.MTGTempContainer;
import com.mintegral.msdk.video.module.MintegralContainerView;
import com.mintegral.msdk.video.module.MintegralVideoView;
import com.mintegral.msdk.video.module.j.a.n;
import f.f.a.e.e.a;
import f.f.a.e.f.o;
import f.f.a.e.f.r;
import f.f.a.k.f.e;
import f.f.a.r.b.a.c;
import f.f.a.r.b.f;
import f.f.a.s.a;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public class MTGTempContainer
extends f.f.a.r.b.g.a {
    private static final String e0 = MTGTempContainer.class.getSimpleName();
    protected boolean A = false;
    private LayoutInflater B;
    protected boolean C = false;
    protected i D = new a();
    protected f.f.a.k.g.b E;
    protected MintegralVideoView F;
    protected MintegralContainerView G;
    protected Handler H = new Handler();
    private int I = 0;
    private int J = 0;
    private int K = 0;
    protected Runnable L;
    protected Runnable M;
    private View N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private f.f.a.k.f.e a0;
    private f.e.a.a.a.d.b b0;
    private f.e.a.a.a.d.j.d c0;
    private Runnable d0;
    private View q;
    private f.f.a.e.e.a r;
    private f.f.a.s.f.a s;
    private com.mintegral.msdk.video.bt.module.g.f t;
    private com.mintegral.msdk.video.bt.module.f.b u;
    private String v = "";
    private f.f.a.r.b.k.c w;
    private int x = f.f.a.e.b.b.q;
    private int y;
    private boolean z = false;

    public MTGTempContainer(Context context) {
        super(context);
        this.L = new a((MTGTempContainer)this);
        this.M = new b((MTGTempContainer)this);
        this.O = false;
        this.P = false;
        this.Q = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.b0 = null;
        this.c0 = null;
        this.d0 = new c((MTGTempContainer)this);
        this.a(context);
    }

    public MTGTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = new a((MTGTempContainer)this);
        this.M = new b((MTGTempContainer)this);
        this.O = false;
        this.P = false;
        this.Q = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.b0 = null;
        this.c0 = null;
        this.d0 = new c((MTGTempContainer)this);
        this.a(context);
    }

    static /* synthetic */ String A(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.d;
    }

    static /* synthetic */ String B(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.c;
    }

    static /* synthetic */ String C(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.d;
    }

    static /* synthetic */ String D(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.c;
    }

    static /* synthetic */ void E(MTGTempContainer mTGTempContainer) {
        if (mTGTempContainer.j()) {
            mTGTempContainer.b.runOnUiThread((Runnable)new g(mTGTempContainer));
        }
    }

    static /* synthetic */ int a(MTGTempContainer mTGTempContainer, int n2) {
        mTGTempContainer.I = n2;
        return n2;
    }

    static /* synthetic */ void a(MTGTempContainer mTGTempContainer) {
        if (mTGTempContainer.j()) {
            mTGTempContainer.b.runOnUiThread((Runnable)new h(mTGTempContainer));
        }
    }

    static /* synthetic */ boolean a(MTGTempContainer mTGTempContainer, boolean bl) {
        mTGTempContainer.U = bl;
        return bl;
    }

    static /* synthetic */ int b(MTGTempContainer mTGTempContainer, int n2) {
        mTGTempContainer.x = n2;
        return n2;
    }

    static /* synthetic */ boolean b(MTGTempContainer mTGTempContainer, boolean bl) {
        mTGTempContainer.P = bl;
        return bl;
    }

    static /* synthetic */ int c(MTGTempContainer mTGTempContainer, int n2) {
        mTGTempContainer.y = n2;
        return n2;
    }

    static /* synthetic */ boolean c(MTGTempContainer mTGTempContainer, boolean bl) {
        mTGTempContainer.V = bl;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d(int n2, String string) {
        f.f.a.e.e.n n3;
        String string2;
        String string3;
        try {
            n3 = new f.f.a.e.e.n();
            n3.l("2000037");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("code=");
            stringBuilder.append(n2);
            stringBuilder.append(",desc=");
            stringBuilder.append(string);
            n3.h(stringBuilder.toString());
            f.f.a.e.e.a a2 = this.r;
            string2 = "";
            string3 = a2 != null && this.r.R0() != null ? this.r.R0().d() : string2;
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.b((String)e0, (String)throwable.getMessage(), (Throwable)throwable);
            return;
        }
        n3.g(string3);
        n3.j(this.c);
        if (this.r != null) {
            string2 = this.r.e();
        }
        n3.k(string2);
        if (this.r != null && !TextUtils.isEmpty((CharSequence)this.r.M0())) {
            n3.i(this.r.M0());
        }
        int n4 = f.f.a.e.f.d.z((Context)this.getContext());
        n3.b(n4);
        n3.o(f.f.a.e.f.d.a((Context)this.getContext(), (int)n4));
        com.mintegral.msdk.video.module.k.a.a((String)f.f.a.e.e.n.d((f.f.a.e.e.n)n3), (String)this.c);
    }

    static /* synthetic */ boolean d(MTGTempContainer mTGTempContainer, boolean bl) {
        mTGTempContainer.W = bl;
        return bl;
    }

    static /* synthetic */ View f(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.N;
    }

    static /* synthetic */ Activity g(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.b;
    }

    static /* synthetic */ Activity h(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.b;
    }

    static /* synthetic */ f.f.a.e.e.a i(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.r;
    }

    static /* synthetic */ f.f.a.s.f.a j(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.s;
    }

    static /* synthetic */ boolean k(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.j;
    }

    static /* synthetic */ String m(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.c;
    }

    static /* synthetic */ String n(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.c;
    }

    static /* synthetic */ f.e.a.a.a.d.j.d o(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.c0;
    }

    static /* synthetic */ String p(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.d;
    }

    static /* synthetic */ String q() {
        return e0;
    }

    static /* synthetic */ String q(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.c;
    }

    private int r() {
        f.f.a.r.b.a.j j2 = this.a(this.r);
        if (j2 != null) {
            return j2.g();
        }
        return 0;
    }

    /*
     * Exception decompiling
     */
    static /* synthetic */ void r(MTGTempContainer var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl56 : RETURN : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:885)
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

    static /* synthetic */ String s(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.d;
    }

    private boolean s() {
        f.f.a.r.b.a.j j2 = this.a(this.r);
        if (j2 != null) {
            return j2.j();
        }
        return false;
    }

    static /* synthetic */ String t(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.c;
    }

    private void t() {
        com.mintegral.msdk.base.common.report.d d2 = new com.mintegral.msdk.base.common.report.d(this.getContext());
        f.f.a.e.e.a a2 = this.r;
        if (a2 != null) {
            d2.a(a2.M0(), this.r.e(), this.c, f.f.a.k.f.d.a((String)this.r.e()), this.r.k1());
            f.f.a.k.f.d.b((String)this.r.e());
            this.R = true;
        }
    }

    private String u() {
        String string = this.v();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("reward------ ");
        stringBuilder.append(string);
        f.f.a.e.f.h.d((String)"VideoCache", (String)stringBuilder.toString());
        boolean bl = string.endsWith(".dltmp");
        String string2 = "";
        if (bl) {
            try {
                f.f.a.j.i i2 = f.f.a.e.c.c.c().a(this.getContext(), string);
                string2 = i2.b(this.r.d1());
                i2.a((f.f.a.j.d)new f(this), this.r.d1());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("\u4e0a\u9762");
                stringBuilder2.append(string2);
                stringBuilder2.append("playUrl-->");
                stringBuilder2.append(this.r.d1());
                stringBuilder2.append("title");
                stringBuilder2.append(this.r.c());
                stringBuilder2.append(" id-->");
                stringBuilder2.append(this.r.e());
                f.f.a.e.f.h.d((String)"VideoCache", (String)stringBuilder2.toString());
                return string2;
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
                return string2;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return string2;
            }
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("\u4e0b\u9762");
        stringBuilder3.append(string2);
        f.f.a.e.f.h.d((String)"VideoCache", (String)stringBuilder3.toString());
        String string3 = this.v();
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("\u4e0b\u9762");
        stringBuilder4.append(string3);
        f.f.a.e.f.h.d((String)"VideoCache", (String)stringBuilder4.toString());
        return string3;
    }

    static /* synthetic */ String u(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.d;
    }

    private String v() {
        String string = this.r.d1();
        try {
            boolean bl;
            String string2;
            if (this.s != null && (this.s.i() == 5 || this.s.i() == 6) && !r.a((String)(string2 = this.s.d())) && (bl = new File(string2).exists())) {
                return string2;
            }
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.b((String)e0, (String)throwable.getMessage(), (Throwable)throwable);
        }
        return string;
    }

    static /* synthetic */ String v(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int w() {
        int n2 = 5;
        try {
            f.f.a.s.d.a a2 = f.f.a.s.d.b.c().a();
            if (a2 == null) {
                f.f.a.s.d.b.c().b();
            }
            if (a2 != null) {
                n2 = (int)a2.e();
            }
            String string = e0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MintegralBaseView buffetTimeout:");
            stringBuilder.append(n2);
            f.f.a.e.f.h.b((String)string, (String)stringBuilder.toString());
            return n2;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return n2;
        }
    }

    static /* synthetic */ String w(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.d;
    }

    static /* synthetic */ String x(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.c;
    }

    static /* synthetic */ boolean y(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.j;
    }

    static /* synthetic */ Runnable z(MTGTempContainer mTGTempContainer) {
        return mTGTempContainer.d0;
    }

    public void a(Context context) {
        this.B = LayoutInflater.from((Context)context);
    }

    public void a(i i2) {
        this.D = i2;
    }

    @Override
    protected final void a(String string) {
        com.mintegral.msdk.video.bt.module.g.f f2 = this.t;
        if (f2 != null) {
            f2.b(string);
        }
        super.a(string);
    }

    public int b(String string) {
        return o.a((Context)this.getContext(), (String)string, (String)"id");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void b() {
        block24 : {
            block25 : {
                block27 : {
                    block26 : {
                        if (this.z) {
                            return;
                        }
                        var1_1 = true;
                        this.z = var1_1;
                        super.b();
                        if (this.E != null) {
                            var9_2 = (ViewGroup)this.E.getParent();
                            if (var9_2 != null) {
                                var9_2.removeAllViews();
                            }
                            this.E.c();
                            this.E.e();
                        }
                        if (this.u != null) {
                            this.u = null;
                        }
                        this.H.removeCallbacks(this.L);
                        this.H.removeCallbacks(this.M);
                        this.getJSCommon().a();
                        if (this.j) {
                            f.f.a.f.c.b().b(this.c);
                        }
                        if (var3_3 = this.O) ** GOTO lbl33
                        try {
                            this.O = var1_1;
                            if (this.r != null && this.r.D0() == 2) {
                                this.P = var1_1;
                            }
                            if (this.t == null) break block24;
                            if (!this.j || this.l != f.f.a.e.b.b.m && this.l != f.f.a.e.b.b.n) break block25;
                            var8_4 = this.t;
                            if (this.y != var1_1) break block26;
                            break block27;
                        }
                        catch (Throwable var5_7) {
                            try {
                                f.f.a.e.f.h.b((String)MTGTempContainer.e0, (String)var5_7.getMessage(), (Throwable)var5_7);
lbl33: // 4 sources:
                                do {
                                    if (!this.R) {
                                        this.t();
                                    }
                                    if (this.a0 != null) {
                                        this.a0.d();
                                    }
                                    if (this.b0 != null) {
                                        this.b0.b();
                                        this.b0.a();
                                        this.b0 = null;
                                    }
                                    if (!this.o) {
                                        if (this.j()) {
                                            this.H.postDelayed((Runnable)new d(this), 100L);
                                        } else if (this.b != null) {
                                            this.b.finish();
                                        }
                                    }
                                    if (!this.R) {
                                        this.t();
                                    }
                                    f.f.a.r.a.a.b.b().b(this.v);
                                    return;
                                    break;
                                } while (true);
                            }
                            catch (Throwable var2_8) {
                                f.f.a.e.f.h.a((String)MTGTempContainer.e0, (String)var2_8.getMessage());
                                return;
                            }
                        }
                    }
                    var1_1 = false;
                }
                var8_4.a(var1_1, this.x);
            }
            this.t.a(this.P, this.g);
        }
        this.H.removeCallbacks(this.d0);
        if (!(this.j || this.o || !this.P || this.t != null && this.t.b())) {
            f.f.a.e.f.h.a((String)MTGTempContainer.e0, (String)"sendToServerRewardInfo");
            com.mintegral.msdk.video.module.k.a.a((f.f.a.e.e.a)this.r, (f.f.a.s.b.d)this.g, (String)this.c, (String)this.f);
        }
        if (!this.o) {
            if (this.j) {
                var6_5 = 287;
                var7_6 = this.r;
            } else {
                var6_5 = 94;
                var7_6 = this.r;
            }
            f.f.a.s.a.b(var6_5, var7_6);
        }
        if (this.G == null) ** GOTO lbl33
        this.G.v();
        ** while (true)
    }

    public void b(int n2, String string) {
        this.c(n2, string);
        String string2 = e0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hybrid load error ,start defaultLoad,desc:");
        stringBuilder.append(string);
        f.f.a.e.f.h.a((String)string2, (String)stringBuilder.toString());
        if (this.j()) {
            if (this.r.D0() == 2) {
                this.G.setCampaign(this.r);
                this.G.setUnitID(this.c);
                this.G.setCloseDelayTime(this.e.o());
                this.G.setPlayCloseBtnTm(this.e.l());
                MintegralContainerView mintegralContainerView = this.G;
                com.mintegral.msdk.video.module.j.a.h h2 = new com.mintegral.msdk.video.module.j.a.h(this.r, this.s, this.g, this.a(), this.c, (com.mintegral.msdk.video.module.j.b)new k((MTGTempContainer)this, null), this.e.C(), this.o);
                mintegralContainerView.setNotifyListener((com.mintegral.msdk.video.module.j.b)h2);
                this.G.a(this.w);
                this.G.x();
                return;
            }
            MTGTempContainer.super.d(n2, string);
            this.N.setVisibility(8);
            this.k();
            int n3 = this.e.j();
            int n4 = MTGTempContainer.super.r();
            int n5 = n4 != 0 ? n4 : n3;
            MintegralVideoView mintegralVideoView = this.F;
            com.mintegral.msdk.video.module.j.a.m m2 = new com.mintegral.msdk.video.module.j.a.m(mintegralVideoView, this.G, this.r, this.g, this.s, this.a(), this.c, n5, this.e.i(), (com.mintegral.msdk.video.module.j.b)new m((MTGTempContainer)this, null), this.e.z(), this.e.C(), this.o);
            mintegralVideoView.setNotifyListener((com.mintegral.msdk.video.module.j.b)m2);
            this.F.k();
            MintegralContainerView mintegralContainerView = this.G;
            com.mintegral.msdk.video.module.j.a.b b2 = new com.mintegral.msdk.video.module.j.a.b(this.F, mintegralContainerView, this.r, this.g, this.s, this.a(), this.c, (com.mintegral.msdk.video.module.j.b)(MTGTempContainer)this.new j(this.b, this.r), this.e.C(), this.o);
            mintegralContainerView.setNotifyListener((com.mintegral.msdk.video.module.j.b)b2);
            this.G.k();
            return;
        }
        MTGTempContainer.super.d(n2, string);
        Activity activity = this.b;
        if (activity != null) {
            activity.finish();
        }
    }

    public int c(String string) {
        return o.a((Context)this.getContext(), (String)string, (String)"layout");
    }

    @Override
    public void c() {
        super.c();
        this.Q = true;
        try {
            this.getJSVideoModule().a(2);
            return;
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.b((String)e0, (String)throwable.getMessage(), (Throwable)throwable);
            return;
        }
    }

    public void c(int n2, String string) {
        String string2 = e0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("receiveError:");
        stringBuilder.append(n2);
        stringBuilder.append(",descroption:");
        stringBuilder.append(string);
        f.f.a.e.f.h.d((String)string2, (String)stringBuilder.toString());
        this.H.removeCallbacks(this.L);
        this.H.removeCallbacks(this.M);
        this.D.a(true);
        f.f.a.k.g.b b2 = this.E;
        if (b2 != null) {
            b2.setVisibility(8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d() {
        void var2_5;
        super.d();
        int n2 = this.I;
        if (n2 == -3) {
            Runnable runnable = this.L;
        } else if (n2 == -4) {
            Runnable runnable = this.M;
        } else {
            Object var2_4 = null;
        }
        if (var2_5 != null) {
            var2_5.run();
            this.I = 0;
        }
        try {
            if (this.Q) {
                MintegralVideoView mintegralVideoView = this.F;
                boolean bl = false;
                if (mintegralVideoView != null) {
                    bl = this.F.r();
                }
                if (!bl) {
                    this.getJSVideoModule().a(1);
                }
            }
            if (this.b != null) {
                f.f.a.e.f.l.a((View)this.b.getWindow().getDecorView());
            }
            if (!this.S) return;
            if (!this.T) return;
            if (this.b == null) return;
            this.b.finish();
            return;
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.b((String)e0, (String)throwable.getMessage(), (Throwable)throwable);
        }
    }

    public boolean e() {
        MintegralContainerView mintegralContainerView = this.G;
        return mintegralContainerView == null || mintegralContainerView.p();
        {
        }
    }

    public MintegralContainerView f() {
        return (MintegralContainerView)this.findViewById(this.b("mintegral_video_templete_container"));
    }

    public MintegralVideoView g() {
        return (MintegralVideoView)this.findViewById(this.b("mintegral_video_templete_videoview"));
    }

    public f.f.a.e.e.a getCampaign() {
        return this.r;
    }

    public String getInstanceId() {
        return this.v;
    }

    public int getLayoutID() {
        String string = this.S ? "mintegral_reward_activity_video_templete_transparent" : "mintegral_reward_activity_video_templete";
        return this.c(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.f.a.k.g.b h() {
        try {
            if (this.o) {
                f.f.a.e.f.h.a((String)e0, (String)"\u5f53\u524d\u5927\u6a21\u677f");
                if (this.r == null || this.r.R0() == null) return null;
                {
                    f.f.a.e.f.h.a((String)e0, (String)"\u5f53\u524d\u5927\u6a21\u677f\uff0c\u5b58\u5728\u64ad\u653e\u6a21\u677f");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.c);
                    stringBuilder.append("_");
                    stringBuilder.append(this.r.e());
                    stringBuilder.append("_");
                    stringBuilder.append(this.r.L0());
                    stringBuilder.append("_");
                    stringBuilder.append(this.r.R0().d());
                    a.a a2 = f.f.a.s.a.a(stringBuilder.toString());
                    if (a2 == null) return null;
                    return a2.a();
                }
            } else {
                f.f.a.e.f.h.a((String)e0, (String)"\u5f53\u524d\u975e\u5927\u6a21\u677f");
                a.a a3 = this.j ? f.f.a.s.a.a(287, this.r) : f.f.a.s.a.a(94, this.r);
                if (a3 == null || !a3.c()) return null;
                {
                    if (this.j) {
                        f.f.a.s.a.b(287, this.r);
                    } else {
                        f.f.a.s.a.b(94, this.r);
                    }
                    f.f.a.k.g.b b2 = a3.a();
                    if (!this.S) return b2;
                    {
                        b2.f();
                    }
                    return b2;
                }
            }
        }
        catch (Exception exception) {
            if (!f.f.a.a.a) return null;
            exception.printStackTrace();
        }
        return null;
    }

    public boolean i() {
        this.N = this.findViewById(this.b("mintegral_video_templete_progressbar"));
        return this.N != null;
    }

    public boolean j() {
        return this.C;
    }

    public void k() {
        f.e.a.a.a.d.b b2;
        int n2;
        f.f.a.r.b.a.j j2 = this.a(this.r);
        int n3 = j2 != null ? j2.h() : 0;
        if (n3 != 0) {
            this.i = n3;
        }
        int n4 = this.e.j();
        int n5 = this.r();
        int n6 = n5 != 0 ? n5 : n4;
        if (this.r != null) {
            this.b0 = f.f.a.d.a.a((Context)this.getContext(), (boolean)false, (String)this.r.A0(), (String)this.r.M0(), (String)this.r.e(), (String)this.c);
        }
        this.F.setSoundState(this.i);
        this.F.setCampaign(this.r);
        this.F.setPlayURL(this.u());
        this.F.setVideoSkipTime(this.e.i());
        this.F.setCloseAlert(this.e.m());
        this.F.setBufferTimeout(this.w());
        MintegralVideoView mintegralVideoView = this.F;
        n n7 = new n(this.w, this.r, this.g, this.s, this.a(), this.c, n6, this.e.i(), (com.mintegral.msdk.video.module.j.b)new m(this, null), this.e.z(), this.e.C(), this.o);
        mintegralVideoView.setNotifyListener((com.mintegral.msdk.video.module.j.b)n7);
        this.F.setShowingTransparent(this.S);
        this.F.setAdSession(this.b0);
        if (this.j && ((n2 = this.l) == f.f.a.e.b.b.m || n2 == f.f.a.e.b.b.n)) {
            this.F.c(this.l, this.m, this.n);
            MintegralVideoView mintegralVideoView2 = this.F;
            int n8 = this.getJSCommon() != null ? this.getJSCommon().f() : 1;
            mintegralVideoView2.setDialogRole(n8);
        }
        this.G.setCampaign(this.r);
        this.G.setUnitID(this.c);
        this.G.setCloseDelayTime(this.e.o());
        this.G.setPlayCloseBtnTm(this.e.l());
        this.G.setVideoInteractiveType(this.e.k());
        this.G.setEndscreenType(this.e.p());
        this.G.setVideoSkipTime(this.e.i());
        this.G.setShowingTransparent(this.S);
        this.G.setJSFactory(this.w);
        if (this.r.D0() == 2) {
            MintegralContainerView mintegralContainerView = this.G;
            com.mintegral.msdk.video.module.j.a.h h2 = new com.mintegral.msdk.video.module.j.a.h(this.r, this.s, this.g, this.a(), this.c, (com.mintegral.msdk.video.module.j.b)new k(this, null), this.e.C(), this.o);
            mintegralContainerView.setNotifyListener((com.mintegral.msdk.video.module.j.b)h2);
            this.G.a(this.w);
            this.G.x();
        } else {
            MintegralContainerView mintegralContainerView = this.G;
            com.mintegral.msdk.video.module.j.a.c c2 = new com.mintegral.msdk.video.module.j.a.c(this.w, this.r, this.g, this.s, this.a(), this.c, (com.mintegral.msdk.video.module.j.b)new j(this.b, this.r), this.e.C(), this.o);
            mintegralContainerView.setNotifyListener((com.mintegral.msdk.video.module.j.b)c2);
            this.G.a(this.w);
            this.F.a(this.w);
        }
        if (this.S) {
            this.G.w();
        }
        if ((b2 = this.b0) != null) {
            f.f.a.k.g.b b3;
            b2.a((View)this.G);
            View view = this.N;
            if (view != null) {
                this.b0.a(view);
            }
            if ((b3 = this.E) != null) {
                this.b0.a((View)b3);
            }
            f.e.a.a.a.d.a a2 = f.e.a.a.a.d.a.a((f.e.a.a.a.d.b)this.b0);
            this.c0 = f.e.a.a.a.d.j.d.a((f.e.a.a.a.d.b)this.b0);
            this.b0.c();
            f.e.a.a.a.d.j.c c3 = f.e.a.a.a.d.j.c.a((boolean)true, (f.e.a.a.a.d.j.b)f.e.a.a.a.d.j.b.f);
            this.c0.a(c3);
            this.F.setVideoEvents(this.c0);
            if (a2 != null) {
                try {
                    a2.a();
                    return;
                }
                catch (Exception exception) {
                    f.f.a.e.f.h.a((String)"omsdk", (String)exception.getMessage());
                }
            }
        }
    }

    public void l() {
        MintegralVideoView mintegralVideoView;
        MintegralContainerView mintegralContainerView;
        MintegralVideoView mintegralVideoView2;
        MintegralContainerView mintegralContainerView2;
        if (this.S && (mintegralVideoView = this.F) != null) {
            mintegralVideoView.t();
            return;
        }
        if (this.U && (mintegralVideoView2 = this.F) != null) {
            if (mintegralVideoView2.q()) {
                MintegralContainerView mintegralContainerView3 = this.G;
                if (mintegralContainerView3 != null) {
                    mintegralContainerView3.t();
                }
                return;
            }
            this.F.u();
            return;
        }
        if (this.W && (mintegralContainerView = this.G) != null) {
            mintegralContainerView.u();
            return;
        }
        if (this.V && (mintegralContainerView2 = this.G) != null) {
            mintegralContainerView2.s();
        }
        if (this.getJSCommon().c()) {
            if (this.getJSContainerModule() != null && this.getJSContainerModule().a()) {
                return;
            }
            this.getActivityProxy().e();
            return;
        }
        if (this.e()) {
            Activity activity = this.b;
            if (activity != null && !this.o) {
                activity.onBackPressed();
                return;
            }
        } else {
            f.f.a.e.f.h.a((String)e0, (String)"onBackPressed can't excute");
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m() {
        var1_1 = MTGTempContainer.e0;
        var2_2 = new StringBuilder();
        var2_2.append("onCreate isBigOffer: ");
        var2_2.append(this.o);
        f.f.a.e.f.h.a((String)var1_1, (String)var2_2.toString());
        if (this.e == null) {
            this.e = f.f.a.s.d.b.c().a(f.f.a.e.c.a.i().f(), this.c, this.j);
        }
        try {
            block21 : {
                block20 : {
                    block23 : {
                        block24 : {
                            block22 : {
                                if (this.o) {
                                    this.t = new com.mintegral.msdk.video.bt.module.g.c(this.u, this.v);
                                } else {
                                    var9_3 = new com.mintegral.msdk.video.bt.module.g.a(this.getContext(), this.j, this.e, this.r, this.t, this.a(), this.c);
                                    this.t = var9_3;
                                }
                                this.a(new com.mintegral.msdk.video.bt.module.g.d(this.t));
                                this.a(this.e, this.r);
                                this.p();
                                var10_4 = this.getLayoutID();
                                if (var10_4 <= 0) {
                                    this.a("layoutID not found");
                                    return;
                                }
                                this.q = this.B.inflate(var10_4, null);
                                this.addView(this.q, (ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -1));
                                if (this.A) {
                                    this.o();
                                }
                                this.E = this.h();
                                this.F = this.g();
                                this.F.setIsIV(this.j);
                                this.F.setUnitId(this.c);
                                this.G = this.f();
                                var11_5 = this.F != null && this.G != null && this.i() != false;
                                if (!var11_5) {
                                    this.D.b("not found View IDS");
                                    if (this.b == null) return;
                                    {
                                        this.b.finish();
                                        return;
                                    }
                                }
                                this.C = true;
                                var12_6 = this.E;
                                this.w = var13_7 = new f.f.a.r.b.k.c(this.b, (WebView)var12_6, this.F, this.G, this.r, new l(this, null));
                                this.a(this.w);
                                if (var12_6 == null) ** GOTO lbl72
                                var14_8 = (ViewGroup)this.q.findViewById(o.a((Context)this.getContext(), (String)"mintegral_video_templete_webview_parent", (String)"id"));
                                var12_6.setApiManagerJSFactory(this.w);
                                if (var12_6.getParent() != null) ** GOTO lbl73
                                if (!(var12_6.getObject() instanceof f.f.a.r.b.a.j)) break block21;
                                this.w.a((f.f.a.r.b.a.j)var12_6.getObject());
                                this.getJSCommon().a(this.i);
                                this.getJSCommon().b(this.c);
                                this.getJSCommon().a(this.e);
                                this.getJSCommon().a(new l(this, null));
                                if (this.r != null && (this.r.m1() || this.r.j1())) {
                                    this.a0 = new f.f.a.k.f.e(this.getContext());
                                    this.a0.c();
                                    this.a0.a();
                                    this.a0.a((e.b)new e(this));
                                }
                                var16_9 = ((f.f.a.r.b.a.j)var12_6.getObject()).k();
                                this.getJSContainerModule().d(var16_9);
                                if (this.E == null) break block20;
                                var18_10 = this.getResources().getConfiguration().orientation;
                                if (!this.s()) break block22;
                                var19_11 = f.f.a.e.f.l.f((Context)this.getContext());
                                var20_12 = f.f.a.e.f.l.g((Context)this.getContext());
                                if (!f.f.a.e.f.l.i((Context)this.getContext())) break block23;
                                var37_13 = f.f.a.e.f.l.h((Context)this.getContext());
                                if (var18_10 != 2) break block24;
                                var19_11 += var37_13;
                                break block23;
                            }
                            var19_11 = f.f.a.e.f.l.e((Context)this.getContext());
                            var20_12 = f.f.a.e.f.l.d((Context)this.getContext());
                            break block23;
lbl72: // 1 sources:
                            f.f.a.e.f.h.a((String)MTGTempContainer.e0, (String)"template webview is null");
lbl73: // 2 sources:
                            this.b(0, "preload template webview is null or load error");
                            return;
                        }
                        var20_12 += var37_13;
                    }
                    var21_14 = this.r.R0().b();
                    if (this.b(this.r) == 1) {
                        var21_14 = var18_10;
                    }
                    this.getJSNotifyProxy().a(var18_10, var21_14, var19_11, var20_12);
                    var22_15 = new JSONObject();
                    var22_15.put(f.f.a.e.b.b.j, (double)f.f.a.e.f.l.b((Context)this.getContext()));
                    try {
                        if (this.g != null) {
                            var30_16 = new JSONObject();
                            var30_16.put("name", (Object)this.g.a());
                            var30_16.put("amount", this.g.b());
                            var30_16.put("id", (Object)this.h);
                            var22_15.put("userId", (Object)this.f);
                            var22_15.put("reward", (Object)var30_16);
                            var22_15.put("playVideoMute", this.i);
                        }
                        ** GOTO lbl104
                    }
                    catch (Exception var29_17) {
                        try {
                            block25 : {
                                var25_18 = MTGTempContainer.e0;
                                var26_19 = var29_17.getMessage();
                                break block25;
                                catch (JSONException var24_20) {
                                    var25_18 = MTGTempContainer.e0;
                                    var26_19 = var24_20.getMessage();
                                }
                            }
                            f.f.a.e.f.h.a((String)var25_18, (String)var26_19);
lbl104: // 2 sources:
                            var27_21 = var22_15.toString();
                            this.getJSNotifyProxy().a(var27_21);
                            this.getJSCommon().a(true);
                            this.k();
                            this.H.postDelayed(this.L, 2000L);
                        }
                        catch (Exception var17_22) {
                            if (!f.f.a.a.a) break block20;
                            var17_22.printStackTrace();
                        }
                    }
                }
                ((f.f.a.r.b.a.j)var12_6.getObject()).m.a();
                if (this.o) {
                    this.getJSCommon().b(this.J);
                    this.getJSCommon().c(this.K);
                }
            }
            if (this.getJSCommon().b() == 1 && (var15_23 = (ViewGroup)this.q.findViewById(o.a((Context)this.getContext(), (String)"mintegral_video_templete_webview_parent", (String)"id"))) != null) {
                ((ViewGroup)this.q).removeView((View)var15_23);
                ((ViewGroup)this.q).addView((View)var15_23, 1);
            }
            var14_8.addView((View)var12_6, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        catch (Throwable var5_24) {
            var6_25 = new StringBuilder();
            var6_25.append("onCreate error");
            var6_25.append((Object)var5_24);
            this.a(var6_25.toString());
        }
    }

    public void n() {
        f.f.a.e.f.h.a((String)e0, (String)"receiveSuccess ,start hybrid");
        this.H.removeCallbacks(this.M);
        this.H.postDelayed(this.d0, 250L);
    }

    public void o() {
        ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
        if (layoutParams == null) {
            this.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onDetachedFromWindow() {
        FrameLayout.super.onDetachedFromWindow();
    }

    public void p() {
        Activity activity;
        int n2;
        this.S = this.s();
        if (!this.S && (n2 = o.a((Context)this.getContext(), (String)"mintegral_reward_theme", (String)"style")) > 1 && (activity = this.b) != null) {
            activity.setTheme(n2);
        }
    }

    public void setCampaign(f.f.a.e.e.a a2) {
        this.r = a2;
    }

    public void setCampaignDownLoadTask(f.f.a.s.f.a a2) {
        this.s = a2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setCampaignExpired(boolean bl) {
        try {
            f.f.a.e.e.a a2;
            if (this.r == null) return;
            if (bl) {
                this.r.K(1);
                if (this.k) {
                    a2 = this.r;
                } else {
                    if (this.e == null) return;
                    if (this.e.C() == 1) {
                        this.r.g(1);
                        return;
                    }
                    a2 = this.r;
                }
            } else {
                this.r.K(0);
                if (!this.r.k1()) {
                    if (this.e == null) return;
                    int n2 = this.e.f();
                    this.r.g(n2);
                    return;
                }
                a2 = this.r;
            }
            a2.g(0);
            return;
        }
        catch (Exception exception) {
            f.f.a.e.f.h.d((String)e0, (String)exception.getMessage());
        }
    }

    public void setH5Cbp(int n2) {
        this.K = n2;
    }

    public void setInstanceId(String string) {
        this.v = string;
    }

    public void setJSFactory(f.f.a.r.b.k.c c2) {
        this.w = c2;
    }

    public void setMediaPlayerUrl(String string) {
    }

    public void setMintegralTempCallback(com.mintegral.msdk.video.bt.module.f.b b2) {
        this.u = b2;
    }

    public void setShowRewardListener(com.mintegral.msdk.video.bt.module.g.f f2) {
        this.t = f2;
    }

    public void setWebViewFront(int n2) {
        this.J = n2;
    }

    private final class j
    extends com.mintegral.msdk.video.module.j.a.a {
        public j(Activity activity, f.f.a.e.e.a a2) {
            super(activity, a2);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        @Override
        public final void a(int var1, Object var2_2) {
            block10 : {
                block8 : {
                    block9 : {
                        block7 : {
                            var3_3 = MTGTempContainer.this;
                            var4_4 = 1;
                            MTGTempContainer.c(var3_3, (boolean)var4_4);
                            var6_5 = "";
                            if (var1 == 108) break block7;
                            if (var1 == 113) ** GOTO lbl-1000
                            if (var1 == 117) ** GOTO lbl24
                            if (var1 == 126) ** GOTO lbl19
                            switch (var1) {
                                default: {
                                    break;
                                }
                                case 105: {
                                    var7_6 = MTGTempContainer.this.getJSCommon();
                                    if (var2_2 == null) break block8;
                                    break block9;
                                }
                                case 103: 
                                case 104: {
                                    MTGTempContainer.r(MTGTempContainer.this);
                                    break;
                                }
lbl19: // 1 sources:
                                var8_7 = MTGTempContainer.l(MTGTempContainer.this);
                                var9_8 = MTGTempContainer.w(MTGTempContainer.this);
                                var10_9 = MTGTempContainer.x(MTGTempContainer.this);
                                var4_4 = 0;
                                ** GOTO lbl30
lbl24: // 1 sources:
                                MTGTempContainer.l(MTGTempContainer.this).b(MTGTempContainer.u(MTGTempContainer.this), MTGTempContainer.v(MTGTempContainer.this));
                                break;
                                case 106: lbl-1000: // 2 sources:
                                {
                                    var8_7 = MTGTempContainer.l(MTGTempContainer.this);
                                    var9_8 = MTGTempContainer.s(MTGTempContainer.this);
                                    var10_9 = MTGTempContainer.t(MTGTempContainer.this);
lbl30: // 2 sources:
                                    var8_7.a((boolean)var4_4, var9_8, var10_9);
                                    break;
                                }
                            }
                            break block10;
                        }
                        MTGTempContainer.this.getJSCommon().a(new c.b(MTGTempContainer.this.getJSCommon(), new l(MTGTempContainer.this, null)));
                        var7_6 = MTGTempContainer.this.getJSCommon();
                        if (var2_2 == null) break block8;
                    }
                    var6_5 = var2_2.toString();
                }
                var7_6.a(var4_4, var6_5);
                ** break;
            }
            super.a(var1, var2_2);
        }
    }

    private final class k
    extends com.mintegral.msdk.video.module.j.a.f {
        final /* synthetic */ MTGTempContainer a;

        private k(MTGTempContainer mTGTempContainer) {
            this.a = mTGTempContainer;
        }

        /* synthetic */ k(MTGTempContainer mTGTempContainer, a a2) {
            super(mTGTempContainer);
        }

        /*
         * Exception decompiling
         */
        public final void a(int var1, Object var2) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl65 : ILOAD_1 : trying to set 1 previously set to 0
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
    }

    private final class l
    extends c.a {
        final /* synthetic */ MTGTempContainer a;

        private l(MTGTempContainer mTGTempContainer) {
            this.a = mTGTempContainer;
        }

        /* synthetic */ l(MTGTempContainer mTGTempContainer, a a2) {
            super(mTGTempContainer);
        }

        @Override
        public final void a() {
            super.a();
            this.a.n();
        }

        @Override
        public final void a(f.f.a.m.a a2, String string) {
            super.a(a2, string);
            MTGTempContainer.a(this.a);
            this.a.T = true;
        }

        @Override
        public final void a(boolean bl) {
            super.a(bl);
            this.a.t.a(bl, this.a.d, this.a.c);
        }

        @Override
        public final void b(f.f.a.m.a a2, String string) {
            super.b(a2, string);
            this.a.T = true;
            MTGTempContainer.a(this.a);
            if (a2 != null && a2 instanceof f.f.a.e.e.a) {
                try {
                    f.f.a.e.e.a a3 = (f.f.a.e.e.a)a2;
                    String string2 = new JSONObject(this.a.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                    if (a3.l0() == 3 && a3.K() == 2 && string2.equals((Object)"1.0") && this.a.b != null) {
                        this.a.b.finish();
                        return;
                    }
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                }
            }
        }

        @Override
        public final void c(f.f.a.m.a a2, String string) {
            super.c(a2, string);
            MTGTempContainer.E(this.a);
        }
    }

    private final class m
    extends com.mintegral.msdk.video.module.j.a.f {
        final /* synthetic */ MTGTempContainer a;

        private m(MTGTempContainer mTGTempContainer) {
            this.a = mTGTempContainer;
        }

        /* synthetic */ m(MTGTempContainer mTGTempContainer, a a2) {
            super(mTGTempContainer);
        }

        /*
         * Exception decompiling
         */
        public final void a(int var1, Object var2_2) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
            // org.benf.cfr.reader.b.a.a.b.as.a(SwitchReplacer.java:478)
            // org.benf.cfr.reader.b.a.a.b.as.a(SwitchReplacer.java:61)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:372)
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
    }

}

