/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$Result
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package io.flutter.plugin.common;

import android.util.Log;
import io.flutter.plugin.common.MethodChannel;

public class ErrorLogResult
implements MethodChannel.Result {
    private int level;
    private String tag;

    public ErrorLogResult(String string) {
        super(string, 5);
    }

    public ErrorLogResult(String string, int n2) {
        this.tag = string;
        this.level = n2;
    }

    public void error(String string, String string2, Object object) {
        String string3;
        if (object != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" details: ");
            stringBuilder.append(object);
            string3 = stringBuilder.toString();
        } else {
            string3 = "";
        }
        int n2 = this.level;
        if (n2 < 5) {
            return;
        }
        String string4 = this.tag;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        Log.println((int)n2, (String)string4, (String)stringBuilder.toString());
    }

    public void notImplemented() {
        int n2 = this.level;
        if (n2 < 5) {
            return;
        }
        Log.println((int)n2, (String)this.tag, (String)"method not implemented");
    }

    public void success(Object object) {
    }
}

