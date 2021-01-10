/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.http.SslError
 *  android.webkit.SslErrorHandler
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  java.lang.String
 */
package f.f.a.k.c;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import f.f.a.k.c.b;
import f.f.a.k.g.f;

public class c
extends WebViewClient {
    private b a;
    private f b;

    public final void a(b b2) {
        this.a = b2;
    }

    public final void a(f f2) {
        this.b = f2;
    }

    public void onPageFinished(WebView webView, String string) {
        super.onPageFinished(webView, string);
        f f2 = this.b;
        if (f2 != null) {
            f2.a(webView, string);
        }
    }

    public void onReceivedError(WebView webView, int n2, String string, String string2) {
        super.onReceivedError(webView, n2, string, string2);
        f f2 = this.b;
        if (f2 != null) {
            f2.a(webView, n2, string, string2);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        f f2 = this.b;
        if (f2 != null) {
            f2.a(webView, sslErrorHandler, sslError);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String string) {
        b b2 = this.a;
        if (b2 != null && b2.b(string)) {
            return true;
        }
        f f2 = this.b;
        if (f2 != null) {
            f2.b(webView, string);
        }
        return super.shouldOverrideUrlLoading(webView, string);
    }
}

