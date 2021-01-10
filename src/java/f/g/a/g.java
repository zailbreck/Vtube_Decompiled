/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.webkit.ValueCallback
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.d
 *  f.g.a.q
 *  io.flutter.embedding.engine.plugins.FlutterPlugin
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterAssets
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding
 *  io.flutter.embedding.engine.plugins.activity.ActivityAware
 *  io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.platform.PlatformViewFactory
 *  io.flutter.plugin.platform.PlatformViewRegistry
 *  io.flutter.view.FlutterView
 *  java.lang.Object
 *  java.lang.String
 */
package f.g.a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.ValueCallback;
import f.g.a.a;
import f.g.a.d;
import f.g.a.e;
import f.g.a.f;
import f.g.a.h;
import f.g.a.j;
import f.g.a.k;
import f.g.a.q;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformViewFactory;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.view.FlutterView;

public class g
implements FlutterPlugin,
ActivityAware {
    public static f b;
    public static e c;
    public static a d;
    public static h e;
    public static j f;
    public static d g;
    public static k h;
    public static ValueCallback<Uri> i;
    public static ValueCallback<Uri[]> j;

    private void a(Context context, BinaryMessenger binaryMessenger, Activity activity, PlatformViewRegistry platformViewRegistry, FlutterView flutterView) {
        q.a = context;
        q.f = activity;
        q.c = binaryMessenger;
        b = new f(binaryMessenger);
        c = new e(binaryMessenger);
        d = new a(binaryMessenger);
        platformViewRegistry.registerViewFactory("com.pichillilorenzo/flutter_inappwebview", (PlatformViewFactory)new com.pichillilorenzo.flutter_inappwebview.InAppWebView.d(binaryMessenger, (View)flutterView));
        e = new h(binaryMessenger);
        f = new j(binaryMessenger);
        h = new k(binaryMessenger);
        if (Build.VERSION.SDK_INT >= 26) {
            g = new d(binaryMessenger);
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        q.e = activityPluginBinding;
        q.f = activityPluginBinding.getActivity();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        q.d = flutterPluginBinding.getFlutterAssets();
        g.super.a(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger(), q.f, flutterPluginBinding.getPlatformViewRegistry(), null);
    }

    public void onDetachedFromActivity() {
        q.e = null;
        q.f = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        q.e = null;
        q.f = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        a a2;
        h h2;
        k k2;
        j j2;
        e e2;
        f f2 = b;
        if (f2 != null) {
            f2.a();
            b = null;
        }
        if ((e2 = c) != null) {
            e2.a();
            c = null;
        }
        if ((a2 = d) != null) {
            a2.a();
            d = null;
        }
        if ((j2 = f) != null) {
            j2.a();
            f = null;
        }
        if ((k2 = h) != null) {
            k2.a();
            h = null;
        }
        if (g != null && Build.VERSION.SDK_INT >= 26) {
            g.a();
            g = null;
        }
        if ((h2 = e) != null) {
            h2.a();
            e = null;
        }
        i = null;
        j = null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        q.e = activityPluginBinding;
        q.f = activityPluginBinding.getActivity();
    }
}

