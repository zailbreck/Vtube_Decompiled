/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  f.e.a.a.a.i.a
 */
package f.e.a.a.a.i;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import android.webkit.WebView;
import f.e.a.a.a.i.a;

public class b
extends a {
    @SuppressLint(value={"SetJavaScriptEnabled"})
    public b(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.a(webView);
    }
}

