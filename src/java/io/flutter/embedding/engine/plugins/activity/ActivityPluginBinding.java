/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  java.lang.Object
 */
package io.flutter.embedding.engine.plugins.activity;

import android.app.Activity;
import android.os.Bundle;
import io.flutter.plugin.common.PluginRegistry;

public interface ActivityPluginBinding {
    public void addActivityResultListener(PluginRegistry.ActivityResultListener var1);

    public void addOnNewIntentListener(PluginRegistry.NewIntentListener var1);

    public void addOnSaveStateListener(OnSaveInstanceStateListener var1);

    public void addOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener var1);

    public void addRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener var1);

    public Activity getActivity();

    public Object getLifecycle();

    public void removeActivityResultListener(PluginRegistry.ActivityResultListener var1);

    public void removeOnNewIntentListener(PluginRegistry.NewIntentListener var1);

    public void removeOnSaveStateListener(OnSaveInstanceStateListener var1);

    public void removeOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener var1);

    public void removeRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener var1);

    public static interface OnSaveInstanceStateListener {
        public void onRestoreInstanceState(Bundle var1);

        public void onSaveInstanceState(Bundle var1);
    }

}

