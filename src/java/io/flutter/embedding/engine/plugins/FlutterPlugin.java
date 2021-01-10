/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  io.flutter.view.TextureRegistry
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.embedding.engine.plugins;

import android.content.Context;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.view.TextureRegistry;

public interface FlutterPlugin {
    public void onAttachedToEngine(FlutterPluginBinding var1);

    public void onDetachedFromEngine(FlutterPluginBinding var1);

    public static interface FlutterAssets {
        public String getAssetFilePathByName(String var1);

        public String getAssetFilePathByName(String var1, String var2);

        public String getAssetFilePathBySubpath(String var1);

        public String getAssetFilePathBySubpath(String var1, String var2);
    }

    public static class FlutterPluginBinding {
        private final Context applicationContext;
        private final BinaryMessenger binaryMessenger;
        private final FlutterAssets flutterAssets;
        private final FlutterEngine flutterEngine;
        private final PlatformViewRegistry platformViewRegistry;
        private final TextureRegistry textureRegistry;

        public FlutterPluginBinding(Context context, FlutterEngine flutterEngine, BinaryMessenger binaryMessenger, TextureRegistry textureRegistry, PlatformViewRegistry platformViewRegistry, FlutterAssets flutterAssets) {
            this.applicationContext = context;
            this.flutterEngine = flutterEngine;
            this.binaryMessenger = binaryMessenger;
            this.textureRegistry = textureRegistry;
            this.platformViewRegistry = platformViewRegistry;
            this.flutterAssets = flutterAssets;
        }

        public Context getApplicationContext() {
            return this.applicationContext;
        }

        public BinaryMessenger getBinaryMessenger() {
            return this.binaryMessenger;
        }

        public FlutterAssets getFlutterAssets() {
            return this.flutterAssets;
        }

        @Deprecated
        public FlutterEngine getFlutterEngine() {
            return this.flutterEngine;
        }

        public PlatformViewRegistry getPlatformViewRegistry() {
            return this.platformViewRegistry;
        }

        public TextureRegistry getTextureRegistry() {
            return this.textureRegistry;
        }
    }

}

