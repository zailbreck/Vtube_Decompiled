/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Arrays;

final class ImagePickerUtils {
    ImagePickerUtils() {
    }

    private static boolean isPermissionPresentInManifest(Context context, String string2) {
        try {
            boolean bl = Arrays.asList((Object[])context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)4096).requestedPermissions).contains((Object)string2);
            return bl;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            nameNotFoundException.printStackTrace();
            return false;
        }
    }

    static boolean needRequestCameraPermission(Context context) {
        boolean bl = Build.VERSION.SDK_INT >= 23;
        return bl && ImagePickerUtils.isPermissionPresentInManifest(context, "android.permission.CAMERA");
    }
}

