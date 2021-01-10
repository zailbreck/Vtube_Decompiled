/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.widget.FrameLayout
 *  com.mintegral.msdk.video.module.k.a
 *  f.f.a.e.e.a
 *  f.f.a.e.e.a$b
 *  f.f.a.e.f.h
 *  f.f.a.r.b.a.j
 *  f.f.a.r.b.b
 *  f.f.a.r.b.i
 *  f.f.a.r.b.j
 *  f.f.a.r.b.k.a
 *  f.f.a.r.b.n
 *  f.f.a.s.a
 *  f.f.a.s.a$a
 *  f.f.a.s.b.d
 *  f.f.a.s.d.c
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.f.a.r.b.g;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import f.f.a.e.e.a;
import f.f.a.e.f.h;
import f.f.a.r.b.b;
import f.f.a.r.b.d;
import f.f.a.r.b.f;
import f.f.a.r.b.i;
import f.f.a.r.b.j;
import f.f.a.r.b.m;
import f.f.a.r.b.n;
import f.f.a.s.a;
import f.f.a.s.d.c;

public abstract class a
extends FrameLayout
implements f.f.a.r.b.k.a {
    protected Activity b;
    protected String c;
    protected String d;
    protected c e;
    protected String f;
    protected f.f.a.s.b.d g;
    protected String h;
    protected int i = 2;
    protected boolean j = false;
    protected boolean k = false;
    protected int l;
    protected int m;
    protected int n;
    protected boolean o = false;
    protected f.f.a.r.b.k.a p = new f.f.a.r.b.k.b();

    public a(Context context) {
        super(context);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean a(int var1) {
        if (var1 == 1) ** GOTO lbl10
        if (var1 != 2) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                this.b.setRequestedOrientation(11);
                return true;
            }
            this.b.setRequestedOrientation(0);
            return true;
lbl10: // 1 sources:
            if (Build.VERSION.SDK_INT >= 18) {
                this.b.setRequestedOrientation(12);
                return true;
            }
            this.b.setRequestedOrientation(1);
            return true;
        }
        catch (Throwable var2_2) {
            h.b((String)"AbstractJSContainer", (String)var2_2.getMessage(), (Throwable)var2_2);
            return false;
        }
    }

    protected final f.f.a.r.b.a.j a(f.f.a.e.e.a a2) {
        f.f.a.k.g.b b2;
        if (a2 == null) {
            return null;
        }
        int n2 = this.j ? 287 : 94;
        a.a a3 = f.f.a.s.a.a((int)n2, (f.f.a.e.e.a)a2);
        if (a3 != null && a3.c() && (b2 = a3.a()).getObject() instanceof f.f.a.r.b.a.j) {
            h.d((String)"AbstractJSContainer", (String)"JSCommon \u8fdb\u6765");
            return (f.f.a.r.b.a.j)b2.getObject();
        }
        return null;
    }

    protected final String a() {
        c c2;
        if (TextUtils.isEmpty((CharSequence)this.d) && (c2 = this.e) != null && !TextUtils.isEmpty((CharSequence)c2.a())) {
            return this.e.a();
        }
        return this.d;
    }

    public void a(int n2, int n3, int n4) {
        this.l = n2;
        this.m = n3;
        this.n = n4;
    }

    public void a(f.f.a.r.b.k.a a2) {
        this.p = a2;
    }

    protected final void a(c c2, f.f.a.e.e.a a2) {
        if (this.b(a2) == 1) {
            return;
        }
        boolean bl = false;
        if (a2 != null) {
            a.b b2 = a2.R0();
            bl = false;
            if (b2 != null) {
                bl = a.super.a(b2.b());
            }
        }
        if (!bl && c2 != null) {
            a.super.a(this.e.g());
        }
    }

    protected void a(String string) {
        h.d((String)"AbstractJSContainer", (String)string);
        Activity activity = this.b;
        if (activity != null) {
            activity.finish();
        }
    }

    protected final int b(f.f.a.e.e.a a2) {
        f.f.a.r.b.a.j j2 = this.a(a2);
        if (j2 != null) {
            return j2.i();
        }
        return 0;
    }

    public void b() {
        if (this.getJSCommon().c()) {
            this.getActivityProxy().c();
        }
        com.mintegral.msdk.video.module.k.a.a();
    }

    public void c() {
        if (this.getJSCommon().c()) {
            this.getActivityProxy().a();
        }
        this.getActivityProxy().a(1);
    }

    public void d() {
        if (this.getJSCommon().c()) {
            this.getActivityProxy().b();
        }
        this.getActivityProxy().a(0);
    }

    public b getActivityProxy() {
        return this.p.getActivityProxy();
    }

    public m getIJSRewardVideoV1() {
        return this.p.getIJSRewardVideoV1();
    }

    public d getJSBTModule() {
        return this.p.getJSBTModule();
    }

    public f getJSCommon() {
        return this.p.getJSCommon();
    }

    public i getJSContainerModule() {
        return this.p.getJSContainerModule();
    }

    public j getJSNotifyProxy() {
        return this.p.getJSNotifyProxy();
    }

    public n getJSVideoModule() {
        return this.p.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.d;
    }

    public String getUnitId() {
        return this.c;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.getJSCommon().c()) {
            this.getActivityProxy().a(configuration);
        }
    }

    public void setActivity(Activity activity) {
        this.b = activity;
    }

    public void setBidCampaign(boolean bl) {
        this.k = bl;
    }

    public void setBigOffer(boolean bl) {
        this.o = bl;
    }

    public void setIV(boolean bl) {
        this.j = bl;
    }

    public void setMute(int n2) {
        this.i = n2;
    }

    public void setPlacementId(String string) {
        this.d = string;
    }

    public void setReward(f.f.a.s.b.d d2) {
        this.g = d2;
    }

    public void setRewardId(String string) {
        this.h = string;
    }

    public void setRewardUnitSetting(c c2) {
        this.e = c2;
    }

    public void setUnitId(String string) {
        this.c = string;
    }

    public void setUserId(String string) {
        this.f = string;
    }
}

