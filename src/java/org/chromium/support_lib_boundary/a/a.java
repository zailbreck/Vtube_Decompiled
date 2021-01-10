/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.os.Build
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.ReflectiveOperationException
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationHandler
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.lang.reflect.Proxy
 *  java.util.Collection
 */
package org.chromium.support_lib_boundary.a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

@SuppressLint(value={"BanTargetApiAnnotation"})
public class a {
    public static <T> T a(Class<T> class_, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return (T)class_.cast(Proxy.newProxyInstance((ClassLoader)a.class.getClassLoader(), (Class[])new Class[]{class_}, (InvocationHandler)invocationHandler));
    }

    @TargetApi(value=19)
    public static InvocationHandler a(Object object) {
        if (object == null) {
            return null;
        }
        return new a(object);
    }

    public static Method a(Method method, ClassLoader classLoader) {
        Class class_ = Class.forName((String)method.getDeclaringClass().getName(), (boolean)true, (ClassLoader)classLoader);
        Class[] arrclass = method.getParameterTypes();
        return class_.getDeclaredMethod(method.getName(), arrclass);
    }

    private static boolean a() {
        return "eng".equals((Object)Build.TYPE) || "userdebug".equals((Object)Build.TYPE);
        {
        }
    }

    public static boolean a(Collection<String> collection, String string2) {
        block2 : {
            block3 : {
                if (collection.contains((Object)string2)) break block2;
                if (!a.a()) break block3;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(":dev");
                if (collection.contains((Object)stringBuilder.toString())) break block2;
            }
            return false;
        }
        return true;
    }

    @TargetApi(value=19)
    private static class a
    implements InvocationHandler {
        private final Object a;

        public a(Object object) {
            this.a = object;
        }

        public Object invoke(Object object, Method method, Object[] arrobject) {
            ClassLoader classLoader = this.a.getClass().getClassLoader();
            try {
                Object object2 = a.a(method, classLoader).invoke(this.a, arrobject);
                return object2;
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Reflection failed for method ");
                stringBuilder.append((Object)method);
                throw new RuntimeException(stringBuilder.toString(), (Throwable)reflectiveOperationException);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

}

