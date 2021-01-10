/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager
 *  android.webkit.DownloadListener
 *  android.webkit.WebView
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  com.mintegral.msdk.base.common.report.c
 *  com.mintegral.msdk.video.module.b
 *  com.mintegral.msdk.video.module.e$a
 *  com.mintegral.msdk.video.module.e$b
 *  com.mintegral.msdk.video.module.e$c
 *  com.mintegral.msdk.video.module.e$e
 *  com.mintegral.msdk.video.module.e$f
 *  com.mintegral.msdk.video.module.e$g
 *  com.mintegral.msdk.video.module.j.b
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  org.json.JSONObject
 */
package com.mintegral.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mintegral.msdk.video.module.e;
import f.f.a.e.e.n;
import f.f.a.e.f.h;
import f.f.a.e.f.r;
import f.f.a.e.g.a;
import f.f.a.r.b.l;
import f.f.a.s.f.i;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class e
extends com.mintegral.msdk.video.module.b
implements f.f.a.k.f.c,
l {
    private boolean A = false;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    Handler F;
    boolean G;
    protected View j;
    protected RelativeLayout k;
    protected ImageView l;
    protected f.f.a.k.g.b m;
    protected Handler n = new Handler();
    protected String o;
    protected boolean p = false;
    protected boolean q = false;
    private boolean r = false;
    private int s = 1;
    private boolean t = false;
    private int u = 1;
    protected String v;
    private long w = 0L;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;

    public e(Context context) {
        super(context);
        this.F = new a((e)this, Looper.getMainLooper());
        this.G = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static /* synthetic */ void a(e e2, long l2, boolean bl) {
        String string2;
        void var4_29;
        block18 : {
            String string3;
            int n2;
            String string4;
            block22 : {
                String string5;
                block19 : {
                    n n3;
                    String string6;
                    block21 : {
                        block20 : {
                            String string7;
                            int n4;
                            int n5;
                            String string8;
                            try {
                                if (e2.t) {
                                    h.b("MintegralBaseView", "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                                    return;
                                }
                                e2.t = true;
                                boolean bl2 = r.b(e2.c.i1());
                                string6 = "1";
                                string7 = bl2 && e2.c.i1().contains((CharSequence)".zip") ? string6 : "2";
                            }
                            catch (Throwable throwable) {
                                string2 = "MintegralBaseView";
                                break block18;
                            }
                            if (bl) {
                                string8 = "ready timeout";
                                n5 = 2;
                                n4 = 12;
                            } else if (e2.u == 2) {
                                string8 = "ready no";
                                n5 = 3;
                                n4 = 11;
                            } else {
                                string8 = "ready yes";
                                n5 = 1;
                                n4 = 10;
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(l2);
                            stringBuilder.append("");
                            String string9 = stringBuilder.toString();
                            String string10 = e2.c.i1();
                            String string11 = e2.c.e();
                            String string12 = e2.v;
                            int n6 = n4;
                            int n7 = n5;
                            string5 = string8;
                            n2 = n4;
                            string4 = string7;
                            try {
                                n3 = new n("2000043", n6, string9, string10, string11, string12, string5, string4);
                                try {
                                    if (e2.c.m() == 287) {
                                        n3.f("3");
                                    } else if (e2.c.m() == 94) {
                                        n3.f(string6);
                                    } else if (e2.c.m() == 42) {
                                        n3.f("2");
                                    }
                                }
                                catch (NullPointerException nullPointerException) {
                                    nullPointerException.printStackTrace();
                                }
                                n3.i(e2.c.M0());
                                com.mintegral.msdk.base.common.report.c.a((n)n3, (Context)f.f.a.e.c.a.i().e(), (String)e2.v);
                                if (e2.u() || n7 != 1) break block19;
                                n3.c(n7);
                                n3.n(String.valueOf((long)l2));
                                n3.e(string4);
                                n3.d(e2.c.i1());
                                if (!r.b(e2.c.i1()) || !e2.c.i1().contains((CharSequence)".zip")) break block20;
                                break block21;
                            }
                            catch (Throwable throwable) {
                                string2 = "MintegralBaseView";
                                break block18;
                            }
                        }
                        string6 = "2";
                    }
                    n3.e(string6);
                    n3.k(e2.c.e());
                    string3 = string5;
                    n3.m(string3);
                    int n8 = e2.c.m1() ? n.D : n.E;
                    n3.a(n8);
                    com.mintegral.msdk.base.common.report.c.c((n)n3, (Context)e2.b.getApplicationContext(), (String)e2.v);
                    break block22;
                }
                string3 = string5;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("insertEndCardReadyState result:");
            stringBuilder.append(n2);
            stringBuilder.append(" endCardLoadTime:");
            stringBuilder.append(l2);
            stringBuilder.append(" endcardurl:");
            stringBuilder.append(e2.c.i1());
            stringBuilder.append("  id:");
            stringBuilder.append(e2.c.e());
            stringBuilder.append("  unitid:");
            stringBuilder.append(e2.v);
            stringBuilder.append("  reason:");
            stringBuilder.append(string3);
            stringBuilder.append("  type:");
            stringBuilder.append(string4);
            String string13 = stringBuilder.toString();
            string2 = "MintegralBaseView";
            try {
                h.b(string2, string13);
                return;
            }
            catch (Throwable throwable) {}
        }
        h.b(string2, var4_29.getMessage(), (Throwable)var4_29);
    }

    static /* synthetic */ boolean a(e e2) {
        return e2.x;
    }

    static /* synthetic */ boolean a(e e2, boolean bl) {
        e2.y = bl;
        return bl;
    }

    static /* synthetic */ long b(e e2) {
        return e2.w;
    }

    static /* synthetic */ void c(e e2) {
        f.f.a.e.e.a a2 = e2.c;
        if (a2 != null && a2.m1()) {
            int n2 = e2.getResources().getConfiguration().orientation;
            String string2 = "undefined";
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 == 2) {
                        string2 = "landscape";
                    }
                } else {
                    string2 = "portrait";
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("orientation", (Object)string2);
                jSONObject.put("locked", (Object)"true");
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"placementType", (Object)"Interstitial");
            hashMap.put((Object)"state", (Object)"default");
            hashMap.put((Object)"viewable", (Object)"true");
            hashMap.put((Object)"currentAppOrientation", (Object)jSONObject);
            if (e2.getContext() instanceof Activity) {
                float f2 = f.f.a.e.f.d.u(e2.getContext());
                float f3 = f.f.a.e.f.d.v(e2.getContext());
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity)e2.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                float f4 = displayMetrics.widthPixels;
                float f5 = displayMetrics.heightPixels;
                f.f.a.k.f.b.a().a((WebView)e2.m, f2, f3);
                f.f.a.k.f.b.a().b(e2.m, f4, f5);
            }
            f.f.a.k.f.b b2 = f.f.a.k.f.b.a();
            f.f.a.k.g.b b3 = e2.m;
            b2.a(b3, b3.getLeft(), e2.m.getTop(), e2.m.getWidth(), e2.m.getHeight());
            f.f.a.k.f.b b4 = f.f.a.k.f.b.a();
            f.f.a.k.g.b b5 = e2.m;
            b4.b(b5, b5.getLeft(), e2.m.getTop(), e2.m.getWidth(), e2.m.getHeight());
            f.f.a.k.f.b.a().a((WebView)e2.m, (Map<String, Object>)hashMap);
            f.f.a.k.f.b.a().a((WebView)e2.m, f.f.a.k.f.e.f);
            f.f.a.k.f.b.a().a(e2.m);
        }
    }

    static /* synthetic */ boolean d(e e2) {
        return e2.D;
    }

    public void a(double d2) {
        f.f.a.k.f.b.a().a((WebView)this.m, d2);
    }

    public void a(Context context) {
        int n2 = this.d("mintegral_reward_endcard_h5");
        if (n2 >= 0) {
            View view = this.j = this.d.inflate(n2, null);
            this.l = (ImageView)view.findViewById(this.c("mintegral_windwv_close"));
            this.k = (RelativeLayout)view.findViewById(this.c("mintegral_windwv_content_rl"));
            this.m = new f.f.a.k.g.b(this.getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            this.m.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            this.k.addView((View)this.m);
            View[] arrview = new View[]{this.l, this.m};
            this.g = this.a(arrview);
            this.addView(this.j, (ViewGroup.LayoutParams)this.q());
            this.i();
            this.t();
        }
    }

    public void a(Configuration configuration) {
        super.a(configuration);
        this.b(configuration);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(f.f.a.r.b.k.c c2) {
        block15 : {
            String string2;
            block10 : {
                int n2;
                String string3;
                block13 : {
                    block11 : {
                        int n3;
                        String[] arrstring;
                        block12 : {
                            block14 : {
                                string2 = this.p();
                                if (!this.g || this.c == null || TextUtils.isEmpty((CharSequence)string2)) break block14;
                                a.e e2 = new a.e(this.c);
                                e2.a(this.c.c());
                                this.m.setDownloadListener((DownloadListener)e2);
                                this.m.setCampaignId(this.c.e());
                                this.setCloseVisible(8);
                                this.m.setApiManagerJSFactory(c2);
                                if (this.c.m1()) {
                                    this.m.setMraidObject(this);
                                }
                                this.m.setWebViewListener(new f.f.a.k.e.b((e)this){
                                    final /* synthetic */ e a;
                                    {
                                        this.a = e2;
                                    }

                                    public final void a(WebView webView, int n2, String string2, String string3) {
                                        super.a(webView, n2, string2, string3);
                                        h.d("========", "===========onReceivedError");
                                        if (!this.a.q) {
                                            StringBuilder stringBuilder = new StringBuilder();
                                            stringBuilder.append("onReceivedError,url:");
                                            stringBuilder.append(string3);
                                            h.a("MintegralBaseView", stringBuilder.toString());
                                            com.mintegral.msdk.video.module.j.b b2 = this.a.f;
                                            StringBuilder stringBuilder2 = new StringBuilder();
                                            stringBuilder2.append("onReceivedError ");
                                            stringBuilder2.append(n2);
                                            stringBuilder2.append(string2);
                                            b2.a(118, (Object)stringBuilder2.toString());
                                            this.a.e(string2);
                                            this.a.q = true;
                                        }
                                    }

                                    public final void a(WebView webView, String string2) {
                                        super.a(webView, string2);
                                        StringBuilder stringBuilder = new StringBuilder();
                                        stringBuilder.append("===========finish+");
                                        stringBuilder.append(string2);
                                        h.d("========", stringBuilder.toString());
                                        e e2 = this.a;
                                        if (!e2.q) {
                                            e2.p = true;
                                            StringBuilder stringBuilder2 = new StringBuilder();
                                            stringBuilder2.append("onPageFinished,url:");
                                            stringBuilder2.append(string2);
                                            h.a("MintegralBaseView", stringBuilder2.toString());
                                            this.a.f.a(100, (Object)"");
                                            if (this.a.c != null) {
                                                n n2 = new n();
                                                n2.i(this.a.c.M0());
                                                n2.k(this.a.c.e());
                                                n2.c(1);
                                                n2.n(String.valueOf((long)(System.currentTimeMillis() - e.b(this.a))));
                                                n2.d(this.a.c.i1());
                                                String string3 = r.b(this.a.c.i1()) && this.a.c.i1().contains((CharSequence)".zip") ? "1" : "2";
                                                n2.e(string3);
                                                n2.m("");
                                                if (this.a.c.m() == 287) {
                                                    n2.f("3");
                                                } else if (this.a.c.m() == 94) {
                                                    n2.f("1");
                                                } else if (this.a.c.m() == 42) {
                                                    n2.f("2");
                                                }
                                                int n3 = this.a.c.m1() ? n.D : n.E;
                                                n2.a(n3);
                                                com.mintegral.msdk.base.common.report.c.c((n)n2, (Context)this.a.b.getApplicationContext(), (String)this.a.v);
                                            }
                                            this.a.f.a(120, (Object)"");
                                        }
                                    }
                                });
                                if (TextUtils.isEmpty((CharSequence)this.c.r0())) {
                                    try {
                                        this.w = System.currentTimeMillis();
                                        String string4 = this.c.i1();
                                        f.f.a.s.d.c c3 = f.f.a.s.d.b.c().a(f.f.a.e.c.a.i().f(), this.v);
                                        if (!this.r || !r.b(string4) || !string4.contains((CharSequence)"wfr=1") && (c3 == null || c3.n() <= 0)) break block10;
                                        h.d("MintegralBaseView", "\u9700\u8981\u4e0a\u62a5endcard\u52a0\u8f7d\u65f6\u95f4");
                                        if (string4.contains((CharSequence)"wfr=1")) {
                                            arrstring = string4.split("&");
                                            if (arrstring == null || arrstring.length <= 0) break block11;
                                            n3 = arrstring.length;
                                            break block12;
                                        }
                                        if (c3 == null || c3.n() <= 0) break block11;
                                        n2 = c3.n();
                                        break block13;
                                    }
                                    catch (Throwable throwable) {
                                        h.b("MintegralBaseView", throwable.getMessage(), throwable);
                                        break block10;
                                    }
                                }
                                break block10;
                            }
                            this.f.a(101, (Object)"");
                            break block15;
                        }
                        for (int i2 = 0; i2 < n3; ++i2) {
                            String string5 = arrstring[i2];
                            if (!r.b(string5) || !string5.contains((CharSequence)"to") || string5.split("=") == null || string5.split("=").length <= 0) continue;
                            n2 = f.f.a.e.f.l.a(string5.split("=")[1]);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("\u4eceurl\u83b7\u53d6\u7684waitingtime:");
                            stringBuilder.append(n2);
                            h.b("MintegralBaseView", stringBuilder.toString());
                            break block13;
                        }
                    }
                    n2 = 20;
                }
                if (n2 >= 0) {
                    this.e(n2);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("\u5f00\u542fexcuteEndCardShowTask:");
                    stringBuilder.append(n2);
                    string3 = stringBuilder.toString();
                } else {
                    this.e(20);
                    string3 = "\u5f00\u542fexcuteEndCardShowTask: 20s def";
                }
                h.b("MintegralBaseView", string3);
            }
            this.setHtmlSource(i.a().a(string2));
            if (TextUtils.isEmpty((CharSequence)this.o)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("load url:");
                stringBuilder.append(string2);
                h.a("MintegralBaseView", stringBuilder.toString());
                this.m.loadUrl(string2);
            } else {
                h.a("MintegralBaseView", "load html...");
                this.m.loadDataWithBaseURL(string2, this.o, "text/html", "UTF-8", null);
            }
        }
        this.G = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(Configuration configuration) {
        String string2;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            int n2 = configuration.orientation;
            string2 = n2 == 2 ? "landscape" : "portrait";
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        jSONObject.put("orientation", (Object)string2);
        String string3 = Base64.encodeToString((byte[])jSONObject.toString().getBytes(), (int)2);
        f.f.a.k.g.i.a().a(this.m, "orientation", string3);
    }

    public void d(int n2) {
    }

    public void e(int n2) {
        this.n.postDelayed((Runnable)new g((e)this, n2), (long)(n2 * 1000));
    }

    public void e(String string2) {
        if (this.c != null && !this.q) {
            n n2 = new n();
            n2.i(this.c.M0());
            n2.k(this.c.e());
            n2.c(3);
            n2.n(String.valueOf((long)(System.currentTimeMillis() - this.w)));
            n2.d(this.c.i1());
            String string3 = r.b(this.c.i1()) && this.c.i1().contains((CharSequence)".zip") ? "1" : "2";
            n2.e(string3);
            n2.m(string2);
            if (this.c.m() == 287) {
                n2.f("3");
            } else if (this.c.m() == 94) {
                n2.f("1");
            } else if (this.c.m() == 42) {
                n2.f("2");
            }
            int n3 = this.c.m1() ? n.D : n.E;
            n2.a(n3);
            com.mintegral.msdk.base.common.report.c.c((n)n2, (Context)this.b.getApplicationContext(), (String)this.v);
        }
    }

    public f.f.a.e.e.a getMraidCampaign() {
        return this.c;
    }

    protected final void i() {
        super.i();
        if (this.g) {
            this.l.setOnClickListener((View.OnClickListener)new b(this));
        }
    }

    protected void onVisibilityChanged(View view, int n2) {
        RelativeLayout.super.onVisibilityChanged(view, n2);
        if (n2 == 0 && !this.E) {
            this.E = true;
            this.setFocusableInTouchMode(true);
            this.requestFocus();
            this.requestFocusFromTouch();
        }
    }

    public void onWindowFocusChanged(boolean bl) {
        RelativeLayout.super.onWindowFocusChanged(bl);
        f.f.a.e.e.a a2 = this.c;
        if (a2 != null && a2.m1()) {
            f.f.a.k.f.b b2;
            f.f.a.k.g.b b3;
            String string2;
            if (bl) {
                b2 = f.f.a.k.f.b.a();
                b3 = this.m;
                string2 = "true";
            } else {
                b2 = f.f.a.k.f.b.a();
                b3 = this.m;
                string2 = "false";
            }
            b2.b(b3, string2);
        }
    }

    protected String p() {
        f.f.a.e.e.a a2 = this.c;
        if (a2 != null) {
            this.x = true;
            if (a2.m1()) {
                this.r = false;
                String string2 = this.c.r0();
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    File file = new File(string2);
                    try {
                        if (file.exists() && file.isFile() && file.canRead()) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Mraid file ");
                            stringBuilder.append(string2);
                            h.b("MintegralBaseView", stringBuilder.toString());
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("file:////");
                            stringBuilder2.append(string2);
                            return stringBuilder2.toString();
                        }
                        h.b("MintegralBaseView", "Mraid file not found. Will use endcard url.");
                        String string3 = this.c.J();
                        return string3;
                    }
                    catch (Throwable throwable) {
                        if (f.f.a.a.a) {
                            throwable.printStackTrace();
                            return string2;
                        }
                    }
                } else {
                    string2 = this.c.J();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("getURL playable=false endscreenurl\u515c\u5e95:");
                    stringBuilder.append(string2);
                    h.d("MintegralBaseView", stringBuilder.toString());
                }
                return string2;
            }
            String string4 = this.c.i1();
            if (!r.a(string4)) {
                this.r = true;
                String string5 = f.f.a.s.f.g.a().a(string4);
                if (TextUtils.isEmpty((CharSequence)string5)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("getURL playable=true endcard\u672c\u5730\u8d44\u6e90\u5730\u5740\u4e3a\u7a7a\u62ff\u670d\u52a1\u7aef\u5730\u5740:");
                    stringBuilder.append(string4);
                    h.b("MintegralBaseView", stringBuilder.toString());
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(string4);
                    stringBuilder3.append("&native_adtype=");
                    stringBuilder3.append(this.c.m());
                    return stringBuilder3.toString();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("getURL playable=true \u8d44\u6e90\u4e0d\u4e3a\u7a7aendcard\u5730\u5740:");
                stringBuilder.append(string5);
                h.b("MintegralBaseView", stringBuilder.toString());
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append(string5);
                stringBuilder4.append("&native_adtype=");
                stringBuilder4.append(this.c.m());
                return stringBuilder4.toString();
            }
            this.r = false;
            String string6 = this.c.J();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getURL playable=false endscreenurl\u515c\u5e95:");
            stringBuilder.append(string6);
            h.d("MintegralBaseView", stringBuilder.toString());
            return string6;
        }
        this.x = false;
        h.d("MintegralBaseView", "getURL playable=false url\u4e3a\u7a7a");
        return null;
    }

    protected RelativeLayout.LayoutParams q() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public boolean r() {
        ImageView imageView = this.l;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public void s() {
        if (!this.r && this.s > -1) {
            this.n.postDelayed((Runnable)new f(this), (long)(1000 * this.s));
        }
    }

    public void setCloseDelayShowTime(int n2) {
        this.s = n2;
    }

    public void setCloseVisible(int n2) {
        if (this.g) {
            this.l.setVisibility(n2);
        }
    }

    public void setCloseVisibleForMraid(int n2) {
        if (this.g) {
            this.D = true;
            if (n2 == 4) {
                this.l.setImageDrawable((Drawable)new ColorDrawable(16711680));
            } else {
                this.l.setImageResource(this.b("mintegral_reward_close"));
            }
            this.l.setVisibility(0);
        }
    }

    public void setError(boolean bl) {
        this.q = bl;
    }

    public void setHtmlSource(String string2) {
        this.o = string2;
    }

    public void setLoadPlayable(boolean bl) {
        this.G = bl;
    }

    public void setPlayCloseBtnTm(int n2) {
    }

    public void setUnitId(String string2) {
        this.v = string2;
    }

    protected void t() {
        if (this.g) {
            this.n();
        }
    }

    public boolean u() {
        return this.p;
    }

    public void v() {
        if (this.y || this.z && this.A || !this.z && this.B && !this.G || !this.z && this.C && this.G) {
            this.w();
        }
    }

    public void w() {
        try {
            if (this.m != null) {
                f.f.a.k.g.i.a().a(this.m, "onSystemDestory", "");
                new Thread((Runnable)new c(this)).start();
                return;
            }
            this.f.a(103, (Object)"");
            this.f.a(119, (Object)"webview is null when closing webview");
            return;
        }
        catch (Exception exception) {
            this.f.a(103, (Object)"");
            com.mintegral.msdk.video.module.j.b b2 = this.f;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("close webview exception");
            stringBuilder.append(exception.getMessage());
            b2.a(119, (Object)stringBuilder.toString());
            h.a("MintegralBaseView", exception.getMessage());
            return;
        }
    }

    public void x() {
        Handler handler;
        Handler handler2 = this.n;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        if ((handler = this.F) != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.k.removeAllViews();
        this.m.e();
        this.m = null;
    }

    public void y() {
        f.f.a.k.g.b b2 = this.m;
        if (b2 != null) {
            b2.post((Runnable)new e(this));
        }
    }
}

