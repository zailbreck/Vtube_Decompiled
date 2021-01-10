/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Error
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.ThreadDeath
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package f.d.a.a;

import f.d.a.a.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class d {
    private static final Object a = d.b();

    static {
        if (a != null) {
            d.a();
        }
        if (a != null) {
            d.c();
        }
    }

    private static Method a() {
        Class[] arrclass = new Class[]{Throwable.class, Integer.TYPE};
        return d.a("getStackTraceElement", arrclass);
    }

    private static /* varargs */ Method a(String string, Class<?> ... arrclass) {
        try {
            Method method = Class.forName((String)"sun.misc.JavaLangAccess", (boolean)false, null).getMethod(string, arrclass);
            return method;
        }
        catch (Throwable throwable) {
            return null;
        }
        catch (ThreadDeath threadDeath) {
            throw threadDeath;
        }
    }

    public static void a(Throwable throwable) {
        b.a(throwable);
        if (!(throwable instanceof RuntimeException)) {
            if (!(throwable instanceof Error)) {
                return;
            }
            throw (Error)throwable;
        }
        throw (RuntimeException)throwable;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static Object b() {
        Object object = null;
        try {
            return Class.forName((String)"sun.misc.SharedSecrets", (boolean)false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        }
        catch (Throwable throwable) {}
        return object;
        catch (ThreadDeath threadDeath) {
            throw threadDeath;
        }
    }

    private static Method c() {
        Method method;
        block3 : {
            method = d.a("getStackTraceDepth", Throwable.class);
            if (method != null) break block3;
            return null;
        }
        try {
            Object object = d.b();
            Object[] arrobject = new Object[]{new Throwable()};
            method.invoke(object, arrobject);
            return method;
        }
        catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException throwable) {
            return null;
        }
    }
}

