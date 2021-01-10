/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 *  android.webkit.WebView
 *  android.widget.ListPopupWindow
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Thread
 */
package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ListPopupWindow;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.k;

public class i
extends WebView {
    public View b;
    private View c;
    private k d;

    public i(Context context) {
        super(context);
        this.b = null;
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = null;
    }

    public i(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.b = null;
    }

    public i(Context context, View view) {
        super(context);
        this.b = view;
    }

    private boolean d() {
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        for (int i2 = 0; i2 < arrstackTraceElement.length; ++i2) {
            if (!arrstackTraceElement[i2].getClassName().equals((Object)ListPopupWindow.class.getCanonicalName()) || !arrstackTraceElement[i2].getMethodName().equals((Object)"show")) continue;
            return true;
        }
        return false;
    }

    private void e() {
        if (this.d == null) {
            return;
        }
        View view = this.b;
        if (view == null) {
            Log.e((String)"InputAwareWebView", (String)"Can't reset the input connection to the container view because there is none.");
            return;
        }
        this.setInputConnectionTarget(view);
    }

    private void setInputConnectionTarget(final View view) {
        if (this.b == null) {
            Log.e((String)"InputAwareWebView", (String)"Can't set the input connection target because there is no containerView to use as a handler.");
            return;
        }
        view.requestFocus();
        this.b.post(new Runnable(){

            public void run() {
                InputMethodManager inputMethodManager = (InputMethodManager)i.this.getContext().getSystemService("input_method");
                view.onWindowFocusChanged(true);
                if (Build.VERSION.SDK_INT < 29) {
                    inputMethodManager.isActive(i.this.b);
                }
            }
        });
    }

    void a() {
        this.e();
    }

    public void b() {
        k k2 = this.d;
        if (k2 == null) {
            return;
        }
        k2.a(true);
    }

    public void c() {
        k k2 = this.d;
        if (k2 == null) {
            return;
        }
        k2.a(false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean checkInputConnectionProxy(View view) {
        View view2 = this.c;
        this.c = view;
        if (view2 == view) {
            return super.checkInputConnectionProxy(view);
        }
        View view3 = this.b;
        if (view3 == null) {
            Log.e((String)"InputAwareWebView", (String)"Can't create a proxy view because there's no container view. Text input may not work.");
            do {
                return super.checkInputConnectionProxy(view);
                break;
            } while (true);
        }
        this.d = new k(view3, view, view.getHandler());
        i.super.setInputConnectionTarget(this.d);
        return super.checkInputConnectionProxy(view);
    }

    public void clearFocus() {
        super.clearFocus();
        this.e();
    }

    protected void onFocusChanged(boolean bl, int n2, Rect rect) {
        if (Build.VERSION.SDK_INT < 28 && i.super.d() && !bl) {
            return;
        }
        super.onFocusChanged(bl, n2, rect);
    }

    public void setContainerView(View view) {
        this.b = view;
        if (this.d == null) {
            return;
        }
        Log.w((String)"InputAwareWebView", (String)"The containerView has changed while the proxyAdapterView exists.");
        if (view != null) {
            i.super.setInputConnectionTarget(this.d);
        }
    }

}

