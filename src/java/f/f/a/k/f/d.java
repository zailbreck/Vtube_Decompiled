/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.webkit.WebView
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.LinkedHashSet
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  org.json.JSONObject
 */
package f.f.a.k.f;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import f.f.a.k.f.b;
import f.f.a.k.f.c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class d {
    private static volatile ConcurrentHashMap<String, String> a = new ConcurrentHashMap();
    private static ArrayList<String> b = new ArrayList();

    public static f.f.a.k.g.c a(f.f.a.k.g.b b2, String string) {
        block14 : {
            int n2;
            f.f.a.k.g.c c2;
            Uri uri;
            Set set;
            block15 : {
                block16 : {
                    String string2;
                    String string3;
                    block17 : {
                        uri = Uri.parse((String)string);
                        String string4 = uri.getScheme();
                        if (TextUtils.isEmpty((CharSequence)string4) || !string4.contains((CharSequence)"mraid")) break block14;
                        c2 = new f.f.a.k.g.c();
                        c2.d = "MraidJSBridge";
                        c2.e = uri.getHost();
                        int n3 = b.size();
                        n2 = 0;
                        if (n3 == 0) {
                            for (Method method : c.class.getDeclaredMethods()) {
                                b.add((Object)method.getName());
                            }
                        }
                        if (b.contains((Object)c2.e) || b2 == null) break block15;
                        string2 = b2.getCampaignId();
                        string3 = c2.e;
                        if (TextUtils.isEmpty((CharSequence)string2)) break block16;
                        if (!a.containsKey((Object)string2)) break block17;
                        String string5 = (String)a.get((Object)string2);
                        if (TextUtils.isEmpty((CharSequence)string3) || string5.contains((CharSequence)string3)) break block16;
                        if (string5.length() > 0) {
                            string5 = string5.concat(",");
                        }
                        string3 = string5.concat(string3);
                    }
                    a.put((Object)string2, (Object)string3);
                }
                b.a.a().a((WebView)b2, c2.e);
                b.a.a().a((WebView)b2, c2.e, "Specified command is not implemented");
                return null;
            }
            String string6 = uri.getEncodedQuery();
            if (string6 == null) {
                set = Collections.emptySet();
            } else {
                int n4;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                do {
                    int n5;
                    if ((n4 = string6.indexOf(38, n2)) == -1) {
                        n4 = string6.length();
                    }
                    if ((n5 = string6.indexOf(61, n2)) > n4 || n5 == -1) {
                        n5 = n4;
                    }
                    linkedHashSet.add((Object)Uri.decode((String)string6.substring(n2, n5)));
                } while ((n2 = n4 + 1) < string6.length());
                set = Collections.unmodifiableSet((Set)linkedHashSet);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String string7 : set) {
                    jSONObject.put(string7, (Object)uri.getQueryParameter(string7));
                }
                c2.f = jSONObject.toString();
                return c2;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return c2;
            }
        }
        return null;
    }

    public static String a(String string) {
        if (a.containsKey((Object)string)) {
            return (String)a.get((Object)string);
        }
        return null;
    }

    public static void b(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return;
        }
        a.remove((Object)string);
    }
}

