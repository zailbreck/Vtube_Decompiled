/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.http.SslError
 *  android.webkit.SslErrorHandler
 *  android.webkit.WebView
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.k.g;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

public interface f {
    public void a(WebView var1, int var2);

    public void a(WebView var1, int var2, String var3, String var4);

    public void a(WebView var1, SslErrorHandler var2, SslError var3);

    public void a(WebView var1, String var2);

    public void a(WebView var1, String var2, Bitmap var3);

    public boolean b(WebView var1, String var2);
}

