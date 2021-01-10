/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package io.flutter.embedding.engine.plugins.service;

import io.flutter.embedding.engine.plugins.service.ServicePluginBinding;

public interface ServiceAware {
    public void onAttachedToService(ServicePluginBinding var1);

    public void onDetachedFromService();

    public static interface OnModeChangeListener {
        public void onMoveToBackground();

        public void onMoveToForeground();
    }

}

