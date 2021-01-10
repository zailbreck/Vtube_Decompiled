/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  android.webkit.WebView
 *  com.mintegral.msdk.video.module.MintegralVideoView
 *  com.mintegral.msdk.video.module.MintegralVideoView$f
 *  f.f.a.a
 *  f.f.a.e.f.l
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package f.f.a.r.b.a;

import android.util.Base64;
import android.webkit.WebView;
import com.mintegral.msdk.video.module.MintegralVideoView;
import f.f.a.a;
import f.f.a.k.g.i;
import f.f.a.r.b.a.e;
import org.json.JSONObject;

public final class l
extends e {
    private WebView a;

    public l(WebView webView) {
        this.a = webView;
    }

    private String a(int n2, int n3) {
        if (n3 != 0) {
            double d2 = (float)n2 / (float)n3;
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(f.f.a.e.f.l.a((Double)d2));
                stringBuilder.append("");
                String string = stringBuilder.toString();
                return string;
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append("");
        return stringBuilder.toString();
    }

    @Override
    public final void a(int n2) {
        super.a(n2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", n2);
            String string = Base64.encodeToString((byte[])jSONObject.toString().getBytes(), (int)2);
            i.a().a(this.a, "onVideoStatusNotify", string);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    @Override
    public final void a(int n2, int n3, int n4, int n5) {
        JSONObject jSONObject;
        String string;
        JSONObject jSONObject2;
        block6 : {
            super.a(n2, n3, n4, n5);
            try {
                jSONObject2 = new JSONObject();
                jSONObject = new JSONObject();
                string = "landscape";
                if (n2 == 2) {
                    if (n3 != 1) break block6;
                } else if (n3 == 2) break block6;
                string = "portrait";
            }
            catch (Exception exception) {
                if (a.a) {
                    exception.printStackTrace();
                }
                return;
            }
        }
        jSONObject.put("orientation", (Object)string);
        jSONObject.put("screen_width", n4);
        jSONObject.put("screen_height", n5);
        jSONObject2.put("data", (Object)jSONObject);
        String string2 = Base64.encodeToString((byte[])jSONObject2.toString().getBytes(), (int)2);
        i.a().a(this.a, "showDataInfo", string2);
    }

    @Override
    public final void a(int n2, String string) {
        super.a(n2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", n2);
            jSONObject.put("pt", (Object)string);
            String string2 = Base64.encodeToString((byte[])jSONObject.toString().getBytes(), (int)2);
            i.a().a(this.a, "onJSClick", string2);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    @Override
    public final void a(MintegralVideoView.f f2) {
        super.a(f2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", (Object)l.super.a(f2.a, f2.b));
            jSONObject.put("time", (Object)String.valueOf((int)f2.a));
            jSONObject.put("duration", (Object)String.valueOf((int)f2.b));
            String string = Base64.encodeToString((byte[])jSONObject.toString().getBytes(), (int)2);
            i.a().a(this.a, "onVideoProgressNotify", string);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    @Override
    public final void a(Object object) {
        super.a(object);
        String string = object != null && object instanceof String ? Base64.encodeToString((byte[])object.toString().getBytes(), (int)2) : "";
        i.a().a(this.a, "webviewshow", string);
    }
}

