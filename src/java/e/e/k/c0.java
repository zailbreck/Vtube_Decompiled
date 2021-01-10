/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.WindowInsets
 *  java.lang.Class
 *  java.lang.Object
 */
package e.e.k;

import android.os.Build;
import android.view.WindowInsets;

public class c0 {
    private final Object a;

    private c0(Object object) {
        this.a = object;
    }

    static c0 a(Object object) {
        if (object == null) {
            return null;
        }
        return new c0(object);
    }

    static Object a(c0 c02) {
        if (c02 == null) {
            return null;
        }
        return c02.a;
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets)this.a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public c0 a(int n2, int n3, int n4, int n5) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new c0((Object)((WindowInsets)this.a).replaceSystemWindowInsets(n2, n3, n4, n5));
        }
        return null;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets)this.a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets)this.a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets)this.a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (c0.class != object.getClass()) {
                return false;
            }
            c0 c02 = (c0)object;
            Object object2 = this.a;
            Object object3 = c02.a;
            if (object2 == null) {
                return object3 == null;
            }
            return object2.equals(object3);
        }
        return false;
    }

    public int hashCode() {
        Object object = this.a;
        if (object == null) {
            return 0;
        }
        return object.hashCode();
    }
}

