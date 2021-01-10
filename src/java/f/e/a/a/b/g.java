/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.b;

import android.content.Context;
import f.e.a.a.b.f.b;
import f.e.a.a.b.f.d;
import f.e.a.a.b.f.f;
import f.e.a.a.b.j.e;

public class g {
    private boolean a;

    private void b(Context context) {
        e.a((Object)context, "Application Context cannot be null");
    }

    String a() {
        return "1.3.4-Mopub";
    }

    void a(Context context) {
        g.super.b(context);
        if (!this.b()) {
            this.a(true);
            f.d().a(context);
            b.d().a(context);
            f.e.a.a.b.j.b.a(context);
            d.b().a(context);
        }
    }

    void a(boolean bl) {
        this.a = bl;
    }

    boolean b() {
        return this.a;
    }
}

