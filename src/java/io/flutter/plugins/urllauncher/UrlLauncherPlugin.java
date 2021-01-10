/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.util.Log
 *  io.flutter.embedding.engine.plugins.FlutterPlugin
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding
 *  io.flutter.embedding.engine.plugins.activity.ActivityAware
 *  io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$Registrar
 *  io.flutter.plugins.urllauncher.UrlLauncher
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.urllauncher.MethodCallHandlerImpl;
import io.flutter.plugins.urllauncher.UrlLauncher;

public final class UrlLauncherPlugin
implements FlutterPlugin,
ActivityAware {
    private static final String TAG = "UrlLauncherPlugin";
    private MethodCallHandlerImpl methodCallHandler;
    private UrlLauncher urlLauncher;

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new MethodCallHandlerImpl(new UrlLauncher(registrar.context(), registrar.activity())).startListening(registrar.messenger());
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        if (this.methodCallHandler == null) {
            Log.wtf((String)TAG, (String)"urlLauncher was never set.");
            return;
        }
        this.urlLauncher.setActivity(activityPluginBinding.getActivity());
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.urlLauncher = new UrlLauncher(flutterPluginBinding.getApplicationContext(), null);
        this.methodCallHandler = new MethodCallHandlerImpl(this.urlLauncher);
        this.methodCallHandler.startListening(flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromActivity() {
        if (this.methodCallHandler == null) {
            Log.wtf((String)TAG, (String)"urlLauncher was never set.");
            return;
        }
        this.urlLauncher.setActivity(null);
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodCallHandlerImpl methodCallHandlerImpl = this.methodCallHandler;
        if (methodCallHandlerImpl == null) {
            Log.wtf((String)TAG, (String)"Already detached from the engine.");
            return;
        }
        methodCallHandlerImpl.stopListening();
        this.methodCallHandler = null;
        this.urlLauncher = null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.onAttachedToActivity(activityPluginBinding);
    }
}

