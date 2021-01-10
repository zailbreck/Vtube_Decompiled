/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.sqlite.SQLiteDatabase
 *  android.text.TextUtils
 *  f.f.a.e.d.b
 *  f.f.a.e.d.g
 *  f.f.a.e.e.n
 *  f.f.a.e.f.h
 *  f.f.a.e.f.r
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.URLEncoder
 */
package f.f.a.e.d;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import f.f.a.e.d.b;
import f.f.a.e.d.g;
import f.f.a.e.e.n;
import f.f.a.e.f.h;
import java.net.URLEncoder;

public class r
extends b<n> {
    private static final String c = "f.f.a.e.d.r";
    private static r d;

    private r(g g2) {
        super(g2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static r a(g g2) {
        if (d != null) return d;
        Class<r> class_ = r.class;
        synchronized (r.class) {
            if (d != null) return d;
            d = new r(g2);
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return d;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(n n2) {
        void var17_2 = this;
        synchronized (var17_2) {
            if (n2 == null) return -1L;
            try {
                try {
                    String string7;
                    String string9;
                    String string2;
                    String string4;
                    String string6;
                    String string3;
                    String string5;
                    String string;
                    String string8;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("key", n2.m());
                    contentValues.put("networkType", Integer.valueOf((int)n2.t()));
                    contentValues.put("network_str", n2.u());
                    contentValues.put("isCompleteView", Integer.valueOf((int)n2.v()));
                    contentValues.put("watchedMillis", Integer.valueOf((int)n2.n()));
                    contentValues.put("videoLength", Integer.valueOf((int)n2.o()));
                    if (!TextUtils.isEmpty((CharSequence)n2.p())) {
                        contentValues.put("offerUrl", n2.p());
                    }
                    if (!TextUtils.isEmpty((CharSequence)n2.q())) {
                        contentValues.put("reason", URLEncoder.encode((String)n2.q(), (String)"utf-8"));
                    }
                    contentValues.put("result", Integer.valueOf((int)n2.w()));
                    contentValues.put("duration", n2.r());
                    contentValues.put("videoSize", Long.valueOf((long)n2.s()));
                    contentValues.put("type", n2.g());
                    String string10 = n2.f();
                    if (!TextUtils.isEmpty((CharSequence)string10)) {
                        contentValues.put("endcard_url", string10);
                    }
                    if (!TextUtils.isEmpty((CharSequence)(string5 = n2.e()))) {
                        contentValues.put("video_url", string5);
                    }
                    if (!TextUtils.isEmpty((CharSequence)(string7 = n2.j()))) {
                        contentValues.put("rid", string7);
                    }
                    if (!TextUtils.isEmpty((CharSequence)(string9 = n2.i()))) {
                        contentValues.put("template_url", string9);
                    }
                    if (!TextUtils.isEmpty((CharSequence)(string6 = n2.d()))) {
                        contentValues.put("image_url", string6);
                    }
                    if (!TextUtils.isEmpty((CharSequence)(string4 = n2.h()))) {
                        contentValues.put("ad_type", URLEncoder.encode((String)string4, (String)"utf-8"));
                    }
                    contentValues.put("unitId", n2.k());
                    contentValues.put("campaignId", n2.l());
                    if ("2000039".equals((Object)n2.m()) && f.f.a.e.f.r.b((String)(string3 = n.e((n)n2)))) {
                        contentValues.put("h5_click_data", string3);
                    }
                    if (!TextUtils.isEmpty((CharSequence)(string = n2.a()))) {
                        contentValues.put("resource_type", URLEncoder.encode((String)string, (String)"utf-8"));
                    }
                    if (!TextUtils.isEmpty((CharSequence)(string2 = n2.b()))) {
                        contentValues.put("device_id", URLEncoder.encode((String)string2, (String)"utf-8"));
                    }
                    if (TextUtils.isEmpty((CharSequence)(string8 = n2.c()))) return this.b().insert("reward_report", null, contentValues);
                    contentValues.put("creative", URLEncoder.encode((String)string8, (String)"utf-8"));
                    return this.b().insert("reward_report", null, contentValues);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    h.d((String)c, (String)exception.getMessage());
                }
            }
            catch (Throwable throwable2) {}
            return -1L;
            throw throwable2;
        }
    }
}

