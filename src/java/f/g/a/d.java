/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebViewDatabase
 *  f.g.a.c.a
 *  f.g.a.c.b
 *  f.g.a.c.c
 *  f.g.a.c.e
 *  f.g.a.c.f
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
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package f.g.a;

import android.content.Context;
import android.webkit.WebViewDatabase;
import f.g.a.c.a;
import f.g.a.c.b;
import f.g.a.c.c;
import f.g.a.c.e;
import f.g.a.c.f;
import f.g.a.q;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class d
implements MethodChannel.MethodCallHandler {
    public static MethodChannel b;
    public static c c;

    public d(BinaryMessenger binaryMessenger) {
        b = new MethodChannel(binaryMessenger, "com.pichillilorenzo/flutter_inappwebview_credential_database");
        b.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
        c = c.a((Context)q.a);
    }

    public void a() {
        b.setMethodCallHandler(null);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        int n2;
        Boolean bl;
        block20 : {
            String string = methodCall.method;
            int n3 = string.hashCode();
            bl = true;
            switch (n3) {
                default: {
                    break;
                }
                case 1930845769: {
                    if (!string.equals((Object)"getAllAuthCredentials")) break;
                    n2 = 0;
                    break block20;
                }
                case 1084504936: {
                    if (!string.equals((Object)"removeHttpAuthCredentials")) break;
                    n2 = 4;
                    break block20;
                }
                case 998955721: {
                    if (!string.equals((Object)"setHttpAuthCredential")) break;
                    n2 = 2;
                    break block20;
                }
                case 589173355: {
                    if (!string.equals((Object)"removeHttpAuthCredential")) break;
                    n2 = 3;
                    break block20;
                }
                case -410271914: {
                    if (!string.equals((Object)"getHttpAuthCredentials")) break;
                    n2 = 1;
                    break block20;
                }
                case -1851697792: {
                    if (!string.equals((Object)"clearAllAuthCredentials")) break;
                    n2 = 5;
                    break block20;
                }
            }
            n2 = -1;
        }
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                result.notImplemented();
                                return;
                            }
                            c.a();
                            WebViewDatabase.getInstance((Context)q.a).clearHttpAuthUsernamePassword();
                        } else {
                            String string = (String)methodCall.argument("host");
                            String string2 = (String)methodCall.argument("protocol");
                            String string3 = (String)methodCall.argument("realm");
                            Integer n4 = (Integer)methodCall.argument("port");
                            c.b(string, string2, string3, n4);
                        }
                    } else {
                        String string = (String)methodCall.argument("host");
                        String string4 = (String)methodCall.argument("protocol");
                        String string5 = (String)methodCall.argument("realm");
                        Integer n5 = (Integer)methodCall.argument("port");
                        String string6 = (String)methodCall.argument("username");
                        String string7 = (String)methodCall.argument("password");
                        c.a(string, string4, string5, n5, string6, string7);
                    }
                } else {
                    String string = (String)methodCall.argument("host");
                    String string8 = (String)methodCall.argument("protocol");
                    String string9 = (String)methodCall.argument("realm");
                    Integer n6 = (Integer)methodCall.argument("port");
                    String string10 = (String)methodCall.argument("username");
                    String string11 = (String)methodCall.argument("password");
                    c.b(string, string8, string9, n6, string10, string11);
                }
                result.success((Object)bl);
                return;
            }
            String string = (String)methodCall.argument("host");
            String string12 = (String)methodCall.argument("protocol");
            String string13 = (String)methodCall.argument("realm");
            Integer n7 = (Integer)methodCall.argument("port");
            ArrayList arrayList = new ArrayList();
            Iterator iterator = c.a(string, string12, string13, n7).iterator();
            while (iterator.hasNext()) {
                arrayList.add((Object)((a)iterator.next()).a());
            }
            result.success((Object)arrayList);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (e e2 : d.c.a.a()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator iterator = d.c.b.a(e2.a).iterator();
            while (iterator.hasNext()) {
                arrayList2.add((Object)((a)iterator.next()).a());
            }
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"protectionSpace", (Object)e2.a());
            hashMap.put((Object)"credentials", (Object)arrayList2);
            arrayList.add((Object)hashMap);
        }
        result.success((Object)arrayList);
    }
}

