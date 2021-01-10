/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.f0.c
 *  j.f0.j.d$a
 *  j.f0.j.f
 *  j.w
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationHandler
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.lang.reflect.Proxy
 *  java.util.List
 *  javax.net.ssl.SSLSocket
 */
package j.f0.j;

import j.f0.c;
import j.f0.j.d;
import j.f0.j.f;
import j.w;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/*
 * Exception performing whole class analysis.
 */
class d
extends f {
    private final Method c;
    private final Method d;
    private final Method e;
    private final Class<?> f;
    private final Class<?> g;

    d(Method method, Method method2, Method method3, Class<?> class_, Class<?> class_2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = class_;
        this.g = class_2;
    }

    public static f b() {
        try {
            Class class_ = Class.forName((String)"org.eclipse.jetty.alpn.ALPN");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("org.eclipse.jetty.alpn.ALPN");
            stringBuilder.append("$Provider");
            Class class_2 = Class.forName((String)stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("org.eclipse.jetty.alpn.ALPN");
            stringBuilder2.append("$ClientProvider");
            Class class_3 = Class.forName((String)stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("org.eclipse.jetty.alpn.ALPN");
            stringBuilder3.append("$ServerProvider");
            Class class_4 = Class.forName((String)stringBuilder3.toString());
            Method method = class_.getMethod("put", new Class[]{SSLSocket.class, class_2});
            Method method2 = class_.getMethod("get", new Class[]{SSLSocket.class});
            Method method3 = class_.getMethod("remove", new Class[]{SSLSocket.class});
            d d2 = new d(method, method2, method3, class_3, class_4);
            return d2;
        }
        catch (ClassNotFoundException | NoSuchMethodException throwable) {
            return null;
        }
    }

    public void a(SSLSocket sSLSocket) {
        void var2_4;
        try {
            this.e.invoke(null, new Object[]{sSLSocket});
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw c.a((String)"unable to remove alpn", (Exception)var2_4);
    }

    public void a(SSLSocket sSLSocket, String string, List<w> list) {
        void var5_10;
        List list2 = f.a(list);
        try {
            ClassLoader classLoader = f.class.getClassLoader();
            Class[] arrclass = new Class[]{this.f, this.g};
            Object object = Proxy.newProxyInstance((ClassLoader)classLoader, (Class[])arrclass, (InvocationHandler)new /* Unavailable Anonymous Inner Class!! */);
            this.c.invoke(null, new Object[]{sSLSocket, object});
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InvocationTargetException invocationTargetException) {
            // empty catch block
        }
        throw c.a((String)"unable to set alpn", (Exception)var5_10);
    }

    public String b(SSLSocket sSLSocket) {
        void var2_6;
        a a2;
        block6 : {
            block5 : {
                a2 = Proxy.getInvocationHandler((Object)this.d.invoke(null, new Object[]{sSLSocket}));
                if (a2.b || a2.c != null) break block5;
                f.c().a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (!a2.b) break block6;
            return null;
        }
        try {
            String string = a2.c;
            return string;
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InvocationTargetException invocationTargetException) {
            // empty catch block
        }
        throw c.a((String)"unable to get selected protocol", (Exception)var2_6);
    }
}

