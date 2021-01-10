/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.a;

import android.content.Context;
import f.e.a.a.a.e.b;
import f.e.a.a.a.g.e;

public class c {
    private boolean a;

    private void b(Context context) {
        e.a((Object)context, "Application Context cannot be null");
    }

    String a() {
        return "1.2.15-Mintegral";
    }

    void a(Context context) {
        c.super.b(context);
        if (!this.b()) {
            this.a(true);
            f.e.a.a.a.e.e.d().a(context);
            b.d().a(context);
            f.e.a.a.a.g.b.a(context);
            f.e.a.a.a.e.c.b().a(context);
        }
    }

    void a(boolean bl) {
        this.a = bl;
    }

    boolean b() {
        return this.a;
    }
}

