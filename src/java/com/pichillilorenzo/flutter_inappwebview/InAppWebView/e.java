/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.content.ClipData
 *  android.content.ClipData$Item
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.BitmapFactory
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.os.Message
 *  android.os.Parcelable
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.webkit.ConsoleMessage
 *  android.webkit.ConsoleMessage$MessageLevel
 *  android.webkit.GeolocationPermissions
 *  android.webkit.GeolocationPermissions$Callback
 *  android.webkit.JsPromptResult
 *  android.webkit.JsResult
 *  android.webkit.MimeTypeMap
 *  android.webkit.PermissionRequest
 *  android.webkit.ValueCallback
 *  android.webkit.WebChromeClient
 *  android.webkit.WebChromeClient$CustomViewCallback
 *  android.webkit.WebChromeClient$FileChooserParams
 *  android.webkit.WebView
 *  android.webkit.WebView$HitTestResult
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.ProgressBar
 *  androidx.appcompat.app.a
 *  androidx.appcompat.app.c
 *  androidx.appcompat.app.c$a
 *  com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$g
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.e$a
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.e$b
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.e$d
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.e$e
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.e$f
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.e$k
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.e$l
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.e$n
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.e$o
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.e$p
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.e$r
 *  e.e.d.a
 *  e.e.d.b
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Message;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.c;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.e;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class e
extends WebChromeClient
implements PluginRegistry.ActivityResultListener,
InAppBrowserActivity.g {
    public static Map<Integer, Message> j = new HashMap();
    private static int k = 0;
    protected static final FrameLayout.LayoutParams l = new FrameLayout.LayoutParams(-1, -1, 17);
    private com.pichillilorenzo.flutter_inappwebview.InAppWebView.c b;
    private InAppBrowserActivity c;
    public MethodChannel d;
    private Uri e;
    private View f;
    private WebChromeClient.CustomViewCallback g;
    private int h;
    private int i;

    public e(Object object) {
        if (object instanceof InAppBrowserActivity) {
            this.c = (InAppBrowserActivity)object;
            this.c.p.add((Object)this);
        } else if (object instanceof com.pichillilorenzo.flutter_inappwebview.InAppWebView.c) {
            this.b = (com.pichillilorenzo.flutter_inappwebview.InAppWebView.c)object;
        }
        InAppBrowserActivity inAppBrowserActivity = this.c;
        MethodChannel methodChannel = inAppBrowserActivity != null ? inAppBrowserActivity.d : this.b.c;
        this.d = methodChannel;
        PluginRegistry.Registrar registrar = f.g.a.q.b;
        if (registrar != null) {
            registrar.addActivityResultListener((PluginRegistry.ActivityResultListener)this);
            return;
        }
        f.g.a.q.e.addActivityResultListener((PluginRegistry.ActivityResultListener)this);
    }

    private Intent a(String[] arrstring, boolean bl) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", e.super.c(arrstring));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", bl);
        return intent;
    }

    private File a(String string2) {
        String string3;
        String string4;
        boolean bl = string2.equals((Object)"android.media.action.IMAGE_CAPTURE");
        String string5 = "";
        if (bl) {
            string5 = Environment.DIRECTORY_PICTURES;
            string3 = "image-";
            string4 = ".jpg";
        } else if (string2.equals((Object)"android.media.action.VIDEO_CAPTURE")) {
            string5 = Environment.DIRECTORY_MOVIES;
            string3 = "video-";
            string4 = ".mp4";
        } else {
            string4 = string3 = string5;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(String.valueOf((long)System.currentTimeMillis()));
        stringBuilder.append(string4);
        String string6 = stringBuilder.toString();
        if (Build.VERSION.SDK_INT < 23) {
            return new File(Environment.getExternalStoragePublicDirectory((String)string5), string6);
        }
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity == null) {
            inAppBrowserActivity = f.g.a.q.f;
        }
        return File.createTempFile((String)string6, (String)string4, (File)inAppBrowserActivity.getApplicationContext().getExternalFilesDir(null));
    }

    private Boolean a(String[] arrstring) {
        String[] arrstring2 = e.super.c(arrstring);
        boolean bl = e.super.d(arrstring2).booleanValue() || e.super.a(arrstring2, "image").booleanValue();
        return bl;
    }

    private Boolean a(String[] arrstring, String string2) {
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!arrstring[i2].contains((CharSequence)string2)) continue;
            return true;
        }
        return false;
    }

    private Uri[] a(Intent intent, int n2) {
        if (intent == null) {
            return null;
        }
        if (intent.getData() != null) {
            if (n2 == -1 && Build.VERSION.SDK_INT >= 21) {
                return WebChromeClient.FileChooserParams.parseResult((int)n2, (Intent)intent);
            }
            return null;
        }
        ClipData clipData = intent.getClipData();
        Uri[] arruri = null;
        if (clipData != null) {
            int n3 = intent.getClipData().getItemCount();
            arruri = new Uri[n3];
            for (int i2 = 0; i2 < n3; ++i2) {
                arruri[i2] = intent.getClipData().getItemAt(i2).getUri();
            }
        }
        return arruri;
    }

    private Boolean b(String[] arrstring) {
        String[] arrstring2 = e.super.c(arrstring);
        boolean bl = e.super.d(arrstring2).booleanValue() || e.super.a(arrstring2, "video").booleanValue();
        return bl;
    }

    private String b(String string2) {
        if (string2 != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(string2);
        }
        return null;
    }

    private Uri c(String string2) {
        File file;
        try {
            file = e.super.a(string2);
        }
        catch (IOException iOException) {
            Log.e((String)"IABWebChromeClient", (String)"Error occurred while creating the File", (Throwable)iOException);
            iOException.printStackTrace();
            file = null;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile((File)file);
        }
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity == null) {
            inAppBrowserActivity = f.g.a.q.f;
        }
        String string3 = inAppBrowserActivity.getApplicationContext().getPackageName();
        Context context = inAppBrowserActivity.getApplicationContext();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(".");
        stringBuilder.append("flutter_inappwebview.fileprovider");
        return e.e.d.b.getUriForFile((Context)context, (String)stringBuilder.toString(), (File)file);
    }

    private String[] c(String[] arrstring) {
        if (e.super.d(arrstring).booleanValue()) {
            return new String[]{"*/*"};
        }
        String[] arrstring2 = new String[arrstring.length];
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            String string2 = arrstring[i2];
            arrstring2[i2] = string2.matches("\\.\\w+") ? e.super.b(string2.replace((CharSequence)".", (CharSequence)"")) : string2;
        }
        return arrstring2;
    }

    private Intent d() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        this.e = this.c("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", (Parcelable)this.e);
        return intent;
    }

    private Boolean d(String[] arrstring) {
        boolean bl;
        block3 : {
            block2 : {
                if (arrstring.length == 0) break block2;
                int n2 = arrstring.length;
                bl = false;
                if (n2 != 1) break block3;
                int n3 = arrstring[0].length();
                bl = false;
                if (n3 != 0) break block3;
            }
            bl = true;
        }
        return bl;
    }

    private Intent e() {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        this.e = this.c("android.media.action.VIDEO_CAPTURE");
        intent.putExtra("output", (Parcelable)this.e);
        return intent;
    }

    public void a() {
        this.d.setMethodCallHandler(null);
        ActivityPluginBinding activityPluginBinding = f.g.a.q.e;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        if (this.c != null) {
            this.c = null;
        }
        if (this.b != null) {
            this.b = null;
        }
    }

    public void a(WebView webView, String string2, JsResult jsResult, String string3, String string4) {
        if (string3 != null && !string3.isEmpty()) {
            string2 = string3;
        }
        k k2 = new k(this, jsResult);
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity == null) {
            inAppBrowserActivity = f.g.a.q.f;
        }
        c.a a2 = new c.a((Context)inAppBrowserActivity, f.g.a.p.Theme_AppCompat_Dialog_Alert);
        a2.a((CharSequence)string2);
        if (string4 != null && !string4.isEmpty()) {
            a2.b((CharSequence)string4, (DialogInterface.OnClickListener)k2);
        } else {
            a2.b(17039370, (DialogInterface.OnClickListener)k2);
        }
        a2.a((DialogInterface.OnCancelListener)new l(this, jsResult));
        a2.a().show();
    }

    public void a(WebView webView, String string2, JsResult jsResult, String string3, String string4, String string5) {
        if (string3 != null && !string3.isEmpty()) {
            string2 = string3;
        }
        d d2 = new d(this, jsResult);
        e e2 = new e(this, jsResult);
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity == null) {
            inAppBrowserActivity = f.g.a.q.f;
        }
        c.a a2 = new c.a((Context)inAppBrowserActivity, f.g.a.p.Theme_AppCompat_Dialog_Alert);
        a2.a((CharSequence)string2);
        if (string4 != null && !string4.isEmpty()) {
            a2.b((CharSequence)string4, (DialogInterface.OnClickListener)d2);
        } else {
            a2.b(17039370, (DialogInterface.OnClickListener)d2);
        }
        if (string5 != null && !string5.isEmpty()) {
            a2.a((CharSequence)string5, (DialogInterface.OnClickListener)e2);
        } else {
            a2.a(17039360, (DialogInterface.OnClickListener)e2);
        }
        a2.a((DialogInterface.OnCancelListener)new f(this, jsResult));
        a2.a().show();
    }

    public void a(WebView webView, String string2, String string3, JsPromptResult jsPromptResult, String string4, String string5, String string6, String string7, String string8) {
        FrameLayout frameLayout = new FrameLayout(webView.getContext());
        EditText editText = new EditText(webView.getContext());
        editText.setMaxLines(1);
        if (string5 != null && !string5.isEmpty()) {
            string3 = string5;
        }
        editText.setText((CharSequence)string3);
        editText.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setPaddingRelative(45, 15, 45, 0);
        frameLayout.addView((View)editText);
        if (string4 != null && !string4.isEmpty()) {
            string2 = string4;
        }
        r r2 = new r((e)this, editText, jsPromptResult, string6);
        a a2 = new a((e)this, jsPromptResult);
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity == null) {
            inAppBrowserActivity = f.g.a.q.f;
        }
        c.a a3 = new c.a((Context)inAppBrowserActivity, f.g.a.p.Theme_AppCompat_Dialog_Alert);
        a3.a((CharSequence)string2);
        if (string8 != null && !string8.isEmpty()) {
            a3.b((CharSequence)string8, (DialogInterface.OnClickListener)r2);
        } else {
            a3.b(17039370, (DialogInterface.OnClickListener)r2);
        }
        if (string7 != null && !string7.isEmpty()) {
            a3.a((CharSequence)string7, (DialogInterface.OnClickListener)a2);
        } else {
            a3.a(17039360, (DialogInterface.OnClickListener)a2);
        }
        a3.a((DialogInterface.OnCancelListener)new b((e)this, jsPromptResult));
        androidx.appcompat.app.c c2 = a3.a();
        c2.a((View)frameLayout);
        c2.show();
    }

    public boolean a(ValueCallback<Uri[]> valueCallback, Intent intent, String[] arrstring, boolean bl) {
        f.g.a.g.j = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (!this.c()) {
            if (e.super.a(arrstring).booleanValue()) {
                arrayList.add((Object)e.super.d());
            }
            if (e.super.b(arrstring).booleanValue()) {
                arrayList.add((Object)e.super.e());
            }
        }
        Intent intent2 = e.super.a(arrstring, bl);
        Intent intent3 = new Intent("android.intent.action.CHOOSER");
        intent3.putExtra("android.intent.extra.INTENT", (Parcelable)intent2);
        intent3.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])arrayList.toArray((Object[])new Parcelable[0]));
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity == null) {
            inAppBrowserActivity = f.g.a.q.f;
        }
        if (intent3.resolveActivity(inAppBrowserActivity.getPackageManager()) != null) {
            inAppBrowserActivity.startActivityForResult(intent3, 1);
            return true;
        }
        Log.d((String)"IABWebChromeClient", (String)"there is no Activity to handle this Intent");
        return true;
    }

    protected ViewGroup b() {
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity == null) {
            inAppBrowserActivity = f.g.a.q.f;
        }
        return (ViewGroup)inAppBrowserActivity.findViewById(16908290);
    }

    public void b(WebView webView, String string2, JsResult jsResult, String string3, String string4, String string5) {
        if (string3 != null && !string3.isEmpty()) {
            string2 = string3;
        }
        n n2 = new n(this, jsResult);
        o o2 = new o(this, jsResult);
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity == null) {
            inAppBrowserActivity = f.g.a.q.f;
        }
        c.a a2 = new c.a((Context)inAppBrowserActivity, f.g.a.p.Theme_AppCompat_Dialog_Alert);
        a2.a((CharSequence)string2);
        if (string4 != null && !string4.isEmpty()) {
            a2.b((CharSequence)string4, (DialogInterface.OnClickListener)n2);
        } else {
            a2.b(17039370, (DialogInterface.OnClickListener)n2);
        }
        if (string5 != null && !string5.isEmpty()) {
            a2.a((CharSequence)string5, (DialogInterface.OnClickListener)o2);
        } else {
            a2.a(17039360, (DialogInterface.OnClickListener)o2);
        }
        a2.a((DialogInterface.OnCancelListener)new p(this, jsResult));
        a2.a().show();
    }

    protected boolean c() {
        boolean bl;
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity == null) {
            inAppBrowserActivity = f.g.a.q.f;
        }
        PackageManager packageManager = inAppBrowserActivity.getPackageManager();
        bl = true;
        try {
            int n2;
            if (Arrays.asList((Object[])packageManager.getPackageInfo((String)inAppBrowserActivity.getApplicationContext().getPackageName(), (int)4096).requestedPermissions).contains((Object)"android.permission.CAMERA") && (n2 = e.e.d.a.a((Context)inAppBrowserActivity, (String)"android.permission.CAMERA")) != 0) {
                return bl;
            }
            bl = false;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        return bl;
    }

    public Bitmap getDefaultVideoPoster() {
        if (this.f == null) {
            return null;
        }
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity == null) {
            inAppBrowserActivity = f.g.a.q.f;
        }
        return BitmapFactory.decodeResource((Resources)inAppBrowserActivity.getApplicationContext().getResources(), (int)2130837573);
    }

    @Override
    public boolean onActivityResult(int n2, int n3, Intent intent) {
        if (f.g.a.g.j == null && f.g.a.g.i == null) {
            return true;
        }
        if (n2 != 1) {
            if (n2 == 3) {
                Uri uri = n3 != -1 ? null : (intent == null ? this.e : intent.getData());
                f.g.a.g.i.onReceiveValue((Object)uri);
            }
        } else if (n3 != -1) {
            ValueCallback<Uri[]> valueCallback = f.g.a.g.j;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else {
            Uri[] arruri = e.super.a(intent, n3);
            if (arruri != null) {
                f.g.a.g.j.onReceiveValue((Object)arruri);
            } else {
                ValueCallback<Uri[]> valueCallback = f.g.a.g.j;
                Uri[] arruri2 = new Uri[]{this.e};
                valueCallback.onReceiveValue((Object)arruri2);
            }
        }
        f.g.a.g.j = null;
        f.g.a.g.i = null;
        this.e = null;
        return true;
    }

    public void onCloseWindow(WebView webView) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        this.d.invokeMethod("onCloseWindow", (Object)hashMap);
        super.onCloseWindow(webView);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"message", (Object)consoleMessage.message());
        hashMap.put((Object)"messageLevel", (Object)consoleMessage.messageLevel().ordinal());
        this.d.invokeMethod("onConsoleMessage", (Object)hashMap);
        return true;
    }

    public boolean onCreateWindow(WebView webView, boolean bl, boolean bl2, Message message) {
        final int n2 = k = 1 + k;
        String string2 = webView.getHitTestResult().getExtra();
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)string2);
        hashMap.put((Object)"windowId", (Object)n2);
        hashMap.put((Object)"androidIsDialog", (Object)bl);
        hashMap.put((Object)"androidIsUserGesture", (Object)bl2);
        hashMap.put((Object)"iosWKNavigationType", null);
        hashMap.put((Object)"iosIsForMainFrame", null);
        j.put((Object)n2, (Object)message);
        this.d.invokeMethod("onCreateWindow", (Object)hashMap, new MethodChannel.Result((e)this){

            @Override
            public void error(String string2, String string3, Object object) {
                if (e.j.containsKey((Object)n2)) {
                    e.j.remove((Object)n2);
                }
            }

            @Override
            public void notImplemented() {
                if (e.j.containsKey((Object)n2)) {
                    e.j.remove((Object)n2);
                }
            }

            @Override
            public void success(Object object) {
                boolean bl = object instanceof Boolean ? (Boolean)object : false;
                if (!bl && e.j.containsKey((Object)n2)) {
                    e.j.remove((Object)n2);
                }
            }
        });
        return true;
    }

    public void onGeolocationPermissionsHidePrompt() {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        this.d.invokeMethod("onGeolocationPermissionsHidePrompt", (Object)hashMap);
    }

    public void onGeolocationPermissionsShowPrompt(final String string2, final GeolocationPermissions.Callback callback) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"origin", (Object)string2);
        this.d.invokeMethod("onGeolocationPermissionsShowPrompt", (Object)hashMap, new MethodChannel.Result((e)this){

            @Override
            public void error(String string22, String string3, Object object) {
                callback.invoke(string2, false, false);
            }

            @Override
            public void notImplemented() {
                callback.invoke(string2, false, false);
            }

            @Override
            public void success(Object object) {
                Map map = (Map)object;
                if (map != null) {
                    callback.invoke((String)map.get((Object)"origin"), ((Boolean)map.get((Object)"allow")).booleanValue(), ((Boolean)map.get((Object)"retain")).booleanValue());
                    return;
                }
                callback.invoke(string2, false, false);
            }
        });
    }

    public void onHideCustomView() {
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity == null) {
            inAppBrowserActivity = f.g.a.q.f;
        }
        ViewGroup viewGroup = this.b();
        ((FrameLayout)viewGroup).removeView(this.f);
        this.f = null;
        viewGroup.setSystemUiVisibility(this.i);
        inAppBrowserActivity.setRequestedOrientation(this.h);
        this.g.onCustomViewHidden();
        this.g = null;
        inAppBrowserActivity.getWindow().clearFlags(512);
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity2 = this.c;
        if (inAppBrowserActivity2 != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity2.f);
        }
        this.d.invokeMethod("onExitFullscreen", (Object)hashMap);
    }

    public boolean onJsAlert(final WebView webView, String string2, final String string3, final JsResult jsResult) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)string2);
        hashMap.put((Object)"message", (Object)string3);
        hashMap.put((Object)"iosIsMainFrame", null);
        this.d.invokeMethod("onJsAlert", (Object)hashMap, new MethodChannel.Result(){

            @Override
            public void error(String string2, String string32, Object object) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(", ");
                stringBuilder.append(string32);
                Log.e((String)"IABWebChromeClient", (String)stringBuilder.toString());
                jsResult.cancel();
            }

            @Override
            public void notImplemented() {
                e.this.a(webView, string3, jsResult, null, null);
            }

            @Override
            public void success(Object object) {
                String string2;
                String string32;
                if (object != null) {
                    Map map = (Map)object;
                    String string4 = (String)map.get((Object)"message");
                    String string5 = (String)map.get((Object)"confirmButtonTitle");
                    Boolean bl = (Boolean)map.get((Object)"handledByClient");
                    if (bl != null && bl.booleanValue()) {
                        Integer n2 = (Integer)map.get((Object)"action");
                        int n3 = n2 != null ? n2 : 1;
                        if (Integer.valueOf((int)n3) != 0) {
                            jsResult.cancel();
                            return;
                        }
                        jsResult.confirm();
                        return;
                    }
                    string2 = string4;
                    string32 = string5;
                } else {
                    string2 = null;
                    string32 = null;
                }
                e.this.a(webView, string3, jsResult, string2, string32);
            }
        });
        return true;
    }

    public boolean onJsBeforeUnload(final WebView webView, String string2, final String string3, final JsResult jsResult) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)string2);
        hashMap.put((Object)"message", (Object)string3);
        hashMap.put((Object)"iosIsMainFrame", null);
        this.d.invokeMethod("onJsBeforeUnload", (Object)hashMap, new MethodChannel.Result(){

            @Override
            public void error(String string2, String string32, Object object) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(", ");
                stringBuilder.append(string32);
                Log.e((String)"IABWebChromeClient", (String)stringBuilder.toString());
                jsResult.cancel();
            }

            @Override
            public void notImplemented() {
                e.this.b(webView, string3, jsResult, null, null, null);
            }

            @Override
            public void success(Object object) {
                String string2;
                String string32;
                String string4;
                if (object != null) {
                    Map map = (Map)object;
                    String string5 = (String)map.get((Object)"message");
                    String string6 = (String)map.get((Object)"confirmButtonTitle");
                    String string7 = (String)map.get((Object)"cancelButtonTitle");
                    Boolean bl = (Boolean)map.get((Object)"handledByClient");
                    if (bl != null && bl.booleanValue()) {
                        Integer n2 = (Integer)map.get((Object)"action");
                        int n3 = n2 != null ? n2 : 1;
                        if (Integer.valueOf((int)n3) != 0) {
                            jsResult.cancel();
                            return;
                        }
                        jsResult.confirm();
                        return;
                    }
                    string4 = string5;
                    string32 = string6;
                    string2 = string7;
                } else {
                    string4 = null;
                    string32 = null;
                    string2 = null;
                }
                e.this.a(webView, string3, jsResult, string4, string32, string2);
            }
        });
        return true;
    }

    public boolean onJsConfirm(final WebView webView, String string2, final String string3, final JsResult jsResult) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)string2);
        hashMap.put((Object)"message", (Object)string3);
        hashMap.put((Object)"iosIsMainFrame", null);
        this.d.invokeMethod("onJsConfirm", (Object)hashMap, new MethodChannel.Result(){

            @Override
            public void error(String string2, String string32, Object object) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(", ");
                stringBuilder.append(string32);
                Log.e((String)"IABWebChromeClient", (String)stringBuilder.toString());
                jsResult.cancel();
            }

            @Override
            public void notImplemented() {
                e.this.b(webView, string3, jsResult, null, null, null);
            }

            @Override
            public void success(Object object) {
                String string2;
                String string32;
                String string4;
                if (object != null) {
                    Map map = (Map)object;
                    String string5 = (String)map.get((Object)"message");
                    String string6 = (String)map.get((Object)"confirmButtonTitle");
                    String string7 = (String)map.get((Object)"cancelButtonTitle");
                    Boolean bl = (Boolean)map.get((Object)"handledByClient");
                    if (bl != null && bl.booleanValue()) {
                        Integer n2 = (Integer)map.get((Object)"action");
                        int n3 = n2 != null ? n2 : 1;
                        if (Integer.valueOf((int)n3) != 0) {
                            jsResult.cancel();
                            return;
                        }
                        jsResult.confirm();
                        return;
                    }
                    string4 = string5;
                    string32 = string6;
                    string2 = string7;
                } else {
                    string4 = null;
                    string32 = null;
                    string2 = null;
                }
                e.this.b(webView, string3, jsResult, string4, string32, string2);
            }
        });
        return true;
    }

    public boolean onJsPrompt(final WebView webView, String string2, final String string3, final String string4, final JsPromptResult jsPromptResult) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)string2);
        hashMap.put((Object)"message", (Object)string3);
        hashMap.put((Object)"defaultValue", (Object)string4);
        hashMap.put((Object)"iosIsMainFrame", null);
        MethodChannel methodChannel = this.d;
        MethodChannel.Result result = new MethodChannel.Result(){

            @Override
            public void error(String string2, String string32, Object object) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(", ");
                stringBuilder.append(string32);
                Log.e((String)"IABWebChromeClient", (String)stringBuilder.toString());
                jsPromptResult.cancel();
            }

            @Override
            public void notImplemented() {
                e.this.a(webView, string3, string4, jsPromptResult, null, null, null, null, null);
            }

            @Override
            public void success(Object object) {
                String string2;
                String string32;
                String string42;
                String string5;
                String string6;
                if (object != null) {
                    Map map = (Map)object;
                    String string7 = (String)map.get((Object)"message");
                    String string8 = (String)map.get((Object)"defaultValue");
                    String string9 = (String)map.get((Object)"confirmButtonTitle");
                    String string10 = (String)map.get((Object)"cancelButtonTitle");
                    String string11 = (String)map.get((Object)"value");
                    Boolean bl = (Boolean)map.get((Object)"handledByClient");
                    if (bl != null && bl.booleanValue()) {
                        Integer n2 = (Integer)map.get((Object)"action");
                        int n3 = n2 != null ? n2 : 1;
                        if (Integer.valueOf((int)n3) != 0) {
                            jsPromptResult.cancel();
                            return;
                        }
                        jsPromptResult.confirm(string11);
                        return;
                    }
                    string2 = string7;
                    string5 = string8;
                    string6 = string9;
                    string32 = string10;
                    string42 = string11;
                } else {
                    string2 = null;
                    string5 = null;
                    string42 = null;
                    string32 = null;
                    string6 = null;
                }
                e.this.a(webView, string3, string4, jsPromptResult, string2, string5, string42, string32, string6);
            }
        };
        methodChannel.invokeMethod("onJsPrompt", (Object)hashMap, result);
        return true;
    }

    public void onPermissionRequest(final PermissionRequest permissionRequest) {
        if (Build.VERSION.SDK_INT >= 23) {
            HashMap hashMap = new HashMap();
            InAppBrowserActivity inAppBrowserActivity = this.c;
            if (inAppBrowserActivity != null) {
                hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
            }
            hashMap.put((Object)"origin", (Object)permissionRequest.getOrigin().toString());
            hashMap.put((Object)"resources", (Object)Arrays.asList((Object[])permissionRequest.getResources()));
            this.d.invokeMethod("onPermissionRequest", (Object)hashMap, new MethodChannel.Result((e)this){

                @Override
                public void error(String string2, String string3, Object object) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append(", ");
                    stringBuilder.append(string3);
                    Log.e((String)"IABWebChromeClient", (String)stringBuilder.toString());
                }

                @Override
                public void notImplemented() {
                    permissionRequest.deny();
                }

                @Override
                public void success(Object object) {
                    if (object != null) {
                        Map map = (Map)object;
                        Integer n2 = (Integer)map.get((Object)"action");
                        List list = (List)map.get((Object)"resources");
                        if (list == null) {
                            list = new ArrayList();
                        }
                        String[] arrstring = (String[])list.toArray((Object[])new String[list.size()]);
                        if (n2 != null) {
                            if (n2 != 1) {
                                permissionRequest.deny();
                                return;
                            }
                            permissionRequest.grant(arrstring);
                            return;
                        }
                    }
                    permissionRequest.deny();
                }
            });
        }
    }

    public void onProgressChanged(WebView webView, int n2) {
        ProgressBar progressBar;
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity != null && (progressBar = inAppBrowserActivity.m) != null) {
            progressBar.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 24) {
                this.c.m.setProgress(n2, true);
            } else {
                this.c.m.setProgress(n2);
            }
            if (n2 == 100) {
                this.c.m.setVisibility(8);
            }
        }
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity2 = this.c;
        if (inAppBrowserActivity2 != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity2.f);
        }
        hashMap.put((Object)"progress", (Object)n2);
        this.d.invokeMethod("onProgressChanged", (Object)hashMap);
        super.onProgressChanged(webView, n2);
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        block3 : {
            super.onReceivedIcon(webView, bitmap);
            byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)byteArrayOutputStream);
            try {
                byteArrayOutputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                String string2 = iOException.getMessage();
                if (string2 == null) break block3;
                Log.e((String)"IABWebChromeClient", (String)string2);
            }
        }
        bitmap.recycle();
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"icon", (Object)byteArrayOutputStream.toByteArray());
        this.d.invokeMethod("onReceivedIcon", (Object)hashMap);
    }

    public void onReceivedTitle(WebView webView, String string2) {
        super.onReceivedTitle(webView, string2);
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity != null && inAppBrowserActivity.h != null && inAppBrowserActivity.k.d.isEmpty()) {
            this.c.h.a((CharSequence)string2);
        }
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity2 = this.c;
        if (inAppBrowserActivity2 != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity2.f);
        }
        hashMap.put((Object)"title", (Object)string2);
        this.d.invokeMethod("onTitleChanged", (Object)hashMap);
    }

    public void onReceivedTouchIconUrl(WebView webView, String string2, boolean bl) {
        super.onReceivedTouchIconUrl(webView, string2, bl);
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        hashMap.put((Object)"url", (Object)string2);
        hashMap.put((Object)"precomposed", (Object)bl);
        this.d.invokeMethod("onReceivedTouchIconUrl", (Object)hashMap);
    }

    public void onRequestFocus(WebView webView) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity.f);
        }
        this.d.invokeMethod("onRequestFocus", (Object)hashMap);
        super.onCloseWindow(webView);
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.f != null) {
            this.onHideCustomView();
            return;
        }
        InAppBrowserActivity inAppBrowserActivity = this.c;
        if (inAppBrowserActivity == null) {
            inAppBrowserActivity = f.g.a.q.f;
        }
        ViewGroup viewGroup = this.b();
        this.f = view;
        this.i = viewGroup.getSystemUiVisibility();
        this.h = inAppBrowserActivity.getRequestedOrientation();
        this.g = customViewCallback;
        this.f.setBackgroundColor(-16777216);
        int n2 = Build.VERSION.SDK_INT >= 19 ? 7942 : 1798;
        viewGroup.setSystemUiVisibility(n2);
        inAppBrowserActivity.getWindow().setFlags(512, 512);
        ((FrameLayout)viewGroup).addView(this.f, (ViewGroup.LayoutParams)l);
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity2 = this.c;
        if (inAppBrowserActivity2 != null) {
            hashMap.put((Object)"uuid", (Object)inAppBrowserActivity2.f);
        }
        this.d.invokeMethod("onEnterFullscreen", (Object)hashMap);
    }

    @TargetApi(value=21)
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        int n2;
        String[] arrstring = fileChooserParams.getAcceptTypes();
        int n3 = fileChooserParams.getMode();
        if (n3 != (n2 = 1)) {
            n2 = 0;
        }
        return this.a(valueCallback, fileChooserParams.createIntent(), arrstring, (boolean)n2);
    }

}

