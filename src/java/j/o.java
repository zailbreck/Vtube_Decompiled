/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.net.InetAddress
 *  java.util.List
 */
package j;

import j.o;
import java.net.InetAddress;
import java.util.List;

public interface o {
    public static final o a = new o(){

        public List<InetAddress> a(String string2) {
            if (string2 != null) {
                try {
                    List list = java.util.Arrays.asList((Object[])InetAddress.getAllByName((String)string2));
                    return list;
                }
                catch (java.lang.NullPointerException nullPointerException) {
                    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                    stringBuilder.append("Broken system behaviour for dns lookup of ");
                    stringBuilder.append(string2);
                    java.net.UnknownHostException unknownHostException = new java.net.UnknownHostException(stringBuilder.toString());
                    unknownHostException.initCause((java.lang.Throwable)nullPointerException);
                    throw unknownHostException;
                }
            }
            throw new java.net.UnknownHostException("hostname == null");
        }
    };

    public List<InetAddress> a(String var1);
}

