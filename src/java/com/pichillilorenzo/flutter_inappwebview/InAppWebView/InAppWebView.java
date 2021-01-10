/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.animation.PropertyValuesHolder
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Point
 *  android.net.http.SslCertificate
 *  android.net.http.SslCertificate$DName
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.print.PrintAttributes
 *  android.print.PrintAttributes$Builder
 *  android.print.PrintDocumentAdapter
 *  android.print.PrintJob
 *  android.print.PrintManager
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.ContextMenu
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.webkit.CookieManager
 *  android.webkit.DownloadListener
 *  android.webkit.ValueCallback
 *  android.webkit.WebBackForwardList
 *  android.webkit.WebChromeClient
 *  android.webkit.WebHistoryItem
 *  android.webkit.WebSettings
 *  android.webkit.WebSettings$LayoutAlgorithm
 *  android.webkit.WebStorage
 *  android.webkit.WebView
 *  android.webkit.WebView$FindListener
 *  android.webkit.WebView$HitTestResult
 *  android.webkit.WebViewClient
 *  android.widget.AbsoluteLayout
 *  android.widget.AbsoluteLayout$LayoutParams
 *  android.widget.HorizontalScrollView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.webkit.c
 *  androidx.webkit.d
 *  androidx.webkit.f
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$a
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$b
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$c
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$d
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$e
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$f
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$g
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$h
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$i
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$j
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$k
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$l
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$m
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$n
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$o
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$p
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$q
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$r
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$s
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.f
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.i
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.j
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.cert.CertificateEncodingException
 *  java.security.cert.X509Certificate
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 */
package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintJob;
import android.print.PrintManager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView;
import io.flutter.plugin.common.MethodChannel;
import j.v;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;

/*
 * Exception performing whole class analysis.
 */
