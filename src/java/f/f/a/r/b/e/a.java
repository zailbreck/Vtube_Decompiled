/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  f.f.a.a
 *  f.f.a.k.g.k
 *  f.f.a.r.b.e.d
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 */
package f.f.a.r.b.e;

import android.content.Context;
import f.f.a.k.g.b;
import f.f.a.k.g.k;
import f.f.a.r.b.e.d;
import java.lang.reflect.Method;

public class a
extends k
implements d {
    protected d a;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void a(Context var1, b var2_2) {
        super.a(var1, var2_2);
        try {
            var4_3 = Class.forName((String)"f.f.a.r.b.k.a").isInstance((Object)var1);
        }
        catch (ClassNotFoundException var3_4) {
            var3_4.printStackTrace();
            var4_3 = false;
        }
        if (!var4_3) ** GOTO lbl14
        try {
            var6_5 = Class.forName((String)"f.f.a.r.b.e.b");
            this.a = (d)var6_5.newInstance();
            var6_5.getMethod("initialize", new Class[]{Context.class, b.class}).invoke((Object)this.a, new Object[]{var1, var2_2});
            return;
lbl14: // 1 sources:
            if (var2_2.getObject() == null) return;
            if (var2_2.getObject() instanceof d == false) return;
            this.a = (d)var2_2.getObject();
            return;
        }
        catch (Exception var5_6) {
            if (f.f.a.a.a == false) return;
            var5_6.printStackTrace();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void a(Object var1, b var2_2) {
        super.a(var1, var2_2);
        try {
            var4_3 = Class.forName((String)"f.f.a.r.b.k.a").isInstance(var1);
        }
        catch (ClassNotFoundException var3_4) {
            var3_4.printStackTrace();
            var4_3 = false;
        }
        if (!var4_3) ** GOTO lbl14
        try {
            var6_5 = Class.forName((String)"f.f.a.r.b.e.b");
            this.a = (d)var6_5.newInstance();
            var6_5.getMethod("initialize", new Class[]{Object.class, b.class}).invoke((Object)this.a, new Object[]{var1, var2_2});
            return;
lbl14: // 1 sources:
            if (var2_2.getObject() == null) return;
            if (var2_2.getObject() instanceof d == false) return;
            this.a = (d)var2_2.getObject();
            return;
        }
        catch (Exception var5_6) {
            if (f.f.a.a.a == false) return;
            var5_6.printStackTrace();
        }
    }
}

