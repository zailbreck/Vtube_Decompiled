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

public final class b
implements Predicate {
    public static final /* synthetic */ b a;

    static /* synthetic */ {
        a = new b();
    }

    private /* synthetic */ b() {
    }

    public final boolean test(Object object) {
        return AccessibilityBridge.a((AccessibilityBridge.SemanticsNode)((AccessibilityBridge.SemanticsNode)object));
    }
}

