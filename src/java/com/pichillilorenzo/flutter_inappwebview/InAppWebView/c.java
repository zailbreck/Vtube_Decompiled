/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.hardware.display.DisplayManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Message
 *  android.util.Log
 *  android.view.View
 *  android.webkit.ValueCallback
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebView$HitTestResult
 *  android.webkit.WebView$WebViewTransport
 *  android.webkit.WebViewClient
 *  androidx.webkit.c
 *  androidx.webkit.d
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.b
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.c$a
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.c$b
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.c$c
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.f
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.util.HashMap
 *  java.util.Map
 */
package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import android.app.Activity;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.d;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.c;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.e;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.f;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.g;
import f.g.a.i;
import f.g.a.q;
import f.g.a.r;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformView;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class c
implements PlatformView,
MethodChannel.MethodCallHandler {
    public InAppWebView b;
    public final MethodChannel c;

    public c(BinaryMessenger binaryMessenger, Context context, Object object, HashMap<String, Object> hashMap, View view) {
        InAppWebView inAppWebView;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.pichillilorenzo/flutter_inappwebview_");
        stringBuilder.append(object);
        this.c = new MethodChannel(binaryMessenger, stringBuilder.toString());
        this.c.setMethodCallHandler(this);
        com.pichillilorenzo.flutter_inappwebview.InAppWebView.b b2 = new com.pichillilorenzo.flutter_inappwebview.InAppWebView.b();
        DisplayManager displayManager = (DisplayManager)context.getSystemService("display");
        b2.b(displayManager);
        String string2 = (String)hashMap.get((Object)"initialUrl");
        String string3 = (String)hashMap.get((Object)"initialFile");
        Map map = (Map)hashMap.get((Object)"initialData");
        Map map2 = (Map)hashMap.get((Object)"initialHeaders");
        Map map3 = (Map)hashMap.get((Object)"initialOptions");
        Map map4 = (Map)hashMap.get((Object)"contextMenu");
        Integer n2 = (Integer)hashMap.get((Object)"windowId");
        g g2 = new g();
        g2.a((Map<String, Object>)map3);
        if (q.f == null) {
            Log.e((String)"IAWFlutterWebView", (String)"\n\n\nERROR: Shared.activity is null!!!\n\nYou need to upgrade your Flutter project to use the new Java Embedding API:\n\n- Take a look at the \"IMPORTANT Note for Android\" section here: https://github.com/pichillilorenzo/flutter_inappwebview#important-note-for-android\n- See the official wiki here: https://github.com/flutter/flutter/wiki/Upgrading-pre-1.12-Android-projects\n\n\n");
        }
        this.b = inAppWebView = new InAppWebView((Context)q.f, this, object, n2, g2, (Map<String, Object>)map4, view);
        b2.a(displayManager);
        try {
            Class class_ = this.b.getClass();
            while (!(class_ = class_.getSuperclass()).getName().equals((Object)"android.view.View")) {
            }
            Field field = class_.getDeclaredField("mContext");
            field.setAccessible(true);
            field.set((Object)this.b, (Object)context);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            Log.e((String)"IAWFlutterWebView", (String)"Cannot find mContext for this WebView");
        }
        this.b.j();
        if (n2 != null) {
            Message message = (Message)e.j.get((Object)n2);
            if (message != null) {
                ((WebView.WebViewTransport)message.obj).setWebView((WebView)this.b);
                message.sendToTarget();
            }
        } else {
            String string4;
            if (string3 != null) {
                try {
                    string4 = r.b(string3);
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string3);
                    stringBuilder2.append(" asset file cannot be found!");
                    Log.e((String)"IAWFlutterWebView", (String)stringBuilder2.toString(), (Throwable)iOException);
                    return;
                }
            } else {
                string4 = string2;
            }
            if (map != null) {
                String string5 = (String)map.get((Object)"data");
                String string6 = (String)map.get((Object)"mimeType");
                String string7 = (String)map.get((Object)"encoding");
                String string8 = (String)map.get((Object)"baseUrl");
                String string9 = (String)map.get((Object)"historyUrl");
                this.b.loadDataWithBaseURL(string8, string5, string6, string7, string9);
            } else {
                this.b.loadUrl(string4, map2);
            }
        }
        if (view == null && object instanceof String) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put((Object)"uuid", object);
            this.c.invokeMethod("onHeadlessWebViewCreated", (Object)hashMap2);
        }
    }

    @Override
    public void dispose() {
        this.c.setMethodCallHandler(null);
        InAppWebView inAppWebView = this.b;
        if (inAppWebView != null) {
            inAppWebView.j.a();
            this.b.i.a();
            this.b.l.a();
            this.b.setWebChromeClient(new WebChromeClient());
            this.b.setWebViewClient((WebViewClient)new c(this));
            this.b.getSettings().setJavaScriptEnabled(false);
            this.b.loadUrl("about:blank");
        }
    }

    @Override
    public View getView() {
        return this.b;
    }

    @Override
    public void onFlutterViewAttached(View view) {
        InAppWebView inAppWebView = this.b;
        if (inAppWebView != null) {
            inAppWebView.setContainerView(view);
        }
    }

    @Override
    public void onFlutterViewDetached() {
        InAppWebView inAppWebView = this.b;
        if (inAppWebView != null) {
            inAppWebView.setContainerView(null);
        }
    }

    @Override
    public void onInputConnectionLocked() {
        InAppWebView inAppWebView = this.b;
        if (inAppWebView != null && inAppWebView.e == null) {
            inAppWebView.b();
        }
    }

    @Override
    public void onInputConnectionUnlocked() {
        InAppWebView inAppWebView = this.b;
        if (inAppWebView != null && inAppWebView.e == null) {
            inAppWebView.c();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void onMethodCall(MethodCall var1, MethodChannel.Result var2_2) {
        block150 : {
            block149 : {
                var3_3 = var1.method;
                var4_4 = var3_3.hashCode();
                var5_5 = false;
                var6_6 = true;
                switch (var4_4) {
                    default: {
                        break;
                    }
                    case 1966196898: {
                        if (!var3_3.equals((Object)"getTitle")) break;
                        var7_7 = 1;
                        break block149;
                    }
                    case 1965076372: {
                        if (!var3_3.equals((Object)"getScale")) break;
                        var7_7 = 40;
                        break block149;
                    }
                    case 1937913574: {
                        if (!var3_3.equals((Object)"evaluateJavascript")) break;
                        var7_7 = 7;
                        break block149;
                    }
                    case 1925083019: {
                        if (!var3_3.equals((Object)"injectJavascriptFileFromUrl")) break;
                        var7_7 = 8;
                        break block149;
                    }
                    case 1916929588: {
                        if (!var3_3.equals((Object)"findAllAsync")) break;
                        var7_7 = 27;
                        break block149;
                    }
                    case 1845185410: {
                        if (!var3_3.equals((Object)"loadFile")) break;
                        var7_7 = 6;
                        break block149;
                    }
                    case 1845118384: {
                        if (!var3_3.equals((Object)"loadData")) break;
                        var7_7 = 5;
                        break block149;
                    }
                    case 1810715187: {
                        if (!var3_3.equals((Object)"goBackOrForward")) break;
                        var7_7 = 16;
                        break block149;
                    }
                    case 1779894764: {
                        if (!var3_3.equals((Object)"setContextMenu")) break;
                        var7_7 = 49;
                        break block149;
                    }
                    case 1729408231: {
                        if (!var3_3.equals((Object)"requestImageRef")) break;
                        var7_7 = 51;
                        break block149;
                    }
                    case 1724190684: {
                        if (!var3_3.equals((Object)"setOptions")) break;
                        var7_7 = 21;
                        break block149;
                    }
                    case 1520566363: {
                        if (!var3_3.equals((Object)"resumeTimers")) break;
                        var7_7 = 35;
                        break block149;
                    }
                    case 1312131169: {
                        if (!var3_3.equals((Object)"getCertificate")) break;
                        var7_7 = 54;
                        break block149;
                    }
                    case 1246613238: {
                        if (!var3_3.equals((Object)"requestFocusNodeHref")) break;
                        var7_7 = 50;
                        break block149;
                    }
                    case 1091267752: {
                        if (!var3_3.equals((Object)"getOriginalUrl")) break;
                        var7_7 = 39;
                        break block149;
                    }
                    case 1076821923: {
                        if (!var3_3.equals((Object)"getProgress")) break;
                        var7_7 = 2;
                        break block149;
                    }
                    case 1042858233: {
                        if (!var3_3.equals((Object)"clearSslPreferences")) break;
                        var7_7 = 26;
                        break block149;
                    }
                    case 858987473: {
                        if (!var3_3.equals((Object)"pageDown")) break;
                        var7_7 = 43;
                        break block149;
                    }
                    case 817048102: {
                        if (!var3_3.equals((Object)"clearMatches")) break;
                        var7_7 = 29;
                        break block149;
                    }
                    case 740366903: {
                        if (!var3_3.equals((Object)"injectCSSFileFromUrl")) break;
                        var7_7 = 10;
                        break block149;
                    }
                    case 492688268: {
                        if (!var3_3.equals((Object)"getHitTestResult")) break;
                        var7_7 = 42;
                        break block149;
                    }
                    case 336631465: {
                        if (!var3_3.equals((Object)"loadUrl")) break;
                        var7_7 = 3;
                        break block149;
                    }
                    case 194959693: {
                        if (!var3_3.equals((Object)"takeScreenshot")) break;
                        var7_7 = 20;
                        break block149;
                    }
                    case 106440182: {
                        if (!var3_3.equals((Object)"pause")) break;
                        var7_7 = 32;
                        break block149;
                    }
                    case -17750794: {
                        if (!var3_3.equals((Object)"startSafeBrowsing")) break;
                        var7_7 = 24;
                        break block149;
                    }
                    case -32598479: {
                        if (!var3_3.equals((Object)"getCopyBackForwardList")) break;
                        var7_7 = 23;
                        break block149;
                    }
                    case -53272641: {
                        if (!var3_3.equals((Object)"injectCSSCode")) break;
                        var7_7 = 9;
                        break block149;
                    }
                    case -110027141: {
                        if (!var3_3.equals((Object)"zoomOut")) break;
                        var7_7 = 47;
                        break block149;
                    }
                    case -127960866: {
                        if (!var3_3.equals((Object)"getSelectedText")) break;
                        var7_7 = 41;
                        break block149;
                    }
                    case -212614552: {
                        if (!var3_3.equals((Object)"getOptions")) break;
                        var7_7 = 22;
                        break block149;
                    }
                    case -243128142: {
                        if (!var3_3.equals((Object)"isLoading")) break;
                        var7_7 = 19;
                        break block149;
                    }
                    case -317054497: {
                        if (!var3_3.equals((Object)"canGoBack")) break;
                        var7_7 = 13;
                        break block149;
                    }
                    case -318289731: {
                        if (!var3_3.equals((Object)"goForward")) break;
                        var7_7 = 14;
                        break block149;
                    }
                    case -391221073: {
                        if (!var3_3.equals((Object)"postUrl")) break;
                        var7_7 = 4;
                        break block149;
                    }
                    case -402165208: {
                        if (!var3_3.equals((Object)"scrollTo")) break;
                        var7_7 = 30;
                        break block149;
                    }
                    case -402165756: {
                        if (!var3_3.equals((Object)"scrollBy")) break;
                        var7_7 = 31;
                        break block149;
                    }
                    case -678975813: {
                        if (!var3_3.equals((Object)"printCurrentPage")) break;
                        var7_7 = 36;
                        break block149;
                    }
                    case -679382964: {
                        if (!var3_3.equals((Object)"findNext")) break;
                        var7_7 = 28;
                        break block149;
                    }
                    case -696286120: {
                        if (!var3_3.equals((Object)"zoomIn")) break;
                        var7_7 = 46;
                        break block149;
                    }
                    case -696286326: {
                        if (!var3_3.equals((Object)"zoomBy")) break;
                        var7_7 = 38;
                        break block149;
                    }
                    case -756050293: {
                        if (!var3_3.equals((Object)"clearFocus")) break;
                        var7_7 = 48;
                        break block149;
                    }
                    case -759238347: {
                        if (!var3_3.equals((Object)"clearCache")) break;
                        var7_7 = 25;
                        break block149;
                    }
                    case -934426579: {
                        if (!var3_3.equals((Object)"resume")) break;
                        var7_7 = 33;
                        break block149;
                    }
                    case -934641255: {
                        if (!var3_3.equals((Object)"reload")) break;
                        var7_7 = 11;
                        break block149;
                    }
                    case -948122918: {
                        if (!var3_3.equals((Object)"stopLoading")) break;
                        var7_7 = 18;
                        break block149;
                    }
                    case -995752566: {
                        if (!var3_3.equals((Object)"pageUp")) break;
                        var7_7 = 44;
                        break block149;
                    }
                    case -1067273523: {
                        if (!var3_3.equals((Object)"canGoForward")) break;
                        var7_7 = 15;
                        break block149;
                    }
                    case -1241591313: {
                        if (!var3_3.equals((Object)"goBack")) break;
                        var7_7 = 12;
                        break block149;
                    }
                    case -1249348039: {
                        if (!var3_3.equals((Object)"getUrl")) break;
                        var7_7 = 0;
                        break block149;
                    }
                    case -1309347773: {
                        if (!var3_3.equals((Object)"canGoBackOrForward")) break;
                        var7_7 = 17;
                        break block149;
                    }
                    case -1331417354: {
                        if (!var3_3.equals((Object)"getScrollY")) break;
                        var7_7 = 53;
                        break block149;
                    }
                    case -1331417355: {
                        if (!var3_3.equals((Object)"getScrollX")) break;
                        var7_7 = 52;
                        break block149;
                    }
                    case -1624396757: {
                        if (!var3_3.equals((Object)"saveWebArchive")) break;
                        var7_7 = 45;
                        break block149;
                    }
                    case -1773179062: {
                        if (!var3_3.equals((Object)"getContentHeight")) break;
                        var7_7 = 37;
                        break block149;
                    }
                    case -1787354268: {
                        if (!var3_3.equals((Object)"pauseTimers")) break;
                        var7_7 = 34;
                        break block149;
                    }
                }
                var7_7 = -1;
            }
            switch (var7_7) {
                default: {
                    var2_2.notImplemented();
                    return;
                }
                case 54: {
                    var86_8 = this.b;
                    var9_9 = null;
                    if (var86_8 == null) break block150;
                    var22_10 = var86_8.getCertificateMap();
                    ** GOTO lbl510
                }
                case 53: {
                    var85_11 = this.b;
                    var9_9 = null;
                    if (var85_11 == null) break block150;
                    var84_12 = var85_11.getScrollY();
                    ** GOTO lbl251
                }
                case 52: {
                    var83_13 = this.b;
                    var9_9 = null;
                    if (var83_13 == null) break block150;
                    var84_12 = var83_13.getScrollX();
lbl251: // 2 sources:
                    var22_10 = Integer.valueOf((int)var84_12);
                    ** GOTO lbl510
                }
                case 51: {
                    var82_14 = this.b;
                    var9_9 = null;
                    if (var82_14 == null) break block150;
                    var22_10 = var82_14.m();
                    ** GOTO lbl510
                }
                case 50: {
                    var81_15 = this.b;
                    var9_9 = null;
                    if (var81_15 == null) break block150;
                    var22_10 = var81_15.l();
                    ** GOTO lbl510
                }
                case 49: {
                    if (this.b == null) ** GOTO lbl540
                    this.b.t = var80_16 = (Map)var1.argument("contextMenu");
                    ** GOTO lbl502
                }
                case 48: {
                    var79_17 = this.b;
                    if (var79_17 == null) ** GOTO lbl540
                    var79_17.clearFocus();
                    ** GOTO lbl502
                }
                case 47: {
                    var78_18 = this.b;
                    if (var78_18 == null) ** GOTO lbl540
                    var72_19 = var78_18.zoomOut();
                    ** GOTO lbl302
                }
                case 46: {
                    var77_20 = this.b;
                    if (var77_20 == null) ** GOTO lbl540
                    var72_19 = var77_20.zoomIn();
                    ** GOTO lbl302
                }
                case 45: {
                    var74_21 = this.b;
                    var9_9 = null;
                    if (var74_21 != null) {
                        var75_22 = (String)var1.argument("basename");
                        var76_23 = (Boolean)var1.argument("autoname");
                        this.b.saveWebArchive(var75_22, var76_23, (ValueCallback)new b((c)this, var2_2));
                        return;
                    }
                    break block150;
                }
                case 44: {
                    if (this.b == null) ** GOTO lbl540
                    var73_24 = (Boolean)var1.argument("top");
                    var72_19 = this.b.pageUp(var73_24);
                    ** GOTO lbl302
                }
                case 43: {
                    if (this.b == null) ** GOTO lbl540
                    var71_25 = (Boolean)var1.argument("bottom");
                    var72_19 = this.b.pageDown(var71_25);
lbl302: // 4 sources:
                    var22_10 = var72_19;
                    ** GOTO lbl510
                }
                case 42: {
                    var66_26 = this.b;
                    var9_9 = null;
                    if (var66_26 != null) {
                        var67_27 = var66_26.getHitTestResult();
                        var68_28 = new HashMap();
                        var68_28.put((Object)"type", (Object)var67_27.getType());
                        var68_28.put((Object)"extra", (Object)var67_27.getExtra());
                        var2_2.success((Object)var68_28);
                        return;
                    }
                    break block150;
                }
                case 41: {
                    var64_29 = this.b;
                    var9_9 = null;
                    if (var64_29 != null) {
                        var65_30 = Build.VERSION.SDK_INT;
                        var9_9 = null;
                        if (var65_30 >= 19) {
                            var64_29.a(var2_2);
                            return;
                        }
                    }
                    break block150;
                }
                case 40: {
                    var63_31 = this.b;
                    var9_9 = null;
                    if (var63_31 != null) {
                        var9_9 = var63_31.getUpdatedScale();
                    }
                    break block150;
                }
                case 39: {
                    var62_32 = this.b;
                    var9_9 = null;
                    if (var62_32 != null) {
                        var9_9 = var62_32.getOriginalUrl();
                    }
                    break block150;
                }
                case 38: {
                    if (this.b == null || Build.VERSION.SDK_INT < 21) ** GOTO lbl540
                    var60_33 = (Double)var1.argument("zoomFactor");
                    this.b.zoomBy((float)var60_33);
                    ** GOTO lbl502
                }
                case 37: {
                    var59_34 = this.b;
                    var9_9 = null;
                    if (var59_34 == null) break block150;
                    var12_35 = var59_34.getContentHeight();
                    ** GOTO lbl547
                }
                case 36: {
                    var58_36 = this.b;
                    if (var58_36 == null || Build.VERSION.SDK_INT < 21) ** GOTO lbl540
                    var58_36.k();
                    ** GOTO lbl502
                }
                case 35: {
                    var57_37 = this.b;
                    if (var57_37 == null) ** GOTO lbl540
                    var57_37.resumeTimers();
                    ** GOTO lbl502
                }
                case 34: {
                    var56_38 = this.b;
                    if (var56_38 == null) ** GOTO lbl540
                    var56_38.pauseTimers();
                    ** GOTO lbl502
                }
                case 33: {
                    var55_39 = this.b;
                    if (var55_39 == null) ** GOTO lbl540
                    var55_39.onResume();
                    ** GOTO lbl502
                }
                case 32: {
                    var54_40 = this.b;
                    if (var54_40 == null) ** GOTO lbl540
                    var54_40.onPause();
                    ** GOTO lbl502
                }
                case 31: {
                    if (this.b != null) {
                        var51_41 = (Integer)var1.argument("x");
                        var52_42 = (Integer)var1.argument("y");
                        var53_43 = (Boolean)var1.argument("animated");
                        this.b.a(var51_41, var52_42, var53_43);
                    }
                    ** GOTO lbl502
                }
                case 30: {
                    if (this.b != null) {
                        var48_44 = (Integer)var1.argument("x");
                        var49_45 = (Integer)var1.argument("y");
                        var50_46 = (Boolean)var1.argument("animated");
                        this.b.b(var48_44, var49_45, var50_46);
                    }
                    ** GOTO lbl502
                }
                case 29: {
                    var47_47 = this.b;
                    if (var47_47 == null) ** GOTO lbl540
                    var47_47.clearMatches();
                    ** GOTO lbl502
                }
                case 28: {
                    if (this.b == null) ** GOTO lbl540
                    var46_48 = (Boolean)var1.argument("forward");
                    this.b.findNext(var46_48.booleanValue());
                    ** GOTO lbl502
                }
                case 27: {
                    if (this.b != null) {
                        var45_49 = (String)var1.argument("find");
                        this.b.findAllAsync(var45_49);
                    }
                    ** GOTO lbl502
                }
                case 26: {
                    var44_50 = this.b;
                    if (var44_50 != null) {
                        var44_50.clearSslPreferences();
                    }
                    ** GOTO lbl502
                }
                case 25: {
                    var43_51 = this.b;
                    if (var43_51 != null) {
                        var43_51.e();
                    }
                    ** GOTO lbl502
                }
                case 24: {
                    if (this.b != null && Build.VERSION.SDK_INT >= 27 && d.a((String)"START_SAFE_BROWSING")) {
                        androidx.webkit.c.a((Context)this.b.getContext(), (ValueCallback)new a((c)this, var2_2));
                        return;
                    }
                    ** GOTO lbl540
                }
                case 23: {
                    var42_52 = this.b;
                    var9_9 = null;
                    if (var42_52 != null) {
                        var9_9 = var42_52.getCopyBackForwardList();
                    }
                    break block150;
                }
                case 22: {
                    var41_53 = this.b;
                    var9_9 = null;
                    if (var41_53 != null) {
                        var9_9 = var41_53.getOptions();
                    }
                    break block150;
                }
                case 21: {
                    if (this.b != null) {
                        var38_54 = new g();
                        var39_55 = (HashMap)var1.argument("options");
                        var38_54.a((Map<String, Object>)var39_55);
                        this.b.a(var38_54, (HashMap<String, Object>)var39_55);
                    }
                    ** GOTO lbl502
                }
                case 20: {
                    var37_56 = this.b;
                    var9_9 = null;
                    if (var37_56 != null) {
                        var37_56.b(var2_2);
                        return;
                    }
                    break block150;
                }
                case 19: {
                    var36_57 = this.b;
                    if (var36_57 == null || !var36_57.g()) ** GOTO lbl-1000
                    ** GOTO lbl-1000
                }
                case 18: {
                    var35_58 = this.b;
                    if (var35_58 != null) {
                        var35_58.stopLoading();
                    }
                    ** GOTO lbl502
                }
                case 17: {
                    var34_59 = this.b;
                    if (var34_59 == null || !var34_59.canGoBackOrForward(((Integer)var1.argument("steps")).intValue())) ** GOTO lbl-1000
                    ** GOTO lbl-1000
                }
                case 16: {
                    var33_60 = this.b;
                    if (var33_60 != null) {
                        var33_60.goBackOrForward(((Integer)var1.argument("steps")).intValue());
                    }
                    ** GOTO lbl502
                }
                case 15: {
                    var32_61 = this.b;
                    if (var32_61 == null || !var32_61.canGoForward()) ** GOTO lbl-1000
                    ** GOTO lbl-1000
                }
                case 14: {
                    var31_62 = this.b;
                    if (var31_62 != null) {
                        var31_62.goForward();
                    }
                    ** GOTO lbl502
                }
                case 13: {
                    var29_63 = this.b;
                    if (var29_63 != null && var29_63.canGoBack()) lbl-1000: // 4 sources:
                    {
                        var30_64 = true;
                    } else lbl-1000: // 4 sources:
                    {
                        var30_64 = false;
                    }
                    var22_10 = var30_64;
                    ** GOTO lbl510
                }
                case 12: {
                    var28_65 = this.b;
                    if (var28_65 != null) {
                        var28_65.goBack();
                    }
                    ** GOTO lbl502
                }
                case 11: {
                    var27_66 = this.b;
                    if (var27_66 != null) {
                        var27_66.reload();
                    }
                    ** GOTO lbl502
                }
                case 10: {
                    if (this.b != null) {
                        var26_67 = (String)var1.argument("urlFile");
                        this.b.b(var26_67);
                    }
                    ** GOTO lbl502
                }
                case 9: {
                    if (this.b != null) {
                        var25_68 = (String)var1.argument("source");
                        this.b.a(var25_68);
                    }
                    ** GOTO lbl502
                }
                case 8: {
                    if (this.b != null) {
                        var24_69 = (String)var1.argument("urlFile");
                        this.b.c(var24_69);
                    }
lbl502: // 26 sources:
                    var2_2.success((Object)var6_6);
                    return;
                }
                case 7: {
                    if (this.b != null) {
                        var23_70 = (String)var1.argument("source");
                        this.b.a(var23_70, var2_2);
                        return;
                    }
                    var22_10 = "";
lbl510: // 7 sources:
                    var2_2.success((Object)var22_10);
                    return;
                }
                case 6: {
                    var21_71 = this.b;
                    if (var21_71 != null) {
                        var21_71.a((String)var1.argument("url"), (Map<String, String>)((Map)var1.argument("headers")), var2_2);
                        return;
                    }
                    ** GOTO lbl540
                }
                case 5: {
                    var15_72 = (String)var1.argument("data");
                    var16_73 = (String)var1.argument("mimeType");
                    var17_74 = (String)var1.argument("encoding");
                    var18_75 = (String)var1.argument("baseUrl");
                    var19_76 = (String)var1.argument("historyUrl");
                    var20_77 = this.b;
                    if (var20_77 != null) {
                        var20_77.a(var15_72, var16_73, var17_74, var18_75, var19_76, var2_2);
                        return;
                    }
                    ** GOTO lbl540
                }
                case 4: {
                    var14_78 = this.b;
                    if (var14_78 != null) {
                        var14_78.a((String)var1.argument("url"), (byte[])var1.argument("postData"), var2_2);
                        return;
                    }
                    ** GOTO lbl540
                }
                case 3: {
                    var13_79 = this.b;
                    if (var13_79 != null) {
                        var13_79.b((String)var1.argument("url"), (Map<String, String>)((Map)var1.argument("headers")), var2_2);
                        return;
                    }
lbl540: // 20 sources:
                    var2_2.success((Object)var5_5);
                    return;
                }
                case 2: {
                    var11_80 = this.b;
                    var9_9 = null;
                    if (var11_80 == null) break block150;
                    var12_35 = var11_80.getProgress();
lbl547: // 2 sources:
                    var9_9 = var12_35;
                    break block150;
                }
                case 1: {
                    var10_81 = this.b;
                    var9_9 = null;
                    if (var10_81 != null) {
                        var9_9 = var10_81.getTitle();
                    }
                    break block150;
                }
                case 0: 
            }
            var8_82 = this.b;
            var9_9 = null;
            if (var8_82 != null) {
                var9_9 = var8_82.getUrl();
            }
        }
        var2_2.success((Object)var9_9);
    }
}

