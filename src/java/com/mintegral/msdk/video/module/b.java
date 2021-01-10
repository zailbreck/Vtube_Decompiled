/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mintegral.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mintegral.msdk.video.module.j.a.f;
import f.f.a.e.e.a;
import f.f.a.e.f.h;
import f.f.a.e.f.l;
import f.f.a.e.f.o;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b
extends RelativeLayout {
    protected Context b;
    protected a c;
    protected LayoutInflater d;
    protected int e;
    protected com.mintegral.msdk.video.module.j.b f;
    protected boolean g;
    protected float h;
    protected float i;

    public b(Context context) {
        super(context, null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 1;
        this.f = new f();
        this.g = false;
        this.b = context;
        this.d = LayoutInflater.from((Context)context);
        this.a(context);
    }

    public int a(String string) {
        return o.a(this.b.getApplicationContext(), string, "color");
    }

    public void a(int n2, int n3, int n4, int n5) {
        RelativeLayout.LayoutParams layoutParams = this.getParentRelativeLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = this.getParentLinearLayoutParams();
        if (layoutParams != null) {
            layoutParams.topMargin = n3;
            layoutParams.leftMargin = n2;
            if (n4 != -999) {
                layoutParams.width = n4;
            }
            if (n5 != -999) {
                layoutParams.height = n5;
            }
            this.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            return;
        }
        if (layoutParams2 != null) {
            layoutParams2.topMargin = n3;
            layoutParams2.leftMargin = n2;
            if (n4 != -999) {
                layoutParams2.width = n4;
            }
            if (n5 != -999) {
                layoutParams2.height = n5;
            }
            this.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
        }
    }

    public abstract void a(Context var1);

    public void a(Configuration configuration) {
        this.e = configuration.orientation;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onSelfConfigurationChanged:");
        stringBuilder.append(configuration.orientation);
        Log.d((String)"MintegralBaseView", (String)stringBuilder.toString());
    }

    public /* varargs */ boolean a(View ... arrview) {
        boolean bl;
        block3 : {
            bl = false;
            if (arrview != null) {
                int n2 = arrview.length;
                boolean bl2 = false;
                for (int i2 = 0; i2 < n2; ++i2) {
                    View view = arrview[i2];
                    bl = false;
                    if (view != null) {
                        bl2 = true;
                        continue;
                    }
                    break block3;
                }
                bl = bl2;
            }
        }
        return bl;
    }

    public int b(String string) {
        return o.a(this.b.getApplicationContext(), string, "drawable");
    }

    public int c(String string) {
        return o.a(this.b.getApplicationContext(), string, "id");
    }

    public void c(int n2, int n3) {
        RelativeLayout.LayoutParams layoutParams = this.getParentRelativeLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = this.getParentLinearLayoutParams();
        if (layoutParams != null) {
            layoutParams.addRule(13);
            if (n2 != -999) {
                layoutParams.width = n2;
            }
            if (n3 != -999) {
                layoutParams.height = n3;
            }
            this.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            return;
        }
        if (layoutParams2 != null) {
            layoutParams2.gravity = 17;
            if (n2 != -999) {
                layoutParams2.width = n2;
            }
            if (n3 != -999) {
                layoutParams2.height = n3;
            }
            this.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
        }
    }

    public int d(String string) {
        return o.a(this.b.getApplicationContext(), string, "layout");
    }

    public a getCampaign() {
        return this.c;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams)layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams)layoutParams;
        }
        return null;
    }

    protected void i() {
    }

    protected final String j() {
        return this.l().toString();
    }

    public void k() {
        h.a("MintegralBaseView", "defaultShow");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    protected final JSONObject l() {
        block7 : {
            var1_1 = new JSONObject();
            var2_2 = new JSONObject();
            var2_2.put(f.f.a.e.b.b.e, l.a(f.f.a.e.c.a.i().e(), this.h));
            var2_2.put(f.f.a.e.b.b.f, l.a(f.f.a.e.c.a.i().e(), this.i));
            var2_2.put(f.f.a.e.b.b.h, 0);
            {
                catch (JSONException var3_4) {}
            }
            try {
                this.e = this.getContext().getResources().getConfiguration().orientation;
                ** GOTO lbl15
            }
            catch (Exception var7_3) {
                var7_3.printStackTrace();
lbl15: // 2 sources:
                var2_2.put(f.f.a.e.b.b.i, this.e);
                var2_2.put(f.f.a.e.b.b.j, (double)l.b(this.getContext()));
                return var2_2;
            }
            break block7;
            catch (JSONException var10_6) {
                var2_2 = var1_1;
                var3_5 = var10_6;
            }
        }
        var3_5.printStackTrace();
        return var2_2;
    }

    public boolean m() {
        return this.b.getResources().getConfiguration().orientation == 2;
    }

    public void n() {
        ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
        if (layoutParams == null) {
            this.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public void o() {
        ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
        if (layoutParams == null) {
            this.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            return;
        }
        layoutParams.height = -2;
        layoutParams.width = -2;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.e = configuration.orientation;
        super.onConfigurationChanged(configuration);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onConfigurationChanged:");
        stringBuilder.append(configuration.orientation);
        Log.d((String)"MintegralBaseView", (String)stringBuilder.toString());
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.h = motionEvent.getRawX();
        this.i = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setCampaign(a a2) {
        this.c = a2;
    }

    public void setNotifyListener(com.mintegral.msdk.video.module.j.b b2) {
        this.f = b2;
    }
}

