/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.AnimationDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.StateSet
 *  androidx.appcompat.widget.l0
 *  androidx.core.graphics.drawable.b
 *  e.a.l.a.a$b
 *  e.a.l.a.a$d
 *  e.a.l.a.a$e
 *  e.a.l.a.a$g
 *  e.a.l.a.b
 *  e.a.l.a.b$c
 *  e.a.l.a.d
 *  e.a.l.a.d$a
 *  e.a.m.b
 *  e.d.d
 *  e.d.h
 *  e.e.d.d.g
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package e.a.l.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.l0;
import e.a.l.a.a;
import e.a.l.a.b;
import e.a.l.a.d;
import e.d.h;
import e.m.a.a.i;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/*
 * Exception performing whole class analysis.
 */
@SuppressLint(value={"RestrictedAPI"})
public class a
extends e.a.l.a.d
implements androidx.core.graphics.drawable.b {
    private c p;
    private g q;
    private int r;
    private int s;
    private boolean t;

    public a() {
        this(null, null);
    }

    a(c c2, Resources resources) {
        super(null);
        this.r = -1;
        this.s = -1;
        this.a((b.c)new c(c2, (a)this, resources));
        this.onStateChange(this.getState());
        this.jumpToCurrentState();
    }

    private void a(TypedArray typedArray) {
        c c2 = this.p;
        if (Build.VERSION.SDK_INT >= 21) {
            ((b.c)c2).d |= typedArray.getChangingConfigurations();
        }
        c2.b(typedArray.getBoolean(e.a.m.b.AnimatedStateListDrawableCompat_android_variablePadding, ((b.c)c2).i));
        c2.a(typedArray.getBoolean(e.a.m.b.AnimatedStateListDrawableCompat_android_constantSize, ((b.c)c2).l));
        c2.b(typedArray.getInt(e.a.m.b.AnimatedStateListDrawableCompat_android_enterFadeDuration, ((b.c)c2).A));
        c2.c(typedArray.getInt(e.a.m.b.AnimatedStateListDrawableCompat_android_exitFadeDuration, ((b.c)c2).B));
        this.setDither(typedArray.getBoolean(e.a.m.b.AnimatedStateListDrawableCompat_android_dither, ((b.c)c2).x));
    }

    public static a b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String string = xmlPullParser.getName();
        if (string.equals((Object)"animated-selector")) {
            a a2 = new a();
            a2.a(context, resources, xmlPullParser, attributeSet, theme);
            return a2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xmlPullParser.getPositionDescription());
        stringBuilder.append(": invalid animated-selector tag ");
        stringBuilder.append(string);
        throw new XmlPullParserException(stringBuilder.toString());
    }

    private boolean b(int n2) {
        block9 : {
            d d2;
            int n3;
            block11 : {
                Drawable drawable;
                block12 : {
                    block10 : {
                        g g2 = this.q;
                        if (g2 != null) {
                            if (n2 == this.r) {
                                return true;
                            }
                            if (n2 == this.s && g2.a()) {
                                g2.b();
                                this.r = this.s;
                                this.s = n2;
                                return true;
                            }
                            n3 = this.r;
                            g2.d();
                        } else {
                            n3 = this.b();
                        }
                        this.q = null;
                        this.s = -1;
                        this.r = -1;
                        c c2 = this.p;
                        int n4 = c2.d(n3);
                        int n5 = c2.d(n2);
                        if (n5 == 0) break block9;
                        if (n4 == 0) {
                            return false;
                        }
                        int n6 = c2.c(n4, n5);
                        if (n6 < 0) {
                            return false;
                        }
                        boolean bl = c2.e(n4, n5);
                        this.a(n6);
                        drawable = this.getCurrent();
                        if (!(drawable instanceof AnimationDrawable)) break block10;
                        boolean bl2 = c2.d(n4, n5);
                        d2 = new /* Unavailable Anonymous Inner Class!! */;
                        break block11;
                    }
                    if (!(drawable instanceof e.m.a.a.c)) break block12;
                    d2 = new /* Unavailable Anonymous Inner Class!! */;
                    break block11;
                }
                if (!(drawable instanceof Animatable)) break block9;
                d2 = new /* Unavailable Anonymous Inner Class!! */;
            }
            d2.c();
            this.q = d2;
            this.s = n3;
            this.r = n2;
            return true;
        }
        return false;
    }

    private void c() {
        this.onStateChange(this.getState());
    }

    private void c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int n2;
        int n3;
        int n4 = 1 + xmlPullParser.getDepth();
        while ((n3 = xmlPullParser.next()) != 1 && ((n2 = xmlPullParser.getDepth()) >= n4 || n3 != 3)) {
            if (n3 != 2 || n2 > n4) continue;
            if (xmlPullParser.getName().equals((Object)"item")) {
                this.d(context, resources, xmlPullParser, attributeSet, theme);
                continue;
            }
            if (!xmlPullParser.getName().equals((Object)"transition")) continue;
            this.e(context, resources, xmlPullParser, attributeSet, theme);
        }
    }

    private int d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParserException xmlPullParserException;
        TypedArray typedArray = e.e.d.d.g.a((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])e.a.m.b.AnimatedStateListDrawableItem);
        int n2 = typedArray.getResourceId(e.a.m.b.AnimatedStateListDrawableItem_android_id, 0);
        int n3 = typedArray.getResourceId(e.a.m.b.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable drawable = n3 > 0 ? l0.a().a(context, n3) : null;
        typedArray.recycle();
        int[] arrn = this.a(attributeSet);
        if (drawable == null) {
            int n4;
            while ((n4 = xmlPullParser.next()) == 4) {
            }
            if (n4 == 2) {
                drawable = xmlPullParser.getName().equals((Object)"vector") ? i.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : (Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner((Resources)resources, (XmlPullParser)xmlPullParser, (AttributeSet)attributeSet, (Resources.Theme)theme) : Drawable.createFromXmlInner((Resources)resources, (XmlPullParser)xmlPullParser, (AttributeSet)attributeSet));
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(xmlPullParser.getPositionDescription());
                stringBuilder.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(stringBuilder.toString());
            }
        }
        if (drawable != null) {
            return this.p.a(arrn, drawable, n2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xmlPullParser.getPositionDescription());
        stringBuilder.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        xmlPullParserException = new XmlPullParserException(stringBuilder.toString());
        throw xmlPullParserException;
    }

    private int e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParserException xmlPullParserException;
        TypedArray typedArray = e.e.d.d.g.a((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])e.a.m.b.AnimatedStateListDrawableTransition);
        int n2 = typedArray.getResourceId(e.a.m.b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int n3 = typedArray.getResourceId(e.a.m.b.AnimatedStateListDrawableTransition_android_toId, -1);
        int n4 = typedArray.getResourceId(e.a.m.b.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable drawable = n4 > 0 ? l0.a().a(context, n4) : null;
        boolean bl = typedArray.getBoolean(e.a.m.b.AnimatedStateListDrawableTransition_android_reversible, false);
        typedArray.recycle();
        if (drawable == null) {
            int n5;
            while ((n5 = xmlPullParser.next()) == 4) {
            }
            if (n5 == 2) {
                drawable = xmlPullParser.getName().equals((Object)"animated-vector") ? e.m.a.a.c.a(context, resources, xmlPullParser, attributeSet, theme) : (Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner((Resources)resources, (XmlPullParser)xmlPullParser, (AttributeSet)attributeSet, (Resources.Theme)theme) : Drawable.createFromXmlInner((Resources)resources, (XmlPullParser)xmlPullParser, (AttributeSet)attributeSet));
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(xmlPullParser.getPositionDescription());
                stringBuilder.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(stringBuilder.toString());
            }
        }
        if (drawable != null) {
            if (n2 != -1 && n3 != -1) {
                return this.p.a(n2, n3, drawable, bl);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(xmlPullParser.getPositionDescription());
            stringBuilder.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xmlPullParser.getPositionDescription());
        stringBuilder.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        xmlPullParserException = new XmlPullParserException(stringBuilder.toString());
        throw xmlPullParserException;
    }

    c a() {
        return new c(this.p, this, null);
    }

    public void a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray = e.e.d.d.g.a((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])e.a.m.b.AnimatedStateListDrawableCompat);
        this.setVisible(typedArray.getBoolean(e.a.m.b.AnimatedStateListDrawableCompat_android_visible, true), true);
        this.a(typedArray);
        this.a(resources);
        typedArray.recycle();
        this.c(context, resources, xmlPullParser, attributeSet, theme);
        this.c();
    }

    void a(b.c c2) {
        super.a(c2);
        if (c2 instanceof c) {
            this.p = (c)c2;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        e.a.l.a.b.super.jumpToCurrentState();
        g g2 = this.q;
        if (g2 != null) {
            g2.d();
            this.q = null;
            this.a(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            if (this == this) {
                this.p.m();
                this.t = true;
            }
        }
        return this;
    }

    protected boolean onStateChange(int[] arrn) {
        int n2 = this.p.b(arrn);
        boolean bl = n2 != this.b() && (a.super.b(n2) || this.a(n2));
        Drawable drawable = this.getCurrent();
        if (drawable != null) {
            bl |= drawable.setState(arrn);
        }
        return bl;
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        boolean bl3 = e.a.l.a.b.super.setVisible(bl, bl2);
        if (this.q != null && (bl3 || bl2)) {
            if (bl) {
                this.q.c();
                return bl3;
            }
            this.jumpToCurrentState();
        }
        return bl3;
    }

    static class c
    extends d.a {
        e.d.d<Long> K;
        h<Integer> L;

        c(c c2, a a2, Resources resources) {
            h h2;
            super((d.a)c2, (e.a.l.a.d)a2, resources);
            if (c2 != null) {
                this.K = c2.K;
                h2 = c2.L;
            } else {
                this.K = new e.d.d();
                h2 = new h();
            }
            this.L = h2;
        }

        private static long f(int n2, int n3) {
            return (long)n2 << 32 | (long)n3;
        }

        int a(int n2, int n3, Drawable drawable, boolean bl) {
            int n4 = b.c.super.a(drawable);
            long l2 = c.f(n2, n3);
            long l3 = bl ? 0x200000000L : 0L;
            e.d.d<Long> d2 = this.K;
            long l4 = n4;
            d2.a(l2, (Object)(l4 | l3));
            if (bl) {
                long l5 = c.f(n3, n2);
                this.K.a(l5, (Object)(l3 | (0x100000000L | l4)));
            }
            return n4;
        }

        int a(int[] arrn, Drawable drawable, int n2) {
            int n3 = super.a(arrn, drawable);
            this.L.c(n3, (Object)n2);
            return n3;
        }

        int b(int[] arrn) {
            int n2 = super.a(arrn);
            if (n2 >= 0) {
                return n2;
            }
            return super.a(StateSet.WILD_CARD);
        }

        int c(int n2, int n3) {
            long l2 = c.f(n2, n3);
            return (int)((Long)this.K.b(l2, (Object)-1L)).longValue();
        }

        int d(int n2) {
            if (n2 < 0) {
                return 0;
            }
            return (Integer)this.L.b(n2, (Object)0);
        }

        boolean d(int n2, int n3) {
            long l2 = c.f(n2, n3);
            return (0x100000000L & (Long)this.K.b(l2, (Object)-1L)) != 0L;
        }

        boolean e(int n2, int n3) {
            long l2 = c.f(n2, n3);
            return (0x200000000L & (Long)this.K.b(l2, (Object)-1L)) != 0L;
        }

        void m() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public Drawable newDrawable() {
            return new a(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new a((c)this, resources);
        }
    }

}

