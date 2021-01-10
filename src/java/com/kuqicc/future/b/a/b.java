/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.util.Log
 *  com.mopub.common.MediationSettings
 *  com.mopub.common.MoPub
 *  com.mopub.common.SdkConfiguration
 *  com.mopub.common.SdkConfiguration$Builder
 *  com.mopub.common.SdkInitializationListener
 *  com.mopub.common.logging.MoPubLog
 *  com.mopub.common.logging.MoPubLog$LogLevel
 *  com.mopub.mobileads.MoPubRewardedVideoListener
 *  com.mopub.mobileads.MoPubRewardedVideos
 *  java.lang.Object
 *  java.lang.String
 */
package com.kuqicc.future.b.a;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.kuqicc.future.b.a.b;
import com.mopub.common.MediationSettings;
import com.mopub.common.MoPub;
import com.mopub.common.SdkConfiguration;
import com.mopub.common.SdkInitializationListener;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.MoPubRewardedVideoListener;
import com.mopub.mobileads.MoPubRewardedVideos;
import io.flutter.plugin.common.MethodChannel;

public class b {
    private static b d;
    private String a = "753ef89d599c4953a6e0f12d41de47aa";
    private MethodChannel.Result b;
    private int c = 30000;

    static /* synthetic */ int a(b b2) {
        return b2.c;
    }

    private void a() {
        MoPubRewardedVideos.setRewardedVideoListener((MoPubRewardedVideoListener)new MoPubRewardedVideoListener(this){
            final /* synthetic */ b a;
            {
                this.a = b2;
            }

            static /* synthetic */ void a(String string) {
                MoPubRewardedVideos.loadRewardedVideo((String)string, (MediationSettings[])new MediationSettings[0]);
            }

            public void onRewardedVideoClicked(String string) {
                Log.e((String)"Mopub", (String)"MopubRewardVideo onRewardedVideoClicked");
            }

            public void onRewardedVideoClosed(String string) {
                Log.e((String)"Mopub", (String)"MopubRewardVideo onRewardedVideoClosed");
                MoPubRewardedVideos.loadRewardedVideo((String)string, (MediationSettings[])new MediationSettings[0]);
            }

            public void onRewardedVideoCompleted(java.util.Set<String> set, com.mopub.common.MoPubReward moPubReward) {
                Log.e((String)"Mopub", (String)"MopubRewardVideo onRewardedVideoCompleted");
                if (b.b(this.a) != null) {
                    b.b(this.a).success(true);
                }
            }

            public void onRewardedVideoLoadFailure(String string, com.mopub.mobileads.MoPubErrorCode moPubErrorCode) {
                java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                stringBuilder.append("MopubRewardVideo onRewardedVideoLoadFailure --- ");
                stringBuilder.append(moPubErrorCode.getIntCode());
                stringBuilder.append("----");
                stringBuilder.append(moPubErrorCode.toString());
                Log.e((String)"Mopub", (String)stringBuilder.toString());
                new android.os.Handler().postDelayed((java.lang.Runnable)new com.kuqicc.future.b.a.a(string), (long)b.a(this.a));
            }

            public void onRewardedVideoLoadSuccess(String string) {
                Log.e((String)"Mopub", (String)"MopubRewardVideo onRewardedVideoLoadSuccess!!!!");
            }

            public void onRewardedVideoPlaybackError(String string, com.mopub.mobileads.MoPubErrorCode moPubErrorCode) {
                java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                stringBuilder.append("MopubRewardVideo onRewardedVideoPlaybackError?????=");
                stringBuilder.append(moPubErrorCode.toString());
                Log.e((String)"Mopub", (String)stringBuilder.toString());
            }

            public void onRewardedVideoStarted(String string) {
                Log.e((String)"Mopub", (String)"MopubRewardVideo onRewardedVideoStarted");
            }
        });
        MoPubRewardedVideos.loadRewardedVideo((String)this.a, (MediationSettings[])new MediationSettings[0]);
    }

    public static b b() {
        if (d == null) {
            d = new b();
        }
        return d;
    }

    static /* synthetic */ MethodChannel.Result b(b b2) {
        return b2.b;
    }

    public void a(Activity activity) {
        MoPub.onCreate((Activity)activity);
        MoPub.initializeSdk((Context)activity, (SdkConfiguration)new SdkConfiguration.Builder(this.a).withLogLevel(MoPubLog.LogLevel.DEBUG).build(), (SdkInitializationListener)new SdkInitializationListener((b)this){

            public void onInitializationFinished() {
                Log.e((String)"main", (String)"onInitializationFinished: -----------initSuccess");
            }
        });
        b.super.a();
    }

    public void a(MethodChannel.Result result) {
        this.b = result;
        if (MoPubRewardedVideos.hasRewardedVideo((String)this.a)) {
            Log.e((String)"Mopub", (String)"MopubRewardVideo show");
            MoPubRewardedVideos.showRewardedVideo((String)this.a);
            return;
        }
        Log.e((String)"Mopub", (String)"MopubRewardVideo not ready");
        if (result != null) {
            result.success(false);
        }
    }
}

