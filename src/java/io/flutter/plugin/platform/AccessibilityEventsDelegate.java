/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 *  io.flutter.view.AccessibilityBridge
 *  java.lang.Object
 */
package io.flutter.plugin.platform;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import io.flutter.view.AccessibilityBridge;

class AccessibilityEventsDelegate {
    private AccessibilityBridge accessibilityBridge;

    AccessibilityEventsDelegate() {
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null) {
            return false;
        }
        return accessibilityBridge.externalViewRequestSendAccessibilityEvent(view, view2, accessibilityEvent);
    }

    void setAccessibilityBridge(AccessibilityBridge accessibilityBridge) {
        this.accessibilityBridge = accessibilityBridge;
    }
}

