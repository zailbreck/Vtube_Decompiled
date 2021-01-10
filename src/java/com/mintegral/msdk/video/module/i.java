/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  com.mintegral.msdk.video.module.b
 *  com.mintegral.msdk.video.module.i$a
 *  com.mintegral.msdk.video.module.j.b
 *  java.lang.Object
 *  java.lang.String
 */
package com.mintegral.msdk.video.module;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mintegral.msdk.video.module.i;
import f.f.a.r.b.k.c;

public class i
extends com.mintegral.msdk.video.module.b {
    private ViewGroup j;
    private View k;
    private View l;

    public i(Context context) {
        super(context);
    }

    public void a(Context context) {
        int n2 = this.d("mintegral_reward_endcard_vast");
        if (n2 >= 0) {
            this.d.inflate(n2, (ViewGroup)this);
            this.j = (ViewGroup)this.findViewById(this.c("mintegral_rl_content"));
            this.k = this.findViewById(this.c("mintegral_iv_vastclose"));
            this.l = this.findViewById(this.c("mintegral_iv_vastok"));
            View[] arrview = new View[]{this.j, this.k, this.l};
            this.g = this.a(arrview);
            this.i();
            if (this.g) {
                this.n();
                this.setBackgroundResource(this.a("mintegral_reward_endcard_vast_bg"));
                this.setClickable(true);
                ((RelativeLayout.LayoutParams)this.j.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    public void a(c c2) {
    }

    protected final void i() {
        super.i();
        if (this.g) {
            this.k.setOnClickListener((View.OnClickListener)new a(this));
            this.l.setOnClickListener((View.OnClickListener)new f.f.a.t.b(){

                @Override
                protected final void a(View view) {
                    i i2 = i.this;
                    i2.f.a(108, (Object)i2.j());
                }
            });
        }
    }

    public void p() {
        this.f.a(111, (Object)"");
    }

}

