/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ProviderInfo
 *  android.content.pm.ServiceInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  androidx.core.app.g
 *  java.lang.Exception
 *  java.lang.NoSuchMethodError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.f.a.e.f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import androidx.core.app.g;
import f.f.a.a;
import f.f.a.e.f.d;

public final class s {
    public static int a = -1;
    public static int b = -1;
    public static int c = -1;
    public static int d = -1;
    public static int e = -1;

    public static boolean a(Context context) {
        int n2 = e;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        if (context == null) {
            e = -1;
            return false;
        }
        try {
            if (d.t(context) >= 26 && Build.VERSION.SDK_INT >= 26) {
                new g(context, "download");
                e = 1;
            }
            return true;
        }
        catch (NoSuchMethodError noSuchMethodError) {
            e = 0;
            return false;
        }
        catch (Exception | Throwable exception) {
            e = -1;
            return false;
        }
    }

    public static boolean b(Context context) {
        block12 : {
            String[] arrstring;
            boolean bl;
            int n2;
            block14 : {
                block13 : {
                    int n3 = c;
                    if (n3 == 1) {
                        return true;
                    }
                    if (n3 == 0) {
                        return false;
                    }
                    if (context == null) {
                        c = -1;
                        return false;
                    }
                    if (d.t(context) < 26 || Build.VERSION.SDK_INT < 26) break block12;
                    arrstring = context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)4096).requestedPermissions;
                    if (arrstring != null) break block13;
                    c = -1;
                    return false;
                }
                if (arrstring.length != 0) break block14;
                c = 0;
                return false;
            }
            try {
                n2 = arrstring.length;
                bl = true;
            }
            catch (Exception | Throwable throwable) {
                c = -1;
                return false;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                if (arrstring[i2].equals((Object)"android.permission.REQUEST_INSTALL_PACKAGES")) {
                    c = 1;
                    break block12;
                }
                c = 0;
                bl = false;
            }
            return bl;
        }
        return true;
    }

    public static boolean c(Context context) {
        boolean bl;
        int n2;
        ServiceInfo[] arrserviceInfo;
        block13 : {
            block12 : {
                int n3 = b;
                if (n3 == 1) {
                    return true;
                }
                if (n3 == 0) {
                    return false;
                }
                if (context == null) {
                    b = -1;
                    return false;
                }
                arrserviceInfo = context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)4).services;
                if (arrserviceInfo != null) break block12;
                b = -1;
                return false;
            }
            if (arrserviceInfo.length != 0) break block13;
            b = 0;
            return false;
        }
        try {
            n2 = arrserviceInfo.length;
            bl = true;
        }
        catch (Exception | Throwable throwable) {
            b = -1;
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            block14 : {
                if (!arrserviceInfo[i2].name.equals((Object)"com.mintegral.msdk.shell.MTGService")) break block14;
                b = 1;
                return true;
            }
            b = 0;
            bl = false;
        }
        return bl;
    }

    public static boolean d(Context context) {
        ProviderInfo[] arrproviderInfo;
        boolean bl;
        int n2;
        block13 : {
            block12 : {
                int n3 = d;
                if (n3 == 1) {
                    return true;
                }
                if (n3 == 0) {
                    return false;
                }
                if (context == null) {
                    d = -1;
                    return false;
                }
                arrproviderInfo = context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)8).providers;
                if (arrproviderInfo != null) break block12;
                d = -1;
                return false;
            }
            if (arrproviderInfo.length != 0) break block13;
            d = 0;
            return false;
        }
        try {
            n2 = arrproviderInfo.length;
            bl = true;
        }
        catch (Exception | Throwable throwable) {
            d = -1;
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            block14 : {
                if (!arrproviderInfo[i2].name.equals((Object)"com.mintegral.msdk.base.utils.MTGFileProvider")) break block14;
                d = 1;
                return true;
            }
            d = 0;
            bl = false;
        }
        return bl;
    }

    public static boolean e(Context context) {
        block3 : {
            try {
                int n2;
                if (d.t(context) >= 24 && (n2 = Build.VERSION.SDK_INT) >= 24) {
                    return true;
                }
            }
            catch (Throwable throwable) {
                if (!a.a) break block3;
                throwable.printStackTrace();
            }
        }
        return false;
    }
}

