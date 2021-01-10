/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.webkit.CookieManager
 *  android.webkit.CookieSyncManager
 *  android.webkit.ValueCallback
 *  f.g.a.j$a
 *  f.g.a.j$b
 *  f.g.a.j$c
 *  f.g.a.q
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.TimeZone
 */
package f.g.a;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import f.g.a.j;
import f.g.a.q;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class j
implements MethodChannel.MethodCallHandler {
    public static MethodChannel b;
    public static CookieManager c;

    public j(BinaryMessenger binaryMessenger) {
        b = new MethodChannel(binaryMessenger, "com.pichillilorenzo/flutter_inappwebview_cookiemanager");
        b.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
        c = CookieManager.getInstance();
    }

    public static String a(Long l2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy hh:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone((String)"GMT"));
        return simpleDateFormat.format(new Date(l2.longValue()));
    }

    public static List<Map<String, Object>> a(String string) {
        ArrayList arrayList = new ArrayList();
        String string2 = c.getCookie(string);
        if (string2 != null) {
            String[] arrstring = string2.split(";");
            int n2 = arrstring.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                String[] arrstring2 = arrstring[i2].split("=", 2);
                String string3 = arrstring2[0].trim();
                String string4 = arrstring2[1].trim();
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"name", (Object)string3);
                hashMap.put((Object)"value", (Object)string4);
                hashMap.put((Object)"expiresDate", null);
                hashMap.put((Object)"isSessionOnly", null);
                hashMap.put((Object)"domain", null);
                hashMap.put((Object)"sameSite", null);
                hashMap.put((Object)"isSecure", null);
                hashMap.put((Object)"isHttpOnly", null);
                hashMap.put((Object)"path", null);
                arrayList.add((Object)hashMap);
            }
        }
        return arrayList;
    }

    public static void a(MethodChannel.Result result) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.removeAllCookies((ValueCallback)new c(result));
            c.flush();
            return;
        }
        CookieSyncManager cookieSyncManager = CookieSyncManager.createInstance((Context)q.a);
        cookieSyncManager.startSync();
        c.removeAllCookie();
        result.success((Object)true);
        cookieSyncManager.stopSync();
        cookieSyncManager.sync();
    }

    public static void a(String string, String string2, String string3, MethodChannel.Result result) {
        String string4 = c.getCookie(string);
        if (string4 != null) {
            CookieSyncManager cookieSyncManager;
            if (Build.VERSION.SDK_INT < 21) {
                cookieSyncManager = CookieSyncManager.createInstance((Context)q.a);
                cookieSyncManager.startSync();
            } else {
                cookieSyncManager = null;
            }
            String[] arrstring = string4.split(";");
            int n2 = arrstring.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                String string5 = arrstring[i2].split("=", 2)[0].trim();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string5);
                stringBuilder.append("=; Path=");
                stringBuilder.append(string3);
                stringBuilder.append("; Domain=");
                stringBuilder.append(string2);
                stringBuilder.append("; Max-Age=-1;");
                String string6 = stringBuilder.toString();
                if (Build.VERSION.SDK_INT >= 21) {
                    c.setCookie(string, string6, null);
                    continue;
                }
                c.setCookie(string, string6);
            }
            if (cookieSyncManager != null) {
                cookieSyncManager.stopSync();
                cookieSyncManager.sync();
            } else if (Build.VERSION.SDK_INT >= 21) {
                c.flush();
            }
        }
        result.success((Object)true);
    }

    public static void a(String string, String string2, String string3, String string4, MethodChannel.Result result) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("=; Path=");
        stringBuilder.append(string4);
        stringBuilder.append("; Domain=");
        stringBuilder.append(string3);
        stringBuilder.append("; Max-Age=-1;");
        String string5 = stringBuilder.toString();
        if (Build.VERSION.SDK_INT >= 21) {
            c.setCookie(string, string5, (ValueCallback)new b(result));
            c.flush();
            return;
        }
        CookieSyncManager cookieSyncManager = CookieSyncManager.createInstance((Context)q.a);
        cookieSyncManager.startSync();
        c.setCookie(string, string5);
        result.success((Object)true);
        cookieSyncManager.stopSync();
        cookieSyncManager.sync();
    }

    public static void a(String string, String string2, String string3, String string4, String string5, Long l2, Integer n2, Boolean bl, Boolean bl2, String string6, MethodChannel.Result result) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("=");
        stringBuilder.append(string3);
        stringBuilder.append("; Domain=");
        stringBuilder.append(string4);
        stringBuilder.append("; Path=");
        stringBuilder.append(string5);
        String string7 = stringBuilder.toString();
        if (l2 != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string7);
            stringBuilder2.append("; Expires=");
            stringBuilder2.append(j.a(l2));
            string7 = stringBuilder2.toString();
        }
        if (n2 != null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string7);
            stringBuilder3.append("; Max-Age=");
            stringBuilder3.append(n2.toString());
            string7 = stringBuilder3.toString();
        }
        if (bl != null && bl.booleanValue()) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(string7);
            stringBuilder4.append("; Secure");
            string7 = stringBuilder4.toString();
        }
        if (bl2 != null && bl2.booleanValue()) {
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(string7);
            stringBuilder5.append("; HttpOnly");
            string7 = stringBuilder5.toString();
        }
        if (string6 != null) {
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append(string7);
            stringBuilder6.append("; SameSite=");
            stringBuilder6.append(string6);
            string7 = stringBuilder6.toString();
        }
        StringBuilder stringBuilder7 = new StringBuilder();
        stringBuilder7.append(string7);
        stringBuilder7.append(";");
        String string8 = stringBuilder7.toString();
        if (Build.VERSION.SDK_INT >= 21) {
            c.setCookie(string, string8, (ValueCallback)new a(result));
            c.flush();
            return;
        }
        CookieSyncManager cookieSyncManager = CookieSyncManager.createInstance((Context)q.a);
        cookieSyncManager.startSync();
        c.setCookie(string, string8);
        result.success((Object)true);
        cookieSyncManager.stopSync();
        cookieSyncManager.sync();
    }

    public void a() {
        b.setMethodCallHandler(null);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        int n2;
        block12 : {
            String string = methodCall.method;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1989049945: {
                    if (!string.equals((Object)"getCookies")) break;
                    n2 = 1;
                    break block12;
                }
                case 822411705: {
                    if (!string.equals((Object)"deleteAllCookies")) break;
                    n2 = 4;
                    break block12;
                }
                case 747417188: {
                    if (!string.equals((Object)"deleteCookies")) break;
                    n2 = 3;
                    break block12;
                }
                case 126640486: {
                    if (!string.equals((Object)"setCookie")) break;
                    n2 = 0;
                    break block12;
                }
                case -1222815761: {
                    if (!string.equals((Object)"deleteCookie")) break;
                    n2 = 2;
                    break block12;
                }
            }
            n2 = -1;
        }
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            result.notImplemented();
                            return;
                        }
                        j.a(result);
                        return;
                    }
                    j.a((String)methodCall.argument("url"), (String)methodCall.argument("domain"), (String)methodCall.argument("path"), result);
                    return;
                }
                j.a((String)methodCall.argument("url"), (String)methodCall.argument("name"), (String)methodCall.argument("domain"), (String)methodCall.argument("path"), result);
                return;
            }
            result.success(j.a((String)methodCall.argument("url")));
            return;
        }
        String string = (String)methodCall.argument("url");
        String string2 = (String)methodCall.argument("name");
        String string3 = (String)methodCall.argument("value");
        String string4 = (String)methodCall.argument("domain");
        String string5 = (String)methodCall.argument("path");
        String string6 = (String)methodCall.argument("expiresDate");
        Long l2 = string6 != null ? new Long(string6) : null;
        Integer n3 = (Integer)methodCall.argument("maxAge");
        Boolean bl = (Boolean)methodCall.argument("isSecure");
        Boolean bl2 = (Boolean)methodCall.argument("isHttpOnly");
        String string7 = (String)methodCall.argument("sameSite");
        j.a(string, string2, string3, string4, string5, l2, n3, bl, bl2, string7, result);
    }
}

