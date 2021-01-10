/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  java.lang.Object
 */
package io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import io.flutter.embedding.engine.plugins.service.ServiceAware;

public interface ServicePluginBinding {
    public void addOnModeChangeListener(ServiceAware.OnModeChangeListener var1);

    public Object getLifecycle();

    public Service getService();

    public void removeOnModeChangeListener(ServiceAware.OnModeChangeListener var1);
}

