/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.util;

import android.content.Context;
import android.os.Build;
import java.io.File;

public final class PathUtils {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String getCacheDirectory(Context context) {
        File file;
        if (Build.VERSION.SDK_INT >= 21) {
            file = context.getCodeCacheDir();
            do {
                return file.getPath();
                break;
            } while (true);
        }
        file = context.getCacheDir();
        return file.getPath();
    }

    public static String getDataDirectory(Context context) {
        return context.getDir("flutter", 0).getPath();
    }

    public static String getFilesDir(Context context) {
        return context.getFilesDir().getPath();
    }
}

