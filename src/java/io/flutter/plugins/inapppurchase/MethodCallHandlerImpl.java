/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Log
 *  com.android.billingclient.api.a
 *  com.android.billingclient.api.a$b
 *  com.android.billingclient.api.b
 *  com.android.billingclient.api.d
 *  com.android.billingclient.api.e
 *  com.android.billingclient.api.f
 *  com.android.billingclient.api.f$b
 *  com.android.billingclient.api.g
 *  com.android.billingclient.api.i
 *  com.android.billingclient.api.i$b
 *  com.android.billingclient.api.j
 *  com.android.billingclient.api.k
 *  com.android.billingclient.api.k$a
 *  com.android.billingclient.api.m
 *  com.android.billingclient.api.n
 *  com.android.billingclient.api.p
 *  com.android.billingclient.api.q
 *  com.android.billingclient.api.q$b
 *  com.android.billingclient.api.r
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  io.flutter.plugins.inapppurchase.BillingClientFactory
 *  io.flutter.plugins.inapppurchase.Translator
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.List
 */
package io.flutter.plugins.inapppurchase;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.a;
import com.android.billingclient.api.b;
import com.android.billingclient.api.d;
import com.android.billingclient.api.e;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import com.android.billingclient.api.i;
import com.android.billingclient.api.j;
import com.android.billingclient.api.k;
import com.android.billingclient.api.m;
import com.android.billingclient.api.n;
import com.android.billingclient.api.p;
import com.android.billingclient.api.q;
import com.android.billingclient.api.r;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.inapppurchase.BillingClientFactory;
import io.flutter.plugins.inapppurchase.Translator;
import java.util.HashMap;
import java.util.List;

