/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.util.Predicate
 *  io.flutter.view.AccessibilityBridge
 *  io.flutter.view.AccessibilityBridge$SemanticsNode
 *  java.lang.Object
 */
package io.flutter.view;

import io.flutter.util.Predicate;
import io.flutter.view.AccessibilityBridge;

public final class a
implements Predicate {
    private final /* synthetic */ AccessibilityBridge.SemanticsNode a;

    public /* synthetic */ a(AccessibilityBridge.SemanticsNode semanticsNode) {
        this.a = semanticsNode;
    }

    public final boolean test(Object object) {
        return AccessibilityBridge.a((AccessibilityBridge.SemanticsNode)this.a, (AccessibilityBridge.SemanticsNode)((AccessibilityBridge.SemanticsNode)object));
    }
}

