/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.widget.FrameLayout
 *  android.widget.TextView
 *  com.mintegral.msdk.playercommon.PlayerView
 *  com.mintegral.msdk.video.bt.module.a
 *  com.mintegral.msdk.video.bt.module.d$a
 *  com.mintegral.msdk.video.bt.module.d$b
 *  com.mintegral.msdk.video.bt.module.d$c
 *  com.mintegral.msdk.video.widget.SoundImageView
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.mintegral.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.mintegral.msdk.playercommon.PlayerView;
import com.mintegral.msdk.video.bt.module.d;
import com.mintegral.msdk.video.widget.SoundImageView;
import f.f.a.e.f.h;

public class d
extends com.mintegral.msdk.video.bt.module.a {
    private PlayerView l;
    private SoundImageView m;
    private TextView n;
    private View o;
    private WebView p;
    private int q;
    private int r;
    private int s;
    private f.e.a.a.a.d.b t;
    private f.e.a.a.a.d.j.d u;
    private int v;
    private boolean w;
    private boolean x;

    static /* synthetic */ PlayerView a(d d2) {
        return d2.l;
    }

    static /* synthetic */ WebView b(d d2) {
        return d2.p;
    }

    static /* synthetic */ int c(d d2) {
        return d2.v;
    }

    static /* synthetic */ f.e.a.a.a.d.j.d d(d d2) {
        return d2.u;
    }

    private boolean d() {
        try {
            this.l = (PlayerView)this.findViewById(this.b("mintegral_vfpv"));
            this.m = (SoundImageView)this.findViewById(this.b("mintegral_sound_switch"));
            this.n = (TextView)this.findViewById(this.b("mintegral_tv_sound"));
            this.o = this.findViewById(this.b("mintegral_rl_playing_close"));
            this.l.setIsBTVideo(true);
            View[] arrview = new View[]{this.l, this.m, this.n, this.o};
            boolean bl = this.a(arrview);
            return bl;
        }
        catch (Throwable throwable) {
            h.b("BTBaseView", throwable.getMessage(), throwable);
            return false;
        }
    }

    protected final void a() {
        super.a();
        if (this.g) {
            this.m.setOnClickListener((View.OnClickListener)new a(this));
            this.o.setOnClickListener((View.OnClickListener)new b(this));
            this.setOnClickListener((View.OnClickListener)new c(this));
        }
    }

    public void a(Context context) {
        int n2 = this.c("mintegral_reward_videoview_item");
        if (n2 > 0) {
            this.f.inflate(n2, (ViewGroup)this);
            this.g = d.super.d();
            if (!this.g) {
                h.d("BTBaseView", "MintegralVideoView init fail");
            }
            this.a();
        }
    }

    public void b() {
        PlayerView playerView = this.l;
        if (playerView != null) {
            this.w = playerView.d();
            this.l.setIsBTVideoPlaying(this.w);
            this.l.f();
        }
    }

    public void c() {
        PlayerView playerView = this.l;
        if (playerView != null) {
            playerView.setDesk(true);
            if (this.w) {
                this.l.n();
            }
        }
    }

    public int getMute() {
        return this.v;
    }

    protected void onAttachedToWindow() {
        View view;
        SoundImageView soundImageView;
        TextView textView;
        FrameLayout.super.onAttachedToWindow();
        if (!this.x) {
            f.f.a.r.a.a.b.b().a(this.d);
        }
        View view2 = this.o;
        int n2 = 8;
        if (view2 != null) {
            int n3 = this.r == 0 ? 8 : 0;
            view2.setVisibility(n3);
        }
        if ((soundImageView = this.m) != null) {
            int n4 = this.s == 0 ? 8 : 0;
            soundImageView.setVisibility(n4);
        }
        if ((textView = this.n) != null) {
            if (this.q != 0) {
                n2 = 0;
            }
            textView.setVisibility(n2);
        }
        if (this.t != null && (view = this.getRootView()) != null) {
            this.t.c(view);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void setCloseViewVisable(int n2) {
        View view = this.o;
        int n3 = n2 == 0 ? 4 : 0;
        view.setVisibility(n3);
    }

    public void setCountDownTextViewVisable(int n2) {
        TextView textView = this.n;
        int n3 = n2 == 0 ? 4 : 0;
        textView.setVisibility(n3);
    }

    public void setCreateWebView(WebView webView) {
        this.p = webView;
    }

    public void setOrientation(int n2) {
    }

    public void setPlaybackParams(float f2) {
        PlayerView playerView = this.l;
        if (playerView != null) {
            playerView.setPlaybackParams(f2);
        }
    }

    public void setShowClose(int n2) {
        this.r = n2;
    }

    public void setShowMute(int n2) {
        this.s = n2;
    }

    public void setShowTime(int n2) {
        this.q = n2;
    }

    public void setSoundImageViewVisble(int n2) {
        SoundImageView soundImageView = this.m;
        int n3 = n2 == 0 ? 4 : 0;
        soundImageView.setVisibility(n3);
    }
}

