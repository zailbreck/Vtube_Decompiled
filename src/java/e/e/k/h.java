/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  java.lang.Object
 */
package e.e.k;

import android.view.MotionEvent;

public final class h {
    public static boolean a(MotionEvent motionEvent, int n2) {
        return (n2 & motionEvent.getSource()) == n2;
    }
}

