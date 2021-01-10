/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 *  java.lang.Object
 */
package e.e.k;

import android.view.View;
import android.view.ViewParent;
import e.e.k.u;
import e.e.k.x;

public class l {
    private ViewParent a;
    private ViewParent b;
    private final View c;
    private boolean d;
    private int[] e;

    public l(View view) {
        this.c = view;
    }

    private void a(int n2, ViewParent viewParent) {
        if (n2 != 0) {
            if (n2 != 1) {
                return;
            }
            this.b = viewParent;
            return;
        }
        this.a = viewParent;
    }

    private boolean b(int n2, int n3, int n4, int n5, int[] arrn, int n6, int[] arrn2) {
        if (this.b()) {
            ViewParent viewParent = this.d(n6);
            if (viewParent == null) {
                return false;
            }
            if (n2 == 0 && n3 == 0 && n4 == 0 && n5 == 0) {
                if (arrn != null) {
                    arrn[0] = 0;
                    arrn[1] = 0;
                    return false;
                }
            } else {
                int n7;
                int[] arrn3;
                int n8;
                if (arrn != null) {
                    this.c.getLocationInWindow(arrn);
                    int n9 = arrn[0];
                    int n10 = arrn[1];
                    n8 = n9;
                    n7 = n10;
                } else {
                    n8 = 0;
                    n7 = 0;
                }
                if (arrn2 == null) {
                    int[] arrn4 = this.d();
                    arrn4[0] = 0;
                    arrn4[1] = 0;
                    arrn3 = arrn4;
                } else {
                    arrn3 = arrn2;
                }
                x.a(viewParent, this.c, n2, n3, n4, n5, n6, arrn3);
                if (arrn != null) {
                    this.c.getLocationInWindow(arrn);
                    arrn[0] = arrn[0] - n8;
                    arrn[1] = arrn[1] - n7;
                }
                return true;
            }
        }
        return false;
    }

    private ViewParent d(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                return null;
            }
            return this.b;
        }
        return this.a;
    }

    private int[] d() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    public void a(int n2, int n3, int n4, int n5, int[] arrn, int n6, int[] arrn2) {
        this.b(n2, n3, n4, n5, arrn, n6, arrn2);
    }

    public void a(boolean bl) {
        if (this.d) {
            u.u(this.c);
        }
        this.d = bl;
    }

    public boolean a() {
        return this.a(0);
    }

    public boolean a(float f2, float f3) {
        ViewParent viewParent;
        if (this.b() && (viewParent = l.super.d(0)) != null) {
            return x.a(viewParent, this.c, f2, f3);
        }
        return false;
    }

    public boolean a(float f2, float f3, boolean bl) {
        ViewParent viewParent;
        if (this.b() && (viewParent = l.super.d(0)) != null) {
            return x.a(viewParent, this.c, f2, f3, bl);
        }
        return false;
    }

    public boolean a(int n2) {
        return l.super.d(n2) != null;
    }

    public boolean a(int n2, int n3) {
        if (this.a(n3)) {
            return true;
        }
        if (this.b()) {
            View view = this.c;
            for (ViewParent viewParent = this.c.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
                if (x.b(viewParent, view, this.c, n2, n3)) {
                    l.super.a(n3, viewParent);
                    x.a(viewParent, view, this.c, n2, n3);
                    return true;
                }
                if (!(viewParent instanceof View)) continue;
                view = (View)viewParent;
            }
        }
        return false;
    }

    public boolean a(int n2, int n3, int n4, int n5, int[] arrn) {
        return this.b(n2, n3, n4, n5, arrn, 0, null);
    }

    public boolean a(int n2, int n3, int n4, int n5, int[] arrn, int n6) {
        return this.b(n2, n3, n4, n5, arrn, n6, null);
    }

    public boolean a(int n2, int n3, int[] arrn, int[] arrn2) {
        return this.a(n2, n3, arrn, arrn2, 0);
    }

    public boolean a(int n2, int n3, int[] arrn, int[] arrn2, int n4) {
        if (this.b()) {
            ViewParent viewParent = this.d(n4);
            if (viewParent == null) {
                return false;
            }
            int n5 = 1;
            if (n2 == 0 && n3 == 0) {
                if (arrn2 != null) {
                    arrn2[0] = 0;
                    arrn2[n5] = 0;
                    return false;
                }
            } else {
                int n6;
                int n7;
                if (arrn2 != null) {
                    this.c.getLocationInWindow(arrn2);
                    int n8 = arrn2[0];
                    int n9 = arrn2[n5];
                    n7 = n8;
                    n6 = n9;
                } else {
                    n7 = 0;
                    n6 = 0;
                }
                if (arrn == null) {
                    arrn = this.d();
                }
                arrn[0] = 0;
                arrn[n5] = 0;
                x.a(viewParent, this.c, n2, n3, arrn, n4);
                if (arrn2 != null) {
                    this.c.getLocationInWindow(arrn2);
                    arrn2[0] = arrn2[0] - n7;
                    arrn2[n5] = arrn2[n5] - n6;
                }
                if (arrn[0] == 0) {
                    if (arrn[n5] != 0) {
                        return (boolean)n5;
                    }
                    n5 = 0;
                }
                return (boolean)n5;
            }
        }
        return false;
    }

    public boolean b() {
        return this.d;
    }

    public boolean b(int n2) {
        return this.a(n2, 0);
    }

    public void c() {
        this.c(0);
    }

    public void c(int n2) {
        ViewParent viewParent = l.super.d(n2);
        if (viewParent != null) {
            x.a(viewParent, this.c, n2);
            l.super.a(n2, null);
        }
    }
}

