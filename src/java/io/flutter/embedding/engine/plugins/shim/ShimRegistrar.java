/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  io.flutter.Log
 *  io.flutter.embedding.engine.plugins.FlutterPlugin
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding
 *  io.flutter.embedding.engine.plugins.activity.ActivityAware
 *  io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$ActivityResultListener
 *  io.flutter.plugin.common.PluginRegistry$NewIntentListener
 *  io.flutter.plugin.common.PluginRegistry$Registrar
 *  io.flutter.plugin.common.PluginRegistry$RequestPermissionsResultListener
 *  io.flutter.plugin.common.PluginRegistry$UserLeaveHintListener
 *  io.flutter.plugin.common.PluginRegistry$ViewDestroyListener
 *  io.flutter.plugin.platform.PlatformViewRegistry
 *  io.flutter.view.FlutterMain
 *  io.flutter.view.FlutterNativeView
 *  io.flutter.view.FlutterView
 *  io.flutter.view.TextureRegistry
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 */
package io.flutter.embedding.engine.plugins.shim;

import android.app.Activity;
import android.content.Context;
import io.flutter.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.view.FlutterMain;
import io.flutter.view.FlutterNativeView;
import io.flutter.view.FlutterView;
import io.flutter.view.TextureRegistry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class ShimRegistrar
implements PluginRegistry.Registrar,
FlutterPlugin,
ActivityAware {
    private static final String TAG = "ShimRegistrar";
    private ActivityPluginBinding activityPluginBinding;
    private final Set<PluginRegistry.ActivityResultListener> activityResultListeners = new HashSet();
    private final Map<String, Object> globalRegistrarMap;
    private final Set<PluginRegistry.NewIntentListener> newIntentListeners = new HashSet();
    private FlutterPlugin.FlutterPluginBinding pluginBinding;
    private final String pluginId;
    private final Set<PluginRegistry.RequestPermissionsResultListener> requestPermissionsResultListeners = new HashSet();
    private final Set<PluginRegistry.UserLeaveHintListener> userLeaveHintListeners = new HashSet();
    private final Set<PluginRegistry.ViewDestroyListener> viewDestroyListeners = new HashSet();

    public ShimRegistrar(String string, Map<String, Object> map) {
        this.pluginId = string;
        this.globalRegistrarMap = map;
    }

    private void addExistingListenersToActivityPluginBinding() {
        for (PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener : this.requestPermissionsResultListeners) {
            this.activityPluginBinding.addRequestPermissionsResultListener(requestPermissionsResultListener);
        }
        for (PluginRegistry.ActivityResultListener activityResultListener : this.activityResultListeners) {
            this.activityPluginBinding.addActivityResultListener(activityResultListener);
        }
        for (PluginRegistry.NewIntentListener newIntentListener : this.newIntentListeners) {
            this.activityPluginBinding.addOnNewIntentListener(newIntentListener);
        }
        for (PluginRegistry.UserLeaveHintListener userLeaveHintListener : this.userLeaveHintListeners) {
            this.activityPluginBinding.addOnUserLeaveHintListener(userLeaveHintListener);
        }
    }

    public Context activeContext() {
        if (this.activityPluginBinding == null) {
            return this.context();
        }
        return this.activity();
    }

    public Activity activity() {
        ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
        if (activityPluginBinding != null) {
            return activityPluginBinding.getActivity();
        }
        return null;
    }

    public PluginRegistry.Registrar addActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener) {
        this.activityResultListeners.add((Object)activityResultListener);
        ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(activityResultListener);
        }
        return this;
    }

    public PluginRegistry.Registrar addNewIntentListener(PluginRegistry.NewIntentListener newIntentListener) {
        this.newIntentListeners.add((Object)newIntentListener);
        ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
        if (activityPluginBinding != null) {
            activityPluginBinding.addOnNewIntentListener(newIntentListener);
        }
        return this;
    }

    public PluginRegistry.Registrar addRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
        this.requestPermissionsResultListeners.add((Object)requestPermissionsResultListener);
        ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
        if (activityPluginBinding != null) {
            activityPluginBinding.addRequestPermissionsResultListener(requestPermissionsResultListener);
        }
        return this;
    }

    public PluginRegistry.Registrar addUserLeaveHintListener(PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
        this.userLeaveHintListeners.add((Object)userLeaveHintListener);
        ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
        if (activityPluginBinding != null) {
            activityPluginBinding.addOnUserLeaveHintListener(userLeaveHintListener);
        }
        return this;
    }

    public PluginRegistry.Registrar addViewDestroyListener(PluginRegistry.ViewDestroyListener viewDestroyListener) {
        this.viewDestroyListeners.add((Object)viewDestroyListener);
        return this;
    }

    public Context context() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.pluginBinding;
        if (flutterPluginBinding != null) {
            return flutterPluginBinding.getApplicationContext();
        }
        return null;
    }

    public String lookupKeyForAsset(String string) {
        return FlutterMain.getLookupKeyForAsset((String)string);
    }

    public String lookupKeyForAsset(String string, String string2) {
        return FlutterMain.getLookupKeyForAsset((String)string, (String)string2);
    }

    public BinaryMessenger messenger() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.pluginBinding;
        if (flutterPluginBinding != null) {
            return flutterPluginBinding.getBinaryMessenger();
        }
        return null;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        Log.v((String)TAG, (String)"Attached to an Activity.");
        this.activityPluginBinding = activityPluginBinding;
        ShimRegistrar.super.addExistingListenersToActivityPluginBinding();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Log.v((String)TAG, (String)"Attached to FlutterEngine.");
        this.pluginBinding = flutterPluginBinding;
    }

    public void onDetachedFromActivity() {
        Log.v((String)TAG, (String)"Detached from an Activity.");
        this.activityPluginBinding = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        Log.v((String)TAG, (String)"Detached from an Activity for config changes.");
        this.activityPluginBinding = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Log.v((String)TAG, (String)"Detached from FlutterEngine.");
        Iterator iterator = this.viewDestroyListeners.iterator();
        while (iterator.hasNext()) {
            ((PluginRegistry.ViewDestroyListener)iterator.next()).onViewDestroy(null);
        }
        this.pluginBinding = null;
        this.activityPluginBinding = null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        Log.v((String)TAG, (String)"Reconnected to an Activity after config changes.");
        this.activityPluginBinding = activityPluginBinding;
        ShimRegistrar.super.addExistingListenersToActivityPluginBinding();
    }

    public PlatformViewRegistry platformViewRegistry() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.pluginBinding;
        if (flutterPluginBinding != null) {
            return flutterPluginBinding.getPlatformViewRegistry();
        }
        return null;
    }

    public PluginRegistry.Registrar publish(Object object) {
        this.globalRegistrarMap.put((Object)this.pluginId, object);
        return this;
    }

    public TextureRegistry textures() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.pluginBinding;
        if (flutterPluginBinding != null) {
            return flutterPluginBinding.getTextureRegistry();
        }
        return null;
    }

    public FlutterView view() {
        throw new UnsupportedOperationException("The new embedding does not support the old FlutterView.");
    }
}

