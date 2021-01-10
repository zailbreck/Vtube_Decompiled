/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.webkit.ConsoleMessage
 *  android.webkit.ConsoleMessage$MessageLevel
 *  android.webkit.JsPromptResult
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 *  f.f.a.e.f.h
 *  java.lang.CharSequence
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.k.g;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import f.f.a.e.f.h;
import f.f.a.k.g.b;
import f.f.a.k.g.d;
import f.f.a.k.g.f;

public final class m
extends WebChromeClient {
    b a;
    private f b;

    public m(b b2) {
        this.a = b2;
    }

    public final void a(f f2) {
        this.b = f2;
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        d d2 = this.a.getJsBridge();
        if (d2 != null && consoleMessage != null) {
            String string2 = consoleMessage.message();
            if (!TextUtils.isEmpty((CharSequence)string2) && string2.startsWith("mv://")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onConsoleMessage: message.length() = ");
                stringBuilder.append(string2.length());
                stringBuilder.append(" ");
                stringBuilder.append(string2);
                h.a((String)"H5_ENTRY", (String)stringBuilder.toString());
                if (string2.contains((CharSequence)"wv_hybrid:") && d2.b("wv_hybrid:")) {
                    String string3 = string2.substring(0, 1 + string2.lastIndexOf(" "));
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("message = ");
                    stringBuilder2.append(string3);
                    h.a((String)"H5_ENTRY", (String)stringBuilder2.toString());
                    d2.a(string3);
                    return true;
                }
            } else {
                return false;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onJsPrompt(WebView webView, String string2, String string3, String string4, JsPromptResult jsPromptResult) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append("");
        h.d((String)"H5_ENTRY", (String)stringBuilder.toString());
        d d2 = this.a.getJsBridge();
        if (d2 != null && string4 != null && d2.b(string4)) {
            d2.a(string3);
            jsPromptResult.confirm("");
            return true;
        }
        return false;
    }

    public final void onProgressChanged(WebView webView, int n2) {
        super.onProgressChanged(webView, n2);
        f f2 = this.b;
        if (f2 != null) {
            f2.a(webView, n2);
        }
    }
}

