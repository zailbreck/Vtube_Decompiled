/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package g.a;

import i.k.b.d;
import io.flutter.plugin.common.MethodChannel;

public final class b {
    public static final void a(MethodChannel.Result result) {
        d.d(result, "$this$noActivity");
        result.error("no_activity", "wakelock requires a foreground activity", null);
    }
}

