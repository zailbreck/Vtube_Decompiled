/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.webkit.WebView
 *  androidx.webkit.d
 *  androidx.webkit.e
 *  androidx.webkit.f
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import android.util.Log;
import android.webkit.WebView;
import androidx.webkit.d;
import androidx.webkit.e;
import androidx.webkit.f;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.c;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;

public class h
extends f {
    private c a;
    private InAppBrowserActivity b;
    public MethodChannel c;

    public h(Object object) {
        if (object instanceof InAppBrowserActivity) {
            this.b = (InAppBrowserActivity)object;
        } else if (object instanceof c) {
            this.a = (c)object;
        }
        InAppBrowserActivity inAppBrowserActivity = this.b;
        MethodChannel methodChannel = inAppBrowserActivity != null ? inAppBrowserActivity.d : this.a.c;
        this.c = methodChannel;
    }

    public void a(WebView webView, final e e2) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)webView.getUrl());
        this.c.invokeMethod("onRenderProcessResponsive", (Object)hashMap, new MethodChannel.Result((h)this){

            @Override
            public void error(String string2, String string3, Object object) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ERROR: ");
                stringBuilder.append(string2);
                stringBuilder.append(" ");
                stringBuilder.append(string3);
                Log.d((String)"IAWRenderProcessClient", (String)stringBuilder.toString());
            }

            @Override
            public void notImplemented() {
            }

            @Override
            public void success(Object object) {
                Integer n2 = (Integer)((Map)object).get((Object)"action");
                if (n2 != null && e2 != null) {
                    if (n2 != 0) {
                        return;
                    }
                    if (d.a((String)"WEB_VIEW_RENDERER_TERMINATE")) {
                        e2.a();
                    }
                }
            }
        });
    }

    public void b(WebView webView, final e e2) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.b;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)webView.getUrl());
        this.c.invokeMethod("onRenderProcessUnresponsive", (Object)hashMap, new MethodChannel.Result((h)this){

            @Override
            public void error(String string2, String string3, Object object) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ERROR: ");
                stringBuilder.append(string2);
                stringBuilder.append(" ");
                stringBuilder.append(string3);
                Log.d((String)"IAWRenderProcessClient", (String)stringBuilder.toString());
            }

            @Override
            public void notImplemented() {
            }

            @Override
            public void success(Object object) {
                Integer n2 = (Integer)((Map)object).get((Object)"action");
                if (n2 != null && e2 != null) {
                    if (n2 != 0) {
                        return;
                    }
                    if (d.a((String)"WEB_VIEW_RENDERER_TERMINATE")) {
                        e2.a();
                    }
                }
            }
        });
    }

}

