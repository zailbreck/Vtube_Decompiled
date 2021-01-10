/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  io.flutter.view.AccessibilityBridge
 *  java.lang.Integer
 *  java.lang.Object
 */
package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.view.AccessibilityBridge;

public interface PlatformViewsAccessibilityDelegate {
    public void attachAccessibilityBridge(AccessibilityBridge var1);

    public void detachAccessibiltyBridge();

    public View getPlatformViewById(Integer var1);
}

