/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Process
 *  android.util.TypedValue
 *  java.io.File
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.Executor
 *  java.util.concurrent.RejectedExecutionException
 */
package e.e.d;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public class a {
    private static final Object a = new Object();
    private static TypedValue b;

    public static int a(Context context, String string) {
        if (string != null) {
            return context.checkPermission(string, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static ColorStateList a(Context context, int n2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(n2);
        }
        return context.getResources().getColorStateList(n2);
    }

    public static boolean a(Context context, Intent[] arrintent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(arrintent, bundle);
        } else {
            context.startActivities(arrintent);
        }
        return true;
    }

    public static File[] a(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        File[] arrfile = new File[]{context.getExternalCacheDir()};
        return arrfile;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Drawable b(Context context, int n2) {
        Object object;
        int n3 = Build.VERSION.SDK_INT;
        if (n3 >= 21) {
            return context.getDrawable(n2);
        }
        if (n3 >= 16) {
            return context.getResources().getDrawable(n2);
        }
        Object object2 = object = a;
        synchronized (object2) {
            if (b == null) {
                b = new TypedValue();
            }
            context.getResources().getValue(n2, b, true);
            n2 = a.b.resourceId;
            return context.getResources().getDrawable(n2);
        }
    }

    public static Executor b(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return context.getMainExecutor();
        }
        return new a(new Handler(context.getMainLooper()));
    }

    public static File[] b(Context context, String string) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(string);
        }
        File[] arrfile = new File[]{context.getExternalFilesDir(string)};
        return arrfile;
    }

    private static class a
    implements Executor {
        private final Handler a;

        a(Handler handler) {
            this.a = handler;
        }

        public void execute(Runnable runnable) {
            if (this.a.post(runnable)) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((Object)this.a);
            stringBuilder.append(" is shutting down");
            throw new RejectedExecutionException(stringBuilder.toString());
        }
    }

}

