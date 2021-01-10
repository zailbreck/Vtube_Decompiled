/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.webkit.WebView
 *  com.mintegral.msdk.video.module.MintegralContainerView
 *  com.mintegral.msdk.video.module.MintegralVideoView
 *  java.lang.String
 */
package f.f.a.r.b.k;

import android.app.Activity;
import android.webkit.WebView;
import com.mintegral.msdk.video.bt.module.MintegralBTContainer;
import com.mintegral.msdk.video.module.MintegralContainerView;
import com.mintegral.msdk.video.module.MintegralVideoView;
import f.f.a.e.e.a;
import f.f.a.r.b.a.h;
import f.f.a.r.b.a.k;
import f.f.a.r.b.a.l;
import f.f.a.r.b.d;
import f.f.a.r.b.f;
import f.f.a.r.b.i;
import f.f.a.r.b.j;
import f.f.a.r.b.k.b;
import f.f.a.r.b.m;
import f.f.a.r.b.n;

public final class c
extends b {
    private Activity i;
    private WebView j;
    private MintegralVideoView k;
    private MintegralContainerView l;
    private a m;
    private MintegralBTContainer n;
    private f.a o;
    private String p;

    public c(Activity activity) {
        this.i = activity;
    }

    public c(Activity activity, WebView webView, MintegralVideoView mintegralVideoView, MintegralContainerView mintegralContainerView, a a2, f.a a3) {
        this.i = activity;
        this.j = webView;
        this.k = mintegralVideoView;
        this.l = mintegralContainerView;
        this.m = a2;
        this.o = a3;
        this.p = mintegralVideoView.getUnitId();
    }

    public c(Activity activity, MintegralBTContainer mintegralBTContainer, WebView webView) {
        this.i = activity;
        this.n = mintegralBTContainer;
        this.j = webView;
    }

    public final void a(f.f.a.r.b.a.j j2) {
        this.c = j2;
    }

    @Override
    public final f.f.a.r.b.b getActivityProxy() {
        WebView webView = this.j;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.b == null) {
            this.b = new h(webView);
        }
        return this.b;
    }

    @Override
    public final m getIJSRewardVideoV1() {
        Activity activity;
        MintegralContainerView mintegralContainerView = this.l;
        if (mintegralContainerView != null && (activity = this.i) != null) {
            if (this.g == null) {
                this.g = new f.f.a.r.b.a.m(activity, mintegralContainerView);
            }
            return this.g;
        }
        return super.getIJSRewardVideoV1();
    }

    @Override
    public final d getJSBTModule() {
        MintegralBTContainer mintegralBTContainer;
        Activity activity = this.i;
        if (activity != null && (mintegralBTContainer = this.n) != null) {
            if (this.h == null) {
                this.h = new f.f.a.r.b.a.i(activity, mintegralBTContainer);
            }
            return this.h;
        }
        return super.getJSBTModule();
    }

    @Override
    public final f getJSCommon() {
        a a2;
        Activity activity = this.i;
        if (activity != null && (a2 = this.m) != null) {
            if (this.c == null) {
                this.c = new f.f.a.r.b.a.j(activity, a2);
            }
            this.c.a(this.i);
            this.c.b(this.p);
            this.c.a(this.o);
            return this.c;
        }
        return super.getJSCommon();
    }

    @Override
    public final i getJSContainerModule() {
        MintegralContainerView mintegralContainerView = this.l;
        if (mintegralContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f == null) {
            this.f = new k(mintegralContainerView);
        }
        return this.f;
    }

    @Override
    public final j getJSNotifyProxy() {
        WebView webView = this.j;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.e == null) {
            this.e = new l(webView);
        }
        return this.e;
    }

    @Override
    public final n getJSVideoModule() {
        MintegralVideoView mintegralVideoView = this.k;
        if (mintegralVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.d == null) {
            this.d = new f.f.a.r.b.a.n(mintegralVideoView);
        }
        return this.d;
    }
}

