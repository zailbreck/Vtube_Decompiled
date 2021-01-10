/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package f.h.a;

import io.flutter.plugin.common.MethodCall;

public class b {
    static Integer a(MethodCall methodCall) {
        return (Integer)methodCall.argument("logLevel");
    }

    static boolean a(int n2) {
        return n2 >= 1;
    }

    static boolean b(int n2) {
        return n2 >= 2;
    }
}

