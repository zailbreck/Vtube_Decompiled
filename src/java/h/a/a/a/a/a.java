/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  h.a.a.a.a.a$a
 *  i.k.b.b
 *  i.k.b.d
 *  io.flutter.embedding.engine.plugins.FlutterPlugin
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  java.lang.Object
 *  java.lang.String
 */
package h.a.a.a.a;

import android.content.Context;
import h.a.a.a.a.a;
import h.a.a.a.a.b;
import i.k.b.d;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;

/*
 * Exception performing whole class analysis.
 */
public final class a
implements FlutterPlugin {
    private MethodChannel b;

    static {
        new /* Unavailable Anonymous Inner Class!! */;
    }

    private final void a() {
        MethodChannel methodChannel = this.b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.b = null;
    }

    public final void a(BinaryMessenger binaryMessenger, Context context) {
        d.d((Object)binaryMessenger, (String)"messenger");
        d.d((Object)context, (String)"context");
        this.b = new MethodChannel(binaryMessenger, "PonnamKarthik/fluttertoast");
        b b2 = new b(context);
        MethodChannel methodChannel = this.b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler)b2);
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        d.d((Object)flutterPluginBinding, (String)"binding");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        d.a((Object)binaryMessenger, (String)"binding.binaryMessenger");
        Context context = flutterPluginBinding.getApplicationContext();
        d.a((Object)context, (String)"binding.applicationContext");
        this.a(binaryMessenger, context);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        d.d((Object)flutterPluginBinding, (String)"p0");
        a.super.a();
    }
}

