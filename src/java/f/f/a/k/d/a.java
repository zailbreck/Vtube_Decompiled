/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  f.f.a.e.f.h
 *  f.f.a.k.g.k
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.f.a.k.d;

import android.content.Context;
import f.f.a.e.f.h;
import f.f.a.k.d.b;
import f.f.a.k.g.k;

public class a
extends k {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Context object, f.f.a.k.g.b b2) {
        void var2_4;
        void var0_3;
        super.a(object, (f.f.a.k.g.b)var2_4);
        try {
            void var1_1;
            if (!(object instanceof b)) {
                if (var2_4.getObject() == null || !(var2_4.getObject() instanceof b)) return;
                Object object2 = var2_4.getObject();
            }
            (b)var1_1;
            return;
        }
        catch (Throwable throwable) {
            h.b((String)"BannerJSBridge", (String)"initialize", (Throwable)throwable);
        }
    }
}

