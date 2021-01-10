/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$ViewDestroyListener
 *  io.flutter.view.FlutterNativeView
 *  java.lang.Object
 */
package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import io.flutter.view.FlutterNativeView;

public final class d
implements PluginRegistry.ViewDestroyListener {
    private final /* synthetic */ VideoPlayerPlugin b;

    public /* synthetic */ d(VideoPlayerPlugin videoPlayerPlugin) {
        this.b = videoPlayerPlugin;
    }

    public final boolean onViewDestroy(FlutterNativeView flutterNativeView) {
        return VideoPlayerPlugin.a(this.b, flutterNativeView);
    }
}

