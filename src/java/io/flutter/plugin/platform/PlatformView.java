/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.view.View
 *  java.lang.Object
 */
package io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.view.View;

public interface PlatformView {
    public void dispose();

    public View getView();

    @SuppressLint(value={"NewApi"})
    public void onFlutterViewAttached(View var1);

    @SuppressLint(value={"NewApi"})
    public void onFlutterViewDetached();

    @SuppressLint(value={"NewApi"})
    public void onInputConnectionLocked();

    @SuppressLint(value={"NewApi"})
    public void onInputConnectionUnlocked();
}

