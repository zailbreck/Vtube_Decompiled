/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebView
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  com.mintegral.msdk.video.bt.module.a
 *  com.mintegral.msdk.video.bt.module.e$b
 *  com.mintegral.msdk.video.bt.module.e$c
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 */
package com.mintegral.msdk.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mintegral.msdk.video.bt.module.e;
import f.f.a.e.f.h;
import f.f.a.k.g.f;
import f.f.a.r.b.a.j;
import java.util.List;

public class e
extends com.mintegral.msdk.video.bt.module.a
implements f.f.a.k.f.c {
    private String l;
    private String m;
    private String n;
    private boolean o;
    private ImageView p;
    private f.f.a.s.d.c q;
    private List<f.f.a.e.e.a> r;
    private f.f.a.k.g.b s;
    private j t;
    private WebView u;

    static /* synthetic */ WebView a(e e2) {
        return e2.u;
    }

    static /* synthetic */ f.f.a.k.g.b b(e e2) {
        return e2.s;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Context context) {
        ImageView imageView;
        int n2;
        this.s = new f.f.a.k.g.b(context);
        this.s.setBackgroundColor(0);
        this.s.setVisibility(0);
        this.t = new j(null, this.c, this.r);
        this.t.b(this.d);
        this.s.setObject(this.t);
        this.s.setMraidObject(this);
        this.s.setWebViewListener(new f.f.a.k.e.a((e)this){
            final /* synthetic */ e a;
            {
                this.a = e2;
            }

            public final void a(WebView webView, int n2, String string2, String string3) {
                super.a(webView, n2, string2, string3);
                if (e.a(this.a) != null) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("id", (Object)this.a.e);
                        jSONObject.put("code", com.mintegral.msdk.video.bt.module.a.k);
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("id", (Object)this.a.e);
                        jSONObject2.put("result", 2);
                        jSONObject2.put("error", (Object)string2);
                        jSONObject.put("data", (Object)jSONObject2);
                        f.f.a.k.g.i.a().a(e.a(this.a), "onWebviewLoad", android.util.Base64.encodeToString((byte[])jSONObject.toString().getBytes(), (int)2));
                        return;
                    }
                    catch (java.lang.Exception exception) {
                        f.f.a.r.a.a.b.b().a(e.a(this.a), exception.getMessage());
                        h.a("RVWindVaneWebView", exception.getMessage());
                    }
                }
            }

            public final void a(WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
                super.a(webView, sslErrorHandler, sslError);
                if (e.a(this.a) != null) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("id", (Object)this.a.e);
                        jSONObject.put("code", com.mintegral.msdk.video.bt.module.a.k);
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("id", (Object)this.a.e);
                        jSONObject2.put("result", 2);
                        jSONObject2.put("error", (Object)sslError.toString());
                        jSONObject.put("data", (Object)jSONObject2);
                        f.f.a.k.g.i.a().a(e.a(this.a), "onWebviewLoad", android.util.Base64.encodeToString((byte[])jSONObject.toString().getBytes(), (int)2));
                        return;
                    }
                    catch (java.lang.Exception exception) {
                        f.f.a.r.a.a.b.b().a(e.a(this.a), exception.getMessage());
                        h.a("RVWindVaneWebView", exception.getMessage());
                    }
                }
            }

            public final void a(WebView webView, String string2) {
                super.a(webView, string2);
                if (e.a(this.a) != null) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("id", (Object)this.a.e);
                        jSONObject.put("code", com.mintegral.msdk.video.bt.module.a.k);
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("id", (Object)this.a.e);
                        jSONObject2.put("result", 1);
                        jSONObject.put("data", (Object)jSONObject2);
                        f.f.a.k.g.i.a().a(e.a(this.a), "onWebviewLoad", android.util.Base64.encodeToString((byte[])jSONObject.toString().getBytes(), (int)2));
                    }
                    catch (java.lang.Exception exception) {
                        f.f.a.r.a.a.b.b().a(e.a(this.a), exception.getMessage());
                        h.a("RVWindVaneWebView", exception.getMessage());
                    }
                }
                f.f.a.k.g.i.a().a(e.b(this.a));
            }
        });
        this.addView((View)this.s, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        this.setOnClickListener((View.OnClickListener)new b((e)this));
        try {
            this.p = new ImageView(this.getContext());
            this.p.setImageResource(this.a("mintegral_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.p.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            imageView = this.p;
            n2 = this.o ? 4 : 8;
        }
        catch (Throwable throwable) {
            h.a("BTBaseView", throwable.getMessage());
            return;
        }
        imageView.setVisibility(n2);
        if (this.c != null && this.c.m1()) {
            this.p.setVisibility(4);
        }
        this.p.setOnClickListener((View.OnClickListener)new c((e)this));
        this.addView((View)this.p);
    }

    public void b() {
        WebView webView = this.u;
        if (webView != null) {
            com.mintegral.msdk.video.bt.module.a.a((WebView)webView, (String)"onPlayerCloseBtnClicked", (String)this.e);
        }
    }

    public void c() {
        if (this.s != null) {
            f.f.a.r.a.a.b.b().a(this.s, "onSystemBackPressed", this.e);
        }
    }

    public List<f.f.a.e.e.a> getCampaigns() {
        return this.r;
    }

    public String getFilePath() {
        return this.m;
    }

    public String getFileURL() {
        return this.l;
    }

    public String getHtml() {
        return this.n;
    }

    public f.f.a.e.e.a getMraidCampaign() {
        return this.c;
    }

    public f.f.a.s.d.c getRewardUnitSetting() {
        return this.q;
    }

    public f.f.a.k.g.b getWebView() {
        return this.s;
    }

    public void setCampaigns(List<f.f.a.e.e.a> list) {
        this.r = list;
    }

    public void setCreateWebView(WebView webView) {
        this.u = webView;
    }

    public void setFilePath(String string2) {
        this.m = string2;
    }

    public void setFileURL(String string2) {
        this.l = string2;
    }

    public void setHtml(String string2) {
        this.n = string2;
    }

    public void setRewardUnitSetting(f.f.a.s.d.c c2) {
        this.q = c2;
    }

    public void setWebViewRid(String string2) {
        f.f.a.k.g.b b2 = this.s;
        if (b2 != null) {
            b2.setRid(string2);
        }
    }
}

