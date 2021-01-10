/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.IBinder
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 */
package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

final class k
extends View {
    final Handler b;
    final IBinder c;
    final View d;
    final View e;
    private boolean f = false;
    private InputConnection g;

    k(View view, View view2, Handler handler) {
        super(view.getContext());
        this.b = handler;
        this.e = view2;
        this.c = view.getWindowToken();
        this.d = view.getRootView();
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.setVisibility(0);
    }

    void a(boolean bl) {
        this.f = bl;
    }

    public boolean checkInputConnectionProxy(View view) {
        return true;
    }

    public Handler getHandler() {
        return this.b;
    }

    public View getRootView() {
        return this.d;
    }

    public IBinder getWindowToken() {
        return this.c;
    }

    public boolean hasWindowFocus() {
        return true;
    }

    public boolean isFocused() {
        return true;
    }

    public boolean onCheckIsTextEditor() {
        return true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = this.f ? this.g : this.e.onCreateInputConnection(editorInfo);
        this.g = inputConnection;
        return inputConnection;
    }
}

