/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.ViewConfiguration
 *  java.lang.Math
 *  java.lang.Object
 */
package e.a.n;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import e.a.b;
import e.a.d;
import e.a.j;

public class a {
    private Context a;

    private a(Context context) {
        this.a = context;
    }

    public static a a(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int b() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int c() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int n2 = configuration.screenWidthDp;
        int n3 = configuration.screenHeightDp;
        if (!(configuration.smallestScreenWidthDp > 600 || n2 > 600 || n2 > 960 && n3 > 720 || n2 > 720 && n3 > 960)) {
            if (!(n2 >= 500 || n2 > 640 && n3 > 480 || n2 > 480 && n3 > 640)) {
                if (n2 >= 360) {
                    return 3;
                }
                return 2;
            }
            return 4;
        }
        return 5;
    }

    public int d() {
        return this.a.getResources().getDimensionPixelSize(d.abc_action_bar_stacked_tab_max_width);
    }

    public int e() {
        TypedArray typedArray = this.a.obtainStyledAttributes(null, j.ActionBar, e.a.a.actionBarStyle, 0);
        int n2 = typedArray.getLayoutDimension(j.ActionBar_height, 0);
        Resources resources = this.a.getResources();
        if (!this.f()) {
            n2 = Math.min((int)n2, (int)resources.getDimensionPixelSize(d.abc_action_bar_stacked_max_height));
        }
        typedArray.recycle();
        return n2;
    }

    public boolean f() {
        return this.a.getResources().getBoolean(b.abc_action_bar_embed_tabs);
    }

    public boolean g() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return true ^ ViewConfiguration.get((Context)this.a).hasPermanentMenuKey();
    }
}

