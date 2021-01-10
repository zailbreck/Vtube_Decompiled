/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package h.b.n.b;

import android.os.Handler;
import android.os.Looper;
import h.b.h;
import java.util.concurrent.Callable;

public final class a {
    private static final h a = h.b.n.a.a.b(new Callable<h>(){

        public h call() {
            return b.a;
        }
    });

    public static h a() {
        return h.b.n.a.a.a(a);
    }

    private static final class b {
        static final h a = new h.b.n.b.b(new Handler(Looper.getMainLooper()));
    }

}

