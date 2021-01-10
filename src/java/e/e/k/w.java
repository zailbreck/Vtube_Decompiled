/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Boolean
 *  java.lang.Object
 */
package e.e.k;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import e.e.b;
import e.e.k.u;

public final class w {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bl = (Boolean)viewGroup.getTag(b.tag_transition_group);
        return bl != null && bl.booleanValue() || viewGroup.getBackground() != null || u.k((View)viewGroup) != null;
        {
        }
    }
}

