/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  com.mintegral.msdk.video.module.b
 *  com.mintegral.msdk.video.module.g$a
 *  com.mintegral.msdk.video.module.j.b
 *  com.mintegral.msdk.videocommon.view.StarLevelView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mintegral.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mintegral.msdk.video.module.g;
import com.mintegral.msdk.video.module.j.a.e;
import com.mintegral.msdk.video.module.j.a.j;
import com.mintegral.msdk.videocommon.view.StarLevelView;
import f.f.a.e.f.h;
import f.f.a.e.f.l;
import org.json.JSONException;
import org.json.JSONObject;

public class g
extends com.mintegral.msdk.video.module.b {
    private ViewGroup j;
    private ViewGroup k;
    private ImageView l;
    private ImageView m;
    private TextView n;
    private TextView o;
    private StarLevelView p;
    private f.f.a.r.b.k.c q;
    private View r;
    private View s;
    private String t;

    public g(Context context) {
        super(context);
    }

    private void a(View view) {
        if (view == null) {
            this.a(this.b);
            this.a(this.q);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup)view.getParent()).removeView(view);
        }
        this.addView(view);
        g.super.b(view);
        this.i();
        g.super.q();
    }

    private boolean b(View view) {
        try {
            this.l = (ImageView)view.findViewById(this.c("mintegral_iv_adbanner"));
            this.m = (ImageView)view.findViewById(this.c("mintegral_iv_icon"));
            this.n = (TextView)view.findViewById(this.c("mintegral_tv_apptitle"));
            this.o = (TextView)view.findViewById(this.c("mintegral_tv_appdesc"));
            this.p = (StarLevelView)view.findViewById(this.c("mintegral_sv_starlevel"));
            this.r = view.findViewById(this.c("mintegral_iv_close"));
            this.s = view.findViewById(this.c("mintegral_tv_cta"));
            View[] arrview = new View[]{this.l, this.m, this.n, this.o, this.p, this.r, this.s};
            boolean bl = this.a(arrview);
            return bl;
        }
        catch (Throwable throwable) {
            h.b("MintegralBaseView", throwable.getMessage(), throwable);
            return false;
        }
    }

    private void q() {
        if (this.g) {
            float f2;
            float f3 = l.c(this.b);
            if (this.m()) {
                f2 = 627.0f * (f3 *= 0.6f) / 1200.0f;
                int n2 = l.b(this.b.getApplicationContext(), 20.0f);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)this.k.findViewById(this.c("mintegral_view_shadow")).getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(n2, -1);
                }
                layoutParams.leftMargin = (int)(f3 - (float)n2);
            } else {
                f2 = 627.0f * f3 / 1200.0f;
            }
            ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            layoutParams.width = (int)f3;
            layoutParams.height = (int)f2;
        }
    }

    public void a(Context context) {
        String string2 = this.m() ? "mintegral_reward_endcard_native_land" : "mintegral_reward_endcard_native_hor";
        int n2 = this.d(string2);
        if (n2 > 0) {
            ViewGroup viewGroup;
            if (this.m()) {
                this.k = (ViewGroup)this.d.inflate(n2, null);
                this.addView((View)this.k);
                viewGroup = this.k;
            } else {
                this.j = (ViewGroup)this.d.inflate(n2, null);
                this.addView((View)this.j);
                viewGroup = this.j;
            }
            this.g = g.super.b((View)viewGroup);
            this.i();
            g.super.q();
        }
    }

    public void a(Configuration configuration) {
        ViewGroup viewGroup;
        super.a(configuration);
        this.e = configuration.orientation;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" native onSelfConfigurationChanged:");
        stringBuilder.append(this.e);
        h.d("MintegralBaseView", stringBuilder.toString());
        if (this.e == 2) {
            this.removeView((View)this.j);
            viewGroup = this.k;
        } else {
            this.removeView((View)this.k);
            viewGroup = this.j;
        }
        g.super.a((View)viewGroup);
    }

    public void a(f.f.a.r.b.k.c c2) {
        this.q = c2;
        f.f.a.e.e.a a2 = this.c;
        if (a2 != null && this.g) {
            e e2 = new e(this.l, a2, this.t);
            f.f.a.e.b.d.b.a(this.b.getApplicationContext()).a(this.c.f(), e2);
            j j2 = new j(this.m, l.b(f.f.a.e.c.a.i().e(), 8.0f));
            f.f.a.e.b.d.b.a(this.b.getApplicationContext()).a(this.c.d(), j2);
            this.n.setText((CharSequence)this.c.c());
            this.o.setText((CharSequence)this.c.b());
            this.p.removeAllViews();
            double d2 = this.c.h();
            if (d2 <= 0.0) {
                d2 = 5.0;
            }
            this.p.a(d2);
        }
    }

    protected final void i() {
        if (this.g) {
            this.r.setOnClickListener((View.OnClickListener)new a(this));
            this.s.setOnClickListener((View.OnClickListener)new f.f.a.t.b(){

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
                                jSONObject.put(f.f.a.e.b.b.g, (Object)g.this.l());
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
                    g.this.f.a(105, (Object)jSONObject);
                }
            });
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
                                jSONObject.put(f.f.a.e.b.b.g, (Object)g.this.l());
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
                    g.this.f.a(105, (Object)jSONObject);
                }
            });
            this.l.setOnClickListener((View.OnClickListener)new f.f.a.t.b(){

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
                                jSONObject.put(f.f.a.e.b.b.g, (Object)g.this.l());
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
                    g.this.f.a(105, (Object)jSONObject);
                }
            });
        }
    }

    public void p() {
        this.f.a(110, (Object)"");
    }

    public void setUnitId(String string2) {
        this.t = string2;
    }

}

