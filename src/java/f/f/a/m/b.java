/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  f.f.a.e.f.h
 *  f.f.a.p.a
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.ConcurrentHashMap
 */
package f.f.a.m;

import android.net.Uri;
import android.text.TextUtils;
import f.f.a.e.f.h;
import f.f.a.p.a;
import java.util.concurrent.ConcurrentHashMap;

public class b
implements a {
    private static String c = "CustomInfoManager";
    private static b d;
    private ConcurrentHashMap<String, String> b = new ConcurrentHashMap();

    private b() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b a() {
        Class<b> class_ = b.class;
        synchronized (b.class) {
            if (d != null) return d;
            class_ = b.class;
            synchronized (b.class) {
                if (d != null) return d;
                d = new b();
                // ** MonitorExit[var3] (shouldn't be in output)
                return d;
            }
        }
    }

    private String a(String string, int n2) {
        String string2;
        block1 : {
            ConcurrentHashMap<String, String> concurrentHashMap;
            block4 : {
                String string3;
                StringBuilder stringBuilder;
                block5 : {
                    block2 : {
                        block3 : {
                            boolean bl = TextUtils.isEmpty((CharSequence)string);
                            string2 = "";
                            if (bl) break block1;
                            if (n2 == 6) break block2;
                            if (n2 == 7) break block3;
                            if (n2 != 8) {
                                return string2;
                            }
                            concurrentHashMap = this.b;
                            break block4;
                        }
                        concurrentHashMap = this.b;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(string);
                        string3 = "_bidload";
                        break block5;
                    }
                    concurrentHashMap = this.b;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    string3 = "_bid";
                }
                stringBuilder.append(string3);
                string = stringBuilder.toString();
            }
            string2 = (String)concurrentHashMap.get((Object)string);
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String a(String string, String string2) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return "";
        }
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return "";
        }
        try {
            Uri uri = Uri.parse((String)string2);
            if (uri == null) return "";
            String string3 = uri.getHost();
            String string4 = uri.getPath();
            boolean bl = TextUtils.isEmpty((CharSequence)string3);
            if (!bl && string3.contains((CharSequence)"hb") && !TextUtils.isEmpty((CharSequence)string4) && string4.contains((CharSequence)"bid")) {
                return b.super.a(string, 6);
            }
            if (!TextUtils.isEmpty((CharSequence)string3) && string3.contains((CharSequence)"hb") && !TextUtils.isEmpty((CharSequence)string4) && string4.contains((CharSequence)"load")) {
                return b.super.a(string, 7);
            }
            if (TextUtils.isEmpty((CharSequence)string4)) return "";
            if (!string4.contains((CharSequence)"v3")) return "";
            return b.super.a(string, 8);
        }
        catch (Throwable throwable) {
            h.b((String)c, (String)"Exception", (Throwable)throwable);
        }
        return "";
    }
}

