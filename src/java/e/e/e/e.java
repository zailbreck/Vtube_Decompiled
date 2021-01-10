/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.os.CancellationSignal
 *  android.util.Log
 *  e.d.g
 *  e.e.d.d.c
 *  e.e.d.d.c$c
 *  e.e.e.h
 *  e.e.e.i
 *  e.e.h.b
 *  e.e.h.b$f
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Array
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.nio.ByteBuffer
 *  java.util.List
 */
package e.e.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import e.d.g;
import e.e.d.d.c;
import e.e.e.h;
import e.e.e.i;
import e.e.h.b;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

class e
extends h {
    private static final Class b;
    private static final Constructor c;
    private static final Method d;
    private static final Method e;

    static {
        Method method;
        Constructor constructor;
        Class class_;
        Method method2;
        block3 : {
            void var1_11;
            constructor = null;
            try {
                Method method3;
                class_ = Class.forName((String)"android.graphics.FontFamily");
                Constructor constructor2 = class_.getConstructor(new Class[0]);
                Class[] arrclass = new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE};
                method = class_.getMethod("addFontWeightStyle", arrclass);
                Object object = Array.newInstance((Class)class_, (int)1);
                Class[] arrclass2 = new Class[]{object.getClass()};
                method2 = method3 = Typeface.class.getMethod("createFromFamiliesWithDefault", arrclass2);
                constructor = constructor2;
                break block3;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            Log.e((String)"TypefaceCompatApi24Impl", (String)var1_11.getClass().getName(), (Throwable)var1_11);
            class_ = null;
            method2 = null;
            method = null;
        }
        c = constructor;
        b = class_;
        d = method;
        e = method2;
    }

    e() {
    }

    private static Typeface a(Object object) {
        try {
            Object object2 = Array.newInstance((Class)b, (int)1);
            Array.set((Object)object2, (int)0, (Object)object);
            Typeface typeface = (Typeface)e.invoke(null, new Object[]{object2});
            return typeface;
        }
        catch (IllegalAccessException | InvocationTargetException throwable) {
            return null;
        }
    }

    public static boolean a() {
        if (d == null) {
            Log.w((String)"TypefaceCompatApi24Impl", (String)"Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return d != null;
    }

    private static boolean a(Object object, ByteBuffer byteBuffer, int n2, int n3, boolean bl) {
        try {
            Method method = d;
            Object[] arrobject = new Object[]{byteBuffer, n2, null, n3, bl};
            boolean bl2 = (Boolean)method.invoke(object, arrobject);
            return bl2;
        }
        catch (IllegalAccessException | InvocationTargetException throwable) {
            return false;
        }
    }

    private static Object b() {
        try {
            Object object = c.newInstance(new Object[0]);
            return object;
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException throwable) {
            return null;
        }
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] arrf, int n2) {
        Object object = e.b();
        if (object == null) {
            return null;
        }
        g g2 = new g();
        for (b.f f2 : arrf) {
            Uri uri = f2.c();
            ByteBuffer byteBuffer = (ByteBuffer)g2.get((Object)uri);
            if (byteBuffer == null) {
                byteBuffer = i.a((Context)context, (CancellationSignal)cancellationSignal, (Uri)uri);
                g2.put((Object)uri, (Object)byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (e.a(object, byteBuffer, f2.b(), f2.d(), f2.e())) continue;
            return null;
        }
        Typeface typeface = e.a(object);
        if (typeface == null) {
            return null;
        }
        return Typeface.create((Typeface)typeface, (int)n2);
    }

    public Typeface a(Context context, c.b b2, Resources resources, int n2) {
        Object object = e.b();
        if (object == null) {
            return null;
        }
        for (c.c c2 : b2.a()) {
            ByteBuffer byteBuffer = i.a((Context)context, (Resources)resources, (int)c2.b());
            if (byteBuffer == null) {
                return null;
            }
            if (e.a(object, byteBuffer, c2.c(), c2.e(), c2.f())) continue;
            return null;
        }
        return e.a(object);
    }
}

