/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 */
package com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import f.g.a.q;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

public class ActionBroadcastReceiver
extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String string = intent.getDataString();
        if (string != null) {
            Bundle bundle = intent.getExtras();
            String string2 = bundle.getString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_UUID");
            int n2 = bundle.getInt("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_ID");
            String string3 = bundle.getString("android.intent.extra.SUBJECT");
            BinaryMessenger binaryMessenger = q.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com.pichillilorenzo/flutter_chromesafaribrowser_");
            stringBuilder.append(string2);
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, stringBuilder.toString());
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"url", (Object)string);
            hashMap.put((Object)"title", (Object)string3);
            hashMap.put((Object)"id", (Object)n2);
            methodChannel.invokeMethod("onChromeSafariBrowserMenuItemActionPerform", (Object)hashMap);
        }
    }
}

