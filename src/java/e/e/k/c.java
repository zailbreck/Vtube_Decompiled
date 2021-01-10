/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.Gravity
 *  java.lang.Object
 */
package e.e.k;

import android.os.Build;
import android.view.Gravity;

public final class c {
    public static int a(int n2, int n3) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Gravity.getAbsoluteGravity((int)n2, (int)n3);
        }
        return n2 & -8388609;
    }
}