class MethodCallHandlerImpl
implements MethodChannel.MethodCallHandler,
Application.ActivityLifecycleCallbacks {
    private static final String TAG = "InAppPurchasePlugin";
    private Activity activity;
    private final Context applicationContext;
    private d billingClient;
    private final BillingClientFactory billingClientFactory;
    private HashMap<String, p> cachedSkus = new HashMap();
    private final MethodChannel methodChannel;

    MethodCallHandlerImpl(Activity activity, Context context, MethodChannel methodChannel, BillingClientFactory billingClientFactory) {
        this.billingClientFactory = billingClientFactory;
        this.applicationContext = context;
        this.activity = activity;
        this.methodChannel = methodChannel;
    }

    private void acknowledgePurchase(String string, String string2, final MethodChannel.Result result) {
        if (MethodCallHandlerImpl.super.billingClientError(result)) {
            return;
        }
        a.b b2 = a.c();
        b2.a(string2);
        b2.b(string);
        a a2 = b2.a();
        this.billingClient.a(a2, new b(){

            public void onAcknowledgePurchaseResponse(g g2) {
                result.success((Object)Translator.fromBillingResult((g)g2));
            }
        });
    }

    private boolean billingClientError(MethodChannel.Result result) {
        if (this.billingClient != null) {
            return false;
        }
        result.error("UNAVAILABLE", "BillingClient is unset. Try reconnecting.", null);
        return true;
    }

    private void consumeAsync(String string, String string2, final MethodChannel.Result result) {
        if (MethodCallHandlerImpl.super.billingClientError(result)) {
            return;
        }
        j j2 = new j(){

            public void onConsumeResponse(g g2, String string) {
                result.success((Object)Translator.fromBillingResult((g)g2));
            }
        };
        i.b b2 = i.c();
        b2.b(string);
        if (string2 != null) {
            b2.a(string2);
        }
        i i2 = b2.a();
        this.billingClient.a(i2, j2);
    }

    private void endBillingClientConnection() {
        d d2 = this.billingClient;
        if (d2 != null) {
            d2.a();
            this.billingClient = null;
        }
    }

    private void endConnection(MethodChannel.Result result) {
        MethodCallHandlerImpl.super.endBillingClientConnection();
        result.success(null);
    }

    private void isReady(MethodChannel.Result result) {
        if (MethodCallHandlerImpl.super.billingClientError(result)) {
            return;
        }
        result.success((Object)this.billingClient.b());
    }

    private void launchBillingFlow(String string, String string2, MethodChannel.Result result) {
        if (MethodCallHandlerImpl.super.billingClientError(result)) {
            return;
        }
        p p2 = (p)this.cachedSkus.get((Object)string);
        if (p2 == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Details for sku ");
            stringBuilder.append(string);
            stringBuilder.append(" are not available. Has this ID already been fetched?");
            result.error("NOT_FOUND", stringBuilder.toString(), null);
            return;
        }
        if (this.activity == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Details for sku ");
            stringBuilder.append(string);
            stringBuilder.append(" are not available. This method must be run with the app in foreground.");
            result.error("ACTIVITY_UNAVAILABLE", stringBuilder.toString(), null);
            return;
        }
        f.b b2 = f.j();
        b2.a(p2);
        if (string2 != null && !string2.isEmpty()) {
            b2.a(string2);
        }
        result.success((Object)Translator.fromBillingResult((g)this.billingClient.a(this.activity, b2.a())));
    }

    private void queryPurchaseHistoryAsync(String string, final MethodChannel.Result result) {
        if (MethodCallHandlerImpl.super.billingClientError(result)) {
            return;
        }
        this.billingClient.a(string, new n(){

            public void onPurchaseHistoryResponse(g g2, List<m> list) {
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"billingResult", (Object)Translator.fromBillingResult((g)g2));
                hashMap.put((Object)"purchaseHistoryRecordList", (Object)Translator.fromPurchaseHistoryRecordList(list));
                result.success((Object)hashMap);
            }
        });
    }

    private void queryPurchases(String string, MethodChannel.Result result) {
        if (MethodCallHandlerImpl.super.billingClientError(result)) {
            return;
        }
        result.success((Object)Translator.fromPurchasesResult((k.a)this.billingClient.a(string)));
    }

    private void querySkuDetailsAsync(String string, List<String> list, final MethodChannel.Result result) {
        if (MethodCallHandlerImpl.super.billingClientError(result)) {
            return;
        }
        q.b b2 = q.c();
        b2.a(string);
        b2.a(list);
        q q2 = b2.a();
        this.billingClient.a(q2, new r(){

            public void onSkuDetailsResponse(g g2, List<p> list) {
                MethodCallHandlerImpl.this.updateCachedSkus((List<p>)list);
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"billingResult", (Object)Translator.fromBillingResult((g)g2));
                hashMap.put((Object)"skuDetailsList", (Object)Translator.fromSkuDetailsList(list));
                result.success((Object)hashMap);
            }
        });
    }

    private void startConnection(final int n2, boolean bl, final MethodChannel.Result result) {
        if (this.billingClient == null) {
            this.billingClient = this.billingClientFactory.createBillingClient(this.applicationContext, this.methodChannel, bl);
        }
        this.billingClient.a(new e(){
            private boolean alreadyFinished = false;

            public void onBillingServiceDisconnected() {
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"handle", (Object)n2);
                MethodCallHandlerImpl.this.methodChannel.invokeMethod("BillingClientStateListener#onBillingServiceDisconnected()", (Object)hashMap);
            }

            public void onBillingSetupFinished(g g2) {
                if (this.alreadyFinished) {
                    Log.d((String)MethodCallHandlerImpl.TAG, (String)"Tried to call onBilllingSetupFinished multiple times.");
                    return;
                }
                this.alreadyFinished = true;
                result.success((Object)Translator.fromBillingResult((g)g2));
            }
        });
    }

    private void updateCachedSkus(List<p> list) {
        if (list == null) {
            return;
        }
        for (p p2 : list) {
            this.cachedSkus.put((Object)p2.l(), (Object)p2);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        Context context;
        if (this.activity == activity && (context = this.applicationContext) != null) {
            ((Application)context).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
            MethodCallHandlerImpl.super.endBillingClientConnection();
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    void onDetachedFromActivity() {
        this.endBillingClientConnection();
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        int n2;
        block22 : {
            String string = methodCall.method;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1984747959: {
                    if (!string.equals((Object)"BillingClient#queryPurchases(String)")) break;
                    n2 = 5;
                    break block22;
                }
                case 1792566365: {
                    if (!string.equals((Object)"BillingClient#endConnection()")) break;
                    n2 = 2;
                    break block22;
                }
                case 494138664: {
                    if (!string.equals((Object)"BillingClient#consumeAsync(String, ConsumeResponseListener)")) break;
                    n2 = 7;
                    break block22;
                }
                case -40639596: {
                    if (!string.equals((Object)"BillingClient#querySkuDetailsAsync(SkuDetailsParams, SkuDetailsResponseListener)")) break;
                    n2 = 3;
                    break block22;
                }
                case -147687227: {
                    if (!string.equals((Object)"BillingClient#startConnection(BillingClientStateListener)")) break;
                    n2 = 1;
                    break block22;
                }
                case -559727558: {
                    if (!string.equals((Object)"BillingClient#queryPurchaseHistoryAsync(String, PurchaseHistoryResponseListener)")) break;
                    n2 = 6;
                    break block22;
                }
                case -1308170612: {
                    if (!string.equals((Object)"BillingClient#launchBillingFlow(Activity, BillingFlowParams)")) break;
                    n2 = 4;
                    break block22;
                }
                case -1785095395: {
                    if (!string.equals((Object)"BillingClient#isReady()")) break;
                    n2 = 0;
                    break block22;
                }
                case -2134967352: {
                    if (!string.equals((Object)"BillingClient#(AcknowledgePurchaseParams params, (AcknowledgePurchaseParams, AcknowledgePurchaseResponseListener)")) break;
                    n2 = 8;
                    break block22;
                }
            }
            n2 = -1;
        }
        switch (n2) {
            default: {
                result.notImplemented();
                return;
            }
            case 8: {
                MethodCallHandlerImpl.super.acknowledgePurchase((String)methodCall.argument("purchaseToken"), (String)methodCall.argument("developerPayload"), result);
                return;
            }
            case 7: {
                MethodCallHandlerImpl.super.consumeAsync((String)methodCall.argument("purchaseToken"), (String)methodCall.argument("developerPayload"), result);
                return;
            }
            case 6: {
                MethodCallHandlerImpl.super.queryPurchaseHistoryAsync((String)methodCall.argument("skuType"), result);
                return;
            }
            case 5: {
                MethodCallHandlerImpl.super.queryPurchases((String)methodCall.argument("skuType"), result);
                return;
            }
            case 4: {
                MethodCallHandlerImpl.super.launchBillingFlow((String)methodCall.argument("sku"), (String)methodCall.argument("accountId"), result);
                return;
            }
            case 3: {
                MethodCallHandlerImpl.super.querySkuDetailsAsync((String)methodCall.argument("skuType"), (List<String>)((List)methodCall.argument("skusList")), result);
                return;
            }
            case 2: {
                MethodCallHandlerImpl.super.endConnection(result);
                return;
            }
            case 1: {
                MethodCallHandlerImpl.super.startConnection((Integer)methodCall.argument("handle"), (Boolean)methodCall.argument("enablePendingPurchases"), result);
                return;
            }
            case 0: 
        }
        MethodCallHandlerImpl.super.isReady(result);
    }

    void setActivity(Activity activity) {
        this.activity = activity;
    }

}

