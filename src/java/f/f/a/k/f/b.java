/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONObject
 */
package f.f.a.k.f;

import android.webkit.WebView;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class b {
    public static b a() {
        return a.a;
    }

    private void c(WebView webView, String string) {
        if (webView != null) {
            try {
                webView.loadUrl(string);
                return;
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    public final void a(WebView webView) {
        b.super.c(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    public final void a(WebView webView, double d2) {
        Locale locale = Locale.CHINA;
        Object[] arrobject = new Object[]{d2};
        b.super.c(webView, String.format((Locale)locale, (String)"javascript:window.mraidbridge.audioVolumeChange(%s);", (Object[])arrobject));
    }

    public final void a(WebView webView, float f2, float f3) {
        Locale locale = Locale.CHINA;
        Object[] arrobject = new Object[]{Float.valueOf((float)f2), Float.valueOf((float)f3)};
        b.super.c(webView, String.format((Locale)locale, (String)"javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", (Object[])arrobject));
    }

    public final void a(WebView webView, float f2, float f3, float f4, float f5) {
        Locale locale = Locale.CHINA;
        Object[] arrobject = new Object[]{Float.valueOf((float)f2), Float.valueOf((float)f3), Float.valueOf((float)f4), Float.valueOf((float)f5)};
        this.c(webView, String.format((Locale)locale, (String)"javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", (Object[])arrobject));
    }

    public final void a(WebView webView, String string) {
        b.super.c(webView, String.format((String)"javascript:window.mraidbridge.nativeCallComplete('%s');", (Object[])new Object[]{string}));
    }

    public final void a(WebView webView, String string, String string2) {
        b.super.c(webView, String.format((String)"javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", (Object[])new Object[]{string2, string}));
    }

    public final void a(WebView webView, Map<String, Object> map) {
        if (map != null) {
            if (map.size() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                try {
                    jSONObject.put((String)entry.getKey(), entry.getValue());
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            b.super.c(webView, String.format((String)"javascript:window.mraidbridge.fireChangeEvent(%s);", (Object[])new Object[]{jSONObject.toString()}));
        }
    }

    public final void b(WebView webView, float f2, float f3) {
        Locale locale = Locale.CHINA;
        Object[] arrobject = new Object[]{Float.valueOf((float)f2), Float.valueOf((float)f3)};
        b.super.c(webView, String.format((Locale)locale, (String)"javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", (Object[])arrobject));
    }

    public final void b(WebView webView, float f2, float f3, float f4, float f5) {
        Locale locale = Locale.CHINA;
        Object[] arrobject = new Object[]{Float.valueOf((float)f2), Float.valueOf((float)f3), Float.valueOf((float)f4), Float.valueOf((float)f5)};
        this.c(webView, String.format((Locale)locale, (String)"javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", (Object[])arrobject));
    }

    public final void b(WebView webView, String string) {
        b.super.c(webView, String.format((String)"javascript:window.mraidbridge.setIsViewable(%s);", (Object[])new Object[]{string}));
    }

    private static final class a {
        private static final b a = new b();
    }

}

