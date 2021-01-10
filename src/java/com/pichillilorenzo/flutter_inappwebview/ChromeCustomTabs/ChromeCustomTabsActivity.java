/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.net.Uri
 *  android.os.Bundle
 *  com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ActionBroadcastReceiver
 *  com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.b$a
 *  com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.c
 *  e.c.b.b
 *  e.c.b.d
 *  e.c.b.d$a
 *  e.c.b.f
 *  java.io.Serializable
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ActionBroadcastReceiver;
import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.b;
import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.c;
import e.c.b.d;
import e.c.b.f;
import f.g.a.n;
import f.g.a.q;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChromeCustomTabsActivity
extends Activity
implements MethodChannel.MethodCallHandler {
    public MethodChannel b;
    public String c;
    public d.a d;
    public com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.a e;
    public com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.b f;
    public f g;
    protected boolean h = false;
    protected boolean i = false;

    private PendingIntent a(int n2) {
        Intent intent = new Intent((Context)this, ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putInt("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_ID", n2);
        bundle.putString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_UUID", this.c);
        intent.putExtras(bundle);
        return PendingIntent.getBroadcast((Context)this, (int)n2, (Intent)intent, (int)0);
    }

    private void a(d d2) {
        String string2 = this.e.f;
        if (string2 != null) {
            d2.a.setPackage(string2);
        } else {
            d2.a.setPackage(c.a((Context)this));
        }
        if (this.e.g.booleanValue()) {
            c.a((Context)this, (Intent)d2.a);
        }
    }

    private void a(List<HashMap<String, Object>> list) {
        if (this.e.a.booleanValue()) {
            this.d.a();
        }
        if (!this.e.c.isEmpty()) {
            this.d.a(Color.parseColor((String)this.e.c));
        }
        this.d.b(this.e.b.booleanValue());
        if (this.e.d.booleanValue()) {
            this.d.c();
        }
        this.d.a(this.e.e.booleanValue());
        for (HashMap hashMap : list) {
            int n2 = (Integer)hashMap.get((Object)"id");
            String string2 = (String)hashMap.get((Object)"label");
            this.d.a(string2, ChromeCustomTabsActivity.super.a(n2));
        }
    }

    public void a() {
        this.g = null;
        this.finish();
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"uuid", (Object)this.c);
        this.b.invokeMethod("onChromeSafariBrowserClosed", (Object)hashMap);
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        if (n2 == 100) {
            this.a();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(n.chrome_custom_tabs_layout);
        Bundle bundle2 = this.getIntent().getExtras();
        this.c = bundle2.getString("uuid");
        BinaryMessenger binaryMessenger = q.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.pichillilorenzo/flutter_chromesafaribrowser_");
        stringBuilder.append(this.c);
        this.b = new MethodChannel(binaryMessenger, stringBuilder.toString());
        this.b.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
        final String string2 = bundle2.getString("url");
        this.e = new com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.a();
        this.e.a((Map<String, Object>)((HashMap)bundle2.getSerializable("options")));
        final List list = (List)bundle2.getSerializable("menuItemList");
        this.f = new com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.b();
        this.f.a(new b.a((ChromeCustomTabsActivity)this){
            final /* synthetic */ ChromeCustomTabsActivity c;
            {
                this.c = chromeCustomTabsActivity2;
            }

            public void a() {
                this.c.a();
            }

            public void b() {
                ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
                chromeCustomTabsActivity.g = chromeCustomTabsActivity.f.b();
                Uri uri = Uri.parse((String)string2);
                ChromeCustomTabsActivity.this.f.a(uri, null, null);
                ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
                chromeCustomTabsActivity2.d = new d.a(chromeCustomTabsActivity2.g);
                ChromeCustomTabsActivity.this.a((List<HashMap<String, Object>>)list);
                d d2 = ChromeCustomTabsActivity.this.d.b();
                ChromeCustomTabsActivity.this.a(d2);
                com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.b.a(this.c, d2, uri, 100);
            }
        });
        this.f.a(new e.c.b.b(){

            public void a(int n2, Uri uri, boolean bl, Bundle bundle) {
            }

            public void a(int n2, Bundle bundle) {
                if (n2 == 5) {
                    ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
                    if (!chromeCustomTabsActivity.h) {
                        chromeCustomTabsActivity.h = true;
                        HashMap hashMap = new HashMap();
                        hashMap.put((Object)"uuid", (Object)ChromeCustomTabsActivity.this.c);
                        ChromeCustomTabsActivity.this.b.invokeMethod("onChromeSafariBrowserOpened", (Object)hashMap);
                    }
                }
                if (n2 == 2) {
                    ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
                    if (!chromeCustomTabsActivity.i) {
                        chromeCustomTabsActivity.i = true;
                        HashMap hashMap = new HashMap();
                        hashMap.put((Object)"uuid", (Object)ChromeCustomTabsActivity.this.c);
                        ChromeCustomTabsActivity.this.b.invokeMethod("onChromeSafariBrowserCompletedInitialLoad", (Object)hashMap);
                    }
                }
            }

            public void a(Bundle bundle) {
            }

            public void a(String string2, Bundle bundle) {
            }

            public void c(String string2, Bundle bundle) {
            }
        });
    }

    @Override
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String string2 = methodCall.method;
        int n2 = string2.hashCode() == 94756344 && string2.equals((Object)"close") ? 0 : -1;
        if (n2 != 0) {
            result.notImplemented();
            return;
        }
        this.onStop();
        this.onDestroy();
        this.a();
        Activity activity = q.f;
        Intent intent = new Intent((Context)activity, activity.getClass());
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        q.f.startActivity(intent);
        result.success(true);
    }

    protected void onStart() {
        super.onStart();
        this.f.a(this);
    }

    protected void onStop() {
        super.onStop();
        this.f.b(this);
    }

}

