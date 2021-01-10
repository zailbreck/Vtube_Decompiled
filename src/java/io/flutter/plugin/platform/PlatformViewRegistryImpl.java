/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugin.platform.PlatformViewFactory
 *  io.flutter.plugin.platform.PlatformViewRegistry
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package io.flutter.plugin.platform;

import io.flutter.plugin.platform.PlatformViewFactory;
import io.flutter.plugin.platform.PlatformViewRegistry;
import java.util.HashMap;
import java.util.Map;

class PlatformViewRegistryImpl
implements PlatformViewRegistry {
    private final Map<String, PlatformViewFactory> viewFactories = new HashMap();

    PlatformViewRegistryImpl() {
    }

    PlatformViewFactory getFactory(String string) {
        return (PlatformViewFactory)this.viewFactories.get((Object)string);
    }

    public boolean registerViewFactory(String string, PlatformViewFactory platformViewFactory) {
        if (this.viewFactories.containsKey((Object)string)) {
            return false;
        }
        this.viewFactories.put((Object)string, (Object)platformViewFactory);
        return true;
    }
}

