/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package io.flutter.embedding.engine.loader;

import android.content.Context;
import java.io.File;

class ResourcePaths {
    public static final String TEMPORARY_RESOURCE_PREFIX = ".org.chromium.Chromium.";

    ResourcePaths() {
    }

    public static File createTempFile(Context context, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("_");
        stringBuilder.append(string2);
        return File.createTempFile((String)TEMPORARY_RESOURCE_PREFIX, (String)stringBuilder.toString(), (File)context.getCacheDir());
    }
}

