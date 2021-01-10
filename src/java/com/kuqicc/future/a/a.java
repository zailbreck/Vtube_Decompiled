/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.kuqicc.future.a;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;

public class a
implements MethodChannel.MethodCallHandler {
    protected String b = "";

    protected a() {
    }

    protected void a(FlutterEngine flutterEngine) {
        new MethodChannel(flutterEngine.getDartExecutor(), this.b).setMethodCallHandler((MethodChannel.MethodCallHandler)this);
    }
}

