/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 */
package f.e.a.a.a.d;

import android.view.View;
import f.e.a.a.a.d.c;
import f.e.a.a.a.d.d;
import f.e.a.a.a.d.i;
import f.e.a.a.a.g.e;

public abstract class b {
    public static b a(c c2, d d2) {
        e.a();
        e.a(c2, "AdSessionConfiguration is null");
        e.a(d2, "AdSessionContext is null");
        return new i(c2, d2);
    }

    public abstract void a();

    public abstract void a(View var1);

    public abstract void b();

    public abstract void b(View var1);

    public abstract void c();

    public abstract void c(View var1);
}

