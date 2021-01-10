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
package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

final class ThreadedInputConnectionProxyAdapterView
extends View {
    private InputConnection cachedConnection;
    final View containerView;
    final Handler imeHandler;
    private boolean isLocked = false;
    final View rootView;
    final View targetView;
    private boolean triggerDelayed = true;
    final IBinder windowToken;

    ThreadedInputConnectionProxyAdapterView(View view, View view2, Handler handler) {
        super(view.getContext());
        this.imeHandler = handler;
        this.containerView = view;
        this.targetView = view2;
        this.windowToken = view.getWindowToken();
        this.rootView = view.getRootView();
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.setVisibility(0);
    }

    public boolean checkInputConnectionProxy(View view) {
        return true;
    }

    public Handler getHandler() {
        return this.imeHandler;
    }

    public View getRootView() {
        return this.rootView;
    }

    public IBinder getWindowToken() {
        return this.windowToken;
    }

    public boolean hasWindowFocus() {
        return true;
    }

    public boolean isFocused() {
        return true;
    }

    boolean isTriggerDelayed() {
        return this.triggerDelayed;
    }

    public boolean onCheckIsTextEditor() {
        return true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.triggerDelayed = false;
        InputConnection inputConnection = this.isLocked ? this.cachedConnection : this.targetView.onCreateInputConnection(editorInfo);
        this.triggerDelayed = true;
        this.cachedConnection = inputConnection;
        return inputConnection;
    }

    void setLocked(boolean bl) {
        this.isLocked = bl;
    }
}

