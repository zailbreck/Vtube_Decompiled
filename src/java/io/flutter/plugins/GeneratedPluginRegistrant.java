/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 *  io.flutter.plugins.webviewflutter.WebViewFlutterPlugin
 *  java.lang.Object
 *  java.lang.String
 *  n.a.a.a
 *  sk.fourq.otaupdate.a
 */
package io.flutter.plugins;

import androidx.annotation.Keep;
import f.g.a.g;
import g.a.c;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.PluginRegistry;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.inapppurchase.InAppPurchasePlugin;
import io.flutter.plugins.packageinfo.PackageInfoPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.share.SharePlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import io.flutter.plugins.webviewflutter.WebViewFlutterPlugin;
import sk.fourq.otaupdate.a;

@Keep
public final class GeneratedPluginRegistrant {
    public static void registerWith(FlutterEngine flutterEngine) {
        ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
        flutterEngine.getPlugins().add(new f.c.a.c());
        flutterEngine.getPlugins().add(new g());
        flutterEngine.getPlugins().add(new h.a.a.a.a.a());
        ImagePickerPlugin.registerWith(shimPluginRegistry.registrarFor("io.flutter.plugins.imagepicker.ImagePickerPlugin"));
        flutterEngine.getPlugins().add(new InAppPurchasePlugin());
        a.a((PluginRegistry.Registrar)shimPluginRegistry.registrarFor("sk.fourq.otaupdate.OtaUpdatePlugin"));
        flutterEngine.getPlugins().add(new PackageInfoPlugin());
        flutterEngine.getPlugins().add(new PathProviderPlugin());
        flutterEngine.getPlugins().add(new SharePlugin());
        SharedPreferencesPlugin.registerWith(shimPluginRegistry.registrarFor("io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin"));
        flutterEngine.getPlugins().add(new f.h.a.c());
        flutterEngine.getPlugins().add(new UrlLauncherPlugin());
        flutterEngine.getPlugins().add(new VideoPlayerPlugin());
        n.a.a.a.a((PluginRegistry.Registrar)shimPluginRegistry.registrarFor("xyz.justsoft.video_thumbnail.VideoThumbnailPlugin"));
        flutterEngine.getPlugins().add(new c());
        flutterEngine.getPlugins().add((FlutterPlugin)new WebViewFlutterPlugin());
    }
}

