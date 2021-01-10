/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Log
 *  android.webkit.MimeTypeMap
 *  com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity
 *  f.g.a.q
 *  f.g.a.r
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  java.io.IOException
 *  java.io.Serializable
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package f.g.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import f.g.a.q;
import f.g.a.r;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class f
implements MethodChannel.MethodCallHandler {
    public MethodChannel b;

    public f(BinaryMessenger binaryMessenger) {
        this.b = new MethodChannel(binaryMessenger, "com.pichillilorenzo/flutter_inappbrowser");
        this.b.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
    }

    public static String a(String string) {
        String string2 = MimeTypeMap.getFileExtensionFromUrl((String)string);
        if (string2 != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(string2);
        }
        return null;
    }

    public void a() {
        this.b.setMethodCallHandler(null);
    }

    public void a(Activity activity, Intent intent) {
        block7 : {
            block5 : {
                ArrayList arrayList;
                block6 : {
                    String string = activity.getPackageName();
                    List list = activity.getPackageManager().queryIntentActivities(intent, 0);
                    arrayList = new ArrayList();
                    Iterator iterator = list.iterator();
                    boolean bl = false;
                    while (iterator.hasNext()) {
                        ResolveInfo resolveInfo = (ResolveInfo)iterator.next();
                        if (!string.equals((Object)resolveInfo.activityInfo.packageName)) {
                            Intent intent2 = (Intent)intent.clone();
                            intent2.setPackage(resolveInfo.activityInfo.packageName);
                            arrayList.add((Object)intent2);
                            continue;
                        }
                        bl = true;
                    }
                    if (!bl || arrayList.size() == 0) break block5;
                    if (arrayList.size() != 1) break block6;
                    intent = (Intent)arrayList.get(0);
                    break block5;
                }
                if (arrayList.size() <= 0) break block7;
                intent = Intent.createChooser((Intent)((Intent)arrayList.remove(arrayList.size() - 1)), null);
                intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])arrayList.toArray((Object[])new Parcelable[0]));
            }
            activity.startActivity(intent);
        }
    }

    public void a(Activity activity, Bundle bundle) {
        Intent intent = new Intent((Context)activity, InAppBrowserActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }

    public void a(Activity activity, String string, MethodChannel.Result result) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri uri = Uri.parse((String)string);
            if ("file".equals((Object)uri.getScheme())) {
                intent.setDataAndType(uri, f.a(string));
            } else {
                intent.setData(uri);
            }
            intent.putExtra("com.android.browser.application_id", activity.getPackageName());
            this.a(activity, intent);
            result.success((Object)true);
            return;
        }
        catch (RuntimeException runtimeException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" cannot be opened: ");
            stringBuilder.append(runtimeException.toString());
            Log.d((String)"InAppBrowserManager", (String)stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string);
            stringBuilder2.append(" cannot be opened!");
            result.error("InAppBrowserManager", stringBuilder2.toString(), null);
            return;
        }
    }

    public void a(Activity activity, String string, String string2, HashMap<String, Object> hashMap, Map<String, String> map, HashMap<String, Object> hashMap2, Integer n2) {
        Bundle bundle = new Bundle();
        bundle.putString("fromActivity", activity.getClass().getName());
        bundle.putString("url", string2);
        bundle.putBoolean("isData", false);
        bundle.putString("uuid", string);
        bundle.putSerializable("options", hashMap);
        bundle.putSerializable("headers", (Serializable)map);
        bundle.putSerializable("contextMenu", hashMap2);
        int n3 = n2 != null ? n2 : -1;
        bundle.putInt("windowId", n3);
        this.a(activity, bundle);
    }

    public void a(Activity activity, String string, HashMap<String, Object> hashMap, String string2, String string3, String string4, String string5, String string6, HashMap<String, Object> hashMap2, Integer n2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isData", true);
        bundle.putString("uuid", string);
        bundle.putSerializable("options", hashMap);
        bundle.putString("data", string2);
        bundle.putString("mimeType", string3);
        bundle.putString("encoding", string4);
        bundle.putString("baseUrl", string5);
        bundle.putString("historyUrl", string6);
        bundle.putSerializable("contextMenu", hashMap2);
        int n3 = n2 != null ? n2 : -1;
        bundle.putInt("windowId", n3);
        this.a(activity, bundle);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void onMethodCall(MethodCall var1, MethodChannel.Result var2_2) {
        block12 : {
            var3_3 = q.f;
            var4_4 = (String)var1.argument("uuid");
            var5_5 = var1.method;
            var6_6 = var5_5.hashCode();
            var7_7 = true;
            switch (var6_6) {
                default: {
                    break;
                }
                case -505062682: {
                    if (!var5_5.equals((Object)"openFile")) break;
                    var8_8 = 1;
                    break block12;
                }
                case -505129708: {
                    if (!var5_5.equals((Object)"openData")) break;
                    var8_8 = 2;
                    break block12;
                }
                case -1263203643: {
                    if (!var5_5.equals((Object)"openUrl")) break;
                    var8_8 = 0;
                    break block12;
                }
                case -2119567959: {
                    if (!var5_5.equals((Object)"openWithSystemBrowser")) break;
                    var8_8 = 3;
                    break block12;
                }
            }
            var8_8 = -1;
        }
        if (var8_8 == 0) ** GOTO lbl48
        if (var8_8 != 1) {
            if (var8_8 != 2) {
                if (var8_8 != 3) {
                    var2_2.notImplemented();
                    return;
                }
                this.a(var3_3, (String)var1.argument("url"), var2_2);
                return;
            }
            this.a(var3_3, var4_4, (HashMap<String, Object>)((HashMap)var1.argument("options")), (String)var1.argument("data"), (String)var1.argument("mimeType"), (String)var1.argument("encoding"), (String)var1.argument("baseUrl"), (String)var1.argument("historyUrl"), (HashMap<String, Object>)((HashMap)var1.argument("contextMenu")), (Integer)var1.argument("windowId"));
        } else {
            var14_9 = (String)var1.argument("url");
            try {
                var9_10 = r.b((String)var14_9);
            }
            catch (IOException var15_11) {
                var15_11.printStackTrace();
                var16_12 = new StringBuilder();
                var16_12.append(var14_9);
                var16_12.append(" asset file cannot be found!");
                var2_2.error("InAppBrowserManager", var16_12.toString(), (Object)var15_11);
                return;
            }
lbl48: // 1 sources:
            var9_10 = (String)var1.argument("url");
            var10_13 = (HashMap)var1.argument("options");
            var11_14 = (Map)var1.argument("headers");
            var12_15 = (HashMap)var1.argument("contextMenu");
            var13_16 = (Integer)var1.argument("windowId");
            this.a(var3_3, var4_4, var9_10, (HashMap<String, Object>)var10_13, (Map<String, String>)var11_14, (HashMap<String, Object>)var12_15, var13_16);
        }
        var2_2.success((Object)var7_7);
    }
}

