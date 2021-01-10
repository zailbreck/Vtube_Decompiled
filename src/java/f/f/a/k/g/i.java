/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.webkit.WebView
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package f.f.a.k.g;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import f.f.a.k.g.b;
import f.f.a.k.g.c;
import f.f.a.k.g.l;
import org.json.JSONObject;

public final class i {
    private static i a = new i();

    private i() {
    }

    public static i a() {
        return a;
    }

    public final void a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", (Object)"1.0.0");
            String string2 = Base64.encodeToString((byte[])jSONObject.toString().getBytes(), (int)2);
            a.a(webView, "onJSBridgeConnected", string2);
            return;
        }
        catch (Exception | Throwable exception) {
            a.a(webView, "onJSBridgeConnected", "");
            return;
        }
    }

    public final void a(WebView webView, String string2, String string3) {
        String string4 = TextUtils.isEmpty((CharSequence)string3) ? String.format((String)"javascript:window.WindVane.fireEvent('%s', '');", (Object[])new Object[]{string2}) : String.format((String)"javascript:window.WindVane.fireEvent('%s','%s');", (Object[])new Object[]{string2, l.c(string3)});
        if (webView != null) {
            if (webView instanceof b && ((b)webView).d()) {
                return;
            }
            try {
                webView.loadUrl(string4);
                return;
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public final void a(Object object, String string2) {
        if (object instanceof c) {
            String string3;
            c c2 = (c)object;
            if (TextUtils.isEmpty((CharSequence)string2)) {
                Object[] arrobject = new Object[]{c2.g};
                string3 = String.format((String)"javascript:window.WindVane.onSuccess(%s,'');", (Object[])arrobject);
            } else {
                String string4 = l.c(string2);
                Object[] arrobject = new Object[]{c2.g, string4};
                string3 = String.format((String)"javascript:window.WindVane.onSuccess(%s,'%s');", (Object[])arrobject);
            }
            b b2 = c2.a;
            if (b2 != null && !b2.d()) {
                try {
                    c2.a.loadUrl(string3);
                    return;
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }
}

