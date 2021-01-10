/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Method
 *  java.util.HashSet
 *  java.util.Set
 */
package io.flutter.embedding.engine;

import android.content.Context;
import android.content.res.AssetManager;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEnginePluginRegistry;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.PluginRegistry;
import io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface;
import io.flutter.embedding.engine.plugins.service.ServiceControlSurface;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.embedding.engine.systemchannels.LifecycleChannel;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import io.flutter.embedding.engine.systemchannels.NavigationChannel;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.embedding.engine.systemchannels.SystemChannel;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.platform.PlatformViewsController;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class FlutterEngine {
    private static final String TAG = "FlutterEngine";
    private final AccessibilityChannel accessibilityChannel;
    private final DartExecutor dartExecutor;
    private final EngineLifecycleListener engineLifecycleListener;
    private final Set<EngineLifecycleListener> engineLifecycleListeners;
    private final FlutterJNI flutterJNI;
    private final KeyEventChannel keyEventChannel;
    private final LifecycleChannel lifecycleChannel;
    private final LocalizationChannel localizationChannel;
    private final NavigationChannel navigationChannel;
    private final PlatformChannel platformChannel;
    private final PlatformViewsController platformViewsController;
    private final FlutterEnginePluginRegistry pluginRegistry;
    private final FlutterRenderer renderer;
    private final SettingsChannel settingsChannel;
    private final SystemChannel systemChannel;
    private final TextInputChannel textInputChannel;

    public FlutterEngine(Context context) {
        super(context, null);
    }

    public FlutterEngine(Context context, FlutterLoader flutterLoader, FlutterJNI flutterJNI) {
        super(context, flutterLoader, flutterJNI, null, true);
    }

    public FlutterEngine(Context context, FlutterLoader flutterLoader, FlutterJNI flutterJNI, PlatformViewsController platformViewsController, String[] arrstring, boolean bl) {
        this.engineLifecycleListeners = new HashSet();
        this.engineLifecycleListener = new EngineLifecycleListener(this){
            final /* synthetic */ FlutterEngine this$0;
            {
                this.this$0 = flutterEngine;
            }

            public void onPreEngineRestart() {
                Log.v("FlutterEngine", "onPreEngineRestart()");
                java.util.Iterator iterator = FlutterEngine.access$000(this.this$0).iterator();
                while (iterator.hasNext()) {
                    ((EngineLifecycleListener)iterator.next()).onPreEngineRestart();
                }
                FlutterEngine.access$100(this.this$0).onPreEngineRestart();
            }
        };
        this.flutterJNI = flutterJNI;
        flutterLoader.startInitialization(context.getApplicationContext());
        flutterLoader.ensureInitializationComplete(context, arrstring);
        flutterJNI.addEngineLifecycleListener(this.engineLifecycleListener);
        this.attachToJni();
        this.dartExecutor = new DartExecutor(flutterJNI, context.getAssets());
        this.dartExecutor.onAttachedToJNI();
        this.renderer = new FlutterRenderer(flutterJNI);
        this.accessibilityChannel = new AccessibilityChannel(this.dartExecutor, flutterJNI);
        this.keyEventChannel = new KeyEventChannel(this.dartExecutor);
        this.lifecycleChannel = new LifecycleChannel(this.dartExecutor);
        this.localizationChannel = new LocalizationChannel(this.dartExecutor);
        this.navigationChannel = new NavigationChannel(this.dartExecutor);
        this.platformChannel = new PlatformChannel(this.dartExecutor);
        this.settingsChannel = new SettingsChannel(this.dartExecutor);
        this.systemChannel = new SystemChannel(this.dartExecutor);
        this.textInputChannel = new TextInputChannel(this.dartExecutor);
        this.platformViewsController = platformViewsController;
        this.pluginRegistry = new FlutterEnginePluginRegistry(context.getApplicationContext(), this, flutterLoader);
        if (bl) {
            this.registerPlugins();
        }
    }

    public FlutterEngine(Context context, FlutterLoader flutterLoader, FlutterJNI flutterJNI, String[] arrstring, boolean bl) {
        this(context, flutterLoader, flutterJNI, new PlatformViewsController(), arrstring, bl);
    }

    public FlutterEngine(Context context, String[] arrstring) {
        super(context, FlutterLoader.getInstance(), new FlutterJNI(), arrstring, true);
    }

    public FlutterEngine(Context context, String[] arrstring, boolean bl) {
        super(context, FlutterLoader.getInstance(), new FlutterJNI(), arrstring, bl);
    }

    static /* synthetic */ Set access$000(FlutterEngine flutterEngine) {
        return flutterEngine.engineLifecycleListeners;
    }

    static /* synthetic */ PlatformViewsController access$100(FlutterEngine flutterEngine) {
        return flutterEngine.platformViewsController;
    }

    private void attachToJni() {
        Log.v(TAG, "Attaching to JNI.");
        this.flutterJNI.attachToNative(false);
        if (this.isAttachedToJni()) {
            return;
        }
        throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
    }

    private boolean isAttachedToJni() {
        return this.flutterJNI.isAttached();
    }

    private void registerPlugins() {
        try {
            Class.forName((String)"io.flutter.plugins.GeneratedPluginRegistrant").getDeclaredMethod("registerWith", new Class[]{FlutterEngine.class}).invoke(null, new Object[]{this});
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tried to automatically register plugins with FlutterEngine (");
            stringBuilder.append((Object)this);
            stringBuilder.append(") but could not find and invoke the GeneratedPluginRegistrant.");
            Log.w(TAG, stringBuilder.toString());
            return;
        }
    }

    public void addEngineLifecycleListener(EngineLifecycleListener engineLifecycleListener) {
        this.engineLifecycleListeners.add((Object)engineLifecycleListener);
    }

    public void destroy() {
        Log.v(TAG, "Destroying.");
        this.pluginRegistry.destroy();
        this.dartExecutor.onDetachedFromJNI();
        this.flutterJNI.removeEngineLifecycleListener(this.engineLifecycleListener);
        this.flutterJNI.detachFromNativeAndReleaseResources();
    }

    public AccessibilityChannel getAccessibilityChannel() {
        return this.accessibilityChannel;
    }

    public ActivityControlSurface getActivityControlSurface() {
        return this.pluginRegistry;
    }

    public BroadcastReceiverControlSurface getBroadcastReceiverControlSurface() {
        return this.pluginRegistry;
    }

    public ContentProviderControlSurface getContentProviderControlSurface() {
        return this.pluginRegistry;
    }

    public DartExecutor getDartExecutor() {
        return this.dartExecutor;
    }

    public KeyEventChannel getKeyEventChannel() {
        return this.keyEventChannel;
    }

    public LifecycleChannel getLifecycleChannel() {
        return this.lifecycleChannel;
    }

    public LocalizationChannel getLocalizationChannel() {
        return this.localizationChannel;
    }

    public NavigationChannel getNavigationChannel() {
        return this.navigationChannel;
    }

    public PlatformChannel getPlatformChannel() {
        return this.platformChannel;
    }

    public PlatformViewsController getPlatformViewsController() {
        return this.platformViewsController;
    }

    public PluginRegistry getPlugins() {
        return this.pluginRegistry;
    }

    public FlutterRenderer getRenderer() {
        return this.renderer;
    }

    public ServiceControlSurface getServiceControlSurface() {
        return this.pluginRegistry;
    }

    public SettingsChannel getSettingsChannel() {
        return this.settingsChannel;
    }

    public SystemChannel getSystemChannel() {
        return this.systemChannel;
    }

    public TextInputChannel getTextInputChannel() {
        return this.textInputChannel;
    }

    public void removeEngineLifecycleListener(EngineLifecycleListener engineLifecycleListener) {
        this.engineLifecycleListeners.remove((Object)engineLifecycleListener);
    }

    public static interface EngineLifecycleListener {
        public void onPreEngineRestart();
    }

}

