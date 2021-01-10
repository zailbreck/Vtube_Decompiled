/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Message
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.webkit.ValueCallback
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 *  android.webkit.WebView$HitTestResult
 *  android.webkit.WebView$WebViewTransport
 *  android.webkit.WebViewClient
 *  android.widget.ProgressBar
 *  android.widget.SearchView
 *  android.widget.SearchView$OnCloseListener
 *  android.widget.SearchView$OnQueryTextListener
 *  androidx.appcompat.app.a
 *  androidx.appcompat.app.d
 *  androidx.fragment.app.b
 *  androidx.webkit.c
 *  androidx.webkit.d
 *  com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$a
 *  com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$b
 *  com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$c
 *  com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$d
 *  com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$e
 *  com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$f
 *  com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$g
 *  com.pichillilorenzo.flutter_inappwebview.InAppBrowser.a
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.e
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.g
 *  java.io.Serializable
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package com.pichillilorenzo.flutter_inappwebview.InAppBrowser;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.SearchView;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView;
import f.g.a.m;
import f.g.a.n;
import f.g.a.o;
import f.g.a.q;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class InAppBrowserActivity
extends androidx.appcompat.app.d
implements MethodChannel.MethodCallHandler {
    public MethodChannel d;
    public Integer e;
    public String f;
    public InAppWebView g;
    public androidx.appcompat.app.a h;
    public Menu i;
    public SearchView j;
    public com.pichillilorenzo.flutter_inappwebview.InAppBrowser.a k;
    public Map<String, String> l;
    public ProgressBar m;
    public boolean n = false;
    public String o;
    public List<g> p = new ArrayList();

    private void N() {
        String string;
        ProgressBar progressBar;
        int n2;
        String string2;
        this.g.j();
        if (this.k.a.booleanValue()) {
            this.z();
        } else {
            this.J();
        }
        this.m = (ProgressBar)this.findViewById(m.progressBar);
        if (!this.k.h.booleanValue()) {
            progressBar = this.m;
            n2 = 0;
        } else {
            progressBar = this.m;
            n2 = 100;
        }
        progressBar.setMax(n2);
        this.h.d(true ^ this.k.f);
        if (!this.k.b.booleanValue()) {
            this.h.i();
        }
        if ((string2 = this.k.c) != null && !string2.isEmpty()) {
            this.h.a((Drawable)new ColorDrawable(Color.parseColor((String)this.k.c)));
        }
        if ((string = this.k.d) != null && !string.isEmpty()) {
            this.h.a((CharSequence)this.k.d);
        }
    }

    public boolean A() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.n;
        }
        return false;
    }

    public void B() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.onPause();
        }
    }

    public void C() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.onResume();
        }
    }

    public void D() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.pauseTimers();
        }
    }

    public void E() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.k();
        }
    }

    public void F() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.reload();
        }
    }

    public Map<String, Object> G() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.l();
        }
        return null;
    }

    public Map<String, Object> H() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.m();
        }
        return null;
    }

    public void I() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.resumeTimers();
        }
    }

    public void J() {
        this.n = false;
        Intent intent = new Intent((Context)this, InAppBrowserActivity.class);
        intent.setFlags(131072);
        this.startActivityIfNeeded(intent, 0);
    }

    public void K() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.stopLoading();
        }
    }

    public boolean L() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.zoomIn();
        }
        return false;
    }

    public boolean M() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.zoomOut();
        }
        return false;
    }

    public void a(com.pichillilorenzo.flutter_inappwebview.InAppBrowser.a a2, HashMap<String, Object> hashMap) {
        String string;
        String string2;
        Boolean bl;
        String string3;
        String string4;
        Boolean bl2;
        Boolean bl3;
        Boolean bl4;
        Boolean bl5;
        Boolean bl6;
        Boolean bl7;
        Boolean bl8;
        Boolean bl9;
        Boolean bl10;
        com.pichillilorenzo.flutter_inappwebview.InAppWebView.g g2 = new com.pichillilorenzo.flutter_inappwebview.InAppWebView.g();
        g2.a(hashMap);
        this.g.a(g2, hashMap);
        if (hashMap.get((Object)"hidden") != null && (bl4 = this.k.a) != (bl9 = a2.a)) {
            if (bl9.booleanValue()) {
                this.z();
            } else {
                this.J();
            }
        }
        if (hashMap.get((Object)"progressBar") != null && (bl3 = this.k.h) != (bl8 = a2.h) && this.m != null) {
            if (bl8.booleanValue()) {
                this.m.setMax(0);
            } else {
                this.m.setMax(100);
            }
        }
        if (hashMap.get((Object)"hideTitleBar") != null && (bl10 = this.k.f) != (bl7 = a2.f)) {
            this.h.d(true ^ bl7);
        }
        if (hashMap.get((Object)"toolbarTop") != null && (bl5 = this.k.b) != (bl = a2.b)) {
            if (!bl.booleanValue()) {
                this.h.i();
            } else {
                this.h.m();
            }
        }
        if (hashMap.get((Object)"toolbarTopBackgroundColor") != null && (string2 = this.k.c) != (string = a2.c) && !string.isEmpty()) {
            this.h.a((Drawable)new ColorDrawable(Color.parseColor((String)a2.c)));
        }
        if (hashMap.get((Object)"toolbarTopFixedTitle") != null && (string4 = this.k.d) != (string3 = a2.d) && !string3.isEmpty()) {
            this.h.a((CharSequence)a2.d);
        }
        if (hashMap.get((Object)"hideUrlBar") != null && (bl6 = this.k.e) != (bl2 = a2.e)) {
            if (bl2.booleanValue()) {
                this.i.findItem(m.menu_search).setVisible(false);
            } else {
                this.i.findItem(m.menu_search).setVisible(true);
            }
        }
        this.k = a2;
    }

    public void a(MethodChannel.Result result) {
        boolean bl;
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.clearMatches();
            bl = true;
        } else {
            bl = false;
        }
        result.success(bl);
    }

    public void a(Boolean bl, MethodChannel.Result result) {
        boolean bl2;
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.findNext(bl.booleanValue());
            bl2 = true;
        } else {
            bl2 = false;
        }
        result.success(bl2);
    }

    public void a(Float f2) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.zoomBy(f2.floatValue());
        }
    }

    public void a(Integer n2, Integer n3, Boolean bl) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.a(n2, n3, bl);
        }
    }

    public void a(String string) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.findAllAsync(string);
        }
    }

    public void a(String string, MethodChannel.Result result) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.a(string, result);
            return;
        }
        result.success("");
    }

    public void a(String string, String string2, String string3, String string4, String string5, MethodChannel.Result result) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.a(string, string2, string3, string4, string5, result);
            return;
        }
        result.error("InAppBrowserActivity", "webView is null", null);
    }

    public void a(String string, Map<String, String> map, MethodChannel.Result result) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.a(string, map, result);
            return;
        }
        result.error("InAppBrowserActivity", "webView is null", null);
    }

    public void a(String string, boolean bl, MethodChannel.Result result) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.saveWebArchive(string, bl, (ValueCallback)new e((InAppBrowserActivity)this, result));
            return;
        }
        result.success(null);
    }

    public void a(String string, byte[] arrby, MethodChannel.Result result) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.a(string, arrby, result);
            return;
        }
        result.error("InAppBrowserActivity", "webView is null", null);
    }

    public void a(Map<String, Object> map) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.t = map;
        }
    }

    public boolean a(boolean bl) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.pageDown(bl);
        }
        return false;
    }

    public void b(MethodChannel.Result result) {
        HashMap hashMap = new HashMap();
        this.d.invokeMethod("onExit", (Object)hashMap);
        this.k();
        if (result != null) {
            result.success(true);
        }
    }

    public void b(Integer n2, Integer n3, Boolean bl) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.b(n2, n3, bl);
        }
    }

    public void b(String string) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.a(string);
        }
    }

    public void b(String string, MethodChannel.Result result) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.b(string, result);
            return;
        }
        result.error("InAppBrowserActivity", "webView is null", null);
    }

    public void b(String string, Map<String, String> map, MethodChannel.Result result) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.b(string, map, result);
            return;
        }
        result.error("InAppBrowserActivity", "webView is null", null);
    }

    public boolean b(int n2) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.canGoBackOrForward(n2);
        }
        return false;
    }

    public boolean b(boolean bl) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.pageUp(bl);
        }
        return false;
    }

    public void c(int n2) {
        if (this.g != null && this.b(n2)) {
            this.g.goBackOrForward(n2);
        }
    }

    public void c(MethodChannel.Result result) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.a(result);
            return;
        }
        result.success(null);
    }

    public void c(String string) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.b(string);
        }
    }

    public void c(String string, MethodChannel.Result result) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.c(string, result);
            return;
        }
        result.error("InAppBrowserActivity", "webView is null", null);
    }

    public void closeButtonClicked(MenuItem menuItem) {
        this.b((MethodChannel.Result)null);
    }

    public void d(MethodChannel.Result result) {
        if (this.g != null && Build.VERSION.SDK_INT >= 27 && androidx.webkit.d.a((String)"START_SAFE_BROWSING")) {
            androidx.webkit.c.a((Context)this.g.getContext(), (ValueCallback)new d((InAppBrowserActivity)this, result));
            return;
        }
        result.success(false);
    }

    public void d(String string) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.c(string);
        }
    }

    public void e(MethodChannel.Result result) {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.b(result);
            return;
        }
        result.success(null);
    }

    public boolean f() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.canGoBack();
        }
        return false;
    }

    public boolean g() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.canGoForward();
        }
        return false;
    }

    public void goBackButtonClicked(MenuItem menuItem) {
        this.x();
    }

    public void goForwardButtonClicked(MenuItem menuItem) {
        this.y();
    }

    public void h() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.e();
        }
    }

    public void i() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.clearFocus();
        }
    }

    public void j() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            inAppWebView.clearSslPreferences();
        }
    }

    public void k() {
        this.d.setMethodCallHandler(null);
        this.p.clear();
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            ActivityPluginBinding activityPluginBinding = q.e;
            if (activityPluginBinding != null) {
                activityPluginBinding.removeActivityResultListener((PluginRegistry.ActivityResultListener)inAppWebView.j);
            }
            ((ViewGroup)this.g.getParent()).removeView((View)this.g);
            this.g.setWebChromeClient(new WebChromeClient());
            this.g.setWebViewClient((WebViewClient)new f(this));
            this.g.loadUrl("about:blank");
            this.finish();
        }
    }

    public Map<String, Object> l() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.getCertificateMap();
        }
        return null;
    }

    public Integer m() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.getContentHeight();
        }
        return null;
    }

    public HashMap<String, Object> n() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.getCopyBackForwardList();
        }
        return null;
    }

    public Map<String, Object> o() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            WebView.HitTestResult hitTestResult = inAppWebView.getHitTestResult();
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"type", (Object)hitTestResult.getType());
            hashMap.put((Object)"extra", (Object)hitTestResult.getExtra());
            return hashMap;
        }
        return null;
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        Iterator iterator = this.p.iterator();
        while (iterator.hasNext()) {
            if (!(iterator.next()).onActivityResult(n2, n3, intent)) continue;
            return;
        }
        androidx.fragment.app.b.super.onActivityResult(n2, n3, intent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        Bundle bundle2 = this.getIntent().getExtras();
        this.f = bundle2.getString("uuid");
        this.e = bundle2.getInt("windowId");
        BinaryMessenger binaryMessenger = q.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.pichillilorenzo/flutter_inappbrowser_");
        stringBuilder.append(this.f);
        this.d = new MethodChannel(binaryMessenger, stringBuilder.toString());
        this.d.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
        this.setContentView(n.activity_web_view);
        InAppWebView inAppWebView = this.g = (InAppWebView)this.findViewById(m.webView);
        inAppWebView.h = this.e;
        inAppWebView.e = this;
        inAppWebView.g = this.d;
        this.o = bundle2.getString("fromActivity");
        HashMap hashMap = (HashMap)bundle2.getSerializable("options");
        HashMap hashMap2 = (HashMap)bundle2.getSerializable("contextMenu");
        this.k = new com.pichillilorenzo.flutter_inappwebview.InAppBrowser.a();
        this.k.a((Map)hashMap);
        com.pichillilorenzo.flutter_inappwebview.InAppWebView.g g2 = new com.pichillilorenzo.flutter_inappwebview.InAppWebView.g();
        g2.a((Map)hashMap);
        InAppWebView inAppWebView2 = this.g;
        inAppWebView2.m = g2;
        inAppWebView2.t = hashMap2;
        this.h = this.c();
        InAppBrowserActivity.super.N();
        if (this.e != -1) {
            Message message = (Message)com.pichillilorenzo.flutter_inappwebview.InAppWebView.e.j.get((Object)this.e);
            if (message != null) {
                ((WebView.WebViewTransport)message.obj).setWebView((WebView)this.g);
                message.sendToTarget();
            }
        } else if (!Boolean.valueOf((boolean)bundle2.getBoolean("isData")).booleanValue()) {
            this.l = (HashMap)bundle2.getSerializable("headers");
            String string = bundle2.getString("url");
            this.g.loadUrl(string, this.l);
        } else {
            String string = bundle2.getString("data");
            String string2 = bundle2.getString("mimeType");
            String string3 = bundle2.getString("encoding");
            String string4 = bundle2.getString("baseUrl");
            String string5 = bundle2.getString("historyUrl");
            this.g.loadDataWithBaseURL(string4, string, string2, string3, string5);
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put((Object)"uuid", (Object)this.f);
        this.d.invokeMethod("onBrowserCreated", (Object)hashMap3);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.i = menu;
        this.getMenuInflater().inflate(o.menu_main, this.i);
        this.j = (SearchView)this.i.findItem(m.menu_search).getActionView();
        this.j.setFocusable(true);
        if (this.k.e.booleanValue()) {
            this.i.findItem(m.menu_search).setVisible(false);
        }
        this.j.setQuery((CharSequence)this.g.getUrl(), false);
        if (this.k.d.isEmpty()) {
            this.h.a((CharSequence)this.g.getTitle());
        }
        this.j.setOnQueryTextListener((SearchView.OnQueryTextListener)new a((InAppBrowserActivity)this));
        this.j.setOnCloseListener((SearchView.OnCloseListener)new b((InAppBrowserActivity)this));
        this.j.setOnQueryTextFocusChangeListener((View.OnFocusChangeListener)new c((InAppBrowserActivity)this));
        return true;
    }

    public void onDestroy() {
        this.k();
        super.onDestroy();
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        if (n2 == 4) {
            if (this.f()) {
                this.x();
            } else if (this.k.g.booleanValue()) {
                this.b((MethodChannel.Result)null);
            }
            return true;
        }
        return super.onKeyDown(n2, keyEvent);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void onMethodCall(MethodCall var1, MethodChannel.Result var2_2) {
        block130 : {
            block129 : {
                var3_3 = var1.method;
                var4_4 = var3_3.hashCode();
                var5_5 = true;
                switch (var4_4) {
                    default: {
                        break;
                    }
                    case 1966196898: {
                        if (!var3_3.equals((Object)"getTitle")) break;
                        var6_6 = 1;
                        break block129;
                    }
                    case 1965076372: {
                        if (!var3_3.equals((Object)"getScale")) break;
                        var6_6 = 44;
                        break block129;
                    }
                    case 1937913574: {
                        if (!var3_3.equals((Object)"evaluateJavascript")) break;
                        var6_6 = 8;
                        break block129;
                    }
                    case 1925083019: {
                        if (!var3_3.equals((Object)"injectJavascriptFileFromUrl")) break;
                        var6_6 = 9;
                        break block129;
                    }
                    case 1916929588: {
                        if (!var3_3.equals((Object)"findAllAsync")) break;
                        var6_6 = 31;
                        break block129;
                    }
                    case 1845185410: {
                        if (!var3_3.equals((Object)"loadFile")) break;
                        var6_6 = 6;
                        break block129;
                    }
                    case 1845118384: {
                        if (!var3_3.equals((Object)"loadData")) break;
                        var6_6 = 5;
                        break block129;
                    }
                    case 1810715187: {
                        if (!var3_3.equals((Object)"goBackOrForward")) break;
                        var6_6 = 19;
                        break block129;
                    }
                    case 1779894764: {
                        if (!var3_3.equals((Object)"setContextMenu")) break;
                        var6_6 = 53;
                        break block129;
                    }
                    case 1729408231: {
                        if (!var3_3.equals((Object)"requestImageRef")) break;
                        var6_6 = 55;
                        break block129;
                    }
                    case 1724190684: {
                        if (!var3_3.equals((Object)"setOptions")) break;
                        var6_6 = 25;
                        break block129;
                    }
                    case 1520566363: {
                        if (!var3_3.equals((Object)"resumeTimers")) break;
                        var6_6 = 39;
                        break block129;
                    }
                    case 1312131169: {
                        if (!var3_3.equals((Object)"getCertificate")) break;
                        var6_6 = 58;
                        break block129;
                    }
                    case 1246613238: {
                        if (!var3_3.equals((Object)"requestFocusNodeHref")) break;
                        var6_6 = 54;
                        break block129;
                    }
                    case 1091267752: {
                        if (!var3_3.equals((Object)"getOriginalUrl")) break;
                        var6_6 = 43;
                        break block129;
                    }
                    case 1076821923: {
                        if (!var3_3.equals((Object)"getProgress")) break;
                        var6_6 = 2;
                        break block129;
                    }
                    case 1042858233: {
                        if (!var3_3.equals((Object)"clearSslPreferences")) break;
                        var6_6 = 30;
                        break block129;
                    }
                    case 858987473: {
                        if (!var3_3.equals((Object)"pageDown")) break;
                        var6_6 = 47;
                        break block129;
                    }
                    case 817048102: {
                        if (!var3_3.equals((Object)"clearMatches")) break;
                        var6_6 = 33;
                        break block129;
                    }
                    case 740366903: {
                        if (!var3_3.equals((Object)"injectCSSFileFromUrl")) break;
                        var6_6 = 11;
                        break block129;
                    }
                    case 492688268: {
                        if (!var3_3.equals((Object)"getHitTestResult")) break;
                        var6_6 = 46;
                        break block129;
                    }
                    case 336631465: {
                        if (!var3_3.equals((Object)"loadUrl")) break;
                        var6_6 = 3;
                        break block129;
                    }
                    case 194959693: {
                        if (!var3_3.equals((Object)"takeScreenshot")) break;
                        var6_6 = 24;
                        break block129;
                    }
                    case 106440182: {
                        if (!var3_3.equals((Object)"pause")) break;
                        var6_6 = 36;
                        break block129;
                    }
                    case 94756344: {
                        if (!var3_3.equals((Object)"close")) break;
                        var6_6 = 7;
                        break block129;
                    }
                    case 3529469: {
                        if (!var3_3.equals((Object)"show")) break;
                        var6_6 = 12;
                        break block129;
                    }
                    case 3202370: {
                        if (!var3_3.equals((Object)"hide")) break;
                        var6_6 = 13;
                        break block129;
                    }
                    case -17750794: {
                        if (!var3_3.equals((Object)"startSafeBrowsing")) break;
                        var6_6 = 28;
                        break block129;
                    }
                    case -32598479: {
                        if (!var3_3.equals((Object)"getCopyBackForwardList")) break;
                        var6_6 = 27;
                        break block129;
                    }
                    case -53272641: {
                        if (!var3_3.equals((Object)"injectCSSCode")) break;
                        var6_6 = 10;
                        break block129;
                    }
                    case -110027141: {
                        if (!var3_3.equals((Object)"zoomOut")) break;
                        var6_6 = 51;
                        break block129;
                    }
                    case -127960866: {
                        if (!var3_3.equals((Object)"getSelectedText")) break;
                        var6_6 = 45;
                        break block129;
                    }
                    case -212614552: {
                        if (!var3_3.equals((Object)"getOptions")) break;
                        var6_6 = 26;
                        break block129;
                    }
                    case -243128142: {
                        if (!var3_3.equals((Object)"isLoading")) break;
                        var6_6 = 22;
                        break block129;
                    }
                    case -317054497: {
                        if (!var3_3.equals((Object)"canGoBack")) break;
                        var6_6 = 16;
                        break block129;
                    }
                    case -318289731: {
                        if (!var3_3.equals((Object)"goForward")) break;
                        var6_6 = 17;
                        break block129;
                    }
                    case -391221073: {
                        if (!var3_3.equals((Object)"postUrl")) break;
                        var6_6 = 4;
                        break block129;
                    }
                    case -402165208: {
                        if (!var3_3.equals((Object)"scrollTo")) break;
                        var6_6 = 34;
                        break block129;
                    }
                    case -402165756: {
                        if (!var3_3.equals((Object)"scrollBy")) break;
                        var6_6 = 35;
                        break block129;
                    }
                    case -543453324: {
                        if (!var3_3.equals((Object)"isHidden")) break;
                        var6_6 = 23;
                        break block129;
                    }
                    case -678975813: {
                        if (!var3_3.equals((Object)"printCurrentPage")) break;
                        var6_6 = 40;
                        break block129;
                    }
                    case -679382964: {
                        if (!var3_3.equals((Object)"findNext")) break;
                        var6_6 = 32;
                        break block129;
                    }
                    case -696286120: {
                        if (!var3_3.equals((Object)"zoomIn")) break;
                        var6_6 = 50;
                        break block129;
                    }
                    case -696286326: {
                        if (!var3_3.equals((Object)"zoomBy")) break;
                        var6_6 = 42;
                        break block129;
                    }
                    case -756050293: {
                        if (!var3_3.equals((Object)"clearFocus")) break;
                        var6_6 = 52;
                        break block129;
                    }
                    case -759238347: {
                        if (!var3_3.equals((Object)"clearCache")) break;
                        var6_6 = 29;
                        break block129;
                    }
                    case -934426579: {
                        if (!var3_3.equals((Object)"resume")) break;
                        var6_6 = 37;
                        break block129;
                    }
                    case -934641255: {
                        if (!var3_3.equals((Object)"reload")) break;
                        var6_6 = 14;
                        break block129;
                    }
                    case -948122918: {
                        if (!var3_3.equals((Object)"stopLoading")) break;
                        var6_6 = 21;
                        break block129;
                    }
                    case -995752566: {
                        if (!var3_3.equals((Object)"pageUp")) break;
                        var6_6 = 48;
                        break block129;
                    }
                    case -1067273523: {
                        if (!var3_3.equals((Object)"canGoForward")) break;
                        var6_6 = 18;
                        break block129;
                    }
                    case -1241591313: {
                        if (!var3_3.equals((Object)"goBack")) break;
                        var6_6 = 15;
                        break block129;
                    }
                    case -1249348039: {
                        if (!var3_3.equals((Object)"getUrl")) break;
                        var6_6 = 0;
                        break block129;
                    }
                    case -1309347773: {
                        if (!var3_3.equals((Object)"canGoBackOrForward")) break;
                        var6_6 = 20;
                        break block129;
                    }
                    case -1331417354: {
                        if (!var3_3.equals((Object)"getScrollY")) break;
                        var6_6 = 57;
                        break block129;
                    }
                    case -1331417355: {
                        if (!var3_3.equals((Object)"getScrollX")) break;
                        var6_6 = 56;
                        break block129;
                    }
                    case -1624396757: {
                        if (!var3_3.equals((Object)"saveWebArchive")) break;
                        var6_6 = 49;
                        break block129;
                    }
                    case -1773179062: {
                        if (!var3_3.equals((Object)"getContentHeight")) break;
                        var6_6 = 41;
                        break block129;
                    }
                    case -1787354268: {
                        if (!var3_3.equals((Object)"pauseTimers")) break;
                        var6_6 = 38;
                        break block129;
                    }
                }
                var6_6 = -1;
            }
            switch (var6_6) {
                default: {
                    var2_2.notImplemented();
                    return;
                }
                case 58: {
                    var7_7 = this.l();
                    break block130;
                }
                case 57: {
                    var7_8 = this.u();
                    break block130;
                }
                case 56: {
                    var7_9 = this.t();
                    break block130;
                }
                case 55: {
                    var7_10 = this.H();
                    break block130;
                }
                case 54: {
                    var7_11 = this.G();
                    break block130;
                }
                case 53: {
                    this.a((Map<String, Object>)((Map)var1.argument("contextMenu")));
                    ** GOTO lbl416
                }
                case 52: {
                    this.i();
                    ** GOTO lbl416
                }
                case 51: {
                    var12_23 = this.M();
                    ** GOTO lbl394
                }
                case 50: {
                    var12_23 = this.L();
                    ** GOTO lbl394
                }
                case 49: {
                    this.a((String)var1.argument("basename"), (Boolean)var1.argument("autoname"), var2_2);
                    return;
                }
                case 48: {
                    var12_23 = this.b((Boolean)var1.argument("top"));
                    ** GOTO lbl394
                }
                case 47: {
                    var12_23 = this.a((Boolean)var1.argument("bottom"));
                    ** GOTO lbl394
                }
                case 46: {
                    var7_12 = this.o();
                    break block130;
                }
                case 45: {
                    if (Build.VERSION.SDK_INT >= 19) {
                        this.c(var2_2);
                        return;
                    }
                    var2_2.success(null);
                    return;
                }
                case 44: {
                    var7_13 = this.s();
                    break block130;
                }
                case 43: {
                    var7_14 = this.q();
                    break block130;
                }
                case 42: {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.a((Float)var1.argument("zoomFactor"));
                    }
                    ** GOTO lbl416
                }
                case 41: {
                    var7_15 = this.m();
                    break block130;
                }
                case 40: {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.E();
                    }
                    ** GOTO lbl416
                }
                case 39: {
                    this.I();
                    ** GOTO lbl416
                }
                case 38: {
                    this.D();
                    ** GOTO lbl416
                }
                case 37: {
                    this.C();
                    ** GOTO lbl416
                }
                case 36: {
                    this.B();
                    ** GOTO lbl416
                }
                case 35: {
                    this.a((Integer)var1.argument("x"), (Integer)var1.argument("y"), (Boolean)var1.argument("animated"));
                    ** GOTO lbl416
                }
                case 34: {
                    this.b((Integer)var1.argument("x"), (Integer)var1.argument("y"), (Boolean)var1.argument("animated"));
                    ** GOTO lbl416
                }
                case 33: {
                    this.a(var2_2);
                    return;
                }
                case 32: {
                    this.a((Boolean)var1.argument("forward"), var2_2);
                    return;
                }
                case 31: {
                    this.a((String)var1.argument("find"));
                    ** GOTO lbl416
                }
                case 30: {
                    this.j();
                    ** GOTO lbl416
                }
                case 29: {
                    this.h();
                    ** GOTO lbl416
                }
                case 28: {
                    this.d(var2_2);
                    return;
                }
                case 27: {
                    var7_16 = this.n();
                    break block130;
                }
                case 26: {
                    var7_17 = this.p();
                    break block130;
                }
                case 25: {
                    var13_24 = (String)var1.argument("optionsType");
                    var14_25 = var13_24.hashCode() == 739596306 && var13_24.equals((Object)"InAppBrowserOptions") != false ? 0 : -1;
                    if (var14_25 != 0) {
                        var15_26 = new StringBuilder();
                        var15_26.append("Options ");
                        var15_26.append(var13_24);
                        var15_26.append(" not available.");
                        var2_2.error("InAppBrowserActivity", var15_26.toString(), null);
                    } else {
                        var19_27 = new com.pichillilorenzo.flutter_inappwebview.InAppBrowser.a();
                        var20_28 = (HashMap)var1.argument("options");
                        var19_27.a((Map)var20_28);
                        this.a(var19_27, (HashMap<String, Object>)var20_28);
                    }
                    ** GOTO lbl416
                }
                case 24: {
                    this.e(var2_2);
                    return;
                }
                case 23: {
                    var12_23 = this.n;
                    ** GOTO lbl394
                }
                case 22: {
                    var12_23 = this.A();
                    ** GOTO lbl394
                }
                case 21: {
                    this.K();
                    ** GOTO lbl416
                }
                case 20: {
                    var12_23 = this.b((Integer)var1.argument("steps"));
                    ** GOTO lbl394
                }
                case 19: {
                    this.c((Integer)var1.argument("steps"));
                    ** GOTO lbl416
                }
                case 18: {
                    var12_23 = this.g();
                    ** GOTO lbl394
                }
                case 17: {
                    this.y();
                    ** GOTO lbl416
                }
                case 16: {
                    var12_23 = this.f();
lbl394: // 9 sources:
                    var7_18 = var12_23;
                    break block130;
                }
                case 15: {
                    this.x();
                    ** GOTO lbl416
                }
                case 14: {
                    this.F();
                    ** GOTO lbl416
                }
                case 13: {
                    this.z();
                    ** GOTO lbl416
                }
                case 12: {
                    this.J();
                    ** GOTO lbl416
                }
                case 11: {
                    this.c((String)var1.argument("urlFile"));
                    ** GOTO lbl416
                }
                case 10: {
                    this.b((String)var1.argument("source"));
                    ** GOTO lbl416
                }
                case 9: {
                    this.d((String)var1.argument("urlFile"));
lbl416: // 25 sources:
                    var2_2.success((Object)var5_5);
                    return;
                }
                case 8: {
                    this.a((String)var1.argument("source"), var2_2);
                    return;
                }
                case 7: {
                    this.b(var2_2);
                    return;
                }
                case 6: {
                    var10_29 = (String)var1.argument("url");
                    var11_30 = (Map)var1.argument("headers");
                    if (var11_30 != null) {
                        this.a(var10_29, (Map<String, String>)var11_30, var2_2);
                        return;
                    }
                    this.b(var10_29, var2_2);
                    return;
                }
                case 5: {
                    this.a((String)var1.argument("data"), (String)var1.argument("mimeType"), (String)var1.argument("encoding"), (String)var1.argument("baseUrl"), (String)var1.argument("historyUrl"), var2_2);
                    return;
                }
                case 4: {
                    this.a((String)var1.argument("url"), (byte[])var1.argument("postData"), var2_2);
                    return;
                }
                case 3: {
                    var8_31 = (String)var1.argument("url");
                    var9_32 = (Map)var1.argument("headers");
                    if (var9_32 != null) {
                        this.b(var8_31, (Map<String, String>)var9_32, var2_2);
                        return;
                    }
                    this.c(var8_31, var2_2);
                    return;
                }
                case 2: {
                    var7_19 = this.r();
                    break block130;
                }
                case 1: {
                    var7_20 = this.w();
                    break block130;
                }
                case 0: 
            }
            var7_21 = this.v();
        }
        var2_2.success(var7_22);
    }

    public Map<String, Object> p() {
        Map map = this.g.getOptions();
        com.pichillilorenzo.flutter_inappwebview.InAppBrowser.a a2 = this.k;
        if (a2 != null && map != null) {
            Map map2 = a2.a(this);
            map2.putAll(map);
            return map2;
        }
        return null;
    }

    public String q() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.getOriginalUrl();
        }
        return null;
    }

    public Integer r() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.getProgress();
        }
        return null;
    }

    public void reloadButtonClicked(MenuItem menuItem) {
        this.F();
    }

    public Float s() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.getUpdatedScale();
        }
        return null;
    }

    public void shareButtonClicked(MenuItem menuItem) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.g.getUrl());
        this.startActivity(Intent.createChooser((Intent)intent, (CharSequence)"Share"));
    }

    public Integer t() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.getScrollX();
        }
        return null;
    }

    public Integer u() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.getScrollY();
        }
        return null;
    }

    public String v() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.getUrl();
        }
        return null;
    }

    public String w() {
        InAppWebView inAppWebView = this.g;
        if (inAppWebView != null) {
            return inAppWebView.getTitle();
        }
        return null;
    }

    public void x() {
        if (this.g != null && this.f()) {
            this.g.goBack();
        }
    }

    public void y() {
        if (this.g != null && this.g()) {
            this.g.goForward();
        }
    }

    public void z() {
        try {
            this.n = true;
            Intent intent = new Intent((Context)this, Class.forName((String)this.o));
            intent.setFlags(131072);
            this.startActivityIfNeeded(intent, 0);
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
            Log.d((String)"InAppBrowserActivity", (String)classNotFoundException.getMessage());
            return;
        }
    }
}

