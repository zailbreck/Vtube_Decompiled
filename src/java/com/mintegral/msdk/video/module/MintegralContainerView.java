/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  com.mintegral.msdk.base.common.report.c
 *  com.mintegral.msdk.video.module.MintegralContainerView$a
 *  com.mintegral.msdk.video.module.b
 *  com.mintegral.msdk.video.module.j.b
 *  com.mintegral.msdk.video.module.k.a
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.mintegral.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.mintegral.msdk.video.module.MintegralContainerView;
import com.mintegral.msdk.video.module.c;
import com.mintegral.msdk.video.module.d;
import com.mintegral.msdk.video.module.e;
import com.mintegral.msdk.video.module.f;
import com.mintegral.msdk.video.module.h;
import com.mintegral.msdk.video.module.i;
import com.mintegral.msdk.video.module.j.a.g;
import com.mintegral.msdk.video.module.j.a.l;
import f.f.a.e.e.n;

public class MintegralContainerView
extends com.mintegral.msdk.video.module.b
implements f.f.a.r.b.i,
f.f.a.r.b.l {
    private boolean A = false;
    private int B;
    private boolean C = false;
    private f.f.a.r.b.k.c D;
    private boolean E = false;
    private boolean F = false;
    private h j;
    private c k;
    private d l;
    private com.mintegral.msdk.video.module.g m;
    private e n;
    private i o;
    private f p;
    private com.mintegral.msdk.video.module.a q;
    private String r;
    private int s;
    private int t = 1;
    private int u = 1;
    private int v = 1;
    private boolean w = false;
    private boolean x = false;
    private boolean y = false;
    private boolean z = true;

    public MintegralContainerView(Context context) {
        super(context);
    }

    public MintegralContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void A() {
        e e2;
        if (this.n == null) {
            this.a(this.D, 2);
        }
        if ((e2 = this.n) != null && e2.u()) {
            this.C = true;
            this.addView((View)this.n);
            this.y();
            this.onConfigurationChanged(this.getResources().getConfiguration());
            this.n.s();
            n n2 = new n();
            n2.i(this.c.M0());
            n2.k(this.c.e());
            int n3 = this.c.m1() ? n.D : n.E;
            n2.a(n3);
            com.mintegral.msdk.base.common.report.c.b((n)n2, (Context)this.b, (String)this.r);
        } else {
            this.B();
            e e3 = this.n;
            if (e3 != null) {
                e3.e("timeout");
                this.n.setError(true);
            }
        }
        e e4 = this.n;
        if (e4 != null) {
            e4.setUnitId(this.r);
        }
    }

    private void B() {
        this.t = 1;
        if (this.m == null) {
            this.a(this.D, 2);
        }
        this.addView((View)this.m);
        this.onConfigurationChanged(this.getResources().getConfiguration());
        this.m.p();
        this.F = true;
        this.bringToFront();
    }

    private void C() {
        if (this.l == null) {
            this.e(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.y && this.z) {
            this.z = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        this.addView((View)this.l, (ViewGroup.LayoutParams)layoutParams);
    }

    private void D() {
        if (this.q == null) {
            this.q = new com.mintegral.msdk.video.module.a(this.b);
            this.q.setUnitId(this.r);
            this.q.setCampaign(this.c);
        }
        this.q.a(this.D);
    }

    private void E() {
        this.x = false;
        this.F = false;
        ViewGroup viewGroup = (ViewGroup)this.getParent();
        if (viewGroup != null) {
            int n2 = 0;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); ++i2) {
                View view = viewGroup.getChildAt(n2);
                if (!(view instanceof MintegralContainerView)) {
                    viewGroup.bringChildToFront(view);
                    continue;
                }
                ++n2;
            }
        }
    }

    static /* synthetic */ String a(MintegralContainerView mintegralContainerView) {
        return mintegralContainerView.r;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(View view) {
        if (view == null) return;
        ViewGroup viewGroup = (ViewGroup)view.getParent();
        if (viewGroup == null) return;
        try {
            viewGroup.removeView(view);
            return;
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.b("MintegralBaseView", throwable.getMessage(), throwable);
        }
    }

    static /* synthetic */ void a(MintegralContainerView mintegralContainerView, f.f.a.r.b.k.c c2, Integer n2) {
        mintegralContainerView.a(c2, n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(f.f.a.r.b.k.c c2, Integer n2) {
        int n3;
        this.D = c2;
        f.f.a.e.e.a a2 = this.c;
        if (a2 == null) return;
        if (n2 == null) {
            n2 = a2.e1();
        }
        if (!this.q()) {
            MintegralContainerView.super.E();
        }
        if ((n3 = n2.intValue()) == 1) return;
        if (n3 != 3) {
            if (n3 != 4) {
                if (n3 == 5) return;
                if (this.t == 2) {
                    if (this.n == null) {
                        this.n = new e(this.b);
                    }
                    this.n.setCampaign(this.c);
                    this.n.setCloseDelayShowTime(this.u);
                    this.n.setNotifyListener((com.mintegral.msdk.video.module.j.b)new com.mintegral.msdk.video.module.j.a.i(this.f));
                    this.n.setUnitId(this.r);
                    this.n.a(c2);
                    f.f.a.e.f.h.a("MintegralBaseView", "preload H5Endcard");
                    if (this.y) return;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("showTransparent = ");
                    stringBuilder.append(this.y);
                    stringBuilder.append(" addview");
                    f.f.a.e.f.h.a("MintegralBaseView", stringBuilder.toString());
                    this.addView((View)this.n);
                    return;
                }
                if (this.m == null) {
                    this.m = new com.mintegral.msdk.video.module.g(this.b);
                }
                this.m.setCampaign(this.c);
                this.m.setUnitId(this.r);
                this.m.setNotifyListener((com.mintegral.msdk.video.module.j.b)new com.mintegral.msdk.video.module.j.a.i(this.f));
                this.m.a(c2);
                return;
            }
            if (this.p == null) {
                this.p = new f(this.b);
            }
            this.p.setCampaign(this.c);
            this.p.setNotifyListener((com.mintegral.msdk.video.module.j.b)new com.mintegral.msdk.video.module.j.a.i(this.f));
            return;
        }
        if (this.o == null) {
            this.o = new i(this.b);
        }
        this.o.setCampaign(this.c);
        this.o.setNotifyListener((com.mintegral.msdk.video.module.j.b)new l(this.f));
        this.o.a(c2);
    }

    private void e(int n2) {
        if (n2 != -3) {
            if (n2 != -2) {
                if (this.k == null) {
                    this.k = new c(this.b);
                }
                this.k.setCampaign(this.c);
                this.k.setUnitId(this.r);
                this.k.setNotifyListener((com.mintegral.msdk.video.module.j.b)new com.mintegral.msdk.video.module.j.a.i(this.f));
                this.k.a(this.D);
                return;
            }
            f.f.a.e.e.a a2 = this.c;
            if (a2 != null && a2.e1() == 2) {
                if (this.l == null) {
                    this.l = new d(this.b);
                }
                this.l.setCampaign(this.c);
                d d2 = this.l;
                d2.setNotifyListener((com.mintegral.msdk.video.module.j.b)new g(d2, this.f));
                this.l.a(this.D);
                this.n();
                MintegralContainerView.super.C();
                MintegralContainerView.super.E();
            }
        }
    }

    private void z() {
        if (this.t == 2 && !this.C) {
            this.A();
            return;
        }
        this.B();
    }

    @Override
    public void a(int n2, int n3, int n4) {
        d d2 = this.l;
        if (d2 != null) {
            d2.d(n2, n3);
            this.l.setRadius(n4);
            this.removeAllViews();
            this.n();
            this.F = true;
            this.bringToFront();
            MintegralContainerView.super.C();
        }
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6) {
        d d2 = this.l;
        if (d2 != null) {
            d2.b(n2, n3, n4, n5);
            this.l.setRadius(n6);
            this.l.setCloseVisible(8);
            this.l.setClickable(false);
            this.removeAllViews();
            this.n();
            this.F = true;
            this.bringToFront();
            this.C();
            if (!this.A) {
                this.A = true;
                this.f.a(109, (Object)"");
                this.f.a(117, (Object)"");
            }
        }
    }

    public void a(Context context) {
        this.setVisibility(0);
    }

    public void a(f.f.a.r.b.k.c c2) {
        this.D = c2;
        f.f.a.e.e.a a2 = this.c;
        if (a2 != null) {
            if (a2.D0() == 2) {
                if (this.j == null) {
                    this.j = new h(this.b);
                }
                this.j.setCloseDelayShowTime(this.u);
                this.j.setPlayCloseBtnTm(this.v);
                this.j.setCampaign(this.c);
                this.j.setNotifyListener((com.mintegral.msdk.video.module.j.b)new com.mintegral.msdk.video.module.j.a.i((MintegralContainerView)this, this.f){
                    final /* synthetic */ MintegralContainerView b;
                    {
                        this.b = mintegralContainerView;
                        super(b2);
                    }

                    public final void a(int n2, Object object) {
                        super.a(n2, object);
                        if (n2 == 100) {
                            this.b.y();
                            MintegralContainerView mintegralContainerView = this.b;
                            mintegralContainerView.onConfigurationChanged(mintegralContainerView.getResources().getConfiguration());
                            n n3 = new n();
                            n3.i(this.b.c.M0());
                            n3.k(this.b.c.e());
                            int n4 = this.b.c.m1() ? n.D : n.E;
                            n3.a(n4);
                            MintegralContainerView mintegralContainerView2 = this.b;
                            com.mintegral.msdk.base.common.report.c.b((n)n3, (Context)mintegralContainerView2.b, (String)MintegralContainerView.a(mintegralContainerView2));
                        }
                    }
                });
                this.j.a(c2);
            } else {
                MintegralContainerView.super.e(this.s);
                new Handler(Looper.getMainLooper()).postDelayed((Runnable)new a((MintegralContainerView)this, c2), (long)this.getVideoSkipTime());
            }
            MintegralContainerView.super.D();
        }
    }

    @Override
    public boolean a() {
        return this.x;
    }

    public void addView(View view) {
        if (view != null) {
            MintegralContainerView.super.a(view);
            RelativeLayout.super.addView(view);
            return;
        }
        f.f.a.e.f.h.d("MintegralBaseView", "view is null");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            MintegralContainerView.super.a(view);
            RelativeLayout.super.addView(view, layoutParams);
            return;
        }
        f.f.a.e.f.h.d("MintegralBaseView", "view is null");
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void b(int n2) {
        block4 : {
            int n3;
            com.mintegral.msdk.video.module.j.b b2;
            block8 : {
                block5 : {
                    block9 : {
                        block6 : {
                            block7 : {
                                if (this.c == null) break block4;
                                if (n2 == 1) break block5;
                                if (n2 == 3) break block6;
                                if (n2 == 4) break block7;
                                if (n2 != 5) {
                                    this.removeAllViews();
                                    this.n();
                                    this.F = true;
                                    this.bringToFront();
                                    MintegralContainerView.super.z();
                                    b2 = this.f;
                                    n3 = 117;
                                } else {
                                    b2 = this.f;
                                    n3 = 106;
                                }
                                break block8;
                            }
                            this.f.a(113, (Object)"");
                            this.removeAllViews();
                            this.n();
                            if (this.p == null) {
                                MintegralContainerView.super.a(this.D, 4);
                            }
                            this.p.a(this.D);
                            this.addView((View)this.p);
                            break block9;
                        }
                        this.removeAllViews();
                        this.n();
                        if (this.o == null) {
                            MintegralContainerView.super.a(this.D, 3);
                        }
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams.addRule(13, -1);
                        this.addView((View)this.o, (ViewGroup.LayoutParams)layoutParams);
                        this.o.p();
                    }
                    this.F = true;
                    this.bringToFront();
                    break block4;
                }
                b2 = this.f;
                n3 = 104;
            }
            b2.a(n3, (Object)"");
        }
        this.w = true;
    }

    @Override
    public void b(int n2, int n3, int n4) {
        d d2 = this.l;
        if (d2 != null && d2.getVisibility() == 0) {
            this.l.d(n2, n3);
        }
    }

    @Override
    public void c(int n2) {
        block25 : {
            block28 : {
                block26 : {
                    d d2;
                    c c2;
                    block27 : {
                        com.mintegral.msdk.video.module.a a2;
                        if (this.c == null) break block25;
                        if (n2 == -1) break block26;
                        if (n2 == 1) break block27;
                        if (n2 != 2) {
                            return;
                        }
                        c c3 = this.k;
                        if (c3 != null && c3.getParent() != null) {
                            this.removeView((View)this.k);
                        }
                        if ((a2 = this.q) != null && a2.getParent() != null) {
                            return;
                        }
                        d d3 = this.l;
                        if (d3 == null || d3.getParent() == null) {
                            try {
                                if (this.c != null && this.c.D0() == 1) {
                                    this.n();
                                    MintegralContainerView.super.C();
                                }
                            }
                            catch (Exception exception) {
                                exception.printStackTrace();
                            }
                        }
                        if (this.r()) {
                            e e2 = this.n;
                            if (e2 != null && e2.getParent() != null) {
                                this.removeView((View)this.n);
                            }
                            this.f.a(112, (Object)"");
                            f.f.a.e.e.a a3 = this.c;
                            if (a3 != null && !a3.l1()) {
                                this.c.a(true);
                                com.mintegral.msdk.video.module.k.a.f((Context)this.b, (f.f.a.e.e.a)this.c);
                            }
                            if (this.y) {
                                this.f.a(115, (Object)"");
                            } else {
                                this.F = true;
                                this.bringToFront();
                                this.y();
                                this.onConfigurationChanged(this.getResources().getConfiguration());
                            }
                            this.x = true;
                            return;
                        }
                        break block28;
                    }
                    if (this.w) {
                        return;
                    }
                    e e3 = this.n;
                    if (e3 != null && e3.getParent() != null) {
                        this.removeView((View)this.n);
                    }
                    if ((d2 = this.l) != null && d2.getParent() != null) {
                        this.removeView((View)this.l);
                    }
                    if ((c2 = this.k) == null || c2.getParent() == null) {
                        try {
                            if (this.c != null && this.c.D0() == 1) {
                                this.F = true;
                                if (this.k == null) {
                                    MintegralContainerView.super.e(-1);
                                }
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                this.addView((View)this.k, 0, (ViewGroup.LayoutParams)layoutParams);
                            }
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                        }
                    }
                    if (this.q()) {
                        this.bringToFront();
                        return;
                    }
                    break block25;
                }
                if (this.q() || this.f()) break block25;
            }
            MintegralContainerView.super.E();
        }
    }

    @Override
    public void d() {
        if (!this.q()) {
            com.mintegral.msdk.video.module.a a2;
            if (this.E && !this.F) {
                this.E();
                this.E = false;
            }
            if ((a2 = this.q) != null && a2.getParent() != null) {
                this.removeView((View)this.q);
                c c2 = this.k;
                if (c2 != null && c2.getParent() != null) {
                    this.o();
                    ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams)layoutParams).addRule(12, -1);
                    }
                }
            }
        }
    }

    @Override
    public void d(int n2) {
        e e2 = this.n;
        if (e2 != null) {
            e2.d(n2);
        }
    }

    @Override
    public boolean f() {
        return this.w;
    }

    public e getH5EndCardView() {
        e e2 = this.n;
        if (e2 == null) {
            e2 = this.j;
        }
        return e2;
    }

    public boolean getShowingTransparent() {
        return this.y;
    }

    public String getUnitID() {
        return this.r;
    }

    public int getVideoInteractiveType() {
        return this.s;
    }

    public int getVideoSkipTime() {
        return this.B;
    }

    @Override
    public boolean h() {
        com.mintegral.msdk.video.module.a a2 = this.q;
        if (a2 != null && a2.u()) {
            com.mintegral.msdk.video.module.a a3;
            d d2;
            this.n();
            ViewGroup viewGroup = (ViewGroup)this.getParent();
            int n2 = viewGroup.getChildCount();
            boolean bl = viewGroup.indexOfChild((View)this) == n2 - 1;
            if (!bl && !this.F) {
                this.removeAllViews();
                this.bringToFront();
                this.E = true;
            }
            if ((d2 = this.l) != null && d2.getParent() != null) {
                return false;
            }
            if (this.q == null) {
                this.D();
            }
            if ((a3 = this.q) != null && a3.getParent() != null) {
                this.removeView((View)this.q);
            }
            this.addView((View)this.q);
            this.setBackgroundColor(0);
            this.q.y();
            return true;
        }
        return false;
    }

    public void k() {
        super.k();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.mintegral.msdk.video.module.b[] arrb = new com.mintegral.msdk.video.module.b[7];
        h h2 = this.j;
        int n2 = 0;
        arrb[0] = h2;
        arrb[1] = this.k;
        arrb[2] = this.l;
        arrb[3] = this.m;
        arrb[4] = this.n;
        arrb[5] = this.o;
        arrb[6] = this.p;
        int n3 = arrb.length;
        while (n2 < n3) {
            com.mintegral.msdk.video.module.b b2 = arrb[n2];
            if (b2 != null && b2 instanceof d || b2 != null && b2.getVisibility() == 0 && b2.getParent() != null && !this.q()) {
                b2.a(configuration);
            }
            ++n2;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean p() {
        if (this.m != null) {
            return true;
        }
        e e2 = this.n;
        if (e2 != null) {
            return e2.r();
        }
        e2 = this.p;
        if (e2 != null) {
            return e2.r();
        }
        e2 = this.j;
        if (e2 == null) return false;
        return e2.r();
    }

    public boolean q() {
        ViewGroup viewGroup = (ViewGroup)this.getParent();
        boolean bl = false;
        if (viewGroup != null) {
            int n2 = viewGroup.indexOfChild((View)this);
            bl = false;
            if (n2 == 0) {
                bl = true;
            }
        }
        return bl;
    }

    public boolean r() {
        d d2 = this.l;
        return d2 != null && d2.u();
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void s() {
        com.mintegral.msdk.video.module.j.b b2;
        int n2;
        if (this.m == null && this.o == null) {
            if (this.p == null) {
                e e2 = this.n;
                if (e2 == null) return;
                e2.v();
                return;
            }
            b2 = this.f;
            n2 = 103;
        } else {
            b2 = this.f;
            n2 = 104;
        }
        b2.a(n2, (Object)"");
    }

    public void setCloseDelayTime(int n2) {
        this.u = n2;
    }

    public void setEndscreenType(int n2) {
        this.t = n2;
    }

    public void setJSFactory(f.f.a.r.b.k.c c2) {
        this.D = c2;
    }

    public void setNotifyListener(com.mintegral.msdk.video.module.j.b b2) {
        super.setNotifyListener(b2);
        com.mintegral.msdk.video.module.b[] arrb = new com.mintegral.msdk.video.module.b[7];
        h h2 = this.j;
        arrb[0] = h2;
        arrb[1] = this.k;
        arrb[2] = this.l;
        arrb[3] = this.m;
        arrb[4] = this.n;
        arrb[5] = this.o;
        arrb[6] = this.p;
        for (com.mintegral.msdk.video.module.b b3 : arrb) {
            if (b3 == null) continue;
            com.mintegral.msdk.video.module.j.a.i i2 = b3 instanceof d ? new g(this.l, b2) : new com.mintegral.msdk.video.module.j.a.i(b2);
            b3.setNotifyListener((com.mintegral.msdk.video.module.j.b)i2);
        }
    }

    public void setPlayCloseBtnTm(int n2) {
        this.v = n2;
    }

    public void setShowingTransparent(boolean bl) {
        this.y = bl;
    }

    public void setUnitID(String string2) {
        this.r = string2;
    }

    public void setVideoInteractiveType(int n2) {
        this.s = n2;
    }

    public void setVideoSkipTime(int n2) {
        this.B = n2;
    }

    public void t() {
        if (this.x) {
            this.f.a(107, (Object)"");
        }
    }

    public void u() {
        h h2 = this.j;
        if (h2 != null) {
            h2.v();
        }
    }

    public void v() {
        h h2;
        f f2;
        e e2 = this.n;
        if (e2 != null) {
            e2.x();
            this.n = null;
        }
        if ((h2 = this.j) != null) {
            h2.x();
        }
        if ((f2 = this.p) != null) {
            f2.x();
        }
    }

    public void w() {
        d d2 = this.l;
        if (d2 != null) {
            d2.z();
            this.l.setMintegralClickMiniCardViewClickable(false);
        }
    }

    public void x() {
        if (this.c != null) {
            this.removeAllViews();
            this.n();
            if (this.j == null) {
                this.a(this.D);
            }
            this.addView((View)this.j);
            h h2 = this.j;
            if (h2 != null) {
                h2.setUnitId(this.r);
                f.f.a.e.e.a a2 = this.c;
                if (a2 != null && a2.m1() && this.c.D0() == 2) {
                    this.j.setCloseVisible(0);
                }
            }
            this.F = true;
            this.bringToFront();
        }
    }

    public void y() {
        e[] arre = new e[4];
        h h2 = this.j;
        arre[0] = h2;
        arre[1] = this.l;
        arre[2] = this.n;
        arre[3] = this.q;
        for (e e2 : arre) {
            if (e2 == null || e2.getVisibility() != 0 || e2.getParent() == null || this.q()) continue;
            e2.y();
        }
    }
}

