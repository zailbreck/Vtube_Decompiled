/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package f.f.a;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    private Integer a;
    private Integer b;
    private Integer c;
    private a d;
    private String e;

    public static String a(c c2) {
        JSONObject jSONObject;
        block9 : {
            if (c2 == null) {
                return null;
            }
            jSONObject = new JSONObject();
            try {
                if (c2.a != null) {
                    jSONObject.put("gender", (Object)c2.a);
                }
                if (c2.b != null) {
                    jSONObject.put("age", (Object)c2.b);
                }
                if (c2.c != null) {
                    jSONObject.put("pay", (Object)c2.c);
                }
                if (c2.d == null) {
                    if (!TextUtils.isEmpty((CharSequence)c2.e)) {
                        jSONObject.put("custom", (Object)c2.e);
                    }
                    break block9;
                }
                new JSONObject();
                c2.d.a();
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
            throw null;
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject.toString();
    }

    public static final class a {
        public final double a() {
            throw null;
        }
    }

}

