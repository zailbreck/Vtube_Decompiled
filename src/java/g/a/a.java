/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  java.lang.Object
 */
package g.a;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import g.a.b;
import i.k.b.d;
import io.flutter.plugin.common.MethodChannel;

public final class a {
    private Activity a;

    private final boolean a() {
        Activity activity = this.a;
        if (activity != null) {
            Window window = activity.getWindow();
            d.a((Object)window, "activity!!.window");
            return (128 & window.getAttributes().flags) != 0;
        }
        d.a();
        throw null;
    }

    public final void a(Activity activity) {
        this.a = activity;
    }

    public final void a(MethodChannel.Result result) {
        d.d(result, "result");
        if (this.a == null) {
            b.a(result);
            return;
        }
        result.success(a.super.a());
    }

    public final void a(boolean bl, MethodChannel.Result result) {
        d.d(result, "result");
        Activity activity = this.a;
        if (activity == null) {
            b.a(result);
            return;
        }
        if (activity != null) {
            boolean bl2 = a.super.a();
            if (bl) {
                if (!bl2) {
                    activity.getWindow().addFlags(128);
                }
            } else if (bl2) {
                activity.getWindow().clearFlags(128);
            }
            result.success(null);
            return;
        }
        d.a();
        throw null;
    }
}