public final class InAppWebView
extends com.pichillilorenzo.flutter_inappwebview.InAppWebView.i {
    static Handler C;
    private Point A;
    private Point B;
    public InAppBrowserActivity e;
    public com.pichillilorenzo.flutter_inappwebview.InAppWebView.c f;
    public MethodChannel g;
    public Integer h;
    public com.pichillilorenzo.flutter_inappwebview.InAppWebView.f i;
    public com.pichillilorenzo.flutter_inappwebview.InAppWebView.e j;
    public com.pichillilorenzo.flutter_inappwebview.InAppWebView.h k;
    public f.g.a.i l;
    public com.pichillilorenzo.flutter_inappwebview.InAppWebView.g m;
    public boolean n;
    public float o;
    public f.g.a.b.d p;
    public Pattern q;
    public GestureDetector r;
    public LinearLayout s;
    public Map<String, Object> t;
    public Handler u;
    public Runnable v;
    public int w;
    public int x;
    public Runnable y;
    public int z;

    static {
        C = new Handler();
    }

    public InAppWebView(Context context) {
        super(context);
        this.n = false;
        this.o = this.getResources().getDisplayMetrics().density;
        this.p = new f.g.a.b.d();
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = new Handler(Looper.getMainLooper());
        this.x = 100;
        this.z = 100;
        this.A = new Point(0, 0);
        this.B = new Point(0, 0);
    }

    public InAppWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = false;
        this.o = this.getResources().getDisplayMetrics().density;
        this.p = new f.g.a.b.d();
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = new Handler(Looper.getMainLooper());
        this.x = 100;
        this.z = 100;
        this.A = new Point(0, 0);
        this.B = new Point(0, 0);
    }

    public InAppWebView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.n = false;
        this.o = this.getResources().getDisplayMetrics().density;
        this.p = new f.g.a.b.d();
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = new Handler(Looper.getMainLooper());
        this.x = 100;
        this.z = 100;
        this.A = new Point(0, 0);
        this.B = new Point(0, 0);
    }

    public InAppWebView(Context context, Object object, Object object2, Integer n2, com.pichillilorenzo.flutter_inappwebview.InAppWebView.g g2, Map<String, Object> map, View view) {
        super(context, view);
        this.n = false;
        this.o = this.getResources().getDisplayMetrics().density;
        this.p = new f.g.a.b.d();
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = new Handler(Looper.getMainLooper());
        this.x = 100;
        this.z = 100;
        this.A = new Point(0, 0);
        this.B = new Point(0, 0);
        if (object instanceof InAppBrowserActivity) {
            this.e = (InAppBrowserActivity)object;
        } else if (object instanceof com.pichillilorenzo.flutter_inappwebview.InAppWebView.c) {
            this.f = (com.pichillilorenzo.flutter_inappwebview.InAppWebView.c)object;
        }
        InAppBrowserActivity inAppBrowserActivity = this.e;
        MethodChannel methodChannel = inAppBrowserActivity != null ? inAppBrowserActivity.d : this.f.c;
        this.g = methodChannel;
        this.h = n2;
        this.m = g2;
        this.t = map;
        f.g.a.q.f.registerForContextMenu((View)this);
    }

    static /* synthetic */ Point a(InAppWebView inAppWebView) {
        return inAppWebView.A;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static Map<String, Object> a(SslCertificate var0) {
        block3 : {
            var1_1 = null;
            if (var0 == null) return null;
            var2_2 = var0.getIssuedBy();
            var3_3 = new HashMap();
            var3_3.put((Object)"CName", (Object)var2_2.getCName());
            var3_3.put((Object)"DName", (Object)var2_2.getDName());
            var3_3.put((Object)"OName", (Object)var2_2.getOName());
            var3_3.put((Object)"UName", (Object)var2_2.getUName());
            var8_4 = var0.getIssuedTo();
            var9_5 = new HashMap();
            var9_5.put((Object)"CName", (Object)var8_4.getCName());
            var9_5.put((Object)"DName", (Object)var8_4.getDName());
            var9_5.put((Object)"OName", (Object)var8_4.getOName());
            var9_5.put((Object)"UName", (Object)var8_4.getUName());
            if (Build.VERSION.SDK_INT < 29) ** GOTO lbl22
            try {
                var21_6 = var0.getX509Certificate();
                var1_1 = null;
                if (var21_6 != null) {
                    var1_1 = var21_6.getEncoded();
                }
                break block3;
lbl22: // 1 sources:
                var1_1 = f.g.a.r.a(var0).getEncoded();
            }
            catch (CertificateEncodingException var14_7) {
                var14_7.printStackTrace();
            }
        }
        var15_8 = new HashMap();
        var15_8.put((Object)"issuedBy", (Object)var3_3);
        var15_8.put((Object)"issuedTo", (Object)var9_5);
        var15_8.put((Object)"validNotAfterDate", (Object)var0.getValidNotAfterDate().getTime());
        var15_8.put((Object)"validNotBeforeDate", (Object)var0.getValidNotBeforeDate().getTime());
        var15_8.put((Object)"x509Certificate", (Object)var1_1);
        return var15_8;
    }

    private void n() {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies((ValueCallback)new p(this));
            return;
        }
        CookieManager.getInstance().removeAllCookie();
    }

    private void o() {
        WebView.HitTestResult hitTestResult = this.getHitTestResult();
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"type", (Object)hitTestResult.getType());
        hashMap.put((Object)"extra", (Object)hitTestResult.getExtra());
        HashMap hashMap2 = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.e;
        if (inAppBrowserActivity != null) {
            hashMap2.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap2.put((Object)"hitTestResult", (Object)hashMap);
        this.g.invokeMethod("onCreateContextMenu", (Object)hashMap2);
    }

    public ActionMode a(ActionMode actionMode, ActionMode.Callback callback) {
        boolean bl;
        if (this.s != null) {
            this.f();
            bl = true;
        } else {
            bl = false;
        }
        if (actionMode == null) {
            return null;
        }
        Menu menu = actionMode.getMenu();
        if (this.m.x.booleanValue()) {
            menu.clear();
            return actionMode;
        }
        this.s = (LinearLayout)LayoutInflater.from((Context)this.getContext()).inflate(f.g.a.n.floating_action_mode, (ViewGroup)this, false);
        LinearLayout linearLayout = (LinearLayout)((HorizontalScrollView)this.s.getChildAt(0)).getChildAt(0);
        ArrayList arrayList = new ArrayList();
        com.pichillilorenzo.flutter_inappwebview.InAppWebView.a a2 = new com.pichillilorenzo.flutter_inappwebview.InAppWebView.a();
        Map<String, Object> map = this.t;
        if (map != null) {
            arrayList = (List)map.get((Object)"menuItems");
            Map map2 = (Map)this.t.get((Object)"options");
            if (map2 != null) {
                a2.a((Map<String, Object>)map2);
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = arrayList;
        Boolean bl2 = a2.a;
        if (bl2 == null || !bl2.booleanValue()) {
            for (int i2 = 0; i2 < menu.size(); ++i2) {
                MenuItem menuItem = menu.getItem(i2);
                int n2 = menuItem.getItemId();
                String string2 = menuItem.getTitle().toString();
                TextView textView = (TextView)LayoutInflater.from((Context)this.getContext()).inflate(f.g.a.n.floating_action_mode_item, (ViewGroup)this, false);
                textView.setText((CharSequence)string2);
                b b2 = new b((InAppWebView)this, callback, actionMode, menuItem, n2, string2);
                textView.setOnClickListener((View.OnClickListener)b2);
                if (this.s == null) continue;
                linearLayout.addView((View)textView);
            }
        }
        for (Map map3 : arrayList2) {
            int n3 = (Integer)map3.get((Object)"androidId");
            String string3 = (String)map3.get((Object)"title");
            TextView textView = (TextView)LayoutInflater.from((Context)this.getContext()).inflate(f.g.a.n.floating_action_mode_item, (ViewGroup)this, false);
            textView.setText((CharSequence)string3);
            textView.setOnClickListener((View.OnClickListener)new c((InAppWebView)this, n3, string3));
            if (this.s == null) continue;
            linearLayout.addView((View)textView);
        }
        Point point = this.B;
        int n4 = point != null ? point.x : 0;
        Point point2 = this.B;
        int n5 = 0;
        if (point2 != null) {
            n5 = point2.y;
        }
        this.A = new Point(n4, n5);
        LinearLayout linearLayout2 = this.s;
        if (linearLayout2 != null) {
            Runnable runnable;
            linearLayout2.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)new d((InAppWebView)this, n4, n5));
            this.addView((View)this.s, (ViewGroup.LayoutParams)new AbsoluteLayout.LayoutParams(-2, -2, n4, n5));
            if (bl) {
                InAppWebView.super.o();
            }
            if ((runnable = this.y) != null) {
                runnable.run();
            }
        }
        menu.clear();
        return actionMode;
    }

    public void a() {
        Runnable runnable;
        Integer n2 = this.h;
        if (n2 != null && com.pichillilorenzo.flutter_inappwebview.InAppWebView.e.j.containsKey((Object)n2)) {
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.e.j.remove((Object)this.h);
        }
        this.u.removeCallbacksAndMessages(null);
        C.removeCallbacksAndMessages(null);
        this.removeJavascriptInterface("flutter_inappwebview");
        this.removeAllViews();
        Runnable runnable2 = this.y;
        if (runnable2 != null) {
            this.removeCallbacks(runnable2);
        }
        if ((runnable = this.v) != null) {
            this.removeCallbacks(runnable);
        }
        super.a();
    }

    public void a(int n2, int n3) {
        int n4 = this.getWidth();
        this.getHeight();
        int n5 = this.s.getWidth();
        int n6 = this.s.getHeight();
        int n7 = n2 - n5 / 2;
        if (n7 < 0) {
            n7 = 0;
        } else if (n7 + n5 > n4) {
            n7 = n4 - n5;
        }
        float f2 = (float)n3 - 1.5f * (float)n6;
        if (f2 < 0.0f) {
            f2 = n3 + n6;
        }
        this.updateViewLayout((View)this.s, (ViewGroup.LayoutParams)new AbsoluteLayout.LayoutParams(-2, -2, n7, (int)f2 + this.getScrollY()));
        this.u.post((Runnable)new e((InAppWebView)this));
    }

    public void a(ValueCallback<String> valueCallback) {
        this.evaluateJavascript("(function(){  var txt;  if (window.getSelection) {    txt = window.getSelection().toString();  } else if (window.document.getSelection) {    txt = window.document.getSelection().toString();  } else if (window.document.selection) {    txt = window.document.selection.createRange().text;  }  return txt;})();", (ValueCallback)new g((InAppWebView)this, valueCallback));
    }

    public void a(com.pichillilorenzo.flutter_inappwebview.InAppWebView.g g2, HashMap<String, Object> hashMap) {
        Boolean bl;
        Boolean bl2;
        Boolean bl3;
        Integer n2;
        Boolean bl4;
        Boolean bl5;
        Boolean bl6;
        Boolean bl7;
        Boolean bl8;
        Boolean bl9;
        Boolean bl10;
        Boolean bl11;
        Boolean bl12;
        Boolean bl13;
        Boolean bl14;
        Boolean bl15;
        Boolean bl16;
        Boolean bl17;
        Boolean bl18;
        WebSettings.LayoutAlgorithm layoutAlgorithm;
        Boolean bl19;
        Boolean bl20;
        Boolean bl21;
        Boolean bl22;
        Boolean bl23;
        Boolean bl24;
        Boolean bl25;
        Boolean bl26;
        Integer n3;
        Boolean bl27;
        Boolean bl28;
        Integer n4;
        Boolean bl29;
        Boolean bl30;
        Boolean bl31;
        Boolean bl32;
        Boolean bl33;
        Boolean bl34;
        String string2;
        Boolean bl35;
        Boolean bl36;
        Boolean bl37;
        Boolean bl38;
        Boolean bl39;
        Boolean bl40;
        Boolean bl41;
        WebSettings.LayoutAlgorithm layoutAlgorithm2;
        Boolean bl42;
        Boolean bl43;
        Boolean bl44;
        Boolean bl45;
        Boolean bl46;
        String string3;
        Boolean bl47;
        Boolean bl48;
        Boolean bl49;
        Boolean bl50;
        Boolean bl51;
        Boolean bl52;
        Boolean bl53;
        Boolean bl54;
        Boolean bl55;
        Boolean bl56;
        Boolean bl57;
        Boolean bl58;
        Boolean bl59;
        Integer n5;
        Boolean bl60;
        Boolean bl61;
        Boolean bl62;
        Boolean bl63;
        Boolean bl64;
        Boolean bl65;
        Boolean bl66;
        Boolean bl67;
        Boolean bl68;
        Boolean bl69;
        Boolean bl70;
        Boolean bl71;
        Boolean bl72;
        Boolean bl73;
        Boolean bl74;
        WebSettings webSettings = this.getSettings();
        if (hashMap.get((Object)"javaScriptEnabled") != null && (bl51 = this.m.g) != (bl31 = g2.g)) {
            webSettings.setJavaScriptEnabled(bl31.booleanValue());
        }
        if (hashMap.get((Object)"debuggingEnabled") != null && (bl52 = this.m.h) != (bl58 = g2.h) && Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled((boolean)bl58);
        }
        Object object = hashMap.get((Object)"useShouldInterceptAjaxRequest");
        String string4 = "true";
        if (object != null && (bl35 = this.m.q) != (bl4 = g2.q)) {
            String string5 = bl4 != false ? string4 : "false";
            String string6 = "window._flutter_inappwebview_useShouldInterceptAjaxRequest = $PLACEHOLDER_VALUE;".replace((CharSequence)"$PLACEHOLDER_VALUE", (CharSequence)string5);
            if (Build.VERSION.SDK_INT >= 19) {
                this.evaluateJavascript(string6, null);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("javascript:");
                stringBuilder.append(string6);
                this.loadUrl(stringBuilder.toString());
            }
        }
        if (hashMap.get((Object)"useShouldInterceptFetchRequest") != null && (bl26 = this.m.r) != (bl67 = g2.r)) {
            String string7 = bl67 != false ? string4 : "false";
            String string8 = "window._flutter_inappwebview_useShouldInterceptFetchRequest = $PLACEHOLDER_VALUE;".replace((CharSequence)"$PLACEHOLDER_VALUE", (CharSequence)string7);
            if (Build.VERSION.SDK_INT >= 19) {
                this.evaluateJavascript(string8, null);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("javascript:");
                stringBuilder.append(string8);
                this.loadUrl(stringBuilder.toString());
            }
        }
        if (hashMap.get((Object)"useOnLoadResource") != null && (bl22 = this.m.b) != (bl34 = g2.b)) {
            if (!bl34.booleanValue()) {
                string4 = "false";
            }
            String string9 = "window._flutter_inappwebview_useOnLoadResource = $PLACEHOLDER_VALUE;".replace((CharSequence)"$PLACEHOLDER_VALUE", (CharSequence)string4);
            if (Build.VERSION.SDK_INT >= 19) {
                this.evaluateJavascript(string9, null);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("javascript:");
                stringBuilder.append(string9);
                this.loadUrl(stringBuilder.toString());
            }
        }
        if (hashMap.get((Object)"javaScriptCanOpenWindowsAutomatically") != null && (bl6 = this.m.i) != (bl59 = g2.i)) {
            webSettings.setJavaScriptCanOpenWindowsAutomatically(bl59.booleanValue());
        }
        if (hashMap.get((Object)"builtInZoomControls") != null && (bl68 = this.m.B) != (bl73 = g2.B)) {
            webSettings.setBuiltInZoomControls(bl73.booleanValue());
        }
        if (hashMap.get((Object)"displayZoomControls") != null && (bl17 = this.m.C) != (bl15 = g2.C)) {
            webSettings.setDisplayZoomControls(bl15.booleanValue());
        }
        if (hashMap.get((Object)"safeBrowsingEnabled") != null && (bl47 = this.m.G) != (bl5 = g2.G) && Build.VERSION.SDK_INT >= 26) {
            webSettings.setSafeBrowsingEnabled(bl5.booleanValue());
        }
        if (hashMap.get((Object)"mediaPlaybackRequiresUserGesture") != null && (bl63 = this.m.j) != (bl72 = g2.j)) {
            webSettings.setMediaPlaybackRequiresUserGesture(bl72.booleanValue());
        }
        if (hashMap.get((Object)"databaseEnabled") != null && (bl55 = this.m.D) != (bl10 = g2.D)) {
            webSettings.setDatabaseEnabled(bl10.booleanValue());
        }
        if (hashMap.get((Object)"domStorageEnabled") != null && (bl16 = this.m.E) != (bl8 = g2.E)) {
            webSettings.setDomStorageEnabled(bl8.booleanValue());
        }
        if (hashMap.get((Object)"userAgent") != null && !this.m.e.equals((Object)g2.e) && !g2.e.isEmpty()) {
            webSettings.setUserAgentString(g2.e);
        }
        if (hashMap.get((Object)"applicationNameForUserAgent") != null && !this.m.f.equals((Object)g2.f) && !g2.f.isEmpty() && Build.VERSION.SDK_INT >= 17) {
            String string10 = g2.e;
            String string11 = string10 != null && !string10.isEmpty() ? g2.e : WebSettings.getDefaultUserAgent((Context)this.getContext());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string11);
            stringBuilder.append(" ");
            stringBuilder.append(this.m.f);
            webSettings.setUserAgentString(stringBuilder.toString());
        }
        if (hashMap.get((Object)"clearCache") != null && g2.d.booleanValue()) {
            this.e();
        } else if (hashMap.get((Object)"clearSessionCache") != null && g2.A.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (hashMap.get((Object)"thirdPartyCookiesEnabled") != null && this.m.k0 != g2.k0 && Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies((WebView)this, g2.k0.booleanValue());
        }
        if (hashMap.get((Object)"useWideViewPort") != null && (bl65 = this.m.F) != (bl46 = g2.F)) {
            webSettings.setUseWideViewPort(bl46.booleanValue());
        }
        if (hashMap.get((Object)"supportZoom") != null && (bl28 = this.m.y) != (bl36 = g2.y)) {
            webSettings.setSupportZoom(bl36.booleanValue());
        }
        if (hashMap.get((Object)"textZoom") != null && !this.m.z.equals((Object)g2.z)) {
            webSettings.setTextZoom(g2.z.intValue());
        }
        if (hashMap.get((Object)"verticalScrollBarEnabled") != null && (bl53 = this.m.l) != (bl24 = g2.l)) {
            this.setVerticalScrollBarEnabled(bl24.booleanValue());
        }
        if (hashMap.get((Object)"horizontalScrollBarEnabled") != null && (bl57 = this.m.m) != (bl61 = g2.m)) {
            this.setHorizontalScrollBarEnabled(bl61.booleanValue());
        }
        if (hashMap.get((Object)"transparentBackground") != null && (bl2 = this.m.u) != (bl32 = g2.u)) {
            if (bl32.booleanValue()) {
                this.setBackgroundColor(0);
            } else {
                this.setBackgroundColor(Color.parseColor((String)"#FFFFFF"));
            }
        }
        if (!(Build.VERSION.SDK_INT < 21 || hashMap.get((Object)"mixedContentMode") == null || (n2 = this.m.H) != null && n2.equals((Object)g2.H))) {
            webSettings.setMixedContentMode(g2.H.intValue());
        }
        if (hashMap.get((Object)"supportMultipleWindows") != null && (bl12 = this.m.m0) != (bl42 = g2.m0)) {
            webSettings.setSupportMultipleWindows(bl42.booleanValue());
        }
        if (hashMap.get((Object)"useOnDownloadStart") != null && (bl54 = this.m.c) != (bl71 = g2.c)) {
            if (bl71.booleanValue()) {
                this.setDownloadListener((DownloadListener)new /* Unavailable Anonymous Inner Class!! */);
            } else {
                this.setDownloadListener(null);
            }
        }
        if (hashMap.get((Object)"allowContentAccess") != null && (bl13 = this.m.I) != (bl69 = g2.I)) {
            webSettings.setAllowContentAccess(bl69.booleanValue());
        }
        if (hashMap.get((Object)"allowFileAccess") != null && (bl18 = this.m.J) != (bl56 = g2.J)) {
            webSettings.setAllowFileAccess(bl56.booleanValue());
        }
        if (hashMap.get((Object)"allowFileAccessFromFileURLs") != null && (bl60 = this.m.K) != (bl29 = g2.K)) {
            webSettings.setAllowFileAccessFromFileURLs(bl29.booleanValue());
        }
        if (hashMap.get((Object)"allowUniversalAccessFromFileURLs") != null && (bl40 = this.m.L) != (bl19 = g2.L)) {
            webSettings.setAllowUniversalAccessFromFileURLs(bl19.booleanValue());
        }
        if (hashMap.get((Object)"cacheEnabled") != null && (bl23 = this.m.t) != (bl49 = g2.t)) {
            this.setCacheEnabled(bl49);
        }
        if (!(hashMap.get((Object)"appCachePath") == null || (string3 = this.m.M) != null && string3.equals((Object)g2.M))) {
            webSettings.setAppCachePath(g2.M);
        }
        if (hashMap.get((Object)"blockNetworkImage") != null && (bl50 = this.m.N) != (bl37 = g2.N)) {
            webSettings.setBlockNetworkImage(bl37.booleanValue());
        }
        if (hashMap.get((Object)"blockNetworkLoads") != null && (bl7 = this.m.O) != (bl27 = g2.O)) {
            webSettings.setBlockNetworkLoads(bl27.booleanValue());
        }
        if (hashMap.get((Object)"cacheMode") != null && !this.m.P.equals((Object)g2.P)) {
            webSettings.setCacheMode(g2.P.intValue());
        }
        if (hashMap.get((Object)"cursiveFontFamily") != null && !this.m.Q.equals((Object)g2.Q)) {
            webSettings.setCursiveFontFamily(g2.Q);
        }
        if (hashMap.get((Object)"defaultFixedFontSize") != null && !this.m.R.equals((Object)g2.R)) {
            webSettings.setDefaultFixedFontSize(g2.R.intValue());
        }
        if (hashMap.get((Object)"defaultFontSize") != null && !this.m.S.equals((Object)g2.S)) {
            webSettings.setDefaultFontSize(g2.S.intValue());
        }
        if (hashMap.get((Object)"defaultTextEncodingName") != null && !this.m.T.equals((Object)g2.T)) {
            webSettings.setDefaultTextEncodingName(g2.T);
        }
        if (!(Build.VERSION.SDK_INT < 24 || hashMap.get((Object)"disabledActionModeMenuItems") == null || (n3 = this.m.U) != null && n3.equals((Object)g2.U))) {
            webSettings.setDisabledActionModeMenuItems(g2.U.intValue());
        }
        if (hashMap.get((Object)"fantasyFontFamily") != null && !this.m.V.equals((Object)g2.V)) {
            webSettings.setFantasyFontFamily(g2.V);
        }
        if (hashMap.get((Object)"fixedFontFamily") != null && !this.m.W.equals((Object)g2.W)) {
            webSettings.setFixedFontFamily(g2.W);
        }
        if (hashMap.get((Object)"forceDark") != null && !this.m.X.equals((Object)g2.X) && Build.VERSION.SDK_INT >= 29) {
            webSettings.setForceDark(g2.X.intValue());
        }
        if (hashMap.get((Object)"geolocationEnabled") != null && (bl39 = this.m.Y) != (bl21 = g2.Y)) {
            webSettings.setGeolocationEnabled(bl21.booleanValue());
        }
        if (hashMap.get((Object)"layoutAlgorithm") != null && (layoutAlgorithm2 = this.m.Z) != (layoutAlgorithm = g2.Z)) {
            if (Build.VERSION.SDK_INT >= 19) {
                layoutAlgorithm.equals((Object)WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
            }
            webSettings.setLayoutAlgorithm(g2.Z);
        }
        if (hashMap.get((Object)"loadWithOverviewMode") != null && (bl44 = this.m.a0) != (bl70 = g2.a0)) {
            webSettings.setLoadWithOverviewMode(bl70.booleanValue());
        }
        if (hashMap.get((Object)"loadsImagesAutomatically") != null && (bl64 = this.m.b0) != (bl45 = g2.b0)) {
            webSettings.setLoadsImagesAutomatically(bl45.booleanValue());
        }
        if (hashMap.get((Object)"minimumFontSize") != null && !this.m.k.equals((Object)g2.k)) {
            webSettings.setMinimumFontSize(g2.k.intValue());
        }
        if (hashMap.get((Object)"minimumLogicalFontSize") != null && !this.m.c0.equals((Object)g2.c0)) {
            webSettings.setMinimumLogicalFontSize(g2.c0.intValue());
        }
        if (hashMap.get((Object)"initialScale") != null && !this.m.d0.equals((Object)g2.d0)) {
            this.setInitialScale(g2.d0.intValue());
        }
        if (hashMap.get((Object)"needInitialFocus") != null && (bl66 = this.m.e0) != (bl9 = g2.e0)) {
            webSettings.setNeedInitialFocus(bl9.booleanValue());
        }
        if (hashMap.get((Object)"offscreenPreRaster") != null && (bl14 = this.m.f0) != (bl62 = g2.f0) && Build.VERSION.SDK_INT >= 23) {
            webSettings.setOffscreenPreRaster(bl62.booleanValue());
        }
        if (hashMap.get((Object)"sansSerifFontFamily") != null && !this.m.g0.equals((Object)g2.g0)) {
            webSettings.setSansSerifFontFamily(g2.g0);
        }
        if (hashMap.get((Object)"serifFontFamily") != null && !this.m.h0.equals((Object)g2.h0)) {
            webSettings.setSerifFontFamily(g2.h0);
        }
        if (hashMap.get((Object)"standardFontFamily") != null && !this.m.i0.equals((Object)g2.i0)) {
            webSettings.setStandardFontFamily(g2.i0);
        }
        Object object2 = hashMap.get((Object)"preferredContentMode");
        boolean bl75 = true;
        if (object2 != null && !this.m.p.equals((Object)g2.p)) {
            boolean bl76 = i.a[com.pichillilorenzo.flutter_inappwebview.InAppWebView.j.a((int)g2.p).ordinal()];
            if (bl76 != bl75) {
                if (bl76 || bl76) {
                    this.setDesktopMode(false);
                }
            } else {
                this.setDesktopMode(bl75);
            }
        }
        if (hashMap.get((Object)"saveFormData") != null && (bl30 = this.m.j0) != (bl20 = g2.j0)) {
            webSettings.setSaveFormData(bl20.booleanValue());
        }
        if (hashMap.get((Object)"incognito") != null && (bl = this.m.s) != (bl41 = g2.s)) {
            this.setIncognito(bl41);
        }
        if (hashMap.get((Object)"hardwareAcceleration") != null && (bl48 = this.m.l0) != (bl38 = g2.l0)) {
            if (bl38.booleanValue()) {
                this.setLayerType(2, null);
            } else {
                this.setLayerType((int)bl75, null);
            }
        }
        if (!(hashMap.get((Object)"regexToCancelSubFramesLoading") == null || (string2 = this.m.n0) != null && string2.equals((Object)g2.n0))) {
            this.q = g2.n0 == null ? null : Pattern.compile((String)this.m.n0);
        }
        if (g2.o != null) {
            this.p.a().clear();
            for (Map map : g2.o) {
                f.g.a.b.e e2 = f.g.a.b.e.a((Map<String, Object>)((Map)map.get((Object)"trigger")));
                f.g.a.b.b b2 = f.g.a.b.b.a((Map<String, Object>)((Map)map.get((Object)"action")));
                this.p.a().add((Object)new f.g.a.b.a(e2, b2));
            }
        }
        if (hashMap.get((Object)"scrollBarStyle") != null && !this.m.q0.equals((Object)g2.q0)) {
            this.setScrollBarStyle(g2.q0.intValue());
        }
        if (!(hashMap.get((Object)"scrollBarDefaultDelayBeforeFade") == null || (n4 = this.m.s0) != null && n4.equals((Object)g2.s0))) {
            this.setScrollBarDefaultDelayBeforeFade(g2.s0.intValue());
        }
        if (hashMap.get((Object)"scrollbarFadingEnabled") != null && !this.m.t0.equals((Object)g2.t0)) {
            this.setScrollbarFadingEnabled(g2.t0.booleanValue());
        }
        if (!(hashMap.get((Object)"scrollBarFadeDuration") == null || (n5 = this.m.u0) != null && n5.equals((Object)g2.u0))) {
            this.setScrollBarFadeDuration(g2.u0.intValue());
        }
        if (hashMap.get((Object)"verticalScrollbarPosition") != null && !this.m.r0.equals((Object)g2.r0)) {
            this.setVerticalScrollbarPosition(g2.r0.intValue());
        }
        if (hashMap.get((Object)"disableVerticalScroll") != null && (bl3 = this.m.v) != (bl74 = g2.v)) {
            boolean bl77 = bl74 == false && g2.l != false;
            this.setVerticalScrollBarEnabled(bl77);
        }
        if (hashMap.get((Object)"disableHorizontalScroll") != null && (bl11 = this.m.w) != (bl43 = g2.w)) {
            if (bl43.booleanValue() || !g2.m.booleanValue()) {
                bl75 = false;
            }
            this.setHorizontalScrollBarEnabled(bl75);
        }
        if (hashMap.get((Object)"overScrollMode") != null && !this.m.o0.equals((Object)g2.o0)) {
            this.setOverScrollMode(g2.o0.intValue());
        }
        if (hashMap.get((Object)"networkAvailable") != null && (bl25 = this.m.p0) != (bl33 = g2.p0)) {
            this.setNetworkAvailable(bl33.booleanValue());
        }
        if (hashMap.get((Object)"rendererPriorityPolicy") != null && (this.m.v0.get((Object)"rendererRequestedPriority") != g2.v0.get((Object)"rendererRequestedPriority") || this.m.v0.get((Object)"waivedWhenNotVisible") != g2.v0.get((Object)"waivedWhenNotVisible")) && Build.VERSION.SDK_INT >= 26) {
            this.setRendererPriorityPolicy(((Integer)g2.v0.get((Object)"rendererRequestedPriority")).intValue(), ((Boolean)g2.v0.get((Object)"waivedWhenNotVisible")).booleanValue());
        }
        this.m = g2;
    }

    public void a(MethodChannel.Result result) {
        this.a((ValueCallback<String>)new h((InAppWebView)this, result));
    }

    public void a(Integer n2, Integer n3, Boolean bl) {
        if (bl.booleanValue()) {
            int[] arrn = new int[]{this.getScrollX() + n2};
            PropertyValuesHolder propertyValuesHolder = PropertyValuesHolder.ofInt((String)"scrollX", (int[])arrn);
            int[] arrn2 = new int[]{this.getScrollY() + n3};
            ObjectAnimator.ofPropertyValuesHolder((Object)this, (PropertyValuesHolder[])new PropertyValuesHolder[]{propertyValuesHolder, PropertyValuesHolder.ofInt((String)"scrollY", (int[])arrn2)}).setDuration(300L).start();
            return;
        }
        this.scrollBy(n2.intValue(), n3.intValue());
    }

    public void a(String string2) {
        this.a(string2, "(function(d) { var c = d.createElement('style'); c.innerHTML = %s; d.body.appendChild(c); })(document);", null);
    }

    public void a(String string2, MethodChannel.Result result) {
        this.a(string2, (String)null, result);
    }

    public void a(String string2, String string3, MethodChannel.Result result) {
        if (string3 != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put((Object)string2);
            String string4 = jSONArray.toString();
            string2 = String.format((String)string3, (Object[])new Object[]{string4.substring(1, string4.length() - 1)});
        }
        this.u.post((Runnable)new r((InAppWebView)this, string2, result));
    }

    public void a(String string2, String string3, String string4, String string5, String string6, MethodChannel.Result result) {
        this.loadDataWithBaseURL(string5, string2, string3, string4, string6);
        result.success(true);
    }

    public void a(String string2, Map<String, String> map, MethodChannel.Result result) {
        String string3;
        try {
            string3 = f.g.a.r.b(string2);
        }
        catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" asset file cannot be found!");
            result.error("InAppWebView", stringBuilder.toString(), (Object)iOException);
            return;
        }
        if (!string3.isEmpty()) {
            this.loadUrl(string3, map);
            result.success(true);
            return;
        }
        result.error("InAppWebView", "url is empty", null);
    }

    public void a(String string2, byte[] arrby, MethodChannel.Result result) {
        if (!string2.isEmpty()) {
            this.postUrl(string2, arrby);
            result.success(true);
            return;
        }
        result.error("InAppWebView", "url is empty", null);
    }

    public void b(MethodChannel.Result result) {
        this.u.post((Runnable)new q((InAppWebView)this, result));
    }

    public void b(Integer n2, Integer n3, Boolean bl) {
        if (bl.booleanValue()) {
            int[] arrn = new int[]{n2};
            PropertyValuesHolder propertyValuesHolder = PropertyValuesHolder.ofInt((String)"scrollX", (int[])arrn);
            int[] arrn2 = new int[]{n3};
            ObjectAnimator.ofPropertyValuesHolder((Object)this, (PropertyValuesHolder[])new PropertyValuesHolder[]{propertyValuesHolder, PropertyValuesHolder.ofInt((String)"scrollY", (int[])arrn2)}).setDuration(300L).start();
            return;
        }
        this.scrollTo(n2.intValue(), n3.intValue());
    }

    public void b(String string2) {
        this.a(string2, "(function(d) { var c = d.createElement('link'); c.rel='stylesheet'; c.type='text/css'; c.href = %s; d.head.appendChild(c); })(document);", null);
    }

    public void b(String string2, MethodChannel.Result result) {
        String string3;
        try {
            string3 = f.g.a.r.b(string2);
        }
        catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" asset file cannot be found!");
            result.error("InAppWebView", stringBuilder.toString(), (Object)iOException);
            return;
        }
        if (!string3.isEmpty()) {
            this.loadUrl(string3);
            result.success(true);
            return;
        }
        result.error("InAppWebView", "url is empty", null);
    }

    public void b(String string2, Map<String, String> map, MethodChannel.Result result) {
        if (!string2.isEmpty()) {
            this.loadUrl(string2, map);
            result.success(true);
            return;
        }
        result.error("InAppWebView", "url is empty", null);
    }

    public void c(String string2) {
        this.a(string2, "(function(d) { var c = d.createElement('script'); c.src = %s; d.body.appendChild(c); })(document);", null);
    }

    public void c(String string2, MethodChannel.Result result) {
        if (!string2.isEmpty()) {
            this.loadUrl(string2);
            result.success(true);
            return;
        }
        result.error("InAppWebView", "url is empty", null);
    }

    public void d() {
        this.evaluateJavascript("(function(){  var selection = window.getSelection();  var rangeY = null;  if (selection != null && selection.rangeCount > 0) {    var range = selection.getRangeAt(0);    var clientRect = range.getClientRects();    if (clientRect.length > 0) {      rangeY = clientRect[0].y;    } else if (document.activeElement) {      var boundingClientRect = document.activeElement.getBoundingClientRect();      rangeY = boundingClientRect.y;    }  }  return rangeY;})();", (ValueCallback)new f(this));
    }

    public void destroy() {
        WebView.super.destroy();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return WebView.super.dispatchTouchEvent(motionEvent);
    }

    public void e() {
        this.clearCache(true);
        this.n();
        this.clearFormData();
        WebStorage.getInstance().deleteAllData();
    }

    public void f() {
        this.removeView((View)this.s);
        this.s = null;
        this.h();
    }

    public boolean g() {
        return this.n;
    }

    public Map<String, Object> getCertificateMap() {
        return InAppWebView.a(this.getCertificate());
    }

    public HashMap<String, Object> getCopyBackForwardList() {
        WebBackForwardList webBackForwardList = this.copyBackForwardList();
        int n2 = webBackForwardList.getSize();
        int n3 = webBackForwardList.getCurrentIndex();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < n2; ++i2) {
            WebHistoryItem webHistoryItem = webBackForwardList.getItemAtIndex(i2);
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"originalUrl", (Object)webHistoryItem.getOriginalUrl());
            hashMap.put((Object)"title", (Object)webHistoryItem.getTitle());
            hashMap.put((Object)"url", (Object)webHistoryItem.getUrl());
            arrayList.add((Object)hashMap);
        }
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"history", (Object)arrayList);
        hashMap.put((Object)"currentIndex", (Object)n3);
        return hashMap;
    }

    public Map<String, Object> getOptions() {
        com.pichillilorenzo.flutter_inappwebview.InAppWebView.g g2 = this.m;
        if (g2 != null) {
            return g2.a(this);
        }
        return null;
    }

    public Float getUpdatedScale() {
        return Float.valueOf((float)this.o);
    }

    public void h() {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.e;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        this.g.invokeMethod("onHideContextMenu", (Object)hashMap);
    }

    public void i() {
        if (this.s != null && Build.VERSION.SDK_INT >= 19) {
            this.d();
        }
    }

    public void j() {
        Integer n2;
        Integer n3;
        String string2;
        WebSettings webSettings;
        Integer n4;
        Map<String, Object> map;
        block38 : {
            String string3;
            block37 : {
                block36 : {
                    boolean bl = this.e != null;
                    new v().q().a();
                    MethodChannel.MethodCallHandler methodCallHandler = bl ? this.e : this.f;
                    this.l = new f.g.a.i(methodCallHandler);
                    this.addJavascriptInterface((Object)this.l, "flutter_inappwebview");
                    MethodChannel.MethodCallHandler methodCallHandler2 = bl ? this.e : this.f;
                    this.j = new com.pichillilorenzo.flutter_inappwebview.InAppWebView.e(methodCallHandler2);
                    this.setWebChromeClient((WebChromeClient)this.j);
                    MethodChannel.MethodCallHandler methodCallHandler3 = bl ? this.e : this.f;
                    this.i = new com.pichillilorenzo.flutter_inappwebview.InAppWebView.f((Object)methodCallHandler3);
                    this.setWebViewClient((WebViewClient)this.i);
                    if (Build.VERSION.SDK_INT >= 29 && androidx.webkit.d.a((String)"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
                        MethodChannel.MethodCallHandler methodCallHandler4 = bl ? this.e : this.f;
                        this.k = new com.pichillilorenzo.flutter_inappwebview.InAppWebView.h(methodCallHandler4);
                        androidx.webkit.c.a((WebView)this, (androidx.webkit.f)this.k);
                    }
                    if (this.m.c.booleanValue()) {
                        this.setDownloadListener((DownloadListener)new /* Unavailable Anonymous Inner Class!! */);
                    }
                    webSettings = this.getSettings();
                    webSettings.setJavaScriptEnabled(this.m.g.booleanValue());
                    if (Build.VERSION.SDK_INT >= 19) {
                        WebView.setWebContentsDebuggingEnabled((boolean)this.m.h);
                    }
                    webSettings.setJavaScriptCanOpenWindowsAutomatically(this.m.i.booleanValue());
                    webSettings.setBuiltInZoomControls(this.m.B.booleanValue());
                    webSettings.setDisplayZoomControls(this.m.C.booleanValue());
                    webSettings.setSupportMultipleWindows(this.m.m0.booleanValue());
                    if (Build.VERSION.SDK_INT >= 26) {
                        webSettings.setSafeBrowsingEnabled(this.m.G.booleanValue());
                    }
                    webSettings.setMediaPlaybackRequiresUserGesture(this.m.j.booleanValue());
                    webSettings.setDatabaseEnabled(this.m.D.booleanValue());
                    webSettings.setDomStorageEnabled(this.m.E.booleanValue());
                    String string4 = this.m.e;
                    if (string4 == null || string4.isEmpty()) break block36;
                    string3 = this.m.e;
                    break block37;
                }
                if (Build.VERSION.SDK_INT < 17) break block38;
                string3 = WebSettings.getDefaultUserAgent((Context)this.getContext());
            }
            webSettings.setUserAgentString(string3);
        }
        if ((string2 = this.m.f) != null && !string2.isEmpty() && Build.VERSION.SDK_INT >= 17) {
            String string5 = this.m.e;
            String string6 = string5 != null && !string5.isEmpty() ? this.m.e : WebSettings.getDefaultUserAgent((Context)this.getContext());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string6);
            stringBuilder.append(" ");
            stringBuilder.append(this.m.f);
            webSettings.setUserAgentString(stringBuilder.toString());
        }
        if (this.m.d.booleanValue()) {
            this.e();
        } else if (this.m.A.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies((WebView)this, this.m.k0.booleanValue());
        }
        webSettings.setLoadWithOverviewMode(this.m.a0.booleanValue());
        webSettings.setUseWideViewPort(this.m.F.booleanValue());
        webSettings.setSupportZoom(this.m.y.booleanValue());
        webSettings.setTextZoom(this.m.z.intValue());
        boolean bl = this.m.v == false && this.m.l != false;
        this.setVerticalScrollBarEnabled(bl);
        boolean bl2 = this.m.w == false && this.m.m != false;
        this.setHorizontalScrollBarEnabled(bl2);
        if (this.m.u.booleanValue()) {
            this.setBackgroundColor(0);
        }
        if (Build.VERSION.SDK_INT >= 21 && (n3 = this.m.H) != null) {
            webSettings.setMixedContentMode(n3.intValue());
        }
        webSettings.setAllowContentAccess(this.m.I.booleanValue());
        webSettings.setAllowFileAccess(this.m.J.booleanValue());
        webSettings.setAllowFileAccessFromFileURLs(this.m.K.booleanValue());
        webSettings.setAllowUniversalAccessFromFileURLs(this.m.L.booleanValue());
        this.setCacheEnabled(this.m.t);
        String string7 = this.m.M;
        if (string7 != null && !string7.isEmpty() && this.m.t.booleanValue()) {
            webSettings.setAppCachePath(this.m.M);
        }
        webSettings.setBlockNetworkImage(this.m.N.booleanValue());
        webSettings.setBlockNetworkLoads(this.m.O.booleanValue());
        Integer n5 = this.m.P;
        if (n5 != null) {
            webSettings.setCacheMode(n5.intValue());
        }
        webSettings.setCursiveFontFamily(this.m.Q);
        webSettings.setDefaultFixedFontSize(this.m.R.intValue());
        webSettings.setDefaultFontSize(this.m.S.intValue());
        webSettings.setDefaultTextEncodingName(this.m.T);
        if (Build.VERSION.SDK_INT >= 24 && (n4 = this.m.U) != null) {
            webSettings.setDisabledActionModeMenuItems(n4.intValue());
        }
        webSettings.setFantasyFontFamily(this.m.V);
        webSettings.setFixedFontFamily(this.m.W);
        if (Build.VERSION.SDK_INT >= 29 && (n2 = this.m.X) != null) {
            webSettings.setForceDark(n2.intValue());
        }
        webSettings.setGeolocationEnabled(this.m.Y.booleanValue());
        WebSettings.LayoutAlgorithm layoutAlgorithm = this.m.Z;
        if (layoutAlgorithm != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                layoutAlgorithm.equals((Object)WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
            }
            webSettings.setLayoutAlgorithm(this.m.Z);
        }
        webSettings.setLoadsImagesAutomatically(this.m.b0.booleanValue());
        webSettings.setMinimumFontSize(this.m.k.intValue());
        webSettings.setMinimumLogicalFontSize(this.m.c0.intValue());
        this.setInitialScale(this.m.d0.intValue());
        webSettings.setNeedInitialFocus(this.m.e0.booleanValue());
        if (Build.VERSION.SDK_INT >= 23) {
            webSettings.setOffscreenPreRaster(this.m.f0.booleanValue());
        }
        webSettings.setSansSerifFontFamily(this.m.g0);
        webSettings.setSerifFontFamily(this.m.h0);
        webSettings.setStandardFontFamily(this.m.i0);
        Integer n6 = this.m.p;
        if (n6 != null && n6.intValue() == com.pichillilorenzo.flutter_inappwebview.InAppWebView.j.e.a()) {
            this.setDesktopMode(true);
        }
        webSettings.setSaveFormData(this.m.j0.booleanValue());
        if (this.m.s.booleanValue()) {
            this.setIncognito(true);
        }
        if (this.m.l0.booleanValue()) {
            this.setLayerType(2, null);
        } else {
            this.setLayerType(1, null);
        }
        String string8 = this.m.n0;
        if (string8 != null) {
            this.q = Pattern.compile((String)string8);
        }
        this.setScrollBarStyle(this.m.q0.intValue());
        com.pichillilorenzo.flutter_inappwebview.InAppWebView.g g2 = this.m;
        Integer n7 = g2.s0;
        if (n7 != null) {
            this.setScrollBarDefaultDelayBeforeFade(n7.intValue());
        } else {
            g2.s0 = this.getScrollBarDefaultDelayBeforeFade();
        }
        this.setScrollbarFadingEnabled(this.m.t0.booleanValue());
        com.pichillilorenzo.flutter_inappwebview.InAppWebView.g g3 = this.m;
        Integer n8 = g3.u0;
        if (n8 != null) {
            this.setScrollBarFadeDuration(n8.intValue());
        } else {
            g3.u0 = this.getScrollBarFadeDuration();
        }
        this.setVerticalScrollbarPosition(this.m.r0.intValue());
        this.setOverScrollMode(this.m.o0.intValue());
        Boolean bl3 = this.m.p0;
        if (bl3 != null) {
            this.setNetworkAvailable(bl3.booleanValue());
        }
        if ((map = this.m.v0) != null && !map.isEmpty() && Build.VERSION.SDK_INT >= 26) {
            this.setRendererPriorityPolicy(((Integer)this.m.v0.get((Object)"rendererRequestedPriority")).intValue(), ((Boolean)this.m.v0.get((Object)"waivedWhenNotVisible")).booleanValue());
        } else {
            Map<String, Object> map2 = this.m.v0;
            if ((map2 == null || map2 != null && map2.isEmpty()) && Build.VERSION.SDK_INT >= 26) {
                this.m.v0.put((Object)"rendererRequestedPriority", (Object)this.getRendererRequestedPriority());
                this.m.v0.put((Object)"waivedWhenNotVisible", (Object)this.getRendererPriorityWaivedWhenNotVisible());
            }
        }
        this.p.a().clear();
        for (Map map3 : this.m.o) {
            f.g.a.b.e e2 = f.g.a.b.e.a((Map<String, Object>)((Map)map3.get((Object)"trigger")));
            f.g.a.b.b b2 = f.g.a.b.b.a((Map<String, Object>)((Map)map3.get((Object)"action")));
            this.p.a().add((Object)new f.g.a.b.a(e2, b2));
        }
        this.setFindListener((WebView.FindListener)new j(this));
        this.r = new GestureDetector(this.getContext(), (GestureDetector.OnGestureListener)new k(this));
        this.v = new l(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.y = new m(this);
        }
        this.setOnTouchListener((View.OnTouchListener)new n(this));
        this.setOnLongClickListener((View.OnLongClickListener)new o(this));
    }

    public void k() {
        PrintManager printManager = (PrintManager)f.g.a.q.f.getSystemService("print");
        if (printManager != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getTitle());
            stringBuilder.append(" Document");
            String string2 = stringBuilder.toString();
            printManager.print(string2, this.createPrintDocumentAdapter(string2), new PrintAttributes.Builder().build());
            return;
        }
        Log.e((String)"InAppWebView", (String)"No PrintManager available");
    }

    public Map<String, Object> l() {
        Message message = C.obtainMessage();
        this.requestFocusNodeHref(message);
        Bundle bundle = message.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"src", (Object)bundle.getString("src"));
        hashMap.put((Object)"url", (Object)bundle.getString("url"));
        hashMap.put((Object)"title", (Object)bundle.getString("title"));
        return hashMap;
    }

    public Map<String, Object> m() {
        Message message = C.obtainMessage();
        this.requestImageRef(message);
        Bundle bundle = message.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)bundle.getString("url"));
        return hashMap;
    }

    public void onCreateContextMenu(ContextMenu contextMenu) {
        WebView.super.onCreateContextMenu(contextMenu);
        InAppWebView.super.o();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        View view;
        InputConnection inputConnection = WebView.super.onCreateInputConnection(editorInfo);
        if (inputConnection == null && (view = this.b) != null) {
            view.getHandler().postDelayed((Runnable)new a((InAppWebView)this), 128L);
        }
        return inputConnection;
    }

    protected void onScrollChanged(int n2, int n3, int n4, int n5) {
        WebView.super.onScrollChanged(n2, n3, n4, n5);
        float f2 = n2;
        float f3 = this.o;
        int n6 = (int)(f2 / f3);
        int n7 = (int)((float)n3 / f3);
        LinearLayout linearLayout = this.s;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
            this.s.setVisibility(8);
        }
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.e;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"x", (Object)n6);
        hashMap.put((Object)"y", (Object)n7);
        this.g.invokeMethod("onScrollChanged", (Object)hashMap);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.B = new Point((int)motionEvent.getX(), (int)motionEvent.getY());
        return WebView.super.onTouchEvent(motionEvent);
    }

    public void reload() {
        WebView.super.reload();
    }

    public void setCacheEnabled(boolean bl) {
        block1 : {
            boolean bl2;
            WebSettings webSettings;
            block2 : {
                block0 : {
                    webSettings = this.getSettings();
                    if (!bl) break block0;
                    Context context = this.getContext();
                    if (context == null) break block1;
                    webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
                    webSettings.setCacheMode(-1);
                    bl2 = true;
                    break block2;
                }
                webSettings.setCacheMode(2);
                bl2 = false;
            }
            webSettings.setAppCacheEnabled(bl2);
        }
    }

    public void setDesktopMode(boolean bl) {
        WebSettings webSettings = this.getSettings();
        String string2 = webSettings.getUserAgentString();
        String string3 = bl ? string2.replace((CharSequence)"Mobile", (CharSequence)"eliboM").replace((CharSequence)"Android", (CharSequence)"diordnA") : string2.replace((CharSequence)"eliboM", (CharSequence)"Mobile").replace((CharSequence)"diordnA", (CharSequence)"Android");
        webSettings.setUserAgentString(string3);
        webSettings.setUseWideViewPort(bl);
        webSettings.setLoadWithOverviewMode(bl);
        webSettings.setSupportZoom(bl);
        webSettings.setBuiltInZoomControls(bl);
    }

    public void setIncognito(boolean bl) {
        WebSettings webSettings = this.getSettings();
        if (bl) {
            if (Build.VERSION.SDK_INT >= 21) {
                CookieManager.getInstance().removeAllCookies(null);
            } else {
                CookieManager.getInstance().removeAllCookie();
            }
            webSettings.setCacheMode(2);
            webSettings.setAppCacheEnabled(false);
            this.clearHistory();
            this.clearCache(true);
            this.clearFormData();
            webSettings.setSavePassword(false);
            webSettings.setSaveFormData(false);
            return;
        }
        webSettings.setCacheMode(-1);
        webSettings.setAppCacheEnabled(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        return this.a(WebView.super.startActionMode(callback), callback);
    }

    public ActionMode startActionMode(ActionMode.Callback callback, int n2) {
        return this.a(WebView.super.startActionMode(callback, n2), callback);
    }
}

