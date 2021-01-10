/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package io.flutter.embedding.engine.plugins.activity;

import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;

public interface ActivityAware {
    public void onAttachedToActivity(ActivityPluginBinding var1);

    public void onDetachedFromActivity();

    public void onDetachedFromActivityForConfigChanges();

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding var1);
}

