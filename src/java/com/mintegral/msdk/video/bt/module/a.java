/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.util.Base64
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebView
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONObject
 */
package com.mintegral.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import f.f.a.e.f.h;
import f.f.a.e.f.o;
import f.f.a.k.g.i;
import f.f.a.r.a.a.b;
import org.json.JSONObject;

public abstract class a
extends FrameLayout {
    protected static int k;
    protected Context b;
    protected f.f.a.e.e.a c;
    protected String d;
    protected String e;
    protected LayoutInflater f;
    protected boolean g;
    protected Rect h;
    protected int i;
    protected int j;

    public a(Context context) {
        super(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = "";
        this.g = false;
        this.b = context;
        this.f = LayoutInflater.from((Context)context);
        this.a(context);
    }

    protected static void a(WebView webView, String string, String string2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", k);
            jSONObject.put("id", (Object)string2);
            jSONObject.put("data", (Object)new JSONObject());
            i.a().a(webView, string, Base64.encodeToString((byte[])jSONObject.toString().getBytes(), (int)2));
            return;
        }
        catch (Exception exception) {
            b.b().a(webView, exception.getMessage());
            h.a("BTBaseView", exception.getMessage());
            return;
        }
    }

    public int a(String string) {
        return o.a(this.b.getApplicationContext(), string, "drawable");
    }

    protected void a() {
    }

    public abstract void a(Context var1);

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
        return o.a(this.b.getApplicationContext(), string, "id");
    }

    public int c(String string) {
        return o.a(this.b.getApplicationContext(), string, "layout");
    }

    public f.f.a.e.e.a getCampaign() {
        return this.c;
    }

    public String getInstanceId() {
        return this.e;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams)layoutParams;
        }
        return null;
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

    public Rect getRect() {
        return this.h;
    }

    public String getUnitId() {
        return this.d;
    }

    public int getViewHeight() {
        return this.j;
    }

    public int getViewWidth() {
        return this.i;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onConfigurationChanged:");
        stringBuilder.append(configuration.orientation);
        Log.d((String)"BTBaseView", (String)stringBuilder.toString());
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getRawX();
        motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setCampaign(f.f.a.e.e.a a2) {
        this.c = a2;
    }

    public void setInstanceId(String string) {
        this.e = string;
    }

    public void setRect(Rect rect) {
        this.h = rect;
    }

    public void setUnitId(String string) {
        this.d = string;
    }
}

