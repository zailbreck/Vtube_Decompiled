/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.net.http.SslCertificate
 *  android.net.http.SslError
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Message
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.webkit.ClientCertRequest
 *  android.webkit.CookieManager
 *  android.webkit.CookieSyncManager
 *  android.webkit.HttpAuthHandler
 *  android.webkit.RenderProcessGoneDetail
 *  android.webkit.SafeBrowsingResponse
 *  android.webkit.SslErrorHandler
 *  android.webkit.ValueCallback
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.SearchView
 *  java.io.ByteArrayInputStream
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.SearchView;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.f;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.g;
import f.g.a.r;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f
extends WebViewClient {
    private static int d;
    private static List<f.g.a.c.a> e;
    private com.pichillilorenzo.flutter_inappwebview.InAppWebView.c a;
    private InAppBrowserActivity b;
    public MethodChannel c;

    public f(Object object) {
        if (object instanceof InAppBrowserActivity) {
            this.b = (InAppBrowserActivity)object;
        } else if (object instanceof com.pichillilorenzo.flutter_inappwebview.InAppWebView.c) {
            this.a = (com.pichillilorenzo.flutter_inappwebview.InAppWebView.c)object;
        }
        InAppBrowserActivity inAppBrowserActivity = this.b;
        MethodChannel methodChannel = inAppBrowserActivity != null ? inAppBrowserActivity.d : this.a.c;
        this.c = methodChannel;
    }

    static /* synthetic */ int a(int n2) {
        d = n2;
        return n2;
    }

    static /* synthetic */ List a(List list) {
        e = list;
        return list;
    }

    static /* synthetic */ void a(f f2, WebView webView, Message message, Message message2) {
        super.onFormResubmission(webView, message, message2);
    }

    static /* synthetic */ void a(f f2, WebView webView, ClientCertRequest clientCertRequest) {
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    static /* synthetic */ void a(f f2, WebView webView, HttpAuthHandler httpAuthHandler, String string, String string2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, string, string2);
    }

    static /* synthetic */ void a(f f2, WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    static /* synthetic */ void a(f f2, WebView webView, WebResourceRequest webResourceRequest, int n2, SafeBrowsingResponse safeBrowsingResponse) {
        super.onSafeBrowsingHit(webView, webResourceRequest, n2, safeBrowsingResponse);
    }

    static /* synthetic */ List b() {
        return e;
    }

    static /* synthetic */ void b(f f2, WebView webView, Message message, Message message2) {
        super.onFormResubmission(webView, message, message2);
    }

    static /* synthetic */ void b(f f2, WebView webView, ClientCertRequest clientCertRequest) {
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    static /* synthetic */ void b(f f2, WebView webView, HttpAuthHandler httpAuthHandler, String string, String string2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, string, string2);
    }

    static /* synthetic */ void b(f f2, WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    static /* synthetic */ void b(f f2, WebView webView, WebResourceRequest webResourceRequest, int n2, SafeBrowsingResponse safeBrowsingResponse) {
        super.onSafeBrowsingHit(webView, webResourceRequest, n2, safeBrowsingResponse);
    }

    public WebResourceResponse a(Object object) {
        r.e e2;
        block9 : {
            Boolean bl;
            Boolean bl2;
            Map map;
            String string;
            String string2 = object instanceof String ? (String)object : null;
            Boolean bl3 = false;
            Boolean bl4 = true;
            Boolean bl5 = false;
            if (Build.VERSION.SDK_INT >= 21 && object instanceof WebResourceRequest) {
                WebResourceRequest webResourceRequest = (WebResourceRequest)object;
                string2 = webResourceRequest.getUrl().toString();
                map = webResourceRequest.getRequestHeaders();
                bl = webResourceRequest.hasGesture();
                bl2 = webResourceRequest.isForMainFrame();
                if (Build.VERSION.SDK_INT >= 24) {
                    bl5 = webResourceRequest.isRedirect();
                }
            } else {
                bl2 = bl4;
                bl = bl3;
                map = null;
            }
            HashMap hashMap = new HashMap();
            InAppBrowserActivity inAppBrowserActivity = this.b;
            if (inAppBrowserActivity != null) {
                hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
            }
            hashMap.put((Object)"url", (Object)string2);
            hashMap.put((Object)"method", (Object)"GET");
            hashMap.put((Object)"headers", (Object)map);
            hashMap.put((Object)"isForMainFrame", (Object)bl2);
            hashMap.put((Object)"hasGesture", (Object)bl);
            hashMap.put((Object)"isRedirect", (Object)bl5);
            try {
                e2 = r.a(this.c, "shouldInterceptRequest", (Object)hashMap);
                string = e2.b;
                if (string == null) break block9;
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                return null;
            }
            Log.e((String)"IAWebViewClient", (String)string);
            return null;
        }
        Object object2 = e2.a;
        if (object2 != null) {
            Map map = (Map)object2;
            String string = (String)map.get((Object)"contentType");
            String string3 = (String)map.get((Object)"contentEncoding");
            byte[] arrby = (byte[])map.get((Object)"data");
            Map map2 = (Map)map.get((Object)"headers");
            Integer n2 = (Integer)map.get((Object)"statusCode");
            String string4 = (String)map.get((Object)"reasonPhrase");
            ByteArrayInputStream byteArrayInputStream = null;
            if (arrby != null) {
                byteArrayInputStream = new ByteArrayInputStream(arrby);
            }
            ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
            if (map2 == null && n2 == null && string4 == null || Build.VERSION.SDK_INT < 21) {
                return new WebResourceResponse(string, string3, (InputStream)byteArrayInputStream2);
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(string, string3, n2.intValue(), string4, map2, (InputStream)byteArrayInputStream2);
            return webResourceResponse;
        }
        return null;
    }

    public void a() {
        this.c.setMethodCallHandler(null);
        if (this.b != null) {
            this.b = null;
        }
        if (this.a != null) {
            this.a = null;
        }
    }

    public void a(InAppWebView inAppWebView, String string, String string2, Map<String, String> map, boolean bl, boolean bl2, boolean bl3) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)string);
        hashMap.put((Object)"method", (Object)string2);
        hashMap.put((Object)"headers", map);
        hashMap.put((Object)"isForMainFrame", (Object)bl);
        hashMap.put((Object)"androidHasGesture", (Object)bl2);
        hashMap.put((Object)"androidIsRedirect", (Object)bl3);
        hashMap.put((Object)"iosWKNavigationType", null);
        MethodChannel methodChannel = this.c;
        MethodChannel.Result result = new MethodChannel.Result(this, bl, inAppWebView, string, map){
            final /* synthetic */ boolean a;
            final /* synthetic */ InAppWebView b;
            final /* synthetic */ String c;
            final /* synthetic */ Map d;
            {
                this.a = bl;
                this.b = inAppWebView;
                this.c = string;
                this.d = map;
            }

            public void error(String string, String string2, Object object) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ERROR: ");
                stringBuilder.append(string);
                stringBuilder.append(" ");
                stringBuilder.append(string2);
                Log.d((String)"IAWebViewClient", (String)stringBuilder.toString());
            }

            public void notImplemented() {
            }

            public void success(Object object) {
                Integer n2;
                if (object != null && (n2 = (Integer)((Map)object).get((Object)"action")) != null) {
                    if (n2 != 1) {
                        return;
                    }
                    if (this.a) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.b.loadUrl(this.c, this.d);
                            return;
                        }
                        this.b.loadUrl(this.c);
                    }
                }
            }
        };
        methodChannel.invokeMethod("shouldOverrideUrlLoading", (Object)hashMap, result);
    }

    public void doUpdateVisitedHistory(WebView webView, String string, boolean bl) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)string);
        hashMap.put((Object)"androidIsReload", (Object)bl);
        this.c.invokeMethod("onUpdateVisitedHistory", (Object)hashMap);
        super.doUpdateVisitedHistory(webView, string, bl);
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)webView.getUrl());
        this.c.invokeMethod("onFormResubmission", (Object)hashMap, new MethodChannel.Result((f)this, message2, message, webView){
            final /* synthetic */ Message a;
            final /* synthetic */ Message b;
            final /* synthetic */ WebView c;
            final /* synthetic */ f d;
            {
                this.d = f2;
                this.a = message;
                this.b = message2;
                this.c = webView;
            }

            public void error(String string, String string2, Object object) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ERROR: ");
                stringBuilder.append(string);
                stringBuilder.append(" ");
                stringBuilder.append(string2);
                Log.d((String)"IAWebViewClient", (String)stringBuilder.toString());
            }

            public void notImplemented() {
                f.b(this.d, this.c, this.b, this.a);
            }

            public void success(Object object) {
                Integer n2;
                if (object != null && (n2 = (Integer)((Map)object).get((Object)"action")) != null) {
                    if (n2 != 0) {
                        this.b.sendToTarget();
                        return;
                    }
                    this.a.sendToTarget();
                    return;
                }
                f.a(this.d, this.c, this.b, this.a);
            }
        });
    }

    public void onPageCommitVisible(WebView webView, String string) {
        super.onPageCommitVisible(webView, string);
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)string);
        this.c.invokeMethod("onPageCommitVisible", (Object)hashMap);
    }

    public void onPageFinished(WebView webView, String string) {
        InAppWebView inAppWebView = (InAppWebView)webView;
        super.onPageFinished(webView, string);
        inAppWebView.n = false;
        d = 0;
        e = null;
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().flush();
        } else {
            CookieSyncManager.getInstance().sync();
        }
        String string2 = "(function() {  if (window.flutter_inappwebview._platformReady == null) {    window.dispatchEvent(new Event('flutterInAppWebViewPlatformReady'));    window.flutter_inappwebview._platformReady = true;  }})();".replaceAll("[\r\n]+", "");
        if (Build.VERSION.SDK_INT >= 19) {
            inAppWebView.evaluateJavascript(string2, null);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("javascript:");
            stringBuilder.append(string2);
            inAppWebView.loadUrl(stringBuilder.toString());
        }
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)string);
        this.c.invokeMethod("onLoadStop", (Object)hashMap);
    }

    public void onPageStarted(WebView webView, String string, Bitmap bitmap) {
        SearchView searchView;
        InAppWebView inAppWebView = (InAppWebView)webView;
        String string2 = "(function(console) {   var oldLogs = {       'log': console.log,       'debug': console.debug,       'error': console.error,       'info': console.info,       'warn': console.warn   };   for (var k in oldLogs) {       (function(oldLog) {           console[oldLog] = function() {               var message = '';               for (var i in arguments) {                   if (message == '') {                       message += arguments[i];                   }                   else {                       message += ' ' + arguments[i];                   }               }               oldLogs[oldLog].call(console, message);           }       })(k);   }})(window.console);".replaceAll("[\r\n]+", "");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("if (window.Promise == null) {  !function(t,e){\"object\"==typeof exports&&\"undefined\"!=typeof module?e(exports):\"function\"==typeof define&&define.amd?define([\"exports\"],e):e(t.RSVP={})}(this,function(t){\"use strict\";function e(t){var e=t._promiseCallbacks;return e||(e=t._promiseCallbacks={}),e}var r={mixin:function(t){return t.on=this.on,t.off=this.off,t.trigger=this.trigger,t._promiseCallbacks=void 0,t},on:function(t,r){if(\"function\"!=typeof r)throw new TypeError(\"Callback must be a function\");var n=e(this),o=n[t];o||(o=n[t]=[]),-1===o.indexOf(r)&&o.push(r)},off:function(t,r){var n=e(this);if(r){var o=n[t],i=o.indexOf(r);-1!==i&&o.splice(i,1)}else n[t]=[]},trigger:function(t,r,n){var o=e(this)[t];if(o)for(var i=0;i<o.length;i++)(0,o[i])(r,n)}},n={instrument:!1};function o(t,e){if(2!==arguments.length)return n[t];n[t]=e}r.mixin(n);var i=[];function s(t,e,r){1===i.push({name:t,payload:{key:e._guidKey,id:e._id,eventName:t,detail:e._result,childId:r&&r._id,label:e._label,timeStamp:Date.now(),error:n[\"instrument-with-stack\"]?new Error(e._label):null}})&&setTimeout(function(){for(var t=0;t<i.length;t++){var e=i[t],r=e.payload;r.guid=r.key+r.id,r.childGuid=r.key+r.childId,r.error&&(r.stack=r.error.stack),n.trigger(e.name,e.payload)}i.length=0},50)}function u(t,e){if(t&&\"object\"==typeof t&&t.constructor===this)return t;var r=new this(c,e);return m(r,t),r}function c(){}var a=void 0,f=1,l=2,h={error:null};function p(t){try{return t.then}catch(t){return h.error=t,h}}var y=void 0;function _(){try{var t=y;return y=null,t.apply(this,arguments)}catch(t){return h.error=t,h}}function v(t){return y=t,_}function d(t,e,r){if(e.constructor===t.constructor&&r===A&&t.constructor.resolve===u)!function(t,e){e._state===f?b(t,e._result):e._state===l?(e._onError=null,g(t,e._result)):j(e,void 0,function(r){e===r?b(t,r):m(t,r)},function(e){return g(t,e)})}(t,e);else if(r===h){var o=h.error;h.error=null,g(t,o)}else\"function\"==typeof r?function(t,e,r){n.async(function(t){var n=!1,o=v(r).call(e,function(r){n||(n=!0,e===r?b(t,r):m(t,r))},function(e){n||(n=!0,g(t,e))},\"Settle: \"+(t._label||\" unknown promise\"));if(!n&&o===h){n=!0;var i=h.error;h.error=null,g(t,i)}},t)}(t,e,r):b(t,e)}function m(t,e){var r,n;t===e?b(t,e):(n=typeof(r=e),null===r||\"object\"!==n&&\"function\"!==n?b(t,e):d(t,e,p(e)))}function w(t){t._onError&&t._onError(t._result),O(t)}function b(t,e){t._state===a&&(t._result=e,t._state=f,0===t._subscribers.length?n.instrument&&s(\"fulfilled\",t):n.async(O,t))}function g(t,e){t._state===a&&(t._state=l,t._result=e,n.async(w,t))}function j(t,e,r,o){var i=t._subscribers,s=i.length;t._onError=null,i[s]=e,i[s+f]=r,i[s+l]=o,0===s&&t._state&&n.async(O,t)}function O(t){var e=t._subscribers,r=t._state;if(n.instrument&&s(r===f?\"fulfilled\":\"rejected\",t),0!==e.length){for(var o=void 0,i=void 0,u=t._result,c=0;c<e.length;c+=3)o=e[c],i=e[c+r],o?E(r,o,i,u):i(u);t._subscribers.length=0}}function E(t,e,r,n){var o=\"function\"==typeof r,i=void 0;if(i=o?v(r)(n):n,e._state!==a);else if(i===e)g(e,new TypeError(\"A promises callback cannot return that same promise.\"));else if(i===h){var s=h.error;h.error=null,g(e,s)}else o?m(e,i):t===f?b(e,i):t===l&&g(e,i)}function A(t,e,r){var o=this._state;if(o===f&&!t||o===l&&!e)return n.instrument&&s(\"chained\",this,this),this;this._onError=null;var i=new this.constructor(c,r),u=this._result;if(n.instrument&&s(\"chained\",this,i),o===a)j(this,i,t,e);else{var h=o===f?t:e;n.async(function(){return E(o,i,h,u)})}return i}var T=function(){function t(t,e,r,n){this._instanceConstructor=t,this.promise=new t(c,n),this._abortOnReject=r,this._isUsingOwnPromise=t===k,this._isUsingOwnResolve=t.resolve===u,this._init.apply(this,arguments)}return t.prototype._init=function(t,e){var r=e.length||0;this.length=r,this._remaining=r,this._result=new Array(r),this._enumerate(e)},t.prototype._enumerate=function(t){for(var e=this.length,r=this.promise,n=0;r._state===a&&n<e;n++)this._eachEntry(t[n],n,!0);this._checkFullfillment()},t.prototype._checkFullfillment=function(){if(0===this._remaining){var t=this._result;b(this.promise,t),this._result=null}},t.prototype._settleMaybeThenable=function(t,e,r){var n=this._instanceConstructor;if(this._isUsingOwnResolve){var o=p(t);if(o===A&&t._state!==a)t._onError=null,this._settledAt(t._state,e,t._result,r);else if(\"function\"!=typeof o)this._settledAt(f,e,t,r);else if(this._isUsingOwnPromise){var i=new n(c);d(i,t,o),this._willSettleAt(i,e,r)}else this._willSettleAt(new n(function(e){return e(t)}),e,r)}else this._willSettleAt(n.resolve(t),e,r)},t.prototype._eachEntry=function(t,e,r){null!==t&&\"object\"==typeof t?this._settleMaybeThenable(t,e,r):this._setResultAt(f,e,t,r)},t.prototype._settledAt=function(t,e,r,n){var o=this.promise;o._state===a&&(this._abortOnReject&&t===l?g(o,r):(this._setResultAt(t,e,r,n),this._checkFullfillment()))},t.prototype._setResultAt=function(t,e,r,n){this._remaining--,this._result[e]=r},t.prototype._willSettleAt=function(t,e,r){var n=this;j(t,void 0,function(t){return n._settledAt(f,e,t,r)},function(t){return n._settledAt(l,e,t,r)})},t}();function P(t,e,r){this._remaining--,this._result[e]=t===f?{state:\"fulfilled\",value:r}:{state:\"rejected\",reason:r}}var S=\"rsvp_\"+Date.now()+\"-\",R=0;var k=function(){function t(e,r){this._id=R++,this._label=r,this._state=void 0,this._result=void 0,this._subscribers=[],n.instrument&&s(\"created\",this),c!==e&&(\"function\"!=typeof e&&function(){throw new TypeError(\"You must pass a resolver function as the first argument to the promise constructor\")}(),this instanceof t?function(t,e){var r=!1;try{e(function(e){r||(r=!0,m(t,e))},function(e){r||(r=!0,g(t,e))})}catch(e){g(t,e)}}(this,e):function(){throw new TypeError(\"Failed to construct 'Promise': Please use the 'new' operator, this object constructor cannot be called as a function.\")}())}return t.prototype._onError=function(t){var e=this;n.after(function(){e._onError&&n.trigger(\"error\",t,e._label)})},t.prototype.catch=function(t,e){return this.then(void 0,t,e)},t.prototype.finally=function(t,e){var r=this.constructor;return\"function\"==typeof t?this.then(function(e){return r.resolve(t()).then(function(){return e})},function(e){return r.resolve(t()).then(function(){throw e})}):this.then(t,t)},t}();function x(t,e){return{then:function(r,n){return t.call(e,r,n)}}}function M(t,e){var r=function(){for(var r=arguments.length,n=new Array(r+1),o=!1,i=0;i<r;++i){var s=arguments[i];if(!o){if((o=F(s))===h){var u=h.error;h.error=null;var a=new k(c);return g(a,u),a}o&&!0!==o&&(s=x(o,s))}n[i]=s}var f=new k(c);return n[r]=function(t,r){t?g(f,t):void 0===e?m(f,r):!0===e?m(f,function(t){for(var e=t.length,r=new Array(e-1),n=1;n<e;n++)r[n-1]=t[n];return r}(arguments)):Array.isArray(e)?m(f,function(t,e){for(var r={},n=t.length,o=new Array(n),i=0;i<n;i++)o[i]=t[i];for(var s=0;s<e.length;s++)r[e[s]]=o[s+1];return r}(arguments,e)):m(f,r)},o?function(t,e,r,n){return k.all(e).then(function(e){return C(t,e,r,n)})}(f,n,t,this):C(f,n,t,this)};return r.__proto__=t,r}function C(t,e,r,n){if(v(r).apply(n,e)===h){var o=h.error;h.error=null,g(t,o)}return t}function F(t){return null!==t&&\"object\"==typeof t&&(t.constructor===k||p(t))}function I(t,e){return k.all(t,e)}k.cast=u,k.all=function(t,e){return Array.isArray(t)?new T(this,t,!0,e).promise:this.reject(new TypeError(\"Promise.all must be called with an array\"),e)},k.race=function(t,e){var r=new this(c,e);if(!Array.isArray(t))return g(r,new TypeError(\"Promise.race must be called with an array\")),r;for(var n=0;r._state===a&&n<t.length;n++)j(this.resolve(t[n]),void 0,function(t){return m(r,t)},function(t){return g(r,t)});return r},k.resolve=u,k.reject=function(t,e){var r=new this(c,e);return g(r,t),r},k.prototype._guidKey=S,k.prototype.then=A;var N=function(t){function e(e,r,n){return function(t,e){if(!t)throw new ReferenceError(\"this hasn't been initialised - super() hasn't been called\");return!e||\"object\"!=typeof e&&\"function\"!=typeof e?t:e}(this,t.call(this,e,r,!1,n))}return function(t,e){if(\"function\"!=typeof e&&null!==e)throw new TypeError(\"Super expression must either be null or a function, not \"+typeof e);t.prototype=Object.create(e&&e.prototype,{constructor:{value:t,enumerable:!1,writable:!0,configurable:!0}}),e&&(Object.setPrototypeOf?Object.setPrototypeOf(t,e):t.__proto__=e)}(e,t),e}(T);function U(t,e){return Array.isArray(t)?new N(k,t,e).promise:k.reject(new TypeError(\"Promise.allSettled must be called with an array\"),e)}function D(t,e){return k.race(t,e)}N.prototype._setResultAt=P;var K=function(t){function e(e,r){var n=!(arguments.length>2&&void 0!==arguments[2])||arguments[2],o=arguments[3];return function(t,e){if(!t)throw new ReferenceError(\"this hasn't been initialised - super() hasn't been called\");return!e||\"object\"!=typeof e&&\"function\"!=typeof e?t:e}(this,t.call(this,e,r,n,o))}return function(t,e){if(\"function\"!=typeof e&&null!==e)throw new TypeError(\"Super expression must either be null or a function, not \"+typeof e);t.prototype=Object.create(e&&e.prototype,{constructor:{value:t,enumerable:!1,writable:!0,configurable:!0}}),e&&(Object.setPrototypeOf?Object.setPrototypeOf(t,e):t.__proto__=e)}(e,t),e.prototype._init=function(t,e){this._result={},this._enumerate(e)},e.prototype._enumerate=function(t){var e=Object.keys(t),r=e.length,n=this.promise;this._remaining=r;for(var o=void 0,i=void 0,s=0;n._state===a&&s<r;s++)i=t[o=e[s]],this._eachEntry(i,o,!0);this._checkFullfillment()},e}(T);function q(t,e){return k.resolve(t,e).then(function(t){if(null===t||\"object\"!=typeof t)throw new TypeError(\"Promise.hash must be called with an object\");return new K(k,t,e).promise})}var G=function(t){function e(e,r,n){return function(t,e){if(!t)throw new ReferenceError(\"this hasn't been initialised - super() hasn't been called\");return!e||\"object\"!=typeof e&&\"function\"!=typeof e?t:e}(this,t.call(this,e,r,!1,n))}return function(t,e){if(\"function\"!=typeof e&&null!==e)throw new TypeError(\"Super expression must either be null or a function, not \"+typeof e);t.prototype=Object.create(e&&e.prototype,{constructor:{value:t,enumerable:!1,writable:!0,configurable:!0}}),e&&(Object.setPrototypeOf?Object.setPrototypeOf(t,e):t.__proto__=e)}(e,t),e}(K);function L(t,e){return k.resolve(t,e).then(function(t){if(null===t||\"object\"!=typeof t)throw new TypeError(\"hashSettled must be called with an object\");return new G(k,t,!1,e).promise})}function V(t){throw setTimeout(function(){throw t}),t}function W(t){var e={resolve:void 0,reject:void 0};return e.promise=new k(function(t,r){e.resolve=t,e.reject=r},t),e}G.prototype._setResultAt=P;var Y=function(t){function e(e,r,n,o){return function(t,e){if(!t)throw new ReferenceError(\"this hasn't been initialised - super() hasn't been called\");return!e||\"object\"!=typeof e&&\"function\"!=typeof e?t:e}(this,t.call(this,e,r,!0,o,n))}return function(t,e){if(\"function\"!=typeof e&&null!==e)throw new TypeError(\"Super expression must either be null or a function, not \"+typeof e);t.prototype=Object.create(e&&e.prototype,{constructor:{value:t,enumerable:!1,writable:!0,configurable:!0}}),e&&(Object.setPrototypeOf?Object.setPrototypeOf(t,e):t.__proto__=e)}(e,t),e.prototype._init=function(t,e,r,n,o){var i=e.length||0;this.length=i,this._remaining=i,this._result=new Array(i),this._mapFn=o,this._enumerate(e)},e.prototype._setResultAt=function(t,e,r,n){if(n){var o=v(this._mapFn)(r,e);o===h?this._settledAt(l,e,o.error,!1):this._eachEntry(o,e,!1)}else this._remaining--,this._result[e]=r},e}(T);function $(t,e,r){return\"function\"!=typeof e?k.reject(new TypeError(\"map expects a function as a second argument\"),r):k.resolve(t,r).then(function(t){if(!Array.isArray(t))throw new TypeError(\"map must be called with an array\");return new Y(k,t,e,r).promise})}function z(t,e){return k.resolve(t,e)}function B(t,e){return k.reject(t,e)}var H={},J=function(t){function e(){return function(t,e){if(!t)throw new ReferenceError(\"this hasn't been initialised - super() hasn't been called\");return!e||\"object\"!=typeof e&&\"function\"!=typeof e?t:e}(this,t.apply(this,arguments))}return function(t,e){if(\"function\"!=typeof e&&null!==e)throw new TypeError(\"Super expression must either be null or a function, not \"+typeof e);t.prototype=Object.create(e&&e.prototype,{constructor:{value:t,enumerable:!1,writable:!0,configurable:!0}}),e&&(Object.setPrototypeOf?Object.setPrototypeOf(t,e):t.__proto__=e)}(e,t),e.prototype._checkFullfillment=function(){if(0===this._remaining&&null!==this._result){var t=this._result.filter(function(t){return t!==H});b(this.promise,t),this._result=null}},e.prototype._setResultAt=function(t,e,r,n){if(n){this._result[e]=r;var o=v(this._mapFn)(r,e);o===h?this._settledAt(l,e,o.error,!1):this._eachEntry(o,e,!1)}else this._remaining--,r||(this._result[e]=H)},e}(Y);function Q(t,e,r){return\"function\"!=typeof e?k.reject(new TypeError(\"filter expects function as a second argument\"),r):k.resolve(t,r).then(function(t){if(!Array.isArray(t))throw new TypeError(\"filter must be called with an array\");return new J(k,t,e,r).promise})}var X=0,Z=void 0;function tt(t,e){ut[X]=t,ut[X+1]=e,2===(X+=2)&&_t()}var et=\"undefined\"!=typeof window?window:void 0,rt=et||{},nt=rt.MutationObserver||rt.WebKitMutationObserver,ot=\"undefined\"==typeof self&&\"undefined\"!=typeof process&&\"[object process]\"==={}.toString.call(process),it=\"undefined\"!=typeof Uint8ClampedArray&&\"undefined\"!=typeof importScripts&&\"undefined\"!=typeof MessageChannel;function st(){return function(){return setTimeout(ct,1)}}var ut=new Array(1e3);function ct(){for(var t=0;t<X;t+=2){(0,ut[t])(ut[t+1]),ut[t]=void 0,ut[t+1]=void 0}X=0}var at,ft,lt,ht,pt,yt,_t=void 0;ot?(pt=process.nextTick,yt=process.versions.node.match(/^(?:(\\\\d+)\\\\.)?(?:(\\\\d+)\\\\.)?(\\\\*|\\\\d+)$/),Array.isArray(yt)&&\"0\"===yt[1]&&\"10\"===yt[2]&&(pt=setImmediate),_t=function(){return pt(ct)}):nt?(ft=0,lt=new nt(ct),ht=document.createTextNode(\"\"),lt.observe(ht,{characterData:!0}),_t=function(){return ht.data=ft=++ft%2}):it?((at=new MessageChannel).port1.onmessage=ct,_t=function(){return at.port2.postMessage(0)}):_t=void 0===et&&\"function\"==typeof require?function(){try{var t=Function(\"return this\")().require(\"vertx\");return void 0!==(Z=t.runOnLoop||t.runOnContext)?function(){Z(ct)}:st()}catch(t){return st()}}():st(),n.async=tt,n.after=function(t){return setTimeout(t,0)};var vt=z,dt=function(t,e){return n.async(t,e)};function mt(){n.on.apply(n,arguments)}function wt(){n.off.apply(n,arguments)}if(\"undefined\"!=typeof window&&\"object\"==typeof window.__PROMISE_INSTRUMENTATION__){var bt=window.__PROMISE_INSTRUMENTATION__;for(var gt in o(\"instrument\",!0),bt)bt.hasOwnProperty(gt)&&mt(gt,bt[gt])}var jt={asap:tt,cast:vt,Promise:k,EventTarget:r,all:I,allSettled:U,race:D,hash:q,hashSettled:L,rethrow:V,defer:W,denodeify:M,configure:o,on:mt,off:wt,resolve:z,reject:B,map:$,async:dt,filter:Q};t.default=jt,t.asap=tt,t.cast=vt,t.Promise=k,t.EventTarget=r,t.all=I,t.allSettled=U,t.race=D,t.hash=q,t.hashSettled=L,t.rethrow=V,t.defer=W,t.denodeify=M,t.configure=o,t.on=mt,t.off=wt,t.resolve=z,t.reject=B,t.map=$,t.async=dt,t.filter=Q,Object.defineProperty(t,\"__esModule\",{value:!0})});} window.flutter_inappwebview.callHandler = function() {var _callHandlerID = setTimeout(function(){});window.flutter_inappwebview._callHandler(arguments[0], _callHandlerID, JSON.stringify(Array.prototype.slice.call(arguments, 1)));return new Promise(function(resolve, reject) {  window.flutter_inappwebview[_callHandlerID] = resolve;});};".replaceAll("[\r\n]+", ""));
        String string3 = stringBuilder.toString();
        if (inAppWebView.m.q.booleanValue()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string3);
            stringBuilder2.append("(function(ajax) {  var send = ajax.prototype.send;  var open = ajax.prototype.open;  var setRequestHeader = ajax.prototype.setRequestHeader;  ajax.prototype._flutter_inappwebview_url = null;  ajax.prototype._flutter_inappwebview_method = null;  ajax.prototype._flutter_inappwebview_isAsync = null;  ajax.prototype._flutter_inappwebview_user = null;  ajax.prototype._flutter_inappwebview_password = null;  ajax.prototype._flutter_inappwebview_password = null;  ajax.prototype._flutter_inappwebview_already_onreadystatechange_wrapped = false;  ajax.prototype._flutter_inappwebview_request_headers = {};  function convertRequestResponse(request, callback) {    if (request.response != null && request.responseType != null) {      switch (request.responseType) {        case 'arraybuffer':          callback(new Uint8Array(request.response));          return;        case 'blob':          const reader = new FileReader();          reader.addEventListener('loadend', function() {              callback(new Uint8Array(reader.result));          });          reader.readAsArrayBuffer(blob);          return;        case 'document':          callback(request.response.documentElement.outerHTML);          return;        case 'json':          callback(request.response);          return;      };    }    callback(null);  };  ajax.prototype.open = function(method, url, isAsync, user, password) {    isAsync = (isAsync != null) ? isAsync : true;    this._flutter_inappwebview_url = url;    this._flutter_inappwebview_method = method;    this._flutter_inappwebview_isAsync = isAsync;    this._flutter_inappwebview_user = user;    this._flutter_inappwebview_password = password;    this._flutter_inappwebview_request_headers = {};    open.call(this, method, url, isAsync, user, password);  };  ajax.prototype.setRequestHeader = function(header, value) {    this._flutter_inappwebview_request_headers[header] = value;    setRequestHeader.call(this, header, value);  };  function handleEvent(e) {    var self = this;    if (window._flutter_inappwebview_useShouldInterceptAjaxRequest == null || window._flutter_inappwebview_useShouldInterceptAjaxRequest == true) {      var headers = this.getAllResponseHeaders();      var responseHeaders = {};      if (headers != null) {        var arr = headers.trim().split(/[\\r\\n]+/);        arr.forEach(function (line) {          var parts = line.split(': ');          var header = parts.shift();          var value = parts.join(': ');          responseHeaders[header] = value;        });      }      convertRequestResponse(this, function(response) {        var ajaxRequest = {          method: self._flutter_inappwebview_method,          url: self._flutter_inappwebview_url,          isAsync: self._flutter_inappwebview_isAsync,          user: self._flutter_inappwebview_user,          password: self._flutter_inappwebview_password,          withCredentials: self.withCredentials,          headers: self._flutter_inappwebview_request_headers,          readyState: self.readyState,          status: self.status,          responseURL: self.responseURL,          responseType: self.responseType,          response: response,          responseText: (self.responseType == 'text' || self.responseType == '') ? self.responseText : null,          responseXML: (self.responseType == 'document' && self.responseXML != null) ? self.responseXML.documentElement.outerHTML : null,          statusText: self.statusText,          responseHeaders, responseHeaders,          event: {            type: e.type,            loaded: e.loaded,            lengthComputable: e.lengthComputable,            total: e.total          }        };        window.flutter_inappwebview.callHandler('onAjaxProgress', ajaxRequest).then(function(result) {          if (result != null) {            switch (result) {              case 0:                self.abort();                return;            };          }        });      });    }  };  ajax.prototype.send = function(data) {    var self = this;    if (window._flutter_inappwebview_useShouldInterceptAjaxRequest == null || window._flutter_inappwebview_useShouldInterceptAjaxRequest == true) {      if (!this._flutter_inappwebview_already_onreadystatechange_wrapped) {        this._flutter_inappwebview_already_onreadystatechange_wrapped = true;        var onreadystatechange = this.onreadystatechange;        this.onreadystatechange = function() {          if (window._flutter_inappwebview_useShouldInterceptAjaxRequest == null || window._flutter_inappwebview_useShouldInterceptAjaxRequest == true) {            var headers = this.getAllResponseHeaders();            var responseHeaders = {};            if (headers != null) {              var arr = headers.trim().split(/[\\r\\n]+/);              arr.forEach(function (line) {                var parts = line.split(': ');                var header = parts.shift();                var value = parts.join(': ');                responseHeaders[header] = value;              });            }            convertRequestResponse(this, function(response) {              var ajaxRequest = {                method: self._flutter_inappwebview_method,                url: self._flutter_inappwebview_url,                isAsync: self._flutter_inappwebview_isAsync,                user: self._flutter_inappwebview_user,                password: self._flutter_inappwebview_password,                withCredentials: self.withCredentials,                headers: self._flutter_inappwebview_request_headers,                readyState: self.readyState,                status: self.status,                responseURL: self.responseURL,                responseType: self.responseType,                response: response,                responseText: (self.responseType == 'text' || self.responseType == '') ? self.responseText : null,                responseXML: (self.responseType == 'document' && self.responseXML != null) ? self.responseXML.documentElement.outerHTML : null,                statusText: self.statusText,                responseHeaders: responseHeaders              };              window.flutter_inappwebview.callHandler('onAjaxReadyStateChange', ajaxRequest).then(function(result) {                if (result != null) {                  switch (result) {                    case 0:                      self.abort();                      return;                  };                }                if (onreadystatechange != null) {                  onreadystatechange();                }              });            });          } else if (onreadystatechange != null) {            onreadystatechange();          }        };      }      this.addEventListener('loadstart', handleEvent);      this.addEventListener('load', handleEvent);      this.addEventListener('loadend', handleEvent);      this.addEventListener('progress', handleEvent);      this.addEventListener('error', handleEvent);      this.addEventListener('abort', handleEvent);      this.addEventListener('timeout', handleEvent);      var ajaxRequest = {        data: data,        method: this._flutter_inappwebview_method,        url: this._flutter_inappwebview_url,        isAsync: this._flutter_inappwebview_isAsync,        user: this._flutter_inappwebview_user,        password: this._flutter_inappwebview_password,        withCredentials: this.withCredentials,        headers: this._flutter_inappwebview_request_headers,        responseType: this.responseType      };      window.flutter_inappwebview.callHandler('shouldInterceptAjaxRequest', ajaxRequest).then(function(result) {        if (result != null) {          switch (result.action) {            case 0:              self.abort();              return;          };          data = result.data;          self.withCredentials = result.withCredentials;          if (result.responseType != null) {            self.responseType = result.responseType;          };          for (var header in result.headers) {            var value = result.headers[header];            var flutter_inappwebview_value = self._flutter_inappwebview_request_headers[header];            if (flutter_inappwebview_value == null) {              self._flutter_inappwebview_request_headers[header] = value;            } else {              self._flutter_inappwebview_request_headers[header] += ', ' + value;            }            setRequestHeader.call(self, header, value);          };          if ((self._flutter_inappwebview_method != result.method && result.method != null) || (self._flutter_inappwebview_url != result.url && result.url != null)) {            self.abort();            self.open(result.method, result.url, result.isAsync, result.user, result.password);            return;          }        }        send.call(self, data);      });    } else {      send.call(this, data);    }  };})(window.XMLHttpRequest);".replaceAll("[\r\n]+", ""));
            string3 = stringBuilder2.toString();
        }
        if (inAppWebView.m.r.booleanValue()) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string3);
            stringBuilder3.append("(function(fetch) {  if (fetch == null) {    return;  }  function convertHeadersToJson(headers) {    var headersObj = {};    for (var header of headers.keys()) {      var value = headers.get(header);      headersObj[header] = value;    }    return headersObj;  }  function convertJsonToHeaders(headersJson) {    return new Headers(headersJson);  }  function convertBodyToArray(body) {    return new Response(body).arrayBuffer().then(function(arrayBuffer) {      var arr = Array.from(new Uint8Array(arrayBuffer));      return arr;    })  }  function convertArrayIntBodyToUint8Array(arrayIntBody) {    return new Uint8Array(arrayIntBody);  }  function convertCredentialsToJson(credentials) {    var credentialsObj = {};    if (window.FederatedCredential != null && credentials instanceof FederatedCredential) {      credentialsObj.type = credentials.type;      credentialsObj.id = credentials.id;      credentialsObj.name = credentials.name;      credentialsObj.protocol = credentials.protocol;      credentialsObj.provider = credentials.provider;      credentialsObj.iconURL = credentials.iconURL;    } else if (window.PasswordCredential != null && credentials instanceof PasswordCredential) {      credentialsObj.type = credentials.type;      credentialsObj.id = credentials.id;      credentialsObj.name = credentials.name;      credentialsObj.password = credentials.password;      credentialsObj.iconURL = credentials.iconURL;    } else {      credentialsObj.type = 'default';      credentialsObj.value = credentials;    }  }  function convertJsonToCredential(credentialsJson) {    var credentials;    if (window.FederatedCredential != null && credentialsJson.type === 'federated') {      credentials = new FederatedCredential({        id: credentialsJson.id,        name: credentialsJson.name,        protocol: credentialsJson.protocol,        provider: credentialsJson.provider,        iconURL: credentialsJson.iconURL      });    } else if (window.PasswordCredential != null && credentialsJson.type === 'password') {      credentials = new PasswordCredential({        id: credentialsJson.id,        name: credentialsJson.name,        password: credentialsJson.password,        iconURL: credentialsJson.iconURL      });    } else {      credentials = credentialsJson;    }    return credentials;  }  window.fetch = async function(resource, init) {    if (window.window._flutter_inappwebview_useShouldInterceptFetchRequest == null || window.window._flutter_inappwebview_useShouldInterceptFetchRequest == true) {      var fetchRequest = {        url: null,        method: null,        headers: null,        body: null,        mode: null,        credentials: null,        cache: null,        redirect: null,        referrer: null,        referrerPolicy: null,        integrity: null,        keepalive: null      };      if (resource instanceof Request) {        fetchRequest.url = resource.url;        fetchRequest.method = resource.method;        fetchRequest.headers = resource.headers;        fetchRequest.body = resource.body;        fetchRequest.mode = resource.mode;        fetchRequest.credentials = resource.credentials;        fetchRequest.cache = resource.cache;        fetchRequest.redirect = resource.redirect;        fetchRequest.referrer = resource.referrer;        fetchRequest.referrerPolicy = resource.referrerPolicy;        fetchRequest.integrity = resource.integrity;        fetchRequest.keepalive = resource.keepalive;      } else {        fetchRequest.url = resource;        if (init != null) {          fetchRequest.method = init.method;          fetchRequest.headers = init.headers;          fetchRequest.body = init.body;          fetchRequest.mode = init.mode;          fetchRequest.credentials = init.credentials;          fetchRequest.cache = init.cache;          fetchRequest.redirect = init.redirect;          fetchRequest.referrer = init.referrer;          fetchRequest.referrerPolicy = init.referrerPolicy;          fetchRequest.integrity = init.integrity;          fetchRequest.keepalive = init.keepalive;        }      }      if (fetchRequest.headers instanceof Headers) {        fetchRequest.headers = convertHeadersToJson(fetchRequest.headers);      }      fetchRequest.credentials = convertCredentialsToJson(fetchRequest.credentials);      return convertBodyToArray(fetchRequest.body).then(function(body) {        fetchRequest.body = body;        return window.flutter_inappwebview.callHandler('shouldInterceptFetchRequest', fetchRequest).then(function(result) {          if (result != null) {            switch (result.action) {              case 0:                var controller = new AbortController();                if (init != null) {                  init.signal = controller.signal;                } else {                  init = {                    signal: controller.signal                  };                }                controller.abort();                break;            }            resource = (result.url != null) ? result.url : resource;            if (init == null) {              init = {};            }            if (result.method != null && result.method.length > 0) {              init.method = result.method;            }            if (result.headers != null && Object.keys(result.headers).length > 0) {              init.headers = convertJsonToHeaders(result.headers);            }            if (result.body != null && result.body.length > 0)   {              init.body = convertArrayIntBodyToUint8Array(result.body);            }            if (result.mode != null && result.mode.length > 0) {              init.mode = result.mode;            }            if (result.credentials != null) {              init.credentials = convertJsonToCredential(result.credentials);            }            if (result.cache != null && result.cache.length > 0) {              init.cache = result.cache;            }            if (result.redirect != null && result.redirect.length > 0) {              init.redirect = result.redirect;            }            if (result.referrer != null && result.referrer.length > 0) {              init.referrer = result.referrer;            }            if (result.referrerPolicy != null && result.referrerPolicy.length > 0) {              init.referrerPolicy = result.referrerPolicy;            }            if (result.integrity != null && result.integrity.length > 0) {              init.integrity = result.integrity;            }            if (result.keepalive != null) {              init.keepalive = result.keepalive;            }            return fetch(resource, init);          }          return fetch(resource, init);        });      });    } else {      return fetch(resource, init);    }  };})(window.fetch);".replaceAll("[\r\n]+", ""));
            string3 = stringBuilder3.toString();
        }
        if (inAppWebView.m.b.booleanValue()) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(string3);
            stringBuilder4.append("(function() {   var observer = new PerformanceObserver(function(list) {       list.getEntries().forEach(function(entry) {         if (window.window._flutter_inappwebview_useOnLoadResource == null || window.window._flutter_inappwebview_useOnLoadResource == true) {           window.flutter_inappwebview.callHandler('onLoadResource', entry);         }       });   });   observer.observe({entryTypes: ['resource']});})();".replaceAll("[\r\n]+", ""));
            string3 = stringBuilder4.toString();
        }
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(string3);
        stringBuilder5.append("(function(){  document.addEventListener('keydown', function(e) {    window.flutter_inappwebview._hideContextMenu();  });})();".replaceAll("[\r\n]+", ""));
        String string4 = stringBuilder5.toString();
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append(string4);
        stringBuilder6.append("(function(){  window.addEventListener('focus', function(e) {    window.flutter_inappwebview.callHandler('onWindowFocus');  });})();".replaceAll("[\r\n]+", ""));
        String string5 = stringBuilder6.toString();
        StringBuilder stringBuilder7 = new StringBuilder();
        stringBuilder7.append(string5);
        stringBuilder7.append("(function(){  window.addEventListener('blur', function(e) {    window.flutter_inappwebview.callHandler('onWindowBlur');  });})();".replaceAll("[\r\n]+", ""));
        String string6 = stringBuilder7.toString();
        StringBuilder stringBuilder8 = new StringBuilder();
        stringBuilder8.append(string6);
        stringBuilder8.append("window.print = function() {  window.flutter_inappwebview.callHandler('onPrint', window.location.href);};".replaceAll("[\r\n]+", ""));
        String string7 = "(function(){  if (window.flutter_inappwebview._scriptsLoaded == null) {    $PLACEHOLDER_VALUE    window.flutter_inappwebview._scriptsLoaded = true;  }})();".replace((CharSequence)"$PLACEHOLDER_VALUE", (CharSequence)stringBuilder8.toString()).replaceAll("[\r\n]+", "");
        if (Build.VERSION.SDK_INT >= 19) {
            inAppWebView.evaluateJavascript(string7, null);
        } else {
            StringBuilder stringBuilder9 = new StringBuilder();
            stringBuilder9.append("javascript:");
            stringBuilder9.append(string7);
            inAppWebView.loadUrl(stringBuilder9.toString());
        }
        super.onPageStarted(webView, string, bitmap);
        inAppWebView.n = true;
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null && (searchView = inAppBrowserActivity.j) != null && !string.equals((Object)searchView.getQuery().toString())) {
            this.b.j.setQuery((CharSequence)string, false);
        }
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity2 = this.b;
        if (inAppBrowserActivity2 != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity2.f);
        }
        hashMap.put((Object)"url", (Object)string);
        this.c.invokeMethod("onLoadStart", (Object)hashMap);
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        URL uRL;
        try {
            uRL = new URL(webView.getUrl());
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
            clientCertRequest.cancel();
            return;
        }
        String string = uRL.getProtocol();
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"host", (Object)clientCertRequest.getHost());
        hashMap.put((Object)"protocol", (Object)string);
        hashMap.put((Object)"realm", null);
        hashMap.put((Object)"port", (Object)clientCertRequest.getPort());
        this.c.invokeMethod("onReceivedClientCertRequest", (Object)hashMap, new MethodChannel.Result((f)this, webView, clientCertRequest){
            final /* synthetic */ WebView a;
            final /* synthetic */ ClientCertRequest b;
            final /* synthetic */ f c;
            {
                this.c = f2;
                this.a = webView;
                this.b = clientCertRequest;
            }

            public void error(String string, String string2, Object object) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(", ");
                stringBuilder.append(string2);
                Log.e((String)"IAWebViewClient", (String)stringBuilder.toString());
            }

            public void notImplemented() {
                f.b(this.c, this.a, this.b);
            }

            public void success(Object object) {
                Integer n2;
                Map map;
                if (object != null && (n2 = (Integer)(map = (Map)object).get((Object)"action")) != null) {
                    int n3 = n2;
                    if (n3 != 1) {
                        if (n3 != 2) {
                            this.b.cancel();
                            return;
                        }
                        this.b.ignore();
                        return;
                    }
                    (InAppWebView)this.a;
                    f.g.a.r$d d2 = r.a((String)map.get((Object)"certificatePath"), (String)map.get((Object)"certificatePassword"), (String)map.get((Object)"androidKeyStoreType"));
                    this.b.proceed(d2.b, d2.a);
                    return;
                }
                f.a(this.c, this.a, this.b);
            }
        });
    }

    public void onReceivedError(WebView webView, int n2, String string, String string2) {
        InAppWebView inAppWebView = (InAppWebView)webView;
        if (inAppWebView.m.y0.booleanValue()) {
            inAppWebView.stopLoading();
            inAppWebView.loadUrl("about:blank");
        }
        inAppWebView.n = false;
        d = 0;
        e = null;
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)string2);
        hashMap.put((Object)"code", (Object)n2);
        hashMap.put((Object)"message", (Object)string);
        this.c.invokeMethod("onLoadError", (Object)hashMap);
        super.onReceivedError(webView, n2, string, string2);
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String string, String string2) {
        URL uRL;
        try {
            uRL = new URL(webView.getUrl());
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
            e = null;
            d = 0;
            httpAuthHandler.cancel();
            return;
        }
        String string3 = uRL.getProtocol();
        int n2 = uRL.getPort();
        d = 1 + d;
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"host", (Object)string);
        hashMap.put((Object)"protocol", (Object)string3);
        hashMap.put((Object)"realm", (Object)string2);
        hashMap.put((Object)"port", (Object)n2);
        hashMap.put((Object)"previousFailureCount", (Object)d);
        MethodChannel methodChannel = this.c;
        MethodChannel.Result result = new MethodChannel.Result((f)this, webView, string, string3, string2, n2, httpAuthHandler){
            final /* synthetic */ WebView a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ int e;
            final /* synthetic */ HttpAuthHandler f;
            final /* synthetic */ f g;
            {
                this.g = f2;
                this.a = webView;
                this.b = string;
                this.c = string2;
                this.d = string3;
                this.e = n2;
                this.f = httpAuthHandler;
            }

            public void error(String string, String string2, Object object) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(", ");
                stringBuilder.append(string2);
                Log.e((String)"IAWebViewClient", (String)stringBuilder.toString());
            }

            public void notImplemented() {
                f.b(this.g, this.a, this.f, this.b, this.d);
            }

            public void success(Object object) {
                Integer n2;
                Map map;
                if (object != null && (n2 = (Integer)(map = (Map)object).get((Object)"action")) != null) {
                    int n3 = n2;
                    if (n3 != 1) {
                        if (n3 != 2) {
                            f.a(null);
                            f.a(0);
                            this.f.cancel();
                            return;
                        }
                        if (f.b() == null) {
                            f.a(f.g.a.c.c.a(this.a.getContext()).a(this.b, this.c, this.d, this.e));
                        }
                        if (f.b().size() > 0) {
                            f.g.a.c.a a2 = (f.g.a.c.a)f.b().remove(0);
                            this.f.proceed(a2.b, a2.c);
                            return;
                        }
                        this.f.cancel();
                        return;
                    }
                    String string = (String)map.get((Object)"username");
                    String string2 = (String)map.get((Object)"password");
                    Boolean bl = (Boolean)map.get((Object)"permanentPersistence");
                    if (bl != null && bl.booleanValue() && Build.VERSION.SDK_INT >= 26) {
                        f.g.a.c.c.a(this.a.getContext()).b(this.b, this.c, this.d, this.e, string, string2);
                    }
                    this.f.proceed(string, string2);
                    return;
                }
                f.a(this.g, this.a, this.f, this.b, this.d);
            }
        };
        methodChannel.invokeMethod("onReceivedHttpAuthRequest", (Object)hashMap, result);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            HashMap hashMap = new HashMap();
            InAppBrowserActivity inAppBrowserActivity = this.b;
            if (inAppBrowserActivity != null) {
                hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
            }
            hashMap.put((Object)"url", (Object)webResourceRequest.getUrl().toString());
            hashMap.put((Object)"statusCode", (Object)webResourceResponse.getStatusCode());
            hashMap.put((Object)"description", (Object)webResourceResponse.getReasonPhrase());
            this.c.invokeMethod("onLoadHttpError", (Object)hashMap);
        }
    }

    public void onReceivedLoginRequest(WebView webView, String string, String string2, String string3) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"realm", (Object)string);
        hashMap.put((Object)"account", (Object)string2);
        hashMap.put((Object)"args", (Object)string3);
        this.c.invokeMethod("onReceivedLoginRequest", (Object)hashMap);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        URL uRL;
        try {
            uRL = new URL(sslError.getUrl());
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
            sslErrorHandler.cancel();
            return;
        }
        String string = uRL.getHost();
        String string2 = uRL.getProtocol();
        int n2 = uRL.getPort();
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"host", (Object)string);
        hashMap.put((Object)"protocol", (Object)string2);
        hashMap.put((Object)"realm", null);
        hashMap.put((Object)"port", (Object)n2);
        hashMap.put((Object)"androidError", (Object)sslError.getPrimaryError());
        hashMap.put((Object)"iosError", null);
        hashMap.put((Object)"sslCertificate", InAppWebView.a(sslError.getCertificate()));
        int n3 = sslError.getPrimaryError();
        String string3 = n3 != 0 ? (n3 != 1 ? (n3 != 2 ? (n3 != 3 ? (n3 != 4 ? "A generic error occurred" : "The date of the certificate is invalid") : "The certificate authority is not trusted") : "Hostname mismatch") : "The certificate has expired") : "The certificate is not yet valid";
        hashMap.put((Object)"message", (Object)string3);
        this.c.invokeMethod("onReceivedServerTrustAuthRequest", (Object)hashMap, new MethodChannel.Result((f)this, sslErrorHandler, webView, sslError){
            final /* synthetic */ SslErrorHandler a;
            final /* synthetic */ WebView b;
            final /* synthetic */ SslError c;
            final /* synthetic */ f d;
            {
                this.d = f2;
                this.a = sslErrorHandler;
                this.b = webView;
                this.c = sslError;
            }

            public void error(String string, String string2, Object object) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(", ");
                stringBuilder.append(string2);
                Log.e((String)"IAWebViewClient", (String)stringBuilder.toString());
            }

            public void notImplemented() {
                f.b(this.d, this.b, this.a, this.c);
            }

            public void success(Object object) {
                Integer n2;
                if (object != null && (n2 = (Integer)((Map)object).get((Object)"action")) != null) {
                    if (n2 != 1) {
                        this.a.cancel();
                        return;
                    }
                    this.a.proceed();
                    return;
                }
                f.a(this.d, this.b, this.a, this.c);
            }
        });
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (((InAppWebView)webView).m.x0.booleanValue()) {
            Boolean bl = renderProcessGoneDetail.didCrash();
            Integer n2 = renderProcessGoneDetail.rendererPriorityAtExit();
            HashMap hashMap = new HashMap();
            InAppBrowserActivity inAppBrowserActivity = this.b;
            if (inAppBrowserActivity != null) {
                hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
            }
            hashMap.put((Object)"didCrash", (Object)bl);
            hashMap.put((Object)"rendererPriorityAtExit", (Object)n2);
            this.c.invokeMethod("onRenderProcessGone", (Object)hashMap);
            return true;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int n2, SafeBrowsingResponse safeBrowsingResponse) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)webResourceRequest.getUrl().toString());
        hashMap.put((Object)"threatType", (Object)n2);
        MethodChannel methodChannel = this.c;
        MethodChannel.Result result = new MethodChannel.Result((f)this, safeBrowsingResponse, webView, webResourceRequest, n2){
            final /* synthetic */ SafeBrowsingResponse a;
            final /* synthetic */ WebView b;
            final /* synthetic */ WebResourceRequest c;
            final /* synthetic */ int d;
            final /* synthetic */ f e;
            {
                this.e = f2;
                this.a = safeBrowsingResponse;
                this.b = webView;
                this.c = webResourceRequest;
                this.d = n2;
            }

            public void error(String string, String string2, Object object) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(", ");
                stringBuilder.append(string2);
                Log.e((String)"IAWebViewClient", (String)stringBuilder.toString());
            }

            public void notImplemented() {
                f.b(this.e, this.b, this.c, this.d, this.a);
            }

            public void success(Object object) {
                if (object != null) {
                    Map map = (Map)object;
                    Boolean bl = (Boolean)map.get((Object)"report");
                    Integer n2 = (Integer)map.get((Object)"action");
                    boolean bl2 = bl != null ? bl : true;
                    Boolean bl3 = bl2;
                    if (n2 != null) {
                        int n3 = n2;
                        if (n3 != 0) {
                            if (n3 != 1) {
                                this.a.showInterstitial(bl3.booleanValue());
                                return;
                            }
                            this.a.proceed(bl3.booleanValue());
                            return;
                        }
                        this.a.backToSafety(bl3.booleanValue());
                        return;
                    }
                }
                f.a(this.e, this.b, this.c, this.d, this.a);
            }
        };
        methodChannel.invokeMethod("onSafeBrowsingHit", (Object)hashMap, result);
    }

    public void onScaleChanged(WebView webView, float f2, float f3) {
        super.onScaleChanged(webView, f2, f3);
        ((InAppWebView)webView).o = f3;
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"oldScale", (Object)Float.valueOf((float)f2));
        hashMap.put((Object)"newScale", (Object)Float.valueOf((float)f3));
        this.c.invokeMethod("onScaleChanged", (Object)hashMap);
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse;
        InAppWebView inAppWebView = (InAppWebView)webView;
        String string = webResourceRequest.getUrl().toString();
        if (inAppWebView.m.w0.booleanValue() && (webResourceResponse = this.a((Object)webResourceRequest)) != null) {
            return webResourceResponse;
        }
        return this.shouldInterceptRequest(webView, string);
    }

    /*
     * Exception decompiling
     */
    public WebResourceResponse shouldInterceptRequest(WebView var1, String var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl58 : ALOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    @TargetApi(value=21)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        InAppWebView inAppWebView = (InAppWebView)webView;
        if (inAppWebView.m.a.booleanValue()) {
            String string;
            boolean bl;
            boolean bl2;
            Map map;
            String string2;
            boolean bl3;
            if (Build.VERSION.SDK_INT >= 24) {
                string = webResourceRequest.getUrl().toString();
                string2 = webResourceRequest.getMethod();
                map = webResourceRequest.getRequestHeaders();
                bl2 = webResourceRequest.isForMainFrame();
                bl3 = webResourceRequest.hasGesture();
                bl = webResourceRequest.isRedirect();
            } else {
                string = webResourceRequest.getUrl().toString();
                string2 = webResourceRequest.getMethod();
                map = webResourceRequest.getRequestHeaders();
                bl2 = webResourceRequest.isForMainFrame();
                bl3 = webResourceRequest.hasGesture();
                bl = false;
            }
            this.a(inAppWebView, string, string2, (Map<String, String>)map, bl2, bl3, bl);
            if (inAppWebView.q != null) {
                if (webResourceRequest.isForMainFrame()) {
                    return true;
                }
                return inAppWebView.q.matcher((CharSequence)webResourceRequest.getUrl().toString()).matches();
            }
            return webResourceRequest.isForMainFrame();
        }
        return false;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String string) {
        InAppWebView inAppWebView = (InAppWebView)webView;
        if (inAppWebView.m.a.booleanValue()) {
            this.a(inAppWebView, string, "GET", null, true, false, false);
            return true;
        }
        return false;
    }
}

