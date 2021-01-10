/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Set
 */
package io.flutter.embedding.engine.plugins;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.util.Set;

public interface PluginRegistry {
    public void add(FlutterPlugin var1);

    public void add(Set<FlutterPlugin> var1);

    public FlutterPlugin get(Class<? extends FlutterPlugin> var1);

    public boolean has(Class<? extends FlutterPlugin> var1);

    public void remove(Class<? extends FlutterPlugin> var1);

    public void remove(Set<Class<? extends FlutterPlugin>> var1);

    public void removeAll();
}

