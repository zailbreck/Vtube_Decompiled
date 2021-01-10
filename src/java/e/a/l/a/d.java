/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.StateSet
 *  e.a.l.a.b
 *  e.a.l.a.b$c
 *  java.lang.Object
 *  java.lang.System
 */
package e.a.l.a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import e.a.l.a.b;

@SuppressLint(value={"RestrictedAPI"})
class d
extends b {
    private a n;
    private boolean o;

    d(a a2) {
        if (a2 != null) {
            this.a(a2);
        }
    }

    d(a a2, Resources resources) {
        this.a(new a(a2, (d)this, resources));
        this.onStateChange(this.getState());
    }

    a a() {
        return new a(this.n, this, null);
    }

    void a(b.c c2) {
        super.a(c2);
        if (c2 instanceof a) {
            this.n = (a)c2;
        }
    }

    int[] a(AttributeSet attributeSet) {
        int n2 = attributeSet.getAttributeCount();
        int[] arrn = new int[n2];
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = attributeSet.getAttributeNameResource(i2);
            if (n4 == 0 || n4 == 16842960 || n4 == 16843161) continue;
            int n5 = n3 + 1;
            if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                n4 = -n4;
            }
            arrn[n3] = n4;
            n3 = n5;
        }
        return StateSet.trimStateSet((int[])arrn, (int)n3);
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        this.onStateChange(this.getState());
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.o) {
            super.mutate();
            if (this == this) {
                this.n.m();
                this.o = true;
            }
        }
        return this;
    }

    protected boolean onStateChange(int[] arrn) {
        boolean bl = super.onStateChange(arrn);
        int n2 = this.n.a(arrn);
        if (n2 < 0) {
            n2 = this.n.a(StateSet.WILD_CARD);
        }
        return this.a(n2) || bl;
        {
        }
    }

    static class a
    extends b.c {
        int[][] J;

        a(a a2, d d2, Resources resources) {
            super((b.c)a2, (b)d2, resources);
            if (a2 != null) {
                this.J = a2.J;
                return;
            }
            this.J = new int[this.c()][];
        }

        int a(int[] arrn) {
            int[][] arrn2 = this.J;
            int n2 = this.d();
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!StateSet.stateSetMatches((int[])arrn2[i2], (int[])arrn)) continue;
                return i2;
            }
            return -1;
        }

        int a(int[] arrn, Drawable drawable2) {
            int n2 = this.a(drawable2);
            this.J[n2] = arrn;
            return n2;
        }

        public void a(int n2, int n3) {
            super.a(n2, n3);
            int[][] arrarrn = new int[n3][];
            System.arraycopy((Object)this.J, (int)0, (Object)arrarrn, (int)0, (int)n2);
            this.J = arrarrn;
        }

        void m() {
            int[][] arrn = this.J;
            int[][] arrarrn = new int[arrn.length][];
            for (int i2 = -1 + arrn.length; i2 >= 0; --i2) {
                int[][] arrn2 = this.J;
                int[] arrn3 = arrn2[i2] != null ? (int[])arrn2[i2].clone() : null;
                arrarrn[i2] = arrn3;
            }
            this.J = arrarrn;
        }

        public Drawable newDrawable() {
            return new d(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new d((a)this, resources);
        }
    }

}

