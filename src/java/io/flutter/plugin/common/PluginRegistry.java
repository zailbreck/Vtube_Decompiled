/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  io.flutter.view.FlutterNativeView
 *  io.flutter.view.FlutterView
 *  io.flutter.view.TextureRegistry
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.plugin.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.view.FlutterNativeView;
import io.flutter.view.FlutterView;
import io.flutter.view.TextureRegistry;

public interface PluginRegistry {
    public boolean hasPlugin(String var1);

    public Registrar registrarFor(String var1);

    public <T> T valuePublishedByPlugin(String var1);

    public static interface ActivityResultListener {
        public boolean onActivityResult(int var1, int var2, Intent var3);
    }

    public static interface NewIntentListener {
        public boolean onNewIntent(Intent var1);
    }

    public static interface PluginRegistrantCallback {
        public void registerWith(PluginRegistry var1);
    }

    public static interface Registrar {
        public Context activeContext();

        public Activity activity();

        public Registrar addActivityResultListener(ActivityResultListener var1);

        public Registrar addNewIntentListener(NewIntentListener var1);

        public Registrar addRequestPermissionsResultListener(RequestPermissionsResultListener var1);

        public Registrar addUserLeaveHintListener(UserLeaveHintListener var1);

        public Registrar addViewDestroyListener(ViewDestroyListener var1);

        public Context context();

        public String lookupKeyForAsset(String var1);

        public String lookupKeyForAsset(String var1, String var2);

        public BinaryMessenger messenger();

        public PlatformViewRegistry platformViewRegistry();

        public Registrar publish(Object var1);

        public TextureRegistry textures();

        public FlutterView view();
    }

    public static interface RequestPermissionsResultListener {
        public boolean onRequestPermissionsResult(int var1, String[] var2, int[] var3);
    }

    public static interface UserLeaveHintListener {
        public void onUserLeaveHint();
    }

    public static interface ViewDestroyListener {
        public boolean onViewDestroy(FlutterNativeView var1);
    }

}

