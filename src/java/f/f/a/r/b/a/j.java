/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.mintegral.msdk.video.module.k.a
 *  f.f.a.e.b.b
 *  f.f.a.e.c.a
 *  f.f.a.e.f.h
 *  f.f.a.e.f.l
 *  f.f.a.g.b
 *  f.f.a.g.c
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package f.f.a.r.b.a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mintegral.msdk.video.module.k.a;
import f.f.a.e.f.h;
import f.f.a.e.f.l;
import f.f.a.g.b;
import f.f.a.r.b.a.c;
import f.f.a.r.b.f;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class j
extends c {
    private Activity n;
    private f.f.a.e.e.a o;
    private List<f.f.a.e.e.a> p;
    private int q;

    public j(Activity activity, f.f.a.e.e.a a2) {
        this.n = activity;
        this.o = a2;
    }

    public j(Activity activity, f.f.a.e.e.a a2, List<f.f.a.e.e.a> list) {
        this.n = activity;
        this.o = a2;
        this.p = list;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private f.f.a.e.e.a a(String string, f.f.a.e.e.a a2) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return a2;
        }
        if (TextUtils.isEmpty((CharSequence)string) && a2 == null) {
            return null;
        }
        if (!string.contains((CharSequence)"notice")) {
            try {
                JSONObject jSONObject = f.f.a.e.e.a.a(a2);
                f.f.a.e.e.a a3 = f.f.a.e.e.a.b(jSONObject);
                if (a3 == null) {
                    a3 = a2;
                }
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    String string2;
                    j.super.a(jSONObject, a3);
                    JSONObject jSONObject2 = new JSONObject(string).optJSONObject(f.f.a.e.b.b.g);
                    String string3 = "-999";
                    if (jSONObject2 != null) {
                        string3 = String.valueOf((int)l.b((Context)this.n, (float)Integer.valueOf((String)jSONObject2.getString(f.f.a.e.b.b.e)).intValue()));
                        string2 = String.valueOf((int)l.b((Context)this.n, (float)Integer.valueOf((String)jSONObject2.getString(f.f.a.e.b.b.f)).intValue()));
                    } else {
                        string2 = string3;
                    }
                    a3.t(f.f.a.g.c.a((String)a3.F(), (String)string3, (String)string2));
                    String string4 = a3.u0();
                    if (jSONObject2 != null) {
                        Iterator iterator = jSONObject2.keys();
                        StringBuilder stringBuilder = new StringBuilder();
                        while (iterator.hasNext()) {
                            stringBuilder.append("&");
                            String string5 = (String)iterator.next();
                            String string6 = jSONObject2.optString(string5);
                            if (f.f.a.e.b.b.e.equals((Object)string5) || f.f.a.e.b.b.f.equals((Object)string5)) {
                                string6 = String.valueOf((int)l.b((Context)this.n, (float)Integer.valueOf((String)string6).intValue()));
                            }
                            stringBuilder.append(string5);
                            stringBuilder.append("=");
                            stringBuilder.append(string6);
                        }
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(string4);
                        stringBuilder2.append((Object)stringBuilder);
                        a3.P(stringBuilder2.toString());
                    }
                }
                return a3;
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
                return a2;
            }
        }
        try {
            JSONObject jSONObject = f.f.a.e.e.a.a(a2);
            JSONObject jSONObject3 = new JSONObject(string);
            Iterator iterator = jSONObject3.keys();
            do {
                if (!iterator.hasNext()) {
                    f.f.a.e.e.a a4 = f.f.a.e.e.a.b(jSONObject);
                    j.super.a(jSONObject, a4);
                    return a4;
                }
                String string7 = (String)iterator.next();
                jSONObject.put(string7, (Object)jSONObject3.getString(string7));
            } while (true);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return a2;
        }
    }

    private void a(JSONObject jSONObject, f.f.a.e.e.a a2) {
        try {
            String string = jSONObject.optString("unitId");
            if (!TextUtils.isEmpty((CharSequence)string)) {
                a2.s(string);
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private b l() {
        if (this.l == null) {
            this.l = new b(f.f.a.e.c.a.i().e(), this.j);
        }
        return this.l;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public final void a(int var1, String var2_2) {
        block11 : {
            block10 : {
                super.a(var1, var2_2);
                var3_3 = true;
                if (var1 == var3_3) ** GOTO lbl12
                if (var1 == 2) return;
                if (var1 != 3) {
                    return;
                }
                if (this.k != null && this.k.o() == -1) {
                    this.a(new c.b((f)this, this.m));
                }
                this.a((int)var3_3, var2_2);
                return;
lbl12: // 1 sources:
                if (this.o == null && this.p != null && this.p.size() > 0) {
                    this.o = (f.f.a.e.e.a)this.p.get(0);
                }
                if (this.o == null) {
                    return;
                }
                var5_4 = j.super.a(var2_2, this.o);
                var6_5 = var5_4.u0();
                try {
                    var10_6 = Uri.parse((String)var6_5).getQueryParameter(f.f.a.e.b.b.h);
                    if (TextUtils.isEmpty((CharSequence)var10_6)) break block10;
                    var8_7 = Integer.parseInt((String)var10_6);
                    break block11;
                }
                catch (Throwable var7_8) {
                    try {
                        h.b((String)"DefaultJSCommon", (String)"INSTALL", (Throwable)var7_8);
                        break block10;
                    }
                    catch (Throwable var4_10) {
                        h.b((String)"DefaultJSCommon", (String)var4_10.getMessage(), (Throwable)var4_10);
                    }
                }
                return;
            }
            var8_7 = 0;
        }
        var9_9 = this.m;
        if (var8_7 != 2) {
            var3_3 = false;
        }
        var9_9.a(var3_3);
        j.super.l().a((f.f.a.m.f)this.m);
        j.super.l().b(var5_4);
        a.d((Context)f.f.a.e.c.a.i().e(), (f.f.a.e.e.a)var5_4);
    }

    @Override
    public final void a(Activity activity) {
        this.n = activity;
    }

    public final void a(String string) {
    }

    public final void b(boolean bl) {
    }

    public final void c(String string) {
    }

    @Override
    public final void d() {
        super.d();
        try {
            if (this.n != null) {
                this.n.finish();
                return;
            }
        }
        catch (Throwable throwable) {
            h.b((String)"DefaultJSCommon", (String)throwable.getMessage(), (Throwable)throwable);
        }
    }

    public final int k() {
        return this.q;
    }
}

