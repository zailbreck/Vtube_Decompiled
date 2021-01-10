/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.android.billingclient.api.d
 *  java.lang.Object
 */
package io.flutter.plugins.inapppurchase;

import android.content.Context;
import com.android.billingclient.api.d;
import io.flutter.plugin.common.MethodChannel;

interface BillingClientFactory {
    public d createBillingClient(Context var1, MethodChannel var2, boolean var3);
}

