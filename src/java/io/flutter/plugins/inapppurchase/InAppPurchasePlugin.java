/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  io.flutter.embedding.engine.plugins.FlutterPlugin
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding
 *  io.flutter.embedding.engine.plugins.activity.ActivityAware
 *  io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$Registrar
 *  io.flutter.plugins.inapppurchase.BillingClientFactory
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.plugins.inapppurchase;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.inapppurchase.BillingClientFactory;
import io.flutter.plugins.inapppurchase.BillingClientFactoryImpl;
import io.flutter.plugins.inapppurchase.MethodCallHandlerImpl;

public class InAppPurchasePlugin
implements FlutterPlugin,
ActivityAware {
    private MethodCallHandlerImpl methodCallHandler;
    private MethodChannel methodChannel;

    public static void registerWith(PluginRegistry.Registrar registrar) {
        InAppPurchasePlugin inAppPurchasePlugin = new InAppPurchasePlugin();
        inAppPurchasePlugin.setupMethodChannel(registrar.activity(), registrar.messenger(), registrar.context());
        ((Application)registrar.context().getApplicationContext()).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)inAppPurchasePlugin.methodCallHandler);
    }

    private void setupMethodChannel(Activity activity, BinaryMessenger binaryMessenger, Context context) {
        this.methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/in_app_purchase");
        this.methodCallHandler = new MethodCallHandlerImpl(activity, context, this.methodChannel, new BillingClientFactoryImpl());
        this.methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler)this.methodCallHandler);
    }

    private void teardownMethodChannel() {
        this.methodChannel.setMethodCallHandler(null);
        this.methodChannel = null;
        this.methodCallHandler = null;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.methodCallHandler.setActivity(activityPluginBinding.getActivity());
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        InAppPurchasePlugin.super.setupMethodChannel(null, flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromActivity() {
        this.methodCallHandler.setActivity(null);
        this.methodCallHandler.onDetachedFromActivity();
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.methodCallHandler.setActivity(null);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        InAppPurchasePlugin.super.teardownMethodChannel();
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.onAttachedToActivity(activityPluginBinding);
    }

    void setMethodCallHandler(MethodCallHandlerImpl methodCallHandlerImpl) {
        this.methodCallHandler = methodCallHandlerImpl;
    }
}

