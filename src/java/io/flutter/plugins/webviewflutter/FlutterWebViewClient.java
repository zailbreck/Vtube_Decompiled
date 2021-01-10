/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  androidx.webkit.WebViewClientCompat
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Locale
 *  java.util.Map
 */
package io.flutter.plugins.webviewflutter;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewClientCompat;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.webviewflutter.FlutterWebViewClient;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class FlutterWebViewClient {
    private static final String TAG = "FlutterWebViewClient";
    private boolean hasNavigationDelegate;
    private final MethodChannel methodChannel;

    FlutterWebViewClient(MethodChannel methodChannel) {
        this.methodChannel = methodChannel;
    }

    static /* synthetic */ boolean access$500(FlutterWebViewClient flutterWebViewClient, WebView webView, String string2) {
        return flutterWebViewClient.shouldOverrideUrlLoading(webView, string2);
    }

    private static String errorCodeToString(int n2) {
        switch (n2) {
            default: {
                Locale locale = Locale.getDefault();
                Object[] arrobject = new Object[]{n2};
                throw new IllegalArgumentException(String.format((Locale)locale, (String)"Could not find a string for errorCode: %d", (Object[])arrobject));
            }
            case -1: {
                return "unknown";
            }
            case -2: {
                return "hostLookup";
            }
            case -3: {
                return "unsupportedAuthScheme";
            }
            case -4: {
                return "authentication";
            }
            case -5: {
                return "proxyAuthentication";
            }
            case -6: {
                return "connect";
            }
            case -7: {
                return "io";
            }
            case -8: {
                return "timeout";
            }
            case -9: {
                return "redirectLoop";
            }
            case -10: {
                return "unsupportedScheme";
            }
            case -11: {
                return "failedSslHandshake";
            }
            case -12: {
                return "badUrl";
            }
            case -13: {
                return "file";
            }
            case -14: {
                return "fileNotFound";
            }
            case -15: {
                return "tooManyRequests";
            }
            case -16: 
        }
        return "unsafeResource";
    }

    private WebViewClient internalCreateWebViewClient() {
        return new WebViewClient(){

            public void onPageFinished(WebView webView, String string2) {
                FlutterWebViewClient.this.onPageFinished(webView, string2);
            }

            public void onPageStarted(WebView webView, String string2, Bitmap bitmap) {
                FlutterWebViewClient.this.onPageStarted(webView, string2);
            }

            public void onReceivedError(WebView webView, int n2, String string2, String string3) {
                FlutterWebViewClient.this.onWebResourceError(n2, string2, string3);
            }

            @TargetApi(value=23)
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                FlutterWebViewClient.this.onWebResourceError(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
            }

            public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            }

            @TargetApi(value=24)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                return FlutterWebViewClient.this.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
        };
    }

    private WebViewClientCompat internalCreateWebViewClientCompat() {
        return new WebViewClientCompat(this){
            final /* synthetic */ FlutterWebViewClient this$0;
            {
                this.this$0 = flutterWebViewClient;
            }

            public void onPageFinished(WebView webView, String string2) {
                FlutterWebViewClient.access$300(this.this$0, webView, string2);
            }

            public void onPageStarted(WebView webView, String string2, Bitmap bitmap) {
                FlutterWebViewClient.access$200(this.this$0, webView, string2);
            }

            public void onReceivedError(WebView webView, int n2, String string2, String string3) {
                FlutterWebViewClient.access$400(this.this$0, n2, string2, string3);
            }

            @android.annotation.SuppressLint(value={"RequiresFeature"})
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, androidx.webkit.b b2) {
                FlutterWebViewClient.access$400(this.this$0, b2.b(), b2.a().toString(), webResourceRequest.getUrl().toString());
            }

            public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            }

            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                return FlutterWebViewClient.access$100(this.this$0, webView, webResourceRequest);
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String string2) {
                return FlutterWebViewClient.access$500(this.this$0, webView, string2);
            }
        };
    }

    private void notifyOnNavigationRequest(String string2, Map<String, String> map, WebView webView, boolean bl) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)string2);
        hashMap.put((Object)"isForMainFrame", (Object)bl);
        if (bl) {
            this.methodChannel.invokeMethod("navigationRequest", (Object)hashMap, new MethodChannel.Result(string2, map, webView, null){
                private final Map<String, String> headers;
                private final String url;
                private final WebView webView;
                {
                    this.url = string2;
                    this.headers = map;
                    this.webView = webView;
                }

                private void loadUrl() {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.webView.loadUrl(this.url, this.headers);
                        return;
                    }
                    this.webView.loadUrl(this.url);
                }

                @Override
                public void error(String string2, String string3, Object object) {
                    throw new IllegalStateException("navigationRequest calls must succeed");
                }

                @Override
                public void notImplemented() {
                    throw new IllegalStateException("navigationRequest must be implemented by the webview method channel");
                }

                @Override
                public void success(Object object) {
                    if (((Boolean)object).booleanValue()) {
                        OnNavigationRequestResult.super.loadUrl();
                    }
                }
            });
            return;
        }
        this.methodChannel.invokeMethod("navigationRequest", (Object)hashMap);
    }

    private void onPageFinished(WebView webView, String string2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)string2);
        this.methodChannel.invokeMethod("onPageFinished", (Object)hashMap);
    }

    private void onPageStarted(WebView webView, String string2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)string2);
        this.methodChannel.invokeMethod("onPageStarted", (Object)hashMap);
    }

    private void onWebResourceError(int n2, String string2, String string3) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"errorCode", (Object)n2);
        hashMap.put((Object)"description", (Object)string2);
        hashMap.put((Object)"errorType", (Object)FlutterWebViewClient.errorCodeToString(n2));
        hashMap.put((Object)"failingUrl", (Object)string3);
        this.methodChannel.invokeMethod("onWebResourceError", (Object)hashMap);
    }

    @TargetApi(value=21)
    private boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!this.hasNavigationDelegate) {
            return false;
        }
        FlutterWebViewClient.super.notifyOnNavigationRequest(webResourceRequest.getUrl().toString(), (Map<String, String>)webResourceRequest.getRequestHeaders(), webView, webResourceRequest.isForMainFrame());
        return webResourceRequest.isForMainFrame();
    }

    private boolean shouldOverrideUrlLoading(WebView webView, String string2) {
        if (!this.hasNavigationDelegate) {
            return false;
        }
        Log.w((String)TAG, (String)"Using a navigationDelegate with an old webview implementation, pages with frames or iframes will not work");
        FlutterWebViewClient.super.notifyOnNavigationRequest(string2, null, webView, true);
        return true;
    }

    WebViewClient createWebViewClient(boolean bl) {
        this.hasNavigationDelegate = bl;
        if (bl && Build.VERSION.SDK_INT < 24) {
            return FlutterWebViewClient.super.internalCreateWebViewClientCompat();
        }
        return FlutterWebViewClient.super.internalCreateWebViewClient();
    }

}

