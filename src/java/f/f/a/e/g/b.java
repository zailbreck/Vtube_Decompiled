/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  f.f.a.e.c.a
 *  f.f.a.e.g.b$a
 *  f.f.a.e.g.d
 *  f.f.a.e.g.d$a
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 */
package f.f.a.e.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import f.f.a.e.g.b;
import f.f.a.e.g.d;

public class b
extends View
implements d {
    private Rect b = new Rect();
    private float c;
    private float d = 0.95f;
    private long e;
    private float f;
    private boolean g;
    private float h;
    private float i;
    private float j;
    private long k;
    private int l;
    private int m;
    private int n;
    private int o;
    private long p = 25L;
    private Drawable q;
    private Drawable r;
    private Drawable s;
    private Drawable t;
    private boolean u = false;
    private d.a v;
    private Handler w = new Handler(Looper.getMainLooper());
    Runnable x;
    private boolean y;
    private boolean z;

    public b(Context context) {
        super(context);
        this.x = new a((b)this);
        this.z = false;
        this.setWillNotDraw(false);
    }

    public void a() {
        if (!this.g) {
            this.g = true;
            this.h = 0.0f;
        }
    }

    public void a(boolean bl) {
        Drawable drawable;
        if (!(bl || this.t == null && this.q == null && this.r == null && this.s == null)) {
            return;
        }
        this.t = this.getResources().getDrawable(this.getResources().getIdentifier("mintegral_cm_highlight", "drawable", f.f.a.e.c.a.i().a()));
        Drawable drawable2 = this.t;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.t.getIntrinsicHeight());
        }
        if ((drawable = (this.q = this.getResources().getDrawable(this.getResources().getIdentifier("mintegral_cm_head", "drawable", f.f.a.e.c.a.i().a())))) != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.q.getIntrinsicHeight());
        }
        this.r = this.getResources().getDrawable(this.getResources().getIdentifier("mintegral_cm_tail", "drawable", f.f.a.e.c.a.i().a()));
        this.s = this.getResources().getDrawable(this.getResources().getIdentifier("mintegral_cm_end_animation", "drawable", f.f.a.e.c.a.i().a()));
    }

    public void draw(Canvas canvas) {
        float f2;
        Drawable drawable;
        Drawable drawable2;
        float f3;
        float f4;
        block24 : {
            block25 : {
                block21 : {
                    block22 : {
                        block23 : {
                            if (!this.u) {
                                this.u = true;
                            }
                            long l2 = System.currentTimeMillis();
                            long l3 = this.z ? 0L : l2 - this.e;
                            this.f = Math.abs((float)((float)l3 / 1000.0f));
                            this.e = l2;
                            this.k = l3 + this.k;
                            boolean bl = this.g;
                            f4 = 0.4f;
                            if (bl) break block21;
                            if (this.k >= 2000L) break block22;
                            if (this.n != 1) break block23;
                            if (!this.y) break block24;
                            break block25;
                        }
                        if (this.m == 1) {
                            if (!this.y) {
                                f4 = 0.2f;
                            }
                        } else {
                            float f5 = this.y ? 0.2f : 0.05f;
                            f4 = f5;
                        }
                        break block24;
                    }
                    f4 = 0.05f;
                    break block24;
                }
                if (!this.y) break block24;
            }
            f4 = 1.0f;
        }
        this.j = f4;
        this.i += this.j * this.f;
        if (!this.g && (f3 = this.i) > (f2 = this.d)) {
            this.i = f2;
        }
        this.b.right = (int)(this.i * this.c);
        this.w.removeCallbacksAndMessages(null);
        this.w.postDelayed(this.x, this.p);
        super.draw(canvas);
        float f6 = this.f;
        if (this.g) {
            Drawable drawable3;
            Drawable drawable4;
            Drawable drawable5;
            int n2 = (int)(255.0f * (1.0f - this.h / (0.5f * this.c)));
            if (n2 < 0) {
                n2 = 0;
            }
            if (this.h > 0.5f * this.c) {
                this.setVisible(false);
            }
            if ((drawable3 = this.r) != null) {
                drawable3.setAlpha(n2);
            }
            if ((drawable5 = this.s) != null) {
                drawable5.setAlpha(n2);
            }
            if ((drawable4 = this.q) != null) {
                drawable4.setAlpha(n2);
            }
            canvas.save();
            canvas.translate(this.h, 0.0f);
        }
        if (this.r != null && this.q != null) {
            int n3 = (int)((float)this.b.width() - 0.05f * (float)this.q.getIntrinsicWidth());
            Drawable drawable6 = this.r;
            drawable6.setBounds(0, 0, n3, drawable6.getIntrinsicHeight());
            this.r.draw(canvas);
        }
        if (this.g && (drawable = this.s) != null && this.q != null) {
            int n4 = drawable.getIntrinsicWidth();
            Drawable drawable7 = this.s;
            drawable7.setBounds(0, 0, n4, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate((float)(-n4), 0.0f);
            this.s.draw(canvas);
            canvas.restore();
        }
        if (this.q != null) {
            canvas.save();
            canvas.translate((float)(this.b.width() - this.getWidth()), 0.0f);
            this.q.draw(canvas);
            canvas.restore();
        }
        if (!this.g && Math.abs((float)(this.i - this.d)) < 1.0E-5f && (drawable2 = this.t) != null) {
            this.l = (int)((float)this.l + f6 * 0.2f * this.c);
            if (this.l + drawable2.getIntrinsicWidth() >= this.b.width()) {
                this.l = -this.t.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate((float)this.l, 0.0f);
            this.t.draw(canvas);
            canvas.restore();
        }
        if (this.g) {
            canvas.restore();
        }
    }

    public Bitmap getDrawingCache(boolean bl) {
        return null;
    }

    public float getProgress() {
        return this.i;
    }

    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        super.onLayout(bl, n2, n3, n4, n5);
    }

    protected void onMeasure(int n2, int n3) {
        super.onMeasure(n2, n3);
    }

    protected void onSizeChanged(int n2, int n3, int n4, int n5) {
        super.onSizeChanged(n2, n3, n4, n5);
        this.c = this.getMeasuredWidth();
    }

    public void onWindowFocusChanged(boolean bl) {
        Drawable drawable;
        super.onWindowFocusChanged(bl);
        Drawable drawable2 = this.t;
        if (drawable2 != null) {
            double d2 = drawable2.getIntrinsicWidth();
            Double.isNaN((double)d2);
            drawable2.setBounds(0, 0, (int)(d2 * 1.5), this.getHeight());
        }
        if ((drawable = this.q) != null) {
            drawable.setBounds(0, 0, this.getWidth(), this.getHeight());
        }
    }

    public void setPaused(boolean bl) {
        this.z = bl;
        if (!bl) {
            this.e = System.currentTimeMillis();
        }
    }

    public void setProgressBarListener(d.a a2) {
        this.v = a2;
    }

    public void setProgressState(int n2) {
        block8 : {
            block9 : {
                block5 : {
                    block6 : {
                        block7 : {
                            if (n2 == 5) break block5;
                            if (n2 == 6) break block6;
                            if (n2 == 7) break block7;
                            if (n2 != 8) {
                                return;
                            }
                            this.o = 1;
                            if (this.n != 1) break block8;
                        }
                        this.a();
                        return;
                    }
                    this.n = 1;
                    if (this.o == 1) {
                        this.a();
                    }
                    break block9;
                }
                this.m = 1;
                this.n = 0;
                this.o = 0;
            }
            this.k = 0L;
        }
    }

    public void setVisibility(int n2) {
        block3 : {
            d.a a2;
            boolean bl;
            block4 : {
                block2 : {
                    super.setVisibility(n2);
                    if (n2 != 0) break block2;
                    a2 = this.v;
                    if (a2 == null) break block3;
                    bl = true;
                    break block4;
                }
                a2 = this.v;
                if (a2 == null) break block3;
                bl = false;
            }
            a2.a(bl);
        }
    }

    public void setVisible(boolean bl) {
        if (bl) {
            Drawable drawable;
            Drawable drawable2;
            this.y = true;
            this.e = System.currentTimeMillis();
            this.f = 0.0f;
            this.k = 0L;
            this.g = false;
            this.h = 0.0f;
            this.i = 0.0f;
            this.c = this.getMeasuredWidth();
            this.z = false;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            Drawable drawable3 = this.t;
            this.l = drawable3 != null ? -drawable3.getIntrinsicWidth() : 0;
            Drawable drawable4 = this.r;
            if (drawable4 != null) {
                drawable4.setAlpha(255);
            }
            if ((drawable2 = this.s) != null) {
                drawable2.setAlpha(255);
            }
            if ((drawable = this.q) != null) {
                drawable.setAlpha(255);
            }
            this.setVisibility(0);
            this.invalidate();
            return;
        }
        this.setVisibility(4);
    }
}

