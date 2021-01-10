/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.CancellationSignal
 *  android.os.ParcelFileDescriptor
 *  android.util.Log
 *  e.e.d.d.c
 *  e.e.d.d.c$c
 *  e.e.e.h
 *  e.e.e.i
 *  e.e.h.b
 *  e.e.h.b$f
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Array
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package e.e.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import e.e.d.d.c;
import e.e.e.h;
import e.e.e.i;
import e.e.h.b;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class d
extends h {
    private static Class b;
    private static Constructor c;
    private static Method d;
    private static Method e;
    private static boolean f;

    d() {
    }

    private static Typeface a(Object object) {
        void var1_5;
        d.a();
        try {
            Object object2 = Array.newInstance((Class)b, (int)1);
            Array.set((Object)object2, (int)0, (Object)object);
            Typeface typeface = (Typeface)e.invoke(null, new Object[]{object2});
            return typeface;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var1_5);
    }

    /*
     * Exception decompiling
     */
    private File a(ParcelFileDescriptor var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl30.1 : ACONST_NULL : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
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

    private static void a() {
        Method method;
        Constructor constructor;
        Method method2;
        Class class_;
        block4 : {
            void var1_11;
            if (f) {
                return;
            }
            f = true;
            constructor = null;
            try {
                Method method3;
                class_ = Class.forName((String)"android.graphics.FontFamily");
                Constructor constructor2 = class_.getConstructor(new Class[0]);
                Class[] arrclass = new Class[]{String.class, Integer.TYPE, Boolean.TYPE};
                method = class_.getMethod("addFontWeightStyle", arrclass);
                Object object = Array.newInstance((Class)class_, (int)1);
                Class[] arrclass2 = new Class[]{object.getClass()};
                method2 = method3 = Typeface.class.getMethod("createFromFamiliesWithDefault", arrclass2);
                constructor = constructor2;
                break block4;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            Log.e((String)"TypefaceCompatApi21Impl", (String)var1_11.getClass().getName(), (Throwable)var1_11);
            method2 = null;
            class_ = null;
            method = null;
        }
        c = constructor;
        b = class_;
        d = method;
        e = method2;
    }

    private static boolean a(Object object, String string2, int n2, boolean bl) {
        void var4_9;
        d.a();
        try {
            Method method = d;
            Object[] arrobject = new Object[]{string2, n2, bl};
            boolean bl2 = (Boolean)method.invoke(object, arrobject);
            return bl2;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var4_9);
    }

    private static Object b() {
        void var0_4;
        d.a();
        try {
            Object object = c.newInstance(new Object[0]);
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (InstantiationException instantiationException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var0_4);
    }

    /*
     * Exception decompiling
     */
    public Typeface a(Context var1_1, CancellationSignal var2_4, b.f[] var3_3, int var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 6 blocks at once
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
        Object object = d.b();
        for (c.c c2 : b2.a()) {
            File file;
            block7 : {
                file = i.a((Context)context);
                if (file == null) {
                    return null;
                }
                boolean bl = i.a((File)file, (Resources)resources, (int)c2.b());
                if (bl) break block7;
                file.delete();
                return null;
            }
            try {
                boolean bl = d.a(object, file.getPath(), c2.e(), c2.f());
                if (bl) continue;
                return null;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                return null;
            }
            finally {
                file.delete();
            }
        }
        return d.a(object);
    }
}

