/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.SpannableStringBuilder
 *  android.text.StaticLayout
 *  android.text.StaticLayout$Builder
 *  android.text.TextPaint
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package e.j.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import e.j.b.n;

class w
extends View {
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final RectF g = new RectF();
    private final SpannableStringBuilder h = new SpannableStringBuilder();
    private Layout.Alignment i;
    private TextPaint j;
    private Paint k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private StaticLayout r;
    private float s = 1.0f;
    private float t = 0.0f;
    private int u = 0;

    w(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        Resources resources = this.getContext().getResources();
        this.b = resources.getDimensionPixelSize(n.subtitle_corner_radius);
        this.c = resources.getDimensionPixelSize(n.subtitle_outline_width);
        this.d = resources.getDimensionPixelSize(n.subtitle_shadow_radius);
        this.f = this.e = (float)resources.getDimensionPixelSize(n.subtitle_shadow_offset);
        this.j = new TextPaint();
        this.j.setAntiAlias(true);
        this.j.setSubpixelText(true);
        this.k = new Paint();
        this.k.setAntiAlias(true);
    }

    private boolean d(int n2) {
        StaticLayout staticLayout;
        if (this.p && n2 == this.q) {
            return true;
        }
        int n3 = n2 - (this.getPaddingLeft() + this.getPaddingRight() + 2 * this.u);
        if (n3 <= 0) {
            return false;
        }
        this.p = true;
        this.q = n3;
        if (Build.VERSION.SDK_INT >= 23) {
            SpannableStringBuilder spannableStringBuilder = this.h;
            StaticLayout.Builder builder = StaticLayout.Builder.obtain((CharSequence)spannableStringBuilder, (int)0, (int)spannableStringBuilder.length(), (TextPaint)this.j, (int)n3).setAlignment(this.i).setLineSpacing(this.t, this.s);
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setUseLineSpacingFromFallbacks(true);
            }
            staticLayout = builder.build();
        } else {
            SpannableStringBuilder spannableStringBuilder = this.h;
            int n4 = spannableStringBuilder.length();
            TextPaint textPaint = this.j;
            Layout.Alignment alignment = this.i;
            float f2 = this.s;
            float f3 = this.t;
            staticLayout = new StaticLayout((CharSequence)spannableStringBuilder, 0, n4, textPaint, n3, alignment, f2, f3, true);
        }
        this.r = staticLayout;
        return true;
    }

    public void a(float f2) {
        if (this.j.getTextSize() != f2) {
            this.j.setTextSize(f2);
            this.u = (int)(0.5f + f2 * 0.125f);
            this.p = false;
            this.requestLayout();
            this.invalidate();
        }
    }

    public void a(int n2) {
        this.n = n2;
        this.invalidate();
    }

    public void a(Typeface typeface) {
        if (typeface != null && !typeface.equals((Object)this.j.getTypeface())) {
            this.j.setTypeface(typeface);
            this.p = false;
            this.requestLayout();
            this.invalidate();
        }
    }

    public void a(Layout.Alignment alignment) {
        if (this.i != alignment) {
            this.i = alignment;
            this.p = false;
            this.requestLayout();
            this.invalidate();
        }
    }

    public void a(CharSequence charSequence) {
        this.h.clear();
        this.h.append(charSequence);
        this.p = false;
        this.requestLayout();
        this.invalidate();
    }

    public void b(int n2) {
        this.o = n2;
        this.invalidate();
    }

    public void c(int n2) {
        this.l = n2;
        this.invalidate();
    }

    protected void onDraw(Canvas canvas) {
        int n2;
        int n3;
        StaticLayout staticLayout = this.r;
        if (staticLayout == null) {
            return;
        }
        int n4 = canvas.save();
        int n5 = this.u;
        canvas.translate((float)(n5 + this.getPaddingLeft()), (float)this.getPaddingTop());
        int n6 = staticLayout.getLineCount();
        TextPaint textPaint = this.j;
        Paint paint = this.k;
        RectF rectF = this.g;
        if (Color.alpha((int)this.m) > 0) {
            float f2 = this.b;
            float f3 = staticLayout.getLineTop(0);
            paint.setColor(this.m);
            paint.setStyle(Paint.Style.FILL);
            float f4 = f3;
            for (int i2 = 0; i2 < n6; ++i2) {
                float f5 = staticLayout.getLineLeft(i2);
                float f6 = n5;
                rectF.left = f5 - f6;
                rectF.right = f6 + staticLayout.getLineRight(i2);
                rectF.top = f4;
                f4 = rectF.bottom = (float)staticLayout.getLineBottom(i2);
                canvas.drawRoundRect(rectF, f2, f2, paint);
            }
        }
        if ((n2 = this.o) == (n3 = 1)) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.c);
            textPaint.setColor(this.n);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout.draw(canvas);
        } else if (n2 == 2) {
            textPaint.setShadowLayer(this.d, this.e, this.f, this.n);
        } else if (n2 == 3 || n2 == 4) {
            if (n2 != 3) {
                n3 = 0;
            }
            int n7 = -1;
            int n8 = n3 != 0 ? -1 : this.n;
            if (n3 != 0) {
                n7 = this.n;
            }
            float f7 = this.d / 2.0f;
            textPaint.setColor(this.l);
            textPaint.setStyle(Paint.Style.FILL);
            float f8 = this.d;
            float f9 = -f7;
            textPaint.setShadowLayer(f8, f9, f9, n8);
            staticLayout.draw(canvas);
            textPaint.setShadowLayer(this.d, f7, f7, n7);
        }
        textPaint.setColor(this.l);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(n4);
    }

    public void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        this.d(n4 - n2);
    }

    protected void onMeasure(int n2, int n3) {
        if (w.super.d(View.MeasureSpec.getSize((int)n2))) {
            StaticLayout staticLayout = this.r;
            this.setMeasuredDimension(this.getPaddingLeft() + this.getPaddingRight() + 2 * this.u + staticLayout.getWidth(), staticLayout.getHeight() + this.getPaddingTop() + this.getPaddingBottom());
            return;
        }
        this.setMeasuredDimension(16777216, 16777216);
    }

    public void setBackgroundColor(int n2) {
        this.m = n2;
        this.invalidate();
    }
}

