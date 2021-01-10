/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.webkit.WebChromeClient
 *  android.webkit.WebViewClient
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.InvocationHandler
 */
package org.chromium.support_lib_boundary;

import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;

public interface WebViewProviderBoundaryInterface {
    public void addWebMessageListener(String var1, String[] var2, InvocationHandler var3);

    public InvocationHandler[] createWebMessageChannel();

    public WebChromeClient getWebChromeClient();

    public WebViewClient getWebViewClient();

    public InvocationHandler getWebViewRenderer();

    public InvocationHandler getWebViewRendererClient();

    public void insertVisualStateCallback(long var1, InvocationHandler var3);

    public void postMessageToMainFrame(InvocationHandler var1, Uri var2);

    public void removeWebMessageListener(String var1);

    public void setWebViewRendererClient(InvocationHandler var1);
}

