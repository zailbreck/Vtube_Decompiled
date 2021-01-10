/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
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
 *  io.flutter.plugins.share.Share
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.plugins.share;

import android.app.Activity;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.share.MethodCallHandler;
import io.flutter.plugins.share.Share;

public class SharePlugin
implements FlutterPlugin,
ActivityAware {
    private static final String CHANNEL = "plugins.flutter.io/share";
    private MethodCallHandler handler;
    private MethodChannel methodChannel;
    private Share share;

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new SharePlugin().setUpChannel(registrar.context(), registrar.activity(), registrar.messenger());
    }

    private void setUpChannel(Context context, Activity activity, BinaryMessenger binaryMessenger) {
        this.methodChannel = new MethodChannel(binaryMessenger, CHANNEL);
        this.share = new Share(context, activity);
        this.handler = new MethodCallHandler(this.share);
        this.methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler)this.handler);
    }

    private void tearDownChannel() {
        this.share.setActivity(null);
        this.methodChannel.setMethodCallHandler(null);
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.share.setActivity(activityPluginBinding.getActivity());
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        SharePlugin.super.setUpChannel(flutterPluginBinding.getApplicationContext(), null, flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromActivity() {
        this.tearDownChannel();
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.methodChannel.setMethodCallHandler(null);
        this.methodChannel = null;
        this.share = null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.onAttachedToActivity(activityPluginBinding);
    }
}

