/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 */
package e.j.b;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

abstract class i
extends ViewGroup {
    private boolean b = false;

    i(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    void a(boolean bl) {
        this.b = bl;
    }

    boolean a() {
        return this.b;
    }

    public void onVisibilityAggregated(boolean bl) {
        super.onVisibilityAggregated(bl);
        this.a(bl);
    }

    protected void onVisibilityChanged(View view, int n2) {
        boolean bl;
        if (Build.VERSION.SDK_INT < 24 && this.getWindowVisibility() == 0 && this.b != (bl = this.isShown())) {
            this.a(bl);
        }
    }

    protected void onWindowVisibilityChanged(int n2) {
        if (Build.VERSION.SDK_INT < 24 && this.isShown()) {
            boolean bl = n2 == 0;
            this.a(bl);
        }
    }
}

