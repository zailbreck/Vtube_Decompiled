/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package e.e.k;

import android.view.View;
import android.view.ViewTreeObserver;

public final class r
implements ViewTreeObserver.OnPreDrawListener,
View.OnAttachStateChangeListener {
    private final View b;
    private ViewTreeObserver c;
    private final Runnable d;

    private r(View view, Runnable runnable) {
        this.b = view;
        this.c = view.getViewTreeObserver();
        this.d = runnable;
    }

    public static r a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                r r2 = new r(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)r2);
                view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)r2);
                return r2;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    public void a() {
        ViewTreeObserver viewTreeObserver = this.c.isAlive() ? this.c : this.b.getViewTreeObserver();
        viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        this.b.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }

    public boolean onPreDraw() {
        this.a();
        this.d.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.c = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        this.a();
    }
}

