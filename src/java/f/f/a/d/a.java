/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.mintegral.msdk.base.common.report.d
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.util.ArrayList
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package f.f.a.d;

import android.content.Context;
import android.text.TextUtils;
import f.e.a.a.a.d.b;
import f.e.a.a.a.d.c;
import f.e.a.a.a.d.d;
import f.e.a.a.a.d.f;
import f.e.a.a.a.d.g;
import f.f.a.e.b.c.e;
import f.f.a.e.f.h;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b a(Context context, boolean bl, String string, String string2, String string3, String string4) {
        if (TextUtils.isEmpty((CharSequence)f.f.a.a.i)) {
            f.f.a.a.i = a.a();
        }
        boolean bl2 = TextUtils.isEmpty((CharSequence)f.f.a.a.i);
        b b2 = null;
        if (!bl2 && !TextUtils.isEmpty((CharSequence)string)) {
            StringBuilder stringBuilder;
            String string5;
            com.mintegral.msdk.base.common.report.d d2;
            try {
                a.a(context);
                g g2 = g.a("Mintegral", "MAL_10.5.01");
                f f2 = f.c;
                b2 = null;
                f f3 = bl ? f.e : f.c;
                c c2 = c.a(f2, f3, false);
                List<f.e.a.a.a.d.h> list = a.a(string, context, string2, string3, string4);
                b2 = b.a(c2, d.a(g2, f.f.a.a.i, list, string2));
                h.a("OMSDK", "adSession create success");
                return b2;
            }
            catch (Exception exception) {
                h.d("OMSDK", exception.getMessage());
                d2 = new com.mintegral.msdk.base.common.report.d(context);
                stringBuilder = new StringBuilder();
                stringBuilder.append("failed, exception ");
                string5 = exception.getMessage();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                h.d("OMSDK", illegalArgumentException.getMessage());
                d2 = new com.mintegral.msdk.base.common.report.d(context);
                stringBuilder = new StringBuilder();
                stringBuilder.append("failed, exception ");
                string5 = illegalArgumentException.getMessage();
            }
            stringBuilder.append(string5);
            d2.b(string2, string3, string4, stringBuilder.toString());
            return b2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("createNativeAdSession: TextUtils.isEmpty(omid) = ");
        stringBuilder.append(TextUtils.isEmpty((CharSequence)string));
        stringBuilder.append(" TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = ");
        stringBuilder.append(TextUtils.isEmpty((CharSequence)f.f.a.a.i));
        h.a("OMSDK", stringBuilder.toString());
        new com.mintegral.msdk.base.common.report.d(context).b(string2, string3, string4, "failed, OMID_JS_SERVICE_CONTENT null or omid null");
        return null;
    }

    private static String a() {
        try {
            String string = f.f.a.e.f.f.a(new File(e.b(f.f.a.e.b.c.c.k), "/omsdk/om_js_content.txt"));
            return string;
        }
        catch (Exception exception) {
            h.a("OMSDK", exception.getMessage());
            return "";
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static List<f.e.a.a.a.d.h> a(String string, Context context, String string2, String string3, String string4) {
        String string5;
        com.mintegral.msdk.base.common.report.d d2;
        StringBuilder stringBuilder;
        ArrayList arrayList;
        block6 : {
            int n2;
            JSONArray jSONArray;
            arrayList = new ArrayList();
            try {
                jSONArray = new JSONArray(string);
                if (string == null) return arrayList;
                n2 = 0;
            }
            catch (JSONException jSONException) {
                h.d("OMSDK", jSONException.getMessage());
                d2 = new com.mintegral.msdk.base.common.report.d(context);
                stringBuilder = new StringBuilder();
                stringBuilder.append("failed, exception ");
                string5 = jSONException.getMessage();
                break block6;
            }
            catch (MalformedURLException malformedURLException) {
                h.d("OMSDK", malformedURLException.getMessage());
                d2 = new com.mintegral.msdk.base.common.report.d(context);
                stringBuilder = new StringBuilder();
                stringBuilder.append("failed, exception ");
                string5 = malformedURLException.getMessage();
                break block6;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                h.d("OMSDK", illegalArgumentException.getMessage());
                d2 = new com.mintegral.msdk.base.common.report.d(context);
                stringBuilder = new StringBuilder();
                stringBuilder.append("failed, exception ");
                string5 = illegalArgumentException.getMessage();
            }
            do {
                if (n2 >= jSONArray.length()) return arrayList;
                JSONObject jSONObject = jSONArray.optJSONObject(n2);
                String string6 = jSONObject.optString("vkey", "");
                URL uRL = new URL(jSONObject.optString("et_url", ""));
                String string7 = jSONObject.optString("verification_p", "");
                f.e.a.a.a.d.h h2 = TextUtils.isEmpty((CharSequence)string7) ? (TextUtils.isEmpty((CharSequence)string6) ? f.e.a.a.a.d.h.a(uRL) : f.e.a.a.a.d.h.a(string6, uRL)) : f.e.a.a.a.d.h.a(string6, uRL, string7);
                arrayList.add((Object)h2);
                ++n2;
            } while (true);
        }
        stringBuilder.append(string5);
        d2.b(string2, string3, string4, stringBuilder.toString());
        return arrayList;
    }

    private static void a(Context context) {
        if (!f.e.a.a.a.a.b()) {
            f.e.a.a.a.a.a(f.e.a.a.a.a.a(), context.getApplicationContext());
        }
    }
}

