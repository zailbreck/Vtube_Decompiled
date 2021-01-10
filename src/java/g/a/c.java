/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  g.a.a
 *  g.a.c$a
 *  i.k.b.b
 *  i.k.b.d
 *  io.flutter.embedding.engine.plugins.FlutterPlugin
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding
 *  io.flutter.embedding.engine.plugins.activity.ActivityAware
 *  io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$Registrar
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package g.a;

import android.app.Activity;
import g.a.c;
import i.k.b.b;
import i.k.b.d;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/*
 * Exception performing whole class analysis.
 */
public final class c
implements FlutterPlugin,
MethodChannel.MethodCallHandler,
ActivityAware {
    private MethodChannel b;
    private PluginRegistry.Registrar c;
    private g.a.a d;

    static {
        new /* Unavailable Anonymous Inner Class!! */;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        d.d((Object)activityPluginBinding, (String)"binding");
        g.a.a a2 = this.d;
        if (a2 != null) {
            a2.a(activityPluginBinding.getActivity());
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        d.d((Object)flutterPluginBinding, (String)"flutterPluginBinding");
        MethodChannel methodChannel = this.b = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "wakelock");
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
            this.d = new g.a.a();
            return;
        }
        d.e((String)"channel");
        throw null;
    }

    public void onDetachedFromActivity() {
        g.a.a a2 = this.d;
        if (a2 != null) {
            a2.a(null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        d.d((Object)flutterPluginBinding, (String)"binding");
        MethodChannel methodChannel = this.b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            this.d = null;
            this.c = null;
            return;
        }
        d.e((String)"channel");
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onMethodCall(MethodCall var1, MethodChannel.Result var2_2) {
        block10 : {
            block9 : {
                d.d((Object)var1, (String)"call");
                d.d((Object)var2_2, (String)"result");
                var3_3 = this.c;
                if (var3_3 != null) {
                    var10_4 = this.d;
                    if (var10_4 == null) {
                        d.a();
                        throw null;
                    }
                    if (var3_3 == null) {
                        d.a();
                        throw null;
                    }
                    var10_4.a(var3_3.activity());
                }
                if ((var4_5 = var1.method) == null) ** GOTO lbl-1000
                var5_6 = var4_5.hashCode();
                if (var5_6 == -868304044) break block9;
                if (var5_6 != 2105594551 || !var4_5.equals((Object)"isEnabled")) ** GOTO lbl-1000
                var9_7 = this.d;
                if (var9_7 == null) {
                    d.a();
                    throw null;
                }
                var9_7.a(var2_2);
                break block10;
            }
            if (var4_5.equals((Object)"toggle")) {
                var7_8 = this.d;
                if (var7_8 == null) {
                    d.a();
                    throw null;
                }
                var8_9 = var1.argument("enable");
                if (var8_9 == null) {
                    d.a();
                    throw null;
                }
                d.a((Object)var8_9, (String)"call.argument<Boolean>(\"enable\")!!");
                var7_8.a(((Boolean)var8_9).booleanValue(), var2_2);
            } else lbl-1000: // 3 sources:
            {
                var2_2.notImplemented();
            }
        }
        if (this.c == null) return;
        var6_10 = this.d;
        if (var6_10 != null) {
            var6_10.a(null);
            return;
        }
        d.a();
        throw null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        d.d((Object)activityPluginBinding, (String)"binding");
        this.onAttachedToActivity(activityPluginBinding);
    }
}

