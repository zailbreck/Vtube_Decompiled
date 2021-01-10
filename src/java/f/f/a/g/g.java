/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.net.http.SslError
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.webkit.JsPromptResult
 *  android.webkit.JsResult
 *  android.webkit.SslErrorHandler
 *  android.webkit.URLUtil
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  com.mintegral.msdk.base.common.report.d
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.HashMap
 *  java.util.Map
 */
package f.f.a.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import f.f.a.e.f.h;
import java.util.HashMap;
import java.util.Map;

public class g {
    private static final String r = "g";
    private int a = 15000;
    private int b = 3000;
    private Handler c;
    private f.f.a.f.a d;
    private f e;
    private String f;
    private String g;
    private WebView h;
    private boolean i;
    private String j;
    private int k;
    private boolean l = false;
    private boolean m;
    boolean n;
    boolean o;
    private final Runnable p;
    private final Runnable q;

    public g(boolean bl) {
        long l2;
        this.p = new Runnable(){

            public final void run() {
                g.this.l = true;
                g.this.k = 1;
                String string = r;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("js\u8d85\u65f6\uff01\u8d85\u65f6\u4e0a\u9650\uff1a");
                stringBuilder.append(g.this.b);
                stringBuilder.append("ms");
                h.d(string, stringBuilder.toString());
                g.n(g.this);
            }
        };
        this.q = new Runnable(){

            public final void run() {
                g.this.l = true;
                g.this.k = 2;
                String string = r;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("http\u8d85\u65f6\uff01\u8d85\u65f6\u4e0a\u9650\uff1a");
                stringBuilder.append(g.this.a);
                stringBuilder.append("ms");
                h.d(string, stringBuilder.toString());
                g.n(g.this);
            }
        };
        this.c = new Handler(Looper.getMainLooper());
        this.d = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
        if (this.d == null) {
            this.d = f.f.a.f.c.b().a();
        }
        this.i = this.d.j();
        if (bl) {
            this.a = (int)this.d.g();
            l2 = this.d.g();
        } else {
            this.a = (int)this.d.h();
            l2 = this.d.h();
        }
        this.b = (int)l2;
    }

    static /* synthetic */ String a(g g2, String string) {
        g2.f = string;
        return string;
    }

