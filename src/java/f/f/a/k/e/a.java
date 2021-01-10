/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.http.SslError
 *  android.webkit.SslErrorHandler
 *  android.webkit.WebView
 *  f.f.a.e.f.h
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.k.e;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import f.f.a.e.f.h;
import f.f.a.k.g.e;

public class a
implements e {
    @Override
    public final void a(WebView webView, int n2) {
        h.a((String)"RVWindVaneWebView", (String)"onProgressChanged");
    }

    @Override
    public void a(WebView webView, int n2, String string, String string2) {
        h.a((String)"RVWindVaneWebView", (String)"onReceivedError");
    }

    @Override
    public void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        h.a((String)"RVWindVaneWebView", (String)"onReceivedSslError");
    }

    @Override
    public void a(WebView webView, String string) {
        h.a((String)"RVWindVaneWebView", (String)"onPageFinished");
    }

    @Override
    public final void a(WebView webView, String string, Bitmap bitmap) {
        h.a((String)"RVWindVaneWebView", (String)"onPageStarted");
    }

    @Override
    public final boolean b(WebView webView, String string) {
        h.a((String)"RVWindVaneWebView", (String)"shouldOverrideUrlLoading");
        return true;
    }
}

