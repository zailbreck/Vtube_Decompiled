/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.CancellationSignal
 *  android.os.Handler
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e.e.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import e.e.d.d.c;
import e.e.d.d.f;
import e.e.e.d;
import e.e.e.e;
import e.e.e.f;
import e.e.e.g;
import e.e.e.h;
import e.e.h.a;
import e.e.h.b;

public class c {
    private static final h a;
    private static final e.d.e<String, Typeface> b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        void var1_2;
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 28) {
            g g2 = new g();
        } else if (n2 >= 26) {
            f f2 = new f();
        } else if (n2 >= 24 && e.a()) {
            e e2 = new e();
        } else if (Build.VERSION.SDK_INT >= 21) {
            d d2 = new d();
        } else {
            h h2 = new h();
        }
        a = var1_2;
        b = new e.d.e(16);
    }

    public static Typeface a(Context context, Resources resources, int n2, String string, int n3) {
        Typeface typeface = a.a(context, resources, n2, string, n3);
        if (typeface != null) {
            String string2 = c.a(resources, n2, n3);
            b.put(string2, typeface);
        }
        return typeface;
    }

    public static Typeface a(Context context, Typeface typeface, int n2) {
        if (context != null) {
            Typeface typeface2;
            if (Build.VERSION.SDK_INT < 21 && (typeface2 = c.b(context, typeface, n2)) != null) {
                return typeface2;
            }
            return Typeface.create((Typeface)typeface, (int)n2);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] arrf, int n2) {
        return a.a(context, cancellationSignal, arrf, n2);
    }

    public static Typeface a(Context context, c.a a2, Resources resources, int n2, int n3, f.a a3, Handler handler, boolean bl) {
        Typeface typeface;
        block11 : {
            block7 : {
                c.d d2;
                boolean bl2;
                block9 : {
                    block10 : {
                        block8 : {
                            if (!(a2 instanceof c.d)) break block7;
                            d2 = a2;
                            if (!bl) break block8;
                            int n4 = d2.a();
                            bl2 = false;
                            if (n4 != 0) break block9;
                            break block10;
                        }
                        bl2 = false;
                        if (a3 != null) break block9;
                    }
                    bl2 = true;
                }
                int n5 = bl ? d2.c() : -1;
                typeface = b.a(context, d2.b(), a3, handler, bl2, n5, n3);
                break block11;
            }
            typeface = a.a(context, a2, resources, n3);
            if (a3 != null) {
                if (typeface != null) {
                    a3.a(typeface, handler);
                } else {
                    a3.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            b.put(c.a(resources, n2, n3), typeface);
        }
        return typeface;
    }

    private static String a(Resources resources, int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(resources.getResourcePackageName(n2));
        stringBuilder.append("-");
        stringBuilder.append(n2);
        stringBuilder.append("-");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    private static Typeface b(Context context, Typeface typeface, int n2) {
        c.b b2 = a.a(typeface);
        if (b2 == null) {
            return null;
        }
        return a.a(context, b2, context.getResources(), n2);
    }

    public static Typeface b(Resources resources, int n2, int n3) {
        return b.get(c.a(resources, n2, n3));
    }
}

