/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  java.lang.Object
 */
package f.e.a.a.b.f;

import android.annotation.SuppressLint;
import android.content.Context;

public class d {
    @SuppressLint(value={"StaticFieldLeak"})
    private static d b = new d();
    private Context a;

    private d() {
    }

    public static d b() {
        return b;
    }

    public Context a() {
        return this.a;
    }

    public void a(Context context) {
        Context context2 = context != null ? context.getApplicationContext() : null;
        this.a = context2;
    }
}

