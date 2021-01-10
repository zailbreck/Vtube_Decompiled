/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.os.Looper
 *  android.util.AttributeSet
 *  android.view.View
 *  e.j.b.u
 *  e.j.b.u$c
 *  e.j.b.v$c
 *  e.j.b.v$c$a
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package e.j.b;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import e.j.b.u;
import e.j.b.v;

class t
extends View
implements u.c {
    private v.c b;
    private v.a c;

    t(Context context) {
        super(context, null);
    }

    t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    t(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    public Looper a() {
        return Looper.getMainLooper();
    }

    public void a(v.c c2) {
        if (this.b == c2) {
            return;
        }
        boolean bl = this.isAttachedToWindow();
        v.c c3 = this.b;
        if (c3 != null) {
            if (bl) {
                c3.onDetachedFromWindow();
            }
            this.b.a(null);
        }
        this.b = c2;
        if (c2 != null) {
            if (this.c == null) {
                this.c = new v.a(){

                    public void a(v.c c2) {
                        t.this.invalidate();
                    }
                };
            }
            this.setWillNotDraw(false);
            c2.a(this.c);
            if (bl) {
                c2.onAttachedToWindow();
                this.requestLayout();
            }
        } else {
            this.setWillNotDraw(true);
        }
        this.invalidate();
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.media2.widget.SubtitleAnchorView";
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        v.c c2 = this.b;
        if (c2 != null) {
            c2.onAttachedToWindow();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v.c c2 = this.b;
        if (c2 != null) {
            c2.onDetachedFromWindow();
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b != null) {
            int n2 = canvas.save();
            canvas.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
            this.b.draw(canvas);
            canvas.restoreToCount(n2);
        }
    }

    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        super.onLayout(bl, n2, n3, n4, n5);
        if (this.b != null) {
            int n6 = this.getWidth() - this.getPaddingLeft() - this.getPaddingRight();
            int n7 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
            this.b.a(n6, n7);
        }
    }

}

