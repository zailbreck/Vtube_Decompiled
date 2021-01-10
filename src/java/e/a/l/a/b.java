/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Outline
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  android.util.DisplayMetrics
 *  android.util.SparseArray
 *  androidx.core.graphics.drawable.a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.System
 *  java.lang.Throwable
 */
package e.a.l.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.SparseArray;

class b
extends Drawable
implements Drawable.Callback {
    private c b;
    private Rect c;
    private Drawable d;
    private Drawable e;
    private int f = 255;
    private boolean g;
    private int h = -1;
    private boolean i;
    private Runnable j;
    private long k;
    private long l;
    private b m;

    b() {
    }

    static int a(Resources resources, int n2) {
        if (resources != null) {
            n2 = resources.getDisplayMetrics().densityDpi;
        }
        if (n2 == 0) {
            n2 = 160;
        }
        return n2;
    }

    private void a(Drawable drawable) {
        block12 : {
            if (this.m == null) {
                this.m = new b();
            }
            b b2 = this.m;
            b2.a(drawable.getCallback());
            drawable.setCallback((Drawable.Callback)b2);
            if (this.b.A <= 0 && this.g) {
                drawable.setAlpha(this.f);
            }
            if (this.b.E) {
                drawable.setColorFilter(this.b.D);
            } else {
                if (this.b.H) {
                    androidx.core.graphics.drawable.a.a((Drawable)drawable, (ColorStateList)this.b.F);
                }
                if (this.b.I) {
                    androidx.core.graphics.drawable.a.a((Drawable)drawable, (PorterDuff.Mode)this.b.G);
                }
            }
            drawable.setVisible(this.isVisible(), true);
            drawable.setDither(this.b.x);
            drawable.setState(this.getState());
            drawable.setLevel(this.getLevel());
            drawable.setBounds(this.getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.b.C);
            }
            Rect rect = this.c;
            if (Build.VERSION.SDK_INT < 21 || rect == null) break block12;
            drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
        }
        return;
        finally {
            drawable.setCallback(this.m.a());
        }
    }

    private boolean c() {
        return this.isAutoMirrored() && androidx.core.graphics.drawable.a.d((Drawable)this) == 1;
    }

    c a() {
        throw null;
    }

    final void a(Resources resources) {
        this.b.a(resources);
    }

    void a(c c2) {
        Drawable drawable;
        this.b = c2;
        int n2 = this.h;
        if (n2 >= 0 && (drawable = (this.d = c2.a(n2))) != null) {
            b.super.a(drawable);
        }
        this.e = null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    void a(boolean var1) {
        this.g = var2_2 = true;
        var3_3 = SystemClock.uptimeMillis();
        var5_4 = this.d;
        if (var5_4 == null) ** GOTO lbl-1000
        var11_5 = this.k;
        if (var11_5 != 0L) {
            if (var11_5 > var3_3) {
                var5_4.setAlpha((255 - (int)(255L * (var11_5 - var3_3)) / this.b.A) * this.f / 255);
                var6_6 = true;
            } else {
                var5_4.setAlpha(this.f);
            }
        }
        ** GOTO lbl14
lbl-1000: // 2 sources:
        {
            this.k = 0L;
lbl14: // 2 sources:
            var6_6 = false;
        }
        var7_7 = this.e;
        if (var7_7 == null) ** GOTO lbl-1000
        var8_8 = this.l;
        if (var8_8 != 0L) {
            if (var8_8 > var3_3) {
                var7_7.setAlpha((int)(255L * (var8_8 - var3_3)) / this.b.B * this.f / 255);
            } else {
                var7_7.setVisible(false, false);
                this.e = null;
            }
        }
        ** GOTO lbl26
lbl-1000: // 2 sources:
        {
            this.l = 0L;
lbl26: // 2 sources:
            var2_2 = var6_6;
        }
        if (var1 == false) return;
        if (var2_2 == false) return;
        this.scheduleSelf(this.j, var3_3 + 16L);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    boolean a(int var1) {
        if (var1 == this.h) {
            return false;
        }
        var2_2 = SystemClock.uptimeMillis();
        if (this.b.B > 0) {
            var10_3 = this.e;
            if (var10_3 != null) {
                var10_3.setVisible(false, false);
            }
            if ((var11_4 = this.d) != null) {
                this.e = var11_4;
                this.l = var2_2 + (long)this.b.B;
            } else {
                this.e = null;
                this.l = 0L;
            }
        } else {
            var4_5 = this.d;
            if (var4_5 != null) {
                var4_5.setVisible(false, false);
            }
        }
        if (var1 < 0) ** GOTO lbl-1000
        var6_6 = this.b;
        if (var1 < var6_6.h) {
            this.d = var7_7 = var6_6.a(var1);
            this.h = var1;
            if (var7_7 != null) {
                var8_8 = this.b.A;
                if (var8_8 > 0) {
                    this.k = var2_2 + (long)var8_8;
                }
                b.super.a(var7_7);
            }
        } else lbl-1000: // 2 sources:
        {
            this.d = null;
            this.h = -1;
        }
        if (this.k != 0L || this.l != 0L) {
            var5_9 = this.j;
            if (var5_9 == null) {
                this.j = new Runnable(){

                    public void run() {
                        b.this.a(true);
                        b.this.invalidateSelf();
                    }
                };
            } else {
                this.unscheduleSelf(var5_9);
            }
            this.a(true);
        }
        this.invalidateSelf();
        return true;
    }

    public void applyTheme(Resources.Theme theme) {
        this.b.a(theme);
    }

    int b() {
        return this.h;
    }

    public boolean canApplyTheme() {
        return this.b.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if ((drawable = this.e) != null) {
            drawable.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.b.a()) {
            this.b.d = this.getChangingConfigurations();
            return this.b;
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.d;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.c;
        if (rect2 != null) {
            rect.set(rect2);
            return;
        }
        super.getHotspotBounds(rect);
    }

    public int getIntrinsicHeight() {
        if (this.b.l()) {
            return this.b.e();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.b.l()) {
            return this.b.i();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.b.l()) {
            return this.b.f();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.b.l()) {
            return this.b.g();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.d;
        if (drawable != null && drawable.isVisible()) {
            return this.b.j();
        }
        return -2;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean bl;
        Rect rect2 = this.b.h();
        if (rect2 != null) {
            rect.set(rect2);
            bl = (rect2.left | rect2.top | rect2.bottom | rect2.right) != 0;
        } else {
            Drawable drawable = this.d;
            bl = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (b.super.c()) {
            int n2 = rect.left;
            rect.left = rect.right;
            rect.right = n2;
        }
        return bl;
    }

    public void invalidateDrawable(Drawable drawable) {
        c c2 = this.b;
        if (c2 != null) {
            c2.k();
        }
        if (drawable == this.d && this.getCallback() != null) {
            this.getCallback().invalidateDrawable((Drawable)this);
        }
    }

    public boolean isAutoMirrored() {
        return this.b.C;
    }

    public void jumpToCurrentState() {
        boolean bl;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.e = null;
            bl = true;
        } else {
            bl = false;
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.g) {
                this.d.setAlpha(this.f);
            }
        }
        if (this.l != 0L) {
            this.l = 0L;
            bl = true;
        }
        if (this.k != 0L) {
            this.k = 0L;
            bl = true;
        }
        if (bl) {
            this.invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            c c2 = this.a();
            c2.m();
            this.a(c2);
            this.i = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        Drawable drawable;
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
        if ((drawable = this.d) != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int n2) {
        return this.b.b(n2, this.b());
    }

    protected boolean onLevelChange(int n2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setLevel(n2);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setLevel(n2);
        }
        return false;
    }

    protected boolean onStateChange(int[] arrn) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(arrn);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setState(arrn);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
        if (drawable == this.d && this.getCallback() != null) {
            this.getCallback().scheduleDrawable((Drawable)this, runnable, l2);
        }
    }

    public void setAlpha(int n2) {
        if (!this.g || this.f != n2) {
            this.g = true;
            this.f = n2;
            Drawable drawable = this.d;
            if (drawable != null) {
                if (this.k == 0L) {
                    drawable.setAlpha(n2);
                    return;
                }
                this.a(false);
            }
        }
    }

    public void setAutoMirrored(boolean bl) {
        c c2 = this.b;
        if (c2.C != bl) {
            c2.C = bl;
            Drawable drawable = this.d;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.a((Drawable)drawable, (boolean)c2.C);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c c2 = this.b;
        c2.E = true;
        if (c2.D != colorFilter) {
            c2.D = colorFilter;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean bl) {
        c c2 = this.b;
        if (c2.x != bl) {
            c2.x = bl;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setDither(c2.x);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a((Drawable)drawable, (float)f2, (float)f3);
        }
    }

    public void setHotspotBounds(int n2, int n3, int n4, int n5) {
        Rect rect = this.c;
        if (rect == null) {
            this.c = new Rect(n2, n3, n4, n5);
        } else {
            rect.set(n2, n3, n4, n5);
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a((Drawable)drawable, (int)n2, (int)n3, (int)n4, (int)n5);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        c c2 = this.b;
        c2.H = true;
        if (c2.F != colorStateList) {
            c2.F = colorStateList;
            androidx.core.graphics.drawable.a.a((Drawable)this.d, (ColorStateList)colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c c2 = this.b;
        c2.I = true;
        if (c2.G != mode) {
            c2.G = mode;
            androidx.core.graphics.drawable.a.a((Drawable)this.d, (PorterDuff.Mode)mode);
        }
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        Drawable drawable;
        boolean bl3 = super.setVisible(bl, bl2);
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setVisible(bl, bl2);
        }
        if ((drawable = this.d) != null) {
            drawable.setVisible(bl, bl2);
        }
        return bl3;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.d && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable((Drawable)this, runnable);
        }
    }

    static class b
    implements Drawable.Callback {
        private Drawable.Callback b;

        b() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.b;
            this.b = null;
            return callback;
        }

        public b a(Drawable.Callback callback) {
            this.b = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
            Drawable.Callback callback = this.b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, l2);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static abstract class c
    extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;
        final b a;
        Resources b;
        int c = 160;
        int d;
        int e;
        SparseArray<Drawable.ConstantState> f;
        Drawable[] g;
        int h;
        boolean i;
        boolean j;
        Rect k;
        boolean l;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;

        c(c c2, b b2, Resources resources) {
            int n2 = 0;
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = b2;
            Object object = resources != null ? resources : (c2 != null ? c2.b : null);
            this.b = object;
            int n3 = c2 != null ? c2.c : 0;
            this.c = b.a(resources, n3);
            if (c2 != null) {
                this.d = c2.d;
                this.e = c2.e;
                this.v = true;
                this.w = true;
                this.i = c2.i;
                this.l = c2.l;
                this.x = c2.x;
                this.y = c2.y;
                this.z = c2.z;
                this.A = c2.A;
                this.B = c2.B;
                this.C = c2.C;
                this.D = c2.D;
                this.E = c2.E;
                this.F = c2.F;
                this.G = c2.G;
                this.H = c2.H;
                this.I = c2.I;
                if (c2.c == this.c) {
                    if (c2.j) {
                        this.k = new Rect(c2.k);
                        this.j = true;
                    }
                    if (c2.m) {
                        this.n = c2.n;
                        this.o = c2.o;
                        this.p = c2.p;
                        this.q = c2.q;
                        this.m = true;
                    }
                }
                if (c2.r) {
                    this.s = c2.s;
                    this.r = true;
                }
                if (c2.t) {
                    this.u = c2.u;
                    this.t = true;
                }
                Drawable[] arrdrawable = c2.g;
                this.g = new Drawable[arrdrawable.length];
                this.h = c2.h;
                SparseArray<Drawable.ConstantState> sparseArray = c2.f;
                SparseArray sparseArray2 = sparseArray != null ? sparseArray.clone() : new SparseArray(this.h);
                this.f = sparseArray2;
                int n4 = this.h;
                while (n2 < n4) {
                    if (arrdrawable[n2] != null) {
                        Drawable.ConstantState constantState = arrdrawable[n2].getConstantState();
                        if (constantState != null) {
                            this.f.put(n2, (Object)constantState);
                        } else {
                            this.g[n2] = arrdrawable[n2];
                        }
                    }
                    ++n2;
                }
            } else {
                this.g = new Drawable[10];
                this.h = 0;
            }
        }

        private Drawable b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.z);
            }
            Drawable drawable2 = drawable.mutate();
            drawable2.setCallback((Drawable.Callback)this.a);
            return drawable2;
        }

        private void n() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray != null) {
                int n2 = sparseArray.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    int n3 = this.f.keyAt(i2);
                    Drawable.ConstantState constantState = (Drawable.ConstantState)this.f.valueAt(i2);
                    this.g[n3] = this.b(constantState.newDrawable(this.b));
                }
                this.f = null;
            }
        }

        public final int a(Drawable drawable) {
            int n2 = this.h;
            if (n2 >= this.g.length) {
                this.a(n2, n2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback((Drawable.Callback)this.a);
            this.g[n2] = drawable;
            this.h = 1 + this.h;
            this.e |= drawable.getChangingConfigurations();
            this.k();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return n2;
        }

        public final Drawable a(int n2) {
            int n3;
            Drawable drawable = this.g[n2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray != null && (n3 = sparseArray.indexOfKey(n2)) >= 0) {
                Drawable drawable2;
                this.g[n2] = drawable2 = c.super.b(((Drawable.ConstantState)this.f.valueAt(n3)).newDrawable(this.b));
                this.f.removeAt(n3);
                if (this.f.size() == 0) {
                    this.f = null;
                }
                return drawable2;
            }
            return null;
        }

        public void a(int n2, int n3) {
            Drawable[] arrdrawable = new Drawable[n3];
            System.arraycopy((Object)this.g, (int)0, (Object)arrdrawable, (int)0, (int)n2);
            this.g = arrdrawable;
        }

        final void a(Resources.Theme theme) {
            if (theme != null) {
                c.super.n();
                int n2 = this.h;
                Drawable[] arrdrawable = this.g;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (arrdrawable[i2] == null || !arrdrawable[i2].canApplyTheme()) continue;
                    arrdrawable[i2].applyTheme(theme);
                    this.e |= arrdrawable[i2].getChangingConfigurations();
                }
                this.a(theme.getResources());
            }
        }

        final void a(Resources resources) {
            if (resources != null) {
                this.b = resources;
                int n2 = b.a(resources, this.c);
                int n3 = this.c;
                this.c = n2;
                if (n3 != n2) {
                    this.m = false;
                    this.j = false;
                }
            }
        }

        public final void a(boolean bl) {
            this.l = bl;
        }

        public boolean a() {
            c c2 = this;
            synchronized (c2) {
                block7 : {
                    if (!this.v) break block7;
                    boolean bl = this.w;
                    return bl;
                }
                this.n();
                this.v = true;
                int n2 = this.h;
                Drawable[] arrdrawable = this.g;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (arrdrawable[i2].getConstantState() != null) continue;
                    this.w = false;
                    return false;
                }
                try {
                    this.w = true;
                    return true;
                }
                catch (Throwable throwable) {
                    throw throwable;
                }
            }
        }

        protected void b() {
            this.m = true;
            this.n();
            int n2 = this.h;
            Drawable[] arrdrawable = this.g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3;
                int n4;
                int n5;
                Drawable drawable = arrdrawable[i2];
                int n6 = drawable.getIntrinsicWidth();
                if (n6 > this.n) {
                    this.n = n6;
                }
                if ((n4 = drawable.getIntrinsicHeight()) > this.o) {
                    this.o = n4;
                }
                if ((n3 = drawable.getMinimumWidth()) > this.p) {
                    this.p = n3;
                }
                if ((n5 = drawable.getMinimumHeight()) <= this.q) continue;
                this.q = n5;
            }
        }

        public final void b(int n2) {
            this.A = n2;
        }

        public final void b(boolean bl) {
            this.i = bl;
        }

        final boolean b(int n2, int n3) {
            int n4 = this.h;
            Drawable[] arrdrawable = this.g;
            boolean bl = false;
            for (int i2 = 0; i2 < n4; ++i2) {
                if (arrdrawable[i2] == null) continue;
                boolean bl2 = Build.VERSION.SDK_INT >= 23 ? arrdrawable[i2].setLayoutDirection(n2) : false;
                if (i2 != n3) continue;
                bl = bl2;
            }
            this.z = n2;
            return bl;
        }

        final int c() {
            return this.g.length;
        }

        public final void c(int n2) {
            this.B = n2;
        }

        public boolean canApplyTheme() {
            int n2 = this.h;
            Drawable[] arrdrawable = this.g;
            for (int i2 = 0; i2 < n2; ++i2) {
                Drawable.ConstantState constantState;
                Drawable drawable = arrdrawable[i2];
                if (!(drawable != null ? drawable.canApplyTheme() : (constantState = (Drawable.ConstantState)this.f.get(i2)) != null && constantState.canApplyTheme())) continue;
                return true;
            }
            return false;
        }

        public final int d() {
            return this.h;
        }

        public final int e() {
            if (!this.m) {
                this.b();
            }
            return this.o;
        }

        public final int f() {
            if (!this.m) {
                this.b();
            }
            return this.q;
        }

        public final int g() {
            if (!this.m) {
                this.b();
            }
            return this.p;
        }

        public int getChangingConfigurations() {
            return this.d | this.e;
        }

        public final Rect h() {
            if (this.i) {
                return null;
            }
            if (this.k == null && !this.j) {
                this.n();
                Rect rect = new Rect();
                int n2 = this.h;
                Drawable[] arrdrawable = this.g;
                Rect rect2 = null;
                for (int i2 = 0; i2 < n2; ++i2) {
                    int n3;
                    int n4;
                    int n5;
                    int n6;
                    if (!arrdrawable[i2].getPadding(rect)) continue;
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    if ((n6 = rect.left) > rect2.left) {
                        rect2.left = n6;
                    }
                    if ((n5 = rect.top) > rect2.top) {
                        rect2.top = n5;
                    }
                    if ((n3 = rect.right) > rect2.right) {
                        rect2.right = n3;
                    }
                    if ((n4 = rect.bottom) <= rect2.bottom) continue;
                    rect2.bottom = n4;
                }
                this.j = true;
                this.k = rect2;
                return rect2;
            }
            return this.k;
        }

        public final int i() {
            if (!this.m) {
                this.b();
            }
            return this.n;
        }

        public final int j() {
            if (this.r) {
                return this.s;
            }
            this.n();
            int n2 = this.h;
            Drawable[] arrdrawable = this.g;
            int n3 = n2 > 0 ? arrdrawable[0].getOpacity() : -2;
            int n4 = n3;
            for (int i2 = 1; i2 < n2; ++i2) {
                n4 = Drawable.resolveOpacity((int)n4, (int)arrdrawable[i2].getOpacity());
            }
            this.s = n4;
            this.r = true;
            return n4;
        }

        void k() {
            this.r = false;
            this.t = false;
        }

        public final boolean l() {
            return this.l;
        }

        abstract void m();
    }

}

