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
package f.e.a.a.b.j;

import android.text.TextUtils;
import f.e.a.a.b.a;
import f.e.a.a.b.e.f;
import f.e.a.a.b.e.h;
import f.e.a.a.b.e.i;
import f.e.a.a.b.e.l;
import f.e.a.a.b.e.m.b;

public class e {
    public static void a() {
        if (a.b()) {
            return;
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public static void a(i i2, f f2, h h2) {
        if (i2 != i.e) {
            if (f2 == f.c && i2 == i.c) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (h2 == h.c) {
                if (i2 != i.c) {
                    return;
                }
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return;
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public static void a(l l2) {
        if (!l2.h()) {
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

    public static void b(l l2) {
        if (!l2.i()) {
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public static void c(l l2) {
        e.h(l2);
        e.b(l2);
    }

    public static void d(l l2) {
        if (l2.k().c() == null) {
            return;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    public static void e(l l2) {
        if (l2.k().d() == null) {
            return;
        }
        throw new IllegalStateException("MediaEvents already exists for AdSession");
    }

    public static void f(l l2) {
        if (l2.l()) {
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    public static void g(l l2) {
        if (l2.m()) {
            return;
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    private static void h(l l2) {
        if (l2.h()) {
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }
}

