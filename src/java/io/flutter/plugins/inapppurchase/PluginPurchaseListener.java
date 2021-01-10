/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.g
 *  com.android.billingclient.api.k
 *  com.android.billingclient.api.o
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugins.inapppurchase.Translator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 */
package io.flutter.plugins.inapppurchase;

import com.android.billingclient.api.g;
import com.android.billingclient.api.k;
import com.android.billingclient.api.o;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.inapppurchase.Translator;
import java.util.HashMap;
import java.util.List;

class PluginPurchaseListener
implements o {
    private final MethodChannel channel;

    PluginPurchaseListener(MethodChannel methodChannel) {
        this.channel = methodChannel;
    }

    public void onPurchasesUpdated(g g2, List<k> list) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"billingResult", (Object)Translator.fromBillingResult((g)g2));
        hashMap.put((Object)"responseCode", (Object)g2.b());
        hashMap.put((Object)"purchasesList", (Object)Translator.fromPurchasesList(list));
        this.channel.invokeMethod("PurchasesUpdatedListener#onPurchasesUpdated(int, List<Purchase>)", (Object)hashMap);
    }
}

