/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.webkit.ValueCallback
 *  android.webkit.WebStorage
 *  f.g.a.k$a
 *  f.g.a.k$b
 *  f.g.a.k$c
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package f.g.a;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import f.g.a.k;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

public class k
implements MethodChannel.MethodCallHandler {
    public static MethodChannel b;
    public static WebStorage c;

    public k(BinaryMessenger binaryMessenger) {
        b = new MethodChannel(binaryMessenger, "com.pichillilorenzo/flutter_inappwebview_webstoragemanager");
        b.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
        c = WebStorage.getInstance();
    }

    public void a() {
        b.setMethodCallHandler(null);
    }

    public void a(MethodChannel.Result result) {
        c.getOrigins((ValueCallback)new a((k)this, result));
    }

    public void a(String string, MethodChannel.Result result) {
        c.getQuotaForOrigin(string, (ValueCallback)new b((k)this, result));
    }

    public void b(String string, MethodChannel.Result result) {
        c.getUsageForOrigin(string, (ValueCallback)new c((k)this, result));
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Boolean bl;
        int n2;
        block13 : {
            String string = methodCall.method;
            int n3 = string.hashCode();
            bl = true;
            switch (n3) {
                default: {
                    break;
                }
                case 843309476: {
                    if (!string.equals((Object)"getUsageForOrigin")) break;
                    n2 = 4;
                    break block13;
                }
                case -165580329: {
                    if (!string.equals((Object)"getOrigins")) break;
                    n2 = 0;
                    break block13;
                }
                case -876677967: {
                    if (!string.equals((Object)"deleteOrigin")) break;
                    n2 = 2;
                    break block13;
                }
                case -1117417280: {
                    if (!string.equals((Object)"deleteAllData")) break;
                    n2 = 1;
                    break block13;
                }
                case -1308548435: {
                    if (!string.equals((Object)"getQuotaForOrigin")) break;
                    n2 = 3;
                    break block13;
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
                        this.b((String)methodCall.argument("origin"), result);
                        return;
                    }
                    this.a((String)methodCall.argument("origin"), result);
                    return;
                }
                String string = (String)methodCall.argument("origin");
                c.deleteOrigin(string);
            } else {
                c.deleteAllData();
            }
            result.success((Object)bl);
            return;
        }
        this.a(result);
    }
}

