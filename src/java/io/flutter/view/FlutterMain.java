/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package io.flutter.view;

import android.content.Context;
import android.os.Handler;
import io.flutter.embedding.engine.loader.FlutterLoader;

public class FlutterMain {
    private static boolean isRunningInRobolectricTest;

    public static void ensureInitializationComplete(Context context, String[] arrstring) {
        if (isRunningInRobolectricTest) {
            return;
        }
        FlutterLoader.getInstance().ensureInitializationComplete(context, arrstring);
    }

    public static void ensureInitializationCompleteAsync(Context context, String[] arrstring, Handler handler, Runnable runnable) {
        if (isRunningInRobolectricTest) {
            return;
        }
        FlutterLoader.getInstance().ensureInitializationCompleteAsync(context, arrstring, handler, runnable);
    }

    public static String findAppBundlePath() {
        return FlutterLoader.getInstance().findAppBundlePath();
    }

    @Deprecated
    public static String findAppBundlePath(Context context) {
        return FlutterLoader.getInstance().findAppBundlePath();
    }

    public static String getLookupKeyForAsset(String string2) {
        return FlutterLoader.getInstance().getLookupKeyForAsset(string2);
    }

    public static String getLookupKeyForAsset(String string2, String string3) {
        return FlutterLoader.getInstance().getLookupKeyForAsset(string2, string3);
    }

    @Deprecated
    public static void setIsRunningInRobolectricTest(boolean bl) {
        isRunningInRobolectricTest = bl;
    }

    public static void startInitialization(Context context) {
        if (isRunningInRobolectricTest) {
            return;
        }
        FlutterLoader.getInstance().startInitialization(context);
    }

    public static void startInitialization(Context context, Settings settings) {
        if (isRunningInRobolectricTest) {
            return;
        }
        FlutterLoader.Settings settings2 = new FlutterLoader.Settings();
        settings2.setLogTag(settings.getLogTag());
        FlutterLoader.getInstance().startInitialization(context, settings2);
    }

    public static class Settings {
        private String logTag;

        public String getLogTag() {
            return this.logTag;
        }

        public void setLogTag(String string2) {
            this.logTag = string2;
        }
    }

}

