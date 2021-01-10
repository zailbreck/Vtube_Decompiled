/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package io.flutter.plugins.pathprovider;

import android.os.Build;
import android.os.Environment;

class StorageDirectoryMapper {
    StorageDirectoryMapper() {
    }

    static String androidType(Integer n2) {
        if (n2 == null) {
            return null;
        }
        switch (n2) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown index: ");
                stringBuilder.append((Object)n2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            case 9: {
                if (Build.VERSION.SDK_INT >= 19) {
                    return Environment.DIRECTORY_DOCUMENTS;
                }
                throw new IllegalArgumentException("Documents directory is unsupported.");
            }
            case 8: {
                return Environment.DIRECTORY_DCIM;
            }
            case 7: {
                return Environment.DIRECTORY_DOWNLOADS;
            }
            case 6: {
                return Environment.DIRECTORY_MOVIES;
            }
            case 5: {
                return Environment.DIRECTORY_PICTURES;
            }
            case 4: {
                return Environment.DIRECTORY_NOTIFICATIONS;
            }
            case 3: {
                return Environment.DIRECTORY_ALARMS;
            }
            case 2: {
                return Environment.DIRECTORY_RINGTONES;
            }
            case 1: {
                return Environment.DIRECTORY_PODCASTS;
            }
            case 0: 
        }
        return Environment.DIRECTORY_MUSIC;
    }
}

