/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  java.lang.Object
 */
package f.e.a.a.a.e;

import android.annotation.SuppressLint;
import android.content.Context;

public class c {
    @SuppressLint(value={"StaticFieldLeak"})
    private static c b = new c();
    private Context a;

    private c() {
    }

    public static c b() {
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

