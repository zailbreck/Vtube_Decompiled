/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package f.d.a.a;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class c {
    private static String a(Object object) {
        try {
            String string = String.valueOf((Object)object);
            return string;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object.getClass().getName());
            stringBuilder.append('@');
            stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)object)));
            String string = stringBuilder.toString();
            Logger logger = Logger.getLogger((String)"com.google.common.base.Strings");
            Level level = Level.WARNING;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Exception during lenientFormat for ");
            stringBuilder2.append(string);
            logger.log(level, stringBuilder2.toString(), (Throwable)exception);
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("<");
            stringBuilder3.append(string);
            stringBuilder3.append(" threw ");
            stringBuilder3.append(exception.getClass().getName());
            stringBuilder3.append(">");
            return stringBuilder3.toString();
        }
    }

    public static /* varargs */ String a(String string, Object ... arrobject) {
        int n2;
        String string2 = String.valueOf((Object)string);
        int n3 = 0;
        if (arrobject == null) {
            arrobject = new Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < arrobject.length; ++i2) {
                arrobject[i2] = c.a(arrobject[i2]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(string2.length() + 16 * arrobject.length);
        int n4 = 0;
        while (n3 < arrobject.length && (n2 = string2.indexOf("%s", n4)) != -1) {
            stringBuilder.append((CharSequence)string2, n4, n2);
            int n5 = n3 + 1;
            stringBuilder.append(arrobject[n3]);
            n4 = n2 + 2;
            n3 = n5;
        }
        stringBuilder.append((CharSequence)string2, n4, string2.length());
        if (n3 < arrobject.length) {
            stringBuilder.append(" [");
            int n6 = n3 + 1;
            stringBuilder.append(arrobject[n3]);
            while (n6 < arrobject.length) {
                stringBuilder.append(", ");
                int n7 = n6 + 1;
                stringBuilder.append(arrobject[n6]);
                n6 = n7;
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }
}

