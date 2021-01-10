/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.CancellationSignal
 *  android.util.Log
 *  java.io.File
 *  java.io.InputStream
 *  java.lang.IllegalAccessException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NoSuchFieldException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.util.concurrent.ConcurrentHashMap
 */
package e.e.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import e.e.d.d.c;
import e.e.e.h;
import e.e.e.i;
import e.e.h.b;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

class h {
    private ConcurrentHashMap<Long, c.b> a = new ConcurrentHashMap();

    h() {
    }

    private c.c a(c.b b2, int n2) {
        return h.a(b2.a(), n2, new c<c.c>((h)this){

            public int a(c.c c2) {
                return c2.e();
            }

            public boolean b(c.c c2) {
                return c2.f();
            }
        });
    }

    private static <T> T a(T[] arrT, int n2, c<T> c2) {
        int n3 = (n2 & 1) == 0 ? 400 : 700;
        boolean bl = (n2 & 2) != 0;
        int n4 = arrT.length;
        T t2 = null;
        int n5 = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < n4; ++i2) {
            T t3 = arrT[i2];
            int n6 = 2 * Math.abs((int)(c2.a(t3) - n3));
            int n7 = c2.b(t3) == bl ? 0 : 1;
            int n8 = n6 + n7;
            if (t2 != null && n5 <= n8) continue;
            t2 = t3;
            n5 = n8;
        }
        return t2;
    }

    private void a(Typeface typeface, c.b b2) {
        long l2 = h.b(typeface);
        if (l2 != 0L) {
            this.a.put((Object)l2, (Object)b2);
        }
    }

    private static long b(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field field = Typeface.class.getDeclaredField("native_instance");
            field.setAccessible(true);
            long l2 = ((Number)field.get((Object)typeface)).longValue();
            return l2;
        }
        catch (IllegalAccessException illegalAccessException) {
            Log.e((String)"TypefaceCompatBaseImpl", (String)"Could not retrieve font from family.", (Throwable)illegalAccessException);
            return 0L;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            Log.e((String)"TypefaceCompatBaseImpl", (String)"Could not retrieve font from family.", (Throwable)noSuchFieldException);
            return 0L;
        }
    }

    public Typeface a(Context context, Resources resources, int n2, String string, int n3) {
        File file;
        block6 : {
            file = i.a(context);
            if (file == null) {
                return null;
            }
            boolean bl = i.a(file, resources, n2);
            if (bl) break block6;
            file.delete();
            return null;
        }
        try {
            Typeface typeface = Typeface.createFromFile((String)file.getPath());
            return typeface;
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

    /*
     * Exception decompiling
     */
    public Typeface a(Context var1, CancellationSignal var2, b.f[] var3, int var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl44 : ALOAD : trying to set 1 previously set to 0
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

    public Typeface a(Context context, c.b b2, Resources resources, int n2) {
        c.c c2 = h.super.a(b2, n2);
        if (c2 == null) {
            return null;
        }
        Typeface typeface = e.e.e.c.a(context, resources, c2.b(), c2.a(), n2);
        h.super.a(typeface, b2);
        return typeface;
    }

    protected Typeface a(Context context, InputStream inputStream) {
        File file;
        block6 : {
            file = i.a(context);
            if (file == null) {
                return null;
            }
            boolean bl = i.a(file, inputStream);
            if (bl) break block6;
            file.delete();
            return null;
        }
        try {
            Typeface typeface = Typeface.createFromFile((String)file.getPath());
            return typeface;
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

    c.b a(Typeface typeface) {
        long l2 = h.b(typeface);
        if (l2 == 0L) {
            return null;
        }
        return this.a.get((Object)l2);
    }

    protected b.f a(b.f[] arrf, int n2) {
        return h.a(arrf, n2, new c<b.f>((h)this){

            public int a(b.f f2) {
                return f2.d();
            }

            public boolean b(b.f f2) {
                return f2.e();
            }
        });
    }

    private static interface c<T> {
        public int a(T var1);

        public boolean b(T var1);
    }

}

