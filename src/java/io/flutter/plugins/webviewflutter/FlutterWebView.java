/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.hardware.display.DisplayManager
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.webkit.ValueCallback
 *  android.webkit.WebSettings
 *  android.webkit.WebStorage
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  io.flutter.plugin.platform.PlatformView
 *  io.flutter.plugins.webviewflutter.DisplayListenerProxy
 *  io.flutter.plugins.webviewflutter.FlutterWebView$1
 *  io.flutter.plugins.webviewflutter.FlutterWebViewClient
 *  io.flutter.plugins.webviewflutter.InputAwareWebView
 *  io.flutter.plugins.webviewflutter.JavaScriptChannel
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package io.flutter.plugins.webviewflutter;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugins.webviewflutter.DisplayListenerProxy;
import io.flutter.plugins.webviewflutter.FlutterWebView;
import io.flutter.plugins.webviewflutter.FlutterWebViewClient;
import io.flutter.plugins.webviewflutter.InputAwareWebView;
import io.flutter.plugins.webviewflutter.JavaScriptChannel;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FlutterWebView
implements PlatformView,
MethodChannel.MethodCallHandler {
    private static final String JS_CHANNEL_NAMES_FIELD = "javascriptChannelNames";
    private final FlutterWebViewClient flutterWebViewClient;
    private final MethodChannel methodChannel;
    private final Handler platformThreadHandler;
    private final InputAwareWebView webView;

    @TargetApi(value=17)
    FlutterWebView(Context context, BinaryMessenger binaryMessenger, int n2, Map<String, Object> map, View view) {
        DisplayListenerProxy displayListenerProxy = new DisplayListenerProxy();
        DisplayManager displayManager = (DisplayManager)context.getSystemService("display");
        displayListenerProxy.onPreWebViewInitialization(displayManager);
        this.webView = new InputAwareWebView(context, view);
        displayListenerProxy.onPostWebViewInitialization(displayManager);
        this.platformThreadHandler = new Handler(context.getMainLooper());
        this.webView.getSettings().setDomStorageEnabled(true);
        this.webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("plugins.flutter.io/webview_");
        stringBuilder.append(n2);
        this.methodChannel = new MethodChannel(binaryMessenger, stringBuilder.toString());
        this.methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
        this.flutterWebViewClient = new FlutterWebViewClient(this.methodChannel);
        this.applySettings((Map<String, Object>)((Map)map.get((Object)"settings")));
        if (map.containsKey((Object)JS_CHANNEL_NAMES_FIELD)) {
            this.registerJavaScriptChannelNames((List<String>)((List)map.get((Object)JS_CHANNEL_NAMES_FIELD)));
        }
        this.updateAutoMediaPlaybackPolicy((Integer)map.get((Object)"autoMediaPlaybackPolicy"));
        if (map.containsKey((Object)"userAgent")) {
            this.updateUserAgent((String)map.get((Object)"userAgent"));
        }
        if (map.containsKey((Object)"initialUrl")) {
            String string = (String)map.get((Object)"initialUrl");
            this.webView.loadUrl(string);
        }
    }

    private void addJavaScriptChannels(MethodCall methodCall, MethodChannel.Result result) {
        FlutterWebView.super.registerJavaScriptChannelNames((List<String>)((List)methodCall.arguments));
        result.success(null);
    }

    private void applySettings(Map<String, Object> map) {
        for (String string : map.keySet()) {
            int n2 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1670862916: {
                    if (!string.equals((Object)"gestureNavigationEnabled")) break;
                    n2 = 3;
                    break;
                }
                case 858297331: {
                    if (!string.equals((Object)"hasNavigationDelegate")) break;
                    n2 = 1;
                    break;
                }
                case 311430650: {
                    if (!string.equals((Object)"userAgent")) break;
                    n2 = 4;
                    break;
                }
                case -1069908877: {
                    if (!string.equals((Object)"debuggingEnabled")) break;
                    n2 = 2;
                    break;
                }
                case -1151668596: {
                    if (!string.equals((Object)"jsMode")) break;
                    n2 = 0;
                }
            }
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 == 3) continue;
                        if (n2 == 4) {
                            FlutterWebView.super.updateUserAgent((String)map.get((Object)string));
                            continue;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown WebView setting: ");
                        stringBuilder.append(string);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    WebView.setWebContentsDebuggingEnabled((boolean)((Boolean)map.get((Object)string)));
                    continue;
                }
                boolean bl = (Boolean)map.get((Object)string);
                WebViewClient webViewClient = this.flutterWebViewClient.createWebViewClient(bl);
                this.webView.setWebViewClient(webViewClient);
                continue;
            }
            FlutterWebView.super.updateJsMode((Integer)map.get((Object)string));
        }
    }

    private void canGoBack(MethodChannel.Result result) {
        result.success((Object)this.webView.canGoBack());
    }

    private void canGoForward(MethodChannel.Result result) {
        result.success((Object)this.webView.canGoForward());
    }

    private void clearCache(MethodChannel.Result result) {
        this.webView.clearCache(true);
        WebStorage.getInstance().deleteAllData();
        result.success(null);
    }

    private void currentUrl(MethodChannel.Result result) {
        result.success((Object)this.webView.getUrl());
    }

    @TargetApi(value=19)
    private void evaluateJavaScript(MethodCall methodCall, MethodChannel.Result result) {
        String string = (String)methodCall.arguments;
        if (string != null) {
            this.webView.evaluateJavascript(string, (ValueCallback)new 1((FlutterWebView)this, result));
            return;
        }
        throw new UnsupportedOperationException("JavaScript string cannot be null");
    }

    private void getScrollX(MethodChannel.Result result) {
        result.success((Object)this.webView.getScrollX());
    }

    private void getScrollY(MethodChannel.Result result) {
        result.success((Object)this.webView.getScrollY());
    }

    private void getTitle(MethodChannel.Result result) {
        result.success((Object)this.webView.getTitle());
    }

    private void goBack(MethodChannel.Result result) {
        if (this.webView.canGoBack()) {
            this.webView.goBack();
        }
        result.success(null);
    }

    private void goForward(MethodChannel.Result result) {
        if (this.webView.canGoForward()) {
            this.webView.goForward();
        }
        result.success(null);
    }

    private void loadUrl(MethodCall methodCall, MethodChannel.Result result) {
        Map map = (Map)methodCall.arguments;
        String string = (String)map.get((Object)"url");
        Map map2 = (Map)map.get((Object)"headers");
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        this.webView.loadUrl(string, map2);
        result.success(null);
    }

    private void registerJavaScriptChannelNames(List<String> list) {
        for (String string : list) {
            this.webView.addJavascriptInterface((Object)new JavaScriptChannel(this.methodChannel, string, this.platformThreadHandler), string);
        }
    }

    private void reload(MethodChannel.Result result) {
        this.webView.reload();
        result.success(null);
    }

    private void removeJavaScriptChannels(MethodCall methodCall, MethodChannel.Result result) {
        for (String string : (List)methodCall.arguments) {
            this.webView.removeJavascriptInterface(string);
        }
        result.success(null);
    }

    private void scrollBy(MethodCall methodCall, MethodChannel.Result result) {
        Map map = (Map)methodCall.arguments;
        int n2 = (Integer)map.get((Object)"x");
        int n3 = (Integer)map.get((Object)"y");
        this.webView.scrollBy(n2, n3);
        result.success(null);
    }

    private void scrollTo(MethodCall methodCall, MethodChannel.Result result) {
        Map map = (Map)methodCall.arguments;
        int n2 = (Integer)map.get((Object)"x");
        int n3 = (Integer)map.get((Object)"y");
        this.webView.scrollTo(n2, n3);
        result.success(null);
    }

    private void updateAutoMediaPlaybackPolicy(int n2) {
        int n3 = 1;
        if (n2 == n3) {
            n3 = 0;
        }
        this.webView.getSettings().setMediaPlaybackRequiresUserGesture((boolean)n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void updateJsMode(int n2) {
        int n3;
        WebSettings webSettings;
        if (n2 != 0) {
            n3 = 1;
            if (n2 != n3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Trying to set unknown JavaScript mode: ");
                stringBuilder.append(n2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            webSettings = this.webView.getSettings();
        } else {
            webSettings = this.webView.getSettings();
            n3 = 0;
        }
        webSettings.setJavaScriptEnabled((boolean)n3);
    }

    private void updateSettings(MethodCall methodCall, MethodChannel.Result result) {
        FlutterWebView.super.applySettings((Map<String, Object>)((Map)methodCall.arguments));
        result.success(null);
    }

    private void updateUserAgent(String string) {
        this.webView.getSettings().setUserAgentString(string);
    }

    public void dispose() {
        this.methodChannel.setMethodCallHandler(null);
        this.webView.dispose();
        this.webView.destroy();
    }

    public View getView() {
        return this.webView;
    }

    public void onFlutterViewAttached(View view) {
        this.webView.setContainerView(view);
    }

    public void onFlutterViewDetached() {
        this.webView.setContainerView(null);
    }

    public void onInputConnectionLocked() {
        this.webView.lockInputConnection();
    }

    public void onInputConnectionUnlocked() {
        this.webView.unlockInputConnection();
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        int n2;
        block38 : {
            String string = methodCall.method;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1966196898: {
                    if (!string.equals((Object)"getTitle")) break;
                    n2 = 12;
                    break block38;
                }
                case 1937913574: {
                    if (!string.equals((Object)"evaluateJavascript")) break;
                    n2 = 8;
                    break block38;
                }
                case 651673601: {
                    if (!string.equals((Object)"removeJavascriptChannels")) break;
                    n2 = 10;
                    break block38;
                }
                case 336631465: {
                    if (!string.equals((Object)"loadUrl")) break;
                    n2 = 0;
                    break block38;
                }
                case -317054497: {
                    if (!string.equals((Object)"canGoBack")) break;
                    n2 = 2;
                    break block38;
                }
                case -318289731: {
                    if (!string.equals((Object)"goForward")) break;
                    n2 = 5;
                    break block38;
                }
                case -402165208: {
                    if (!string.equals((Object)"scrollTo")) break;
                    n2 = 13;
                    break block38;
                }
                case -402165756: {
                    if (!string.equals((Object)"scrollBy")) break;
                    n2 = 14;
                    break block38;
                }
                case -759238347: {
                    if (!string.equals((Object)"clearCache")) break;
                    n2 = 11;
                    break block38;
                }
                case -934641255: {
                    if (!string.equals((Object)"reload")) break;
                    n2 = 6;
                    break block38;
                }
                case -1067273523: {
                    if (!string.equals((Object)"canGoForward")) break;
                    n2 = 3;
                    break block38;
                }
                case -1088982730: {
                    if (!string.equals((Object)"currentUrl")) break;
                    n2 = 7;
                    break block38;
                }
                case -1241591313: {
                    if (!string.equals((Object)"goBack")) break;
                    n2 = 4;
                    break block38;
                }
                case -1331417354: {
                    if (!string.equals((Object)"getScrollY")) break;
                    n2 = 16;
                    break block38;
                }
                case -1331417355: {
                    if (!string.equals((Object)"getScrollX")) break;
                    n2 = 15;
                    break block38;
                }
                case -1707388194: {
                    if (!string.equals((Object)"addJavascriptChannels")) break;
                    n2 = 9;
                    break block38;
                }
                case -1990164468: {
                    if (!string.equals((Object)"updateSettings")) break;
                    n2 = 1;
                    break block38;
                }
            }
            n2 = -1;
        }
        switch (n2) {
            default: {
                result.notImplemented();
                return;
            }
            case 16: {
                FlutterWebView.super.getScrollY(result);
                return;
            }
            case 15: {
                FlutterWebView.super.getScrollX(result);
                return;
            }
            case 14: {
                FlutterWebView.super.scrollBy(methodCall, result);
                return;
            }
            case 13: {
                FlutterWebView.super.scrollTo(methodCall, result);
                return;
            }
            case 12: {
                FlutterWebView.super.getTitle(result);
                return;
            }
            case 11: {
                FlutterWebView.super.clearCache(result);
                return;
            }
            case 10: {
                FlutterWebView.super.removeJavaScriptChannels(methodCall, result);
                return;
            }
            case 9: {
                FlutterWebView.super.addJavaScriptChannels(methodCall, result);
                return;
            }
            case 8: {
                FlutterWebView.super.evaluateJavaScript(methodCall, result);
                return;
            }
            case 7: {
                FlutterWebView.super.currentUrl(result);
                return;
            }
            case 6: {
                FlutterWebView.super.reload(result);
                return;
            }
            case 5: {
                FlutterWebView.super.goForward(result);
                return;
            }
            case 4: {
                FlutterWebView.super.goBack(result);
                return;
            }
            case 3: {
                FlutterWebView.super.canGoForward(result);
                return;
            }
            case 2: {
                FlutterWebView.super.canGoBack(result);
                return;
            }
            case 1: {
                FlutterWebView.super.updateSettings(methodCall, result);
                return;
            }
            case 0: 
        }
        FlutterWebView.super.loadUrl(methodCall, result);
    }
}

