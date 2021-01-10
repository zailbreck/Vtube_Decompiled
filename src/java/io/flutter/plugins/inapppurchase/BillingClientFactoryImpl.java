/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.android.billingclient.api.d
 *  com.android.billingclient.api.d$b
 *  com.android.billingclient.api.o
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugins.inapppurchase.BillingClientFactory
 *  java.lang.Object
 */
package io.flutter.plugins.inapppurchase;

import android.content.Context;
import com.android.billingclient.api.d;
import com.android.billingclient.api.o;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.inapppurchase.BillingClientFactory;
import io.flutter.plugins.inapppurchase.PluginPurchaseListener;

final class BillingClientFactoryImpl
implements BillingClientFactory {
    BillingClientFactoryImpl() {
    }

    public d createBillingClient(Context context, MethodChannel methodChannel, boolean bl) {
        d.b b2 = d.a((Context)context);
        if (bl) {
            b2.b();
        }
        b2.a((o)new PluginPurchaseListener(methodChannel));
        return b2.a();
    }
}

