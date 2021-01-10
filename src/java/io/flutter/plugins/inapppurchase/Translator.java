/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.g
 *  com.android.billingclient.api.k
 *  com.android.billingclient.api.k$a
 *  com.android.billingclient.api.m
 *  com.android.billingclient.api.p
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 */
package io.flutter.plugins.inapppurchase;

import com.android.billingclient.api.g;
import com.android.billingclient.api.k;
import com.android.billingclient.api.m;
import com.android.billingclient.api.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class Translator {
    Translator() {
    }

    static HashMap<String, Object> fromBillingResult(g g2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"responseCode", (Object)g2.b());
        hashMap.put((Object)"debugMessage", (Object)g2.a());
        return hashMap;
    }

    static HashMap<String, Object> fromPurchase(k k2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"orderId", (Object)k2.b());
        hashMap.put((Object)"packageName", (Object)k2.d());
        hashMap.put((Object)"purchaseTime", (Object)k2.f());
        hashMap.put((Object)"purchaseToken", (Object)k2.g());
        hashMap.put((Object)"signature", (Object)k2.h());
        hashMap.put((Object)"sku", (Object)k2.i());
        hashMap.put((Object)"isAutoRenewing", (Object)k2.k());
        hashMap.put((Object)"originalJson", (Object)k2.c());
        hashMap.put((Object)"developerPayload", (Object)k2.a());
        hashMap.put((Object)"isAcknowledged", (Object)k2.j());
        hashMap.put((Object)"purchaseState", (Object)k2.e());
        return hashMap;
    }

    static HashMap<String, Object> fromPurchaseHistoryRecord(m m2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"purchaseTime", (Object)m2.c());
        hashMap.put((Object)"purchaseToken", (Object)m2.d());
        hashMap.put((Object)"signature", (Object)m2.e());
        hashMap.put((Object)"sku", (Object)m2.f());
        hashMap.put((Object)"developerPayload", (Object)m2.a());
        hashMap.put((Object)"originalJson", (Object)m2.b());
        return hashMap;
    }

    static List<HashMap<String, Object>> fromPurchaseHistoryRecordList(List<m> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arrayList.add(Translator.fromPurchaseHistoryRecord((m)iterator.next()));
        }
        return arrayList;
    }

    static List<HashMap<String, Object>> fromPurchasesList(List<k> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arrayList.add(Translator.fromPurchase((k)iterator.next()));
        }
        return arrayList;
    }

    static HashMap<String, Object> fromPurchasesResult(k.a a2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"responseCode", (Object)a2.c());
        hashMap.put((Object)"billingResult", Translator.fromBillingResult(a2.a()));
        hashMap.put((Object)"purchasesList", Translator.fromPurchasesList((List<k>)a2.b()));
        return hashMap;
    }

    static HashMap<String, Object> fromSkuDetail(p p2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"title", (Object)p2.o());
        hashMap.put((Object)"description", (Object)p2.a());
        hashMap.put((Object)"freeTrialPeriod", (Object)p2.b());
        hashMap.put((Object)"introductoryPrice", (Object)p2.c());
        hashMap.put((Object)"introductoryPriceAmountMicros", (Object)p2.d());
        hashMap.put((Object)"introductoryPriceCycles", (Object)p2.e());
        hashMap.put((Object)"introductoryPricePeriod", (Object)p2.f());
        hashMap.put((Object)"price", (Object)p2.i());
        hashMap.put((Object)"priceAmountMicros", (Object)p2.j());
        hashMap.put((Object)"priceCurrencyCode", (Object)p2.k());
        hashMap.put((Object)"sku", (Object)p2.l());
        hashMap.put((Object)"type", (Object)p2.p());
        hashMap.put((Object)"isRewarded", (Object)p2.q());
        hashMap.put((Object)"subscriptionPeriod", (Object)p2.n());
        hashMap.put((Object)"originalPrice", (Object)p2.g());
        hashMap.put((Object)"originalPriceAmountMicros", (Object)p2.h());
        return hashMap;
    }

    static List<HashMap<String, Object>> fromSkuDetailsList(List<p> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arrayList.add(Translator.fromSkuDetail((p)iterator.next()));
        }
        return arrayList;
    }
}

