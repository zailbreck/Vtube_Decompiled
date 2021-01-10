/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.net.Uri
 *  android.os.Bundle
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import io.flutter.plugins.urllauncher.WebViewActivity;

class UrlLauncher {
    private Activity activity;
    private final Context applicationContext;

    UrlLauncher(Context context, Activity activity) {
        this.applicationContext = context;
        this.activity = activity;
    }

    boolean canLaunch(String string2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse((String)string2));
        ComponentName componentName = intent.resolveActivity(this.applicationContext.getPackageManager());
        return componentName != null && !"{com.android.fallback/com.android.fallback.Fallback}".equals((Object)componentName.toShortString());
    }

    void closeWebView() {
        this.applicationContext.sendBroadcast(new Intent(WebViewActivity.ACTION_CLOSE));
    }

    LaunchStatus launch(String string2, Bundle bundle, boolean bl, boolean bl2, boolean bl3) {
        Activity activity = this.activity;
        if (activity == null) {
            return LaunchStatus.NO_ACTIVITY;
        }
        Intent intent = bl ? WebViewActivity.createIntent((Context)activity, string2, bl2, bl3, bundle) : new Intent("android.intent.action.VIEW").setData(Uri.parse((String)string2)).putExtra("com.android.browser.headers", bundle);
        this.activity.startActivity(intent);
        return LaunchStatus.OK;
    }

    void setActivity(Activity activity) {
        this.activity = activity;
    }

    static final class LaunchStatus
    extends Enum<LaunchStatus> {
        private static final /* synthetic */ LaunchStatus[] $VALUES;
        public static final /* enum */ LaunchStatus NO_ACTIVITY;
        public static final /* enum */ LaunchStatus OK;

        static {
            OK = new LaunchStatus();
            NO_ACTIVITY = new LaunchStatus();
            LaunchStatus[] arrlaunchStatus = new LaunchStatus[]{OK, NO_ACTIVITY};
            $VALUES = arrlaunchStatus;
        }

        public static LaunchStatus valueOf(String string2) {
            return (LaunchStatus)Enum.valueOf(LaunchStatus.class, (String)string2);
        }

        public static LaunchStatus[] values() {
            return (LaunchStatus[])$VALUES.clone();
        }
    }

}

