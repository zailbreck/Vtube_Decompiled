/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.View
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.c
 *  f.g.a.q
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package f.g.a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.c;
import f.g.a.q;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;

public class e
implements MethodChannel.MethodCallHandler {
    public MethodChannel b;
    Map<String, c> c = new HashMap();

    public e(BinaryMessenger binaryMessenger) {
        this.b = new MethodChannel(binaryMessenger, "com.pichillilorenzo/flutter_headless_inappwebview");
        this.b.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
    }

    public void a() {
        this.b.setMethodCallHandler(null);
    }

    public void a(Activity activity, String string, HashMap<String, Object> hashMap) {
        c c2 = new c(q.c, (Context)activity, (Object)string, hashMap, null);
        this.c.put((Object)string, (Object)c2);
    }

    public void a(String string) {
        if (this.c.containsKey((Object)string)) {
            ((c)this.c.get((Object)string)).dispose();
            this.c.remove((Object)string);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onMethodCall(MethodCall var1, MethodChannel.Result var2_2) {
        block6 : {
            block5 : {
                var3_3 = q.f;
                var4_4 = (String)var1.argument("uuid");
                var5_5 = var1.method;
                var6_6 = var5_5.hashCode();
                if (var6_6 == 368876996) break block5;
                if (var6_6 != 454282817 || !var5_5.equals((Object)"disposeHeadlessWebView")) ** GOTO lbl-1000
                var7_7 = 1;
                break block6;
            }
            if (var5_5.equals((Object)"createHeadlessWebView")) {
                var7_7 = 0;
            } else lbl-1000: // 2 sources:
            {
                var7_7 = -1;
            }
        }
        if (var7_7 != 0) {
            if (var7_7 != 1) {
                var2_2.notImplemented();
                return;
            }
            this.a(var4_4);
        } else {
            this.a(var3_3, var4_4, (HashMap<String, Object>)((HashMap)var1.argument("params")));
        }
        var2_2.success((Object)true);
    }
}

