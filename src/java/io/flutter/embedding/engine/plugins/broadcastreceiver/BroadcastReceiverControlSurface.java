/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  androidx.lifecycle.e
 *  java.lang.Object
 */
package io.flutter.embedding.engine.plugins.broadcastreceiver;

import android.content.BroadcastReceiver;
import androidx.lifecycle.e;

public interface BroadcastReceiverControlSurface {
    public void attachToBroadcastReceiver(BroadcastReceiver var1, e var2);

    public void detachFromBroadcastReceiver();
}

