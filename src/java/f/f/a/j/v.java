/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.security.NetworkSecurityPolicy
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.j;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;

public final class v {
    public static boolean a(ApplicationInfo applicationInfo) {
        if (applicationInfo == null) {
            return true;
        }
        return applicationInfo.targetSdkVersion >= 28 && Build.VERSION.SDK_INT >= 28 && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted("127.0.0.1");
    }
}

