/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Path
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.Xml
 *  androidx.core.graphics.drawable.a
 *  e.d.a
 *  e.e.d.d.b
 *  e.e.d.d.f
 *  e.e.d.d.g
 *  e.e.e.b
 *  e.e.e.b$b
 *  e.m.a.a.a
 *  e.m.a.a.i$a
 *  e.m.a.a.i$e
 *  e.m.a.a.i$g
 *  e.m.a.a.i$h
 *  e.m.a.a.i$i
 *  java.io.IOException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.ArrayList
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package e.m.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import e.e.e.b;
import e.m.a.a.i;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/*
 * Exception performing whole class analysis.
 */
public class i
extends e.m.a.a.h {
    static final PorterDuff.Mode k;
    private h c;
    private PorterDuffColorFilter d;
    private ColorFilter e;
    private boolean f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    static {
        k = PorterDuff.Mode.SRC_IN;
    }

    i() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = new /* Unavailable Anonymous Inner Class!! */;
    }

    i(h h2) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = h2;
        this.d = this.a(this.d, h2.c, h2.d);
    }

    static int a(int n2, float f2) {
        int n3 = Color.alpha((int)n2);
        return n2 & 16777215 | (int)(f2 * (float)n3) << 24;
    }

    private static PorterDuff.Mode a(int n2, PorterDuff.Mode mode) {
        if (n2 != 3) {
            if (n2 != 5) {
                if (n2 != 9) {
                    switch (n2) {
                        default: {
                            return mode;
                        }
                        case 16: {
                            return PorterDuff.Mode.ADD;
                        }
                        case 15: {
                            return PorterDuff.Mode.SCREEN;
                        }
                        case 14: 
                    }
                    return PorterDuff.Mode.MULTIPLY;
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static i a(Resources resources, int n2, Resources.Theme theme) {
        void var5_9;
        int n3;
        if (Build.VERSION.SDK_INT >= 24) {
            i i2 = new i();
            i2.b = e.e.d.d.f.a((Resources)resources, (int)n2, (Resources.Theme)theme);
            new /* Unavailable Anonymous Inner Class!! */;
            return i2;
        }
        XmlResourceParser xmlResourceParser = resources.getXml(n2);
        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        while ((n3 = xmlResourceParser.next()) != 2 && n3 != 1) {
        }
        if (n3 != 2) throw new XmlPullParserException("No start tag found");
        try {
            return i.createFromXmlInner(resources, (XmlPullParser)xmlResourceParser, attributeSet, theme);
        }
        catch (IOException iOException) {
        }
        catch (XmlPullParserException xmlPullParserException) {
            // empty catch block
        }
        Log.e((String)"VectorDrawableCompat", (String)"parser error", (Throwable)var5_9);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h h2 = this.c;
        g g2 = h2.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push((Object)g2.h);
        int n2 = xmlPullParser.getEventType();
        int n3 = 1 + xmlPullParser.getDepth();
        boolean bl = true;
        while (n2 != 1 && (xmlPullParser.getDepth() >= n3 || n2 != 3)) {
            block13 : {
                block8 : {
                    int n4;
                    int n5;
                    block12 : {
                        d d2;
                        String string;
                        block11 : {
                            f f2;
                            block10 : {
                                block9 : {
                                    if (n2 != 2) break block8;
                                    string = xmlPullParser.getName();
                                    d2 = (Object)arrayDeque.peek();
                                    if (!"path".equals((Object)string)) break block9;
                                    f2 = new c();
                                    ((c)f2).a(resources, attributeSet, theme, xmlPullParser);
                                    d2.b.add((Object)f2);
                                    if (f2.getPathName() != null) {
                                        g2.p.put((Object)f2.getPathName(), (Object)f2);
                                    }
                                    bl = false;
                                    break block10;
                                }
                                if (!"clip-path".equals((Object)string)) break block11;
                                f2 = new b();
                                ((b)f2).a(resources, attributeSet, theme, xmlPullParser);
                                d2.b.add((Object)f2);
                                if (f2.getPathName() != null) {
                                    g2.p.put((Object)f2.getPathName(), (Object)f2);
                                }
                            }
                            n4 = h2.a;
                            n5 = f2.d;
                            break block12;
                        }
                        if (!"group".equals((Object)string)) break block13;
                        e e2 = new e(){
                            final Matrix a;
                            final ArrayList<e> b;
                            float c;
                            private float d;
                            private float e;
                            private float f;
                            private float g;
                            private float h;
                            private float i;
                            final Matrix j;
                            int k;
                            private int[] l;
                            private String m;
                            {
                                this.a = new Matrix();
                                this.b = new ArrayList();
                                this.c = 0.0f;
                                this.d = 0.0f;
                                this.e = 0.0f;
                                this.f = 1.0f;
                                this.g = 1.0f;
                                this.h = 0.0f;
                                this.i = 0.0f;
                                this.j = new Matrix();
                                this.m = null;
                            }
                            {
                                this.a = new Matrix();
                                this.b = new ArrayList();
                                this.c = 0.0f;
                                this.d = 0.0f;
                                this.e = 0.0f;
                                this.f = 1.0f;
                                this.g = 1.0f;
                                this.h = 0.0f;
                                this.i = 0.0f;
                                this.j = new Matrix();
                                this.m = null;
                                this.c = d2.c;
                                this.d = d2.d;
                                this.e = d2.e;
                                this.f = d2.f;
                                this.g = d2.g;
                                this.h = d2.h;
                                this.i = d2.i;
                                this.l = d2.l;
                                this.m = d2.m;
                                this.k = d2.k;
                                String string = this.m;
                                if (string != null) {
                                    a2.put((Object)string, (Object)this);
                                }
                                this.j.set(d2.j);
                                ArrayList<e> arrayList = d2.b;
                                for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                                    block8 : {
                                        f f2;
                                        block7 : {
                                            Object object;
                                            block6 : {
                                                object = arrayList.get(i2);
                                                if (object instanceof d) {
                                                    d d3 = (Object)object;
                                                    this.b.add((Object)new /* invalid duplicate definition of identical inner class */);
                                                    continue;
                                                }
                                                if (!(object instanceof c)) break block6;
                                                f2 = new c((c)((Object)object));
                                                break block7;
                                            }
                                            if (!(object instanceof b)) break block8;
                                            f2 = new b((b)((Object)object));
                                        }
                                        this.b.add((Object)f2);
                                        String string2 = f2.b;
                                        if (string2 == null) continue;
                                        a2.put((Object)string2, (Object)f2);
                                        continue;
                                    }
                                    throw new IllegalStateException("Unknown object in the tree!");
                                }
                            }

                            private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
                                this.l = null;
                                this.c = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"rotation", (int)5, (float)this.c);
                                this.d = typedArray.getFloat(1, this.d);
                                this.e = typedArray.getFloat(2, this.e);
                                this.f = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"scaleX", (int)3, (float)this.f);
                                this.g = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"scaleY", (int)4, (float)this.g);
                                this.h = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"translateX", (int)6, (float)this.h);
                                this.i = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"translateY", (int)7, (float)this.i);
                                String string = typedArray.getString(0);
                                if (string != null) {
                                    this.m = string;
                                }
                                d.super.b();
                            }

                            private void b() {
                                this.j.reset();
                                this.j.postTranslate(-this.d, -this.e);
                                this.j.postScale(this.f, this.g);
                                this.j.postRotate(this.c, 0.0f, 0.0f);
                                this.j.postTranslate(this.h + this.d, this.i + this.e);
                            }

                            public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
                                TypedArray typedArray = e.e.d.d.g.a((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])e.m.a.a.a.b);
                                d.super.a(typedArray, xmlPullParser);
                                typedArray.recycle();
                            }

                            public boolean a() {
                                for (int i2 = 0; i2 < this.b.size(); ++i2) {
                                    if (!(this.b.get(i2)).a()) continue;
                                    return true;
                                }
                                return false;
                            }

                            public boolean a(int[] arrn) {
                                boolean bl = false;
                                for (int i2 = 0; i2 < this.b.size(); ++i2) {
                                    bl |= (this.b.get(i2)).a(arrn);
                                }
                                return bl;
                            }

                            public String getGroupName() {
                                return this.m;
                            }

                            public Matrix getLocalMatrix() {
                                return this.j;
                            }

                            public float getPivotX() {
                                return this.d;
                            }

                            public float getPivotY() {
                                return this.e;
                            }

                            public float getRotation() {
                                return this.c;
                            }

                            public float getScaleX() {
                                return this.f;
                            }

                            public float getScaleY() {
                                return this.g;
                            }

                            public float getTranslateX() {
                                return this.h;
                            }

                            public float getTranslateY() {
                                return this.i;
                            }

                            public void setPivotX(float f2) {
                                if (f2 != this.d) {
                                    this.d = f2;
                                    d.super.b();
                                }
                            }

                            public void setPivotY(float f2) {
                                if (f2 != this.e) {
                                    this.e = f2;
                                    d.super.b();
                                }
                            }

                            public void setRotation(float f2) {
                                if (f2 != this.c) {
                                    this.c = f2;
                                    d.super.b();
                                }
                            }

                            public void setScaleX(float f2) {
                                if (f2 != this.f) {
                                    this.f = f2;
                                    d.super.b();
                                }
                            }

                            public void setScaleY(float f2) {
                                if (f2 != this.g) {
                                    this.g = f2;
                                    d.super.b();
                                }
                            }

                            public void setTranslateX(float f2) {
                                if (f2 != this.h) {
                                    this.h = f2;
                                    d.super.b();
                                }
                            }

                            public void setTranslateY(float f2) {
                                if (f2 != this.i) {
                                    this.i = f2;
                                    d.super.b();
                                }
                            }
                        };
                        e2.a(resources, attributeSet, theme, xmlPullParser);
                        d2.b.add((Object)e2);
                        arrayDeque.push((Object)e2);
                        if (e2.getGroupName() != null) {
                            g2.p.put((Object)e2.getGroupName(), (Object)e2);
                        }
                        n4 = h2.a;
                        n5 = e2.k;
                    }
                    h2.a = n5 | n4;
                    break block13;
                }
                if (n2 == 3 && "group".equals((Object)xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            n2 = xmlPullParser.next();
        }
        if (!bl) {
            return;
        }
        XmlPullParserException xmlPullParserException = new XmlPullParserException("no path defined");
        throw xmlPullParserException;
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h h2 = this.c;
        g g2 = h2.b;
        h2.d = i.a(e.e.d.d.g.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"tintMode", (int)6, (int)-1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (Resources.Theme)theme, (String)"tint", (int)1);
        if (colorStateList != null) {
            h2.c = colorStateList;
        }
        h2.e = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"autoMirrored", (int)5, (boolean)h2.e);
        g2.k = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"viewportWidth", (int)7, (float)g2.k);
        g2.l = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"viewportHeight", (int)8, (float)g2.l);
        if (!(g2.k <= 0.0f)) {
            if (!(g2.l <= 0.0f)) {
                g2.i = typedArray.getDimension(3, g2.i);
                g2.j = typedArray.getDimension(2, g2.j);
                if (!(g2.i <= 0.0f)) {
                    if (!(g2.j <= 0.0f)) {
                        g2.setAlpha(e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"alpha", (int)4, (float)g2.getAlpha()));
                        String string = typedArray.getString(0);
                        if (string != null) {
                            g2.n = string;
                            g2.p.put((Object)string, (Object)g2);
                        }
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(typedArray.getPositionDescription());
                    stringBuilder.append("<vector> tag requires height > 0");
                    throw new XmlPullParserException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(typedArray.getPositionDescription());
                stringBuilder.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(typedArray.getPositionDescription());
            stringBuilder.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(typedArray.getPositionDescription());
        stringBuilder.append("<vector> tag requires viewportWidth > 0");
        throw new XmlPullParserException(stringBuilder.toString());
    }

    private boolean a() {
        int n2 = Build.VERSION.SDK_INT;
        boolean bl = false;
        if (n2 >= 17) {
            boolean bl2 = this.isAutoMirrored();
            bl = false;
            if (bl2) {
                int n3 = androidx.core.graphics.drawable.a.d((Drawable)this);
                bl = false;
                if (n3 == 1) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public static i createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        i i2 = new i();
        i2.inflate(resources, xmlPullParser, attributeSet, theme);
        return i2;
    }

    PorterDuffColorFilter a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(this.getState(), 0), mode);
        }
        return null;
    }

    Object a(String string) {
        return this.c.b.p.get((Object)string);
    }

    void a(boolean bl) {
        this.g = bl;
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a((Drawable)drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.copyBounds(this.j);
        if (this.j.width() > 0) {
            if (this.j.height() <= 0) {
                return;
            }
            ColorFilter colorFilter = this.e;
            if (colorFilter == null) {
                colorFilter = this.d;
            }
            canvas.getMatrix(this.i);
            this.i.getValues(this.h);
            float f2 = Math.abs((float)this.h[0]);
            float f3 = Math.abs((float)this.h[4]);
            float f4 = Math.abs((float)this.h[1]);
            float f5 = Math.abs((float)this.h[3]);
            if (f4 != 0.0f || f5 != 0.0f) {
                f2 = 1.0f;
                f3 = 1.0f;
            }
            int n2 = (int)(f2 * (float)this.j.width());
            int n3 = (int)(f3 * (float)this.j.height());
            int n4 = Math.min((int)2048, (int)n2);
            int n5 = Math.min((int)2048, (int)n3);
            if (n4 > 0) {
                if (n5 <= 0) {
                    return;
                }
                int n6 = canvas.save();
                Rect rect = this.j;
                canvas.translate((float)rect.left, (float)rect.top);
                if (i.super.a()) {
                    canvas.translate((float)this.j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.j.offsetTo(0, 0);
                this.c.b(n4, n5);
                if (!this.g) {
                    this.c.c(n4, n5);
                } else if (!this.c.a()) {
                    this.c.c(n4, n5);
                    this.c.d();
                }
                this.c.a(canvas, colorFilter, this.j);
                canvas.restoreToCount(n6);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b((Drawable)drawable);
        }
        return this.c.b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return Drawable.super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.c((Drawable)drawable);
        }
        return this.e;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.b;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new /* Unavailable Anonymous Inner Class!! */;
        }
        this.c.a = this.getChangingConfigurations();
        return this.c;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int)this.c.b.j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int)this.c.b.i;
    }

    public int getOpacity() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
            return;
        }
        this.inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a((Drawable)drawable, (Resources)resources, (XmlPullParser)xmlPullParser, (AttributeSet)attributeSet, (Resources.Theme)theme);
            return;
        }
        h h2 = this.c;
        h2.b = new /* Unavailable Anonymous Inner Class!! */;
        TypedArray typedArray = e.e.d.d.g.a((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])e.m.a.a.a.a);
        i.super.a(typedArray, xmlPullParser, theme);
        typedArray.recycle();
        h2.a = this.getChangingConfigurations();
        h2.k = true;
        i.super.a(resources, xmlPullParser, attributeSet, theme);
        this.d = this.a(this.d, h2.c, h2.d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.invalidateSelf();
            return;
        }
        Drawable.super.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e((Drawable)drawable);
        }
        return this.c.e;
    }

    public boolean isStateful() {
        h h2;
        ColorStateList colorStateList;
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return Drawable.super.isStateful() || (h2 = this.c) != null && (h2.c() || (colorStateList = this.c.c) != null && colorStateList.isStateful());
        {
        }
    }

    public Drawable mutate() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && Drawable.super.mutate() == this) {
            this.c = new /* Unavailable Anonymous Inner Class!! */;
            this.f = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    protected boolean onStateChange(int[] arrn) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setState(arrn);
        }
        h h2 = this.c;
        ColorStateList colorStateList = h2.c;
        boolean bl = false;
        if (colorStateList != null) {
            PorterDuff.Mode mode = h2.d;
            bl = false;
            if (mode != null) {
                this.d = this.a(this.d, colorStateList, mode);
                this.invalidateSelf();
                bl = true;
            }
        }
        if (h2.c() && h2.a(arrn)) {
            this.invalidateSelf();
            bl = true;
        }
        return bl;
    }

    public void scheduleSelf(Runnable runnable, long l2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, l2);
            return;
        }
        Drawable.super.scheduleSelf(runnable, l2);
    }

    public void setAlpha(int n2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(n2);
            return;
        }
        if (this.c.b.getRootAlpha() != n2) {
            this.c.b.setRootAlpha(n2);
            this.invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean bl) {
        Drawable drawable = this.b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a((Drawable)drawable, (boolean)bl);
            return;
        }
        this.c.e = bl;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        this.invalidateSelf();
    }

    public void setTint(int n2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b((Drawable)drawable, (int)n2);
            return;
        }
        this.setTintList(ColorStateList.valueOf((int)n2));
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a((Drawable)drawable, (ColorStateList)colorStateList);
            return;
        }
        h h2 = this.c;
        if (h2.c != colorStateList) {
            h2.c = colorStateList;
            this.d = this.a(this.d, colorStateList, h2.d);
            this.invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a((Drawable)drawable, (PorterDuff.Mode)mode);
            return;
        }
        h h2 = this.c;
        if (h2.d != mode) {
            h2.d = mode;
            this.d = this.a(this.d, h2.c, mode);
            this.invalidateSelf();
        }
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setVisible(bl, bl2);
        }
        return Drawable.super.setVisible(bl, bl2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
            return;
        }
        Drawable.super.unscheduleSelf(runnable);
    }

    private static class b
    extends f {
        b() {
        }

        b(b b2) {
            super(b2);
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string;
            String string2 = typedArray.getString(0);
            if (string2 != null) {
                this.b = string2;
            }
            if ((string = typedArray.getString(1)) != null) {
                this.a = e.e.e.b.a((String)string);
            }
            this.c = e.e.d.d.g.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"fillType", (int)2, (int)0);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!e.e.d.d.g.a((XmlPullParser)xmlPullParser, (String)"pathData")) {
                return;
            }
            TypedArray typedArray = e.e.d.d.g.a((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])e.m.a.a.a.d);
            b.super.a(typedArray, xmlPullParser);
            typedArray.recycle();
        }

        @Override
        public boolean b() {
            return true;
        }
    }

    private static class c
    extends f {
        private int[] e;
        e.e.d.d.b f;
        float g;
        e.e.d.d.b h;
        float i;
        float j;
        float k;
        float l;
        float m;
        Paint.Cap n;
        Paint.Join o;
        float p;

        c() {
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        c(c c2) {
            super(c2);
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.e = c2.e;
            this.f = c2.f;
            this.g = c2.g;
            this.i = c2.i;
            this.h = c2.h;
            this.c = c2.c;
            this.j = c2.j;
            this.k = c2.k;
            this.l = c2.l;
            this.m = c2.m;
            this.n = c2.n;
            this.o = c2.o;
            this.p = c2.p;
        }

        private Paint.Cap a(int n2, Paint.Cap cap) {
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        return cap;
                    }
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        private Paint.Join a(int n2, Paint.Join join) {
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        return join;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            String string;
            this.e = null;
            if (!e.e.d.d.g.a((XmlPullParser)xmlPullParser, (String)"pathData")) {
                return;
            }
            String string2 = typedArray.getString(0);
            if (string2 != null) {
                this.b = string2;
            }
            if ((string = typedArray.getString(2)) != null) {
                this.a = e.e.e.b.a((String)string);
            }
            this.h = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (Resources.Theme)theme, (String)"fillColor", (int)1, (int)0);
            this.j = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"fillAlpha", (int)12, (float)this.j);
            this.n = c.super.a(e.e.d.d.g.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"strokeLineCap", (int)8, (int)-1), this.n);
            this.o = c.super.a(e.e.d.d.g.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"strokeLineJoin", (int)9, (int)-1), this.o);
            this.p = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"strokeMiterLimit", (int)10, (float)this.p);
            this.f = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (Resources.Theme)theme, (String)"strokeColor", (int)3, (int)0);
            this.i = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"strokeAlpha", (int)11, (float)this.i);
            this.g = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"strokeWidth", (int)4, (float)this.g);
            this.l = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"trimPathEnd", (int)6, (float)this.l);
            this.m = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"trimPathOffset", (int)7, (float)this.m);
            this.k = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"trimPathStart", (int)5, (float)this.k);
            this.c = e.e.d.d.g.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"fillType", (int)13, (int)this.c);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArray = e.e.d.d.g.a((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])e.m.a.a.a.c);
            c.super.a(typedArray, xmlPullParser, theme);
            typedArray.recycle();
        }

        public boolean a() {
            return this.h.d() || this.f.d();
            {
            }
        }

        public boolean a(int[] arrn) {
            return this.h.a(arrn) | this.f.a(arrn);
        }

        float getFillAlpha() {
            return this.j;
        }

        int getFillColor() {
            return this.h.a();
        }

        float getStrokeAlpha() {
            return this.i;
        }

        int getStrokeColor() {
            return this.f.a();
        }

        float getStrokeWidth() {
            return this.g;
        }

        float getTrimPathEnd() {
            return this.l;
        }

        float getTrimPathOffset() {
            return this.m;
        }

        float getTrimPathStart() {
            return this.k;
        }

        void setFillAlpha(float f2) {
            this.j = f2;
        }

        void setFillColor(int n2) {
            this.h.a(n2);
        }

        void setStrokeAlpha(float f2) {
            this.i = f2;
        }

        void setStrokeColor(int n2) {
            this.f.a(n2);
        }

        void setStrokeWidth(float f2) {
            this.g = f2;
        }

        void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        void setTrimPathStart(float f2) {
            this.k = f2;
        }
    }

}

