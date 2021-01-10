/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package io.flutter.embedding.engine.plugins.broadcastreceiver;

import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding;

public interface BroadcastReceiverAware {
    public void onAttachedToBroadcastReceiver(BroadcastReceiverPluginBinding var1);

    public void onDetachedFromBroadcastReceiver();
}

