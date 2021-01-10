/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Paint
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.accessibility.CaptioningManager
 *  android.view.accessibility.CaptioningManager$CaptionStyle
 *  android.view.accessibility.CaptioningManager$CaptioningChangeListener
 *  e.j.b.f$a
 *  e.j.b.f$b
 *  e.j.b.v$c
 *  e.j.b.v$c$a
 *  java.lang.Object
 *  java.lang.String
 */
package e.j.b;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import e.j.b.f;
import e.j.b.v;

abstract class f
extends ViewGroup
implements v.c {
    private final CaptioningManager b;
    protected CaptioningManager.CaptionStyle c;
    protected v.a d;
    protected b e;
    private boolean f;
    private final CaptioningManager.CaptioningChangeListener g;

    f(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.g = new a((f)this);
        this.setLayerType(1, null);
        this.b = (CaptioningManager)context.getSystemService("captioning");
        this.c = this.b.getUserStyle();
        this.e = this.a(context);
        this.e.a(this.c);
        this.e.a(this.b.getFontScale());
        this.addView((View)((ViewGroup)this.e), -1, -1);
        this.requestLayout();
    }

    private void b() {
        boolean bl = this.isAttachedToWindow() && this.getVisibility() == 0;
        if (this.f != bl) {
            this.f = bl;
            if (bl) {
                this.b.addCaptioningChangeListener(this.g);
                return;
            }
            this.b.removeCaptioningChangeListener(this.g);
        }
    }

    public abstract b a(Context var1);

    public void a(int n2, int n3) {
        this.measure(View.MeasureSpec.makeMeasureSpec((int)n2, (int)1073741824), View.MeasureSpec.makeMeasureSpec((int)n3, (int)1073741824));
        this.layout(0, 0, n2, n3);
    }

    public void a(v.a a2) {
        this.d = a2;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b();
    }

    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        ((ViewGroup)this.e).layout(n2, n3, n4, n5);
    }

    protected void onMeasure(int n2, int n3) {
        super.onMeasure(n2, n3);
        ((ViewGroup)this.e).measure(n2, n3);
    }

    public void setVisible(boolean bl) {
        int n2 = bl ? 0 : 8;
        this.setVisibility(n2);
        f.super.b();
    }
}

