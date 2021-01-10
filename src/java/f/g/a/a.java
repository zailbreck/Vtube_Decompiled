/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.util.Log
 *  com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ChromeCustomTabsActivity
 *  com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.b
 *  com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity
 *  com.pichillilorenzo.flutter_inappwebview.InAppBrowser.a
 *  f.g.a.q
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  java.io.Serializable
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package f.g.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ChromeCustomTabsActivity;
import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.b;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import f.g.a.q;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a
implements MethodChannel.MethodCallHandler {
    public MethodChannel b;

    public a(BinaryMessenger binaryMessenger) {
        this.b = new MethodChannel(binaryMessenger, "com.pichillilorenzo/flutter_chromesafaribrowser");
        this.b.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
    }

    public void a() {
        this.b.setMethodCallHandler(null);
    }

    public void a(Activity activity, String string, String string2, HashMap<String, Object> hashMap, List<HashMap<String, Object>> list, String string3, Map<String, String> map, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, Integer n2, MethodChannel.Result result) {
        Intent intent;
        Bundle bundle = new Bundle();
        bundle.putString("fromActivity", activity.getClass().getName());
        bundle.putString("url", string2);
        bundle.putBoolean("isData", false);
        bundle.putString("uuid", string);
        bundle.putSerializable("options", hashMap);
        bundle.putSerializable("menuItemList", (Serializable)list);
        bundle.putSerializable("headers", (Serializable)map);
        bundle.putSerializable("contextMenu", hashMap3);
        int n3 = n2 != null ? n2 : -1;
        bundle.putInt("windowId", n3);
        if (b.c((Activity)activity)) {
            intent = new Intent((Context)activity, ChromeCustomTabsActivity.class);
        } else if (!b.c((Activity)activity) && string3 != null) {
            Log.d((String)"ChromeBrowserManager", (String)"WebView fallback declared.");
            bundle.putString("uuid", string3);
            if (hashMap2 != null) {
                bundle.putSerializable("options", hashMap2);
            } else {
                bundle.putSerializable("options", (Serializable)new com.pichillilorenzo.flutter_inappwebview.InAppBrowser.a().a());
            }
            intent = new Intent((Context)activity, InAppBrowserActivity.class);
        } else {
            intent = null;
        }
        if (intent != null) {
            intent.putExtras(bundle);
            activity.startActivity(intent);
            result.success((Object)true);
            return;
        }
        result.error("ChromeBrowserManager", "No WebView fallback declared.", null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onMethodCall(MethodCall var1, MethodChannel.Result var2_2) {
        block5 : {
            block4 : {
                var3_3 = q.f;
                var4_4 = (String)var1.argument("uuid");
                var5_5 = var1.method;
                var6_6 = var5_5.hashCode();
                if (var6_6 == 3417674) break block4;
                if (var6_6 != 444517567 || !var5_5.equals((Object)"isAvailable")) ** GOTO lbl-1000
                var7_7 = 1;
                break block5;
            }
            if (var5_5.equals((Object)"open")) {
                var7_7 = 0;
            } else lbl-1000: // 2 sources:
            {
                var7_7 = -1;
            }
        }
        if (var7_7 == 0) {
            this.a(var3_3, var4_4, (String)var1.argument("url"), (HashMap<String, Object>)((HashMap)var1.argument("options")), (List<HashMap<String, Object>>)((List)var1.argument("menuItemList")), (String)var1.argument("uuidFallback"), (Map<String, String>)((Map)var1.argument("headersFallback")), (HashMap<String, Object>)((HashMap)var1.argument("optionsFallback")), (HashMap<String, Object>)((HashMap)var1.argument("contextMenuFallback")), (Integer)var1.argument("windowIdFallback"), var2_2);
            return;
        }
        if (var7_7 != 1) {
            var2_2.notImplemented();
            return;
        }
        var2_2.success((Object)b.c((Activity)var3_3));
    }
}

