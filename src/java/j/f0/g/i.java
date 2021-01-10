/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.Proxy
 *  java.net.Proxy$Type
 */
package j.f0.g;

import j.s;
import j.y;
import java.net.Proxy;

public final class i {
    public static String a(s s2) {
        String string2 = s2.c();
        String string3 = s2.e();
        if (string3 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append('?');
            stringBuilder.append(string3);
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    public static String a(y y2, Proxy.Type type) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(y2.e());
        stringBuilder.append(' ');
        boolean bl = i.b(y2, type);
        s s2 = y2.g();
        if (bl) {
            stringBuilder.append((Object)s2);
        } else {
            stringBuilder.append(i.a(s2));
        }
        stringBuilder.append(" HTTP/1.1");
        return stringBuilder.toString();
    }

    private static boolean b(y y2, Proxy.Type type) {
        return !y2.d() && type == Proxy.Type.HTTP;
    }
}

