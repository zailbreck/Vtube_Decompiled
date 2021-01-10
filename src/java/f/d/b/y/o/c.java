/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.y.o.b
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.AccessibleObject
 *  java.lang.reflect.Field
 */
package f.d.b.y.o;

import f.d.b.m;
import f.d.b.y.o.b;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

final class c
extends b {
    private static Class d;
    private final Object b = c.c();
    private final Field c = c.b();

    c() {
    }

    private static Field b() {
        try {
            Field field = AccessibleObject.class.getDeclaredField("override");
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            return null;
        }
    }

    private static Object c() {
        try {
            d = Class.forName((String)"sun.misc.Unsafe");
            Field field = d.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Object object = field.get(null);
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void a(AccessibleObject accessibleObject) {
        if (!this.b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
                return;
            }
            catch (SecurityException securityException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Gson couldn't modify fields for ");
                stringBuilder.append((Object)accessibleObject);
                stringBuilder.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
                throw new m(stringBuilder.toString(), securityException);
            }
        }
    }

    /*
     * Exception decompiling
     */
    boolean b(AccessibleObject var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl84.1 : ICONST_0 : trying to set 0 previously set to 1
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
}

