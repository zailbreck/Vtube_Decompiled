/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.KeyEvent
 *  android.view.View
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Set
 */
package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WebViewActivity
extends Activity {
    public static String ACTION_CLOSE = "close action";
    private static String ENABLE_DOM_EXTRA = "enableDomStorage";
    private static String ENABLE_JS_EXTRA = "enableJavaScript";
    private static String URL_EXTRA = "url";
    private final BroadcastReceiver broadcastReceiver = new BroadcastReceiver(){

        public void onReceive(Context context, Intent intent) {
            String string2 = intent.getAction();
            if (WebViewActivity.ACTION_CLOSE.equals((Object)string2)) {
                WebViewActivity.this.finish();
            }
        }
    };
    private IntentFilter closeIntentFilter = new IntentFilter(ACTION_CLOSE);
    private final WebViewClient webViewClient = new WebViewClient(){

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (Build.VERSION.SDK_INT >= 21) {
                webView.loadUrl(webResourceRequest.getUrl().toString());
            }
            return false;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String string2) {
            if (Build.VERSION.SDK_INT < 21) {
                webView.loadUrl(string2);
                return false;
            }
            return super.shouldOverrideUrlLoading(webView, string2);
        }
    };
    private WebView webview;

    public static Intent createIntent(Context context, String string2, boolean bl, boolean bl2, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra(URL_EXTRA, string2).putExtra(ENABLE_JS_EXTRA, bl).putExtra(ENABLE_DOM_EXTRA, bl2).putExtra("com.android.browser.headers", bundle);
    }

    private Map<String, String> extractHeaders(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String string2 : bundle.keySet()) {
            hashMap.put((Object)string2, (Object)bundle.getString(string2));
        }
        return hashMap;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.webview = new WebView((Context)this);
        this.setContentView((View)this.webview);
        Intent intent = this.getIntent();
        String string2 = intent.getStringExtra(URL_EXTRA);
        boolean bl = intent.getBooleanExtra(ENABLE_JS_EXTRA, false);
        boolean bl2 = intent.getBooleanExtra(ENABLE_DOM_EXTRA, false);
        Map<String, String> map = WebViewActivity.super.extractHeaders(intent.getBundleExtra("com.android.browser.headers"));
        this.webview.loadUrl(string2, map);
        this.webview.getSettings().setJavaScriptEnabled(bl);
        this.webview.getSettings().setDomStorageEnabled(bl2);
        this.webview.setWebViewClient(this.webViewClient);
        this.registerReceiver(this.broadcastReceiver, this.closeIntentFilter);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.unregisterReceiver(this.broadcastReceiver);
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        if (n2 == 4 && this.webview.canGoBack()) {
            this.webview.goBack();
            return true;
        }
        return super.onKeyDown(n2, keyEvent);
    }

}

