/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.a.a.a.a.b
 *  f.a.a.a.a.h.f.b$a
 *  f.a.a.a.a.h.f.f
 *  f.a.a.a.a.h.g.g
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  org.json.JSONObject
 */
package f.a.a.a.a.h.f;

import f.a.a.a.a.h.f.b;
import f.a.a.a.a.h.f.e;
import f.a.a.a.a.h.f.f;
import f.a.a.a.a.h.g.g;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;

public class b
extends e {
    private String b;
    private a c;

    public b(String string) {
        this.b = string;
    }

    @Override
    public f a() {
        try {
            JSONObject jSONObject;
            HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(this.b).openConnection();
            httpURLConnection.setConnectTimeout(10000);
            String string = g.a((InputStream)httpURLConnection.getInputStream(), (String)"utf-8");
            if (this.c != null) {
                string = this.c.a(string);
            }
            if ((jSONObject = new JSONObject(string)).getInt("StatusCode") == 200) {
                return new f(jSONObject.getString("AccessKeyId"), jSONObject.getString("AccessKeySecret"), jSONObject.getString("SecurityToken"), jSONObject.getString("Expiration"));
            }
            String string2 = jSONObject.getString("ErrorCode");
            String string3 = jSONObject.getString("ErrorMessage");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ErrorCode: ");
            stringBuilder.append(string2);
            stringBuilder.append("| ErrorMessage: ");
            stringBuilder.append(string3);
            throw new f.a.a.a.a.b(stringBuilder.toString());
        }
        catch (Exception exception) {
            throw new f.a.a.a.a.b((Throwable)exception);
        }
    }
}

