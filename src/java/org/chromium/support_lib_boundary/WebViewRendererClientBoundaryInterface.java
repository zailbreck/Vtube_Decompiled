/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 *  java.lang.Object
 *  java.lang.reflect.InvocationHandler
 *  org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
 */
package org.chromium.support_lib_boundary;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

public interface WebViewRendererClientBoundaryInterface
extends FeatureFlagHolderBoundaryInterface {
    public void onRendererResponsive(WebView var1, InvocationHandler var2);

    public void onRendererUnresponsive(WebView var1, InvocationHandler var2);
}

