/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.f
 *  e.c.b.c
 *  e.c.b.e
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 */
package com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs;

import android.content.ComponentName;
import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.f;
import e.c.b.c;
import java.lang.ref.WeakReference;

public class e
extends e.c.b.e {
    private WeakReference<f> b;

    public e(f f2) {
        this.b = new WeakReference((Object)f2);
    }

    public void a(ComponentName componentName, c c2) {
        f f2 = (f)this.b.get();
        if (f2 != null) {
            f2.a(c2);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        f f2 = (f)this.b.get();
        if (f2 != null) {
            f2.a();
        }
    }
}

