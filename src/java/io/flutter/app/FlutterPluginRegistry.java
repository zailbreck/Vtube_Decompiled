/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  io.flutter.embedding.engine.FlutterEngine
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
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 */
package io.flutter.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.view.FlutterMain;
import io.flutter.view.FlutterNativeView;
import io.flutter.view.FlutterView;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FlutterPluginRegistry
implements PluginRegistry,
PluginRegistry.RequestPermissionsResultListener,
PluginRegistry.ActivityResultListener,
PluginRegistry.NewIntentListener,
PluginRegistry.UserLeaveHintListener,
PluginRegistry.ViewDestroyListener {
    private static final String TAG = "FlutterPluginRegistry";
    private Activity mActivity;
    private final List<PluginRegistry.ActivityResultListener> mActivityResultListeners = new ArrayList(0);
    private Context mAppContext;
    private FlutterView mFlutterView;
    private FlutterNativeView mNativeView;
    private final List<PluginRegistry.NewIntentListener> mNewIntentListeners = new ArrayList(0);
    private final PlatformViewsController mPlatformViewsController;
    private final Map<String, Object> mPluginMap = new LinkedHashMap(0);
    private final List<PluginRegistry.RequestPermissionsResultListener> mRequestPermissionsResultListeners = new ArrayList(0);
    private final List<PluginRegistry.UserLeaveHintListener> mUserLeaveHintListeners = new ArrayList(0);
    private final List<PluginRegistry.ViewDestroyListener> mViewDestroyListeners = new ArrayList(0);

    public FlutterPluginRegistry(FlutterEngine flutterEngine, Context context) {
        this.mAppContext = context;
        this.mPlatformViewsController = new PlatformViewsController();
    }

    public FlutterPluginRegistry(FlutterNativeView flutterNativeView, Context context) {
        this.mNativeView = flutterNativeView;
        this.mAppContext = context;
        this.mPlatformViewsController = new PlatformViewsController();
    }

    public void attach(FlutterView flutterView, Activity activity) {
        this.mFlutterView = flutterView;
        this.mActivity = activity;
        this.mPlatformViewsController.attach((Context)activity, (TextureRegistry)flutterView, flutterView.getDartExecutor());
    }

    public void destroy() {
        this.mPlatformViewsController.onFlutterViewDestroyed();
    }

    public void detach() {
        this.mPlatformViewsController.detach();
        this.mPlatformViewsController.onFlutterViewDestroyed();
        this.mFlutterView = null;
        this.mActivity = null;
    }

    public PlatformViewsController getPlatformViewsController() {
        return this.mPlatformViewsController;
    }

    public boolean hasPlugin(String string) {
        return this.mPluginMap.containsKey((Object)string);
    }

    public boolean onActivityResult(int n2, int n3, Intent intent) {
        Iterator iterator = this.mActivityResultListeners.iterator();
        while (iterator.hasNext()) {
            if (!((PluginRegistry.ActivityResultListener)iterator.next()).onActivityResult(n2, n3, intent)) continue;
            return true;
        }
        return false;
    }

    public boolean onNewIntent(Intent intent) {
        Iterator iterator = this.mNewIntentListeners.iterator();
        while (iterator.hasNext()) {
            if (!((PluginRegistry.NewIntentListener)iterator.next()).onNewIntent(intent)) continue;
            return true;
        }
        return false;
    }

    public void onPreEngineRestart() {
        this.mPlatformViewsController.onPreEngineRestart();
    }

    public boolean onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        Iterator iterator = this.mRequestPermissionsResultListeners.iterator();
        while (iterator.hasNext()) {
            if (!((PluginRegistry.RequestPermissionsResultListener)iterator.next()).onRequestPermissionsResult(n2, arrstring, arrn)) continue;
            return true;
        }
        return false;
    }

    public void onUserLeaveHint() {
        Iterator iterator = this.mUserLeaveHintListeners.iterator();
        while (iterator.hasNext()) {
            ((PluginRegistry.UserLeaveHintListener)iterator.next()).onUserLeaveHint();
        }
    }

    public boolean onViewDestroy(FlutterNativeView flutterNativeView) {
        Iterator iterator = this.mViewDestroyListeners.iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            if (!((PluginRegistry.ViewDestroyListener)iterator.next()).onViewDestroy(flutterNativeView)) continue;
            bl = true;
        }
        return bl;
    }

    public PluginRegistry.Registrar registrarFor(String string) {
        if (!this.mPluginMap.containsKey((Object)string)) {
            this.mPluginMap.put((Object)string, null);
            return (FlutterPluginRegistry)this.new FlutterRegistrar(string);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Plugin key ");
        stringBuilder.append(string);
        stringBuilder.append(" is already in use");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public <T> T valuePublishedByPlugin(String string) {
        return (T)this.mPluginMap.get((Object)string);
    }

    private class FlutterRegistrar
    implements PluginRegistry.Registrar {
        private final String pluginKey;

        FlutterRegistrar(String string) {
            this.pluginKey = string;
        }

        public Context activeContext() {
            if (FlutterPluginRegistry.this.mActivity != null) {
                return FlutterPluginRegistry.this.mActivity;
            }
            return FlutterPluginRegistry.this.mAppContext;
        }

        public Activity activity() {
            return FlutterPluginRegistry.this.mActivity;
        }

        public PluginRegistry.Registrar addActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener) {
            FlutterPluginRegistry.this.mActivityResultListeners.add((Object)activityResultListener);
            return this;
        }

        public PluginRegistry.Registrar addNewIntentListener(PluginRegistry.NewIntentListener newIntentListener) {
            FlutterPluginRegistry.this.mNewIntentListeners.add((Object)newIntentListener);
            return this;
        }

        public PluginRegistry.Registrar addRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
            FlutterPluginRegistry.this.mRequestPermissionsResultListeners.add((Object)requestPermissionsResultListener);
            return this;
        }

        public PluginRegistry.Registrar addUserLeaveHintListener(PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
            FlutterPluginRegistry.this.mUserLeaveHintListeners.add((Object)userLeaveHintListener);
            return this;
        }

        public PluginRegistry.Registrar addViewDestroyListener(PluginRegistry.ViewDestroyListener viewDestroyListener) {
            FlutterPluginRegistry.this.mViewDestroyListeners.add((Object)viewDestroyListener);
            return this;
        }

        public Context context() {
            return FlutterPluginRegistry.this.mAppContext;
        }

        public String lookupKeyForAsset(String string) {
            return FlutterMain.getLookupKeyForAsset((String)string);
        }

        public String lookupKeyForAsset(String string, String string2) {
            return FlutterMain.getLookupKeyForAsset((String)string, (String)string2);
        }

        public BinaryMessenger messenger() {
            return FlutterPluginRegistry.this.mNativeView;
        }

        public PlatformViewRegistry platformViewRegistry() {
            return FlutterPluginRegistry.this.mPlatformViewsController.getRegistry();
        }

        public PluginRegistry.Registrar publish(Object object) {
            FlutterPluginRegistry.this.mPluginMap.put((Object)this.pluginKey, object);
            return this;
        }

        public TextureRegistry textures() {
            return FlutterPluginRegistry.this.mFlutterView;
        }

        public FlutterView view() {
            return FlutterPluginRegistry.this.mFlutterView;
        }
    }

}

