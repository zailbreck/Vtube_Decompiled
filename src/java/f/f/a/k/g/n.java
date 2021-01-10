/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  f.f.a.e.f.h
 *  f.f.a.k.c.c
 *  f.f.a.k.g.f
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.k.g;

import android.graphics.Bitmap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import f.f.a.e.f.h;
import f.f.a.k.c.c;
import f.f.a.k.g.f;

public final class n
extends c {
    private f c;

    /*
     * Exception decompiling
     */
    private WebResourceResponse a(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl61.1 : ACONST_NULL : trying to set 1 previously set to 0
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

    public final void onPageStarted(WebView webView, String string, Bitmap bitmap) {
        WebViewClient.super.onPageStarted(webView, string, bitmap);
        f f2 = this.c;
        if (f2 != null) {
            f2.a(webView, string, bitmap);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String string) {
        WebResourceResponse webResourceResponse = n.super.a(string);
        if (webResourceResponse != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("find WebResourceResponse url is ");
            stringBuilder.append(string);
            h.b((String)"WindVaneWebViewClient", (String)stringBuilder.toString());
            return webResourceResponse;
        }
        return WebViewClient.super.shouldInterceptRequest(webView, string);
    }
}

