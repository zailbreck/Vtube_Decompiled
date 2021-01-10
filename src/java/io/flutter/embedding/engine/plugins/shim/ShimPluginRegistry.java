/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.Log
 *  io.flutter.embedding.engine.FlutterEngine
 *  io.flutter.embedding.engine.plugins.FlutterPlugin
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding
 *  io.flutter.embedding.engine.plugins.PluginRegistry
 *  io.flutter.embedding.engine.plugins.activity.ActivityAware
 *  io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
 *  io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry$1
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$Registrar
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 */
package io.flutter.embedding.engine.plugins.shim;

import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.PluginRegistry;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;
import io.flutter.embedding.engine.plugins.shim.ShimRegistrar;
import io.flutter.plugin.common.PluginRegistry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ShimPluginRegistry
implements io.flutter.plugin.common.PluginRegistry {
    private static final String TAG = "ShimPluginRegistry";
    private final FlutterEngine flutterEngine;
    private final Map<String, Object> pluginMap = new HashMap();
    private final ShimRegistrarAggregate shimRegistrarAggregate;

    public ShimPluginRegistry(FlutterEngine flutterEngine) {
        this.flutterEngine = flutterEngine;
        this.shimRegistrarAggregate = new ShimRegistrarAggregate(null);
        this.flutterEngine.getPlugins().add((FlutterPlugin)this.shimRegistrarAggregate);
    }

    public boolean hasPlugin(String string) {
        return this.pluginMap.containsKey((Object)string);
    }

    public PluginRegistry.Registrar registrarFor(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Creating plugin Registrar for '");
        stringBuilder.append(string);
        stringBuilder.append("'");
        Log.v((String)TAG, (String)stringBuilder.toString());
        if (!this.pluginMap.containsKey((Object)string)) {
            this.pluginMap.put((Object)string, null);
            ShimRegistrar shimRegistrar = new ShimRegistrar(string, this.pluginMap);
            this.shimRegistrarAggregate.addPlugin(shimRegistrar);
            return shimRegistrar;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Plugin key ");
        stringBuilder2.append(string);
        stringBuilder2.append(" is already in use");
        throw new IllegalStateException(stringBuilder2.toString());
    }

    public <T> T valuePublishedByPlugin(String string) {
        return (T)this.pluginMap.get((Object)string);
    }

    private static class ShimRegistrarAggregate
    implements FlutterPlugin,
    ActivityAware {
        private ActivityPluginBinding activityPluginBinding;
        private FlutterPlugin.FlutterPluginBinding flutterPluginBinding;
        private final Set<ShimRegistrar> shimRegistrars;

        private ShimRegistrarAggregate() {
            this.shimRegistrars = new HashSet();
        }

        /* synthetic */ ShimRegistrarAggregate(1 var1) {
        }

        public void addPlugin(ShimRegistrar shimRegistrar) {
            ActivityPluginBinding activityPluginBinding;
            this.shimRegistrars.add((Object)shimRegistrar);
            FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.flutterPluginBinding;
            if (flutterPluginBinding != null) {
                shimRegistrar.onAttachedToEngine(flutterPluginBinding);
            }
            if ((activityPluginBinding = this.activityPluginBinding) != null) {
                shimRegistrar.onAttachedToActivity(activityPluginBinding);
            }
        }

        public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
            this.activityPluginBinding = activityPluginBinding;
            Iterator iterator = this.shimRegistrars.iterator();
            while (iterator.hasNext()) {
                ((ShimRegistrar)iterator.next()).onAttachedToActivity(activityPluginBinding);
            }
        }

        public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
            this.flutterPluginBinding = flutterPluginBinding;
            Iterator iterator = this.shimRegistrars.iterator();
            while (iterator.hasNext()) {
                ((ShimRegistrar)iterator.next()).onAttachedToEngine(flutterPluginBinding);
            }
        }

        public void onDetachedFromActivity() {
            Iterator iterator = this.shimRegistrars.iterator();
            while (iterator.hasNext()) {
                ((ShimRegistrar)iterator.next()).onDetachedFromActivity();
            }
            this.activityPluginBinding = null;
        }

        public void onDetachedFromActivityForConfigChanges() {
            Iterator iterator = this.shimRegistrars.iterator();
            while (iterator.hasNext()) {
                ((ShimRegistrar)iterator.next()).onDetachedFromActivity();
            }
            this.activityPluginBinding = null;
        }

        public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
            Iterator iterator = this.shimRegistrars.iterator();
            while (iterator.hasNext()) {
                ((ShimRegistrar)iterator.next()).onDetachedFromEngine(flutterPluginBinding);
            }
            this.flutterPluginBinding = null;
            this.activityPluginBinding = null;
        }

        public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
            this.activityPluginBinding = activityPluginBinding;
            Iterator iterator = this.shimRegistrars.iterator();
            while (iterator.hasNext()) {
                ((ShimRegistrar)iterator.next()).onReattachedToActivityForConfigChanges(activityPluginBinding);
            }
        }
    }

}

