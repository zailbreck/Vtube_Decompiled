/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.ClipboardManager
 *  com.kuqicc.future.a.a
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Objects
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.kuqicc.future.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.ClipboardManager;
import com.kuqicc.future.MainActivity;
import com.kuqicc.future.a.a;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class b
extends a {
    public static b c;

    private b() {
        this.b = "com.kuqicc.www/comm";
    }

    public static b a() {
        if (c == null) {
            c = new b();
        }
        return c;
    }

    private String a(Context context) {
        try {
            String string = context.getApplicationContext().getPackageManager().getPackageInfo((String)context.getPackageName(), (int)0).versionName;
            return string;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Log.e("", (String)Objects.requireNonNull((Object)nameNotFoundException.getMessage()));
            return "";
        }
    }

    public static void b(FlutterEngine flutterEngine) {
        b.a().a(flutterEngine);
    }

    public void a(String string, MethodChannel.Result result) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse((String)string));
        MainActivity.a().startActivity(intent);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @SuppressLint(value={"SourceLockedOrientationActivity"})
    public void onMethodCall(MethodCall var1, MethodChannel.Result var2_2) {
        block9 : {
            block8 : {
                block7 : {
                    block6 : {
                        if (var1.method.equals((Object)"openUrl")) {
                            this.a((String)var1.arguments, var2_2);
                            return;
                        }
                        var3_3 = var1.method.equals((Object)"copy");
                        var4_4 = true;
                        if (!var3_3) break block6;
                        ((ClipboardManager)MainActivity.a().getSystemService("clipboard")).setText((CharSequence)((String)var1.arguments));
                        ** GOTO lbl-1000
                    }
                    if (!var1.method.equals((Object)"screenOrientationUnspecified")) break block7;
                    MainActivity.a().setRequestedOrientation(-1);
                    ** GOTO lbl-1000
                }
                if (!var1.method.equals((Object)"screenOrientationPortrait")) break block8;
                MainActivity.a().setRequestedOrientation((int)var4_4);
                ** GOTO lbl-1000
            }
            if (!var1.method.equals((Object)"login")) break block9;
            (Integer)((List)var1.arguments).get(0);
            ** GOTO lbl-1000
        }
        if (var1.method.equals((Object)"logout")) lbl-1000: // 5 sources:
        {
            var12_5 = var4_4;
        } else {
            if (var1.method.equals((Object)"deviceInfo") == false) return;
            var5_8 = Build.MODEL;
            var6_9 = Build.VERSION.SDK;
            var7_10 = Build.VERSION.RELEASE;
            var8_11 = b.super.a((Context)MainActivity.a());
            if (!(Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains((CharSequence)"google_sdk") || Build.MODEL.contains((CharSequence)"Emulator") || Build.MODEL.contains((CharSequence)"Android SDK built for x86") || Build.MANUFACTURER.contains((CharSequence)"Genymotion") || Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic") || "google_sdk".equals((Object)Build.PRODUCT))) {
                var4_4 = false;
            }
            var9_12 = var4_4;
            var10_13 = new JSONObject();
            try {
                var10_13.put("model", (Object)var5_8);
                var10_13.put("osSdk", (Object)var6_9);
                var10_13.put("osVersion", (Object)var7_10);
                var10_13.put("appVersion", (Object)var8_11);
                var17_14 = var9_12 != false ? "1" : "0";
                var10_13.put("isEmulator", (Object)var17_14);
            }
            catch (JSONException var11_15) {
                var11_15.printStackTrace();
            }
            var12_7 = var10_13.toString();
        }
        var2_2.success(var12_6);
    }
}

