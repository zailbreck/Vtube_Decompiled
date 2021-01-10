/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 *  android.util.Base64
 *  android.webkit.WebView
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 */
package f.f.a.r.b.a;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import f.f.a.k.g.i;
import f.f.a.r.b.a.a;
import org.json.JSONObject;

public final class h
extends a {
    private WebView a;
    private int b = 0;

    public h(WebView webView) {
        this.a = webView;
    }

    @Override
    public final void a() {
        super.a();
        this.b = 1;
        i.a().a(this.a, "onSystemPause", "");
    }

    @Override
    public final void a(int n2) {
        super.a(n2);
        this.b = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(Configuration configuration) {
        String string;
        JSONObject jSONObject;
        super.a(configuration);
        try {
            jSONObject = new JSONObject();
            int n2 = configuration.orientation;
            string = n2 == 2 ? "landscape" : "portrait";
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        jSONObject.put("orientation", (Object)string);
        String string2 = Base64.encodeToString((byte[])jSONObject.toString().getBytes(), (int)2);
        i.a().a(this.a, "orientation", string2);
    }

    @Override
    public final void b() {
        super.b();
        this.b = 0;
        i.a().a(this.a, "onSystemResume", "");
    }

    @Override
    public final void c() {
        super.c();
        i.a().a(this.a, "onSystemDestory", "");
    }

    @Override
    public final int d() {
        return this.b;
    }

    @Override
    public final void e() {
        super.e();
        i.a().a(this.a, "onSystemBackPressed", "");
    }
}

