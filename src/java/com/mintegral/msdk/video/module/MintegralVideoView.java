/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.TextView
 *  com.mintegral.msdk.base.common.report.e
 *  com.mintegral.msdk.playercommon.PlayerView
 *  com.mintegral.msdk.playercommon.e
 *  com.mintegral.msdk.video.module.MintegralVideoView$a
 *  com.mintegral.msdk.video.module.MintegralVideoView$b
 *  com.mintegral.msdk.video.module.MintegralVideoView$c
 *  com.mintegral.msdk.video.module.MintegralVideoView$e
 *  com.mintegral.msdk.video.module.MintegralVideoView$f
 *  com.mintegral.msdk.video.module.b
 *  com.mintegral.msdk.video.module.j.b
 *  com.mintegral.msdk.video.widget.SoundImageView
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.mintegral.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.mintegral.msdk.playercommon.PlayerView;
import com.mintegral.msdk.video.module.MintegralVideoView;
import com.mintegral.msdk.video.widget.SoundImageView;
import f.f.a.e.f.h;
import f.f.a.e.f.l;
import f.f.a.e.f.r;
import f.f.a.j.i;
import f.f.a.r.b.n;
import org.json.JSONObject;

public class MintegralVideoView
extends com.mintegral.msdk.video.module.b
implements n {
    private static int b0;
    private static int c0;
    private static int d0;
    private static int e0;
    private static int f0;
    private static boolean g0;
    private boolean A = false;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private int G;
    private boolean H = false;
    private int I = 2;
    private f.e.a.a.a.d.b J;
    private f.e.a.a.a.d.j.d K;
    private String L;
    private int M;
    private int N;
    private int O;
    private boolean P = false;
    private boolean Q = false;
    private boolean R = false;
    private boolean S = true;
    private boolean T = false;
    private boolean U = false;
    private boolean V = false;
    private g W;
    private boolean a0;
    private PlayerView j;
    private SoundImageView k;
    private TextView l;
    private View m;
    private boolean n = false;
    private String o;
    private int p;
    private int q;
    private int r;
    private f.f.a.s.e.a s;
    private f.f.a.s.e.b t;
    private String u = "";
    private double v;
    private double w;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;

    public MintegralVideoView(Context context) {
        super(context);
        this.W = new com.mintegral.msdk.playercommon.a((MintegralVideoView)this){
            private MintegralVideoView a;
            private int b;
            private int c;
            private boolean d;
            private f.e.a.a.a.d.j.d e;
            private f f;
            private boolean g;
            private boolean h;
            private boolean i;
            private f.f.a.e.e.a j;
            {
                this.f = new /* Unavailable Anonymous Inner Class!! */;
                this.g = false;
                this.h = false;
                this.i = false;
                this.a = mintegralVideoView;
            }

            @Override
            public final void a() {
                super.a();
                this.a.T = true;
                f.e.a.a.a.d.j.d d2 = this.e;
                if (d2 != null) {
                    d2.c();
                    h.a("omsdk", "play:  videoEvents.complete()");
                }
                this.a.l.setText((CharSequence)"0");
                this.a.j.setClickable(false);
                String string2 = this.a.b(true);
                this.a.f.a(121, (Object)"");
                this.a.f.a(11, (Object)string2);
                this.b = this.c;
                g0 = true;
            }

            @Override
            public final void a(int n2) {
                super.a(n2);
                if (!this.d) {
                    this.a.f.a(10, (Object)this.f);
                    this.d = true;
                }
                g0 = false;
            }

            /*
             * Enabled aggressive block sorting
             */
            @Override
            public final void a(int n2, int n3) {
                block6 : {
                    String string2;
                    block8 : {
                        int n4;
                        int n5;
                        block9 : {
                            block7 : {
                                super.a(n2, n3);
                                if (this.a.g) {
                                    int n6 = n3 - n2;
                                    if (n6 <= 0) {
                                        n6 = 0;
                                    }
                                    this.a.l.setText((CharSequence)String.valueOf((int)n6));
                                }
                                this.c = n3;
                                f f2 = this.f;
                                f2.a = n2;
                                f2.b = n3;
                                f2.c = this.a.U;
                                this.b = n2;
                                this.a.f.a(15, (Object)this.f);
                                f.e.a.a.a.d.j.d d2 = this.e;
                                if (d2 == null) break block6;
                                n4 = n2 * 100 / n3;
                                n5 = 100 * (n2 + 1) / n3;
                                if (n4 > 25 || 25 >= n5 || this.g) break block7;
                                this.g = true;
                                d2.d();
                                string2 = "play:  videoEvents.firstQuartile()";
                                break block8;
                            }
                            if (n4 > 50 || 50 >= n5 || this.h) break block9;
                            this.h = true;
                            this.e.e();
                            string2 = "play:  videoEvents.midpoint()";
                            break block8;
                        }
                        if (n4 > 75 || 75 >= n5 || this.i) break block6;
                        this.i = true;
                        this.e.i();
                        string2 = "play:  videoEvents.thirdQuartile()";
                    }
                    h.a("omsdk", string2);
                }
                if (this.a.H && !this.a.P && this.a.M == f.f.a.e.b.b.n) {
                    this.a.v();
                }
            }

            public final void a(f.f.a.e.e.a a2) {
                this.j = a2;
            }

            @Override
            public final void a(String string2) {
                super.a(string2);
            }

            public final void a(boolean bl) {
            }

            @Override
            public final void b() {
                try {
                    super.b();
                    if (this.e != null) {
                        this.e.a();
                        h.a("omsdk", "play:  videoEvents.bufferFinish()");
                    }
                    this.a.f.a(14, (Object)"");
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
            }

            @Override
            public final void b(String string2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("errorStr");
                stringBuilder.append(string2);
                h.d("DefaultVideoFeedsPlayerListener", stringBuilder.toString());
                super.b(string2);
                this.a.f.a(12, (Object)"");
            }

            public final int c() {
                return this.b;
            }

            @Override
            public final void c(String string2) {
                String string3 = "";
                try {
                    super.c(string2);
                    if (this.e != null) {
                        this.e.b();
                    }
                    this.a.f.a(13, (Object)string3);
                    i i2 = f.f.a.e.c.c.c().a(f.f.a.e.c.a.i().e());
                    if (this.j != null) {
                        string3 = this.j.d1();
                    }
                    i2.a(string3, true);
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
            }

            public final void d(String string2) {
            }
        };
        this.a0 = false;
    }

    public MintegralVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = new /* invalid duplicate definition of identical inner class */;
        this.a0 = false;
    }

    private void A() {
        try {
            this.a(0, 0, -1, -1);
            if (!this.m() && this.g) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)this.j.getLayoutParams();
                int n2 = l.e(this.b);
                layoutParams.width = -1;
                layoutParams.height = n2 * 9 / 16;
                layoutParams.gravity = 17;
                return;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    static /* synthetic */ f.e.a.a.a.d.j.d a(MintegralVideoView mintegralVideoView) {
        return mintegralVideoView.K;
    }

    static /* synthetic */ boolean a(MintegralVideoView mintegralVideoView, boolean bl) {
        mintegralVideoView.V = bl;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String b(boolean bl) {
        JSONObject jSONObject;
        if (!this.H) {
            return "";
        }
        try {
            jSONObject = new JSONObject();
            boolean bl2 = this.P;
            if (!bl2) {
                jSONObject.put("Alert_window_status", f.f.a.e.b.b.q);
            }
            if (this.R) {
                jSONObject.put("Alert_window_status", f.f.a.e.b.b.s);
            }
            if (this.Q) {
                jSONObject.put("Alert_window_status", f.f.a.e.b.b.r);
            }
        }
        catch (Exception exception) {
            h.d("MintegralBaseView", "getIVRewardStatusString ERROR");
            return "";
        }
        int n2 = bl ? 1 : 2;
        jSONObject.put("complete_info", n2);
        return jSONObject.toString();
    }

    static /* synthetic */ boolean d(MintegralVideoView mintegralVideoView) {
        return mintegralVideoView.S;
    }

    private String e(int n2, int n3) {
        if (n3 != 0) {
            double d2 = (float)n2 / (float)n3;
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(l.a(d2));
                stringBuilder.append("");
                String string2 = stringBuilder.toString();
                return string2;
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append("");
        return stringBuilder.toString();
    }

    static /* synthetic */ boolean g(MintegralVideoView mintegralVideoView, boolean bl) {
        mintegralVideoView.E = bl;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void v() {
        try {
            boolean bl = this.H;
            if (bl && (this.M == f.f.a.e.b.b.m || this.M == f.f.a.e.b.b.n)) {
                if (this.P) {
                    if (this.M != f.f.a.e.b.b.n) return;
                    {
                        this.f.a(2, (Object)this.b(this.T));
                        return;
                    }
                }
                if (this.M == f.f.a.e.b.b.n && this.V) {
                    this.f.a(2, (Object)this.b(this.T));
                    return;
                }
                if (!this.S) return;
                {
                    int n2 = this.j.getCurPosition() / 1000;
                    int n3 = this.j.getDuration() == 0 ? this.c.Z0() : this.j.getDuration();
                    int n4 = (int)(100.0f * ((float)n2 / (float)n3));
                    if (this.M == f.f.a.e.b.b.m) {
                        this.x();
                        if (this.N == f.f.a.e.b.b.o && n4 >= this.O) {
                            this.f.a(2, (Object)this.b(this.T));
                            return;
                        }
                        if (this.N == f.f.a.e.b.b.p && n2 >= this.O) {
                            this.f.a(2, (Object)this.b(this.T));
                            return;
                        }
                        this.f.a(8, (Object)"");
                    }
                    if (this.M != f.f.a.e.b.b.n) return;
                    {
                        if (this.N == f.f.a.e.b.b.o && n4 >= this.O) {
                            this.x();
                            this.f.a(8, (Object)"");
                            return;
                        }
                        if (this.N != f.f.a.e.b.b.p || n2 < this.O) return;
                        {
                            this.x();
                            this.f.a(8, (Object)"");
                            return;
                        }
                    }
                }
            }
            if (this.p > -1 && this.r == 1 && !this.F) {
                this.x();
                this.f.a(8, (Object)"");
                return;
            }
            this.f.a(2, (Object)"");
            return;
        }
        catch (Exception exception) {
            h.d("MintegralBaseView", exception.getMessage());
            return;
        }
    }

    private boolean w() {
        try {
            this.j = (PlayerView)this.findViewById(this.c("mintegral_vfpv"));
            this.k = (SoundImageView)this.findViewById(this.c("mintegral_sound_switch"));
            this.l = (TextView)this.findViewById(this.c("mintegral_tv_sound"));
            this.m = this.findViewById(this.c("mintegral_rl_playing_close"));
            this.m.setVisibility(4);
            View[] arrview = new View[]{this.j, this.k, this.l, this.m};
            boolean bl = this.a(arrview);
            return bl;
        }
        catch (Throwable throwable) {
            h.b("MintegralBaseView", throwable.getMessage(), throwable);
            return false;
        }
    }

    private void x() {
        try {
            if (this.j != null) {
                this.j.f();
                if (this.K != null) {
                    this.K.f();
                    h.a("omsdk", "play:  videoEvents.pause()");
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            h.b("MintegralBaseView", throwable.getMessage(), throwable);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void y() {
        try {
            boolean bl = this.y;
            if (!bl) {
                try {
                    if (this.K != null) {
                        float f2 = this.j.getDuration();
                        if (f2 == 0.0f && this.c != null) {
                            f2 = this.c.Z0();
                        }
                        f.e.a.a.a.d.j.d d2 = this.K;
                        int n2 = this.getMute();
                        float f3 = 0.0f;
                        if (n2 == 2) {
                            f3 = 1.0f;
                        }
                        d2.a(f2, f3);
                        h.a("omsdk", "play: videoEvents.start()");
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    h.a("MintegralBaseView", illegalArgumentException.getMessage());
                }
                boolean bl2 = this.j.j();
                if (this.c != null && this.c.D0() != 2 && !bl2) {
                    h.d("MediaPlayer", "\u64ad\u653e\u5931\u8d25");
                    if (this.W != null) {
                        this.W.b("play video failed");
                    }
                }
                this.y = true;
                return;
            }
            this.j.g();
            try {
                if (this.K == null) return;
                this.K.g();
                h.a("omsdk", "play:  videoEvents.resume()");
                return;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                h.a("MintegralBaseView", illegalArgumentException.getMessage());
                return;
            }
        }
        catch (Exception exception) {
            h.b("MintegralBaseView", exception.getMessage(), exception);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void z() {
        block2 : {
            block3 : {
                var1_1 = l.e(this.b);
                var2_2 = l.d(this.b);
                var3_3 = this.v;
                if (var3_3 <= 0.0 || (var5_4 = this.w) <= 0.0 || var1_1 <= 0.0f || var2_2 <= 0.0f) break block2;
                var7_5 = var3_3 / var5_4;
                var9_6 = var1_1 / var2_2;
                var11_7 = new StringBuilder();
                var11_7.append("videoWHDivide:");
                var11_7.append(var7_5);
                var11_7.append("  screenWHDivide:");
                var11_7.append(var9_6);
                h.b("MintegralBaseView", var11_7.toString());
                var16_8 = l.a(var7_5);
                var18_9 = l.a(var9_6);
                var20_10 = new StringBuilder();
                var20_10.append("videoWHDivideFinal:");
                var20_10.append(var16_8);
                var20_10.append("  screenWHDivideFinal:");
                var20_10.append(var18_9);
                h.b("MintegralBaseView", var20_10.toString());
                var25_11 = (FrameLayout.LayoutParams)this.j.getLayoutParams();
                if (!(var16_8 > var18_9)) break block3;
                var29_12 = var1_1;
                var31_13 = this.w;
                Double.isNaN((double)var29_12);
                var34_14 = var29_12 * var31_13 / this.v;
                var25_11.width = -1;
                var25_11.height = (int)var34_14;
                ** GOTO lbl36
            }
            if (var16_8 < var18_9) {
                var26_15 = var2_2;
                Double.isNaN((double)var26_15);
                var25_11.width = (int)(var26_15 * var7_5);
                var25_11.height = -1;
lbl36: // 2 sources:
                var25_11.gravity = 17;
            } else {
                var25_11.width = -1;
                var25_11.height = -1;
            }
            this.j.setLayoutParams((ViewGroup.LayoutParams)var25_11);
            this.n();
            return;
        }
        this.A();
    }

    @Override
    public void a(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VideoView videoOperate:");
        stringBuilder.append(n2);
        h.a("MintegralBaseView", stringBuilder.toString());
        if (this.g) {
            if (n2 == 1) {
                if (this.getVisibility() == 0 && this.s()) {
                    h.a("MintegralBaseView", "VideoView videoOperate:play");
                    if (!this.n) {
                        MintegralVideoView.super.y();
                        return;
                    }
                }
            } else if (n2 == 2) {
                if (this.getVisibility() == 0 && this.s()) {
                    h.a("MintegralBaseView", "VideoView videoOperate:pause");
                    MintegralVideoView.super.x();
                    return;
                }
            } else if (n2 == 3 && !this.z) {
                this.j.k();
                this.z = true;
            }
        }
    }

    @Override
    public void a(int n2, int n3) {
        if (n2 == 1) {
            this.V = true;
            if (this.getVisibility() == 0) {
                MintegralVideoView.super.v();
            }
        }
        if (n3 == 1) {
            this.p();
            return;
        }
        if (n3 == 2 && (!this.U || this.getVisibility() != 0) && this.g && this.m.getVisibility() != 0) {
            this.m.setVisibility(0);
            this.B = true;
        }
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        block11 : {
            block12 : {
                float f2;
                float f3;
                double d2;
                double d3;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("showVideoLocation marginTop:");
                stringBuilder.append(n2);
                stringBuilder.append(" marginLeft:");
                stringBuilder.append(n3);
                stringBuilder.append(" width:");
                stringBuilder.append(n4);
                stringBuilder.append("  height:");
                stringBuilder.append(n5);
                stringBuilder.append(" radius:");
                stringBuilder.append(n6);
                stringBuilder.append(" borderTop:");
                stringBuilder.append(n7);
                stringBuilder.append(" borderLeft:");
                stringBuilder.append(n8);
                stringBuilder.append(" borderWidth:");
                stringBuilder.append(n9);
                stringBuilder.append(" borderHeight:");
                stringBuilder.append(n10);
                h.b("MintegralBaseView", stringBuilder.toString());
                if (!this.g) break block11;
                this.setVisibility(0);
                int n11 = l.e(this.b);
                int n12 = l.d(this.b);
                boolean bl = n4 > 0 && n5 > 0 && n11 >= n4 && n12 >= n5;
                if (!bl || this.x) break block12;
                c0 = n7;
                d0 = n8;
                e0 = n9 + 4;
                f0 = n10 + 4;
                f3 = (float)n4 / (float)n5;
                f2 = 0.0f;
                try {
                    d3 = this.v;
                    d2 = this.w;
                }
                catch (Throwable throwable) {
                    h.b("MintegralBaseView", throwable.getMessage(), throwable);
                }
                f2 = (float)(d3 / d2);
                if (n6 > 0) {
                    b0 = n6;
                    if (n6 > 0) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius((float)l.b(this.getContext(), n6));
                        gradientDrawable.setColor(-1);
                        gradientDrawable.setStroke(1, 0);
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.setBackground((Drawable)gradientDrawable);
                            this.j.setBackground((Drawable)gradientDrawable);
                        } else {
                            this.setBackgroundDrawable((Drawable)gradientDrawable);
                            this.j.setBackgroundDrawable((Drawable)gradientDrawable);
                        }
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.setClipToOutline(true);
                            this.j.setClipToOutline(true);
                        }
                    }
                }
                if (!(Math.abs((float)(f3 - f2)) <= 0.1f) && this.G != 1) {
                    MintegralVideoView.super.z();
                    this.a(1);
                    return;
                }
                h.b("MintegralBaseView", "showVideoLocation USE H5 SIZE.");
                MintegralVideoView.super.z();
                if (this.F) {
                    com.mintegral.msdk.video.module.j.b b2;
                    int n13;
                    this.c(n4, n5);
                    if (g0) {
                        b2 = this.f;
                        n13 = 114;
                    } else {
                        b2 = this.f;
                        n13 = 116;
                    }
                    b2.a(n13, (Object)"");
                    return;
                }
                this.a(n3, n2, n4, n5);
                return;
            }
            MintegralVideoView.super.z();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void a(int var1, int var2_3, String var3_2) {
        block11 : {
            block12 : {
                if (!this.g) break block11;
                this.I = var1;
                if (var1 == 1) {
                    this.k.setSoundStatus(false);
                    this.j.b();
                    if (this.K != null) {
                        this.K.a(0.0f);
                    }
                    ** GOTO lbl20
                } else if (var1 == 2) {
                    this.k.setSoundStatus(true);
                    this.j.h();
                    if (this.K != null) {
                        this.K.a(1.0f);
                    }
                }
                break block12;
                catch (IllegalArgumentException var4_4) {
                    h.a("OMSDK", var4_4.getMessage());
                }
            }
            if (var2_3 == 1) {
                this.k.setVisibility(8);
            } else if (var2_3 == 2) {
                this.k.setVisibility(0);
            }
        }
        if (var3_2 == null) return;
        if (var3_2.equals((Object)"2") == false) return;
        this.f.a(7, (Object)var1);
    }

    public void a(Context context) {
        int n2 = this.d("mintegral_reward_videoview_item");
        if (n2 > 0) {
            this.d.inflate(n2, (ViewGroup)this);
            this.g = MintegralVideoView.super.w();
            if (!this.g) {
                h.d("MintegralBaseView", "MintegralVideoView init fail");
            }
            this.i();
        }
        g0 = false;
    }

    public void a(f.f.a.r.b.k.c c2) {
        if (this.g && !TextUtils.isEmpty((CharSequence)this.o) && this.c != null) {
            f.f.a.e.e.a a2;
            f.e.a.a.a.d.b b2 = this.J;
            if (b2 != null) {
                b2.b((View)this.j);
                this.J.a((View)this.k);
                this.J.a((View)this.l);
                this.J.a(this.m);
                h.a("OMSDK", "RV registerView");
            }
            if ((a2 = this.c) != null && r.b(a2.b1())) {
                String string2 = this.c.b1();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("MintegralBaseView videoResolution:");
                stringBuilder.append(string2);
                h.b("MintegralBaseView", stringBuilder.toString());
                String[] arrstring = string2.split("x");
                if (arrstring.length == 2) {
                    if (l.b(arrstring[0]) > 0.0) {
                        this.v = l.b(arrstring[0]);
                    }
                    if (l.b(arrstring[1]) > 0.0) {
                        this.w = l.b(arrstring[1]);
                    }
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("MintegralBaseView mVideoW:");
                    stringBuilder2.append(this.v);
                    stringBuilder2.append("  mVideoH:");
                    stringBuilder2.append(this.w);
                    h.b("MintegralBaseView", stringBuilder2.toString());
                }
                if (this.v <= 0.0) {
                    this.v = 1280.0;
                }
                if (this.w <= 0.0) {
                    this.w = 720.0;
                }
            }
            this.j.a(this.q);
            this.j.a(this.o, this.c.d1(), (com.mintegral.msdk.playercommon.e)this.W);
            this.a(this.I, -1, null);
        }
        g0 = false;
    }

    @Override
    public void b() {
        f.f.a.s.e.a a2 = this.s;
        if (a2 != null) {
            a2.dismiss();
        }
        this.f.a(125, (Object)"");
    }

    @Override
    public void b(int n2, int n3) {
        this.a(n2, n3, "2");
    }

    public void c(int n2, int n3, int n4) {
        this.M = n2;
        this.N = n3;
        this.O = n4;
    }

    @Override
    public boolean c() {
        return this.getLayoutParams().height < l.d(this.b.getApplicationContext());
    }

    public void d(int n2, int n3) {
        if (this.g) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("progressOperate progress:");
            stringBuilder.append(n2);
            h.b("MintegralBaseView", stringBuilder.toString());
            f.f.a.e.e.a a2 = this.c;
            int n4 = a2 != null ? a2.Z0() : 0;
            if (n2 > 0 && n2 <= n4 && this.j != null) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("progressOperate progress:");
                stringBuilder2.append(n2);
                h.b("MintegralBaseView", stringBuilder2.toString());
                this.j.c(n2 * 1000);
            }
            if (n3 == 1) {
                this.l.setVisibility(8);
                return;
            }
            if (n3 == 2) {
                this.l.setVisibility(0);
            }
        }
    }

    @Override
    public void e() {
        if (this.A) {
            return;
        }
        if (this.t == null) {
            this.t = new f.f.a.s.e.b(){

                @Override
                public final void a() {
                    MintegralVideoView.this.n = false;
                    MintegralVideoView mintegralVideoView = MintegralVideoView.this;
                    mintegralVideoView.setShowingAlertViewCover(mintegralVideoView.n);
                    if (MintegralVideoView.this.H && (MintegralVideoView.this.M == f.f.a.e.b.b.n || MintegralVideoView.this.M == f.f.a.e.b.b.m)) {
                        MintegralVideoView.this.Q = true;
                        MintegralVideoView.this.f.a(124, (Object)"");
                        MintegralVideoView.this.U = true;
                        MintegralVideoView.this.p();
                    }
                    MintegralVideoView.this.y();
                    MintegralVideoView mintegralVideoView2 = MintegralVideoView.this;
                    com.mintegral.msdk.base.common.report.e.a((Context)mintegralVideoView2.b, (f.f.a.e.e.a)mintegralVideoView2.c, (String)mintegralVideoView2.L, (String)MintegralVideoView.this.u, (int)1, (int)0);
                }

                @Override
                public final void b() {
                    MintegralVideoView.this.n = false;
                    MintegralVideoView.this.R = true;
                    MintegralVideoView mintegralVideoView = MintegralVideoView.this;
                    mintegralVideoView.setShowingAlertViewCover(mintegralVideoView.n);
                    MintegralVideoView mintegralVideoView2 = MintegralVideoView.this;
                    com.mintegral.msdk.base.common.report.e.a((Context)mintegralVideoView2.b, (f.f.a.e.e.a)mintegralVideoView2.c, (String)mintegralVideoView2.L, (String)MintegralVideoView.this.u, (int)1, (int)1);
                    if (MintegralVideoView.this.H && MintegralVideoView.this.M == f.f.a.e.b.b.m) {
                        MintegralVideoView mintegralVideoView3 = MintegralVideoView.this;
                        mintegralVideoView3.f.a(2, (Object)mintegralVideoView3.b(mintegralVideoView3.T));
                        return;
                    }
                    if (MintegralVideoView.this.H && MintegralVideoView.this.M == f.f.a.e.b.b.n) {
                        MintegralVideoView.this.y();
                        return;
                    }
                    MintegralVideoView.this.f.a(2, (Object)"");
                }
            };
        }
        if (this.s == null) {
            this.s = new f.f.a.s.e.a(this.getContext(), this.t);
            f.e.a.a.a.d.b b2 = this.J;
            if (b2 != null) {
                b2.a(this.s.getWindow().getDecorView());
            }
        }
        if (this.H) {
            this.s.a(this.M, this.u);
        } else {
            this.s.a(this.u);
        }
        PlayerView playerView = this.j;
        if (playerView != null && !playerView.c()) {
            this.s.show();
            this.P = true;
            this.n = true;
            this.setShowingAlertViewCover(this.n);
            f.f.a.s.d.b.c().a(f.f.a.e.c.a.i().f(), this.u, false);
            this.L = f.f.a.s.d.c.E;
            com.mintegral.msdk.base.common.report.e.a((Context)this.b, (f.f.a.e.e.a)this.c, (String)this.L, (String)this.u, (int)1);
        }
    }

    @Override
    public void g() {
        this.n = true;
        this.setShowingAlertViewCover(this.n);
    }

    @Override
    public int getBorderViewHeight() {
        return f0;
    }

    @Override
    public int getBorderViewLeft() {
        return d0;
    }

    @Override
    public int getBorderViewRadius() {
        return b0;
    }

    @Override
    public int getBorderViewTop() {
        return c0;
    }

    @Override
    public int getBorderViewWidth() {
        return e0;
    }

    public int getCloseAlert() {
        return this.r;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String getCurrentProgress() {
        try {
            int n2 = this.W.c();
            f.f.a.e.e.a a2 = this.c;
            int n3 = 0;
            if (a2 != null) {
                n3 = this.c.Z0();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", (Object)this.e(n2, n3));
            jSONObject.put("time", n2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n3);
            stringBuilder.append("");
            jSONObject.put("duration", (Object)stringBuilder.toString());
            return jSONObject.toString();
        }
        catch (Throwable throwable) {
            h.b("MintegralBaseView", throwable.getMessage(), throwable);
            return "{}";
        }
    }

    public int getMute() {
        return this.I;
    }

    public String getUnitId() {
        return this.u;
    }

    public int getVideoSkipTime() {
        return this.p;
    }

    protected final void i() {
        super.i();
        if (this.g) {
            this.j.setOnClickListener((View.OnClickListener)new a(this));
            this.k.setOnClickListener((View.OnClickListener)new b(this));
            this.m.setOnClickListener((View.OnClickListener)new c(this));
        }
    }

    public void k() {
        super.k();
        this.x = true;
        this.a(0, 0, l.e(this.b), l.d(this.b), 0, 0, 0, 0, 0);
        this.a(1);
        if (this.p == 0) {
            this.a(-1, 2);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.g && this.x) {
            MintegralVideoView.super.z();
        }
    }

    public void p() {
        if (this.g && this.m.getVisibility() != 8) {
            this.m.setVisibility(8);
            this.B = false;
        }
        if (!this.a0 && !this.E) {
            if (this.C) {
                return;
            }
            this.a0 = true;
            int n2 = this.p;
            if (n2 < 0) {
                return;
            }
            if (n2 == 0) {
                this.E = true;
                return;
            }
            new Handler().postDelayed((Runnable)new e(this), (long)(1000 * this.p));
        }
    }

    public boolean q() {
        return this.A;
    }

    public boolean r() {
        return this.n;
    }

    public boolean s() {
        ViewGroup viewGroup = (ViewGroup)this.getParent();
        boolean bl = false;
        if (viewGroup != null) {
            int n2 = viewGroup.indexOfChild((View)this);
            int n3 = viewGroup.getChildCount();
            boolean bl2 = false;
            for (int i2 = n2 + 1; i2 <= n3 - 1; ++i2) {
                if (viewGroup.getChildAt(i2).getVisibility() == 0 && this.A) {
                    return false;
                }
                bl2 = true;
            }
            bl = bl2;
        }
        return bl;
    }

    public void setAdSession(f.e.a.a.a.d.b b2) {
        this.J = b2;
    }

    public void setBufferTimeout(int n2) {
        this.q = n2;
    }

    public void setCampaign(f.f.a.e.e.a a2) {
        super.setCampaign(a2);
        g g2 = this.W;
        if (g2 != null) {
            g2.a(a2);
        }
    }

    public void setCloseAlert(int n2) {
        this.r = n2;
    }

    @Override
    public void setCover(boolean bl) {
        if (this.g) {
            this.A = bl;
            this.j.setIsCovered(bl);
        }
    }

    public void setDialogRole(int n2) {
        int n3 = 1;
        if (n2 != n3) {
            n3 = 0;
        }
        this.S = n3;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n2);
        stringBuilder.append(" ");
        stringBuilder.append(this.S);
        h.d("MintegralBaseView", stringBuilder.toString());
    }

    public void setIsIV(boolean bl) {
        this.H = bl;
        g g2 = this.W;
        if (g2 != null) {
            g2.a(bl);
        }
    }

    public void setPlayURL(String string2) {
        this.o = string2;
    }

    public void setScaleFitXY(int n2) {
        this.G = n2;
    }

    public void setShowingAlertViewCover(boolean bl) {
        this.j.setIsCovered(bl);
    }

    public void setShowingTransparent(boolean bl) {
        this.F = bl;
    }

    public void setSoundState(int n2) {
        this.I = n2;
    }

    public void setUnitId(String string2) {
        this.u = string2;
        g g2 = this.W;
        if (g2 != null) {
            g2.d(string2);
        }
    }

    public void setVideoEvents(f.e.a.a.a.d.j.d d2) {
        this.K = d2;
        g g2 = this.W;
        if (g2 != null) {
            g2.e = d2;
        }
    }

    public void setVideoSkipTime(int n2) {
        this.p = n2;
    }

    @Override
    public void setVisible(int n2) {
        this.setVisibility(n2);
    }

    public void t() {
        this.f.a(2, (Object)"");
    }

    public void u() {
        if (!this.A) {
            if (this.n) {
                return;
            }
            if (this.Q) {
                return;
            }
            if (this.B) {
                this.v();
                return;
            }
            if (this.C && this.D) {
                this.v();
                return;
            }
            if (!this.C && this.E) {
                this.v();
            }
        }
    }

}

