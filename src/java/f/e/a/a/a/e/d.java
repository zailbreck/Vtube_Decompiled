/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.webkit.WebView
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONObject
 */
package f.e.a.a.a.e;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import f.e.a.a.a.g.c;
import org.json.JSONObject;

public class d {
    private static d a = new d();

    private d() {
    }

    public static d a() {
        return a;
    }

    public void a(WebView webView) {
        this.a(webView, "finishSession", new Object[0]);
    }

    public void a(WebView webView, float f2) {
        Object[] arrobject = new Object[]{Float.valueOf((float)f2)};
        this.a(webView, "setDeviceVolume", arrobject);
    }

    public void a(WebView webView, String string, JSONObject jSONObject) {
        if (jSONObject != null) {
            this.a(webView, "publishVideoEvent", new Object[]{string, jSONObject});
            return;
        }
        this.a(webView, "publishVideoEvent", string);
    }

    public void a(WebView webView, String string, JSONObject jSONObject, JSONObject jSONObject2) {
        this.a(webView, "startSession", new Object[]{string, jSONObject, jSONObject2});
    }

    /* varargs */ void a(WebView webView, String string, Object ... arrobject) {
        if (webView != null) {
            StringBuilder stringBuilder = new StringBuilder(128);
            stringBuilder.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            stringBuilder.append(string);
            stringBuilder.append("(");
            this.a(stringBuilder, arrobject);
            stringBuilder.append(")}");
            this.a(webView, stringBuilder);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The WebView is null for ");
        stringBuilder.append(string);
        c.a(stringBuilder.toString());
    }

    void a(final WebView webView, StringBuilder stringBuilder) {
        final String string = stringBuilder.toString();
        Handler handler = webView.getHandler();
        if (handler != null && Looper.myLooper() != handler.getLooper()) {
            handler.post(new Runnable((d)this){

                public void run() {
                    webView.loadUrl(string);
                }
            });
            return;
        }
        webView.loadUrl(string);
    }

    public void a(WebView webView, JSONObject jSONObject) {
        this.a(webView, "init", new Object[]{jSONObject});
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    void a(StringBuilder var1, Object[] var2_2) {
        if (var2_2 == null) return;
        if (var2_2.length <= 0) return;
        var3_3 = var2_2.length;
        var4_4 = 0;
        do {
            block6 : {
                if (var4_4 >= var3_3) {
                    var1.setLength(-1 + var1.length());
                    return;
                }
                var5_6 = var2_2[var4_4];
                if (var5_6 != null) break block6;
                var1.append('\"');
                ** GOTO lbl21
            }
            if (var5_6 instanceof String) {
                var8_5 = var5_6.toString();
                if (var8_5.startsWith("{")) {
                    var1.append(var8_5);
                } else {
                    var1.append('\"');
                    var1.append(var8_5);
lbl21: // 2 sources:
                    var1.append('\"');
                }
            } else {
                var1.append(var5_6);
            }
            var1.append(",");
            ++var4_4;
        } while (true);
    }

    public boolean a(WebView webView, String string) {
        if (webView != null && !TextUtils.isEmpty((CharSequence)string)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("javascript: ");
            stringBuilder.append(string);
            webView.loadUrl(stringBuilder.toString());
            return true;
        }
        return false;
    }

    public void b(WebView webView) {
        this.a(webView, "publishImpressionEvent", new Object[0]);
    }

    public void b(WebView webView, String string) {
        if (string != null) {
            this.a(webView, "var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);".replace((CharSequence)"%SCRIPT_SRC%", (CharSequence)string));
        }
    }

    public void c(WebView webView, String string) {
        this.a(webView, "setNativeViewHierarchy", string);
    }

    public void d(WebView webView, String string) {
        this.a(webView, "setState", string);
    }

}

