/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package f.f.a.k.g;

import android.content.Context;
import f.f.a.k.g.a;
import f.f.a.k.g.b;
import f.f.a.k.g.k;
import java.util.HashMap;

public final class h {
    private static HashMap<String, Class> d = new HashMap();
    private Context a;
    private Object b;
    private b c;

    public h(Context context, b b2) {
        this.a = context;
        this.c = b2;
        this.a(a.class);
        try {
            this.a(Class.forName((String)"com.mintegral.msdk.offerwall.jscommon.OfferWall"));
        }
        catch (ClassNotFoundException classNotFoundException) {}
        try {
            this.a(Class.forName((String)"com.mintegral.msdk.interstitial.jscommon.interstitial"));
        }
        catch (ClassNotFoundException classNotFoundException) {}
        try {
            this.a(Class.forName((String)"f.f.a.r.b.e.f"));
        }
        catch (ClassNotFoundException classNotFoundException) {}
        try {
            this.a(Class.forName((String)"f.f.a.r.b.e.g"));
        }
        catch (ClassNotFoundException classNotFoundException) {}
        try {
            this.a(Class.forName((String)"f.f.a.k.a.a.a"));
        }
        catch (ClassNotFoundException classNotFoundException) {}
        try {
            this.a(Class.forName((String)"com.mintegral.msdk.interactiveads.jscommon.Interactive"));
        }
        catch (ClassNotFoundException classNotFoundException) {}
        try {
            this.a(Class.forName((String)"f.f.a.k.f.a"));
        }
        catch (ClassNotFoundException classNotFoundException) {}
        try {
            this.a(Class.forName((String)"f.f.a.k.d.a"));
        }
        catch (ClassNotFoundException classNotFoundException) {}
        try {
            this.a(Class.forName((String)"com.mintegral.msdk.splash.js.SplashJs"));
        }
        catch (ClassNotFoundException classNotFoundException) {}
    }

    private Object a(String string2, b b2, Context context) {
        Class class_ = (Class)d.get((Object)string2);
        if (class_ != null) {
            try {
                if (k.class.isAssignableFrom(class_)) {
                    k k2 = (k)class_.newInstance();
                    k2.a(context, b2);
                    k2.a(this.b, b2);
                    return k2;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    public final Object a(String string2) {
        if (d == null) {
            d = new HashMap();
        }
        return h.super.a(string2, this.c, this.a);
    }

    public final void a(Context context) {
        this.a = context;
    }

    public final void a(Class class_) {
        if (d == null) {
            d = new HashMap();
        }
        d.put((Object)class_.getSimpleName(), (Object)class_);
    }

    public final void a(Object object) {
        this.b = object;
    }
}

