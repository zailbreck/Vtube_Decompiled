/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package io.flutter.embedding.engine;

import io.flutter.embedding.engine.FlutterEngine;
import java.util.HashMap;
import java.util.Map;

public class FlutterEngineCache {
    private static FlutterEngineCache instance;
    private final Map<String, FlutterEngine> cachedEngines = new HashMap();

    FlutterEngineCache() {
    }

    public static FlutterEngineCache getInstance() {
        if (instance == null) {
            instance = new FlutterEngineCache();
        }
        return instance;
    }

    public boolean contains(String string2) {
        return this.cachedEngines.containsKey((Object)string2);
    }

    public FlutterEngine get(String string2) {
        return (FlutterEngine)this.cachedEngines.get((Object)string2);
    }

    public void put(String string2, FlutterEngine flutterEngine) {
        if (flutterEngine != null) {
            this.cachedEngines.put((Object)string2, (Object)flutterEngine);
            return;
        }
        this.cachedEngines.remove((Object)string2);
    }

    public void remove(String string2) {
        this.put(string2, null);
    }
}

