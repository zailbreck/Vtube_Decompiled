/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  androidx.core.graphics.drawable.a
 *  java.lang.Runnable
 */
package e.a.l.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

public class c
extends Drawable
implements Drawable.Callback {
    private Drawable b;

    public c(Drawable drawable) {
        this.a(drawable);
    }

    public Drawable a() {
        return this.b;
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this);
        }
    }

    public void draw(Canvas canvas) {
        this.b.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.b.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.b.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.b.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.b.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.b.getMinimumWidth();
    }

    public int getOpacity() {
        return this.b.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.b.getPadding(rect);
    }

    public int[] getState() {
        return this.b.getState();
    }

    public Region getTransparentRegion() {
        return this.b.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        this.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.e((Drawable)this.b);
    }

    public boolean isStateful() {
        return this.b.isStateful();
    }

    public void jumpToCurrentState() {
        a.f((Drawable)this.b);
    }

    protected void onBoundsChange(Rect rect) {
        this.b.setBounds(rect);
    }

    protected boolean onLevelChange(int n2) {
        return this.b.setLevel(n2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
        this.scheduleSelf(runnable, l2);
    }

    public void setAlpha(int n2) {
        this.b.setAlpha(n2);
    }

    public void setAutoMirrored(boolean bl) {
        a.a((Drawable)this.b, (boolean)bl);
    }

    public void setChangingConfigurations(int n2) {
        this.b.setChangingConfigurations(n2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public void setDither(boolean bl) {
        this.b.setDither(bl);
    }

    public void setFilterBitmap(boolean bl) {
        this.b.setFilterBitmap(bl);
    }

    public void setHotspot(float f2, float f3) {
        a.a((Drawable)this.b, (float)f2, (float)f3);
    }

    public void setHotspotBounds(int n2, int n3, int n4, int n5) {
        a.a((Drawable)this.b, (int)n2, (int)n3, (int)n4, (int)n5);
    }

    public boolean setState(int[] arrn) {
        return this.b.setState(arrn);
    }

    public void setTint(int n2) {
        a.b((Drawable)this.b, (int)n2);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.a((Drawable)this.b, (ColorStateList)colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.a((Drawable)this.b, (PorterDuff.Mode)mode);
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        return super.setVisible(bl, bl2) || this.b.setVisible(bl, bl2);
        {
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}

