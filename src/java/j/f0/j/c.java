/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.f0.c
 *  j.f0.j.f
 *  j.w
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.List
 *  javax.net.ssl.SSLParameters
 *  javax.net.ssl.SSLSocket
 */
package j.f0.j;

import j.f0.j.f;
import j.w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

final class c
extends f {
    final Method c;
    final Method d;

    c(Method method, Method method2) {
        this.c = method;
        this.d = method2;
    }

    public static c b() {
        try {
            Class[] arrclass = new Class[]{String[].class};
            Method method = SSLParameters.class.getMethod("setApplicationProtocols", arrclass);
            Class[] arrclass2 = new Class[]{};
            c c2 = new c(method, SSLSocket.class.getMethod("getApplicationProtocol", arrclass2));
            return c2;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    public void a(SSLSocket sSLSocket, String string, List<w> list) {
        void var4_10;
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List list2 = f.a(list);
            Method method = this.c;
            Object[] arrobject = new Object[]{list2.toArray((Object[])new String[list2.size()])};
            method.invoke((Object)sSLParameters, arrobject);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw j.f0.c.a((String)"unable to set ssl parameters", (Exception)var4_10);
    }

    public String b(SSLSocket sSLSocket) {
        void var2_6;
        block5 : {
            block4 : {
                String string = (String)this.d.invoke((Object)sSLSocket, new Object[0]);
                if (string == null) break block4;
                try {
                    boolean bl = string.equals((Object)"");
                    if (bl) break block4;
                    return string;
                }
                catch (InvocationTargetException invocationTargetException) {
                    break block5;
                }
                catch (IllegalAccessException illegalAccessException) {
                    // empty catch block
                }
            }
            return null;
        }
        throw j.f0.c.a((String)"unable to get selected protocols", (Exception)var2_6);
    }
}

