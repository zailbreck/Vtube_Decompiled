/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.b.e;

import android.view.View;
import f.e.a.a.b.e.c;
import f.e.a.a.b.e.d;
import f.e.a.a.b.e.g;
import f.e.a.a.b.e.l;
import f.e.a.a.b.j.e;

public abstract class b {
    public static b a(c c2, d d2) {
        e.a();
        e.a(c2, "AdSessionConfiguration is null");
        e.a(d2, "AdSessionContext is null");
        return new l(c2, d2);
    }

    public abstract void a();

    public abstract void a(View var1);

    public abstract void a(View var1, g var2, String var3);

    public abstract void b();
}

