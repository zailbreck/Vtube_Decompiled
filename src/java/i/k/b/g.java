/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  i.k.b.e
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 */
package i.k.b;

import i.k.b.c;
import i.k.b.e;
import java.lang.reflect.Type;

public class g {
    public String a(c c2) {
        String string2 = c2.getClass().getGenericInterfaces()[0].toString();
        if (string2.startsWith("kotlin.jvm.functions.")) {
            string2 = string2.substring(21);
        }
        return string2;
    }

    public String a(e e2) {
        return this.a((c)e2);
    }
}

