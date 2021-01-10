/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$Registrar
 *  io.flutter.plugins.videoplayer.VideoPlayerPlugin$KeyForAssetFn
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;

public final class c
implements VideoPlayerPlugin.KeyForAssetFn {
    private final /* synthetic */ PluginRegistry.Registrar a;

    public /* synthetic */ c(PluginRegistry.Registrar registrar) {
        this.a = registrar;
    }

    public final String get(String string) {
        return this.a.lookupKeyForAsset(string);
    }
}

