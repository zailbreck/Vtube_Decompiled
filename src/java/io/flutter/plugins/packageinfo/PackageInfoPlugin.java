/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.os.Build$VERSION
 *  io.flutter.embedding.engine.plugins.FlutterPlugin
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$Registrar
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package io.flutter.plugins.packageinfo;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.HashMap;

public class PackageInfoPlugin
implements MethodChannel.MethodCallHandler,
FlutterPlugin {
    private Context applicationContext;
    private MethodChannel methodChannel;

    private static long getLongVersionCode(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return packageInfo.versionCode;
    }

    private void onAttachedToEngine(Context context, BinaryMessenger binaryMessenger) {
        this.applicationContext = context;
        this.methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/package_info");
        this.methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new PackageInfoPlugin().onAttachedToEngine(registrar.context(), registrar.messenger());
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        PackageInfoPlugin.super.onAttachedToEngine(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.applicationContext = null;
        this.methodChannel.setMethodCallHandler(null);
        this.methodChannel = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        try {
            if (methodCall.method.equals((Object)"getAll")) {
                PackageManager packageManager = this.applicationContext.getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(this.applicationContext.getPackageName(), 0);
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"appName", (Object)packageInfo.applicationInfo.loadLabel(packageManager).toString());
                hashMap.put((Object)"packageName", (Object)this.applicationContext.getPackageName());
                hashMap.put((Object)"version", (Object)packageInfo.versionName);
                hashMap.put((Object)"buildNumber", (Object)String.valueOf((long)PackageInfoPlugin.getLongVersionCode(packageInfo)));
                result.success((Object)hashMap);
                return;
            }
            result.notImplemented();
            return;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            result.error("Name not found", nameNotFoundException.getMessage(), null);
            return;
        }
    }
}

