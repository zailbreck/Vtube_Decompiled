/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  com.mintegral.msdk.video.module.b
 *  com.mintegral.msdk.video.module.d$a
 *  com.mintegral.msdk.video.module.e
 *  f.f.a.e.e.a$b
 *  f.f.a.e.f.l
 *  java.lang.CharSequence
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.mintegral.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import com.mintegral.msdk.video.module.b;
import com.mintegral.msdk.video.module.d;
import com.mintegral.msdk.video.module.e;
import f.f.a.e.e.a;
import f.f.a.e.f.l;
import f.f.a.r.b.k.c;

public class d
extends e {
    public d(Context context) {
        super(context);
    }

    private void a(View view) {
        int n2 = l.e((Context)this.b);
        int n3 = l.d((Context)this.b);
        int n4 = (int)(0.5f + 0.7f * (float)n2);
        int n5 = (int)(0.5f + 0.7f * (float)n3);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = n4;
        layoutParams.height = n5;
        view.setLayoutParams(layoutParams);
    }

    public void a(Configuration configuration) {
        if (this.g) {
            d.super.a(this.j);
        }
        super.a(configuration);
    }

    public void a(c c2) {
        super.a(c2);
        this.setCloseVisible(0);
    }

    public void b(int n2, int n3, int n4, int n5) {
        this.d(n4, n5);
    }

    public void d(int n2, int n3) {
        if (Build.VERSION.SDK_INT < 11) {
            return;
        }
        View view = ((Activity)this.b).getWindow().findViewById(16908290);
        int n4 = view.getWidth();
        int n5 = view.getHeight();
        if (n2 > 0 && n3 > 0 && n2 <= n4 && n3 <= n5) {
            ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
            layoutParams.width = n2;
            layoutParams.height = n3;
            this.j.setLayoutParams(layoutParams);
        }
    }

    protected final String p() {
        f.f.a.e.e.a a2 = ((b)this).c;
        String string = null;
        if (a2 != null) {
            String string2;
            a.b b2 = a2.R0();
            string = null;
            if (b2 != null) {
                string = b2.c();
            }
            if (!TextUtils.isEmpty(string) && string.contains((CharSequence)".zip") && !TextUtils.isEmpty((CharSequence)(string2 = f.f.a.s.f.l.a().a(string)))) {
                string = string2;
            }
        }
        return string;
    }

    protected final RelativeLayout.LayoutParams q() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    public void setMintegralClickMiniCardViewClickable(boolean bl) {
        this.setClickable(bl);
    }

    public void setRadius(int n2) {
        if (n2 > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((float)l.b((Context)this.getContext(), (float)n2));
            gradientDrawable.setColor(-1);
            if (Build.VERSION.SDK_INT >= 16) {
                this.m.setBackground((Drawable)gradientDrawable);
            } else {
                this.m.setBackgroundDrawable((Drawable)gradientDrawable);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.m.setClipToOutline(true);
            }
        }
    }

    protected final void t() {
        super.t();
        if (((b)this).g) {
            this.setBackgroundResource(this.a("mintegral_reward_minicard_bg"));
            this.a(this.j);
            this.setClickable(true);
        }
    }

    public void y() {
        f.f.a.k.g.b b2 = this.m;
        if (b2 != null) {
            b2.post((Runnable)new a(this));
        }
    }

    public void z() {
        this.setBackgroundColor(0);
    }
}

