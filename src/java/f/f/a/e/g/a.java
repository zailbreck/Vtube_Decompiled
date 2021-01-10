/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.DownloadListener
 *  android.webkit.JsPromptResult
 *  android.webkit.JsResult
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebView$HitTestResult
 *  android.webkit.WebViewClient
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package f.f.a.e.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import f.f.a.e.f.h;
import f.f.a.e.f.k;
import f.f.a.e.f.l;

public class a
extends LinearLayout {
    private String b;
    private f.f.a.e.g.b c;
    private WebView d;
    private f.f.a.e.g.c e;
    private f f;
    private f.f.a.e.e.a g;

    public a(Context context, f.f.a.e.e.a a2) {
        super(context);
        this.g = a2;
        this.a();
    }

    public void a() {
        this.setOrientation(1);
        this.setGravity(17);
        this.c = new f.f.a.e.g.b(this.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 4);
        this.c.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        try {
            if (this.d == null) {
                WebView webView = new WebView(this.getContext());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setCacheMode(-1);
                webView.setDownloadListener((DownloadListener)new e(this.g));
                webView.setWebViewClient(new WebViewClient(){

                    public final void onPageStarted(WebView webView, String string, Bitmap bitmap) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("\u5f00\u59cb! = ");
                        stringBuilder.append(string);
                        h.b("BrowserView", stringBuilder.toString());
                        a.this.b = string;
                        if (a.this.f != null) {
                            a.this.f.a(webView, string, bitmap);
                        }
                        a.this.c.setVisible(true);
                        a.this.c.setProgressState(5);
                    }

                    public final boolean shouldOverrideUrlLoading(WebView webView, String string) {
                        WebView.HitTestResult hitTestResult;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("js\u5927\u8df3! = ");
                        stringBuilder.append(string);
                        h.b("BrowserView", stringBuilder.toString());
                        a.this.e.a("backward").setEnabled(true);
                        a.this.e.a("forward").setEnabled(false);
                        if (a.this.f != null) {
                            a.this.f.a(webView, string);
                        }
                        if ((hitTestResult = webView.getHitTestResult()) != null && hitTestResult.getType() == 7) {
                            h.b("BrowserView", "hint");
                        }
                        return false;
                    }
                });
                WebChromeClient webChromeClient = f.f.a.e.f.d.r() <= 10 ? new WebChromeClient(){

                    public final boolean onJsAlert(WebView webView, String string, String string2, JsResult jsResult) {
                        return true;
                    }

                    public final boolean onJsConfirm(WebView webView, String string, String string2, JsResult jsResult) {
                        return true;
                    }

                    public final boolean onJsPrompt(WebView webView, String string, String string2, String string3, JsPromptResult jsPromptResult) {
                        return true;
                    }

                    public final void onProgressChanged(WebView webView, int n2) {
                        if (n2 == 100) {
                            a.this.c.setProgressState(7);
                            new Handler().postDelayed(new Runnable(){

                                public final void run() {
                                    a.this.c.setVisible(false);
                                }
                            }, 200L);
                        }
                    }

                } : new WebChromeClient(){

                    public final void onProgressChanged(WebView webView, int n2) {
                        if (n2 == 100) {
                            a.this.c.setProgressState(7);
                            new Handler().postDelayed(new Runnable(){

                                public final void run() {
                                    a.this.c.setVisible(false);
                                }
                            }, 200L);
                        }
                    }

                };
                webView.setWebChromeClient(webChromeClient);
                this.d = webView;
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
            layoutParams2.weight = 1.0f;
            this.d.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
        }
        catch (Throwable throwable) {
            h.b("BrowserView", "webview is error", throwable);
        }
        this.e = new f.f.a.e.g.c(this.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, l.b(this.getContext(), 40.0f));
        this.e.setLayoutParams((ViewGroup.LayoutParams)layoutParams3);
        this.e.setBackgroundColor(-1);
        this.c.a(true);
        this.addView((View)this.c);
        this.addView((View)this.d);
        this.addView((View)this.e);
        this.e.a("backward").setEnabled(false);
        this.e.a("forward").setEnabled(false);
        this.e.setOnItemClickListener(new View.OnClickListener(){

            /*
             * Enabled aggressive block sorting
             */
            public final void onClick(View view) {
                String string;
                block9 : {
                    boolean bl;
                    View view2;
                    block8 : {
                        block7 : {
                            a.this.d.stopLoading();
                            string = (String)view.getTag();
                            if (!TextUtils.equals((CharSequence)string, (CharSequence)"backward")) break block7;
                            a.this.e.a("forward").setEnabled(true);
                            if (a.this.d.canGoBack()) {
                                a.this.d.goBack();
                            }
                            view2 = a.this.e.a("backward");
                            bl = a.this.d.canGoBack();
                            break block8;
                        }
                        if (!TextUtils.equals((CharSequence)string, (CharSequence)"forward")) break block9;
                        a.this.e.a("backward").setEnabled(true);
                        if (a.this.d.canGoForward()) {
                            a.this.d.goForward();
                        }
                        view2 = a.this.e.a("forward");
                        bl = a.this.d.canGoForward();
                    }
                    view2.setEnabled(bl);
                    return;
                }
                if (TextUtils.equals((CharSequence)string, (CharSequence)"refresh")) {
                    a.this.e.a("backward").setEnabled(a.this.d.canGoBack());
                    a.this.e.a("forward").setEnabled(a.this.d.canGoForward());
                    a.this.d.loadUrl(a.this.b);
                    return;
                }
                if (TextUtils.equals((CharSequence)string, (CharSequence)"exits") && a.this.f != null) {
                    a.this.f.a();
                }
            }
        });
    }

    public void a(String string) {
        this.d.loadUrl(string);
    }

    public void setListener(f f2) {
        this.f = f2;
    }

    public void setWebView(WebView webView) {
        this.d = webView;
    }

    public static final class e
    implements DownloadListener {
        private String a;
        private f.f.a.e.e.a b;

        public e(f.f.a.e.e.a a2) {
            this.b = a2;
        }

        public final void a(String string) {
            this.a = string;
        }

        public final void onDownloadStart(String string, String string2, String string3, String string4, long l2) {
            k.a(this.a, string, this.b, true);
        }
    }

    public static interface f {
        public void a();

        public void a(WebView var1, String var2, Bitmap var3);

        public boolean a(WebView var1, String var2);
    }

}

