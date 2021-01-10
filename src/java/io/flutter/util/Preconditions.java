/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package io.flutter.util;

public final class Preconditions {
    private Preconditions() {
    }

    public static <T> T checkNotNull(T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException();
    }
}