    private void a(final Context context, final String string, final String string2, final String string3) {
        this.h = new WebView(context);
        this.h.getSettings().setJavaScriptEnabled(true);
        this.h.getSettings().setCacheMode(2);
        this.h.getSettings().setLoadsImagesAutomatically(false);
        WebView webView = this.h;
        WebViewClient webViewClient = new WebViewClient(){

            public final void onPageFinished(WebView webView, String string) {
                super.onPageFinished(webView, string);
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public final void onPageStarted(WebView webView, String string, Bitmap bitmap) {
                String string2;
                boolean bl;
                block13 : {
                    block12 : {
                        try {
                            String string3;
                            webView.loadUrl("javascript:window.navigator.vibrate([]);");
                            if (g.this.m) {
                                g.this.k = 0;
                                g.c(g.this);
                                return;
                            }
                            g.this.o = false;
                            if (webView.getTag() == null) {
                                webView.setTag((Object)"has_first_started");
                            } else {
                                g.this.n = true;
                            }
                            String string4 = string3 = g.a();
                            // MONITORENTER : string4
                            string2 = "\u52a0\u8f7d\u9875\u9762-\u5f00\u59cb\uff1a";
                            if (g.this.n) break block12;
                            boolean bl2 = g.this.o;
                            bl = false;
                            if (!bl2) break block13;
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            return;
                        }
                    }
                    bl = true;
                }
                if (bl) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append("\uff08\u91cd\u5b9a\u5411\uff09");
                    string2 = stringBuilder.toString();
                }
                if (URLUtil.isHttpsUrl((String)string)) {
                    String string5 = g.a();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append(string);
                    h.d(string5, stringBuilder.toString());
                } else {
                    String string6 = g.a();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append(string);
                    h.b(string6, stringBuilder.toString());
                }
                g.a(g.this, string);
                if (g.d(g.this) != null && g.d(g.this).b(string)) {
                    g.a(g.this, true);
                    g.c(g.this);
                    return;
                }
                g.e(g.this);
                // MONITOREXIT : string4
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public final void onReceivedError(WebView webView, int n2, String string, String string2) {
                String string3;
                String string4 = g.a();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onReceivedError: errno = ");
                stringBuilder.append(n2);
                stringBuilder.append(", url: ");
                stringBuilder.append(webView.getUrl());
                stringBuilder.append(",\n onReceivedError\uff1a, description: ");
                stringBuilder.append(string);
                stringBuilder.append(", failingUrl: ");
                stringBuilder.append(string2);
                h.b(string4, stringBuilder.toString());
                String string5 = string3 = g.a();
                // MONITORENTER : string5
                g.a(g.this, true);
                g.j(g.this);
                g.c(g.this);
                // MONITOREXIT : string5
                if (g.d(g.this) == null) return;
                g.d(g.this).a(n2, webView.getUrl(), string, g.k(g.this));
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                try {
                    String string = g.a();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onReceivedSslError IS_SP_CBT_CF:");
                    stringBuilder.append(f.f.a.a.g);
                    h.a(string, stringBuilder.toString());
                    if (f.f.a.a.g && sslErrorHandler != null) {
                        sslErrorHandler.cancel();
                    }
                    if (TextUtils.isEmpty((CharSequence)string3)) return;
                    if (TextUtils.isEmpty((CharSequence)string2)) return;
                    new com.mintegral.msdk.base.common.report.d(context).a(string, string2, string3, webView.getUrl());
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public final boolean shouldOverrideUrlLoading(WebView webView, String string) {
                String string2;
                String string3 = string2 = g.a();
                // MONITORENTER : string3
                String string4 = g.a();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("override js\u8df3\u8f6c\uff1a");
                stringBuilder.append(string);
                h.a(string4, stringBuilder.toString());
                g.this.o = true;
                g.f(g.this);
                if (g.b(g.this)) {
                    g.g(g.this);
                    g.c(g.this);
                    // MONITOREXIT : string3
                    return true;
                }
                g.a(g.this, string);
                if (g.d(g.this) != null && g.d(g.this).a(string)) {
                    g.a(g.this, true);
                    g.g(g.this);
                    g.c(g.this);
                    // MONITOREXIT : string3
                    return true;
                }
                // MONITOREXIT : string3
                if (!g.h(g.this)) {
                    g.i(g.this).loadUrl(string);
                    return true;
                }
                HashMap hashMap = new HashMap();
                if (g.i(g.this).getUrl() != null) {
                    hashMap.put((Object)"Referer", (Object)g.i(g.this).getUrl());
                }
                g.i(g.this).loadUrl(string, (Map)hashMap);
                return true;
            }
        };
        webView.setWebViewClient(webViewClient);
        WebChromeClient webChromeClient = new WebChromeClient(){

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
                    try {
                        String string = r;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("\u52a0\u8f7d\u9875\u9762-\u8fdb\u5ea6\u5b8c\u6210\uff1a");
                        stringBuilder.append(webView.getUrl());
                        h.b(string, stringBuilder.toString());
                        webView.loadUrl("javascript:window.navigator.vibrate([]);");
                        if (!g.this.m && !g.this.o) {
                            g.l(g.this);
                        }
                        if (g.this.e != null) {
                            g.this.e.c(webView.getUrl());
                            return;
                        }
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
        };
        this.h.setWebChromeClient(webChromeClient);
    }

    private void a(final String string, final String string2, final String string3, final Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            g.super.a(string, string2, string3, context, this.f);
            return;
        }
        Handler handler = this.c;
        Runnable runnable = new Runnable(){

            public final void run() {
                g g2 = g.this;
                g2.a(string, string2, string3, context, g2.f);
            }
        };
        handler.post(runnable);
    }

    /*
     * Exception decompiling
     */
    private void a(String var1, String var2, String var3, Context var4, String var5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    static /* synthetic */ boolean a(g g2, boolean bl) {
        g2.m = bl;
        return bl;
    }

    private void b() {
        this.d();
        this.c();
    }

    private void c() {
        this.c.removeCallbacks(this.q);
    }

    /*
     * Exception decompiling
     */
    static /* synthetic */ void c(g var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl35 : ALOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:885)
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

    private void d() {
        this.c.removeCallbacks(this.p);
    }

    static /* synthetic */ void e(g g2) {
        g2.c();
        g2.c.postDelayed(g2.q, (long)g2.a);
    }

    static /* synthetic */ void f(g g2) {
        g2.d();
    }

    static /* synthetic */ void g(g g2) {
        g2.c();
    }

    static /* synthetic */ boolean h(g g2) {
        return g2.i;
    }

    static /* synthetic */ WebView i(g g2) {
        return g2.h;
    }

    static /* synthetic */ void j(g g2) {
        g2.b();
    }

    static /* synthetic */ String k(g g2) {
        return g2.j;
    }

    static /* synthetic */ void l(g g2) {
        g2.d();
        g2.c.postDelayed(g2.p, (long)g2.b);
    }

    /*
     * Exception decompiling
     */
    static /* synthetic */ void n(g var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl38 : ALOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:885)
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

    public final void a(String string, String string2, String string3, Context context, String string4, f f2) {
        if (f2 != null) {
            this.f = string4;
            this.e = f2;
            this.a(string, string2, string3, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public final void a(String string, String string2, String string3, Context context, String string4, String string5, f f2) {
        if (f2 != null) {
            this.g = string5;
            this.f = string4;
            this.e = f2;
            this.a(string, string2, string3, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    static interface f {
        public void a(int var1, String var2, String var3, String var4);

        public void a(String var1, boolean var2, String var3);

        public boolean a(String var1);

        public boolean b(String var1);

        public boolean c(String var1);
    }

}

