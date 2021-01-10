/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.a.g;

import android.text.TextUtils;
import f.e.a.a.a.a;
import f.e.a.a.a.d.f;
import f.e.a.a.a.d.i;
import f.e.a.a.a.d.j.d;

public class e {
    public static void a() {
        if (a.b()) {
            return;
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public static void a(f f2) {
        if (!f2.equals((Object)f.e)) {
            return;
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public static void a(i i2) {
        if (!i2.h()) {
            return;
        }
        throw new IllegalStateException("AdSession is started");
    }

    public static void a(Object object, String string) {
        if (object != null) {
            return;
        }
        throw new IllegalArgumentException(string);
    }

    public static void a(String string, int n2, String string2) {
        if (string.length() <= n2) {
            return;
        }
        throw new IllegalArgumentException(string2);
    }

    public static void a(String string, String string2) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return;
        }
        throw new IllegalArgumentException(string2);
    }

    public static void b(i i2) {
        if (!i2.i()) {
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public static void c(i i2) {
        e.h(i2);
        e.b(i2);
    }

    public static void d(i i2) {
        if (i2.l().c() == null) {
            return;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    public static void e(i i2) {
        if (i2.l().d() == null) {
            return;
        }
        throw new IllegalStateException("VideoEvents already exists for AdSession");
    }

    public static void f(i i2) {
        if (i2.j()) {
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    public static void g(i i2) {
        if (i2.m()) {
            return;
        }
        throw new IllegalStateException("Cannot create VideoEvents for JavaScript AdSession");
    }

    private static void h(i i2) {
        if (i2.h()) {
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }
}

