/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  com.mintegral.msdk.video.module.b
 *  com.mintegral.msdk.video.module.j.b
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mintegral.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mintegral.msdk.video.module.c;
import com.mintegral.msdk.video.module.j.a.e;
import org.json.JSONException;
import org.json.JSONObject;

public class c
extends com.mintegral.msdk.video.module.b {
    private ViewGroup j;
    private ImageView k;
    private TextView l;
    private TextView m;
    private String n;

    public c(Context context) {
        super(context);
    }

    static /* synthetic */ void a(c c2) {
        c2.p();
    }

    private void p() {
        this.j.setBackgroundColor(0);
        this.k.setVisibility(8);
        this.l.setVisibility(8);
    }

    public void a(Context context) {
        int n2 = this.d("mintegral_reward_clickable_cta");
        if (n2 >= 0) {
            this.d.inflate(n2, (ViewGroup)this);
            this.j = (ViewGroup)this.findViewById(this.c("mintegral_viewgroup_ctaroot"));
            this.k = (ImageView)this.findViewById(this.c("mintegral_iv_appicon"));
            this.l = (TextView)this.findViewById(this.c("mintegral_tv_desc"));
            this.m = (TextView)this.findViewById(this.c("mintegral_tv_install"));
            View[] arrview = new View[]{this.j, this.k, this.l, this.m};
            this.g = this.a(arrview);
            this.i();
            this.o();
        }
    }

    public void a(Configuration configuration) {
        super.a(configuration);
    }

    public void a(f.f.a.r.b.k.c c2) {
        f.f.a.e.e.a a2;
        if (this.g && (a2 = this.c) != null) {
            this.m.setText((CharSequence)a2.a());
            if (!TextUtils.isEmpty((CharSequence)this.c.d())) {
                this.l.setText((CharSequence)this.c.c());
                e e2 = new e((c)this, this.k, this.c, this.n){
                    final /* synthetic */ c e;
                    {
                        this.e = c2;
                        super(imageView, a2, string2);
                    }

                    public final void a(String string2, String string3) {
                        super.a(string2, string3);
                        c.a(this.e);
                    }
                };
                f.f.a.e.b.d.b.a(this.b.getApplicationContext()).a(this.c.d(), e2);
                return;
            }
            c.super.p();
        }
    }

    protected final void i() {
        super.i();
        if (this.g) {
            this.m.setOnClickListener((View.OnClickListener)new f.f.a.t.b(){

                /*
                 * Loose catch block
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 * Lifted jumps to return sites
                 */
                @Override
                protected final void a(View view) {
                    JSONObject jSONObject;
                    block4 : {
                        JSONException jSONException;
                        block5 : {
                            jSONObject = new JSONObject();
                            try {
                                jSONObject.put(f.f.a.e.b.b.g, (Object)c.this.l());
                                break block4;
                            }
                            catch (JSONException jSONException2) {
                                break block5;
                            }
                            catch (JSONException jSONException3) {
                                jSONObject = null;
                                jSONException = jSONException3;
                            }
                        }
                        jSONException.printStackTrace();
                    }
                    c.this.f.a(105, (Object)jSONObject);
                }
            });
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getRawX();
        motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setUnitId(String string2) {
        this.n = string2;
    }

}

