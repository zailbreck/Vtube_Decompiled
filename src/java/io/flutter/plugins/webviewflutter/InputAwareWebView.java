/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
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
package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ListPopupWindow;
import io.flutter.plugins.webviewflutter.ThreadedInputConnectionProxyAdapterView;

final class InputAwareWebView
extends WebView {
    private static final String TAG = "InputAwareWebView";
    private View containerView;
    private ThreadedInputConnectionProxyAdapterView proxyAdapterView;
    private View threadedInputConnectionProxyView;

    InputAwareWebView(Context context, View view) {
        super(context);
        this.containerView = view;
    }

    private boolean isCalledFromListPopupWindowShow() {
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        for (int i2 = 0; i2 < arrstackTraceElement.length; ++i2) {
            if (!arrstackTraceElement[i2].getClassName().equals((Object)ListPopupWindow.class.getCanonicalName()) || !arrstackTraceElement[i2].getMethodName().equals((Object)"show")) continue;
            return true;
        }
        return false;
    }

    private void resetInputConnection() {
        if (this.proxyAdapterView == null) {
            return;
        }
        View view = this.containerView;
        if (view == null) {
            Log.e((String)TAG, (String)"Can't reset the input connection to the container view because there is none.");
            return;
        }
        this.setInputConnectionTarget(view);
    }

    private void setInputConnectionTarget(final View view) {
        if (this.containerView == null) {
            Log.e((String)TAG, (String)"Can't set the input connection target because there is no containerView to use as a handler.");
            return;
        }
        view.requestFocus();
        this.containerView.post(new Runnable(){

            public void run() {
                InputMethodManager inputMethodManager = (InputMethodManager)InputAwareWebView.this.getContext().getSystemService("input_method");
                view.onWindowFocusChanged(true);
                inputMethodManager.isActive(InputAwareWebView.this.containerView);
            }
        });
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean checkInputConnectionProxy(View view) {
        View view2 = this.threadedInputConnectionProxyView;
        this.threadedInputConnectionProxyView = view;
        if (view2 == view) {
            return super.checkInputConnectionProxy(view);
        }
        View view3 = this.containerView;
        if (view3 == null) {
            Log.e((String)TAG, (String)"Can't create a proxy view because there's no container view. Text input may not work.");
            do {
                return super.checkInputConnectionProxy(view);
                break;
            } while (true);
        }
        this.proxyAdapterView = new ThreadedInputConnectionProxyAdapterView(view3, view, view.getHandler());
        InputAwareWebView.super.setInputConnectionTarget(this.proxyAdapterView);
        return super.checkInputConnectionProxy(view);
    }

    public void clearFocus() {
        super.clearFocus();
        this.resetInputConnection();
    }

    void dispose() {
        this.resetInputConnection();
    }

    void lockInputConnection() {
        ThreadedInputConnectionProxyAdapterView threadedInputConnectionProxyAdapterView = this.proxyAdapterView;
        if (threadedInputConnectionProxyAdapterView == null) {
            return;
        }
        threadedInputConnectionProxyAdapterView.setLocked(true);
    }

    protected void onFocusChanged(boolean bl, int n2, Rect rect) {
        if (Build.VERSION.SDK_INT < 28 && InputAwareWebView.super.isCalledFromListPopupWindowShow() && !bl) {
            return;
        }
        super.onFocusChanged(bl, n2, rect);
    }

    void setContainerView(View view) {
        this.containerView = view;
        if (this.proxyAdapterView == null) {
            return;
        }
        Log.w((String)TAG, (String)"The containerView has changed while the proxyAdapterView exists.");
        if (view != null) {
            InputAwareWebView.super.setInputConnectionTarget(this.proxyAdapterView);
        }
    }

    void unlockInputConnection() {
        ThreadedInputConnectionProxyAdapterView threadedInputConnectionProxyAdapterView = this.proxyAdapterView;
        if (threadedInputConnectionProxyAdapterView == null) {
            return;
        }
        threadedInputConnectionProxyAdapterView.setLocked(false);
    }

}

