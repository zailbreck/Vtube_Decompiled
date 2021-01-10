/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  androidx.lifecycle.e
 *  java.lang.Object
 */
package io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import androidx.lifecycle.e;

public interface ServiceControlSurface {
    public void attachToService(Service var1, e var2, boolean var3);

    public void detachFromService();

    public void onMoveToBackground();

    public void onMoveToForeground();
}

