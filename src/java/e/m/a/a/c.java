/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.animation.ArgbEvaluator
 *  android.animation.ObjectAnimator
 *  android.animation.TypeEvaluator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.AnimatedVectorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  androidx.core.graphics.drawable.a
 *  e.d.a
 *  e.e.d.d.g
 *  e.m.a.a.a
 *  e.m.a.a.b
 *  e.m.a.a.c$a
 *  e.m.a.a.c$b
 *  e.m.a.a.c$c
 *  e.m.a.a.e
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  org.xmlpull.v1.XmlPullParser
 */
package e.m.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import e.e.d.d.g;
import e.m.a.a.c;
import e.m.a.a.e;
import e.m.a.a.h;
import e.m.a.a.i;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/*
 * Exception performing whole class analysis.
 */
public class c
extends h
implements e.m.a.a.b {
    private b c;
    private Context d;
    private ArgbEvaluator e;
    final Drawable.Callback f;

    c() {
        this(null, null, null);
    }

    private c(Context context) {
        super(context, null, null);
    }

    private c(Context context, b b2, Resources resources) {
        this.e = null;
        this.f = new a((c)this);
        this.d = context;
        if (b2 != null) {
            this.c = b2;
            return;
        }
        this.c = new /* Unavailable Anonymous Inner Class!! */;
    }

    public static c a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        c c2 = new c(context);
        c2.inflate(resources, xmlPullParser, attributeSet, theme);
        return c2;
    }

    private void a(Animator animator) {
        ArrayList arrayList;
        ObjectAnimator objectAnimator;
        String string;
        if (animator instanceof AnimatorSet && (arrayList = ((AnimatorSet)animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                c.super.a((Animator)arrayList.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator && ("fillColor".equals((Object)(string = (objectAnimator = (ObjectAnimator)animator).getPropertyName())) || "strokeColor".equals((Object)string))) {
            if (this.e == null) {
                this.e = new ArgbEvaluator();
            }
            objectAnimator.setEvaluator((TypeEvaluator)this.e);
        }
    }

    private void a(String string, Animator animator) {
        animator.setTarget(this.c.b.a(string));
        if (Build.VERSION.SDK_INT < 21) {
            c.super.a(animator);
        }
        b b2 = this.c;
        if (b2.d == null) {
            b2.d = new ArrayList();
            this.c.e = new e.d.a();
        }
        this.c.d.add((Object)animator);
        this.c.e.put((Object)animator, (Object)string);
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a((Drawable)drawable, (Resources.Theme)theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.a((Drawable)drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.c.b.draw(canvas);
        if (this.c.c.isStarted()) {
            this.invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b((Drawable)drawable);
        }
        return this.c.b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return Drawable.super.getChangingConfigurations() | this.c.a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.c((Drawable)drawable);
        }
        return this.c.b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.b;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new /* Unavailable Anonymous Inner Class!! */;
        }
        return null;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.c.b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.c.b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.c.b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        this.inflate(resources, xmlPullParser, attributeSet, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a((Drawable)drawable, (Resources)resources, (XmlPullParser)xmlPullParser, (AttributeSet)attributeSet, (Resources.Theme)theme);
            return;
        }
        int n2 = xmlPullParser.getEventType();
        int n3 = 1 + xmlPullParser.getDepth();
        while (n2 != 1 && (xmlPullParser.getDepth() >= n3 || n2 != 3)) {
            block10 : {
                TypedArray typedArray;
                block12 : {
                    String string;
                    block11 : {
                        if (n2 != 2) break block10;
                        string = xmlPullParser.getName();
                        if (!"animated-vector".equals((Object)string)) break block11;
                        typedArray = g.a((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])e.m.a.a.a.e);
                        int n4 = typedArray.getResourceId(0, 0);
                        if (n4 != 0) {
                            i i2 = i.a(resources, n4, theme);
                            i2.a(false);
                            i2.setCallback(this.f);
                            i i3 = this.c.b;
                            if (i3 != null) {
                                i3.setCallback(null);
                            }
                            this.c.b = i2;
                        }
                        break block12;
                    }
                    if (!"target".equals((Object)string)) break block10;
                    typedArray = resources.obtainAttributes(attributeSet, e.m.a.a.a.f);
                    String string2 = typedArray.getString(0);
                    int n5 = typedArray.getResourceId(1, 0);
                    if (n5 != 0) {
                        Context context = this.d;
                        if (context == null) {
                            typedArray.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        c.super.a(string2, e.a((Context)context, (int)n5));
                    }
                }
                typedArray.recycle();
            }
            n2 = xmlPullParser.next();
        }
        this.c.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e((Drawable)drawable);
        }
        return this.c.b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable)drawable).isRunning();
        }
        return this.c.c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.c.b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
            return;
        }
        this.c.b.setBounds(rect);
    }

    @Override
    protected boolean onLevelChange(int n2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setLevel(n2);
        }
        return this.c.b.setLevel(n2);
    }

    protected boolean onStateChange(int[] arrn) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setState(arrn);
        }
        return this.c.b.setState(arrn);
    }

    public void setAlpha(int n2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(n2);
            return;
        }
        this.c.b.setAlpha(n2);
    }

    public void setAutoMirrored(boolean bl) {
        Drawable drawable = this.b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a((Drawable)drawable, (boolean)bl);
            return;
        }
        this.c.b.setAutoMirrored(bl);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.c.b.setColorFilter(colorFilter);
    }

    public void setTint(int n2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b((Drawable)drawable, (int)n2);
            return;
        }
        this.c.b.setTint(n2);
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a((Drawable)drawable, (ColorStateList)colorStateList);
            return;
        }
        this.c.b.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a((Drawable)drawable, (PorterDuff.Mode)mode);
            return;
        }
        this.c.b.setTintMode(mode);
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setVisible(bl, bl2);
        }
        this.c.b.setVisible(bl, bl2);
        return Drawable.super.setVisible(bl, bl2);
    }

    public void start() {
        Drawable drawable = this.b;
        if (drawable != null) {
            ((AnimatedVectorDrawable)drawable).start();
            return;
        }
        if (this.c.c.isStarted()) {
            return;
        }
        this.c.c.start();
        this.invalidateSelf();
    }

    public void stop() {
        Drawable drawable = this.b;
        if (drawable != null) {
            ((AnimatedVectorDrawable)drawable).stop();
            return;
        }
        this.c.c.end();
    }
}

