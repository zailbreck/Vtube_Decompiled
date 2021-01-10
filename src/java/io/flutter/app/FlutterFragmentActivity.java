/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  androidx.activity.ComponentActivity
 *  androidx.fragment.app.b
 *  io.flutter.view.FlutterView$Provider
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.b;
import io.flutter.app.FlutterActivityDelegate;
import io.flutter.app.FlutterActivityEvents;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.view.FlutterNativeView;
import io.flutter.view.FlutterView;

public class FlutterFragmentActivity
extends b
implements FlutterView.Provider,
PluginRegistry,
FlutterActivityDelegate.ViewFactory {
    private final FlutterActivityDelegate delegate;
    private final FlutterActivityEvents eventDelegate;
    private final PluginRegistry pluginRegistry;
    private final FlutterView.Provider viewProvider;

    public FlutterFragmentActivity() {
        FlutterActivityDelegate flutterActivityDelegate = this.delegate = new FlutterActivityDelegate((Activity)this, this);
        this.eventDelegate = flutterActivityDelegate;
        this.viewProvider = flutterActivityDelegate;
        this.pluginRegistry = flutterActivityDelegate;
    }

    @Override
    public FlutterNativeView createFlutterNativeView() {
        return null;
    }

    @Override
    public FlutterView createFlutterView(Context context) {
        return null;
    }

    public FlutterView getFlutterView() {
        return this.viewProvider.getFlutterView();
    }

    @Override
    public final boolean hasPlugin(String string) {
        return this.pluginRegistry.hasPlugin(string);
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        if (!this.eventDelegate.onActivityResult(n2, n3, intent)) {
            super.onActivityResult(n2, n3, intent);
        }
    }

    public void onBackPressed() {
        if (!this.eventDelegate.onBackPressed()) {
            ComponentActivity.super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.eventDelegate.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.eventDelegate.onCreate(bundle);
    }

    protected void onDestroy() {
        this.eventDelegate.onDestroy();
        super.onDestroy();
    }

    public void onLowMemory() {
        this.eventDelegate.onLowMemory();
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.eventDelegate.onNewIntent(intent);
    }

    protected void onPause() {
        super.onPause();
        this.eventDelegate.onPause();
    }

    protected void onPostResume() {
        super.onPostResume();
        this.eventDelegate.onPostResume();
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        super.onRequestPermissionsResult(n2, arrstring, arrn);
        this.eventDelegate.onRequestPermissionsResult(n2, arrstring, arrn);
    }

    protected void onStart() {
        super.onStart();
        this.eventDelegate.onStart();
    }

    protected void onStop() {
        this.eventDelegate.onStop();
        super.onStop();
    }

    public void onTrimMemory(int n2) {
        this.eventDelegate.onTrimMemory(n2);
    }

    public void onUserLeaveHint() {
        this.eventDelegate.onUserLeaveHint();
    }

    @Override
    public final PluginRegistry.Registrar registrarFor(String string) {
        return this.pluginRegistry.registrarFor(string);
    }

    @Override
    public boolean retainFlutterNativeView() {
        return false;
    }

    @Override
    public final <T> T valuePublishedByPlugin(String string) {
        return this.pluginRegistry.valuePublishedByPlugin(string);
    }
}

