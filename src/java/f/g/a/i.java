/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.webkit.JavascriptInterface
 *  android.widget.LinearLayout
 *  com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.c
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package f.g.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.widget.LinearLayout;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.c;
import f.g.a.i;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;

public class i {
    private c a;
    private InAppBrowserActivity b;
    public MethodChannel c;

    public i(Object object) {
        if (object instanceof InAppBrowserActivity) {
            this.b = (InAppBrowserActivity)object;
        } else if (object instanceof c) {
            this.a = (c)object;
        }
        InAppBrowserActivity inAppBrowserActivity = this.b;
        MethodChannel methodChannel = inAppBrowserActivity != null ? inAppBrowserActivity.d : this.a.c;
        this.c = methodChannel;
    }

    @JavascriptInterface
    public void _callHandler(final String string2, String string3, String string4) {
        if (this.a == null && this.b == null) {
            return;
        }
        InAppBrowserActivity inAppBrowserActivity = this.b;
        InAppWebView inAppWebView = inAppBrowserActivity != null ? inAppBrowserActivity.g : this.a.b;
        final InAppWebView inAppWebView2 = inAppWebView;
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity2 = this.b;
        if (inAppBrowserActivity2 != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity2.f);
        }
        hashMap.put((Object)"handlerName", (Object)string2);
        hashMap.put((Object)"args", (Object)string4);
        Handler handler = new Handler(Looper.getMainLooper());
        Runnable runnable = new Runnable((Map)hashMap, string3){
            final /* synthetic */ Map d;
            final /* synthetic */ String e;
            {
                this.d = map;
                this.e = string3;
            }

            public void run() {
                if (string2.equals((Object)"onPrint") && Build.VERSION.SDK_INT >= 21) {
                    inAppWebView2.k();
                }
                i.this.c.invokeMethod("onCallJsHandler", (Object)this.d, new MethodChannel.Result(this){
                    final /* synthetic */ b a;
                    {
                        this.a = b2;
                    }

                    public void error(String string2, String string3, Object object) {
                        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                        stringBuilder.append("ERROR: ");
                        stringBuilder.append(string2);
                        stringBuilder.append(" ");
                        stringBuilder.append(string3);
                        android.util.Log.d((String)"JSBridgeInterface", (String)stringBuilder.toString());
                    }

                    public void notImplemented() {
                    }

                    public void success(Object object) {
                        InAppWebView inAppWebView = this.a.inAppWebView2;
                        if (inAppWebView == null) {
                            return;
                        }
                        if (Build.VERSION.SDK_INT >= 19) {
                            java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                            stringBuilder.append("if(window.flutter_inappwebview[");
                            stringBuilder.append(this.a.e);
                            stringBuilder.append("] != null) {window.");
                            stringBuilder.append("flutter_inappwebview");
                            stringBuilder.append("[");
                            stringBuilder.append(this.a.e);
                            stringBuilder.append("](");
                            stringBuilder.append(object);
                            stringBuilder.append("); delete window.");
                            stringBuilder.append("flutter_inappwebview");
                            stringBuilder.append("[");
                            stringBuilder.append(this.a.e);
                            stringBuilder.append("];}");
                            inAppWebView.evaluateJavascript(stringBuilder.toString(), null);
                            return;
                        }
                        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                        stringBuilder.append("javascript:if(window.flutter_inappwebview[");
                        stringBuilder.append(this.a.e);
                        stringBuilder.append("] != null) {window.");
                        stringBuilder.append("flutter_inappwebview");
                        stringBuilder.append("[");
                        stringBuilder.append(this.a.e);
                        stringBuilder.append("](");
                        stringBuilder.append(object);
                        stringBuilder.append("); delete window.");
                        stringBuilder.append("flutter_inappwebview");
                        stringBuilder.append("[");
                        stringBuilder.append(this.a.e);
                        stringBuilder.append("];}");
                        inAppWebView.loadUrl(stringBuilder.toString());
                    }
                });
            }
        };
        handler.post(runnable);
    }

    @JavascriptInterface
    public void _hideContextMenu() {
        if (this.a == null && this.b == null) {
            return;
        }
        InAppBrowserActivity inAppBrowserActivity = this.b;
        final InAppWebView inAppWebView = inAppBrowserActivity != null ? inAppBrowserActivity.g : this.a.b;
        new Handler(Looper.getMainLooper()).post(new Runnable(this){

            public void run() {
                InAppWebView inAppWebView2 = inAppWebView;
                if (inAppWebView2 != null && inAppWebView2.s != null) {
                    inAppWebView2.f();
                }
            }
        });
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

}

