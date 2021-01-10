/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Locale
 */
package io.flutter.embedding.engine.systemchannels;

import android.os.Build;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LocalizationChannel {
    private static final String TAG = "LocalizationChannel";
    public final MethodChannel channel;

    public LocalizationChannel(DartExecutor dartExecutor) {
        this.channel = new MethodChannel(dartExecutor, "flutter/localization", JSONMethodCodec.INSTANCE);
    }

    public void sendLocales(List<Locale> list) {
        Log.v(TAG, "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Locale (Language: ");
            stringBuilder.append(locale.getLanguage());
            stringBuilder.append(", Country: ");
            stringBuilder.append(locale.getCountry());
            stringBuilder.append(", Variant: ");
            stringBuilder.append(locale.getVariant());
            stringBuilder.append(")");
            Log.v(TAG, stringBuilder.toString());
            arrayList.add((Object)locale.getLanguage());
            arrayList.add((Object)locale.getCountry());
            String string2 = Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "";
            arrayList.add((Object)string2);
            arrayList.add((Object)locale.getVariant());
        }
        this.channel.invokeMethod("setLocale", (Object)arrayList);
    }
}

