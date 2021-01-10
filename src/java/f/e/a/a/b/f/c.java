/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package f.e.a.a.b.f;

import android.view.View;
import f.e.a.a.b.e.g;
import f.e.a.a.b.k.a;

public class c {
    private final a a;
    private final String b;
    private final g c;
    private final String d;

    public c(View view, g g2, String string) {
        this.a = new a(view);
        this.b = view.getClass().getCanonicalName();
        this.c = g2;
        this.d = string;
    }

    public a a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public g c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }
}

