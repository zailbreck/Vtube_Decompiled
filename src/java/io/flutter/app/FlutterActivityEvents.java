/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks2
 *  android.content.Intent
 *  android.os.Bundle
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$ActivityResultListener
 *  io.flutter.plugin.common.PluginRegistry$RequestPermissionsResultListener
 *  java.lang.Object
 */
package io.flutter.app;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Bundle;
import io.flutter.plugin.common.PluginRegistry;

public interface FlutterActivityEvents
extends ComponentCallbacks2,
PluginRegistry.ActivityResultListener,
PluginRegistry.RequestPermissionsResultListener {
    public boolean onBackPressed();

    public void onCreate(Bundle var1);

    public void onDestroy();

    public void onNewIntent(Intent var1);

    public void onPause();

    public void onPostResume();

    public void onResume();

    public void onStart();

    public void onStop();

    public void onUserLeaveHint();
}

