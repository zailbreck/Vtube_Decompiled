/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.webkit.ValueCallback
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  androidx.webkit.c
 *  androidx.webkit.d
 *  f.g.a.h$a
 *  f.g.a.h$b
 *  f.g.a.q
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package f.g.a;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.c;
import androidx.webkit.d;
import f.g.a.h;
import f.g.a.q;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class h
implements MethodChannel.MethodCallHandler {
    public MethodChannel b;

    public h(BinaryMessenger binaryMessenger) {
        this.b = new MethodChannel(binaryMessenger, "com.pichillilorenzo/flutter_inappwebview_static");
        this.b.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
    }

    public Map<String, Object> a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"versionName", (Object)packageInfo.versionName);
        hashMap.put((Object)"packageName", (Object)packageInfo.packageName);
        return hashMap;
    }

    public void a() {
        this.b.setMethodCallHandler(null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onMethodCall(MethodCall var1, MethodChannel.Result var2_2) {
        block15 : {
            block13 : {
                block14 : {
                    block12 : {
                        var3_3 = var1.method;
                        var4_4 = var3_3.hashCode();
                        var5_5 = false;
                        switch (var4_4) {
                            default: {
                                break;
                            }
                            case 1586319888: {
                                if (!var3_3.equals((Object)"getCurrentWebViewPackage")) break;
                                var6_6 = 4;
                                break block12;
                            }
                            case 643643439: {
                                if (!var3_3.equals((Object)"getDefaultUserAgent")) break;
                                var6_6 = 0;
                                break block12;
                            }
                            case 258673215: {
                                if (!var3_3.equals((Object)"getSafeBrowsingPrivacyPolicyUrl")) break;
                                var6_6 = 2;
                                break block12;
                            }
                            case -436220260: {
                                if (!var3_3.equals((Object)"clearClientCertPreferences")) break;
                                var6_6 = 1;
                                break block12;
                            }
                            case -1600358415: {
                                if (!var3_3.equals((Object)"setSafeBrowsingWhitelist")) break;
                                var6_6 = 3;
                                break block12;
                            }
                        }
                        var6_6 = -1;
                    }
                    if (var6_6 == 0) ** GOTO lbl55
                    if (var6_6 == 1) ** GOTO lbl50
                    if (var6_6 == 2) break block13;
                    if (var6_6 == 3) break block14;
                    if (var6_6 != 4) {
                        var2_2.notImplemented();
                        return;
                    }
                    if (Build.VERSION.SDK_INT < 26) ** GOTO lbl-1000
                    var7_7 = this.a(c.a((Context)q.f));
                    break block15;
                }
                if (Build.VERSION.SDK_INT >= 27 && d.a((String)"SAFE_BROWSING_WHITELIST")) {
                    c.a((List)((List)var1.argument("hosts")), (ValueCallback)new b((h)this, var2_2));
                    return;
                }
                ** GOTO lbl53
            }
            if (Build.VERSION.SDK_INT >= 27 && d.a((String)"SAFE_BROWSING_PRIVACY_POLICY_URL")) {
                var7_7 = c.c().toString();
            } else lbl-1000: // 2 sources:
            {
                var2_2.success(null);
                return;
lbl50: // 1 sources:
                if (Build.VERSION.SDK_INT >= 21) {
                    WebView.clearClientCertPreferences((Runnable)new a((h)this, var2_2));
                    return;
                }
lbl53: // 3 sources:
                var2_2.success((Object)var5_5);
                return;
lbl55: // 1 sources:
                var7_7 = WebSettings.getDefaultUserAgent((Context)q.a);
            }
        }
        var2_2.success((Object)var7_7);
    }
}

