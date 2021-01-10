/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Callable
 */
package io.flutter.plugins.pathprovider;

import io.flutter.plugins.pathprovider.PathProviderPlugin;
import java.util.concurrent.Callable;

public final class f
implements Runnable {
    private final /* synthetic */ f.d.a.b.a.f b;
    private final /* synthetic */ Callable c;

    public /* synthetic */ f(f.d.a.b.a.f f2, Callable callable) {
        this.b = f2;
        this.c = callable;
    }

    public final void run() {
        PathProviderPlugin.a(this.b, this.c);
    }
}

