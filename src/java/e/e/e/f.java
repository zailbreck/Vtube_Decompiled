/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.graphics.fonts.FontVariationAxis
 *  android.os.CancellationSignal
 *  android.util.Log
 *  e.e.d.d.c
 *  e.e.d.d.c$b
 *  e.e.d.d.c$c
 *  e.e.e.d
 *  e.e.e.h
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
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Array
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.nio.ByteBuffer
 */
package e.e.e;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.util.Log;
import e.e.d.d.c;
import e.e.e.d;
import e.e.e.h;
import e.e.h.b;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class f
extends d {
    protected final Class g;
    protected final Constructor h;
    protected final Method i;
    protected final Method j;
    protected final Method k;
    protected final Method l;
    protected final Method m;

    public f() {
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Class class_;
        Method method4;
        Method method5;
        block3 : {
            void var2_12;
            class_ = null;
            try {
                Method method6;
                Class class_2 = this.a();
                constructor = this.e(class_2);
                method3 = this.b(class_2);
                method2 = this.c(class_2);
                method = this.f(class_2);
                method4 = this.a(class_2);
                method5 = method6 = this.d(class_2);
                class_ = class_2;
                break block3;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to collect necessary methods for class ");
            stringBuilder.append(var2_12.getClass().getName());
            Log.e((String)"TypefaceCompatApi26Impl", (String)stringBuilder.toString(), (Throwable)var2_12);
            method5 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
            method4 = null;
        }
        this.g = class_;
        this.h = constructor;
        this.i = method3;
        this.j = method2;
        this.k = method;
        this.l = method4;
        this.m = method5;
    }

    private boolean a(Context context, Object object, String string, int n2, int n3, int n4, FontVariationAxis[] arrfontVariationAxis) {
        try {
            Method method = this.i;
            Object[] arrobject = new Object[]{context.getAssets(), string, 0, false, n2, n3, n4, arrfontVariationAxis};
            boolean bl = (Boolean)method.invoke(object, arrobject);
            return bl;
        }
        catch (IllegalAccessException | InvocationTargetException throwable) {
            return false;
        }
    }

    private boolean a(Object object, ByteBuffer byteBuffer, int n2, int n3, int n4) {
        try {
            Method method = this.j;
            Object[] arrobject = new Object[]{byteBuffer, n2, null, n3, n4};
            boolean bl = (Boolean)method.invoke(object, arrobject);
            return bl;
        }
        catch (IllegalAccessException | InvocationTargetException throwable) {
            return false;
        }
    }

    private void b(Object object) {
        try {
            this.l.invoke(object, new Object[0]);
        }
        catch (IllegalAccessException | InvocationTargetException throwable) {}
    }

    private boolean b() {
        if (this.i == null) {
            Log.w((String)"TypefaceCompatApi26Impl", (String)"Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    private Object c() {
        try {
            Object object = this.h.newInstance(new Object[0]);
            return object;
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException throwable) {
            return null;
        }
    }

    private boolean c(Object object) {
        try {
            boolean bl = (Boolean)this.k.invoke(object, new Object[0]);
            return bl;
        }
        catch (IllegalAccessException | InvocationTargetException throwable) {
            return false;
        }
    }

    public Typeface a(Context context, Resources resources, int n2, String string, int n3) {
        if (!this.b()) {
            return h.super.a(context, resources, n2, string, n3);
        }
        Object object = this.c();
        if (object == null) {
            return null;
        }
        if (!this.a(context, object, string, 0, -1, -1, null)) {
            this.b(object);
            return null;
        }
        if (!this.c(object)) {
            return null;
        }
        return this.a(object);
    }

    /*
     * Exception decompiling
     */
    public Typeface a(Context var1_1, CancellationSignal var2_4, b.f[] var3_3, int var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
        // org.benf.cfr.reader.b.a.a.j.b(Op04StructuredStatement.java:409)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:487)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    public Typeface a(Context context, c.b b2, Resources resources, int n2) {
        if (!f.super.b()) {
            return super.a(context, b2, resources, n2);
        }
        Object object = f.super.c();
        if (object == null) {
            return null;
        }
        for (c.c c2 : b2.a()) {
            if (f.super.a(context, object, c2.a(), c2.c(), c2.e(), (int)c2.f(), FontVariationAxis.fromFontVariationSettings((String)c2.d()))) continue;
            f.super.b(object);
            return null;
        }
        if (!f.super.c(object)) {
            return null;
        }
        return this.a(object);
    }

    protected Typeface a(Object object) {
        try {
            Object object2 = Array.newInstance((Class)this.g, (int)1);
            Array.set((Object)object2, (int)0, (Object)object);
            Method method = this.m;
            Object[] arrobject = new Object[]{object2, -1, -1};
            Typeface typeface = (Typeface)method.invoke(null, arrobject);
            return typeface;
        }
        catch (IllegalAccessException | InvocationTargetException throwable) {
            return null;
        }
    }

    protected Class a() {
        return Class.forName((String)"android.graphics.FontFamily");
    }

    protected Method a(Class class_) {
        return class_.getMethod("abortCreation", new Class[0]);
    }

    protected Method b(Class class_) {
        Class class_2 = Integer.TYPE;
        Class[] arrclass = new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, class_2, class_2, class_2, FontVariationAxis[].class};
        return class_.getMethod("addFontFromAssetManager", arrclass);
    }

    protected Method c(Class class_) {
        Class class_2 = Integer.TYPE;
        Class[] arrclass = new Class[]{ByteBuffer.class, class_2, FontVariationAxis[].class, class_2, class_2};
        return class_.getMethod("addFontFromBuffer", arrclass);
    }

    protected Method d(Class class_) {
        Class class_2;
        Object object = Array.newInstance((Class)class_, (int)1);
        Class[] arrclass = new Class[]{object.getClass(), class_2 = Integer.TYPE, class_2};
        Method method = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", arrclass);
        method.setAccessible(true);
        return method;
    }

    protected Constructor e(Class class_) {
        return class_.getConstructor(new Class[0]);
    }

    protected Method f(Class class_) {
        return class_.getMethod("freeze", new Class[0]);
    }
}

