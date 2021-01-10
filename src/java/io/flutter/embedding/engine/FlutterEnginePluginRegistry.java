/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Service
 *  android.content.BroadcastReceiver
 *  android.content.ContentProvider
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  androidx.lifecycle.e
 *  io.flutter.Log
 *  io.flutter.embedding.engine.FlutterEngine
 *  io.flutter.embedding.engine.FlutterEnginePluginRegistry$1
 *  io.flutter.embedding.engine.loader.FlutterLoader
 *  io.flutter.embedding.engine.plugins.FlutterPlugin
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterAssets
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding
 *  io.flutter.embedding.engine.plugins.PluginRegistry
 *  io.flutter.embedding.engine.plugins.activity.ActivityAware
 *  io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
 *  io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
 *  io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding$OnSaveInstanceStateListener
 *  io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware
 *  io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface
 *  io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding
 *  io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware
 *  io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface
 *  io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding
 *  io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference
 *  io.flutter.embedding.engine.plugins.service.ServiceAware
 *  io.flutter.embedding.engine.plugins.service.ServiceAware$OnModeChangeListener
 *  io.flutter.embedding.engine.plugins.service.ServiceControlSurface
 *  io.flutter.embedding.engine.plugins.service.ServicePluginBinding
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$ActivityResultListener
 *  io.flutter.plugin.common.PluginRegistry$NewIntentListener
 *  io.flutter.plugin.common.PluginRegistry$RequestPermissionsResultListener
 *  io.flutter.plugin.common.PluginRegistry$UserLeaveHintListener
 *  io.flutter.plugin.platform.PlatformViewRegistry
 *  io.flutter.view.TextureRegistry
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 */
package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.e;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEnginePluginRegistry;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.PluginRegistry;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.embedding.engine.plugins.service.ServiceAware;
import io.flutter.embedding.engine.plugins.service.ServiceControlSurface;
import io.flutter.embedding.engine.plugins.service.ServicePluginBinding;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.view.TextureRegistry;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class FlutterEnginePluginRegistry
implements PluginRegistry,
ActivityControlSurface,
ServiceControlSurface,
BroadcastReceiverControlSurface,
ContentProviderControlSurface {
    private static final String TAG = "FlutterEnginePluginRegistry";
    private Activity activity;
    private final Map<Class<? extends FlutterPlugin>, ActivityAware> activityAwarePlugins = new HashMap();
    private FlutterEngineActivityPluginBinding activityPluginBinding;
    private BroadcastReceiver broadcastReceiver;
    private final Map<Class<? extends FlutterPlugin>, BroadcastReceiverAware> broadcastReceiverAwarePlugins = new HashMap();
    private FlutterEngineBroadcastReceiverPluginBinding broadcastReceiverPluginBinding;
    private ContentProvider contentProvider;
    private final Map<Class<? extends FlutterPlugin>, ContentProviderAware> contentProviderAwarePlugins = new HashMap();
    private FlutterEngineContentProviderPluginBinding contentProviderPluginBinding;
    private final FlutterEngine flutterEngine;
    private boolean isWaitingForActivityReattachment = false;
    private final FlutterPlugin.FlutterPluginBinding pluginBinding;
    private final Map<Class<? extends FlutterPlugin>, FlutterPlugin> plugins = new HashMap();
    private Service service;
    private final Map<Class<? extends FlutterPlugin>, ServiceAware> serviceAwarePlugins = new HashMap();
    private FlutterEngineServicePluginBinding servicePluginBinding;

    FlutterEnginePluginRegistry(Context context, FlutterEngine flutterEngine, FlutterLoader flutterLoader) {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding;
        this.flutterEngine = flutterEngine;
        this.pluginBinding = flutterPluginBinding = new FlutterPlugin.FlutterPluginBinding(context, flutterEngine, (BinaryMessenger)flutterEngine.getDartExecutor(), (TextureRegistry)flutterEngine.getRenderer(), flutterEngine.getPlatformViewsController().getRegistry(), (FlutterPlugin.FlutterAssets)new DefaultFlutterAssets(flutterLoader, null));
    }

    private void detachFromAndroidComponent() {
        if (this.isAttachedToActivity()) {
            this.detachFromActivity();
            return;
        }
        if (this.isAttachedToService()) {
            this.detachFromService();
            return;
        }
        if (this.isAttachedToBroadcastReceiver()) {
            this.detachFromBroadcastReceiver();
            return;
        }
        if (this.isAttachedToContentProvider()) {
            this.detachFromContentProvider();
        }
    }

    private boolean isAttachedToActivity() {
        return this.activity != null;
    }

    private boolean isAttachedToBroadcastReceiver() {
        return this.broadcastReceiver != null;
    }

    private boolean isAttachedToContentProvider() {
        return this.contentProvider != null;
    }

    private boolean isAttachedToService() {
        return this.service != null;
    }

    public void add(FlutterPlugin flutterPlugin) {
        if (this.has((Class<? extends FlutterPlugin>)flutterPlugin.getClass())) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Attempted to register plugin (");
            stringBuilder.append((Object)flutterPlugin);
            stringBuilder.append(") but it was already registered with this FlutterEngine (");
            stringBuilder.append((Object)this.flutterEngine);
            stringBuilder.append(").");
            Log.w((String)TAG, (String)stringBuilder.toString());
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Adding plugin: ");
        stringBuilder.append((Object)flutterPlugin);
        Log.v((String)TAG, (String)stringBuilder.toString());
        this.plugins.put((Object)flutterPlugin.getClass(), (Object)flutterPlugin);
        flutterPlugin.onAttachedToEngine(this.pluginBinding);
        if (flutterPlugin instanceof ActivityAware) {
            ActivityAware activityAware = (ActivityAware)flutterPlugin;
            this.activityAwarePlugins.put((Object)flutterPlugin.getClass(), (Object)activityAware);
            if (FlutterEnginePluginRegistry.super.isAttachedToActivity()) {
                activityAware.onAttachedToActivity((ActivityPluginBinding)this.activityPluginBinding);
            }
        }
        if (flutterPlugin instanceof ServiceAware) {
            ServiceAware serviceAware = (ServiceAware)flutterPlugin;
            this.serviceAwarePlugins.put((Object)flutterPlugin.getClass(), (Object)serviceAware);
            if (FlutterEnginePluginRegistry.super.isAttachedToService()) {
                serviceAware.onAttachedToService((ServicePluginBinding)this.servicePluginBinding);
            }
        }
        if (flutterPlugin instanceof BroadcastReceiverAware) {
            BroadcastReceiverAware broadcastReceiverAware = (BroadcastReceiverAware)flutterPlugin;
            this.broadcastReceiverAwarePlugins.put((Object)flutterPlugin.getClass(), (Object)broadcastReceiverAware);
            if (FlutterEnginePluginRegistry.super.isAttachedToBroadcastReceiver()) {
                broadcastReceiverAware.onAttachedToBroadcastReceiver((BroadcastReceiverPluginBinding)this.broadcastReceiverPluginBinding);
            }
        }
        if (flutterPlugin instanceof ContentProviderAware) {
            ContentProviderAware contentProviderAware = (ContentProviderAware)flutterPlugin;
            this.contentProviderAwarePlugins.put((Object)flutterPlugin.getClass(), (Object)contentProviderAware);
            if (FlutterEnginePluginRegistry.super.isAttachedToContentProvider()) {
                contentProviderAware.onAttachedToContentProvider((ContentProviderPluginBinding)this.contentProviderPluginBinding);
            }
        }
    }

    public void add(Set<FlutterPlugin> set) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            this.add((FlutterPlugin)iterator.next());
        }
    }

    public void attachToActivity(Activity activity, e e2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attaching to an Activity: ");
        stringBuilder.append((Object)activity);
        stringBuilder.append(".");
        String string = this.isWaitingForActivityReattachment ? " This is after a config change." : "";
        stringBuilder.append(string);
        Log.v((String)TAG, (String)stringBuilder.toString());
        FlutterEnginePluginRegistry.super.detachFromAndroidComponent();
        this.activity = activity;
        this.activityPluginBinding = new FlutterEngineActivityPluginBinding(activity, e2);
        this.flutterEngine.getPlatformViewsController().attach((Context)activity, this.flutterEngine.getRenderer(), this.flutterEngine.getDartExecutor());
        for (ActivityAware activityAware : this.activityAwarePlugins.values()) {
            if (this.isWaitingForActivityReattachment) {
                activityAware.onReattachedToActivityForConfigChanges((ActivityPluginBinding)this.activityPluginBinding);
                continue;
            }
            activityAware.onAttachedToActivity((ActivityPluginBinding)this.activityPluginBinding);
        }
        this.isWaitingForActivityReattachment = false;
    }

    public void attachToBroadcastReceiver(BroadcastReceiver broadcastReceiver, e e2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attaching to BroadcastReceiver: ");
        stringBuilder.append((Object)broadcastReceiver);
        Log.v((String)TAG, (String)stringBuilder.toString());
        FlutterEnginePluginRegistry.super.detachFromAndroidComponent();
        this.broadcastReceiver = broadcastReceiver;
        this.broadcastReceiverPluginBinding = new FlutterEngineBroadcastReceiverPluginBinding(broadcastReceiver);
        Iterator iterator = this.broadcastReceiverAwarePlugins.values().iterator();
        while (iterator.hasNext()) {
            ((BroadcastReceiverAware)iterator.next()).onAttachedToBroadcastReceiver((BroadcastReceiverPluginBinding)this.broadcastReceiverPluginBinding);
        }
    }

    public void attachToContentProvider(ContentProvider contentProvider, e e2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attaching to ContentProvider: ");
        stringBuilder.append((Object)contentProvider);
        Log.v((String)TAG, (String)stringBuilder.toString());
        FlutterEnginePluginRegistry.super.detachFromAndroidComponent();
        this.contentProvider = contentProvider;
        this.contentProviderPluginBinding = new FlutterEngineContentProviderPluginBinding(contentProvider);
        Iterator iterator = this.contentProviderAwarePlugins.values().iterator();
        while (iterator.hasNext()) {
            ((ContentProviderAware)iterator.next()).onAttachedToContentProvider((ContentProviderPluginBinding)this.contentProviderPluginBinding);
        }
    }

    public void attachToService(Service service, e e2, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attaching to a Service: ");
        stringBuilder.append((Object)service);
        Log.v((String)TAG, (String)stringBuilder.toString());
        FlutterEnginePluginRegistry.super.detachFromAndroidComponent();
        this.service = service;
        this.servicePluginBinding = new FlutterEngineServicePluginBinding(service, e2);
        Iterator iterator = this.serviceAwarePlugins.values().iterator();
        while (iterator.hasNext()) {
            ((ServiceAware)iterator.next()).onAttachedToService((ServicePluginBinding)this.servicePluginBinding);
        }
    }

    public void destroy() {
        Log.v((String)TAG, (String)"Destroying.");
        this.detachFromAndroidComponent();
        this.removeAll();
    }

    public void detachFromActivity() {
        if (this.isAttachedToActivity()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Detaching from an Activity: ");
            stringBuilder.append((Object)this.activity);
            Log.v((String)TAG, (String)stringBuilder.toString());
            Iterator iterator = this.activityAwarePlugins.values().iterator();
            while (iterator.hasNext()) {
                ((ActivityAware)iterator.next()).onDetachedFromActivity();
            }
            this.flutterEngine.getPlatformViewsController().detach();
            this.activity = null;
            this.activityPluginBinding = null;
            return;
        }
        Log.e((String)TAG, (String)"Attempted to detach plugins from an Activity when no Activity was attached.");
    }

    public void detachFromActivityForConfigChanges() {
        if (this.isAttachedToActivity()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Detaching from an Activity for config changes: ");
            stringBuilder.append((Object)this.activity);
            Log.v((String)TAG, (String)stringBuilder.toString());
            this.isWaitingForActivityReattachment = true;
            Iterator iterator = this.activityAwarePlugins.values().iterator();
            while (iterator.hasNext()) {
                ((ActivityAware)iterator.next()).onDetachedFromActivityForConfigChanges();
            }
            this.flutterEngine.getPlatformViewsController().detach();
            this.activity = null;
            this.activityPluginBinding = null;
            return;
        }
        Log.e((String)TAG, (String)"Attempted to detach plugins from an Activity when no Activity was attached.");
    }

    public void detachFromBroadcastReceiver() {
        if (this.isAttachedToBroadcastReceiver()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Detaching from BroadcastReceiver: ");
            stringBuilder.append((Object)this.broadcastReceiver);
            Log.v((String)TAG, (String)stringBuilder.toString());
            Iterator iterator = this.broadcastReceiverAwarePlugins.values().iterator();
            while (iterator.hasNext()) {
                ((BroadcastReceiverAware)iterator.next()).onDetachedFromBroadcastReceiver();
            }
        } else {
            Log.e((String)TAG, (String)"Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
        }
    }

    public void detachFromContentProvider() {
        if (this.isAttachedToContentProvider()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Detaching from ContentProvider: ");
            stringBuilder.append((Object)this.contentProvider);
            Log.v((String)TAG, (String)stringBuilder.toString());
            Iterator iterator = this.contentProviderAwarePlugins.values().iterator();
            while (iterator.hasNext()) {
                ((ContentProviderAware)iterator.next()).onDetachedFromContentProvider();
            }
        } else {
            Log.e((String)TAG, (String)"Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
        }
    }

    public void detachFromService() {
        if (this.isAttachedToService()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Detaching from a Service: ");
            stringBuilder.append((Object)this.service);
            Log.v((String)TAG, (String)stringBuilder.toString());
            Iterator iterator = this.serviceAwarePlugins.values().iterator();
            while (iterator.hasNext()) {
                ((ServiceAware)iterator.next()).onDetachedFromService();
            }
            this.service = null;
            this.servicePluginBinding = null;
            return;
        }
        Log.e((String)TAG, (String)"Attempted to detach plugins from a Service when no Service was attached.");
    }

    public FlutterPlugin get(Class<? extends FlutterPlugin> class_) {
        return (FlutterPlugin)this.plugins.get(class_);
    }

    public boolean has(Class<? extends FlutterPlugin> class_) {
        return this.plugins.containsKey(class_);
    }

    public boolean onActivityResult(int n2, int n3, Intent intent) {
        Log.v((String)TAG, (String)"Forwarding onActivityResult() to plugins.");
        if (FlutterEnginePluginRegistry.super.isAttachedToActivity()) {
            return this.activityPluginBinding.onActivityResult(n2, n3, intent);
        }
        Log.e((String)TAG, (String)"Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
        return false;
    }

    public void onMoveToBackground() {
        if (this.isAttachedToService()) {
            Log.v((String)TAG, (String)"Attached Service moved to background.");
            this.servicePluginBinding.onMoveToBackground();
        }
    }

    public void onMoveToForeground() {
        if (this.isAttachedToService()) {
            Log.v((String)TAG, (String)"Attached Service moved to foreground.");
            this.servicePluginBinding.onMoveToForeground();
        }
    }

    public void onNewIntent(Intent intent) {
        Log.v((String)TAG, (String)"Forwarding onNewIntent() to plugins.");
        if (FlutterEnginePluginRegistry.super.isAttachedToActivity()) {
            this.activityPluginBinding.onNewIntent(intent);
            return;
        }
        Log.e((String)TAG, (String)"Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
    }

    public boolean onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        Log.v((String)TAG, (String)"Forwarding onRequestPermissionsResult() to plugins.");
        if (FlutterEnginePluginRegistry.super.isAttachedToActivity()) {
            return this.activityPluginBinding.onRequestPermissionsResult(n2, arrstring, arrn);
        }
        Log.e((String)TAG, (String)"Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
        return false;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        Log.v((String)TAG, (String)"Forwarding onRestoreInstanceState() to plugins.");
        if (FlutterEnginePluginRegistry.super.isAttachedToActivity()) {
            this.activityPluginBinding.onRestoreInstanceState(bundle);
            return;
        }
        Log.e((String)TAG, (String)"Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
    }

    public void onSaveInstanceState(Bundle bundle) {
        Log.v((String)TAG, (String)"Forwarding onSaveInstanceState() to plugins.");
        if (FlutterEnginePluginRegistry.super.isAttachedToActivity()) {
            this.activityPluginBinding.onSaveInstanceState(bundle);
            return;
        }
        Log.e((String)TAG, (String)"Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
    }

    public void onUserLeaveHint() {
        Log.v((String)TAG, (String)"Forwarding onUserLeaveHint() to plugins.");
        if (this.isAttachedToActivity()) {
            this.activityPluginBinding.onUserLeaveHint();
            return;
        }
        Log.e((String)TAG, (String)"Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
    }

    public void remove(Class<? extends FlutterPlugin> class_) {
        FlutterPlugin flutterPlugin = (FlutterPlugin)this.plugins.get(class_);
        if (flutterPlugin != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Removing plugin: ");
            stringBuilder.append((Object)flutterPlugin);
            Log.v((String)TAG, (String)stringBuilder.toString());
            if (flutterPlugin instanceof ActivityAware) {
                if (FlutterEnginePluginRegistry.super.isAttachedToActivity()) {
                    ((ActivityAware)flutterPlugin).onDetachedFromActivity();
                }
                this.activityAwarePlugins.remove(class_);
            }
            if (flutterPlugin instanceof ServiceAware) {
                if (FlutterEnginePluginRegistry.super.isAttachedToService()) {
                    ((ServiceAware)flutterPlugin).onDetachedFromService();
                }
                this.serviceAwarePlugins.remove(class_);
            }
            if (flutterPlugin instanceof BroadcastReceiverAware) {
                if (FlutterEnginePluginRegistry.super.isAttachedToBroadcastReceiver()) {
                    ((BroadcastReceiverAware)flutterPlugin).onDetachedFromBroadcastReceiver();
                }
                this.broadcastReceiverAwarePlugins.remove(class_);
            }
            if (flutterPlugin instanceof ContentProviderAware) {
                if (FlutterEnginePluginRegistry.super.isAttachedToContentProvider()) {
                    ((ContentProviderAware)flutterPlugin).onDetachedFromContentProvider();
                }
                this.contentProviderAwarePlugins.remove(class_);
            }
            flutterPlugin.onDetachedFromEngine(this.pluginBinding);
            this.plugins.remove(class_);
        }
    }

    public void remove(Set<Class<? extends FlutterPlugin>> set) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            this.remove((Class<? extends FlutterPlugin>)((Class)iterator.next()));
        }
    }

    public void removeAll() {
        this.remove((Set<Class<? extends FlutterPlugin>>)new HashSet((Collection)this.plugins.keySet()));
        this.plugins.clear();
    }

    private static class DefaultFlutterAssets
    implements FlutterPlugin.FlutterAssets {
        final FlutterLoader flutterLoader;

        private DefaultFlutterAssets(FlutterLoader flutterLoader) {
            this.flutterLoader = flutterLoader;
        }

        /* synthetic */ DefaultFlutterAssets(FlutterLoader flutterLoader, 1 var2_2) {
            super(flutterLoader);
        }

        public String getAssetFilePathByName(String string) {
            return this.flutterLoader.getLookupKeyForAsset(string);
        }

        public String getAssetFilePathByName(String string, String string2) {
            return this.flutterLoader.getLookupKeyForAsset(string, string2);
        }

        public String getAssetFilePathBySubpath(String string) {
            return this.flutterLoader.getLookupKeyForAsset(string);
        }

        public String getAssetFilePathBySubpath(String string, String string2) {
            return this.flutterLoader.getLookupKeyForAsset(string, string2);
        }
    }

    private static class FlutterEngineActivityPluginBinding
    implements ActivityPluginBinding {
        private final Activity activity;
        private final HiddenLifecycleReference hiddenLifecycleReference;
        private final Set<PluginRegistry.ActivityResultListener> onActivityResultListeners = new HashSet();
        private final Set<PluginRegistry.NewIntentListener> onNewIntentListeners = new HashSet();
        private final Set<PluginRegistry.RequestPermissionsResultListener> onRequestPermissionsResultListeners = new HashSet();
        private final Set<ActivityPluginBinding.OnSaveInstanceStateListener> onSaveInstanceStateListeners = new HashSet();
        private final Set<PluginRegistry.UserLeaveHintListener> onUserLeaveHintListeners = new HashSet();

        public FlutterEngineActivityPluginBinding(Activity activity, e e2) {
            this.activity = activity;
            this.hiddenLifecycleReference = new HiddenLifecycleReference(e2);
        }

        public void addActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener) {
            this.onActivityResultListeners.add((Object)activityResultListener);
        }

        public void addOnNewIntentListener(PluginRegistry.NewIntentListener newIntentListener) {
            this.onNewIntentListeners.add((Object)newIntentListener);
        }

        public void addOnSaveStateListener(ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener) {
            this.onSaveInstanceStateListeners.add((Object)onSaveInstanceStateListener);
        }

        public void addOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
            this.onUserLeaveHintListeners.add((Object)userLeaveHintListener);
        }

        public void addRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
            this.onRequestPermissionsResultListeners.add((Object)requestPermissionsResultListener);
        }

        public Activity getActivity() {
            return this.activity;
        }

        public Object getLifecycle() {
            return this.hiddenLifecycleReference;
        }

        boolean onActivityResult(int n2, int n3, Intent intent) {
            boolean bl;
            Iterator iterator = this.onActivityResultListeners.iterator();
            block0 : do {
                bl = false;
                while (iterator.hasNext()) {
                    if (!((PluginRegistry.ActivityResultListener)iterator.next()).onActivityResult(n2, n3, intent) && !bl) continue block0;
                    bl = true;
                }
                break;
            } while (true);
            return bl;
        }

        void onNewIntent(Intent intent) {
            Iterator iterator = this.onNewIntentListeners.iterator();
            while (iterator.hasNext()) {
                ((PluginRegistry.NewIntentListener)iterator.next()).onNewIntent(intent);
            }
        }

        boolean onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
            boolean bl;
            Iterator iterator = this.onRequestPermissionsResultListeners.iterator();
            block0 : do {
                bl = false;
                while (iterator.hasNext()) {
                    if (!((PluginRegistry.RequestPermissionsResultListener)iterator.next()).onRequestPermissionsResult(n2, arrstring, arrn) && !bl) continue block0;
                    bl = true;
                }
                break;
            } while (true);
            return bl;
        }

        void onRestoreInstanceState(Bundle bundle) {
            Iterator iterator = this.onSaveInstanceStateListeners.iterator();
            while (iterator.hasNext()) {
                ((ActivityPluginBinding.OnSaveInstanceStateListener)iterator.next()).onRestoreInstanceState(bundle);
            }
        }

        void onSaveInstanceState(Bundle bundle) {
            Iterator iterator = this.onSaveInstanceStateListeners.iterator();
            while (iterator.hasNext()) {
                ((ActivityPluginBinding.OnSaveInstanceStateListener)iterator.next()).onSaveInstanceState(bundle);
            }
        }

        void onUserLeaveHint() {
            Iterator iterator = this.onUserLeaveHintListeners.iterator();
            while (iterator.hasNext()) {
                ((PluginRegistry.UserLeaveHintListener)iterator.next()).onUserLeaveHint();
            }
        }

        public void removeActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener) {
            this.onActivityResultListeners.remove((Object)activityResultListener);
        }

        public void removeOnNewIntentListener(PluginRegistry.NewIntentListener newIntentListener) {
            this.onNewIntentListeners.remove((Object)newIntentListener);
        }

        public void removeOnSaveStateListener(ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener) {
            this.onSaveInstanceStateListeners.remove((Object)onSaveInstanceStateListener);
        }

        public void removeOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
            this.onUserLeaveHintListeners.remove((Object)userLeaveHintListener);
        }

        public void removeRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
            this.onRequestPermissionsResultListeners.remove((Object)requestPermissionsResultListener);
        }
    }

    private static class FlutterEngineBroadcastReceiverPluginBinding
    implements BroadcastReceiverPluginBinding {
        private final BroadcastReceiver broadcastReceiver;

        FlutterEngineBroadcastReceiverPluginBinding(BroadcastReceiver broadcastReceiver) {
            this.broadcastReceiver = broadcastReceiver;
        }

        public BroadcastReceiver getBroadcastReceiver() {
            return this.broadcastReceiver;
        }
    }

    private static class FlutterEngineContentProviderPluginBinding
    implements ContentProviderPluginBinding {
        private final ContentProvider contentProvider;

        FlutterEngineContentProviderPluginBinding(ContentProvider contentProvider) {
            this.contentProvider = contentProvider;
        }

        public ContentProvider getContentProvider() {
            return this.contentProvider;
        }
    }

    private static class FlutterEngineServicePluginBinding
    implements ServicePluginBinding {
        private final HiddenLifecycleReference hiddenLifecycleReference;
        private final Set<ServiceAware.OnModeChangeListener> onModeChangeListeners = new HashSet();
        private final Service service;

        FlutterEngineServicePluginBinding(Service service, e e2) {
            this.service = service;
            HiddenLifecycleReference hiddenLifecycleReference = e2 != null ? new HiddenLifecycleReference(e2) : null;
            this.hiddenLifecycleReference = hiddenLifecycleReference;
        }

        public void addOnModeChangeListener(ServiceAware.OnModeChangeListener onModeChangeListener) {
            this.onModeChangeListeners.add((Object)onModeChangeListener);
        }

        public Object getLifecycle() {
            return this.hiddenLifecycleReference;
        }

        public Service getService() {
            return this.service;
        }

        void onMoveToBackground() {
            Iterator iterator = this.onModeChangeListeners.iterator();
            while (iterator.hasNext()) {
                ((ServiceAware.OnModeChangeListener)iterator.next()).onMoveToBackground();
            }
        }

        void onMoveToForeground() {
            Iterator iterator = this.onModeChangeListeners.iterator();
            while (iterator.hasNext()) {
                ((ServiceAware.OnModeChangeListener)iterator.next()).onMoveToForeground();
            }
        }

        public void removeOnModeChangeListener(ServiceAware.OnModeChangeListener onModeChangeListener) {
            this.onModeChangeListeners.remove((Object)onModeChangeListener);
        }
    }

}

