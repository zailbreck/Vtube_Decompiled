/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Configuration
 *  f.f.a.e.f.h
 *  f.f.a.r.b.b
 *  f.f.a.r.b.i
 *  f.f.a.r.b.j
 *  f.f.a.r.b.k.a
 *  f.f.a.r.b.n
 *  java.lang.String
 */
package f.f.a.r.b.c;

import android.app.Activity;
import android.content.res.Configuration;
import f.f.a.e.f.h;
import f.f.a.r.b.b;
import f.f.a.r.b.d;
import f.f.a.r.b.f;
import f.f.a.r.b.i;
import f.f.a.r.b.j;
import f.f.a.r.b.m;
import f.f.a.r.b.n;

public abstract class a
extends Activity
implements f.f.a.r.b.k.a {
    protected f.f.a.r.b.k.a b = new f.f.a.r.b.k.b();

    public void a(f.f.a.r.b.k.a a2) {
        this.b = a2;
    }

    public boolean a() {
        return false;
    }

    public b getActivityProxy() {
        return this.b.getActivityProxy();
    }

    public m getIJSRewardVideoV1() {
        return this.b.getIJSRewardVideoV1();
    }

    public d getJSBTModule() {
        return this.b.getJSBTModule();
    }

    public f getJSCommon() {
        return this.b.getJSCommon();
    }

    public i getJSContainerModule() {
        return this.b.getJSContainerModule();
    }

    public j getJSNotifyProxy() {
        return this.b.getJSNotifyProxy();
    }

    public n getJSVideoModule() {
        return this.b.getJSVideoModule();
    }

    public void onBackPressed() {
        if (this.getJSCommon().c()) {
            if (this.getJSContainerModule() != null && this.getJSContainerModule().a()) {
                return;
            }
            this.getActivityProxy().e();
            return;
        }
        if (this.a()) {
            super.onBackPressed();
            return;
        }
        h.a((String)"AbstractJSActivity", (String)"onBackPressed can't excute");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.getJSCommon().c()) {
            this.getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        if (this.getJSCommon().c()) {
            this.getActivityProxy().a();
        }
        this.getActivityProxy().a(1);
    }

    public void onResume() {
        super.onResume();
        if (this.getJSCommon().c()) {
            this.getActivityProxy().b();
        }
        this.getActivityProxy().a(0);
    }
}

