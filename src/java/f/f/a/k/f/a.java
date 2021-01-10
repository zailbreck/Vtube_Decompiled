/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  f.f.a.a
 *  f.f.a.k.f.c
 *  f.f.a.k.g.k
 *  java.lang.Exception
 *  java.lang.Object
 */
package f.f.a.k.f;

import android.content.Context;
import f.f.a.k.f.c;
import f.f.a.k.g.b;
import f.f.a.k.g.k;

public class a
extends k {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Context object, b b2) {
        void var0_3;
        void var2_4;
        super.a(object, (b)var2_4);
        try {
            void var1_1;
            if (!(object instanceof c)) {
                if (var2_4.getObject() != null && var2_4.getObject() instanceof c) {
                    (c)var2_4.getObject();
                }
                if (var2_4.getMraidObject() == null || !(var2_4.getMraidObject() instanceof c)) return;
                Object object2 = var2_4.getMraidObject();
            }
            (c)var1_1;
            return;
        }
        catch (Exception exception) {
            if (!f.f.a.a.a) return;
            exception.printStackTrace();
        }
    }
}

