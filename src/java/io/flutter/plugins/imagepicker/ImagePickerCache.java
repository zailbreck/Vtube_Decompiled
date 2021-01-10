/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.net.Uri
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import io.flutter.plugin.common.MethodCall;
import java.util.HashMap;
import java.util.Map;

class ImagePickerCache {
    private static final String FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY = "flutter_image_picker_image_path";
    private static final String MAP_KEY_ERROR_CODE = "errorCode";
    private static final String MAP_KEY_ERROR_MESSAGE = "errorMessage";
    static final String MAP_KEY_MAX_HEIGHT = "maxHeight";
    static final String MAP_KEY_MAX_WIDTH = "maxWidth";
    static final String MAP_KEY_PATH = "path";
    private static final String MAP_KEY_TYPE = "type";
    private static final String SHARED_PREFERENCES_NAME = "flutter_image_picker_shared_preference";
    private static final String SHARED_PREFERENCE_ERROR_CODE_KEY = "flutter_image_picker_error_code";
    private static final String SHARED_PREFERENCE_ERROR_MESSAGE_KEY = "flutter_image_picker_error_message";
    private static final String SHARED_PREFERENCE_MAX_HEIGHT_KEY = "flutter_image_picker_max_height";
    private static final String SHARED_PREFERENCE_MAX_WIDTH_KEY = "flutter_image_picker_max_width";
    private static final String SHARED_PREFERENCE_PENDING_IMAGE_URI_PATH_KEY = "flutter_image_picker_pending_image_uri";
    private static final String SHARED_PREFERENCE_TYPE_KEY = "flutter_image_picker_type";
    private static SharedPreferences getFilePref;

    ImagePickerCache() {
    }

    static void clear() {
        SharedPreferences sharedPreferences = getFilePref;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    static Map<String, Object> getCacheMap() {
        if (getFilePref == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        Boolean bl = false;
        if (getFilePref.contains(FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY)) {
            hashMap.put((Object)MAP_KEY_PATH, (Object)getFilePref.getString(FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY, ""));
            bl = true;
        }
        if (getFilePref.contains(SHARED_PREFERENCE_ERROR_CODE_KEY)) {
            hashMap.put((Object)MAP_KEY_ERROR_CODE, (Object)getFilePref.getString(SHARED_PREFERENCE_ERROR_CODE_KEY, ""));
            bl = true;
            if (getFilePref.contains(SHARED_PREFERENCE_ERROR_MESSAGE_KEY)) {
                hashMap.put((Object)MAP_KEY_ERROR_MESSAGE, (Object)getFilePref.getString(SHARED_PREFERENCE_ERROR_MESSAGE_KEY, ""));
            }
        }
        if (bl.booleanValue()) {
            if (getFilePref.contains(SHARED_PREFERENCE_TYPE_KEY)) {
                hashMap.put((Object)MAP_KEY_TYPE, (Object)getFilePref.getString(SHARED_PREFERENCE_TYPE_KEY, ""));
            }
            if (getFilePref.contains(SHARED_PREFERENCE_MAX_WIDTH_KEY)) {
                hashMap.put((Object)MAP_KEY_MAX_WIDTH, (Object)Double.longBitsToDouble((long)getFilePref.getLong(SHARED_PREFERENCE_MAX_WIDTH_KEY, 0L)));
            }
            if (getFilePref.contains(SHARED_PREFERENCE_MAX_HEIGHT_KEY)) {
                hashMap.put((Object)MAP_KEY_MAX_HEIGHT, (Object)Double.longBitsToDouble((long)getFilePref.getLong(SHARED_PREFERENCE_MAX_HEIGHT_KEY, 0L)));
            }
        }
        return hashMap;
    }

    static String retrievePendingCameraMediaUriPath() {
        SharedPreferences sharedPreferences = getFilePref;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString(SHARED_PREFERENCE_PENDING_IMAGE_URI_PATH_KEY, "");
    }

    static void saveDemensionWithMethodCall(MethodCall methodCall) {
        ImagePickerCache.setMaxDimension((Double)methodCall.argument(MAP_KEY_MAX_WIDTH), (Double)methodCall.argument(MAP_KEY_MAX_HEIGHT));
    }

    static void savePendingCameraMediaUriPath(Uri uri) {
        SharedPreferences sharedPreferences = getFilePref;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString(SHARED_PREFERENCE_PENDING_IMAGE_URI_PATH_KEY, uri.getPath()).apply();
    }

    static void saveResult(String string2, String string3, String string4) {
        SharedPreferences sharedPreferences = getFilePref;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if (string2 != null) {
            editor.putString(FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY, string2);
        }
        if (string3 != null) {
            editor.putString(SHARED_PREFERENCE_ERROR_CODE_KEY, string3);
        }
        if (string4 != null) {
            editor.putString(SHARED_PREFERENCE_ERROR_MESSAGE_KEY, string4);
        }
        editor.apply();
    }

    /*
     * Enabled aggressive block sorting
     */
    static void saveTypeWithMethodCallName(String string2) {
        String string3;
        if (string2.equals((Object)"pickImage")) {
            string3 = "image";
        } else {
            if (!string2.equals((Object)"pickVideo")) {
                return;
            }
            string3 = "video";
        }
        ImagePickerCache.setType(string3);
    }

    private static void setMaxDimension(Double d2, Double d3) {
        SharedPreferences sharedPreferences = getFilePref;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if (d2 != null) {
            editor.putLong(SHARED_PREFERENCE_MAX_WIDTH_KEY, Double.doubleToRawLongBits((double)d2));
        }
        if (d3 != null) {
            editor.putLong(SHARED_PREFERENCE_MAX_HEIGHT_KEY, Double.doubleToRawLongBits((double)d3));
        }
        editor.apply();
    }

    private static void setType(String string2) {
        SharedPreferences sharedPreferences = getFilePref;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString(SHARED_PREFERENCE_TYPE_KEY, string2).apply();
    }

    static void setUpWithActivity(Activity activity) {
        getFilePref = activity.getApplicationContext().getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
    }
}

