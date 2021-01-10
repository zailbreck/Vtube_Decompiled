/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.concurrent.Callable
 */
package io.flutter.plugins.pathprovider;

import io.flutter.plugins.pathprovider.PathProviderPlugin;
import java.util.List;
import java.util.concurrent.Callable;

public final class c
implements Callable {
    private final /* synthetic */ PathProviderPlugin b;
    private final /* synthetic */ String c;

    public /* synthetic */ c(PathProviderPlugin pathProviderPlugin, String string2) {
        this.b = pathProviderPlugin;
        this.c = string2;
    }

    public final Object call() {
        return this.b.a(this.c);
    }
}

