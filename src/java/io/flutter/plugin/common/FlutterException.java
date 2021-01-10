/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package io.flutter.plugin.common;

public class FlutterException
extends RuntimeException {
    private static final String TAG = "FlutterException#";
    public final String code;
    public final Object details;

    FlutterException(String string2, String string3, Object object) {
        super(string3);
        this.code = string2;
        this.details = object;
    }
}

