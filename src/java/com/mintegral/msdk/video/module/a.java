/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.webkit.DownloadListener
 *  android.webkit.WebView
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  com.mintegral.msdk.base.common.report.e
 *  com.mintegral.msdk.video.module.b
 *  com.mintegral.msdk.video.module.e
 *  com.mintegral.msdk.video.module.j.b
 *  f.f.a.e.c.a
 *  f.f.a.e.f.h
 *  f.f.a.e.g.a
 *  f.f.a.e.g.a$e
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mintegral.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mintegral.msdk.video.module.b;
import com.mintegral.msdk.video.module.e;
import f.f.a.e.f.h;
import f.f.a.e.g.a;
import f.f.a.k.g.f;
import f.f.a.k.g.i;
import f.f.a.r.b.k.c;
import f.f.a.s.f.g;

public class a
extends e {
    private String H;

    public a(Context context) {
        super(context);
    }

    public void a(c c2) {
        String string = this.p();
        if (this.g && this.c != null && !TextUtils.isEmpty((CharSequence)string)) {
            a.e e2 = new a.e(this.c);
            e2.a(this.c.c());
            this.m.setDownloadListener((DownloadListener)e2);
            this.m.setCampaignId(this.c.e());
            this.setCloseVisible(8);
            this.m.setApiManagerJSFactory(c2);
            this.m.setWebViewListener(new f.f.a.k.e.b(){

                @Override
                public final void a(WebView webView, int n2, String string, String string2) {
                    super.a(webView, n2, string, string2);
                    h.d((String)"MintegralAlertWebview", (String)"===========onReceivedError");
                    if (!a.this.q) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("onReceivedError,url:");
                        stringBuilder.append(string2);
                        h.a((String)"MintegralBaseView", (String)stringBuilder.toString());
                        a a2 = a.this;
                        com.mintegral.msdk.base.common.report.e.a((Context)((b)a2).b, (f.f.a.e.e.a)((b)a2).c, (String)a2.H, (String)a.this.v, (int)2, (String)string);
                        a.this.q = true;
                    }
                }

                @Override
                public final void a(WebView webView, String string) {
                    super.a(webView, string);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("===========finish+");
                    stringBuilder.append(string);
                    h.d((String)"MintegralAlertWebview", (String)stringBuilder.toString());
                    i.a().a(webView, "onJSBridgeConnected", "");
                }
            });
            this.setHtmlSource(f.f.a.s.f.i.a().a(string));
            this.p = false;
            if (TextUtils.isEmpty((CharSequence)this.o)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("load url:");
                stringBuilder.append(string);
                h.a((String)"MintegralBaseView", (String)stringBuilder.toString());
                this.m.loadUrl(string);
            } else {
                h.a((String)"MintegralBaseView", (String)"load html...");
                this.m.loadDataWithBaseURL(string, this.o, "text/html", "UTF-8", null);
            }
            this.m.setBackgroundColor(0);
            this.setBackgroundColor(0);
            return;
        }
        this.f.a(101, (Object)"");
    }

    protected final String p() {
        if (!TextUtils.isEmpty((CharSequence)this.v)) {
            f.f.a.s.d.b.c().a(f.f.a.e.c.a.i().f(), this.v, false);
            this.H = f.f.a.s.d.c.E;
            if (!TextUtils.isEmpty((CharSequence)this.H)) {
                return g.a().a(this.H);
            }
        }
        return "";
    }

    protected final RelativeLayout.LayoutParams q() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    public void y() {
        RelativeLayout relativeLayout = this.k;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.y();
        com.mintegral.msdk.base.common.report.e.a((Context)((b)this).b, (f.f.a.e.e.a)((b)this).c, (String)this.H, (String)this.v, (int)2);
    }

}

