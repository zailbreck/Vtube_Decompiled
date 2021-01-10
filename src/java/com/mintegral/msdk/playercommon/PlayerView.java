/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.Surface
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  android.view.SurfaceView
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.mintegral.msdk.playercommon;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.mintegral.msdk.playercommon.d;
import com.mintegral.msdk.playercommon.e;
import f.f.a.e.f.h;
import f.f.a.e.f.o;

public class PlayerView
extends LinearLayout {
    private LinearLayout b;
    private LinearLayout c;
    private d d;
    private String e;
    private boolean f = false;
    private boolean g = true;
    private boolean h = false;
    private boolean i = false;
    private boolean j;
    private boolean k = false;
    private boolean l = false;
    private SurfaceHolder m;

    public PlayerView(Context context) {
        super(context);
        PlayerView.super.o();
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        PlayerView.super.o();
    }

    private void o() {
        try {
            this.q();
            this.p();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private void p() {
        this.d = new d();
    }

    private void q() {
        int n2 = o.a(this.getContext(), "mintegral_playercommon_player_view", "layout");
        View view = LayoutInflater.from((Context)this.getContext()).inflate(n2, null);
        if (view != null) {
            this.b = (LinearLayout)view.findViewById(o.a(this.getContext(), "mintegral_playercommon_ll_sur_container", "id"));
            this.c = (LinearLayout)view.findViewById(o.a(this.getContext(), "mintegral_playercommon_ll_loading", "id"));
            this.a();
            this.addView(view, -1, -1);
        }
    }

    public void a() {
        try {
            h.b("PlayerView", "addSurfaceView");
            SurfaceView surfaceView = new SurfaceView(this.getContext());
            this.m = surfaceView.getHolder();
            this.m.setType(3);
            this.m.setKeepScreenOn(true);
            this.m.addCallback((SurfaceHolder.Callback)new b(this, null));
            this.b.addView((View)surfaceView, -1, -1);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void a(int n2) {
        d d2 = this.d;
        if (d2 != null) {
            d2.a(n2);
        }
    }

    public boolean a(String string, String string2, e e2) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            h.b("PlayerView", "playUrl==null");
            return false;
        }
        this.e = string;
        this.d.a(string, (View)this.c, e2);
        this.f = true;
        return true;
    }

    public void b() {
        d d2 = this.d;
        if (d2 != null) {
            d2.h();
        }
    }

    public boolean b(int n2) {
        block5 : {
            block4 : {
                try {
                    if (this.d != null) break block4;
                    h.b("PlayerView", "player init error \u64ad\u653e\u5931\u8d25");
                    return false;
                }
                catch (Throwable throwable) {
                    h.b("PlayerView", throwable.getMessage(), throwable);
                    return false;
                }
            }
            if (this.f) break block5;
            h.b("PlayerView", "vfp init failed \u64ad\u653e\u5931\u8d25");
            return false;
        }
        this.d.a(this.e, n2);
        return true;
    }

    public void c(int n2) {
        try {
            if (this.d != null) {
                this.d.b(n2);
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public boolean c() {
        boolean bl;
        block3 : {
            try {
                d d2 = this.d;
                bl = false;
                if (d2 == null) break block3;
            }
            catch (Throwable throwable) {
                h.b("PlayerView", throwable.getMessage(), throwable);
                return false;
            }
            boolean bl2 = this.d.m();
            bl = false;
            if (!bl2) break block3;
            bl = true;
        }
        return bl;
    }

    public boolean d() {
        block3 : {
            try {
                if (this.d != null) {
                    boolean bl = this.d.k();
                    return bl;
                }
            }
            catch (Throwable throwable) {
                if (!f.f.a.a.a) break block3;
                throwable.printStackTrace();
            }
        }
        return false;
    }

    public boolean e() {
        return this.d.n();
    }

    public void f() {
        try {
            this.i();
            if (this.d != null) {
                this.d.a(false);
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void g() {
        try {
            this.d.a(true);
            if (!(this.d == null || this.g || this.h || this.c())) {
                h.b("PlayerView", "onresume========");
                if (this.d.l()) {
                    this.l();
                    return;
                }
                this.b(0);
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public int getCurPosition() {
        try {
            if (this.d != null) {
                int n2 = this.d.j();
                return n2;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }

    public int getDuration() {
        d d2 = this.d;
        if (d2 != null) {
            return d2.o();
        }
        return 0;
    }

    public void h() {
        d d2 = this.d;
        if (d2 != null) {
            d2.i();
        }
    }

    public void i() {
        try {
            if (this.d != null) {
                this.d.b();
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public boolean j() {
        return this.b(0);
    }

    public void k() {
        try {
            if (this.d != null) {
                this.d.g();
            }
            if (Build.VERSION.SDK_INT >= 14 && this.m != null) {
                h.d("PlayerView", "mSurfaceHolder release");
                this.m.getSurface().release();
                return;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public void l() {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                this.m();
                return;
            }
            this.n();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void m() {
        try {
            if (this.d != null) {
                this.d.a();
                this.d.f();
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void n() {
        try {
            if (this.d != null) {
                this.d.e();
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void setDesk(boolean bl) {
        this.d.a(bl);
    }

    public void setIsBTVideo(boolean bl) {
        this.k = bl;
    }

    public void setIsBTVideoPlaying(boolean bl) {
        this.l = bl;
    }

    public void setIsCovered(boolean bl) {
        try {
            this.i = bl;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mIsCovered:");
            stringBuilder.append(bl);
            h.d("PlayerView", stringBuilder.toString());
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void setPlaybackParams(float f2) {
        d d2 = this.d;
        if (d2 != null) {
            d2.a(f2);
        }
    }

    private final class b
    implements SurfaceHolder.Callback {
        final /* synthetic */ PlayerView b;

        private b(PlayerView playerView) {
            this.b = playerView;
        }

        /* synthetic */ b(PlayerView playerView, a a2) {
            super(playerView);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int n2, int n3, int n4) {
            try {
                h.b("PlayerView", "surfaceChanged");
                if (this.b.h && !this.b.i && !this.b.c() && !this.b.k) {
                    if (this.b.d.l()) {
                        h.b("PlayerView", "surfaceChanged  start====");
                        this.b.l();
                    } else {
                        h.b("PlayerView", "surfaceChanged  PLAY====");
                        this.b.b(0);
                    }
                    if (this.b.k) {
                        if (this.b.l) {
                            d d2;
                            if (this.b.d.l()) {
                                d2 = this.b.d;
                            } else {
                                this.b.d.c();
                                d2 = this.b.d;
                            }
                            d2.e();
                        } else {
                            this.b.i();
                        }
                    }
                }
                this.b.h = false;
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                h.b("PlayerView", "surfaceCreated");
                if (this.b.d != null && surfaceHolder != null) {
                    this.b.m = surfaceHolder;
                    this.b.d.a(surfaceHolder);
                }
                this.b.g = false;
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                h.b("PlayerView", "surfaceDestroyed ");
                this.b.h = true;
                this.b.j = true;
                this.b.d.b();
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }
    }

}

