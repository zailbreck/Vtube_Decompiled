/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.accessibility.AccessibilityRecord
 *  java.lang.Object
 */
package e.e.k.d0;

import android.os.Build;
import android.view.accessibility.AccessibilityRecord;

public class e {
    public static void a(AccessibilityRecord accessibilityRecord, int n2) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(n2);
        }
    }

    public static void b(AccessibilityRecord accessibilityRecord, int n2) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(n2);
        }
    }
}

